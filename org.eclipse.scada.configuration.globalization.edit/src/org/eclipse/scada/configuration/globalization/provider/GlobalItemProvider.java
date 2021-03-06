/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.globalization.provider;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.scada.configuration.globalization.Global;
import org.eclipse.scada.configuration.globalization.GlobalizeFactory;
import org.eclipse.scada.configuration.globalization.GlobalizePackage;
import org.eclipse.scada.configuration.world.WorldFactory;
import org.eclipse.scada.configuration.world.osgi.OsgiFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.scada.configuration.globalization.Global} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalItemProvider ( AdapterFactory adapterFactory )
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

            addGlobalPropertyDescriptor ( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Global feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGlobalPropertyDescriptor ( Object object )
    {
        itemPropertyDescriptors.add
                ( createItemPropertyDescriptor
                ( ( (ComposeableAdapterFactory)adapterFactory ).getRootAdapterFactory (),
                        getResourceLocator (),
                        getString ( "_UI_Global_global_feature" ), //$NON-NLS-1$
                        getString ( "_UI_PropertyDescriptor_description", "_UI_Global_global_feature", "_UI_Global_type" ), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                        GlobalizePackage.Literals.GLOBAL__GLOBAL,
                        true,
                        false,
                        true,
                        null,
                        null,
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
            childrenFeatures.add ( GlobalizePackage.Literals.GLOBAL__DEFAULT_LOGON_CREDENTIALS );
            childrenFeatures.add ( GlobalizePackage.Literals.GLOBAL__LOCALS );
            childrenFeatures.add ( GlobalizePackage.Literals.GLOBAL__EVENT_POOL_IMPORTS );
            childrenFeatures.add ( GlobalizePackage.Literals.GLOBAL__MONITOR_POOL_IMPORTS );
            childrenFeatures.add ( GlobalizePackage.Literals.GLOBAL__LOCAL_PULL );
            childrenFeatures.add ( GlobalizePackage.Literals.GLOBAL__FILTERS );
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
     * This returns Global.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage ( Object object )
    {
        return overlayImage ( object, getResourceLocator ().getImage ( "full/obj16/Global" ) ); //$NON-NLS-1$
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
        return getString ( "_UI_Global_type" ); //$NON-NLS-1$
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

        switch ( notification.getFeatureID ( Global.class ) )
        {
            case GlobalizePackage.GLOBAL__DEFAULT_LOGON_CREDENTIALS:
            case GlobalizePackage.GLOBAL__LOCALS:
            case GlobalizePackage.GLOBAL__EVENT_POOL_IMPORTS:
            case GlobalizePackage.GLOBAL__MONITOR_POOL_IMPORTS:
            case GlobalizePackage.GLOBAL__LOCAL_PULL:
            case GlobalizePackage.GLOBAL__FILTERS:
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

        newChildDescriptors.add
                ( createChildParameter
                ( GlobalizePackage.Literals.GLOBAL__DEFAULT_LOGON_CREDENTIALS,
                        WorldFactory.eINSTANCE.createUsernamePasswordCredentials () ) );

        newChildDescriptors.add
                ( createChildParameter
                ( GlobalizePackage.Literals.GLOBAL__DEFAULT_LOGON_CREDENTIALS,
                        WorldFactory.eINSTANCE.createPasswordCredentials () ) );

        newChildDescriptors.add
                ( createChildParameter
                ( GlobalizePackage.Literals.GLOBAL__LOCALS,
                        GlobalizeFactory.eINSTANCE.createLocal () ) );

        newChildDescriptors.add
                ( createChildParameter
                ( GlobalizePackage.Literals.GLOBAL__EVENT_POOL_IMPORTS,
                        GlobalizeFactory.eINSTANCE.createEventPoolImport () ) );

        newChildDescriptors.add
                ( createChildParameter
                ( GlobalizePackage.Literals.GLOBAL__MONITOR_POOL_IMPORTS,
                        GlobalizeFactory.eINSTANCE.createMonitorPoolImport () ) );

        newChildDescriptors.add
                ( createChildParameter
                ( GlobalizePackage.Literals.GLOBAL__LOCAL_PULL,
                        OsgiFactory.eINSTANCE.createPullEvents () ) );

        newChildDescriptors.add
                ( createChildParameter
                ( GlobalizePackage.Literals.GLOBAL__FILTERS,
                        GlobalizeFactory.eINSTANCE.createInclude () ) );

        newChildDescriptors.add
                ( createChildParameter
                ( GlobalizePackage.Literals.GLOBAL__FILTERS,
                        GlobalizeFactory.eINSTANCE.createExclude () ) );

        newChildDescriptors.add
                ( createChildParameter
                ( GlobalizePackage.Literals.GLOBAL__FILTERS,
                        GlobalizeFactory.eINSTANCE.createItemNameFilter () ) );
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
