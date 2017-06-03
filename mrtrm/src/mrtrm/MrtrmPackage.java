/**
 */
package mrtrm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see mrtrm.MrtrmFactory
 * @model kind="package"
 * @generated
 */
public interface MrtrmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mrtrm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mrtrm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mrtrm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MrtrmPackage eINSTANCE = mrtrm.impl.MrtrmPackageImpl.init();

	/**
	 * The meta object id for the '{@link mrtrm.impl.WebApplicationImpl <em>Web Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mrtrm.impl.WebApplicationImpl
	 * @see mrtrm.impl.MrtrmPackageImpl#getWebApplication()
	 * @generated
	 */
	int WEB_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mrtrm.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mrtrm.impl.FeatureImpl
	 * @see mrtrm.impl.MrtrmPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components UI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COMPONENTS_UI = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__URL = 2;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mrtrm.impl.ListaImpl <em>Lista</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mrtrm.impl.ListaImpl
	 * @see mrtrm.impl.MrtrmPackageImpl#getLista()
	 * @generated
	 */
	int LISTA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Components UI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA__COMPONENTS_UI = FEATURE__COMPONENTS_UI;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA__URL = FEATURE__URL;

	/**
	 * The number of structural features of the '<em>Lista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mrtrm.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mrtrm.impl.FormImpl
	 * @see mrtrm.impl.MrtrmPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Components UI</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__COMPONENTS_UI = FEATURE__COMPONENTS_UI;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__URL = FEATURE__URL;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mrtrm.impl.ComponentUIImpl <em>Component UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mrtrm.impl.ComponentUIImpl
	 * @see mrtrm.impl.MrtrmPackageImpl#getComponentUI()
	 * @generated
	 */
	int COMPONENT_UI = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_UI__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_UI__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Tool TIp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_UI__TOOL_TIP = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_UI__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_UI__TITLE = 4;

	/**
	 * The number of structural features of the '<em>Component UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_UI_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_UI_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link mrtrm.NewInterface6 <em>New Interface6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mrtrm.NewInterface6
	 * @see mrtrm.impl.MrtrmPackageImpl#getNewInterface6()
	 * @generated
	 */
	int NEW_INTERFACE6 = 5;

	/**
	 * The number of structural features of the '<em>New Interface6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INTERFACE6_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New Interface6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_INTERFACE6_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mrtrm.ComponentUIType <em>Component UI Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mrtrm.ComponentUIType
	 * @see mrtrm.impl.MrtrmPackageImpl#getComponentUIType()
	 * @generated
	 */
	int COMPONENT_UI_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link mrtrm.WebApplication <em>Web Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Application</em>'.
	 * @see mrtrm.WebApplication
	 * @generated
	 */
	EClass getWebApplication();

	/**
	 * Returns the meta object for the attribute '{@link mrtrm.WebApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mrtrm.WebApplication#getName()
	 * @see #getWebApplication()
	 * @generated
	 */
	EAttribute getWebApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mrtrm.WebApplication#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see mrtrm.WebApplication#getFeatures()
	 * @see #getWebApplication()
	 * @generated
	 */
	EReference getWebApplication_Features();

	/**
	 * Returns the meta object for class '{@link mrtrm.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see mrtrm.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link mrtrm.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mrtrm.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mrtrm.Feature#getComponentsUI <em>Components UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components UI</em>'.
	 * @see mrtrm.Feature#getComponentsUI()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_ComponentsUI();

	/**
	 * Returns the meta object for the attribute '{@link mrtrm.Feature#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see mrtrm.Feature#getUrl()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Url();

	/**
	 * Returns the meta object for class '{@link mrtrm.Lista <em>Lista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lista</em>'.
	 * @see mrtrm.Lista
	 * @generated
	 */
	EClass getLista();

	/**
	 * Returns the meta object for class '{@link mrtrm.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see mrtrm.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for class '{@link mrtrm.ComponentUI <em>Component UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component UI</em>'.
	 * @see mrtrm.ComponentUI
	 * @generated
	 */
	EClass getComponentUI();

	/**
	 * Returns the meta object for the attribute '{@link mrtrm.ComponentUI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mrtrm.ComponentUI#getName()
	 * @see #getComponentUI()
	 * @generated
	 */
	EAttribute getComponentUI_Name();

	/**
	 * Returns the meta object for the attribute '{@link mrtrm.ComponentUI#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see mrtrm.ComponentUI#getLabel()
	 * @see #getComponentUI()
	 * @generated
	 */
	EAttribute getComponentUI_Label();

	/**
	 * Returns the meta object for the attribute '{@link mrtrm.ComponentUI#getToolTIp <em>Tool TIp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool TIp</em>'.
	 * @see mrtrm.ComponentUI#getToolTIp()
	 * @see #getComponentUI()
	 * @generated
	 */
	EAttribute getComponentUI_ToolTIp();

	/**
	 * Returns the meta object for the attribute '{@link mrtrm.ComponentUI#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mrtrm.ComponentUI#getType()
	 * @see #getComponentUI()
	 * @generated
	 */
	EAttribute getComponentUI_Type();

	/**
	 * Returns the meta object for the attribute '{@link mrtrm.ComponentUI#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see mrtrm.ComponentUI#getTitle()
	 * @see #getComponentUI()
	 * @generated
	 */
	EAttribute getComponentUI_Title();

	/**
	 * Returns the meta object for class '{@link mrtrm.NewInterface6 <em>New Interface6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Interface6</em>'.
	 * @see mrtrm.NewInterface6
	 * @generated
	 */
	EClass getNewInterface6();

	/**
	 * Returns the meta object for enum '{@link mrtrm.ComponentUIType <em>Component UI Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component UI Type</em>'.
	 * @see mrtrm.ComponentUIType
	 * @generated
	 */
	EEnum getComponentUIType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MrtrmFactory getMrtrmFactory();

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
		 * The meta object literal for the '{@link mrtrm.impl.WebApplicationImpl <em>Web Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mrtrm.impl.WebApplicationImpl
		 * @see mrtrm.impl.MrtrmPackageImpl#getWebApplication()
		 * @generated
		 */
		EClass WEB_APPLICATION = eINSTANCE.getWebApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_APPLICATION__NAME = eINSTANCE.getWebApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION__FEATURES = eINSTANCE.getWebApplication_Features();

		/**
		 * The meta object literal for the '{@link mrtrm.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mrtrm.impl.FeatureImpl
		 * @see mrtrm.impl.MrtrmPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Components UI</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__COMPONENTS_UI = eINSTANCE.getFeature_ComponentsUI();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__URL = eINSTANCE.getFeature_Url();

		/**
		 * The meta object literal for the '{@link mrtrm.impl.ListaImpl <em>Lista</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mrtrm.impl.ListaImpl
		 * @see mrtrm.impl.MrtrmPackageImpl#getLista()
		 * @generated
		 */
		EClass LISTA = eINSTANCE.getLista();

		/**
		 * The meta object literal for the '{@link mrtrm.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mrtrm.impl.FormImpl
		 * @see mrtrm.impl.MrtrmPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '{@link mrtrm.impl.ComponentUIImpl <em>Component UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mrtrm.impl.ComponentUIImpl
		 * @see mrtrm.impl.MrtrmPackageImpl#getComponentUI()
		 * @generated
		 */
		EClass COMPONENT_UI = eINSTANCE.getComponentUI();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_UI__NAME = eINSTANCE.getComponentUI_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_UI__LABEL = eINSTANCE.getComponentUI_Label();

		/**
		 * The meta object literal for the '<em><b>Tool TIp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_UI__TOOL_TIP = eINSTANCE.getComponentUI_ToolTIp();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_UI__TYPE = eINSTANCE.getComponentUI_Type();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_UI__TITLE = eINSTANCE.getComponentUI_Title();

		/**
		 * The meta object literal for the '{@link mrtrm.NewInterface6 <em>New Interface6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mrtrm.NewInterface6
		 * @see mrtrm.impl.MrtrmPackageImpl#getNewInterface6()
		 * @generated
		 */
		EClass NEW_INTERFACE6 = eINSTANCE.getNewInterface6();

		/**
		 * The meta object literal for the '{@link mrtrm.ComponentUIType <em>Component UI Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mrtrm.ComponentUIType
		 * @see mrtrm.impl.MrtrmPackageImpl#getComponentUIType()
		 * @generated
		 */
		EEnum COMPONENT_UI_TYPE = eINSTANCE.getComponentUIType();

	}

} //MrtrmPackage
