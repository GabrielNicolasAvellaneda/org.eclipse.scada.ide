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
package org.eclipse.scada.configuration.component.common.lib;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.scada.configuration.component.common.ChangeHeartbeatDetector;
import org.eclipse.scada.configuration.component.common.CurrentTimeComponent;
import org.eclipse.scada.configuration.component.common.ScaledValue;
import org.eclipse.scada.configuration.component.common.TimerAction;
import org.eclipse.scada.configuration.component.common.ToggleHeartbeatGenerator;
import org.eclipse.scada.configuration.generator.Generator;

public class AdapterFactory implements IAdapterFactory
{

    @SuppressWarnings ( "rawtypes" )
    @Override
    public Generator getAdapter ( final Object adaptableObject, final Class adapterType )
    {
        if ( !Generator.class.equals ( adapterType ) )
        {
            return null;
        }

        if ( adaptableObject instanceof ToggleHeartbeatGenerator )
        {
            return new ToggleHeartbeatGeneratorGenerator ( (ToggleHeartbeatGenerator)adaptableObject );
        }
        else if ( adaptableObject instanceof ChangeHeartbeatDetector )
        {
            return new ChangeHeartbeatDetectorGenerator ( (ChangeHeartbeatDetector)adaptableObject );
        }
        else if ( adaptableObject instanceof TimerAction )
        {
            return new TimerActionGenerator ( (TimerAction)adaptableObject );
        }
        else if ( adaptableObject instanceof CurrentTimeComponent )
        {
            return new CurrentTimeGenerator ( (CurrentTimeComponent)adaptableObject );
        }
        else if ( adaptableObject instanceof ScaledValue )
        {
            return new ScaledValueGeneratorGenerator ( (ScaledValue)adaptableObject );
        }
        return null;
    }

    @SuppressWarnings ( "rawtypes" )
    @Override
    public Class[] getAdapterList ()
    {
        return new Class<?>[] { Generator.class };
    }

}
