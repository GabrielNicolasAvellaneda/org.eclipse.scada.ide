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
package org.eclipse.scada.configuration.component.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.scada.configuration.component.BufferedValue;
import org.eclipse.scada.configuration.component.ComponentPackage;
import org.eclipse.scada.configuration.component.InputDefinition;
import org.eclipse.scada.configuration.world.osgi.Persistence;
import org.eclipse.scada.core.Variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buffered Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.component.impl.BufferedValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.impl.BufferedValueImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.impl.BufferedValueImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.impl.BufferedValueImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.impl.BufferedValueImpl#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.impl.BufferedValueImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.impl.BufferedValueImpl#isTriggerOnly <em>Trigger Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BufferedValueImpl extends MasterComponentImpl implements BufferedValue
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
     * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected InputDefinition input;

    /**
     * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRange()
     * @generated
     * @ordered
     */
    protected static final long RANGE_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRange()
     * @generated
     * @ordered
     */
    protected long range = RANGE_EDEFAULT;

    /**
     * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialValue()
     * @generated
     * @ordered
     */
    protected static final Variant INITIAL_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialValue()
     * @generated
     * @ordered
     */
    protected Variant initialValue = INITIAL_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getPersistence() <em>Persistence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersistence()
     * @generated
     * @ordered
     */
    protected static final Persistence PERSISTENCE_EDEFAULT = Persistence.NONE;

    /**
     * The cached value of the '{@link #getPersistence() <em>Persistence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersistence()
     * @generated
     * @ordered
     */
    protected Persistence persistence = PERSISTENCE_EDEFAULT;

    /**
     * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrigger()
     * @generated
     * @ordered
     */
    protected static final long TRIGGER_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrigger()
     * @generated
     * @ordered
     */
    protected long trigger = TRIGGER_EDEFAULT;

    /**
     * The default value of the '{@link #isTriggerOnly() <em>Trigger Only</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTriggerOnly()
     * @generated
     * @ordered
     */
    protected static final boolean TRIGGER_ONLY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isTriggerOnly() <em>Trigger Only</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isTriggerOnly()
     * @generated
     * @ordered
     */
    protected boolean triggerOnly = TRIGGER_ONLY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BufferedValueImpl ()
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
        return ComponentPackage.Literals.BUFFERED_VALUE;
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
            eNotify ( new ENotificationImpl ( this, Notification.SET, ComponentPackage.BUFFERED_VALUE__NAME, oldName, name ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputDefinition getInput ()
    {
        if ( input != null && input.eIsProxy () )
        {
            InternalEObject oldInput = (InternalEObject)input;
            input = (InputDefinition)eResolveProxy ( oldInput );
            if ( input != oldInput )
            {
                InternalEObject newInput = (InternalEObject)input;
                NotificationChain msgs = oldInput.eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - ComponentPackage.BUFFERED_VALUE__INPUT, null, null );
                if ( newInput.eInternalContainer () == null )
                {
                    msgs = newInput.eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - ComponentPackage.BUFFERED_VALUE__INPUT, null, msgs );
                }
                if ( msgs != null )
                    msgs.dispatch ();
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, ComponentPackage.BUFFERED_VALUE__INPUT, oldInput, input ) );
            }
        }
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputDefinition basicGetInput ()
    {
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInput ( InputDefinition newInput, NotificationChain msgs )
    {
        InputDefinition oldInput = input;
        input = newInput;
        if ( eNotificationRequired () )
        {
            ENotificationImpl notification = new ENotificationImpl ( this, Notification.SET, ComponentPackage.BUFFERED_VALUE__INPUT, oldInput, newInput );
            if ( msgs == null )
                msgs = notification;
            else
                msgs.add ( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInput ( InputDefinition newInput )
    {
        if ( newInput != input )
        {
            NotificationChain msgs = null;
            if ( input != null )
                msgs = ( (InternalEObject)input ).eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - ComponentPackage.BUFFERED_VALUE__INPUT, null, msgs );
            if ( newInput != null )
                msgs = ( (InternalEObject)newInput ).eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - ComponentPackage.BUFFERED_VALUE__INPUT, null, msgs );
            msgs = basicSetInput ( newInput, msgs );
            if ( msgs != null )
                msgs.dispatch ();
        }
        else if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ComponentPackage.BUFFERED_VALUE__INPUT, newInput, newInput ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getRange ()
    {
        return range;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRange ( long newRange )
    {
        long oldRange = range;
        range = newRange;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ComponentPackage.BUFFERED_VALUE__RANGE, oldRange, range ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Variant getInitialValue ()
    {
        return initialValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialValue ( Variant newInitialValue )
    {
        Variant oldInitialValue = initialValue;
        initialValue = newInitialValue;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ComponentPackage.BUFFERED_VALUE__INITIAL_VALUE, oldInitialValue, initialValue ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Persistence getPersistence ()
    {
        return persistence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPersistence ( Persistence newPersistence )
    {
        Persistence oldPersistence = persistence;
        persistence = newPersistence == null ? PERSISTENCE_EDEFAULT : newPersistence;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ComponentPackage.BUFFERED_VALUE__PERSISTENCE, oldPersistence, persistence ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getTrigger ()
    {
        return trigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTrigger ( long newTrigger )
    {
        long oldTrigger = trigger;
        trigger = newTrigger;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ComponentPackage.BUFFERED_VALUE__TRIGGER, oldTrigger, trigger ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isTriggerOnly ()
    {
        return triggerOnly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTriggerOnly ( boolean newTriggerOnly )
    {
        boolean oldTriggerOnly = triggerOnly;
        triggerOnly = newTriggerOnly;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ComponentPackage.BUFFERED_VALUE__TRIGGER_ONLY, oldTriggerOnly, triggerOnly ) );
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
            case ComponentPackage.BUFFERED_VALUE__INPUT:
                return basicSetInput ( null, msgs );
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
            case ComponentPackage.BUFFERED_VALUE__NAME:
                return getName ();
            case ComponentPackage.BUFFERED_VALUE__INPUT:
                if ( resolve )
                    return getInput ();
                return basicGetInput ();
            case ComponentPackage.BUFFERED_VALUE__RANGE:
                return getRange ();
            case ComponentPackage.BUFFERED_VALUE__INITIAL_VALUE:
                return getInitialValue ();
            case ComponentPackage.BUFFERED_VALUE__PERSISTENCE:
                return getPersistence ();
            case ComponentPackage.BUFFERED_VALUE__TRIGGER:
                return getTrigger ();
            case ComponentPackage.BUFFERED_VALUE__TRIGGER_ONLY:
                return isTriggerOnly ();
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
            case ComponentPackage.BUFFERED_VALUE__NAME:
                setName ( (String)newValue );
                return;
            case ComponentPackage.BUFFERED_VALUE__INPUT:
                setInput ( (InputDefinition)newValue );
                return;
            case ComponentPackage.BUFFERED_VALUE__RANGE:
                setRange ( (Long)newValue );
                return;
            case ComponentPackage.BUFFERED_VALUE__INITIAL_VALUE:
                setInitialValue ( (Variant)newValue );
                return;
            case ComponentPackage.BUFFERED_VALUE__PERSISTENCE:
                setPersistence ( (Persistence)newValue );
                return;
            case ComponentPackage.BUFFERED_VALUE__TRIGGER:
                setTrigger ( (Long)newValue );
                return;
            case ComponentPackage.BUFFERED_VALUE__TRIGGER_ONLY:
                setTriggerOnly ( (Boolean)newValue );
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
            case ComponentPackage.BUFFERED_VALUE__NAME:
                setName ( NAME_EDEFAULT );
                return;
            case ComponentPackage.BUFFERED_VALUE__INPUT:
                setInput ( (InputDefinition)null );
                return;
            case ComponentPackage.BUFFERED_VALUE__RANGE:
                setRange ( RANGE_EDEFAULT );
                return;
            case ComponentPackage.BUFFERED_VALUE__INITIAL_VALUE:
                setInitialValue ( INITIAL_VALUE_EDEFAULT );
                return;
            case ComponentPackage.BUFFERED_VALUE__PERSISTENCE:
                setPersistence ( PERSISTENCE_EDEFAULT );
                return;
            case ComponentPackage.BUFFERED_VALUE__TRIGGER:
                setTrigger ( TRIGGER_EDEFAULT );
                return;
            case ComponentPackage.BUFFERED_VALUE__TRIGGER_ONLY:
                setTriggerOnly ( TRIGGER_ONLY_EDEFAULT );
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
            case ComponentPackage.BUFFERED_VALUE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals ( name );
            case ComponentPackage.BUFFERED_VALUE__INPUT:
                return input != null;
            case ComponentPackage.BUFFERED_VALUE__RANGE:
                return range != RANGE_EDEFAULT;
            case ComponentPackage.BUFFERED_VALUE__INITIAL_VALUE:
                return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals ( initialValue );
            case ComponentPackage.BUFFERED_VALUE__PERSISTENCE:
                return persistence != PERSISTENCE_EDEFAULT;
            case ComponentPackage.BUFFERED_VALUE__TRIGGER:
                return trigger != TRIGGER_EDEFAULT;
            case ComponentPackage.BUFFERED_VALUE__TRIGGER_ONLY:
                return triggerOnly != TRIGGER_ONLY_EDEFAULT;
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
        result.append ( ", range: " ); //$NON-NLS-1$
        result.append ( range );
        result.append ( ", initialValue: " ); //$NON-NLS-1$
        result.append ( initialValue );
        result.append ( ", persistence: " ); //$NON-NLS-1$
        result.append ( persistence );
        result.append ( ", trigger: " ); //$NON-NLS-1$
        result.append ( trigger );
        result.append ( ", triggerOnly: " ); //$NON-NLS-1$
        result.append ( triggerOnly );
        result.append ( ')' );
        return result.toString ();
    }

} //BufferedValueImpl
