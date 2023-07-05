package ttc2023.kmehr2fhir.etl;

import java.io.File;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.etl.trace.TransformationTrace;
import org.hl7.emf.fhir.FhirPackage;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.util.KmehrResourceFactoryImpl;
import ttc2023.kmehr2fhir.trace.SourceObject;
import ttc2023.kmehr2fhir.trace.TargetObject;
import ttc2023.kmehr2fhir.trace.Trace;
import ttc2023.kmehr2fhir.trace.TraceFactory;
import ttc2023.kmehr2fhir.trace.TransformationRule;

public class Transformation {

	private final File inputFile;
	private final Resource outputResource;
	private Resource traceResource;

	public Transformation(File inputFile, Resource outputResource) {
		this.inputFile = inputFile;
		this.outputResource = outputResource;
	}

	public Resource getTraceResource() {
		return traceResource;
	}

	public void setTraceResource(Resource traceResource) {
		this.traceResource = traceResource;
	}

	public void run() throws Exception {
		final Map<String, Object> globalExtensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		globalExtensionToFactoryMap.computeIfAbsent("kmehr", (k) -> new KmehrResourceFactoryImpl());
		globalExtensionToFactoryMap.computeIfAbsent("fhir", (k) -> new KmehrResourceFactoryImpl());

		try (EmfModel inputModel = new EmfModel(); EmfModel outputModel = new InMemoryEmfModel("FHIR", outputResource, FhirPackage.eINSTANCE)) {
			inputModel.setName("KMEHR");
			inputModel.setMetamodelUri(KmehrPackage.eINSTANCE.getNsURI());
			inputModel.setReadOnLoad(true);
			inputModel.setStoredOnDisposal(false);
			inputModel.setModelFile(inputFile.getCanonicalPath());
			inputModel.load();

			// See https://github.com/eclipse/epsilon/issues/45
			outputModel.setCachingEnabled(false);

			EtlModule etl = new EtlModule();
			try {
				etl.parse(Transformation.class.getResource("/kmehr2fhir.etl"));
				if (!etl.getParseProblems().isEmpty()) {
					throw new EolRuntimeException("Parse problems: " + etl.getParseProblems());
				}

				etl.getContext().getModelRepository().addModel(inputModel);
				etl.getContext().getModelRepository().addModel(outputModel);
				etl.execute();

				if (traceResource != null) {
					generateTrace(inputModel.getResource(), etl.getContext().getTransformationTrace(), outputModel.getResource());
				}
			} catch (Exception ex) {
				ex.printStackTrace();
				throw ex;
			} finally {
				etl.getContext().getModelRepository().dispose();
				etl.getContext().dispose();
			}
		}
	}

	private void generateTrace(Resource rInput, TransformationTrace transformationTrace, Resource rOutput) {
		Trace trace = TraceFactory.eINSTANCE.createTrace();
		traceResource.getContents().add(trace);
		trace.setSourceModelUri(rInput.getURI().toString());
		trace.setTargetModelUri(rOutput.getURI().toString());

		Map<String, TransformationRule> nameToRule = new HashMap<>();
		Map<EObject, ttc2023.kmehr2fhir.trace.Transformation> targetToTX = new IdentityHashMap<>();

		// Create untrimmed trace trees
		for (EObject eob : rInput.getContents()) {
			addSourceToTrace(eob, trace.getSources(), transformationTrace, trace, nameToRule, targetToTX);
		}
		for (EObject eob : rOutput.getContents()) {
			addTargetToTrace(eob, trace.getTargets(), targetToTX);
		}

		// Trim the source/target trees
		for (Iterator<SourceObject> it = trace.getSources().iterator(); it.hasNext(); ) {
			boolean toDiscard = trimSources(it.next());
			if (toDiscard) {
				it.remove();
			}
		}
		for (Iterator<TargetObject> it = trace.getTargets().iterator(); it.hasNext(); ) {
			boolean toDiscard = trimTargets(it.next());
			if (toDiscard) {
				it.remove();
			}
		}
	}

	private <T> boolean trimTree(T node, Function<T, Iterator<T>> childrenRule, Function<T, Boolean> discardRule) {
		boolean toDiscard = discardRule.apply(node);

		for (Iterator<T> it = childrenRule.apply(node); it.hasNext(); ) {
			T child = it.next();
			if (trimTree(child, childrenRule, discardRule)) {
				it.remove();
			} else {
				toDiscard = false;
			}
		}

		return toDiscard;
	}

	private boolean trimTargets(TargetObject node) {
		return trimTree(node,
			(n) -> n.getChildren().iterator(),
			(n) -> n.getTransformation() == null
		);
	}

	private boolean trimSources(SourceObject next) {
		return trimTree(next,
			(n) -> n.getChildren().iterator(),
			(n) -> n.getTransformations().isEmpty());
	}

	private void addTargetToTrace(EObject eob, EList<TargetObject> targetList,
			Map<EObject, ttc2023.kmehr2fhir.trace.Transformation> targetToTX) {
		TargetObject target = TraceFactory.eINSTANCE.createTargetObject();
		target.setEClassName(eob.eClass().getName());
		target.setUriFragment(eob.eResource().getURIFragment(eob));
		targetList.add(target);

		var modelTX = targetToTX.remove(eob);
		if (modelTX != null) {
			target.setTransformation(modelTX);
		}

		for (EObject child : eob.eContents()) {
			addTargetToTrace(child, target.getChildren(), targetToTX);
		}
	}

	private void addSourceToTrace(EObject eob, EList<SourceObject> targetList,
			TransformationTrace transformationTrace,
			Trace trace, Map<String, TransformationRule> nameToRule,
			Map<EObject, ttc2023.kmehr2fhir.trace.Transformation> targetToTX) {
		SourceObject src = TraceFactory.eINSTANCE.createSourceObject();
		src.setEClassName(eob.eClass().getName());
		src.setUriFragment(eob.eResource().getURIFragment(eob));
		targetList.add(src);

		for (var etlTX : transformationTrace.getTransformations(eob)) {
			var etlRule = etlTX.getRule();
			var modelRule = nameToRule.computeIfAbsent(etlRule.getName(), (name) -> {
				var newRule = TraceFactory.eINSTANCE.createTransformationRule();
				newRule.setName(name);
				newRule.setLocation(etlRule.getUri().toString());
				try {
					newRule.setLazy(etlRule.isLazy(null));
				} catch (EolRuntimeException e) {
					e.printStackTrace();
				}

				trace.getRules().add(newRule);
				return newRule;
			});

			var modelTX = TraceFactory.eINSTANCE.createTransformation();
			modelTX.setRule(modelRule);
			for (Object target : etlTX.getTargets()) {
				targetToTX.put((EObject) target, modelTX);
			}
			src.getTransformations().add(modelTX);
		}

		// Descend recursively into the source tree
		for (EObject child : eob.eContents()) {
			addSourceToTrace(child, src.getChildren(), transformationTrace,
				trace, nameToRule, targetToTX);
		}
	}

}
