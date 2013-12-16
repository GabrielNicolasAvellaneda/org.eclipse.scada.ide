/*******************************************************************************
 * Copyright (c) 2013 IBH SYSTEMS GmbH Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.scada.configuration.component.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * @author IBH SYSTEMS GmbH
 * 
 */
public interface FormulaModulePropertiesEditionPart {

	/**
	 * @return the shortDescription
	 * 
	 */
	public String getShortDescription();

	/**
	 * Defines a new shortDescription
	 * @param newValue the new shortDescription to set
	 * 
	 */
	public void setShortDescription(String newValue);


	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);




	/**
	 * Init the inputs
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initInputs(ReferencesTableSettings settings);

	/**
	 * Update the inputs
	 * @param newValue the inputs to update
	 * 
	 */
	public void updateInputs();

	/**
	 * Adds the given filter to the inputs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInputs(ViewerFilter filter);

	/**
	 * Adds the given filter to the inputs edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInputs(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the inputs table
	 * 
	 */
	public boolean isContainedInInputsTable(EObject element);


	/**
	 * @return the scriptEngine
	 * 
	 */
	public String getScriptEngine();

	/**
	 * Defines a new scriptEngine
	 * @param newValue the new scriptEngine to set
	 * 
	 */
	public void setScriptEngine(String newValue);




	/**
	 * Init the init
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initInit(ReferencesTableSettings settings);

	/**
	 * Update the init
	 * @param newValue the init to update
	 * 
	 */
	public void updateInit();

	/**
	 * Adds the given filter to the init edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInit(ViewerFilter filter);

	/**
	 * Adds the given filter to the init edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInit(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the init table
	 * 
	 */
	public boolean isContainedInInitTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}