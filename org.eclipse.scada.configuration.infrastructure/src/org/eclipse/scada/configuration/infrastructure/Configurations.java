/**
 * Copyright (c) 2013 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 * 
 */
package org.eclipse.scada.configuration.infrastructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.infrastructure.Configurations#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scada.configuration.infrastructure.InfrastructurePackage#getConfigurations()
 * @model
 * @generated
 */
public interface Configurations extends EObject
{
    /**
     * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.scada.configuration.infrastructure.ApplicationConfiguration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configurations</em>' containment reference list.
     * @see org.eclipse.scada.configuration.infrastructure.InfrastructurePackage#getConfigurations_Configurations()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<ApplicationConfiguration> getConfigurations ();

} // Configurations