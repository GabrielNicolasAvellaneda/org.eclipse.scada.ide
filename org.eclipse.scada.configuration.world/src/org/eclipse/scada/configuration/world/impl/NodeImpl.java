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
package org.eclipse.scada.configuration.world.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.scada.configuration.world.Endpoint;
import org.eclipse.scada.configuration.world.Node;
import org.eclipse.scada.configuration.world.WorldPackage;
import org.eclipse.scada.configuration.world.deployment.DeploymentMechanism;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.world.impl.NodeImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.world.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.world.impl.NodeImpl#getHostName <em>Host Name</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.world.impl.NodeImpl#getEndpoints <em>Endpoints</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.world.impl.NodeImpl#getDeployments <em>Deployments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeImpl extends MinimalEObjectImpl.Container implements
        Node
{
    /**
     * The default value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortDescription()
     * @generated
     * @ordered
     */
    protected static final String SHORT_DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortDescription()
     * @generated
     * @ordered
     */
    protected String shortDescription = SHORT_DESCRIPTION_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

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
     * The default value of the '{@link #getHostName() <em>Host Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHostName()
     * @generated
     * @ordered
     */
    protected static final String HOST_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHostName() <em>Host Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHostName()
     * @generated
     * @ordered
     */
    protected String hostName = HOST_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getEndpoints() <em>Endpoints</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndpoints()
     * @generated
     * @ordered
     */
    protected EList<Endpoint> endpoints;

    /**
     * The cached value of the '{@link #getDeployments() <em>Deployments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeployments()
     * @generated
     * @ordered
     */
    protected EList<DeploymentMechanism> deployments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NodeImpl ()
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
        return WorldPackage.Literals.NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getShortDescription ()
    {
        return shortDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShortDescription ( String newShortDescription )
    {
        String oldShortDescription = shortDescription;
        shortDescription = newShortDescription;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, WorldPackage.NODE__SHORT_DESCRIPTION, oldShortDescription, shortDescription ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName ()
    {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName ( String newName )
    {
        String oldName = name;
        name = newName;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, WorldPackage.NODE__NAME, oldName, name ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getHostName ()
    {
        return hostName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHostName ( String newHostName )
    {
        String oldHostName = hostName;
        hostName = newHostName;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, WorldPackage.NODE__HOST_NAME, oldHostName, hostName ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Endpoint> getEndpoints ()
    {
        if ( endpoints == null )
        {
            endpoints = new EObjectContainmentWithInverseEList.Resolving<Endpoint> ( Endpoint.class, this, WorldPackage.NODE__ENDPOINTS, WorldPackage.ENDPOINT__NODE );
        }
        return endpoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<DeploymentMechanism> getDeployments ()
    {
        if ( deployments == null )
        {
            deployments = new EObjectContainmentEList.Resolving<DeploymentMechanism> ( DeploymentMechanism.class, this, WorldPackage.NODE__DEPLOYMENTS );
        }
        return deployments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public NotificationChain eInverseAdd ( InternalEObject otherEnd,
            int featureID, NotificationChain msgs )
    {
        switch ( featureID )
        {
            case WorldPackage.NODE__ENDPOINTS:
                return ( (InternalEList<InternalEObject>)(InternalEList<?>)getEndpoints () ).basicAdd ( otherEnd, msgs );
        }
        return super.eInverseAdd ( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove ( InternalEObject otherEnd,
            int featureID, NotificationChain msgs )
    {
        switch ( featureID )
        {
            case WorldPackage.NODE__ENDPOINTS:
                return ( (InternalEList<?>)getEndpoints () ).basicRemove ( otherEnd, msgs );
            case WorldPackage.NODE__DEPLOYMENTS:
                return ( (InternalEList<?>)getDeployments () ).basicRemove ( otherEnd, msgs );
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
            case WorldPackage.NODE__SHORT_DESCRIPTION:
                return getShortDescription ();
            case WorldPackage.NODE__NAME:
                return getName ();
            case WorldPackage.NODE__HOST_NAME:
                return getHostName ();
            case WorldPackage.NODE__ENDPOINTS:
                return getEndpoints ();
            case WorldPackage.NODE__DEPLOYMENTS:
                return getDeployments ();
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
            case WorldPackage.NODE__SHORT_DESCRIPTION:
                setShortDescription ( (String)newValue );
                return;
            case WorldPackage.NODE__NAME:
                setName ( (String)newValue );
                return;
            case WorldPackage.NODE__HOST_NAME:
                setHostName ( (String)newValue );
                return;
            case WorldPackage.NODE__ENDPOINTS:
                getEndpoints ().clear ();
                getEndpoints ().addAll ( (Collection<? extends Endpoint>)newValue );
                return;
            case WorldPackage.NODE__DEPLOYMENTS:
                getDeployments ().clear ();
                getDeployments ().addAll ( (Collection<? extends DeploymentMechanism>)newValue );
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
            case WorldPackage.NODE__SHORT_DESCRIPTION:
                setShortDescription ( SHORT_DESCRIPTION_EDEFAULT );
                return;
            case WorldPackage.NODE__NAME:
                setName ( NAME_EDEFAULT );
                return;
            case WorldPackage.NODE__HOST_NAME:
                setHostName ( HOST_NAME_EDEFAULT );
                return;
            case WorldPackage.NODE__ENDPOINTS:
                getEndpoints ().clear ();
                return;
            case WorldPackage.NODE__DEPLOYMENTS:
                getDeployments ().clear ();
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
            case WorldPackage.NODE__SHORT_DESCRIPTION:
                return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null : !SHORT_DESCRIPTION_EDEFAULT.equals ( shortDescription );
            case WorldPackage.NODE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals ( name );
            case WorldPackage.NODE__HOST_NAME:
                return HOST_NAME_EDEFAULT == null ? hostName != null : !HOST_NAME_EDEFAULT.equals ( hostName );
            case WorldPackage.NODE__ENDPOINTS:
                return endpoints != null && !endpoints.isEmpty ();
            case WorldPackage.NODE__DEPLOYMENTS:
                return deployments != null && !deployments.isEmpty ();
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
        result.append ( " (shortDescription: " ); //$NON-NLS-1$
        result.append ( shortDescription );
        result.append ( ", name: " ); //$NON-NLS-1$
        result.append ( name );
        result.append ( ", hostName: " ); //$NON-NLS-1$
        result.append ( hostName );
        result.append ( ')' );
        return result.toString ();
    }

} //NodeImpl
