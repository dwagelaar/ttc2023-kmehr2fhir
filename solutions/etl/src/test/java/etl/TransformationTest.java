package etl;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.hl7.emf.fhir.util.FhirResourceFactoryImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.github.difflib.text.DiffRow;
import com.github.difflib.text.DiffRow.Tag;
import com.github.difflib.text.DiffRowGenerator;

import be.fgov.ehealth.standards.kmehr.schema.kmehr.util.KmehrResourceFactoryImpl;
import ttc2023.kmehr2fhir.etl.Transformation;

public class TransformationTest {

	private static final String MODELS_FOLDER = "../../models";

	private static class InputFileFilter implements FileFilter {
		private boolean withExpectedFhir = false;

		public InputFileFilter(boolean withExpectedFhir) {
			this.withExpectedFhir = withExpectedFhir;
		}

		@Override
		public boolean accept(File f) {
			return f.getName().endsWith(".kmehr")
					&& new File(f.getPath().replace(".kmehr", ".fhir")).exists() == withExpectedFhir;
		}
	}

	public static File[] inputFilesWithFHIRTests() {
		return new File(MODELS_FOLDER).listFiles(new InputFileFilter(true));
	}

	public static File[] inputFilesWithoutFHIRTests() {
		return new File(MODELS_FOLDER).listFiles(new InputFileFilter(false));
	}

	@BeforeAll
	public static void setupSuite() {
		Map<String, Object> extRegistry = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		extRegistry.put("*", new XMIResourceFactoryImpl());
		extRegistry.put("kmehr", new KmehrResourceFactoryImpl());
		extRegistry.put("fhir", new FhirResourceFactoryImpl());
	}

	@ParameterizedTest
	@MethodSource("inputFilesWithoutFHIRTests")
	public void onlyRun(File fKmehr, @TempDir File tmpDir) throws Exception {
		final File fFhir = new File(tmpDir, "output.fhir");
		final ResourceSet rsFhir = new ResourceSetImpl();
		Resource rFhir = rsFhir.createResource(URI.createFileURI(fFhir.getCanonicalPath()));
		new Transformation(fKmehr, rFhir).run();
	}

	@ParameterizedTest
	@MethodSource("inputFilesWithFHIRTests")
	public void runAndCompare(File fKmehr, @TempDir File tmpDir) throws Exception {
		final File fFhir = new File(tmpDir, "output.fhir");
		final ResourceSet rsFhir = new ResourceSetImpl();
		Resource rFhir = rsFhir.createResource(URI.createFileURI(fFhir.getCanonicalPath()));
		new Transformation(fKmehr, rFhir).run();
		rFhir.save(null);

		final File fExpectedFhir = new File("src/test/resources/" + fKmehr.getName().replace(".kmehr", ".fhir"));
		assertEquivalentFhirModels(fExpectedFhir, fFhir);
	}

	private void assertEquivalentFhirModels(final File fExpectedFhir, final File fFhir) throws IOException {
		// create a configured DiffRowGenerator
		DiffRowGenerator generator = DiffRowGenerator.create()
				.showInlineDiffs(false)
				.build();

		// compute the differences for two test texts.
		List<DiffRow> rows = generator.generateDiffRows(
				Files.readAllLines(fExpectedFhir.toPath()),
				Files.readAllLines(fFhir.toPath()));

		int revisedLineNumber = 0, originalLineNumber = 0;
		final Set<String> ignoreChangedLinesWith = new HashSet<>(Arrays.asList("fullUrl value", "reference value", "id value", "value value"));
		boolean hasDiffs = false;
		for (DiffRow dRow : rows) {
			if (dRow.getTag() != Tag.DELETE) {
				++revisedLineNumber;
			}
			if (dRow.getTag() != Tag.INSERT) {
				++originalLineNumber;
			}

			if (dRow.getTag() != Tag.EQUAL) {
				if (dRow.getTag() == Tag.CHANGE) {
					if (ignoreChangedLinesWith.stream().anyMatch(e -> dRow.getNewLine().contains(e))) {
						// skip: UUID-based diff
						continue;
					}
				}

				hasDiffs = true;
				if (dRow.getTag() == Tag.CHANGE) {
					System.out.println(String.format("Difference %s - expected line %d (%s), actual line %d (%s)", dRow.getTag(),
							originalLineNumber, dRow.getOldLine(), revisedLineNumber, dRow.getNewLine()));
				} else if (dRow.getTag() == Tag.DELETE) {
					System.out.println(String.format("Difference %s - expected line %d (%s) was deleted around actual line %d", dRow.getTag(),
							originalLineNumber, dRow.getOldLine(), revisedLineNumber));
				} else if (dRow.getTag() == Tag.INSERT) {
					System.out.println(String.format("Difference %s - actual line %d (%s) was inserted around expected line %d", dRow.getTag(),
							revisedLineNumber, dRow.getNewLine(), originalLineNumber));
				}
			}
		}

		assertFalse(hasDiffs, "Should not find any significant differences: check test output");
	}

}
