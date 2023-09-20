/**
 */
package ttc2023.kmehr2fhir.executionProfile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.Target#getChildren <em>Children</em>}</li>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.Target#getName <em>Name</em>}</li>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.Target#getModuleElement <em>Module Element</em>}</li>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.Target#getSelfMillis <em>Self Millis</em>}</li>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.Target#getAggregateMillis <em>Aggregate Millis</em>}</li>
 * </ul>
 *
 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage#getTarget()
 * @model
 * @generated
 */
public interface Target extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link ttc2023.kmehr2fhir.executionProfile.Target}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage#getTarget_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Target> getChildren();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage#getTarget_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ttc2023.kmehr2fhir.executionProfile.Target#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Module Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Element</em>' attribute.
	 * @see #setModuleElement(String)
	 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage#getTarget_ModuleElement()
	 * @model
	 * @generated
	 */
	String getModuleElement();

	/**
	 * Sets the value of the '{@link ttc2023.kmehr2fhir.executionProfile.Target#getModuleElement <em>Module Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Element</em>' attribute.
	 * @see #getModuleElement()
	 * @generated
	 */
	void setModuleElement(String value);

	/**
	 * Returns the value of the '<em><b>Self Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Millis</em>' attribute.
	 * @see #setSelfMillis(long)
	 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage#getTarget_SelfMillis()
	 * @model
	 * @generated
	 */
	long getSelfMillis();

	/**
	 * Sets the value of the '{@link ttc2023.kmehr2fhir.executionProfile.Target#getSelfMillis <em>Self Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Millis</em>' attribute.
	 * @see #getSelfMillis()
	 * @generated
	 */
	void setSelfMillis(long value);

	/**
	 * Returns the value of the '<em><b>Aggregate Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Millis</em>' attribute.
	 * @see #setAggregateMillis(long)
	 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage#getTarget_AggregateMillis()
	 * @model
	 * @generated
	 */
	long getAggregateMillis();

	/**
	 * Sets the value of the '{@link ttc2023.kmehr2fhir.executionProfile.Target#getAggregateMillis <em>Aggregate Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Millis</em>' attribute.
	 * @see #getAggregateMillis()
	 * @generated
	 */
	void setAggregateMillis(long value);

} // Target
