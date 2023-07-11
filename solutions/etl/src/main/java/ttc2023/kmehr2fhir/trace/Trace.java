/**
 */
package ttc2023.kmehr2fhir.trace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Trace</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link ttc2023.kmehr2fhir.trace.Trace#getRules <em>Rules</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.Trace#getSourceModelUri <em>Source Model
 * Uri</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.Trace#getTargetModelUri <em>Target Model
 * Uri</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.Trace#getSources <em>Sources</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.Trace#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type
	 * {@link ttc2023.kmehr2fhir.trace.TransformationRule}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTrace_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationRule> getRules();

	/**
	 * Returns the value of the '<em><b>Source Model Uri</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Source Model Uri</em>' attribute.
	 * @see #setSourceModelUri(String)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTrace_SourceModelUri()
	 * @model
	 * @generated
	 */
	String getSourceModelUri();

	/**
	 * Sets the value of the
	 * '{@link ttc2023.kmehr2fhir.trace.Trace#getSourceModelUri <em>Source Model
	 * Uri</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Source Model Uri</em>' attribute.
	 * @see #getSourceModelUri()
	 * @generated
	 */
	void setSourceModelUri(String value);

	/**
	 * Returns the value of the '<em><b>Target Model Uri</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Target Model Uri</em>' attribute.
	 * @see #setTargetModelUri(String)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTrace_TargetModelUri()
	 * @model
	 * @generated
	 */
	String getTargetModelUri();

	/**
	 * Sets the value of the
	 * '{@link ttc2023.kmehr2fhir.trace.Trace#getTargetModelUri <em>Target Model
	 * Uri</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Target Model Uri</em>' attribute.
	 * @see #getTargetModelUri()
	 * @generated
	 */
	void setTargetModelUri(String value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link ttc2023.kmehr2fhir.trace.SourceObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTrace_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceObject> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link ttc2023.kmehr2fhir.trace.TargetObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getTrace_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetObject> getTargets();

} // Trace
