/**
 */
package saproject.one.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import saproject.one.ComputingUnit;
import saproject.one.DataLocation;
import saproject.one.LoadBalancer;
import saproject.one.OnePackage;
import saproject.one.ProcessingType;
import saproject.one.StorageType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computing Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link saproject.one.impl.ComputingUnitImpl#getBalancer <em>Balancer</em>}</li>
 *   <li>{@link saproject.one.impl.ComputingUnitImpl#getLocationtype <em>Locationtype</em>}</li>
 *   <li>{@link saproject.one.impl.ComputingUnitImpl#getStoragetype <em>Storagetype</em>}</li>
 *   <li>{@link saproject.one.impl.ComputingUnitImpl#getProcessingtype <em>Processingtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputingUnitImpl extends MinimalEObjectImpl.Container implements ComputingUnit {
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
	 * The cached value of the '{@link #getLocationtype() <em>Locationtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationtype()
	 * @generated
	 * @ordered
	 */
	protected DataLocation locationtype;

	/**
	 * The cached value of the '{@link #getStoragetype() <em>Storagetype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoragetype()
	 * @generated
	 * @ordered
	 */
	protected EList<StorageType> storagetype;

	/**
	 * The cached value of the '{@link #getProcessingtype() <em>Processingtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingtype()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingType> processingtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputingUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OnePackage.Literals.COMPUTING_UNIT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OnePackage.COMPUTING_UNIT__BALANCER,
							oldBalancer, balancer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OnePackage.COMPUTING_UNIT__BALANCER, oldBalancer,
					balancer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataLocation getLocationtype() {
		return locationtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationtype(DataLocation newLocationtype, NotificationChain msgs) {
		DataLocation oldLocationtype = locationtype;
		locationtype = newLocationtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OnePackage.COMPUTING_UNIT__LOCATIONTYPE, oldLocationtype, newLocationtype);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationtype(DataLocation newLocationtype) {
		if (newLocationtype != locationtype) {
			NotificationChain msgs = null;
			if (locationtype != null)
				msgs = ((InternalEObject) locationtype).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OnePackage.COMPUTING_UNIT__LOCATIONTYPE, null, msgs);
			if (newLocationtype != null)
				msgs = ((InternalEObject) newLocationtype).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OnePackage.COMPUTING_UNIT__LOCATIONTYPE, null, msgs);
			msgs = basicSetLocationtype(newLocationtype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnePackage.COMPUTING_UNIT__LOCATIONTYPE,
					newLocationtype, newLocationtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StorageType> getStoragetype() {
		if (storagetype == null) {
			storagetype = new EObjectContainmentEList<StorageType>(StorageType.class, this,
					OnePackage.COMPUTING_UNIT__STORAGETYPE);
		}
		return storagetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessingType> getProcessingtype() {
		if (processingtype == null) {
			processingtype = new EObjectContainmentEList<ProcessingType>(ProcessingType.class, this,
					OnePackage.COMPUTING_UNIT__PROCESSINGTYPE);
		}
		return processingtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OnePackage.COMPUTING_UNIT__LOCATIONTYPE:
			return basicSetLocationtype(null, msgs);
		case OnePackage.COMPUTING_UNIT__STORAGETYPE:
			return ((InternalEList<?>) getStoragetype()).basicRemove(otherEnd, msgs);
		case OnePackage.COMPUTING_UNIT__PROCESSINGTYPE:
			return ((InternalEList<?>) getProcessingtype()).basicRemove(otherEnd, msgs);
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
		case OnePackage.COMPUTING_UNIT__BALANCER:
			if (resolve)
				return getBalancer();
			return basicGetBalancer();
		case OnePackage.COMPUTING_UNIT__LOCATIONTYPE:
			return getLocationtype();
		case OnePackage.COMPUTING_UNIT__STORAGETYPE:
			return getStoragetype();
		case OnePackage.COMPUTING_UNIT__PROCESSINGTYPE:
			return getProcessingtype();
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
		case OnePackage.COMPUTING_UNIT__BALANCER:
			setBalancer((LoadBalancer) newValue);
			return;
		case OnePackage.COMPUTING_UNIT__LOCATIONTYPE:
			setLocationtype((DataLocation) newValue);
			return;
		case OnePackage.COMPUTING_UNIT__STORAGETYPE:
			getStoragetype().clear();
			getStoragetype().addAll((Collection<? extends StorageType>) newValue);
			return;
		case OnePackage.COMPUTING_UNIT__PROCESSINGTYPE:
			getProcessingtype().clear();
			getProcessingtype().addAll((Collection<? extends ProcessingType>) newValue);
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
		case OnePackage.COMPUTING_UNIT__BALANCER:
			setBalancer((LoadBalancer) null);
			return;
		case OnePackage.COMPUTING_UNIT__LOCATIONTYPE:
			setLocationtype((DataLocation) null);
			return;
		case OnePackage.COMPUTING_UNIT__STORAGETYPE:
			getStoragetype().clear();
			return;
		case OnePackage.COMPUTING_UNIT__PROCESSINGTYPE:
			getProcessingtype().clear();
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
		case OnePackage.COMPUTING_UNIT__BALANCER:
			return balancer != null;
		case OnePackage.COMPUTING_UNIT__LOCATIONTYPE:
			return locationtype != null;
		case OnePackage.COMPUTING_UNIT__STORAGETYPE:
			return storagetype != null && !storagetype.isEmpty();
		case OnePackage.COMPUTING_UNIT__PROCESSINGTYPE:
			return processingtype != null && !processingtype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComputingUnitImpl
