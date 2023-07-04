package etl;

import java.io.File;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import ttc2023.kmehr2fhir.etl.Transformation;

public class TransformationTest {

	private static final String MODELS_SUMEHR_EXAMPLE_FHIR = "etl-sumehr_example.fhir";

	public static File[] inputFiles() {
		return new File("../../models").listFiles(f -> f.getName().endsWith(".kmehr"));
	}
	
	@ParameterizedTest
	@MethodSource("inputFiles")
	public void runTransformation(File fKmehr) throws Exception {
		final File fFhir = new File(MODELS_SUMEHR_EXAMPLE_FHIR);
		new Transformation(fKmehr, fFhir).run();
	}

}
