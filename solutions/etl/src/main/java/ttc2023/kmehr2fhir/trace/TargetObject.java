/**
 */
package ttc2023.kmehr2fhir.trace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Target
 * Object</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link ttc2023.kmehr2fhir.trace.TargetObject#getChildren
 * <em>Children</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.TargetObject#getTransformation
 * <em>Transformation</em>}</li>
 * </ul>
 *
 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTargetObject()
 * @model
 * @generated
 */
public interface TargetObject extends ModelObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link ttc2023.kmehr2fhir.trace.TargetObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTargetObject_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetObject> getChildren();

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference. It is
	 * bidirectional and its opposite is
	 * '{@link ttc2023.kmehr2fhir.trace.Transformation#getTargets
	 * <em>Targets</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(Transformation)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTargetObject_Transformation()
	 * @see ttc2023.kmehr2fhir.trace.Transformation#getTargets
	 * @model opposite="targets"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the
	 * '{@link ttc2023.kmehr2fhir.trace.TargetObject#getTransformation
	 * <em>Transformation</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

} // TargetObject
