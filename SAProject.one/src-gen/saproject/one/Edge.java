/**
 */
package saproject.one;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link saproject.one.Edge#getBalancer <em>Balancer</em>}</li>
 * </ul>
 *
 * @see saproject.one.OnePackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends DataLocation {
	/**
	 * Returns the value of the '<em><b>Balancer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balancer</em>' reference.
	 * @see #setBalancer(LoadBalancer)
	 * @see saproject.one.OnePackage#getEdge_Balancer()
	 * @model
	 * @generated
	 */
	LoadBalancer getBalancer();

	/**
	 * Sets the value of the '{@link saproject.one.Edge#getBalancer <em>Balancer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balancer</em>' reference.
	 * @see #getBalancer()
	 * @generated
	 */
	void setBalancer(LoadBalancer value);

} // Edge
