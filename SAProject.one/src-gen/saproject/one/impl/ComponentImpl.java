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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import saproject.one.Component;
import saproject.one.ComputingUnit;
import saproject.one.Connection;
import saproject.one.DataPort;
import saproject.one.NodeBehavior;
import saproject.one.OnePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link saproject.one.impl.ComponentImpl#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link saproject.one.impl.ComponentImpl#getComputingUnit <em>Computing Unit</em>}</li>
 *   <li>{@link saproject.one.impl.ComponentImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link saproject.one.impl.ComponentImpl#getDataport <em>Dataport</em>}</li>
 *   <li>{@link saproject.one.impl.ComponentImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link saproject.one.impl.ComponentImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The default value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentName() <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentName()
	 * @generated
	 * @ordered
	 */
	protected String componentName = COMPONENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComputingUnit() <em>Computing Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputingUnit> computingUnit;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected NodeBehavior behavior;

	/**
	 * The cached value of the '{@link #getDataport() <em>Dataport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataport()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPort> dataport;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OnePackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponentName() {
		return componentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentName(String newComponentName) {
		String oldComponentName = componentName;
		componentName = newComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnePackage.COMPONENT__COMPONENT_NAME,
					oldComponentName, componentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputingUnit> getComputingUnit() {
		if (computingUnit == null) {
			computingUnit = new EObjectContainmentEList<ComputingUnit>(ComputingUnit.class, this,
					OnePackage.COMPONENT__COMPUTING_UNIT);
		}
		return computingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeBehavior getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehavior(NodeBehavior newBehavior, NotificationChain msgs) {
		NodeBehavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OnePackage.COMPONENT__BEHAVIOR, oldBehavior, newBehavior);
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
	public void setBehavior(NodeBehavior newBehavior) {
		if (newBehavior != behavior) {
			NotificationChain msgs = null;
			if (behavior != null)
				msgs = ((InternalEObject) behavior).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - OnePackage.COMPONENT__BEHAVIOR, null, msgs);
			if (newBehavior != null)
				msgs = ((InternalEObject) newBehavior).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - OnePackage.COMPONENT__BEHAVIOR, null, msgs);
			msgs = basicSetBehavior(newBehavior, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnePackage.COMPONENT__BEHAVIOR, newBehavior,
					newBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataPort> getDataport() {
		if (dataport == null) {
			dataport = new EObjectContainmentEList<DataPort>(DataPort.class, this, OnePackage.COMPONENT__DATAPORT);
		}
		return dataport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectResolvingEList<Connection>(Connection.class, this, OnePackage.COMPONENT__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectResolvingEList<Connection>(Connection.class, this, OnePackage.COMPONENT__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OnePackage.COMPONENT__COMPUTING_UNIT:
			return ((InternalEList<?>) getComputingUnit()).basicRemove(otherEnd, msgs);
		case OnePackage.COMPONENT__BEHAVIOR:
			return basicSetBehavior(null, msgs);
		case OnePackage.COMPONENT__DATAPORT:
			return ((InternalEList<?>) getDataport()).basicRemove(otherEnd, msgs);
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
		case OnePackage.COMPONENT__COMPONENT_NAME:
			return getComponentName();
		case OnePackage.COMPONENT__COMPUTING_UNIT:
			return getComputingUnit();
		case OnePackage.COMPONENT__BEHAVIOR:
			return getBehavior();
		case OnePackage.COMPONENT__DATAPORT:
			return getDataport();
		case OnePackage.COMPONENT__INCOMING:
			return getIncoming();
		case OnePackage.COMPONENT__OUTGOING:
			return getOutgoing();
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
		case OnePackage.COMPONENT__COMPONENT_NAME:
			setComponentName((String) newValue);
			return;
		case OnePackage.COMPONENT__COMPUTING_UNIT:
			getComputingUnit().clear();
			getComputingUnit().addAll((Collection<? extends ComputingUnit>) newValue);
			return;
		case OnePackage.COMPONENT__BEHAVIOR:
			setBehavior((NodeBehavior) newValue);
			return;
		case OnePackage.COMPONENT__DATAPORT:
			getDataport().clear();
			getDataport().addAll((Collection<? extends DataPort>) newValue);
			return;
		case OnePackage.COMPONENT__INCOMING:
			getIncoming().clear();
			getIncoming().addAll((Collection<? extends Connection>) newValue);
			return;
		case OnePackage.COMPONENT__OUTGOING:
			getOutgoing().clear();
			getOutgoing().addAll((Collection<? extends Connection>) newValue);
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
		case OnePackage.COMPONENT__COMPONENT_NAME:
			setComponentName(COMPONENT_NAME_EDEFAULT);
			return;
		case OnePackage.COMPONENT__COMPUTING_UNIT:
			getComputingUnit().clear();
			return;
		case OnePackage.COMPONENT__BEHAVIOR:
			setBehavior((NodeBehavior) null);
			return;
		case OnePackage.COMPONENT__DATAPORT:
			getDataport().clear();
			return;
		case OnePackage.COMPONENT__INCOMING:
			getIncoming().clear();
			return;
		case OnePackage.COMPONENT__OUTGOING:
			getOutgoing().clear();
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
		case OnePackage.COMPONENT__COMPONENT_NAME:
			return COMPONENT_NAME_EDEFAULT == null ? componentName != null
					: !COMPONENT_NAME_EDEFAULT.equals(componentName);
		case OnePackage.COMPONENT__COMPUTING_UNIT:
			return computingUnit != null && !computingUnit.isEmpty();
		case OnePackage.COMPONENT__BEHAVIOR:
			return behavior != null;
		case OnePackage.COMPONENT__DATAPORT:
			return dataport != null && !dataport.isEmpty();
		case OnePackage.COMPONENT__INCOMING:
			return incoming != null && !incoming.isEmpty();
		case OnePackage.COMPONENT__OUTGOING:
			return outgoing != null && !outgoing.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (componentName: ");
		result.append(componentName);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
