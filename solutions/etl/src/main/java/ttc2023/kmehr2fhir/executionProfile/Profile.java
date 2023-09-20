/**
 */
package ttc2023.kmehr2fhir.executionProfile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.Profile#getRoot <em>Root</em>}</li>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.Profile#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage#getProfile()
 * @model
 * @generated
 */
public interface Profile extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Target)
	 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage#getProfile_Root()
	 * @model containment="true"
	 * @generated
	 */
	Target getRoot();

	/**
	 * Sets the value of the '{@link ttc2023.kmehr2fhir.executionProfile.Profile#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Target value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link ttc2023.kmehr2fhir.executionProfile.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage#getProfile_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Profile
