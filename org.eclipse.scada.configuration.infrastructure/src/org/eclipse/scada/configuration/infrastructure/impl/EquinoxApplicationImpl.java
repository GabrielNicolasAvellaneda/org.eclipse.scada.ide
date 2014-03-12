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
package org.eclipse.scada.configuration.infrastructure.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.scada.configuration.infrastructure.ApplicationConfiguration;
import org.eclipse.scada.configuration.infrastructure.EquinoxApplication;
import org.eclipse.scada.configuration.infrastructure.InfrastructurePackage;
import org.eclipse.scada.configuration.world.Credentials;
import org.eclipse.scada.configuration.world.osgi.IndependentConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equinox Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.infrastructure.impl.EquinoxApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.infrastructure.impl.EquinoxApplicationImpl#getInstanceNumber <em>Instance Number</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.infrastructure.impl.EquinoxApplicationImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.infrastructure.impl.EquinoxApplicationImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.infrastructure.impl.EquinoxApplicationImpl#getLocalCredentials <em>Local Credentials</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EquinoxApplicationImpl extends MinimalEObjectImpl.Container implements EquinoxApplication
{
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getInstanceNumber() <em>Instance Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstanceNumber()
     * @generated
     * @ordered
     */
    protected static final int INSTANCE_NUMBER_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getInstanceNumber() <em>Instance Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInstanceNumber()
     * @generated
     * @ordered
     */
    protected int instanceNumber = INSTANCE_NUMBER_EDEFAULT;

    /**
     * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurations()
     * @generated
     * @ordered
     */
    protected EList<IndependentConfiguration> configurations;

    /**
     * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfiguration()
     * @generated
     * @ordered
     */
    protected ApplicationConfiguration configuration;

    /**
     * The cached value of the '{@link #getLocalCredentials() <em>Local Credentials</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalCredentials()
     * @generated
     * @ordered
     */
    protected Credentials localCredentials;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EquinoxApplicationImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return InfrastructurePackage.Literals.EQUINOX_APPLICATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName ()
    {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName ( String newName )
    {
        String oldName = name;
        name = newName;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, InfrastructurePackage.EQUINOX_APPLICATION__NAME, oldName, name ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getInstanceNumber ()
    {
        return instanceNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstanceNumber ( int newInstanceNumber )
    {
        int oldInstanceNumber = instanceNumber;
        instanceNumber = newInstanceNumber;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, InfrastructurePackage.EQUINOX_APPLICATION__INSTANCE_NUMBER, oldInstanceNumber, instanceNumber ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IndependentConfiguration> getConfigurations ()
    {
        if ( configurations == null )
        {
            configurations = new EObjectContainmentEList.Resolving<IndependentConfiguration> ( IndependentConfiguration.class, this, InfrastructurePackage.EQUINOX_APPLICATION__CONFIGURATIONS );
        }
        return configurations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationConfiguration getConfiguration ()
    {
        if ( configuration != null && configuration.eIsProxy () )
        {
            InternalEObject oldConfiguration = (InternalEObject)configuration;
            configuration = (ApplicationConfiguration)eResolveProxy ( oldConfiguration );
            if ( configuration != oldConfiguration )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, InfrastructurePackage.EQUINOX_APPLICATION__CONFIGURATION, oldConfiguration, configuration ) );
            }
        }
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationConfiguration basicGetConfiguration ()
    {
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConfiguration ( ApplicationConfiguration newConfiguration )
    {
        ApplicationConfiguration oldConfiguration = configuration;
        configuration = newConfiguration;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, InfrastructurePackage.EQUINOX_APPLICATION__CONFIGURATION, oldConfiguration, configuration ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Credentials getLocalCredentials ()
    {
        if ( localCredentials != null && localCredentials.eIsProxy () )
        {
            InternalEObject oldLocalCredentials = (InternalEObject)localCredentials;
            localCredentials = (Credentials)eResolveProxy ( oldLocalCredentials );
            if ( localCredentials != oldLocalCredentials )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, InfrastructurePackage.EQUINOX_APPLICATION__LOCAL_CREDENTIALS, oldLocalCredentials, localCredentials ) );
            }
        }
        return localCredentials;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Credentials basicGetLocalCredentials ()
    {
        return localCredentials;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalCredentials ( Credentials newLocalCredentials )
    {
        Credentials oldLocalCredentials = localCredentials;
        localCredentials = newLocalCredentials;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, InfrastructurePackage.EQUINOX_APPLICATION__LOCAL_CREDENTIALS, oldLocalCredentials, localCredentials ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove ( InternalEObject otherEnd, int featureID, NotificationChain msgs )
    {
        switch ( featureID )
        {
            case InfrastructurePackage.EQUINOX_APPLICATION__CONFIGURATIONS:
                return ( (InternalEList<?>)getConfigurations () ).basicRemove ( otherEnd, msgs );
        }
        return super.eInverseRemove ( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet ( int featureID, boolean resolve, boolean coreType )
    {
        switch ( featureID )
        {
            case InfrastructurePackage.EQUINOX_APPLICATION__NAME:
                return getName ();
            case InfrastructurePackage.EQUINOX_APPLICATION__INSTANCE_NUMBER:
                return getInstanceNumber ();
            case InfrastructurePackage.EQUINOX_APPLICATION__CONFIGURATIONS:
                return getConfigurations ();
            case InfrastructurePackage.EQUINOX_APPLICATION__CONFIGURATION:
                if ( resolve )
                    return getConfiguration ();
                return basicGetConfiguration ();
            case InfrastructurePackage.EQUINOX_APPLICATION__LOCAL_CREDENTIALS:
                if ( resolve )
                    return getLocalCredentials ();
                return basicGetLocalCredentials ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case InfrastructurePackage.EQUINOX_APPLICATION__NAME:
                setName ( (String)newValue );
                return;
            case InfrastructurePackage.EQUINOX_APPLICATION__INSTANCE_NUMBER:
                setInstanceNumber ( (Integer)newValue );
                return;
            case InfrastructurePackage.EQUINOX_APPLICATION__CONFIGURATIONS:
                getConfigurations ().clear ();
                getConfigurations ().addAll ( (Collection<? extends IndependentConfiguration>)newValue );
                return;
            case InfrastructurePackage.EQUINOX_APPLICATION__CONFIGURATION:
                setConfiguration ( (ApplicationConfiguration)newValue );
                return;
            case InfrastructurePackage.EQUINOX_APPLICATION__LOCAL_CREDENTIALS:
                setLocalCredentials ( (Credentials)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset ( int featureID )
    {
        switch ( featureID )
        {
            case InfrastructurePackage.EQUINOX_APPLICATION__NAME:
                setName ( NAME_EDEFAULT );
                return;
            case InfrastructurePackage.EQUINOX_APPLICATION__INSTANCE_NUMBER:
                setInstanceNumber ( INSTANCE_NUMBER_EDEFAULT );
                return;
            case InfrastructurePackage.EQUINOX_APPLICATION__CONFIGURATIONS:
                getConfigurations ().clear ();
                return;
            case InfrastructurePackage.EQUINOX_APPLICATION__CONFIGURATION:
                setConfiguration ( (ApplicationConfiguration)null );
                return;
            case InfrastructurePackage.EQUINOX_APPLICATION__LOCAL_CREDENTIALS:
                setLocalCredentials ( (Credentials)null );
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet ( int featureID )
    {
        switch ( featureID )
        {
            case InfrastructurePackage.EQUINOX_APPLICATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals ( name );
            case InfrastructurePackage.EQUINOX_APPLICATION__INSTANCE_NUMBER:
                return instanceNumber != INSTANCE_NUMBER_EDEFAULT;
            case InfrastructurePackage.EQUINOX_APPLICATION__CONFIGURATIONS:
                return configurations != null && !configurations.isEmpty ();
            case InfrastructurePackage.EQUINOX_APPLICATION__CONFIGURATION:
                return configuration != null;
            case InfrastructurePackage.EQUINOX_APPLICATION__LOCAL_CREDENTIALS:
                return localCredentials != null;
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
            return super.toString ();

        StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (name: " ); //$NON-NLS-1$
        result.append ( name );
        result.append ( ", instanceNumber: " ); //$NON-NLS-1$
        result.append ( instanceNumber );
        result.append ( ')' );
        return result.toString ();
    }

} //EquinoxApplicationImpl
