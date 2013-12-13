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
package org.eclipse.scada.configuration.component.presentation;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.scada.configuration.component.ComponentFactory;
import org.eclipse.scada.configuration.component.ExternalValue;
import org.eclipse.scada.da.ui.connection.data.Item;
import org.eclipse.scada.da.ui.connection.dnd.ItemTransfer;
import org.eclipse.swt.dnd.DropTargetEvent;

public class DropAdapterExtension extends EditingDomainViewerDropAdapter
{
    public DropAdapterExtension ( final EditingDomain domain, final Viewer viewer )
    {
        super ( domain, viewer );
    }

    @Override
    protected Collection<?> getDragSource ( final DropTargetEvent event )
    {
        // Check whether the current data type can be transfered locally.
        //
        final ItemTransfer itemTransfer = ItemTransfer.getInstance ();
        if ( itemTransfer.isSupportedType ( event.currentDataType ) )
        {
            // Motif kludge: we would get something random instead of null.
            //
            if ( IS_MOTIF )
            {
                return null;
            }

            // Transfer the data and, if non-null, extract it.
            //
            final Object object = itemTransfer.nativeToJava ( event.currentDataType );
            return object == null ? null : extractDragSource ( object );
        }
        else
        {
            return super.getDragSource ( event );
        }
    }

    @Override
    protected Collection<?> extractDragSource ( final Object object )
    {
        if ( object instanceof Item[] )
        {
            final Collection<ExternalValue> result = new LinkedList<> ();
            for ( final Item item : (Item[])object )
            {
                final ExternalValue v = ComponentFactory.eINSTANCE.createExternalValue ();
                v.setName ( item.getId () );
                v.setSourceName ( item.getId () );
                result.add ( v );
                // FIXME: ask for connection
                // FIXME: ask for master
            }
            return result;
        }
        else
        {
            return super.extractDragSource ( object );
        }
    }
}