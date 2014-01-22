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
package org.eclipse.scada.configuration.world.deployment.tests;

import junit.textui.TestRunner;

import org.eclipse.scada.configuration.world.deployment.DebianDeploymentMechanism;
import org.eclipse.scada.configuration.world.deployment.DeploymentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Debian Deployment Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DebianDeploymentMechanismTest extends
        CommonDeploymentMechanismTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( DebianDeploymentMechanismTest.class );
    }

    /**
     * Constructs a new Debian Deployment Mechanism test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DebianDeploymentMechanismTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Debian Deployment Mechanism test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected DebianDeploymentMechanism getFixture ()
    {
        return (DebianDeploymentMechanism)fixture;
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
        setFixture ( DeploymentFactory.eINSTANCE.createDebianDeploymentMechanism () );
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

} //DebianDeploymentMechanismTest
