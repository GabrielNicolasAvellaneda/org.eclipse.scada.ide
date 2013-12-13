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
package org.eclipse.scada.configuration.component;

import org.eclipse.emf.common.util.EList;
import org.eclipse.scada.configuration.infrastructure.World;
import org.eclipse.scada.configuration.item.CustomizationPipeline;
import org.eclipse.scada.configuration.item.Selector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.component.ComponentWorld#getLevels <em>Levels</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.ComponentWorld#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.ComponentWorld#getServices <em>Services</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.ComponentWorld#getInfrastructure <em>Infrastructure</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.ComponentWorld#getDefaultCustomizationPipeline <em>Default Customization Pipeline</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.component.ComponentWorld#getDefaultArchiveSelector <em>Default Archive Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scada.configuration.component.ComponentPackage#getComponentWorld()
 * @model
 * @generated
 */
public interface ComponentWorld extends Container
{
    /**
     * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.scada.configuration.component.Level}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Levels</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Levels</em>' containment reference list.
     * @see org.eclipse.scada.configuration.component.ComponentPackage#getComponentWorld_Levels()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<Level> getLevels ();

    /**
     * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.scada.configuration.component.Configuration}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configurations</em>' containment reference
     * list isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configurations</em>' containment reference list.
     * @see org.eclipse.scada.configuration.component.ComponentPackage#getComponentWorld_Configurations()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<Configuration> getConfigurations ();

    /**
     * Returns the value of the '<em><b>Services</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.scada.configuration.component.Service}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Services</em>' containment reference list
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Services</em>' containment reference list.
     * @see org.eclipse.scada.configuration.component.ComponentPackage#getComponentWorld_Services()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
    EList<Service> getServices ();

    /**
     * Returns the value of the '<em><b>Infrastructure</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Infrastructure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Infrastructure</em>' reference.
     * @see #setInfrastructure(World)
     * @see org.eclipse.scada.configuration.component.ComponentPackage#getComponentWorld_Infrastructure()
     * @model required="true"
     * @generated
     */
    World getInfrastructure ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.component.ComponentWorld#getInfrastructure <em>Infrastructure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Infrastructure</em>' reference.
     * @see #getInfrastructure()
     * @generated
     */
    void setInfrastructure ( World value );

    /**
     * Returns the value of the '<em><b>Default Customization Pipeline</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Customization Pipeline</em>' reference
     * isn't clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Customization Pipeline</em>' reference.
     * @see #setDefaultCustomizationPipeline(CustomizationPipeline)
     * @see org.eclipse.scada.configuration.component.ComponentPackage#getComponentWorld_DefaultCustomizationPipeline()
     * @model
     * @generated
     */
    CustomizationPipeline getDefaultCustomizationPipeline ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.component.ComponentWorld#getDefaultCustomizationPipeline <em>Default Customization Pipeline</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Customization Pipeline</em>' reference.
     * @see #getDefaultCustomizationPipeline()
     * @generated
     */
    void setDefaultCustomizationPipeline ( CustomizationPipeline value );

    /**
     * Returns the value of the '<em><b>Default Archive Selector</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Archive Selector</em>' reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Archive Selector</em>' reference.
     * @see #setDefaultArchiveSelector(Selector)
     * @see org.eclipse.scada.configuration.component.ComponentPackage#getComponentWorld_DefaultArchiveSelector()
     * @model
     * @generated
     */
    Selector getDefaultArchiveSelector ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.component.ComponentWorld#getDefaultArchiveSelector <em>Default Archive Selector</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Archive Selector</em>' reference.
     * @see #getDefaultArchiveSelector()
     * @generated
     */
    void setDefaultArchiveSelector ( Selector value );

} // ComponentWorld
