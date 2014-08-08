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
package org.eclipse.scada.configuration.setup.common.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.scada.configuration.setup.common.CommonPackage;
import org.eclipse.scada.configuration.setup.common.PostgresSetupModule;
import org.eclipse.scada.configuration.setup.common.PostgresValidator;
import org.eclipse.scada.configuration.world.PostgresDatabaseSettings;
import org.eclipse.scada.configuration.world.setup.OperatingSystemDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postgres Setup Module</b></em>
 * '.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.setup.common.impl.PostgresSetupModuleImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.setup.common.impl.PostgresSetupModuleImpl#getPostgresUser <em>Postgres User</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.setup.common.impl.PostgresSetupModuleImpl#getHostBasedAccessFile <em>Host Based Access File</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.setup.common.impl.PostgresSetupModuleImpl#getConfigurationFile <em>Configuration File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostgresSetupModuleImpl extends MinimalEObjectImpl.Container implements PostgresSetupModule
{
    /**
     * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDatabase()
     * @generated
     * @ordered
     */
    protected PostgresDatabaseSettings database;

    /**
     * The default value of the '{@link #getPostgresUser() <em>Postgres User</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostgresUser()
     * @generated
     * @ordered
     */
    protected static final String POSTGRES_USER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPostgresUser() <em>Postgres User</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostgresUser()
     * @generated
     * @ordered
     */
    protected String postgresUser = POSTGRES_USER_EDEFAULT;

    /**
     * The default value of the '{@link #getHostBasedAccessFile() <em>Host Based Access File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHostBasedAccessFile()
     * @generated
     * @ordered
     */
    protected static final String HOST_BASED_ACCESS_FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHostBasedAccessFile() <em>Host Based Access File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHostBasedAccessFile()
     * @generated
     * @ordered
     */
    protected String hostBasedAccessFile = HOST_BASED_ACCESS_FILE_EDEFAULT;

    /**
     * The default value of the '{@link #getConfigurationFile() <em>Configuration File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurationFile()
     * @generated
     * @ordered
     */
    protected static final String CONFIGURATION_FILE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConfigurationFile() <em>Configuration File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurationFile()
     * @generated
     * @ordered
     */
    protected String configurationFile = CONFIGURATION_FILE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PostgresSetupModuleImpl ()
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
        return CommonPackage.Literals.POSTGRES_SETUP_MODULE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PostgresDatabaseSettings getDatabase ()
    {
        if ( database != null && database.eIsProxy () )
        {
            InternalEObject oldDatabase = (InternalEObject)database;
            database = (PostgresDatabaseSettings)eResolveProxy ( oldDatabase );
            if ( database != oldDatabase )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, CommonPackage.POSTGRES_SETUP_MODULE__DATABASE, oldDatabase, database ) );
            }
        }
        return database;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PostgresDatabaseSettings basicGetDatabase ()
    {
        return database;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDatabase ( PostgresDatabaseSettings newDatabase )
    {
        PostgresDatabaseSettings oldDatabase = database;
        database = newDatabase;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, CommonPackage.POSTGRES_SETUP_MODULE__DATABASE, oldDatabase, database ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPostgresUser ()
    {
        return postgresUser;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPostgresUser ( String newPostgresUser )
    {
        String oldPostgresUser = postgresUser;
        postgresUser = newPostgresUser;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, CommonPackage.POSTGRES_SETUP_MODULE__POSTGRES_USER, oldPostgresUser, postgresUser ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getHostBasedAccessFile ()
    {
        return hostBasedAccessFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHostBasedAccessFile ( String newHostBasedAccessFile )
    {
        String oldHostBasedAccessFile = hostBasedAccessFile;
        hostBasedAccessFile = newHostBasedAccessFile;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, CommonPackage.POSTGRES_SETUP_MODULE__HOST_BASED_ACCESS_FILE, oldHostBasedAccessFile, hostBasedAccessFile ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getConfigurationFile ()
    {
        return configurationFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConfigurationFile ( String newConfigurationFile )
    {
        String oldConfigurationFile = configurationFile;
        configurationFile = newConfigurationFile;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, CommonPackage.POSTGRES_SETUP_MODULE__CONFIGURATION_FILE, oldConfigurationFile, configurationFile ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public IStatus validateOperatingSystem ( final OperatingSystemDescriptor descriptor, final IValidationContext ctx )
    {
        return new PostgresValidator ( this, descriptor, ctx ).validate ();
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
            case CommonPackage.POSTGRES_SETUP_MODULE__DATABASE:
                if ( resolve )
                    return getDatabase ();
                return basicGetDatabase ();
            case CommonPackage.POSTGRES_SETUP_MODULE__POSTGRES_USER:
                return getPostgresUser ();
            case CommonPackage.POSTGRES_SETUP_MODULE__HOST_BASED_ACCESS_FILE:
                return getHostBasedAccessFile ();
            case CommonPackage.POSTGRES_SETUP_MODULE__CONFIGURATION_FILE:
                return getConfigurationFile ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case CommonPackage.POSTGRES_SETUP_MODULE__DATABASE:
                setDatabase ( (PostgresDatabaseSettings)newValue );
                return;
            case CommonPackage.POSTGRES_SETUP_MODULE__POSTGRES_USER:
                setPostgresUser ( (String)newValue );
                return;
            case CommonPackage.POSTGRES_SETUP_MODULE__HOST_BASED_ACCESS_FILE:
                setHostBasedAccessFile ( (String)newValue );
                return;
            case CommonPackage.POSTGRES_SETUP_MODULE__CONFIGURATION_FILE:
                setConfigurationFile ( (String)newValue );
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
            case CommonPackage.POSTGRES_SETUP_MODULE__DATABASE:
                setDatabase ( (PostgresDatabaseSettings)null );
                return;
            case CommonPackage.POSTGRES_SETUP_MODULE__POSTGRES_USER:
                setPostgresUser ( POSTGRES_USER_EDEFAULT );
                return;
            case CommonPackage.POSTGRES_SETUP_MODULE__HOST_BASED_ACCESS_FILE:
                setHostBasedAccessFile ( HOST_BASED_ACCESS_FILE_EDEFAULT );
                return;
            case CommonPackage.POSTGRES_SETUP_MODULE__CONFIGURATION_FILE:
                setConfigurationFile ( CONFIGURATION_FILE_EDEFAULT );
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
            case CommonPackage.POSTGRES_SETUP_MODULE__DATABASE:
                return database != null;
            case CommonPackage.POSTGRES_SETUP_MODULE__POSTGRES_USER:
                return POSTGRES_USER_EDEFAULT == null ? postgresUser != null : !POSTGRES_USER_EDEFAULT.equals ( postgresUser );
            case CommonPackage.POSTGRES_SETUP_MODULE__HOST_BASED_ACCESS_FILE:
                return HOST_BASED_ACCESS_FILE_EDEFAULT == null ? hostBasedAccessFile != null : !HOST_BASED_ACCESS_FILE_EDEFAULT.equals ( hostBasedAccessFile );
            case CommonPackage.POSTGRES_SETUP_MODULE__CONFIGURATION_FILE:
                return CONFIGURATION_FILE_EDEFAULT == null ? configurationFile != null : !CONFIGURATION_FILE_EDEFAULT.equals ( configurationFile );
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke ( int operationID, EList<?> arguments ) throws InvocationTargetException
    {
        switch ( operationID )
        {
            case CommonPackage.POSTGRES_SETUP_MODULE___VALIDATE_OPERATING_SYSTEM__OPERATINGSYSTEMDESCRIPTOR_IVALIDATIONCONTEXT:
                return validateOperatingSystem ( (OperatingSystemDescriptor)arguments.get ( 0 ), (IValidationContext)arguments.get ( 1 ) );
        }
        return super.eInvoke ( operationID, arguments );
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
        result.append ( " (postgresUser: " ); //$NON-NLS-1$
        result.append ( postgresUser );
        result.append ( ", hostBasedAccessFile: " ); //$NON-NLS-1$
        result.append ( hostBasedAccessFile );
        result.append ( ", configurationFile: " ); //$NON-NLS-1$
        result.append ( configurationFile );
        result.append ( ')' );
        return result.toString ();
    }

} //PostgresSetupModuleImpl
