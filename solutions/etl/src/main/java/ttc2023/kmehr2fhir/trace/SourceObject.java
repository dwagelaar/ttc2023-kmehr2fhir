/**
 */
package ttc2023.kmehr2fhir.trace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Source
 * Object</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link ttc2023.kmehr2fhir.trace.SourceObject#getChildren
 * <em>Children</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.SourceObject#getSource
 * <em>Source</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.SourceObject#getTransformations
 * <em>Transformations</em>}</li>
 * </ul>
 *
 * @see ttc2023.kmehr2fhir.trace.TracePackage#getSourceObject()
 * @model
 * @generated
 */
public interface SourceObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link ttc2023.kmehr2fhir.trace.SourceObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getSourceObject_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceObject> getChildren();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getSourceObject_Source()
	 * @model
	 * @generated
	 */
	EObject getSource();

	/**
	 * Sets the value of the '{@link ttc2023.kmehr2fhir.trace.SourceObject#getSource
	 * <em>Source</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link ttc2023.kmehr2fhir.trace.Transformation}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return the value of the '<em>Transformations</em>' containment reference
	 *         list.
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getSourceObject_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getTransformations();

} // SourceObject
