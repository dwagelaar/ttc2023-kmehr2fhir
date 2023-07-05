/**
 */
package ttc2023.kmehr2fhir.trace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ttc2023.kmehr2fhir.trace.SourceObject;
import ttc2023.kmehr2fhir.trace.TracePackage;
import ttc2023.kmehr2fhir.trace.Transformation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Source
 * Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.SourceObjectImpl#getChildren
 * <em>Children</em>}</li>
 * <li>{@link ttc2023.kmehr2fhir.trace.impl.SourceObjectImpl#getTransformations
 * <em>Transformations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceObjectImpl extends ModelObjectImpl implements SourceObject {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceObject> children;

	/**
	 * The cached value of the '{@link #getTransformations()
	 * <em>Transformations</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> transformations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected SourceObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracePackage.Literals.SOURCE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<SourceObject> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<>(SourceObject.class, this,
					TracePackage.SOURCE_OBJECT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Transformation> getTransformations() {
		if (transformations == null) {
			transformations = new EObjectContainmentEList<>(Transformation.class, this,
					TracePackage.SOURCE_OBJECT__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TracePackage.SOURCE_OBJECT__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
		case TracePackage.SOURCE_OBJECT__TRANSFORMATIONS:
			return ((InternalEList<?>) getTransformations()).basicRemove(otherEnd, msgs);
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
		case TracePackage.SOURCE_OBJECT__CHILDREN:
			return getChildren();
		case TracePackage.SOURCE_OBJECT__TRANSFORMATIONS:
			return getTransformations();
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
		case TracePackage.SOURCE_OBJECT__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends SourceObject>) newValue);
			return;
		case TracePackage.SOURCE_OBJECT__TRANSFORMATIONS:
			getTransformations().clear();
			getTransformations().addAll((Collection<? extends Transformation>) newValue);
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
		case TracePackage.SOURCE_OBJECT__CHILDREN:
			getChildren().clear();
			return;
		case TracePackage.SOURCE_OBJECT__TRANSFORMATIONS:
			getTransformations().clear();
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
		case TracePackage.SOURCE_OBJECT__CHILDREN:
			return children != null && !children.isEmpty();
		case TracePackage.SOURCE_OBJECT__TRANSFORMATIONS:
			return transformations != null && !transformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // SourceObjectImpl
