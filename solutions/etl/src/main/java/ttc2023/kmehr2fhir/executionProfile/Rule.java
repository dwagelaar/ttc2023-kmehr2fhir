/**
 */
package ttc2023.kmehr2fhir.executionProfile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.Rule#getName <em>Name</em>}</li>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.Rule#getMillis <em>Millis</em>}</li>
 * </ul>
 *
 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage#getRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ttc2023.kmehr2fhir.executionProfile.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Millis</em>' attribute.
	 * @see #setMillis(long)
	 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage#getRule_Millis()
	 * @model
	 * @generated
	 */
	long getMillis();

	/**
	 * Sets the value of the '{@link ttc2023.kmehr2fhir.executionProfile.Rule#getMillis <em>Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Millis</em>' attribute.
	 * @see #getMillis()
	 * @generated
	 */
	void setMillis(long value);

} // Rule
