/**
 */
package ttc2023.kmehr2fhir.trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ttc2023.kmehr2fhir.trace.SourceObject;
import ttc2023.kmehr2fhir.trace.TargetObject;
import ttc2023.kmehr2fhir.trace.Trace;
import ttc2023.kmehr2fhir.trace.TracePackage;
import ttc2023.kmehr2fhir.trace.TransformationRule;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Trace</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.TraceImpl#getRules
 * <em>Rules</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.TraceImpl#getSourceModelUri
 * <em>Source Model Uri</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.TraceImpl#getTargetModelUri
 * <em>Target Model Uri</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.TraceImpl#getSources
 * <em>Sources</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.TraceImpl#getTargets
 * <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationRule> rules;

	/**
	 * The default value of the '{@link #getSourceModelUri() <em>Source Model
	 * Uri</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSourceModelUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceModelUri() <em>Source Model
	 * Uri</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSourceModelUri()
	 * @generated
	 * @ordered
	 */
	protected String sourceModelUri = SOURCE_MODEL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetModelUri() <em>Target Model
	 * Uri</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTargetModelUri()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetModelUri() <em>Target Model
	 * Uri</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTargetModelUri()
	 * @generated
	 * @ordered
	 */
	protected String targetModelUri = TARGET_MODEL_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceObject> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetObject> targets;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TransformationRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<>(TransformationRule.class, this,
					TracePackage.TRACE__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getSourceModelUri() {
		return sourceModelUri;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setSourceModelUri(String newSourceModelUri) {
		String oldSourceModelUri = sourceModelUri;
		sourceModelUri = newSourceModelUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE__SOURCE_MODEL_URI,
					oldSourceModelUri, sourceModelUri));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getTargetModelUri() {
		return targetModelUri;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTargetModelUri(String newTargetModelUri) {
		String oldTargetModelUri = targetModelUri;
		targetModelUri = newTargetModelUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRACE__TARGET_MODEL_URI,
					oldTargetModelUri, targetModelUri));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<SourceObject> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<>(SourceObject.class, this, TracePackage.TRACE__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TargetObject> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<>(TargetObject.class, this, TracePackage.TRACE__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TracePackage.TRACE__RULES:
			return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
		case TracePackage.TRACE__SOURCES:
			return ((InternalEList<?>) getSources()).basicRemove(otherEnd, msgs);
		case TracePackage.TRACE__TARGETS:
			return ((InternalEList<?>) getTargets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TracePackage.TRACE__RULES:
			return getRules();
		case TracePackage.TRACE__SOURCE_MODEL_URI:
			return getSourceModelUri();
		case TracePackage.TRACE__TARGET_MODEL_URI:
			return getTargetModelUri();
		case TracePackage.TRACE__SOURCES:
			return getSources();
		case TracePackage.TRACE__TARGETS:
			return getTargets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TracePackage.TRACE__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends TransformationRule>) newValue);
			return;
		case TracePackage.TRACE__SOURCE_MODEL_URI:
			setSourceModelUri((String) newValue);
			return;
		case TracePackage.TRACE__TARGET_MODEL_URI:
			setTargetModelUri((String) newValue);
			return;
		case TracePackage.TRACE__SOURCES:
			getSources().clear();
			getSources().addAll((Collection<? extends SourceObject>) newValue);
			return;
		case TracePackage.TRACE__TARGETS:
			getTargets().clear();
			getTargets().addAll((Collection<? extends TargetObject>) newValue);
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
		case TracePackage.TRACE__RULES:
			getRules().clear();
			return;
		case TracePackage.TRACE__SOURCE_MODEL_URI:
			setSourceModelUri(SOURCE_MODEL_URI_EDEFAULT);
			return;
		case TracePackage.TRACE__TARGET_MODEL_URI:
			setTargetModelUri(TARGET_MODEL_URI_EDEFAULT);
			return;
		case TracePackage.TRACE__SOURCES:
			getSources().clear();
			return;
		case TracePackage.TRACE__TARGETS:
			getTargets().clear();
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
		case TracePackage.TRACE__RULES:
			return rules != null && !rules.isEmpty();
		case TracePackage.TRACE__SOURCE_MODEL_URI:
			return SOURCE_MODEL_URI_EDEFAULT == null ? sourceModelUri != null
					: !SOURCE_MODEL_URI_EDEFAULT.equals(sourceModelUri);
		case TracePackage.TRACE__TARGET_MODEL_URI:
			return TARGET_MODEL_URI_EDEFAULT == null ? targetModelUri != null
					: !TARGET_MODEL_URI_EDEFAULT.equals(targetModelUri);
		case TracePackage.TRACE__SOURCES:
			return sources != null && !sources.isEmpty();
		case TracePackage.TRACE__TARGETS:
			return targets != null && !targets.isEmpty();
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
		result.append(" (sourceModelUri: ");
		result.append(sourceModelUri);
		result.append(", targetModelUri: ");
		result.append(targetModelUri);
		result.append(')');
		return result.toString();
	}

} // TraceImpl
