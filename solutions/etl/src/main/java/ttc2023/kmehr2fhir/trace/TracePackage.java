/**
 */
package ttc2023.kmehr2fhir.trace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see ttc2023.kmehr2fhir.trace.TraceFactory
 * @model kind="package"
 * @generated
 */
public interface TracePackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "trace";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http://github.com/agarciadom/ttc2023-kmehr-to-fhir/trace";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "tr";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	TracePackage eINSTANCE = ttc2023.kmehr2fhir.trace.impl.TracePackageImpl.init();

	/**
	 * The meta object id for the '{@link ttc2023.kmehr2fhir.trace.impl.TraceImpl
	 * <em>Trace</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see ttc2023.kmehr2fhir.trace.impl.TraceImpl
	 * @see ttc2023.kmehr2fhir.trace.impl.TracePackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRACE__RULES = 0;

	/**
	 * The feature id for the '<em><b>Source Model Uri</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCE_MODEL_URI = 1;

	/**
	 * The feature id for the '<em><b>Target Model Uri</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGET_MODEL_URI = 2;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCES = 3;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGETS = 4;

	/**
	 * The number of structural features of the '<em>Trace</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Trace</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the
	 * '{@link ttc2023.kmehr2fhir.trace.impl.TransformationRuleImpl
	 * <em>Transformation Rule</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see ttc2023.kmehr2fhir.trace.impl.TransformationRuleImpl
	 * @see ttc2023.kmehr2fhir.trace.impl.TracePackageImpl#getTransformationRule()
	 * @generated
	 */
	int TRANSFORMATION_RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__LAZY = 2;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__TRANSFORMATIONS = 3;

	/**
	 * The number of structural features of the '<em>Transformation Rule</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transformation Rule</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the
	 * '{@link ttc2023.kmehr2fhir.trace.impl.TransformationImpl
	 * <em>Transformation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see ttc2023.kmehr2fhir.trace.impl.TransformationImpl
	 * @see ttc2023.kmehr2fhir.trace.impl.TracePackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RULE = 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TARGETS = 1;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transformation</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the
	 * '{@link ttc2023.kmehr2fhir.trace.impl.ModelObjectImpl <em>Model Object</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see ttc2023.kmehr2fhir.trace.impl.ModelObjectImpl
	 * @see ttc2023.kmehr2fhir.trace.impl.TracePackageImpl#getModelObject()
	 * @generated
	 */
	int MODEL_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>EClass Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MODEL_OBJECT__ECLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri Fragment</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MODEL_OBJECT__URI_FRAGMENT = 1;

	/**
	 * The number of structural features of the '<em>Model Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MODEL_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int MODEL_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the
	 * '{@link ttc2023.kmehr2fhir.trace.impl.SourceObjectImpl <em>Source
	 * Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see ttc2023.kmehr2fhir.trace.impl.SourceObjectImpl
	 * @see ttc2023.kmehr2fhir.trace.impl.TracePackageImpl#getSourceObject()
	 * @generated
	 */
	int SOURCE_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>EClass Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOURCE_OBJECT__ECLASS_NAME = MODEL_OBJECT__ECLASS_NAME;

	/**
	 * The feature id for the '<em><b>Uri Fragment</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOURCE_OBJECT__URI_FRAGMENT = MODEL_OBJECT__URI_FRAGMENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOURCE_OBJECT__CHILDREN = MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOURCE_OBJECT__TRANSFORMATIONS = MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOURCE_OBJECT_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Source Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int SOURCE_OBJECT_OPERATION_COUNT = MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link ttc2023.kmehr2fhir.trace.impl.TargetObjectImpl <em>Target
	 * Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see ttc2023.kmehr2fhir.trace.impl.TargetObjectImpl
	 * @see ttc2023.kmehr2fhir.trace.impl.TracePackageImpl#getTargetObject()
	 * @generated
	 */
	int TARGET_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>EClass Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TARGET_OBJECT__ECLASS_NAME = MODEL_OBJECT__ECLASS_NAME;

	/**
	 * The feature id for the '<em><b>Uri Fragment</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TARGET_OBJECT__URI_FRAGMENT = MODEL_OBJECT__URI_FRAGMENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TARGET_OBJECT__CHILDREN = MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TARGET_OBJECT__TRANSFORMATION = MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TARGET_OBJECT_FEATURE_COUNT = MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Target Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int TARGET_OBJECT_OPERATION_COUNT = MODEL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ttc2023.kmehr2fhir.trace.Trace
	 * <em>Trace</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see ttc2023.kmehr2fhir.trace.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link ttc2023.kmehr2fhir.trace.Trace#getRules <em>Rules</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see ttc2023.kmehr2fhir.trace.Trace#getRules()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Rules();

	/**
	 * Returns the meta object for the attribute
	 * '{@link ttc2023.kmehr2fhir.trace.Trace#getSourceModelUri <em>Source Model
	 * Uri</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Source Model Uri</em>'.
	 * @see ttc2023.kmehr2fhir.trace.Trace#getSourceModelUri()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_SourceModelUri();

	/**
	 * Returns the meta object for the attribute
	 * '{@link ttc2023.kmehr2fhir.trace.Trace#getTargetModelUri <em>Target Model
	 * Uri</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Target Model Uri</em>'.
	 * @see ttc2023.kmehr2fhir.trace.Trace#getTargetModelUri()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_TargetModelUri();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link ttc2023.kmehr2fhir.trace.Trace#getSources <em>Sources</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list
	 *         '<em>Sources</em>'.
	 * @see ttc2023.kmehr2fhir.trace.Trace#getSources()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Sources();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link ttc2023.kmehr2fhir.trace.Trace#getTargets <em>Targets</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list
	 *         '<em>Targets</em>'.
	 * @see ttc2023.kmehr2fhir.trace.Trace#getTargets()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Targets();

	/**
	 * Returns the meta object for class
	 * '{@link ttc2023.kmehr2fhir.trace.TransformationRule <em>Transformation
	 * Rule</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Transformation Rule</em>'.
	 * @see ttc2023.kmehr2fhir.trace.TransformationRule
	 * @generated
	 */
	EClass getTransformationRule();

	/**
	 * Returns the meta object for the attribute
	 * '{@link ttc2023.kmehr2fhir.trace.TransformationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ttc2023.kmehr2fhir.trace.TransformationRule#getName()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_Name();

	/**
	 * Returns the meta object for the attribute
	 * '{@link ttc2023.kmehr2fhir.trace.TransformationRule#getLocation
	 * <em>Location</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see ttc2023.kmehr2fhir.trace.TransformationRule#getLocation()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_Location();

	/**
	 * Returns the meta object for the attribute
	 * '{@link ttc2023.kmehr2fhir.trace.TransformationRule#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see ttc2023.kmehr2fhir.trace.TransformationRule#isLazy()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_Lazy();

	/**
	 * Returns the meta object for the reference list
	 * '{@link ttc2023.kmehr2fhir.trace.TransformationRule#getTransformations
	 * <em>Transformations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Transformations</em>'.
	 * @see ttc2023.kmehr2fhir.trace.TransformationRule#getTransformations()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Transformations();

	/**
	 * Returns the meta object for class
	 * '{@link ttc2023.kmehr2fhir.trace.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see ttc2023.kmehr2fhir.trace.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the reference
	 * '{@link ttc2023.kmehr2fhir.trace.Transformation#getRule <em>Rule</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see ttc2023.kmehr2fhir.trace.Transformation#getRule()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Rule();

	/**
	 * Returns the meta object for the reference list
	 * '{@link ttc2023.kmehr2fhir.trace.Transformation#getTargets
	 * <em>Targets</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see ttc2023.kmehr2fhir.trace.Transformation#getTargets()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Targets();

	/**
	 * Returns the meta object for class
	 * '{@link ttc2023.kmehr2fhir.trace.ModelObject <em>Model Object</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Model Object</em>'.
	 * @see ttc2023.kmehr2fhir.trace.ModelObject
	 * @generated
	 */
	EClass getModelObject();

	/**
	 * Returns the meta object for the attribute
	 * '{@link ttc2023.kmehr2fhir.trace.ModelObject#getEClassName <em>EClass
	 * Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>EClass Name</em>'.
	 * @see ttc2023.kmehr2fhir.trace.ModelObject#getEClassName()
	 * @see #getModelObject()
	 * @generated
	 */
	EAttribute getModelObject_EClassName();

	/**
	 * Returns the meta object for the attribute
	 * '{@link ttc2023.kmehr2fhir.trace.ModelObject#getUriFragment <em>Uri
	 * Fragment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Uri Fragment</em>'.
	 * @see ttc2023.kmehr2fhir.trace.ModelObject#getUriFragment()
	 * @see #getModelObject()
	 * @generated
	 */
	EAttribute getModelObject_UriFragment();

	/**
	 * Returns the meta object for class
	 * '{@link ttc2023.kmehr2fhir.trace.SourceObject <em>Source Object</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Source Object</em>'.
	 * @see ttc2023.kmehr2fhir.trace.SourceObject
	 * @generated
	 */
	EClass getSourceObject();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link ttc2023.kmehr2fhir.trace.SourceObject#getChildren
	 * <em>Children</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list
	 *         '<em>Children</em>'.
	 * @see ttc2023.kmehr2fhir.trace.SourceObject#getChildren()
	 * @see #getSourceObject()
	 * @generated
	 */
	EReference getSourceObject_Children();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link ttc2023.kmehr2fhir.trace.SourceObject#getTransformations
	 * <em>Transformations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list
	 *         '<em>Transformations</em>'.
	 * @see ttc2023.kmehr2fhir.trace.SourceObject#getTransformations()
	 * @see #getSourceObject()
	 * @generated
	 */
	EReference getSourceObject_Transformations();

	/**
	 * Returns the meta object for class
	 * '{@link ttc2023.kmehr2fhir.trace.TargetObject <em>Target Object</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Target Object</em>'.
	 * @see ttc2023.kmehr2fhir.trace.TargetObject
	 * @generated
	 */
	EClass getTargetObject();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link ttc2023.kmehr2fhir.trace.TargetObject#getChildren
	 * <em>Children</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list
	 *         '<em>Children</em>'.
	 * @see ttc2023.kmehr2fhir.trace.TargetObject#getChildren()
	 * @see #getTargetObject()
	 * @generated
	 */
	EReference getTargetObject_Children();

	/**
	 * Returns the meta object for the reference
	 * '{@link ttc2023.kmehr2fhir.trace.TargetObject#getTransformation
	 * <em>Transformation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see ttc2023.kmehr2fhir.trace.TargetObject#getTransformation()
	 * @see #getTargetObject()
	 * @generated
	 */
	EReference getTargetObject_Transformation();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceFactory getTraceFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the
		 * '{@link ttc2023.kmehr2fhir.trace.impl.TraceImpl <em>Trace</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see ttc2023.kmehr2fhir.trace.impl.TraceImpl
		 * @see ttc2023.kmehr2fhir.trace.impl.TracePackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TRACE__RULES = eINSTANCE.getTrace_Rules();

		/**
		 * The meta object literal for the '<em><b>Source Model Uri</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TRACE__SOURCE_MODEL_URI = eINSTANCE.getTrace_SourceModelUri();

		/**
		 * The meta object literal for the '<em><b>Target Model Uri</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TRACE__TARGET_MODEL_URI = eINSTANCE.getTrace_TargetModelUri();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TRACE__SOURCES = eINSTANCE.getTrace_Sources();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TRACE__TARGETS = eINSTANCE.getTrace_Targets();

		/**
		 * The meta object literal for the
		 * '{@link ttc2023.kmehr2fhir.trace.impl.TransformationRuleImpl
		 * <em>Transformation Rule</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @see ttc2023.kmehr2fhir.trace.impl.TransformationRuleImpl
		 * @see ttc2023.kmehr2fhir.trace.impl.TracePackageImpl#getTransformationRule()
		 * @generated
		 */
		EClass TRANSFORMATION_RULE = eINSTANCE.getTransformationRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__NAME = eINSTANCE.getTransformationRule_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__LOCATION = eINSTANCE.getTransformationRule_Location();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__LAZY = eINSTANCE.getTransformationRule_Lazy();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__TRANSFORMATIONS = eINSTANCE.getTransformationRule_Transformations();

		/**
		 * The meta object literal for the
		 * '{@link ttc2023.kmehr2fhir.trace.impl.TransformationImpl
		 * <em>Transformation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 *
		 * @see ttc2023.kmehr2fhir.trace.impl.TransformationImpl
		 * @see ttc2023.kmehr2fhir.trace.impl.TracePackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TRANSFORMATION__RULE = eINSTANCE.getTransformation_Rule();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TRANSFORMATION__TARGETS = eINSTANCE.getTransformation_Targets();

		/**
		 * The meta object literal for the
		 * '{@link ttc2023.kmehr2fhir.trace.impl.ModelObjectImpl <em>Model Object</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see ttc2023.kmehr2fhir.trace.impl.ModelObjectImpl
		 * @see ttc2023.kmehr2fhir.trace.impl.TracePackageImpl#getModelObject()
		 * @generated
		 */
		EClass MODEL_OBJECT = eINSTANCE.getModelObject();

		/**
		 * The meta object literal for the '<em><b>EClass Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute MODEL_OBJECT__ECLASS_NAME = eINSTANCE.getModelObject_EClassName();

		/**
		 * The meta object literal for the '<em><b>Uri Fragment</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute MODEL_OBJECT__URI_FRAGMENT = eINSTANCE.getModelObject_UriFragment();

		/**
		 * The meta object literal for the
		 * '{@link ttc2023.kmehr2fhir.trace.impl.SourceObjectImpl <em>Source
		 * Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see ttc2023.kmehr2fhir.trace.impl.SourceObjectImpl
		 * @see ttc2023.kmehr2fhir.trace.impl.TracePackageImpl#getSourceObject()
		 * @generated
		 */
		EClass SOURCE_OBJECT = eINSTANCE.getSourceObject();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SOURCE_OBJECT__CHILDREN = eINSTANCE.getSourceObject_Children();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference SOURCE_OBJECT__TRANSFORMATIONS = eINSTANCE.getSourceObject_Transformations();

		/**
		 * The meta object literal for the
		 * '{@link ttc2023.kmehr2fhir.trace.impl.TargetObjectImpl <em>Target
		 * Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see ttc2023.kmehr2fhir.trace.impl.TargetObjectImpl
		 * @see ttc2023.kmehr2fhir.trace.impl.TracePackageImpl#getTargetObject()
		 * @generated
		 */
		EClass TARGET_OBJECT = eINSTANCE.getTargetObject();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TARGET_OBJECT__CHILDREN = eINSTANCE.getTargetObject_Children();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference TARGET_OBJECT__TRANSFORMATION = eINSTANCE.getTargetObject_Transformation();

	}

} // TracePackage
