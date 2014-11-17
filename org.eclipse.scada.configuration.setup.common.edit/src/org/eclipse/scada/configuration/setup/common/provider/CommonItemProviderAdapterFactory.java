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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.scada.configuration.setup.common.CommonFactory;
import org.eclipse.scada.configuration.setup.common.CommonPackage;

import org.eclipse.scada.configuration.setup.common.util.CommonAdapterFactory;

import org.eclipse.scada.configuration.world.deployment.CommonDeploymentMechanism;
import org.eclipse.scada.configuration.world.deployment.DeploymentPackage;
import org.eclipse.scada.configuration.world.deployment.util.DeploymentSwitch;
import org.eclipse.scada.configuration.world.setup.SetupModuleContainer;
import org.eclipse.scada.configuration.world.setup.SetupPackage;

import org.eclipse.scada.configuration.world.setup.util.SetupSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonItemProviderAdapterFactory extends CommonAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
{
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier ();

    /**
     * This helps manage the child creation extenders.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager ( CommonEditPlugin.INSTANCE, CommonPackage.eNS_URI );

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object> ();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommonItemProviderAdapterFactory ()
    {
        supportedTypes.add ( IEditingDomainItemProvider.class );
        supportedTypes.add ( IStructuredItemContentProvider.class );
        supportedTypes.add ( ITreeItemContentProvider.class );
        supportedTypes.add ( IItemLabelProvider.class );
        supportedTypes.add ( IItemPropertySource.class );
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.configuration.setup.common.PostgresSetupModule} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PostgresSetupModuleItemProvider postgresSetupModuleItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.configuration.setup.common.PostgresSetupModule}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPostgresSetupModuleAdapter ()
    {
        if ( postgresSetupModuleItemProvider == null )
        {
            postgresSetupModuleItemProvider = new PostgresSetupModuleItemProvider ( this );
        }

        return postgresSetupModuleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.configuration.setup.common.SerialToNetworkSetupModule} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SerialToNetworkSetupModuleItemProvider serialToNetworkSetupModuleItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.configuration.setup.common.SerialToNetworkSetupModule}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSerialToNetworkSetupModuleAdapter ()
    {
        if ( serialToNetworkSetupModuleItemProvider == null )
        {
            serialToNetworkSetupModuleItemProvider = new SerialToNetworkSetupModuleItemProvider ( this );
        }

        return serialToNetworkSetupModuleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.eclipse.scada.configuration.setup.common.SerialToNetworkMapping} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SerialToNetworkMappingItemProvider serialToNetworkMappingItemProvider;

    /**
     * This creates an adapter for a {@link org.eclipse.scada.configuration.setup.common.SerialToNetworkMapping}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSerialToNetworkMappingAdapter ()
    {
        if ( serialToNetworkMappingItemProvider == null )
        {
            serialToNetworkMappingItemProvider = new SerialToNetworkMappingItemProvider ( this );
        }

        return serialToNetworkMappingItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory ()
    {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory ();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParentAdapterFactory ( ComposedAdapterFactory parentAdapterFactory )
    {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType ( Object type )
    {
        return supportedTypes.contains ( type ) || super.isFactoryForType ( type );
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt ( Notifier notifier, Object type )
    {
        return super.adapt ( notifier, this );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt ( Object object, Object type )
    {
        if ( isFactoryForType ( type ) )
        {
            Object adapter = super.adapt ( object, type );
            if ( ! ( type instanceof Class<?> ) || ( ( (Class<?>)type ).isInstance ( adapter ) ) )
            {
                return adapter;
            }
        }

        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<IChildCreationExtender> getChildCreationExtenders ()
    {
        return childCreationExtenderManager.getChildCreationExtenders ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<?> getNewChildDescriptors ( Object object, EditingDomain editingDomain )
    {
        return childCreationExtenderManager.getNewChildDescriptors ( object, editingDomain );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator ()
    {
        return childCreationExtenderManager;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void addListener ( INotifyChangedListener notifyChangedListener )
    {
        changeNotifier.addListener ( notifyChangedListener );
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void removeListener ( INotifyChangedListener notifyChangedListener )
    {
        changeNotifier.removeListener ( notifyChangedListener );
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void fireNotifyChanged ( Notification notification )
    {
        changeNotifier.fireNotifyChanged ( notification );

        if ( parentAdapterFactory != null )
        {
            parentAdapterFactory.fireNotifyChanged ( notification );
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void dispose ()
    {
        if ( postgresSetupModuleItemProvider != null )
            postgresSetupModuleItemProvider.dispose ();
        if ( serialToNetworkSetupModuleItemProvider != null )
            serialToNetworkSetupModuleItemProvider.dispose ();
        if ( serialToNetworkMappingItemProvider != null )
            serialToNetworkMappingItemProvider.dispose ();
    }

    /**
     * A child creation extender for the {@link DeploymentPackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static class DeploymentChildCreationExtender implements IChildCreationExtender
    {
        /**
         * The switch for creating child descriptors specific to each extended class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static class CreationSwitch extends DeploymentSwitch<Object>
        {
            /**
             * The child descriptors being populated.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected List<Object> newChildDescriptors;

            /**
             * The domain in which to create the children.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected EditingDomain editingDomain;

            /**
             * Creates the a switch for populating child descriptors in the given domain.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            CreationSwitch ( List<Object> newChildDescriptors, EditingDomain editingDomain )
            {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }

            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseCommonDeploymentMechanism ( CommonDeploymentMechanism object )
            {
                newChildDescriptors.add ( createChildParameter ( DeploymentPackage.Literals.COMMON_DEPLOYMENT_MECHANISM__ADDITIONAL_SETUP_MODULES, CommonFactory.eINSTANCE.createPostgresSetupModule () ) );

                newChildDescriptors.add ( createChildParameter ( DeploymentPackage.Literals.COMMON_DEPLOYMENT_MECHANISM__ADDITIONAL_SETUP_MODULES, CommonFactory.eINSTANCE.createSerialToNetworkSetupModule () ) );

                return null;
            }

            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected CommandParameter createChildParameter ( Object feature, Object child )
            {
                return new CommandParameter ( null, feature, child );
            }

        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Collection<Object> getNewChildDescriptors ( Object object, EditingDomain editingDomain )
        {
            ArrayList<Object> result = new ArrayList<Object> ();
            new CreationSwitch ( result, editingDomain ).doSwitch ( (EObject)object );
            return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public ResourceLocator getResourceLocator ()
        {
            return CommonEditPlugin.INSTANCE;
        }
    }

    /**
     * A child creation extender for the {@link SetupPackage}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static class SetupChildCreationExtender implements IChildCreationExtender
    {
        /**
         * The switch for creating child descriptors specific to each extended class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected static class CreationSwitch extends SetupSwitch<Object>
        {
            /**
             * The child descriptors being populated.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected List<Object> newChildDescriptors;

            /**
             * The domain in which to create the children.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected EditingDomain editingDomain;

            /**
             * Creates the a switch for populating child descriptors in the given domain.
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            CreationSwitch ( List<Object> newChildDescriptors, EditingDomain editingDomain )
            {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }

            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            @Override
            public Object caseSetupModuleContainer ( SetupModuleContainer object )
            {
                newChildDescriptors.add ( createChildParameter ( SetupPackage.Literals.SETUP_MODULE_CONTAINER__MODULES, CommonFactory.eINSTANCE.createPostgresSetupModule () ) );

                newChildDescriptors.add ( createChildParameter ( SetupPackage.Literals.SETUP_MODULE_CONTAINER__MODULES, CommonFactory.eINSTANCE.createSerialToNetworkSetupModule () ) );

                return null;
            }

            /**
             * <!-- begin-user-doc -->
             * <!-- end-user-doc -->
             * @generated
             */
            protected CommandParameter createChildParameter ( Object feature, Object child )
            {
                return new CommandParameter ( null, feature, child );
            }

        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Collection<Object> getNewChildDescriptors ( Object object, EditingDomain editingDomain )
        {
            ArrayList<Object> result = new ArrayList<Object> ();
            new CreationSwitch ( result, editingDomain ).doSwitch ( (EObject)object );
            return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public ResourceLocator getResourceLocator ()
        {
            return CommonEditPlugin.INSTANCE;
        }
    }

}
