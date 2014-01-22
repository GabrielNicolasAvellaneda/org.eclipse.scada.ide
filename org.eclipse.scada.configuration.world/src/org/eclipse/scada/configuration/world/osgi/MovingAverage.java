/*******************************************************************************
 * Copyright (c) 2013, 2014 IBH SYSTEMS GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.world.osgi;

import org.eclipse.scada.configuration.world.NamedDocumentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moving Average</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.scada.configuration.world.osgi.MovingAverage#getItem
 * <em>Item</em>}</li>
 * <li>{@link org.eclipse.scada.configuration.world.osgi.MovingAverage#getRange
 * <em>Range</em>}</li>
 * <li>
 * {@link org.eclipse.scada.configuration.world.osgi.MovingAverage#getNullRange
 * <em>Null Range</em>}</li>
 * <li>
 * {@link org.eclipse.scada.configuration.world.osgi.MovingAverage#getTrigger
 * <em>Trigger</em>}</li>
 * <li>
 * {@link org.eclipse.scada.configuration.world.osgi.MovingAverage#getTriggerOnly
 * <em>Trigger Only</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getMovingAverage()
 * @model
 * @generated
 */
public interface MovingAverage extends NamedDocumentable
{
    /**
     * Returns the value of the '<em><b>Item</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Item</em>' reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Item</em>' reference.
     * @see #setItem(Item)
     * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getMovingAverage_Item()
     * @model required="true"
     * @generated
     */
    Item getItem ();

    /**
     * Sets the value of the '
     * {@link org.eclipse.scada.configuration.world.osgi.MovingAverage#getItem
     * <em>Item</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Item</em>' reference.
     * @see #getItem()
     * @generated
     */
    void setItem ( Item value );

    /**
     * Returns the value of the '<em><b>Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of seconds the average will be calculated for.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Range</em>' attribute.
     * @see #setRange(long)
     * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getMovingAverage_Range()
     * @model required="true"
     * @generated
     */
    long getRange ();

    /**
     * Sets the value of the '
     * {@link org.eclipse.scada.configuration.world.osgi.MovingAverage#getRange
     * <em>Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Range</em>' attribute.
     * @see #getRange()
     * @generated
     */
    void setRange ( long value );

    /**
     * Returns the value of the '<em><b>Null Range</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The number of seconds the average must have recorded valid data in order
     * to provide a valid (non-error) value.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Null Range</em>' attribute.
     * @see #setNullRange(long)
     * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getMovingAverage_NullRange()
     * @model required="true"
     * @generated
     */
    long getNullRange ();

    /**
     * Sets the value of the '
     * {@link org.eclipse.scada.configuration.world.osgi.MovingAverage#getNullRange
     * <em>Null Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Null Range</em>' attribute.
     * @see #getNullRange()
     * @generated
     */
    void setNullRange ( long value );

    /**
     * Returns the value of the '<em><b>Trigger</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A period time in seconds when the average will be updated although no
     * value has changed.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Trigger</em>' attribute.
     * @see #setTrigger(long)
     * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getMovingAverage_Trigger()
     * @model default="1" required="true"
     * @generated
     */
    long getTrigger ();

    /**
     * Sets the value of the '
     * {@link org.eclipse.scada.configuration.world.osgi.MovingAverage#getTrigger
     * <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Trigger</em>' attribute.
     * @see #getTrigger()
     * @generated
     */
    void setTrigger ( long value );

    /**
     * Returns the value of the '<em><b>Trigger Only</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A flag which decides if the average is only updated by time (true) or
     * also by value change (false).
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Trigger Only</em>' attribute.
     * @see #setTriggerOnly(Boolean)
     * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getMovingAverage_TriggerOnly()
     * @model default="false"
     * @generated
     */
    Boolean getTriggerOnly ();

    /**
     * Sets the value of the '
     * {@link org.eclipse.scada.configuration.world.osgi.MovingAverage#getTriggerOnly
     * <em>Trigger Only</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Trigger Only</em>' attribute.
     * @see #getTriggerOnly()
     * @generated
     */
    void setTriggerOnly ( Boolean value );

} // MovingAverage
