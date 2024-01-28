/**
 */
package saproject.one;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link saproject.one.DataArchitecture#getComponent <em>Component</em>}</li>
 *   <li>{@link saproject.one.DataArchitecture#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see saproject.one.OnePackage#getDataArchitecture()
 * @model
 * @generated
 */
public interface DataArchitecture extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link saproject.one.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see saproject.one.OnePackage#getDataArchitecture_Component()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link saproject.one.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see saproject.one.OnePackage#getDataArchitecture_Links()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Connection> getLinks();

} // DataArchitecture
