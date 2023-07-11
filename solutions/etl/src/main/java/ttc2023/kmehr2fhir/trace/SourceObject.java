/**
 */
package ttc2023.kmehr2fhir.trace;

import org.eclipse.emf.common.util.EList;

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
 * <li>{@link ttc2023.kmehr2fhir.trace.SourceObject#getTransformations
 * <em>Transformations</em>}</li>
 * </ul>
 *
 * @see ttc2023.kmehr2fhir.trace.TracePackage#getSourceObject()
 * @model
 * @generated
 */
public interface SourceObject extends ModelObject {
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
