/**
 */
package ttc2023.kmehr2fhir.executionProfile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ttc2023.kmehr2fhir.executionProfile.ExecutionProfileFactory
 * @model kind="package"
 * @generated
 */
public interface ExecutionProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "executionProfile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://github.com/agarciadom/ttc2023-kmehr-to-fhir/profile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prof";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutionProfilePackage eINSTANCE = ttc2023.kmehr2fhir.executionProfile.impl.ExecutionProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link ttc2023.kmehr2fhir.executionProfile.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ttc2023.kmehr2fhir.executionProfile.impl.ProfileImpl
	 * @see ttc2023.kmehr2fhir.executionProfile.impl.ExecutionProfilePackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__ROOT = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__RULES = 1;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ttc2023.kmehr2fhir.executionProfile.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ttc2023.kmehr2fhir.executionProfile.impl.TargetImpl
	 * @see ttc2023.kmehr2fhir.executionProfile.impl.ExecutionProfilePackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Module Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__MODULE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Self Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__SELF_MILLIS = 3;

	/**
	 * The feature id for the '<em><b>Aggregate Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__AGGREGATE_MILLIS = 4;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ttc2023.kmehr2fhir.executionProfile.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ttc2023.kmehr2fhir.executionProfile.impl.RuleImpl
	 * @see ttc2023.kmehr2fhir.executionProfile.impl.ExecutionProfilePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MILLIS = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ttc2023.kmehr2fhir.executionProfile.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see ttc2023.kmehr2fhir.executionProfile.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the containment reference '{@link ttc2023.kmehr2fhir.executionProfile.Profile#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see ttc2023.kmehr2fhir.executionProfile.Profile#getRoot()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link ttc2023.kmehr2fhir.executionProfile.Profile#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see ttc2023.kmehr2fhir.executionProfile.Profile#getRules()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Rules();

	/**
	 * Returns the meta object for class '{@link ttc2023.kmehr2fhir.executionProfile.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see ttc2023.kmehr2fhir.executionProfile.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link ttc2023.kmehr2fhir.executionProfile.Target#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see ttc2023.kmehr2fhir.executionProfile.Target#getChildren()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Children();

	/**
	 * Returns the meta object for the attribute '{@link ttc2023.kmehr2fhir.executionProfile.Target#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ttc2023.kmehr2fhir.executionProfile.Target#getName()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Name();

	/**
	 * Returns the meta object for the attribute '{@link ttc2023.kmehr2fhir.executionProfile.Target#getModuleElement <em>Module Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Element</em>'.
	 * @see ttc2023.kmehr2fhir.executionProfile.Target#getModuleElement()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_ModuleElement();

	/**
	 * Returns the meta object for the attribute '{@link ttc2023.kmehr2fhir.executionProfile.Target#getSelfMillis <em>Self Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Millis</em>'.
	 * @see ttc2023.kmehr2fhir.executionProfile.Target#getSelfMillis()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_SelfMillis();

	/**
	 * Returns the meta object for the attribute '{@link ttc2023.kmehr2fhir.executionProfile.Target#getAggregateMillis <em>Aggregate Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregate Millis</em>'.
	 * @see ttc2023.kmehr2fhir.executionProfile.Target#getAggregateMillis()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_AggregateMillis();

	/**
	 * Returns the meta object for class '{@link ttc2023.kmehr2fhir.executionProfile.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see ttc2023.kmehr2fhir.executionProfile.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link ttc2023.kmehr2fhir.executionProfile.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ttc2023.kmehr2fhir.executionProfile.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link ttc2023.kmehr2fhir.executionProfile.Rule#getMillis <em>Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Millis</em>'.
	 * @see ttc2023.kmehr2fhir.executionProfile.Rule#getMillis()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Millis();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExecutionProfileFactory getExecutionProfileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ttc2023.kmehr2fhir.executionProfile.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ttc2023.kmehr2fhir.executionProfile.impl.ProfileImpl
		 * @see ttc2023.kmehr2fhir.executionProfile.impl.ExecutionProfilePackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__ROOT = eINSTANCE.getProfile_Root();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__RULES = eINSTANCE.getProfile_Rules();

		/**
		 * The meta object literal for the '{@link ttc2023.kmehr2fhir.executionProfile.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ttc2023.kmehr2fhir.executionProfile.impl.TargetImpl
		 * @see ttc2023.kmehr2fhir.executionProfile.impl.ExecutionProfilePackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__CHILDREN = eINSTANCE.getTarget_Children();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__NAME = eINSTANCE.getTarget_Name();

		/**
		 * The meta object literal for the '<em><b>Module Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__MODULE_ELEMENT = eINSTANCE.getTarget_ModuleElement();

		/**
		 * The meta object literal for the '<em><b>Self Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__SELF_MILLIS = eINSTANCE.getTarget_SelfMillis();

		/**
		 * The meta object literal for the '<em><b>Aggregate Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__AGGREGATE_MILLIS = eINSTANCE.getTarget_AggregateMillis();

		/**
		 * The meta object literal for the '{@link ttc2023.kmehr2fhir.executionProfile.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ttc2023.kmehr2fhir.executionProfile.impl.RuleImpl
		 * @see ttc2023.kmehr2fhir.executionProfile.impl.ExecutionProfilePackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__MILLIS = eINSTANCE.getRule_Millis();

	}

} //ExecutionProfilePackage
