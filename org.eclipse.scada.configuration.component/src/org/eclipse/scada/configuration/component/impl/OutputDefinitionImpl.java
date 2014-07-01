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
package org.eclipse.scada.configuration.component.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.scada.configuration.component.ComponentPackage;
import org.eclipse.scada.configuration.component.DanglingItemReference;
import org.eclipse.scada.configuration.component.OutputDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.component.impl.OutputDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.impl.OutputDefinitionImpl#getLocalTag <em>Local Tag</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.impl.OutputDefinitionImpl#getCustomizationTags <em>Customization Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputDefinitionImpl extends MinimalEObjectImpl.Container implements OutputDefinition
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
     * The cached value of the '{@link #getLocalTag() <em>Local Tag</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalTag()
     * @generated
     * @ordered
     */
    protected EList<String> localTag;

    /**
     * The cached value of the '{@link #getCustomizationTags() <em>Customization Tags</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomizationTags()
     * @generated
     * @ordered
     */
    protected EList<String> customizationTags;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutputDefinitionImpl ()
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
        return ComponentPackage.Literals.OUTPUT_DEFINITION;
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
            eNotify ( new ENotificationImpl ( this, Notification.SET, ComponentPackage.OUTPUT_DEFINITION__NAME, oldName, name ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getLocalTag ()
    {
        if ( localTag == null )
        {
            localTag = new EDataTypeUniqueEList<String> ( String.class, this, ComponentPackage.OUTPUT_DEFINITION__LOCAL_TAG );
        }
        return localTag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getCustomizationTags ()
    {
        if ( customizationTags == null )
        {
            customizationTags = new EDataTypeUniqueEList<String> ( String.class, this, ComponentPackage.OUTPUT_DEFINITION__CUSTOMIZATION_TAGS );
        }
        return customizationTags;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DanglingItemReference createReference ()
    {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException ();
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
            case ComponentPackage.OUTPUT_DEFINITION__NAME:
                return getName ();
            case ComponentPackage.OUTPUT_DEFINITION__LOCAL_TAG:
                return getLocalTag ();
            case ComponentPackage.OUTPUT_DEFINITION__CUSTOMIZATION_TAGS:
                return getCustomizationTags ();
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
            case ComponentPackage.OUTPUT_DEFINITION__NAME:
                setName ( (String)newValue );
                return;
            case ComponentPackage.OUTPUT_DEFINITION__LOCAL_TAG:
                getLocalTag ().clear ();
                getLocalTag ().addAll ( (Collection<? extends String>)newValue );
                return;
            case ComponentPackage.OUTPUT_DEFINITION__CUSTOMIZATION_TAGS:
                getCustomizationTags ().clear ();
                getCustomizationTags ().addAll ( (Collection<? extends String>)newValue );
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
            case ComponentPackage.OUTPUT_DEFINITION__NAME:
                setName ( NAME_EDEFAULT );
                return;
            case ComponentPackage.OUTPUT_DEFINITION__LOCAL_TAG:
                getLocalTag ().clear ();
                return;
            case ComponentPackage.OUTPUT_DEFINITION__CUSTOMIZATION_TAGS:
                getCustomizationTags ().clear ();
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
            case ComponentPackage.OUTPUT_DEFINITION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals ( name );
            case ComponentPackage.OUTPUT_DEFINITION__LOCAL_TAG:
                return localTag != null && !localTag.isEmpty ();
            case ComponentPackage.OUTPUT_DEFINITION__CUSTOMIZATION_TAGS:
                return customizationTags != null && !customizationTags.isEmpty ();
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
            case ComponentPackage.OUTPUT_DEFINITION___CREATE_REFERENCE:
                return createReference ();
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
        result.append ( " (name: " ); //$NON-NLS-1$
        result.append ( name );
        result.append ( ", localTag: " ); //$NON-NLS-1$
        result.append ( localTag );
        result.append ( ", customizationTags: " ); //$NON-NLS-1$
        result.append ( customizationTags );
        result.append ( ')' );
        return result.toString ();
    }

} //OutputDefinitionImpl
