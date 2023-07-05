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
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.TargetObjectImpl#getTransformation
 * <em>Transformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetObjectImpl extends ModelObjectImpl implements TargetObject {
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
	 * The cached value of the '{@link #getTransformation()
	 * <em>Transformation</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Transformation transformation;

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
	public Transformation getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject) transformation;
			transformation = (Transformation) eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TracePackage.TARGET_OBJECT__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Transformation basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetTransformation(Transformation newTransformation, NotificationChain msgs) {
		Transformation oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TracePackage.TARGET_OBJECT__TRANSFORMATION, oldTransformation, newTransformation);
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
	public void setTransformation(Transformation newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject) transformation).eInverseRemove(this, TracePackage.TRANSFORMATION__TARGETS,
						Transformation.class, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this, TracePackage.TRANSFORMATION__TARGETS,
						Transformation.class, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracePackage.TARGET_OBJECT__TRANSFORMATION,
					newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TracePackage.TARGET_OBJECT__TRANSFORMATION:
			if (transformation != null)
				msgs = ((InternalEObject) transformation).eInverseRemove(this, TracePackage.TRANSFORMATION__TARGETS,
						Transformation.class, msgs);
			return basicSetTransformation((Transformation) otherEnd, msgs);
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
		case TracePackage.TARGET_OBJECT__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
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
		case TracePackage.TARGET_OBJECT__TRANSFORMATION:
			if (resolve)
				return getTransformation();
			return basicGetTransformation();
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
		case TracePackage.TARGET_OBJECT__TRANSFORMATION:
			setTransformation((Transformation) newValue);
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
		case TracePackage.TARGET_OBJECT__TRANSFORMATION:
			setTransformation((Transformation) null);
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
		case TracePackage.TARGET_OBJECT__TRANSFORMATION:
			return transformation != null;
		}
		return super.eIsSet(featureID);
	}

} // TargetObjectImpl
