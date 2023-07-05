/**
 */
package ttc2023.kmehr2fhir.trace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ttc2023.kmehr2fhir.trace.ModelObject;
import ttc2023.kmehr2fhir.trace.TracePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Model
 * Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.ModelObjectImpl#getEPackageURI
 * <em>EPackage URI</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.ModelObjectImpl#getEClassName
 * <em>EClass Name</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.ModelObjectImpl#getUriFragment
 * <em>Uri Fragment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelObjectImpl extends MinimalEObjectImpl.Container implements ModelObject {
	/**
	 * The default value of the '{@link #getEPackageURI() <em>EPackage URI</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getEPackageURI()
	 * @generated
	 * @ordered
	 */
	protected static final String EPACKAGE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEPackageURI() <em>EPackage URI</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getEPackageURI()
	 * @generated
	 * @ordered
	 */
	protected String ePackageURI = EPACKAGE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getEClassName() <em>EClass Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getEClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String ECLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEClassName() <em>EClass Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getEClassName()
	 * @generated
	 * @ordered
	 */
	protected String eClassName = ECLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUriFragment() <em>Uri Fragment</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getUriFragment()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_FRAGMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriFragment() <em>Uri Fragment</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getUriFragment()
	 * @generated
	 * @ordered
	 */
	protected String uriFragment = URI_FRAGMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ModelObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.MODEL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getEPackageURI() {
		return ePackageURI;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEPackageURI(String newEPackageURI) {
		String oldEPackageURI = ePackageURI;
		ePackageURI = newEPackageURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.MODEL_OBJECT__EPACKAGE_URI,
					oldEPackageURI, ePackageURI));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getEClassName() {
		return eClassName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setEClassName(String newEClassName) {
		String oldEClassName = eClassName;
		eClassName = newEClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.MODEL_OBJECT__ECLASS_NAME, oldEClassName,
					eClassName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getUriFragment() {
		return uriFragment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setUriFragment(String newUriFragment) {
		String oldUriFragment = uriFragment;
		uriFragment = newUriFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.MODEL_OBJECT__URI_FRAGMENT,
					oldUriFragment, uriFragment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TracePackage.MODEL_OBJECT__EPACKAGE_URI:
			return getEPackageURI();
		case TracePackage.MODEL_OBJECT__ECLASS_NAME:
			return getEClassName();
		case TracePackage.MODEL_OBJECT__URI_FRAGMENT:
			return getUriFragment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TracePackage.MODEL_OBJECT__EPACKAGE_URI:
			setEPackageURI((String) newValue);
			return;
		case TracePackage.MODEL_OBJECT__ECLASS_NAME:
			setEClassName((String) newValue);
			return;
		case TracePackage.MODEL_OBJECT__URI_FRAGMENT:
			setUriFragment((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TracePackage.MODEL_OBJECT__EPACKAGE_URI:
			setEPackageURI(EPACKAGE_URI_EDEFAULT);
			return;
		case TracePackage.MODEL_OBJECT__ECLASS_NAME:
			setEClassName(ECLASS_NAME_EDEFAULT);
			return;
		case TracePackage.MODEL_OBJECT__URI_FRAGMENT:
			setUriFragment(URI_FRAGMENT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TracePackage.MODEL_OBJECT__EPACKAGE_URI:
			return EPACKAGE_URI_EDEFAULT == null ? ePackageURI != null : !EPACKAGE_URI_EDEFAULT.equals(ePackageURI);
		case TracePackage.MODEL_OBJECT__ECLASS_NAME:
			return ECLASS_NAME_EDEFAULT == null ? eClassName != null : !ECLASS_NAME_EDEFAULT.equals(eClassName);
		case TracePackage.MODEL_OBJECT__URI_FRAGMENT:
			return URI_FRAGMENT_EDEFAULT == null ? uriFragment != null : !URI_FRAGMENT_EDEFAULT.equals(uriFragment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ePackageURI: ");
		result.append(ePackageURI);
		result.append(", eClassName: ");
		result.append(eClassName);
		result.append(", uriFragment: ");
		result.append(uriFragment);
		result.append(')');
		return result.toString();
	}

} // ModelObjectImpl
