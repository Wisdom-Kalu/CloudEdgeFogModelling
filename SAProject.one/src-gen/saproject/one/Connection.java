/**
 */
package saproject.one;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link saproject.one.Connection#getName <em>Name</em>}</li>
 *   <li>{@link saproject.one.Connection#getDestination <em>Destination</em>}</li>
 *   <li>{@link saproject.one.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link saproject.one.Connection#getFrom <em>From</em>}</li>
 *   <li>{@link saproject.one.Connection#getTo <em>To</em>}</li>
 *   <li>{@link saproject.one.Connection#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link saproject.one.Connection#getNetworkProtocol <em>Network Protocol</em>}</li>
 * </ul>
 *
 * @see saproject.one.OnePackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see saproject.one.OnePackage#getConnection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link saproject.one.Connection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(InDataPort)
	 * @see saproject.one.OnePackage#getConnection_Destination()
	 * @model required="true"
	 * @generated
	 */
	InDataPort getDestination();

	/**
	 * Sets the value of the '{@link saproject.one.Connection#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(InDataPort value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OutDataPort)
	 * @see saproject.one.OnePackage#getConnection_Source()
	 * @model required="true"
	 * @generated
	 */
	OutDataPort getSource();

	/**
	 * Sets the value of the '{@link saproject.one.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OutDataPort value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Component)
	 * @see saproject.one.OnePackage#getConnection_From()
	 * @model
	 * @generated
	 */
	Component getFrom();

	/**
	 * Sets the value of the '{@link saproject.one.Connection#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Component value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Component)
	 * @see saproject.one.OnePackage#getConnection_To()
	 * @model
	 * @generated
	 */
	Component getTo();

	/**
	 * Sets the value of the '{@link saproject.one.Connection#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Component value);

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Type</em>' reference.
	 * @see #setConnectionType(ConnectionType)
	 * @see saproject.one.OnePackage#getConnection_ConnectionType()
	 * @model required="true"
	 * @generated
	 */
	ConnectionType getConnectionType();

	/**
	 * Sets the value of the '{@link saproject.one.Connection#getConnectionType <em>Connection Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' reference.
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Network Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Protocol</em>' reference.
	 * @see #setNetworkProtocol(NetworkProtocols)
	 * @see saproject.one.OnePackage#getConnection_NetworkProtocol()
	 * @model required="true"
	 * @generated
	 */
	NetworkProtocols getNetworkProtocol();

	/**
	 * Sets the value of the '{@link saproject.one.Connection#getNetworkProtocol <em>Network Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Protocol</em>' reference.
	 * @see #getNetworkProtocol()
	 * @generated
	 */
	void setNetworkProtocol(NetworkProtocols value);

} // Connection
