/*******************************************************************************
 * Copyright (c) 2014 IBH SYSTEMS GmbH Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.ui.project.create;

import java.util.List;

/**
 * Describes a target profile for the configuration system
 */
public interface TargetPlatformProfile
{
    /**
     * Get a label for the user
     * 
     * @return the label to show
     */
    public String getLabel ();

    /**
     * Get a list of URIs to use for the target platform
     * 
     * @return a list of URIs to P2 repositories
     */
    public List<String> getRepositories ();
}
