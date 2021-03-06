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
package org.eclipse.scada.configuration.infrastructure;

import org.eclipse.scada.configuration.world.Credentials;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.infrastructure.ExternalDriver#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.infrastructure.ExternalDriver#getAccessCredentials <em>Access Credentials</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.infrastructure.ExternalDriver#isBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scada.configuration.infrastructure.InfrastructurePackage#getExternalDriver()
 * @model
 * @generated
 */
public interface ExternalDriver extends Driver
{
    /**
     * Returns the value of the '<em><b>Port Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Port Number</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Port Number</em>' attribute.
     * @see #setPortNumber(int)
     * @see org.eclipse.scada.configuration.infrastructure.InfrastructurePackage#getExternalDriver_PortNumber()
     * @model required="true"
     * @generated
     */
    int getPortNumber ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.infrastructure.ExternalDriver#getPortNumber <em>Port Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Port Number</em>' attribute.
     * @see #getPortNumber()
     * @generated
     */
    void setPortNumber ( int value );

    /**
     * Returns the value of the '<em><b>Access Credentials</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Access Credentials</em>' containment reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Access Credentials</em>' containment reference.
     * @see #setAccessCredentials(Credentials)
     * @see org.eclipse.scada.configuration.infrastructure.InfrastructurePackage#getExternalDriver_AccessCredentials()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    Credentials getAccessCredentials ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.infrastructure.ExternalDriver#getAccessCredentials <em>Access Credentials</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Access Credentials</em>' containment reference.
     * @see #getAccessCredentials()
     * @generated
     */
    void setAccessCredentials ( Credentials value );

    /**
     * Returns the value of the '<em><b>Binding</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines wether the external driver instance will block the port by binding as a service.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Binding</em>' attribute.
     * @see #setBinding(boolean)
     * @see org.eclipse.scada.configuration.infrastructure.InfrastructurePackage#getExternalDriver_Binding()
     * @model default="true" required="true"
     * @generated
     */
    boolean isBinding ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.infrastructure.ExternalDriver#isBinding <em>Binding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Binding</em>' attribute.
     * @see #isBinding()
     * @generated
     */
    void setBinding ( boolean value );

} // ExternalDriver
