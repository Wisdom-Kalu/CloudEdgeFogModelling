/**
 */
package saproject.one;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link saproject.one.ComputingUnit#getBalancer <em>Balancer</em>}</li>
 *   <li>{@link saproject.one.ComputingUnit#getLocationtype <em>Locationtype</em>}</li>
 *   <li>{@link saproject.one.ComputingUnit#getStoragetype <em>Storagetype</em>}</li>
 *   <li>{@link saproject.one.ComputingUnit#getProcessingtype <em>Processingtype</em>}</li>
 * </ul>
 *
 * @see saproject.one.OnePackage#getComputingUnit()
 * @model
 * @generated
 */
public interface ComputingUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Balancer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balancer</em>' reference.
	 * @see #setBalancer(LoadBalancer)
	 * @see saproject.one.OnePackage#getComputingUnit_Balancer()
	 * @model
	 * @generated
	 */
	LoadBalancer getBalancer();

	/**
	 * Sets the value of the '{@link saproject.one.ComputingUnit#getBalancer <em>Balancer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balancer</em>' reference.
	 * @see #getBalancer()
	 * @generated
	 */
	void setBalancer(LoadBalancer value);

	/**
	 * Returns the value of the '<em><b>Locationtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locationtype</em>' containment reference.
	 * @see #setLocationtype(DataLocation)
	 * @see saproject.one.OnePackage#getComputingUnit_Locationtype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataLocation getLocationtype();

	/**
	 * Sets the value of the '{@link saproject.one.ComputingUnit#getLocationtype <em>Locationtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locationtype</em>' containment reference.
	 * @see #getLocationtype()
	 * @generated
	 */
	void setLocationtype(DataLocation value);

	/**
	 * Returns the value of the '<em><b>Storagetype</b></em>' containment reference list.
	 * The list contents are of type {@link saproject.one.StorageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storagetype</em>' containment reference list.
	 * @see saproject.one.OnePackage#getComputingUnit_Storagetype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StorageType> getStoragetype();

	/**
	 * Returns the value of the '<em><b>Processingtype</b></em>' containment reference list.
	 * The list contents are of type {@link saproject.one.ProcessingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processingtype</em>' containment reference list.
	 * @see saproject.one.OnePackage#getComputingUnit_Processingtype()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessingType> getProcessingtype();

} // ComputingUnit
