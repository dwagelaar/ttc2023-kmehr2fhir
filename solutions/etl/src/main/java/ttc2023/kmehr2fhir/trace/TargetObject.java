/**
 */
package ttc2023.kmehr2fhir.trace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

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
 * <li>{@link ttc2023.kmehr2fhir.trace.TargetObject#getTarget
 * <em>Target</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.TargetObject#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTargetObject()
 * @model
 * @generated
 */
public interface TargetObject extends EObject {
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
	 * Returns the value of the '<em><b>Target</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EObject)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTargetObject_Target()
	 * @model
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link ttc2023.kmehr2fhir.trace.TargetObject#getTarget
	 * <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference. It is
	 * bidirectional and its opposite is
	 * '{@link ttc2023.kmehr2fhir.trace.Transformation#getTargets
	 * <em>Targets</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(Transformation)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTargetObject_Rule()
	 * @see ttc2023.kmehr2fhir.trace.Transformation#getTargets
	 * @model opposite="targets"
	 * @generated
	 */
	Transformation getRule();

	/**
	 * Sets the value of the '{@link ttc2023.kmehr2fhir.trace.TargetObject#getRule
	 * <em>Rule</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Transformation value);

} // TargetObject
