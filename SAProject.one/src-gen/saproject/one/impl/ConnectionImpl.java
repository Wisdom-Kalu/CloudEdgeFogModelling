/**
 */
package saproject.one.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import saproject.one.Component;
import saproject.one.Connection;
import saproject.one.ConnectionType;
import saproject.one.InDataPort;
import saproject.one.NetworkProtocols;
import saproject.one.OnePackage;
import saproject.one.OutDataPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link saproject.one.impl.ConnectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link saproject.one.impl.ConnectionImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link saproject.one.impl.ConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link saproject.one.impl.ConnectionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link saproject.one.impl.ConnectionImpl#getTo <em>To</em>}</li>
 *   <li>{@link saproject.one.impl.ConnectionImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link saproject.one.impl.ConnectionImpl#getNetworkProtocol <em>Network Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
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
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected InDataPort destination;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected OutDataPort source;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Component from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Component to;

	/**
	 * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected ConnectionType connectionType;

	/**
	 * The cached value of the '{@link #getNetworkProtocol() <em>Network Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkProtocol()
	 * @generated
	 * @ordered
	 */
	protected NetworkProtocols networkProtocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OnePackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnePackage.CONNECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InDataPort getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject) destination;
			destination = (InDataPort) eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OnePackage.CONNECTION__DESTINATION,
							oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InDataPort basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(InDataPort newDestination) {
		InDataPort oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnePackage.CONNECTION__DESTINATION, oldDestination,
					destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutDataPort getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (OutDataPort) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OnePackage.CONNECTION__SOURCE, oldSource,
							source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutDataPort basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(OutDataPort newSource) {
		OutDataPort oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnePackage.CONNECTION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject) from;
			from = (Component) eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OnePackage.CONNECTION__FROM, oldFrom,
							from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(Component newFrom) {
		Component oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnePackage.CONNECTION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject) to;
			to = (Component) eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OnePackage.CONNECTION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(Component newTo) {
		Component oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnePackage.CONNECTION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionType getConnectionType() {
		if (connectionType != null && connectionType.eIsProxy()) {
			InternalEObject oldConnectionType = (InternalEObject) connectionType;
			connectionType = (ConnectionType) eResolveProxy(oldConnectionType);
			if (connectionType != oldConnectionType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OnePackage.CONNECTION__CONNECTION_TYPE,
							oldConnectionType, connectionType));
			}
		}
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType basicGetConnectionType() {
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionType(ConnectionType newConnectionType) {
		ConnectionType oldConnectionType = connectionType;
		connectionType = newConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnePackage.CONNECTION__CONNECTION_TYPE,
					oldConnectionType, connectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkProtocols getNetworkProtocol() {
		if (networkProtocol != null && networkProtocol.eIsProxy()) {
			InternalEObject oldNetworkProtocol = (InternalEObject) networkProtocol;
			networkProtocol = (NetworkProtocols) eResolveProxy(oldNetworkProtocol);
			if (networkProtocol != oldNetworkProtocol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OnePackage.CONNECTION__NETWORK_PROTOCOL,
							oldNetworkProtocol, networkProtocol));
			}
		}
		return networkProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkProtocols basicGetNetworkProtocol() {
		return networkProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkProtocol(NetworkProtocols newNetworkProtocol) {
		NetworkProtocols oldNetworkProtocol = networkProtocol;
		networkProtocol = newNetworkProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnePackage.CONNECTION__NETWORK_PROTOCOL,
					oldNetworkProtocol, networkProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OnePackage.CONNECTION__NAME:
			return getName();
		case OnePackage.CONNECTION__DESTINATION:
			if (resolve)
				return getDestination();
			return basicGetDestination();
		case OnePackage.CONNECTION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case OnePackage.CONNECTION__FROM:
			if (resolve)
				return getFrom();
			return basicGetFrom();
		case OnePackage.CONNECTION__TO:
			if (resolve)
				return getTo();
			return basicGetTo();
		case OnePackage.CONNECTION__CONNECTION_TYPE:
			if (resolve)
				return getConnectionType();
			return basicGetConnectionType();
		case OnePackage.CONNECTION__NETWORK_PROTOCOL:
			if (resolve)
				return getNetworkProtocol();
			return basicGetNetworkProtocol();
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
		case OnePackage.CONNECTION__NAME:
			setName((String) newValue);
			return;
		case OnePackage.CONNECTION__DESTINATION:
			setDestination((InDataPort) newValue);
			return;
		case OnePackage.CONNECTION__SOURCE:
			setSource((OutDataPort) newValue);
			return;
		case OnePackage.CONNECTION__FROM:
			setFrom((Component) newValue);
			return;
		case OnePackage.CONNECTION__TO:
			setTo((Component) newValue);
			return;
		case OnePackage.CONNECTION__CONNECTION_TYPE:
			setConnectionType((ConnectionType) newValue);
			return;
		case OnePackage.CONNECTION__NETWORK_PROTOCOL:
			setNetworkProtocol((NetworkProtocols) newValue);
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
		case OnePackage.CONNECTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case OnePackage.CONNECTION__DESTINATION:
			setDestination((InDataPort) null);
			return;
		case OnePackage.CONNECTION__SOURCE:
			setSource((OutDataPort) null);
			return;
		case OnePackage.CONNECTION__FROM:
			setFrom((Component) null);
			return;
		case OnePackage.CONNECTION__TO:
			setTo((Component) null);
			return;
		case OnePackage.CONNECTION__CONNECTION_TYPE:
			setConnectionType((ConnectionType) null);
			return;
		case OnePackage.CONNECTION__NETWORK_PROTOCOL:
			setNetworkProtocol((NetworkProtocols) null);
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
		case OnePackage.CONNECTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case OnePackage.CONNECTION__DESTINATION:
			return destination != null;
		case OnePackage.CONNECTION__SOURCE:
			return source != null;
		case OnePackage.CONNECTION__FROM:
			return from != null;
		case OnePackage.CONNECTION__TO:
			return to != null;
		case OnePackage.CONNECTION__CONNECTION_TYPE:
			return connectionType != null;
		case OnePackage.CONNECTION__NETWORK_PROTOCOL:
			return networkProtocol != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
