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
package org.eclipse.scada.configuration.component.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.scada.configuration.component.parts.ComponentViewsRepository;
import org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart;
import org.eclipse.scada.configuration.component.providers.ComponentMessages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * @author IBH SYSTEMS GmbH
 * 
 */
public class ScriptModulePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ScriptModulePropertiesEditionPart {

	protected Text shortDescription;
	protected Text name;
	protected ReferencesTable inputs;
	protected List<ViewerFilter> inputsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inputsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outputs;
	protected List<ViewerFilter> outputsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outputsFilters = new ArrayList<ViewerFilter>();
	protected Text scriptEngine;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ScriptModulePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence scriptModuleStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = scriptModuleStep.addStep(ComponentViewsRepository.ScriptModule.Properties.class);
		propertiesStep.addStep(ComponentViewsRepository.ScriptModule.Properties.shortDescription);
		propertiesStep.addStep(ComponentViewsRepository.ScriptModule.Properties.name);
		propertiesStep.addStep(ComponentViewsRepository.ScriptModule.Properties.inputs);
		propertiesStep.addStep(ComponentViewsRepository.ScriptModule.Properties.outputs);
		propertiesStep.addStep(ComponentViewsRepository.ScriptModule.Properties.scriptEngine);
		
		
		composer = new PartComposer(scriptModuleStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ComponentViewsRepository.ScriptModule.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ComponentViewsRepository.ScriptModule.Properties.shortDescription) {
					return createShortDescriptionText(parent);
				}
				if (key == ComponentViewsRepository.ScriptModule.Properties.name) {
					return createNameText(parent);
				}
				if (key == ComponentViewsRepository.ScriptModule.Properties.inputs) {
					return createInputsAdvancedTableComposition(parent);
				}
				if (key == ComponentViewsRepository.ScriptModule.Properties.outputs) {
					return createOutputsAdvancedTableComposition(parent);
				}
				if (key == ComponentViewsRepository.ScriptModule.Properties.scriptEngine) {
					return createScriptEngineText(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ComponentMessages.ScriptModulePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createShortDescriptionText(Composite parent) {
		createDescription(parent, ComponentViewsRepository.ScriptModule.Properties.shortDescription, ComponentMessages.ScriptModulePropertiesEditionPart_ShortDescriptionLabel);
		shortDescription = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData shortDescriptionData = new GridData(GridData.FILL_HORIZONTAL);
		shortDescription.setLayoutData(shortDescriptionData);
		shortDescription.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.shortDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, shortDescription.getText()));
			}

		});
		shortDescription.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.shortDescription, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, shortDescription.getText()));
				}
			}

		});
		EditingUtils.setID(shortDescription, ComponentViewsRepository.ScriptModule.Properties.shortDescription);
		EditingUtils.setEEFtype(shortDescription, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.ScriptModule.Properties.shortDescription, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createShortDescriptionText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, ComponentViewsRepository.ScriptModule.Properties.name, ComponentMessages.ScriptModulePropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ComponentViewsRepository.ScriptModule.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.ScriptModule.Properties.name, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createInputsAdvancedTableComposition(Composite parent) {
		this.inputs = new ReferencesTable(getDescription(ComponentViewsRepository.ScriptModule.Properties.inputs, ComponentMessages.ScriptModulePropertiesEditionPart_InputsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.inputs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				inputs.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.inputs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				inputs.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.inputs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				inputs.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.inputs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				inputs.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.inputsFilters) {
			this.inputs.addFilter(filter);
		}
		this.inputs.setHelpText(propertiesEditionComponent.getHelpContent(ComponentViewsRepository.ScriptModule.Properties.inputs, ComponentViewsRepository.SWT_KIND));
		this.inputs.createControls(parent);
		this.inputs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.inputs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData inputsData = new GridData(GridData.FILL_HORIZONTAL);
		inputsData.horizontalSpan = 3;
		this.inputs.setLayoutData(inputsData);
		this.inputs.setLowerBound(0);
		this.inputs.setUpperBound(-1);
		inputs.setID(ComponentViewsRepository.ScriptModule.Properties.inputs);
		inputs.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createInputsAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOutputsAdvancedTableComposition(Composite parent) {
		this.outputs = new ReferencesTable(getDescription(ComponentViewsRepository.ScriptModule.Properties.outputs, ComponentMessages.ScriptModulePropertiesEditionPart_OutputsLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.outputs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				outputs.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.outputs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				outputs.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.outputs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				outputs.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.outputs, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				outputs.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.outputsFilters) {
			this.outputs.addFilter(filter);
		}
		this.outputs.setHelpText(propertiesEditionComponent.getHelpContent(ComponentViewsRepository.ScriptModule.Properties.outputs, ComponentViewsRepository.SWT_KIND));
		this.outputs.createControls(parent);
		this.outputs.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.outputs, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outputsData = new GridData(GridData.FILL_HORIZONTAL);
		outputsData.horizontalSpan = 3;
		this.outputs.setLayoutData(outputsData);
		this.outputs.setLowerBound(0);
		this.outputs.setUpperBound(-1);
		outputs.setID(ComponentViewsRepository.ScriptModule.Properties.outputs);
		outputs.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOutputsAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createScriptEngineText(Composite parent) {
		createDescription(parent, ComponentViewsRepository.ScriptModule.Properties.scriptEngine, ComponentMessages.ScriptModulePropertiesEditionPart_ScriptEngineLabel);
		scriptEngine = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData scriptEngineData = new GridData(GridData.FILL_HORIZONTAL);
		scriptEngine.setLayoutData(scriptEngineData);
		scriptEngine.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.scriptEngine, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, scriptEngine.getText()));
			}

		});
		scriptEngine.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ScriptModulePropertiesEditionPartImpl.this, ComponentViewsRepository.ScriptModule.Properties.scriptEngine, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, scriptEngine.getText()));
				}
			}

		});
		EditingUtils.setID(scriptEngine, ComponentViewsRepository.ScriptModule.Properties.scriptEngine);
		EditingUtils.setEEFtype(scriptEngine, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ComponentViewsRepository.ScriptModule.Properties.scriptEngine, ComponentViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createScriptEngineText

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#getShortDescription()
	 * 
	 */
	public String getShortDescription() {
		return shortDescription.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#setShortDescription(String newValue)
	 * 
	 */
	public void setShortDescription(String newValue) {
		if (newValue != null) {
			shortDescription.setText(newValue);
		} else {
			shortDescription.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ComponentViewsRepository.ScriptModule.Properties.shortDescription);
		if (eefElementEditorReadOnlyState && shortDescription.isEnabled()) {
			shortDescription.setEnabled(false);
			shortDescription.setToolTipText(ComponentMessages.ScriptModule_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !shortDescription.isEnabled()) {
			shortDescription.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ComponentViewsRepository.ScriptModule.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(ComponentMessages.ScriptModule_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#initInputs(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initInputs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inputs.setContentProvider(contentProvider);
		inputs.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ComponentViewsRepository.ScriptModule.Properties.inputs);
		if (eefElementEditorReadOnlyState && inputs.isEnabled()) {
			inputs.setEnabled(false);
			inputs.setToolTipText(ComponentMessages.ScriptModule_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inputs.isEnabled()) {
			inputs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#updateInputs()
	 * 
	 */
	public void updateInputs() {
	inputs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#addFilterInputs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInputs(ViewerFilter filter) {
		inputsFilters.add(filter);
		if (this.inputs != null) {
			this.inputs.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#addBusinessFilterInputs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInputs(ViewerFilter filter) {
		inputsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#isContainedInInputsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInputsTable(EObject element) {
		return ((ReferencesTableSettings)inputs.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#initOutputs(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOutputs(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outputs.setContentProvider(contentProvider);
		outputs.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ComponentViewsRepository.ScriptModule.Properties.outputs);
		if (eefElementEditorReadOnlyState && outputs.isEnabled()) {
			outputs.setEnabled(false);
			outputs.setToolTipText(ComponentMessages.ScriptModule_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !outputs.isEnabled()) {
			outputs.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#updateOutputs()
	 * 
	 */
	public void updateOutputs() {
	outputs.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#addFilterOutputs(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutputs(ViewerFilter filter) {
		outputsFilters.add(filter);
		if (this.outputs != null) {
			this.outputs.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#addBusinessFilterOutputs(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutputs(ViewerFilter filter) {
		outputsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#isContainedInOutputsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutputsTable(EObject element) {
		return ((ReferencesTableSettings)outputs.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#getScriptEngine()
	 * 
	 */
	public String getScriptEngine() {
		return scriptEngine.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.scada.configuration.component.parts.ScriptModulePropertiesEditionPart#setScriptEngine(String newValue)
	 * 
	 */
	public void setScriptEngine(String newValue) {
		if (newValue != null) {
			scriptEngine.setText(newValue);
		} else {
			scriptEngine.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ComponentViewsRepository.ScriptModule.Properties.scriptEngine);
		if (eefElementEditorReadOnlyState && scriptEngine.isEnabled()) {
			scriptEngine.setEnabled(false);
			scriptEngine.setToolTipText(ComponentMessages.ScriptModule_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !scriptEngine.isEnabled()) {
			scriptEngine.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ComponentMessages.ScriptModule_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}