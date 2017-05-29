/**
 */
package mrtrm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mrtrm.ComponentUI#getName <em>Name</em>}</li>
 *   <li>{@link mrtrm.ComponentUI#getLabel <em>Label</em>}</li>
 *   <li>{@link mrtrm.ComponentUI#getToolTIp <em>Tool TIp</em>}</li>
 *   <li>{@link mrtrm.ComponentUI#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mrtrm.MrtrmPackage#getComponentUI()
 * @model
 * @generated
 */
public interface ComponentUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mrtrm.MrtrmPackage#getComponentUI_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mrtrm.ComponentUI#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see mrtrm.MrtrmPackage#getComponentUI_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link mrtrm.ComponentUI#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Tool TIp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool TIp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool TIp</em>' attribute.
	 * @see #setToolTIp(String)
	 * @see mrtrm.MrtrmPackage#getComponentUI_ToolTIp()
	 * @model
	 * @generated
	 */
	String getToolTIp();

	/**
	 * Sets the value of the '{@link mrtrm.ComponentUI#getToolTIp <em>Tool TIp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool TIp</em>' attribute.
	 * @see #getToolTIp()
	 * @generated
	 */
	void setToolTIp(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"TEXT"</code>.
	 * The literals are from the enumeration {@link mrtrm.ComponentUIType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mrtrm.ComponentUIType
	 * @see #setType(ComponentUIType)
	 * @see mrtrm.MrtrmPackage#getComponentUI_Type()
	 * @model default="TEXT"
	 * @generated
	 */
	ComponentUIType getType();

	/**
	 * Sets the value of the '{@link mrtrm.ComponentUI#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mrtrm.ComponentUIType
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentUIType value);

} // ComponentUI
