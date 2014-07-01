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
package org.eclipse.scada.configuration.item.impl;

import java.lang.reflect.InvocationTargetException;

import javax.script.ScriptContext;
import javax.script.SimpleScriptContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.scada.configuration.item.CustomizationRequest;
import org.eclipse.scada.configuration.item.ItemPackage;
import org.eclipse.scada.configuration.item.ScriptSelector;
import org.eclipse.scada.utils.script.ScriptExecutor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.eclipse.scada.configuration.item.impl.ScriptSelectorImpl#getCode
 * <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ScriptSelectorImpl extends MinimalEObjectImpl.Container implements ScriptSelector
{
    /**
     * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getCode()
     * @generated
     * @ordered
     */
    protected static final String CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getCode()
     * @generated
     * @ordered
     */
    protected String code = CODE_EDEFAULT;

    private ScriptExecutor executor;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ScriptSelectorImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return ItemPackage.Literals.SCRIPT_SELECTOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getCode ()
    {
        return this.code;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCode ( final String newCode )
    {
        final String oldCode = this.code;
        this.code = newCode;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, ItemPackage.SCRIPT_SELECTOR__CODE, oldCode, this.code ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getScriptEngine ()
    {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public Boolean selected ( final CustomizationRequest request )
    {
        try
        {
            if ( this.executor == null )
            {
                this.executor = new ScriptExecutor ( getScriptEngine (), this.code, ScriptCustomizationPipelineImpl.class.getClassLoader () );
            }

            final SimpleScriptContext ctx = new SimpleScriptContext ();
            ctx.setAttribute ( "request", request, ScriptContext.ENGINE_SCOPE );

            return (Boolean)this.executor.execute ( ctx );
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( e );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet ( final int featureID, final boolean resolve, final boolean coreType )
    {
        switch ( featureID )
        {
            case ItemPackage.SCRIPT_SELECTOR__CODE:
                return getCode ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet ( final int featureID, final Object newValue )
    {
        switch ( featureID )
        {
            case ItemPackage.SCRIPT_SELECTOR__CODE:
                setCode ( (String)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset ( final int featureID )
    {
        switch ( featureID )
        {
            case ItemPackage.SCRIPT_SELECTOR__CODE:
                setCode ( CODE_EDEFAULT );
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet ( final int featureID )
    {
        switch ( featureID )
        {
            case ItemPackage.SCRIPT_SELECTOR__CODE:
                return CODE_EDEFAULT == null ? this.code != null : !CODE_EDEFAULT.equals ( this.code );
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eInvoke ( final int operationID, final EList<?> arguments ) throws InvocationTargetException
    {
        switch ( operationID )
        {
            case ItemPackage.SCRIPT_SELECTOR___GET_SCRIPT_ENGINE:
                return getScriptEngine ();
            case ItemPackage.SCRIPT_SELECTOR___SELECTED__CUSTOMIZATIONREQUEST:
                return selected ( (CustomizationRequest)arguments.get ( 0 ) );
        }
        return super.eInvoke ( operationID, arguments );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
        {
            return super.toString ();
        }

        final StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (code: " ); //$NON-NLS-1$
        result.append ( this.code );
        result.append ( ')' );
        return result.toString ();
    }

} //ScriptSelectorImpl
