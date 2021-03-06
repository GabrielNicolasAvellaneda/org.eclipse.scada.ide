/**
 * Copyright (c) 2013, 2014 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 * 
 */
package org.eclipse.scada.configuration.infrastructure.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.scada.configuration.infrastructure.ApplicationConfiguration;
import org.eclipse.scada.configuration.infrastructure.InfrastructureFactory;
import org.eclipse.scada.configuration.infrastructure.InfrastructurePackage;
import org.eclipse.scada.configuration.world.WorldPackage;
import org.eclipse.scada.configuration.world.osgi.OsgiFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.scada.configuration.infrastructure.ApplicationConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationConfigurationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationConfigurationItemProvider ( AdapterFactory adapterFactory )
    {
        super ( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors ( Object object )
    {
        if ( itemPropertyDescriptors == null )
        {
            super.getPropertyDescriptors ( object );

            addShortDescriptionPropertyDescriptor ( object );
            addNamePropertyDescriptor ( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Short Description feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShortDescriptionPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_Documentable_shortDescription_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_Documentable_shortDescription_feature", "_UI_Documentable_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                WorldPackage.Literals.DOCUMENTABLE__SHORT_DESCRIPTION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_namingPropertyCategory" ), //$NON-NLS-1$
                null ) );
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_NamedDocumentable_name_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_NamedDocumentable_name_feature", "_UI_NamedDocumentable_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                WorldPackage.Literals.NAMED_DOCUMENTABLE__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString ( "_UI_namingPropertyCategory" ), //$NON-NLS-1$
                null ) );
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
    public Collection<? extends EStructuralFeature> getChildrenFeatures ( Object object )
    {
        if ( childrenFeatures == null )
        {
            super.getChildrenFeatures ( object );
            childrenFeatures.add ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__MODULES );
            childrenFeatures.add ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__CONFIGURATIONS );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature ( Object object, Object child )
    {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature ( object, child );
    }

    /**
     * This returns ApplicationConfiguration.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage ( Object object )
    {
        return overlayImage ( object, getResourceLocator ().getImage ( "full/obj16/ApplicationConfiguration" ) ); //$NON-NLS-1$
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean shouldComposeCreationImage ()
    {
        return true;
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText ( Object object )
    {
        String label = ( (ApplicationConfiguration)object ).getName ();
        return label == null || label.length () == 0 ? getString ( "_UI_ApplicationConfiguration_type" ) : //$NON-NLS-1$
        getString ( "_UI_ApplicationConfiguration_type" ) + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged ( Notification notification )
    {
        updateChildren ( notification );

        switch ( notification.getFeatureID ( ApplicationConfiguration.class ) )
        {
            case InfrastructurePackage.APPLICATION_CONFIGURATION__SHORT_DESCRIPTION:
            case InfrastructurePackage.APPLICATION_CONFIGURATION__NAME:
                fireNotifyChanged ( new ViewerNotification ( notification, notification.getNotifier (), false, true ) );
                return;
            case InfrastructurePackage.APPLICATION_CONFIGURATION__MODULES:
            case InfrastructurePackage.APPLICATION_CONFIGURATION__CONFIGURATIONS:
                fireNotifyChanged ( new ViewerNotification ( notification, notification.getNotifier (), true, false ) );
                return;
        }
        super.notifyChanged ( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors ( Collection<Object> newChildDescriptors, Object object )
    {
        super.collectNewChildDescriptors ( newChildDescriptors, object );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__MODULES, InfrastructureFactory.eINSTANCE.createHttpServiceModule () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__MODULES, InfrastructureFactory.eINSTANCE.createRestExporterModule () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__MODULES, InfrastructureFactory.eINSTANCE.createWebAdminConsole () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__MODULES, InfrastructureFactory.eINSTANCE.createOracleVMSettings () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__MODULES, InfrastructureFactory.eINSTANCE.createGenericVMSettings () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__MODULES, InfrastructureFactory.eINSTANCE.createEventInjectorHttp () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__MODULES, InfrastructureFactory.eINSTANCE.createEventInjectorSyslog () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__CONFIGURATIONS, OsgiFactory.eINSTANCE.createEventStorageJdbc () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__CONFIGURATIONS, OsgiFactory.eINSTANCE.createEventStoragePostgres () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__CONFIGURATIONS, OsgiFactory.eINSTANCE.createTelnetConsole () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__CONFIGURATIONS, OsgiFactory.eINSTANCE.createEventInjectorPostgres () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__CONFIGURATIONS, OsgiFactory.eINSTANCE.createEventInjectorJdbc () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__CONFIGURATIONS, OsgiFactory.eINSTANCE.createProfileConfiguration () ) );

        newChildDescriptors.add ( createChildParameter ( InfrastructurePackage.Literals.APPLICATION_CONFIGURATION__CONFIGURATIONS, OsgiFactory.eINSTANCE.createEventInjectorManager () ) );
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator ()
    {
        return ( (IChildCreationExtender)adapterFactory ).getResourceLocator ();
    }

}
