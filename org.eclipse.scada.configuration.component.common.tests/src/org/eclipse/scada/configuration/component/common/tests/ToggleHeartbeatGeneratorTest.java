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
package org.eclipse.scada.configuration.component.common.tests;

import junit.textui.TestRunner;

import org.eclipse.scada.configuration.component.common.CommonFactory;
import org.eclipse.scada.configuration.component.common.ToggleHeartbeatGenerator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Toggle Heartbeat Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToggleHeartbeatGeneratorTest extends HeartbeatGeneratorTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( ToggleHeartbeatGeneratorTest.class );
    }

    /**
     * Constructs a new Toggle Heartbeat Generator test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ToggleHeartbeatGeneratorTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Toggle Heartbeat Generator test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ToggleHeartbeatGenerator getFixture ()
    {
        return (ToggleHeartbeatGenerator)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp () throws Exception
    {
        setFixture ( CommonFactory.eINSTANCE.createToggleHeartbeatGenerator () );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown () throws Exception
    {
        setFixture ( null );
    }

} //ToggleHeartbeatGeneratorTest
