/**
 */
package ttc2023.kmehr2fhir.trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ttc2023.kmehr2fhir.trace.TargetObject;
import ttc2023.kmehr2fhir.trace.TracePackage;
import ttc2023.kmehr2fhir.trace.Transformation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Target
 * Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.TargetObjectImpl#getChildren
 * <em>Children</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.TargetObjectImpl#getTarget
 * <em>Target</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.TargetObjectImpl#getRule
 * <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetObjectImpl extends MinimalEObjectImpl.Container implements TargetObject {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetObject> children;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject target;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Transformation rule;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TargetObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.TARGET_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TargetObject> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<>(TargetObject.class, this,
					TracePackage.TARGET_OBJECT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.TARGET_OBJECT__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EObject basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setTarget(EObject newTarget) {
		EObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TARGET_OBJECT__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Transformation getRule() {
		if (rule != null && rule.eIsProxy()) {
			InternalEObject oldRule = (InternalEObject) rule;
			rule = (Transformation) eResolveProxy(oldRule);
			if (rule != oldRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracePackage.TARGET_OBJECT__RULE, oldRule,
							rule));
			}
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Transformation basicGetRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetRule(Transformation newRule, NotificationChain msgs) {
		Transformation oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TracePackage.TARGET_OBJECT__RULE, oldRule, newRule);
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
	public void setRule(Transformation newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject) rule).eInverseRemove(this, TracePackage.TRANSFORMATION__TARGETS,
						Transformation.class, msgs);
			if (newRule != null)
				msgs = ((InternalEObject) newRule).eInverseAdd(this, TracePackage.TRANSFORMATION__TARGETS,
						Transformation.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TARGET_OBJECT__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TracePackage.TARGET_OBJECT__RULE:
			if (rule != null)
				msgs = ((InternalEObject) rule).eInverseRemove(this, TracePackage.TRANSFORMATION__TARGETS,
						Transformation.class, msgs);
			return basicSetRule((Transformation) otherEnd, msgs);
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
		case TracePackage.TARGET_OBJECT__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
		case TracePackage.TARGET_OBJECT__RULE:
			return basicSetRule(null, msgs);
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
		case TracePackage.TARGET_OBJECT__CHILDREN:
			return getChildren();
		case TracePackage.TARGET_OBJECT__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case TracePackage.TARGET_OBJECT__RULE:
			if (resolve)
				return getRule();
			return basicGetRule();
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
		case TracePackage.TARGET_OBJECT__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends TargetObject>) newValue);
			return;
		case TracePackage.TARGET_OBJECT__TARGET:
			setTarget((EObject) newValue);
			return;
		case TracePackage.TARGET_OBJECT__RULE:
			setRule((Transformation) newValue);
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
		case TracePackage.TARGET_OBJECT__CHILDREN:
			getChildren().clear();
			return;
		case TracePackage.TARGET_OBJECT__TARGET:
			setTarget((EObject) null);
			return;
		case TracePackage.TARGET_OBJECT__RULE:
			setRule((Transformation) null);
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
		case TracePackage.TARGET_OBJECT__CHILDREN:
			return children != null && !children.isEmpty();
		case TracePackage.TARGET_OBJECT__TARGET:
			return target != null;
		case TracePackage.TARGET_OBJECT__RULE:
			return rule != null;
		}
		return super.eIsSet(featureID);
	}

} // TargetObjectImpl
