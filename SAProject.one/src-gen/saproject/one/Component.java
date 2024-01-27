/**
 */
package saproject.one;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link saproject.one.Component#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link saproject.one.Component#getComputingUnit <em>Computing Unit</em>}</li>
 *   <li>{@link saproject.one.Component#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link saproject.one.Component#getDataport <em>Dataport</em>}</li>
 *   <li>{@link saproject.one.Component#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link saproject.one.Component#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see saproject.one.OnePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' attribute.
	 * @see #setComponentName(String)
	 * @see saproject.one.OnePackage#getComponent_ComponentName()
	 * @model
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link saproject.one.Component#getComponentName <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' attribute.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Computing Unit</b></em>' containment reference list.
	 * The list contents are of type {@link saproject.one.ComputingUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computing Unit</em>' containment reference list.
	 * @see saproject.one.OnePackage#getComponent_ComputingUnit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComputingUnit> getComputingUnit();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference.
	 * @see #setBehavior(NodeBehavior)
	 * @see saproject.one.OnePackage#getComponent_Behavior()
	 * @model containment="true"
	 * @generated
	 */
	NodeBehavior getBehavior();

	/**
	 * Sets the value of the '{@link saproject.one.Component#getBehavior <em>Behavior</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' containment reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(NodeBehavior value);

	/**
	 * Returns the value of the '<em><b>Dataport</b></em>' containment reference list.
	 * The list contents are of type {@link saproject.one.DataPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataport</em>' containment reference list.
	 * @see saproject.one.OnePackage#getComponent_Dataport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DataPort> getDataport();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link saproject.one.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see saproject.one.OnePackage#getComponent_Incoming()
	 * @model
	 * @generated
	 */
	EList<Connection> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link saproject.one.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see saproject.one.OnePackage#getComponent_Outgoing()
	 * @model
	 * @generated
	 */
	EList<Connection> getOutgoing();

} // Component
