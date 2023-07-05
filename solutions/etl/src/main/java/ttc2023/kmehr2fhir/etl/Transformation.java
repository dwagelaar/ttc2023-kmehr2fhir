package ttc2023.kmehr2fhir.etl;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.etl.EtlModule;
import org.hl7.emf.fhir.FhirPackage;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.util.KmehrResourceFactoryImpl;

public class Transformation {

	private final File inputFile;
	private final Resource outputResource;

	public Transformation(File inputFile, Resource outputResource) {
		this.inputFile = inputFile;
		this.outputResource = outputResource;
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
			inputModel.setModelFile(inputFile.getPath());
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
			} catch (Exception ex) {
				ex.printStackTrace();
				throw ex;
			} finally {
				etl.getContext().getModelRepository().dispose();
				etl.getContext().dispose();
			}
		}
	}

}
