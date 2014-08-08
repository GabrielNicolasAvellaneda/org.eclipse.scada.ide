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
package org.eclipse.scada.configuration.world;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Settings Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generic settings container. It can be use to host all kinds of settings in a dedicated resource (file) since the World itself has not container for settings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.world.GenericSettingsContainer#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scada.configuration.world.WorldPackage#getGenericSettingsContainer()
 * @model
 * @generated
 */
public interface GenericSettingsContainer extends EObject
{
    /**
     * Returns the value of the '<em><b>Settings</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Settings</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Settings</em>' reference.
     * @see #setSettings(Settings)
     * @see org.eclipse.scada.configuration.world.WorldPackage#getGenericSettingsContainer_Settings()
     * @model
     * @generated
     */
    Settings getSettings ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.world.GenericSettingsContainer#getSettings <em>Settings</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Settings</em>' reference.
     * @see #getSettings()
     * @generated
     */
    void setSettings ( Settings value );

} // GenericSettingsContainer
