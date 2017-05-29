/**
 */
package mrtrm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mrtrm.Feature#getName <em>Name</em>}</li>
 *   <li>{@link mrtrm.Feature#getActionServices <em>Action Services</em>}</li>
 *   <li>{@link mrtrm.Feature#getComponentsUI <em>Components UI</em>}</li>
 * </ul>
 *
 * @see mrtrm.MrtrmPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
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
	 * @see mrtrm.MrtrmPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mrtrm.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Services</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Services</em>' reference.
	 * @see #setActionServices(ActionService)
	 * @see mrtrm.MrtrmPackage#getFeature_ActionServices()
	 * @model
	 * @generated
	 */
	ActionService getActionServices();

	/**
	 * Sets the value of the '{@link mrtrm.Feature#getActionServices <em>Action Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Services</em>' reference.
	 * @see #getActionServices()
	 * @generated
	 */
	void setActionServices(ActionService value);

	/**
	 * Returns the value of the '<em><b>Components UI</b></em>' containment reference list.
	 * The list contents are of type {@link mrtrm.ComponentUI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components UI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components UI</em>' containment reference list.
	 * @see mrtrm.MrtrmPackage#getFeature_ComponentsUI()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentUI> getComponentsUI();

} // Feature
