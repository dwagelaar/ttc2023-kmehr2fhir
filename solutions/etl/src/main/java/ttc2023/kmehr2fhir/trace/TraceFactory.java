/**
 */
package ttc2023.kmehr2fhir.trace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see ttc2023.kmehr2fhir.trace.TracePackage
 * @generated
 */
public interface TraceFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	TraceFactory eINSTANCE = ttc2023.kmehr2fhir.trace.impl.TraceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trace</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns a new object of class '<em>Transformation Rule</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Transformation Rule</em>'.
	 * @generated
	 */
	TransformationRule createTransformationRule();

	/**
	 * Returns a new object of class '<em>Transformation</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Source Object</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Source Object</em>'.
	 * @generated
	 */
	SourceObject createSourceObject();

	/**
	 * Returns a new object of class '<em>Target Object</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Target Object</em>'.
	 * @generated
	 */
	TargetObject createTargetObject();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	TracePackage getTracePackage();

} // TraceFactory
