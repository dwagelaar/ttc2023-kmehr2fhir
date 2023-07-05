/**
 */
package ttc2023.kmehr2fhir.trace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Transformation Rule</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link ttc2023.kmehr2fhir.trace.TransformationRule#getName
 * <em>Name</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.TransformationRule#getLocation
 * <em>Location</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.TransformationRule#isLazy
 * <em>Lazy</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.TransformationRule#getTransformations
 * <em>Transformations</em>}</li>
 * </ul>
 *
 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTransformationRule()
 * @model
 * @generated
 */
public interface TransformationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTransformationRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the
	 * '{@link ttc2023.kmehr2fhir.trace.TransformationRule#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTransformationRule_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the
	 * '{@link ttc2023.kmehr2fhir.trace.TransformationRule#getLocation
	 * <em>Location</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Lazy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Lazy</em>' attribute.
	 * @see #setLazy(boolean)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTransformationRule_Lazy()
	 * @model
	 * @generated
	 */
	boolean isLazy();

	/**
	 * Sets the value of the
	 * '{@link ttc2023.kmehr2fhir.trace.TransformationRule#isLazy <em>Lazy</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Lazy</em>' attribute.
	 * @see #isLazy()
	 * @generated
	 */
	void setLazy(boolean value);

	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' reference list.
	 * The list contents are of type
	 * {@link ttc2023.kmehr2fhir.trace.Transformation}. It is bidirectional and its
	 * opposite is '{@link ttc2023.kmehr2fhir.trace.Transformation#getRule
	 * <em>Rule</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Transformations</em>' reference list.
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTransformationRule_Transformations()
	 * @see ttc2023.kmehr2fhir.trace.Transformation#getRule
	 * @model opposite="rule"
	 * @generated
	 */
	EList<Transformation> getTransformations();

} // TransformationRule
