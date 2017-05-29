/**
 */
package mrtrm.impl;

import java.util.Collection;

import mrtrm.ActionService;
import mrtrm.ComponentUI;
import mrtrm.Feature;
import mrtrm.MrtrmPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mrtrm.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link mrtrm.impl.FeatureImpl#getActionServices <em>Action Services</em>}</li>
 *   <li>{@link mrtrm.impl.FeatureImpl#getComponentsUI <em>Components UI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature {
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
	 * The cached value of the '{@link #getActionServices() <em>Action Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionServices()
	 * @generated
	 * @ordered
	 */
	protected ActionService actionServices;

	/**
	 * The cached value of the '{@link #getComponentsUI() <em>Components UI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsUI()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentUI> componentsUI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MrtrmPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrtrmPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionService getActionServices() {
		if (actionServices != null && actionServices.eIsProxy()) {
			InternalEObject oldActionServices = (InternalEObject)actionServices;
			actionServices = (ActionService)eResolveProxy(oldActionServices);
			if (actionServices != oldActionServices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MrtrmPackage.FEATURE__ACTION_SERVICES, oldActionServices, actionServices));
			}
		}
		return actionServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionService basicGetActionServices() {
		return actionServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionServices(ActionService newActionServices) {
		ActionService oldActionServices = actionServices;
		actionServices = newActionServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MrtrmPackage.FEATURE__ACTION_SERVICES, oldActionServices, actionServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentUI> getComponentsUI() {
		if (componentsUI == null) {
			componentsUI = new EObjectContainmentEList<ComponentUI>(ComponentUI.class, this, MrtrmPackage.FEATURE__COMPONENTS_UI);
		}
		return componentsUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MrtrmPackage.FEATURE__COMPONENTS_UI:
				return ((InternalEList<?>)getComponentsUI()).basicRemove(otherEnd, msgs);
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
			case MrtrmPackage.FEATURE__NAME:
				return getName();
			case MrtrmPackage.FEATURE__ACTION_SERVICES:
				if (resolve) return getActionServices();
				return basicGetActionServices();
			case MrtrmPackage.FEATURE__COMPONENTS_UI:
				return getComponentsUI();
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
			case MrtrmPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case MrtrmPackage.FEATURE__ACTION_SERVICES:
				setActionServices((ActionService)newValue);
				return;
			case MrtrmPackage.FEATURE__COMPONENTS_UI:
				getComponentsUI().clear();
				getComponentsUI().addAll((Collection<? extends ComponentUI>)newValue);
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
			case MrtrmPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MrtrmPackage.FEATURE__ACTION_SERVICES:
				setActionServices((ActionService)null);
				return;
			case MrtrmPackage.FEATURE__COMPONENTS_UI:
				getComponentsUI().clear();
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
			case MrtrmPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MrtrmPackage.FEATURE__ACTION_SERVICES:
				return actionServices != null;
			case MrtrmPackage.FEATURE__COMPONENTS_UI:
				return componentsUI != null && !componentsUI.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
