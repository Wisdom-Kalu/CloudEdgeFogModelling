/**
 */
package saproject.one.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import saproject.one.Edge;
import saproject.one.LoadBalancer;
import saproject.one.OnePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link saproject.one.impl.EdgeImpl#getBalancer <em>Balancer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends DataLocationImpl implements Edge {
	/**
	 * The cached value of the '{@link #getBalancer() <em>Balancer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalancer()
	 * @generated
	 * @ordered
	 */
	protected LoadBalancer balancer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OnePackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBalancer getBalancer() {
		if (balancer != null && balancer.eIsProxy()) {
			InternalEObject oldBalancer = (InternalEObject) balancer;
			balancer = (LoadBalancer) eResolveProxy(oldBalancer);
			if (balancer != oldBalancer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OnePackage.EDGE__BALANCER, oldBalancer,
							balancer));
			}
		}
		return balancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancer basicGetBalancer() {
		return balancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBalancer(LoadBalancer newBalancer) {
		LoadBalancer oldBalancer = balancer;
		balancer = newBalancer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnePackage.EDGE__BALANCER, oldBalancer, balancer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OnePackage.EDGE__BALANCER:
			if (resolve)
				return getBalancer();
			return basicGetBalancer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OnePackage.EDGE__BALANCER:
			setBalancer((LoadBalancer) newValue);
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
		case OnePackage.EDGE__BALANCER:
			setBalancer((LoadBalancer) null);
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
		case OnePackage.EDGE__BALANCER:
			return balancer != null;
		}
		return super.eIsSet(featureID);
	}

} //EdgeImpl
