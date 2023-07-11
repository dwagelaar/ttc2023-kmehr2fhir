# Epsilon solution

## Dependencies

* A recent [Eclipse Modeling Tools](https://eclipse.org/download) installation.
* Install these features of the latest [Eclipse Epsilon interims](https://eclipse.dev/epsilon/download/):
  * Epsilon Core
  * Epsilon Core Development Tools
  * Epsilon Development Tools for EMF
  * Epsilon EMF Integration
  * Picto

## Running from Eclipse

To test this solution, import the project into an Eclipse workspace.

From the `Package Explorer` view in the `Java` perspective, right-click the `etl/TransformationTest.java` class in `src/test/java` and select `Run As - JUnit test`.

Right-click on the `etl` project, and select `Refresh`.
A few `.fhir` and `.fhir.trace` models will have been added.

To browse through them, first register the EPackage in the `src/main/emf/trace.ecore` file by right-clicking on it in the `Package Explorer` and selecting `Register EPackages`.
You may have to redo this between restarts of Eclipse.

You should be able to right-click on the `.fhir.trace` files from the `Package Explorer` view, and select `Open With - Other... - Sample Reflective Ecore Model Editor`.

Once you have the file open, try using `Window - Show View - Other... - Picto` to visualise the trace via [Picto](https://eclipse.dev/epsilon/doc/picto/).

## Running from Maven

To run the tests from [Maven](https://maven.apache.org/), install Maven and then run this command from this directory:

```shell
mvn verify
```

## Generating benchmark results

You can use the `scripts/run.py` script at the root of the repository to run the benchmarks.

This will produce an `output/output.csv` file at the root of the repository.

You can produce plots from this file by running the R script in this solution.
Gp to the `src/main/viz` directory and run the `diagrams.R` script:

```shell
cd src/main/viz
Rscript diagrams.R
```

This script assumes you have [R](https://www.r-project.org/) installed in your computer.