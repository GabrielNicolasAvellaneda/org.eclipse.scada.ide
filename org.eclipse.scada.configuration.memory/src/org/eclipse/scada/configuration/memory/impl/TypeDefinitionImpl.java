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
package org.eclipse.scada.configuration.memory.impl;

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
import org.eclipse.scada.configuration.memory.MemoryPackage;
import org.eclipse.scada.configuration.memory.TypeDefinition;
import org.eclipse.scada.configuration.memory.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.memory.impl.TypeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.memory.impl.TypeDefinitionImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDefinitionImpl extends MinimalEObjectImpl.Container implements TypeDefinition
{
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
     * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariables()
     * @generated
     * @ordered
     */
    protected EList<Variable> variables;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeDefinitionImpl ()
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
        return MemoryPackage.Literals.TYPE_DEFINITION;
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
            eNotify ( new ENotificationImpl ( this, Notification.SET, MemoryPackage.TYPE_DEFINITION__NAME, oldName, name ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Variable> getVariables ()
    {
        if ( variables == null )
        {
            variables = new EObjectContainmentEList.Resolving<Variable> ( Variable.class, this, MemoryPackage.TYPE_DEFINITION__VARIABLES );
        }
        return variables;
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
            case MemoryPackage.TYPE_DEFINITION__VARIABLES:
                return ( (InternalEList<?>)getVariables () ).basicRemove ( otherEnd, msgs );
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
            case MemoryPackage.TYPE_DEFINITION__NAME:
                return getName ();
            case MemoryPackage.TYPE_DEFINITION__VARIABLES:
                return getVariables ();
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
            case MemoryPackage.TYPE_DEFINITION__NAME:
                setName ( (String)newValue );
                return;
            case MemoryPackage.TYPE_DEFINITION__VARIABLES:
                getVariables ().clear ();
                getVariables ().addAll ( (Collection<? extends Variable>)newValue );
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
            case MemoryPackage.TYPE_DEFINITION__NAME:
                setName ( NAME_EDEFAULT );
                return;
            case MemoryPackage.TYPE_DEFINITION__VARIABLES:
                getVariables ().clear ();
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
            case MemoryPackage.TYPE_DEFINITION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals ( name );
            case MemoryPackage.TYPE_DEFINITION__VARIABLES:
                return variables != null && !variables.isEmpty ();
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
        result.append ( ')' );
        return result.toString ();
    }

} //TypeDefinitionImpl
