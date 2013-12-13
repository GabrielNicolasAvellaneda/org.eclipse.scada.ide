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
package org.eclipse.scada.configuration.component.generator.internal;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.scada.configuration.component.ConstantValue;
import org.eclipse.scada.configuration.component.DataMapperAnalyzer;
import org.eclipse.scada.configuration.component.DataMapperService;
import org.eclipse.scada.configuration.component.DriverConnectionAnalyzer;
import org.eclipse.scada.configuration.component.ExternalValue;
import org.eclipse.scada.configuration.component.MappedSourceValue;
import org.eclipse.scada.configuration.component.PersistentValue;
import org.eclipse.scada.configuration.component.generator.connection.DriverConnectionAnalyzerGenerator;
import org.eclipse.scada.configuration.component.generator.mapper.DataMapperAnalyzerGenerator;
import org.eclipse.scada.configuration.component.generator.mapper.DataMapperServiceGenerator;
import org.eclipse.scada.configuration.component.generator.mapper.MappedSourceValueGenerator;
import org.eclipse.scada.configuration.component.generator.simple.ConstantValueGenerator;
import org.eclipse.scada.configuration.component.generator.simple.ExternalValueGenerator;
import org.eclipse.scada.configuration.component.generator.simple.PersistentValueGenerator;
import org.eclipse.scada.configuration.generator.Generator;

public class AdapterFactory implements IAdapterFactory
{

    @SuppressWarnings ( "rawtypes" )
    @Override
    public Object getAdapter ( final Object adaptableObject, final Class adapterType )
    {
        if ( !Generator.class.equals ( adapterType ) )
        {
            return null;
        }
        if ( adaptableObject instanceof ConstantValue )
        {
            return new ConstantValueGenerator ( (ConstantValue)adaptableObject );
        }
        else if ( adaptableObject instanceof PersistentValue )
        {
            return new PersistentValueGenerator ( (PersistentValue)adaptableObject );
        }
        else if ( adaptableObject instanceof ExternalValue )
        {
            return new ExternalValueGenerator ( (ExternalValue)adaptableObject );
        }
        else if ( adaptableObject instanceof DriverConnectionAnalyzer )
        {
            return new DriverConnectionAnalyzerGenerator ( (DriverConnectionAnalyzer)adaptableObject );
        }
        else if ( adaptableObject instanceof DataMapperAnalyzer )
        {
            return new DataMapperAnalyzerGenerator ( (DataMapperAnalyzer)adaptableObject );
        }
        else if ( adaptableObject instanceof DataMapperService )
        {
            return new DataMapperServiceGenerator ( (DataMapperService)adaptableObject );
        }
        else if ( adaptableObject instanceof MappedSourceValue )
        {
            return new MappedSourceValueGenerator ( (MappedSourceValue)adaptableObject );
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