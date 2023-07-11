/**
 */
package ttc2023.kmehr2fhir.trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Model
 * Object</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link ttc2023.kmehr2fhir.trace.ModelObject#getEPackageURI <em>EPackage
 * URI</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.ModelObject#getEClassName <em>EClass
 * Name</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.ModelObject#getUriFragment <em>Uri
 * Fragment</em>}</li>
 * </ul>
 *
 * @see ttc2023.kmehr2fhir.trace.TracePackage#getModelObject()
 * @model abstract="true"
 * @generated
 */
public interface ModelObject extends EObject {
	/**
	 * Returns the value of the '<em><b>EPackage URI</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>EPackage URI</em>' attribute.
	 * @see #setEPackageURI(String)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getModelObject_EPackageURI()
	 * @model
	 * @generated
	 */
	String getEPackageURI();

	/**
	 * Sets the value of the
	 * '{@link ttc2023.kmehr2fhir.trace.ModelObject#getEPackageURI <em>EPackage
	 * URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>EPackage URI</em>' attribute.
	 * @see #getEPackageURI()
	 * @generated
	 */
	void setEPackageURI(String value);

	/**
	 * Returns the value of the '<em><b>EClass Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>EClass Name</em>' attribute.
	 * @see #setEClassName(String)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getModelObject_EClassName()
	 * @model
	 * @generated
	 */
	String getEClassName();

	/**
	 * Sets the value of the
	 * '{@link ttc2023.kmehr2fhir.trace.ModelObject#getEClassName <em>EClass
	 * Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>EClass Name</em>' attribute.
	 * @see #getEClassName()
	 * @generated
	 */
	void setEClassName(String value);

	/**
	 * Returns the value of the '<em><b>Uri Fragment</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Uri Fragment</em>' attribute.
	 * @see #setUriFragment(String)
	 * @see ttc2023.kmehr2fhir.trace.TracePackage#getModelObject_UriFragment()
	 * @model
	 * @generated
	 */
	String getUriFragment();

	/**
	 * Sets the value of the
	 * '{@link ttc2023.kmehr2fhir.trace.ModelObject#getUriFragment <em>Uri
	 * Fragment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value the new value of the '<em>Uri Fragment</em>' attribute.
	 * @see #getUriFragment()
	 * @generated
	 */
	void setUriFragment(String value);

} // ModelObject
