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
package org.eclipse.scada.configuration.world.osgi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jdbc User Service Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.world.osgi.JdbcUserServiceModule#getUserServices <em>User Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getJdbcUserServiceModule()
 * @model
 * @generated
 */
public interface JdbcUserServiceModule extends ApplicationModule
{
    /**
     * Returns the value of the '<em><b>User Services</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.scada.configuration.world.osgi.JdbcUserService}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Services</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>User Services</em>' containment reference list.
     * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getJdbcUserServiceModule_UserServices()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<JdbcUserService> getUserServices ();

} // JdbcUserServiceModule
