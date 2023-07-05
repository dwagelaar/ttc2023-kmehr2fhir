/**
 */
package ttc2023.kmehr2fhir.trace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Transformation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link ttc2023.kmehr2fhir.trace.Transformation#getRule
 * <em>Rule</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.Transformation#getTargets
 * <em>Targets</em>}</li>
 * </ul>
 *
 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference. It is
	 * bidirectional and its opposite is
	 * '{@link ttc2023.kmehr2fhir.trace.TransformationRule#getTransformations
	 * <em>Transformations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(TransformationRule)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTransformation_Rule()
	 * @see ttc2023.kmehr2fhir.trace.TransformationRule#getTransformations
	 * @model opposite="transformations"
	 * @generated
	 */
	TransformationRule getRule();

	/**
	 * Sets the value of the '{@link ttc2023.kmehr2fhir.trace.Transformation#getRule
	 * <em>Rule</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(TransformationRule value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list. The list
	 * contents are of type {@link ttc2023.kmehr2fhir.trace.TargetObject}. It is
	 * bidirectional and its opposite is
	 * '{@link ttc2023.kmehr2fhir.trace.TargetObject#getRule <em>Rule</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTransformation_Targets()
	 * @see ttc2023.kmehr2fhir.trace.TargetObject#getRule
	 * @model opposite="rule"
	 * @generated
	 */
	EList<TargetObject> getTargets();

} // Transformation
