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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ttc2023.kmehr2fhir.trace.TargetObject;
import ttc2023.kmehr2fhir.trace.TracePackage;
import ttc2023.kmehr2fhir.trace.Transformation;
import ttc2023.kmehr2fhir.trace.TransformationRule;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Transformation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.TransformationImpl#getRule
 * <em>Rule</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.TransformationImpl#getTargets
 * <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation {
	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected TransformationRule rule;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
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
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TransformationRule getRule() {
		if (rule != null && rule.eIsProxy()) {
			InternalEObject oldRule = (InternalEObject) rule;
			rule = (TransformationRule) eResolveProxy(oldRule);
			if (rule != oldRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.TRANSFORMATION__RULE,
							oldRule, rule));
			}
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TransformationRule basicGetRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetRule(TransformationRule newRule, NotificationChain msgs) {
		TransformationRule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TracePackage.TRANSFORMATION__RULE, oldRule, newRule);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setRule(TransformationRule newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject) rule).eInverseRemove(this, TracePackage.TRANSFORMATION_RULE__TRANSFORMATIONS,
						TransformationRule.class, msgs);
			if (newRule != null)
				msgs = ((InternalEObject) newRule).eInverseAdd(this, TracePackage.TRANSFORMATION_RULE__TRANSFORMATIONS,
						TransformationRule.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TRANSFORMATION__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TargetObject> getTargets() {
		if (targets == null) {
			targets = new EObjectWithInverseResolvingEList<>(TargetObject.class, this,
					TracePackage.TRANSFORMATION__TARGETS, TracePackage.TARGET_OBJECT__RULE);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TracePackage.TRANSFORMATION__RULE:
			if (rule != null)
				msgs = ((InternalEObject) rule).eInverseRemove(this, TracePackage.TRANSFORMATION_RULE__TRANSFORMATIONS,
						TransformationRule.class, msgs);
			return basicSetRule((TransformationRule) otherEnd, msgs);
		case TracePackage.TRANSFORMATION__TARGETS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargets()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TracePackage.TRANSFORMATION__RULE:
			return basicSetRule(null, msgs);
		case TracePackage.TRANSFORMATION__TARGETS:
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
		case TracePackage.TRANSFORMATION__RULE:
			if (resolve)
				return getRule();
			return basicGetRule();
		case TracePackage.TRANSFORMATION__TARGETS:
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
		case TracePackage.TRANSFORMATION__RULE:
			setRule((TransformationRule) newValue);
			return;
		case TracePackage.TRANSFORMATION__TARGETS:
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
		case TracePackage.TRANSFORMATION__RULE:
			setRule((TransformationRule) null);
			return;
		case TracePackage.TRANSFORMATION__TARGETS:
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
		case TracePackage.TRANSFORMATION__RULE:
			return rule != null;
		case TracePackage.TRANSFORMATION__TARGETS:
			return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // TransformationImpl
