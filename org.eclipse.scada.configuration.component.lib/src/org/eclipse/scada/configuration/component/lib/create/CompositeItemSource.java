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
package org.eclipse.scada.configuration.component.lib.create;

import java.util.Set;

public class CompositeItemSource implements ItemSource
{

    private final Set<ItemSource> sources;

    public CompositeItemSource ( final Set<ItemSource> sources )
    {
        this.sources = sources;
    }

    @Override
    public void createItems ( final ItemCreator creator )
    {
        for ( final ItemSource source : this.sources )
        {
            source.createItems ( creator );
        }
    }

}
