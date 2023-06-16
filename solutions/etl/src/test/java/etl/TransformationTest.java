package etl;

import java.io.File;

import org.junit.jupiter.api.Test;

import ttc2023.kmehr2fhir.etl.Transformation;

public class TransformationTest {

	private static final String MODELS_SUMEHR_EXAMPLE_FHIR = "etl-sumehr_example.fhir";
	private static final String MODELS_SUMEHR_EXAMPLE_KMEHR = "../../models/sumehr_example.kmehr";
	
	@Test
	public void runTransformation() throws Exception {
		final File fKmehr = new File(MODELS_SUMEHR_EXAMPLE_KMEHR);
		final File fFhir = new File(MODELS_SUMEHR_EXAMPLE_FHIR);
		new Transformation(fKmehr, fFhir).run();
	}

}
