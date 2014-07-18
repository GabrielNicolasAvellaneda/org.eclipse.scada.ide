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
package org.eclipse.scada.configuration.ui.project.template;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelFactory;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.ui.templates.PluginReference;
import org.eclipse.scada.configuration.ui.project.Activator;
import org.eclipse.scada.configuration.ui.project.IHelpContextIds;
import org.eclipse.scada.ui.utils.status.StatusHelper;

public class ConnectionContextTemplate extends BaseTemplate
{

    private static final String OPT_HOSTNAME = "hostname"; //$NON-NLS-1$

    private final Map<String, Integer> interfaceMap = new HashMap<String, Integer> ();

    private final Set<String> privileges = new HashSet<> ();

    public ConnectionContextTemplate ()
    {
        this.interfaceMap.put ( "da", 2101 ); //$NON-NLS-1$
        this.interfaceMap.put ( "ae", 2201 ); //$NON-NLS-1$
        this.interfaceMap.put ( "hd", 2302 ); //$NON-NLS-1$

        this.privileges.addAll ( Arrays.asList ( "operator", "admin", "developer" ) );

        setPageCount ( 1 );
        createOptions ();
    }

    private void createOptions ()
    {
        addOption ( OPT_HOSTNAME, "Hostname", "scada.eclipse.org", 0 ); //$NON-NLS-2$
    }

    @Override
    public void addPages ( final Wizard wizard )
    {
        final WizardPage page = createPage ( 0, IHelpContextIds.TEMPLATE_CONNECTION );
        page.setTitle ( "Connection" );
        page.setDescription ( "Connection options" );
        wizard.addPage ( page );
        markPagesAdded ();
    }

    @Override
    public String getUsedExtensionPoint ()
    {
        return "org.eclipse.scada.core.ui.connection.login.context"; //$NON-NLS-1$
    }

    @Override
    public String[] getNewFiles ()
    {
        return new String[] {};
    }

    @Override
    public String getSectionId ()
    {
        return "connections"; //$NON-NLS-1$
    }

    @Override
    protected void fillDependencies ( final Collection<IPluginReference> dependencies, final String schemaVersion )
    {
        dependencies.add ( new PluginReference ( "org.eclipse.scada.core.ui.connection.login", "0.1.0", 0 ) ); //$NON-NLS-1$  //$NON-NLS-2$
        dependencies.add ( new PluginReference ( "org.eclipse.scada.ae.ui.connection.creator.ngp", "0.1.0", 0 ) ); //$NON-NLS-1$  //$NON-NLS-2$
        dependencies.add ( new PluginReference ( "org.eclipse.scada.da.ui.connection.creator.ngp", "0.1.0", 0 ) ); //$NON-NLS-1$  //$NON-NLS-2$
        dependencies.add ( new PluginReference ( "org.eclipse.scada.hd.ui.connection.creator.ngp", "0.1.0", 0 ) ); //$NON-NLS-1$  //$NON-NLS-2$
        dependencies.add ( new PluginReference ( "org.eclipse.scada.ca.ui.connection.creator.ngp", "0.1.0", 0 ) ); //$NON-NLS-1$  //$NON-NLS-2$
    }

    @Override
    protected void updateModel ( final IProgressMonitor monitor ) throws CoreException
    {
        final IPluginModelFactory factory = this.model.getPluginFactory ();

        createConnections ( factory );
    }

    protected void createConnections ( final IPluginModelFactory factory ) throws CoreException
    {
        final IPluginExtension ext = factory.createExtension ();
        this.model.getPluginBase ().add ( ext );
        ext.setPoint ( "org.eclipse.scada.core.ui.connection.login.context" ); //$NON-NLS-1$

        final IPluginElement context = addElement ( factory, ext, "context", makeId ( getHostname () ) ); //$NON-NLS-1$
        context.setAttribute ( "label", getContextLabel () ); //$NON-NLS-1$

        final IPluginElement fac = addElement ( factory, context, "factory", null ); //$NON-NLS-1$
        fac.setAttribute ( "class", "org.eclipse.scada.core.ui.connection.login.factory.ConnectionLoginFactory" );

        createConnection ( factory, context, "da", "NORMAL" ); //$NON-NLS-1$
        createConnection ( factory, context, "ae", "NORMAL" ); //$NON-NLS-1$
        createConnection ( factory, context, "hd", "OPTIONAL" ); //$NON-NLS-1$
    }

    private void createConnection ( final IPluginModelFactory factory, final IPluginElement context, final String tag, final String type ) throws CoreException
    {
        final IPluginElement con = addElement ( factory, context, "connection", null );

        con.setAttribute ( "authUseCallbacks", "true" ); //$NON-NLS-1$
        con.setAttribute ( "autoReconnectDelay", "10000" ); //$NON-NLS-1$
        con.setAttribute ( "mode", type ); //$NON-NLS-1$
        try
        {
            con.setAttribute ( "uri", makeUri ( tag ) ); //$NON-NLS-1$
        }
        catch ( final UnsupportedEncodingException e )
        {
            throw new CoreException ( StatusHelper.convertStatus ( Activator.PLUGIN_ID, e ) );
        }

        final IPluginElement reg = addElement ( factory, con, "registration", null ); //$NON-NLS-1$
        reg.setAttribute ( "servicePid", makeConnectionId ( tag ) ); //$NON-NLS-1$
    }

    private String makeUri ( final String tag ) throws UnsupportedEncodingException
    {
        final String suffix;
        if ( "da".equals ( tag ) ) //$NON-NLS-1$
        {
            final StringBuilder sb = new StringBuilder ( "?" ); //$NON-NLS-1$

            int i = 0;
            for ( final String priv : this.privileges )
            {
                if ( i > 0 )
                {
                    sb.append ( "&" ); //$NON-NLS-1$
                }
                sb.append ( String.format ( "session.privilege.%s=true", URLEncoder.encode ( priv, "UTF-8" ) ) ); //$NON-NLS-1$  //$NON-NLS-2$
                i++;
            }

            suffix = sb.toString ();
        }
        else
        {
            suffix = ""; //$NON-NLS-1$
        }
        return String.format ( "%s:ngp://%s:%d%s", tag, getHostname (), this.interfaceMap.get ( tag ), suffix ); //$NON-NLS-1$
    }

    private String getHostname ()
    {
        return getStringOption ( OPT_HOSTNAME );
    }

    private String getContextLabel ()
    {
        return String.format ( "Sample Context (%s)", getHostname () );
    }

}
