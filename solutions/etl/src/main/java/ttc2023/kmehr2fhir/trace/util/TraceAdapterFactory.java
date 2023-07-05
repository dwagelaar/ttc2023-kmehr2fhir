/**
 */
package ttc2023.kmehr2fhir.trace.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ttc2023.kmehr2fhir.trace.SourceObject;
import ttc2023.kmehr2fhir.trace.TargetObject;
import ttc2023.kmehr2fhir.trace.Trace;
import ttc2023.kmehr2fhir.trace.TracePackage;
import ttc2023.kmehr2fhir.trace.Transformation;
import ttc2023.kmehr2fhir.trace.TransformationRule;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 *
 * @see ttc2023.kmehr2fhir.trace.TracePackage
 * @generated
 */
public class TraceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static TracePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	public TraceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TracePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!--
	 * begin-user-doc --> This implementation returns <code>true</code> if the
	 * object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 *
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TraceSwitch<Adapter> modelSwitch = new TraceSwitch<>() {
		@Override
		public Adapter caseTrace(Trace object) {
			return createTraceAdapter();
		}

		@Override
		public Adapter caseTransformationRule(TransformationRule object) {
			return createTransformationRuleAdapter();
		}

		@Override
		public Adapter caseTransformation(Transformation object) {
			return createTransformationAdapter();
		}

		@Override
		public Adapter caseSourceObject(SourceObject object) {
			return createSourceObjectAdapter();
		}

		@Override
		public Adapter caseTargetObject(TargetObject object) {
			return createTargetObjectAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link ttc2023.kmehr2fhir.trace.Trace <em>Trace</em>}'. <!-- begin-user-doc
	 * --> This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see ttc2023.kmehr2fhir.trace.Trace
	 * @generated
	 */
	public Adapter createTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link ttc2023.kmehr2fhir.trace.TransformationRule <em>Transformation
	 * Rule</em>}'. <!-- begin-user-doc --> This default implementation returns null
	 * so that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see ttc2023.kmehr2fhir.trace.TransformationRule
	 * @generated
	 */
	public Adapter createTransformationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link ttc2023.kmehr2fhir.trace.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance will
	 * catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see ttc2023.kmehr2fhir.trace.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link ttc2023.kmehr2fhir.trace.SourceObject <em>Source Object</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see ttc2023.kmehr2fhir.trace.SourceObject
	 * @generated
	 */
	public Adapter createSourceObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link ttc2023.kmehr2fhir.trace.TargetObject <em>Target Object</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch
	 * all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see ttc2023.kmehr2fhir.trace.TargetObject
	 * @generated
	 */
	public Adapter createTargetObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // TraceAdapterFactory
