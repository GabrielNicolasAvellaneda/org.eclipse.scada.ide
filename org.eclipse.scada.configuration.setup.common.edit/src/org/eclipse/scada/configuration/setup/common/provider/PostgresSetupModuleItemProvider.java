/**
 * Copyright (c) 2014 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 * 
 */
package org.eclipse.scada.configuration.setup.common.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import org.eclipse.scada.configuration.setup.common.CommonPackage;
import org.eclipse.scada.configuration.setup.common.PostgresSetupModule;

/**
 * This is the item provider adapter for a {@link org.eclipse.scada.configuration.setup.common.PostgresSetupModule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PostgresSetupModuleItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PostgresSetupModuleItemProvider ( AdapterFactory adapterFactory )
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

            addDatabasePropertyDescriptor ( object );
            addPostgresUserPropertyDescriptor ( object );
            addHostBasedAccessFilePropertyDescriptor ( object );
            addConfigurationFilePropertyDescriptor ( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Database feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDatabasePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_PostgresSetupModule_database_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_PostgresSetupModule_database_feature", "_UI_PostgresSetupModule_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                CommonPackage.Literals.POSTGRES_SETUP_MODULE__DATABASE, true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Postgres User feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPostgresUserPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_PostgresSetupModule_postgresUser_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_PostgresSetupModule_postgresUser_feature", "_UI_PostgresSetupModule_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                CommonPackage.Literals.POSTGRES_SETUP_MODULE__POSTGRES_USER, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Host Based Access File feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHostBasedAccessFilePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_PostgresSetupModule_hostBasedAccessFile_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_PostgresSetupModule_hostBasedAccessFile_feature", "_UI_PostgresSetupModule_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                CommonPackage.Literals.POSTGRES_SETUP_MODULE__HOST_BASED_ACCESS_FILE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Configuration File feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConfigurationFilePropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add ( createItemPropertyDescriptor ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (), getResourceLocator (), getString ( "_UI_PostgresSetupModule_configurationFile_feature" ), //$NON-NLS-1$
                getString ( "_UI_PropertyDescriptor_description", "_UI_PostgresSetupModule_configurationFile_feature", "_UI_PostgresSetupModule_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                CommonPackage.Literals.POSTGRES_SETUP_MODULE__CONFIGURATION_FILE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns PostgresSetupModule.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage ( Object object )
    {
        return overlayImage ( object, getResourceLocator ().getImage ( "full/obj16/PostgresSetupModule" ) ); //$NON-NLS-1$
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
        String label = ( (PostgresSetupModule)object ).getPostgresUser ();
        return label == null || label.length () == 0 ? getString ( "_UI_PostgresSetupModule_type" ) : //$NON-NLS-1$
        getString ( "_UI_PostgresSetupModule_type" ) + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

        switch ( notification.getFeatureID ( PostgresSetupModule.class ) )
        {
            case CommonPackage.POSTGRES_SETUP_MODULE__POSTGRES_USER:
            case CommonPackage.POSTGRES_SETUP_MODULE__HOST_BASED_ACCESS_FILE:
            case CommonPackage.POSTGRES_SETUP_MODULE__CONFIGURATION_FILE:
                fireNotifyChanged ( new ViewerNotification ( notification, notification.getNotifier (), false, true ) );
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
