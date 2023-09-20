package ttc2023.kmehr2fhir.etl;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.module.ModuleElement;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.erl.execute.control.RuleProfiler;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.etl.trace.TransformationTrace;
import org.eclipse.epsilon.profiling.Profiler;
import org.eclipse.epsilon.profiling.ProfilerTarget;
import org.eclipse.epsilon.profiling.ProfilingExecutionListener;
import org.hl7.emf.fhir.FhirPackage;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.util.KmehrResourceFactoryImpl;
import ttc2023.kmehr2fhir.executionProfile.ExecutionProfileFactory;
import ttc2023.kmehr2fhir.executionProfile.Profile;
import ttc2023.kmehr2fhir.executionProfile.Rule;
import ttc2023.kmehr2fhir.executionProfile.Target;
import ttc2023.kmehr2fhir.trace.ModelObject;
import ttc2023.kmehr2fhir.trace.SourceObject;
import ttc2023.kmehr2fhir.trace.TargetObject;
import ttc2023.kmehr2fhir.trace.Trace;
import ttc2023.kmehr2fhir.trace.TraceFactory;
import ttc2023.kmehr2fhir.trace.TransformationRule;

public class Transformation {

	public static final int DEFAULT_MINIMUM_PROFILE_MILLIS = 0;

	private final File inputFile;
	private final Resource outputResource;
	private Resource traceResource, profileResource;

	// Minimum duration of a profile target so it is added to the profile tree
	private int minProfileMillis = DEFAULT_MINIMUM_PROFILE_MILLIS;

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

	public Resource getProfileResource() {
		return profileResource;
	}

	public void setProfileResource(Resource profileResource) {
		this.profileResource = profileResource;
	}

	public int getMinimumProfileMillis() {
		return minProfileMillis;
	}

	public void setMinimumProfileMillis(int minProfileMillis) {
		this.minProfileMillis = minProfileMillis;
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

				if (profileResource != null) {
					Profiler.INSTANCE.reset();
					Profiler.INSTANCE.start("Program", "", etl);

					// coarse-grained (per rule)
					etl.getContext().setProfilingEnabled(true);
					// fine-grained (per model element)
					etl.getContext().getExecutorFactory().addExecutionListener(new ProfilingExecutionListener());
				}
				etl.execute();

				if (traceResource != null) {
					generateTrace(inputModel.getResource(), etl.getContext().getTransformationTrace(), outputModel.getResource());
				}
			} catch (Exception ex) {
				ex.printStackTrace();
				throw ex;
			} finally {
				if (profileResource != null) {
					Profiler.INSTANCE.stop();
					generateProfile(Profiler.INSTANCE.getRoot(),
						(RuleProfiler) etl.getContext().getExecutorFactory().getExecutionController());
				}
				etl.getContext().getModelRepository().dispose();
				etl.getContext().dispose();
			}
		}
	}

	private void generateProfile(ProfilerTarget root, RuleProfiler ruleProfiler) {
		Profile profile = ExecutionProfileFactory.eINSTANCE.createProfile();
		profileResource.getContents().add(profile);

		final Target convertedRoot = convertTarget(root);
		profile.setRoot(convertedRoot);

		List<Entry<ModuleElement, Duration>> sortedRuleTimes = ruleProfiler
				.getExecutionTimes().entrySet().stream()
				.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
				.collect(Collectors.toList());

		for (Entry<ModuleElement, Duration> ruleTime : sortedRuleTimes) {
			Rule rule = ExecutionProfileFactory.eINSTANCE.createRule();
			rule.setName(ruleTime.getKey().toString());
			rule.setMillis(ruleTime.getValue().toMillis());
			profile.getRules().add(rule);
		}
	}

	private Target convertTarget(ProfilerTarget root) {
		Target target = ExecutionProfileFactory.eINSTANCE.createTarget();
		target.setName(root.getModuleElement() == null ? root.getName() : root.getModuleElement().toString());
		target.setSelfMillis(root.getWorked(false));
		target.setAggregateMillis(root.getWorked(true));

		final ModuleElement element = root.getModuleElement();
		if (element != null) {
			target.setModuleElement(String.format("%s @ %s", element.getModule(), element.getRegion()));
		}

		for (ProfilerTarget child : root.getChildren()) {
			// do a bit of pruning to help with reading
			if (child.getWorked(true) > minProfileMillis) {
				target.getChildren().add(convertTarget(child));
			}
		}
		return target;
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

		// Sort the list of transformation rules by name
		ECollections.sort(trace.getRules(), (a, b) -> a.getName().compareTo(b.getName()));
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
		setObjectInfo(eob, target);
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
		setObjectInfo(eob, src);
		targetList.add(src);

		for (var etlTX : transformationTrace.getTransformations(eob)) {
			var etlRule = etlTX.getRule();
			var modelRule = nameToRule.computeIfAbsent(etlRule.getName(), (name) -> {
				var newRule = TraceFactory.eINSTANCE.createTransformationRule();
				newRule.setName(name);
				newRule.setLocation(etlRule.getUri().toString() + "@" + etlRule.getRegion());
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

	private void setObjectInfo(EObject eob, ModelObject mob) {
		mob.setEPackageURI(eob.eClass().getEPackage().getNsURI());
		mob.setEClassName(eob.eClass().getName());
		mob.setUriFragment(eob.eResource().getURIFragment(eob));
	}

}
