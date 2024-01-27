/**
 */
package saproject.one;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Balancer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link saproject.one.LoadBalancer#getEdge <em>Edge</em>}</li>
 * </ul>
 *
 * @see saproject.one.OnePackage#getLoadBalancer()
 * @model
 * @generated
 */
public interface LoadBalancer extends EObject {
	/**
	 * Returns the value of the '<em><b>Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' reference.
	 * @see #setEdge(Edge)
	 * @see saproject.one.OnePackage#getLoadBalancer_Edge()
	 * @model
	 * @generated
	 */
	Edge getEdge();

	/**
	 * Sets the value of the '{@link saproject.one.LoadBalancer#getEdge <em>Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge</em>' reference.
	 * @see #getEdge()
	 * @generated
	 */
	void setEdge(Edge value);

} // LoadBalancer
