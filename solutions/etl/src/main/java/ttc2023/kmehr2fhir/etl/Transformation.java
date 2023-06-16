package ttc2023.kmehr2fhir.etl;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.etl.EtlModule;
import org.hl7.emf.fhir.FhirPackage;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.KmehrPackage;
import be.fgov.ehealth.standards.kmehr.schema.kmehr.util.KmehrResourceFactoryImpl;

public class Transformation {

	private final File inputFile;
	private final File outputFile;

	public Transformation(File inputFile, File outputFile) {
		this.inputFile = inputFile;
		this.outputFile = outputFile;
	}

	public void run() throws Exception {
		final Map<String, Object> globalExtensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		globalExtensionToFactoryMap.computeIfAbsent("kmehr", (k) -> new KmehrResourceFactoryImpl());
		globalExtensionToFactoryMap.computeIfAbsent("fhir", (k) -> new KmehrResourceFactoryImpl());

		try (EmfModel inputModel = new EmfModel(); EmfModel outputModel = new EmfModel()) {
			inputModel.setName("KMEHR");
			inputModel.setMetamodelUri(KmehrPackage.eINSTANCE.getNsURI());
			inputModel.setReadOnLoad(true);
			inputModel.setStoredOnDisposal(false);
			inputModel.setModelFile(inputFile.getPath());
			inputModel.load();

			outputModel.setName("FHIR");
			outputModel.setMetamodelUri(FhirPackage.eINSTANCE.getNsURI());
			outputModel.setReadOnLoad(false);
			outputModel.setStoredOnDisposal(true);
			outputModel.setModelFile(outputFile.getPath());
			outputModel.load();

			EtlModule etl = new EtlModule();
			try {
				etl.getContext().getModelRepository().addModel(inputModel);
				etl.getContext().getModelRepository().addModel(outputModel);
				etl.parse(Transformation.class.getResource("/kmehr2fhir.etl"));
				etl.execute();
			} finally {
				etl.getContext().getModelRepository().dispose();
				etl.getContext().dispose();
			}
		}
	}

}
