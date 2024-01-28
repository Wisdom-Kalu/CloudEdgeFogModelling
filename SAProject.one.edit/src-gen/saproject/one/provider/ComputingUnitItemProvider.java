/**
 */
package saproject.one.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import saproject.one.ComputingUnit;
import saproject.one.OneFactory;
import saproject.one.OnePackage;

/**
 * This is the item provider adapter for a {@link saproject.one.ComputingUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputingUnitItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingUnitItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBalancerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Balancer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBalancerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComputingUnit_balancer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComputingUnit_balancer_feature",
								"_UI_ComputingUnit_type"),
						OnePackage.Literals.COMPUTING_UNIT__BALANCER, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OnePackage.Literals.COMPUTING_UNIT__LOCATIONTYPE);
			childrenFeatures.add(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE);
			childrenFeatures.add(OnePackage.Literals.COMPUTING_UNIT__PROCESSINGTYPE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComputingUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComputingUnit"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ComputingUnit_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComputingUnit.class)) {
		case OnePackage.COMPUTING_UNIT__LOCATIONTYPE:
		case OnePackage.COMPUTING_UNIT__STORAGETYPE:
		case OnePackage.COMPUTING_UNIT__PROCESSINGTYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__LOCATIONTYPE,
				OneFactory.eINSTANCE.createDataLocation()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__LOCATIONTYPE,
				OneFactory.eINSTANCE.createCloud()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__LOCATIONTYPE,
				OneFactory.eINSTANCE.createFog()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__LOCATIONTYPE,
				OneFactory.eINSTANCE.createEdge()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createStorageType()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createEmbeddedFlashMemory()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createSSDs()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createNVMe()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createIPFS()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createKeyValue()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createGraph()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createHistorical()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createRealTime()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createStream()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__STORAGETYPE,
				OneFactory.eINSTANCE.createTimeStamp()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__PROCESSINGTYPE,
				OneFactory.eINSTANCE.createProcessingType()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__PROCESSINGTYPE,
				OneFactory.eINSTANCE.createBatch()));

		newChildDescriptors.add(createChildParameter(OnePackage.Literals.COMPUTING_UNIT__PROCESSINGTYPE,
				OneFactory.eINSTANCE.createRealTimeProcessing()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return OneEditPlugin.INSTANCE;
	}

}
