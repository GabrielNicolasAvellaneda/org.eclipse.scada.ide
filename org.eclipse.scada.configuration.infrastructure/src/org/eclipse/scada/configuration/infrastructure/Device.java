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

import org.eclipse.scada.configuration.world.NamedDocumentable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.scada.configuration.infrastructure.Device#getNode <em>
 * Node</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.scada.configuration.infrastructure.InfrastructurePackage#getDevice()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Device extends NamedDocumentable
{
    /**
     * Returns the value of the '<em><b>Node</b></em>' container reference.
     * It is bidirectional and its opposite is '
     * {@link org.eclipse.scada.configuration.infrastructure.Node#getDevices
     * <em>Devices</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Node</em>' container reference.
     * @see #setNode(Node)
     * @see org.eclipse.scada.configuration.infrastructure.InfrastructurePackage#getDevice_Node()
     * @see org.eclipse.scada.configuration.infrastructure.Node#getDevices
     * @model opposite="devices" transient="false"
     * @generated
     */
    Node getNode ();

    /**
     * Sets the value of the '
     * {@link org.eclipse.scada.configuration.infrastructure.Device#getNode
     * <em>Node</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Node</em>' container reference.
     * @see #getNode()
     * @generated
     */
    void setNode ( Node value );

} // Device
