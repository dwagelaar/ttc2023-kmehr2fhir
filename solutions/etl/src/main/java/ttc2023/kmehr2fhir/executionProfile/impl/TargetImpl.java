/**
 */
package ttc2023.kmehr2fhir.executionProfile.impl;

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

import ttc2023.kmehr2fhir.executionProfile.ExecutionProfilePackage;
import ttc2023.kmehr2fhir.executionProfile.Target;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.impl.TargetImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.impl.TargetImpl#getName <em>Name</em>}</li>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.impl.TargetImpl#getModuleElement <em>Module Element</em>}</li>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.impl.TargetImpl#getSelfMillis <em>Self Millis</em>}</li>
 *   <li>{@link ttc2023.kmehr2fhir.executionProfile.impl.TargetImpl#getAggregateMillis <em>Aggregate Millis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetImpl extends MinimalEObjectImpl.Container implements Target {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Target> children;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleElement() <em>Module Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleElement()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleElement() <em>Module Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleElement()
	 * @generated
	 * @ordered
	 */
	protected String moduleElement = MODULE_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelfMillis() <em>Self Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long SELF_MILLIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSelfMillis() <em>Self Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfMillis()
	 * @generated
	 * @ordered
	 */
	protected long selfMillis = SELF_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregateMillis() <em>Aggregate Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long AGGREGATE_MILLIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAggregateMillis() <em>Aggregate Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregateMillis()
	 * @generated
	 * @ordered
	 */
	protected long aggregateMillis = AGGREGATE_MILLIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionProfilePackage.Literals.TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Target> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Target>(Target.class, this, ExecutionProfilePackage.TARGET__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionProfilePackage.TARGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModuleElement() {
		return moduleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleElement(String newModuleElement) {
		String oldModuleElement = moduleElement;
		moduleElement = newModuleElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionProfilePackage.TARGET__MODULE_ELEMENT, oldModuleElement, moduleElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSelfMillis() {
		return selfMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelfMillis(long newSelfMillis) {
		long oldSelfMillis = selfMillis;
		selfMillis = newSelfMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionProfilePackage.TARGET__SELF_MILLIS, oldSelfMillis, selfMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAggregateMillis() {
		return aggregateMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregateMillis(long newAggregateMillis) {
		long oldAggregateMillis = aggregateMillis;
		aggregateMillis = newAggregateMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionProfilePackage.TARGET__AGGREGATE_MILLIS, oldAggregateMillis, aggregateMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionProfilePackage.TARGET__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionProfilePackage.TARGET__CHILDREN:
				return getChildren();
			case ExecutionProfilePackage.TARGET__NAME:
				return getName();
			case ExecutionProfilePackage.TARGET__MODULE_ELEMENT:
				return getModuleElement();
			case ExecutionProfilePackage.TARGET__SELF_MILLIS:
				return getSelfMillis();
			case ExecutionProfilePackage.TARGET__AGGREGATE_MILLIS:
				return getAggregateMillis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutionProfilePackage.TARGET__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Target>)newValue);
				return;
			case ExecutionProfilePackage.TARGET__NAME:
				setName((String)newValue);
				return;
			case ExecutionProfilePackage.TARGET__MODULE_ELEMENT:
				setModuleElement((String)newValue);
				return;
			case ExecutionProfilePackage.TARGET__SELF_MILLIS:
				setSelfMillis((Long)newValue);
				return;
			case ExecutionProfilePackage.TARGET__AGGREGATE_MILLIS:
				setAggregateMillis((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExecutionProfilePackage.TARGET__CHILDREN:
				getChildren().clear();
				return;
			case ExecutionProfilePackage.TARGET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExecutionProfilePackage.TARGET__MODULE_ELEMENT:
				setModuleElement(MODULE_ELEMENT_EDEFAULT);
				return;
			case ExecutionProfilePackage.TARGET__SELF_MILLIS:
				setSelfMillis(SELF_MILLIS_EDEFAULT);
				return;
			case ExecutionProfilePackage.TARGET__AGGREGATE_MILLIS:
				setAggregateMillis(AGGREGATE_MILLIS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExecutionProfilePackage.TARGET__CHILDREN:
				return children != null && !children.isEmpty();
			case ExecutionProfilePackage.TARGET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExecutionProfilePackage.TARGET__MODULE_ELEMENT:
				return MODULE_ELEMENT_EDEFAULT == null ? moduleElement != null : !MODULE_ELEMENT_EDEFAULT.equals(moduleElement);
			case ExecutionProfilePackage.TARGET__SELF_MILLIS:
				return selfMillis != SELF_MILLIS_EDEFAULT;
			case ExecutionProfilePackage.TARGET__AGGREGATE_MILLIS:
				return aggregateMillis != AGGREGATE_MILLIS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", moduleElement: ");
		result.append(moduleElement);
		result.append(", selfMillis: ");
		result.append(selfMillis);
		result.append(", aggregateMillis: ");
		result.append(aggregateMillis);
		result.append(')');
		return result.toString();
	}

} //TargetImpl
