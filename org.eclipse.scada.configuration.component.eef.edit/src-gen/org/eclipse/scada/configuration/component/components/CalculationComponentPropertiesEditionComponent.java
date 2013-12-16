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
package org.eclipse.scada.configuration.component.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.scada.configuration.component.CalculationComponent;
import org.eclipse.scada.configuration.component.CalculationModule;
import org.eclipse.scada.configuration.component.ComponentFactory;
import org.eclipse.scada.configuration.component.ComponentPackage;
import org.eclipse.scada.configuration.component.InputDefinition;
import org.eclipse.scada.configuration.component.Level;
import org.eclipse.scada.configuration.component.OutputDefinition;
import org.eclipse.scada.configuration.component.parts.CalculationComponentPropertiesEditionPart;
import org.eclipse.scada.configuration.component.parts.ComponentViewsRepository;
import org.eclipse.scada.configuration.infrastructure.InfrastructurePackage;
import org.eclipse.scada.configuration.infrastructure.MasterServer;
import org.eclipse.scada.configuration.item.CustomizationPipeline;
import org.eclipse.scada.configuration.item.Selector;
import org.eclipse.scada.configuration.world.WorldPackage;


// End of user code

/**
 * @author IBH SYSTEMS GmbH
 * 
 */
public class CalculationComponentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for level EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings levelSettings;
	
	/**
	 * Settings for customizationPipeline EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings customizationPipelineSettings;
	
	/**
	 * Settings for archiveSelector EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings archiveSelectorSettings;
	
	/**
	 * Settings for masterOn ReferencesTable
	 */
	private ReferencesTableSettings masterOnSettings;
	
	/**
	 * Settings for implementation EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings implementationSettings;
	
	/**
	 * Settings for outputs ReferencesTable
	 */
	protected ReferencesTableSettings outputsSettings;
	
	/**
	 * Settings for inputs ReferencesTable
	 */
	protected ReferencesTableSettings inputsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public CalculationComponentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject calculationComponent, String editing_mode) {
		super(editingContext, calculationComponent, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ComponentViewsRepository.class;
		partKey = ComponentViewsRepository.CalculationComponent.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final CalculationComponent calculationComponent = (CalculationComponent)elt;
			final CalculationComponentPropertiesEditionPart basePart = (CalculationComponentPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.shortDescription))
				basePart.setShortDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, calculationComponent.getShortDescription()));
			
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, calculationComponent.getName()));
			
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.level)) {
				// init part
				levelSettings = new EObjectFlatComboSettings(calculationComponent, ComponentPackage.eINSTANCE.getComponent_Level());
				basePart.initLevel(levelSettings);
				// set the button mode
				basePart.setLevelButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.customizationPipeline)) {
				// init part
				customizationPipelineSettings = new EObjectFlatComboSettings(calculationComponent, ComponentPackage.eINSTANCE.getComponent_CustomizationPipeline());
				basePart.initCustomizationPipeline(customizationPipelineSettings);
				// set the button mode
				basePart.setCustomizationPipelineButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.archiveSelector)) {
				// init part
				archiveSelectorSettings = new EObjectFlatComboSettings(calculationComponent, ComponentPackage.eINSTANCE.getComponent_ArchiveSelector());
				basePart.initArchiveSelector(archiveSelectorSettings);
				// set the button mode
				basePart.setArchiveSelectorButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.masterOn)) {
				masterOnSettings = new ReferencesTableSettings(calculationComponent, ComponentPackage.eINSTANCE.getMasterComponent_MasterOn());
				basePart.initMasterOn(masterOnSettings);
			}
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.implementation)) {
				// init part
				implementationSettings = new EObjectFlatComboSettings(calculationComponent, ComponentPackage.eINSTANCE.getCalculationComponent_Implementation());
				basePart.initImplementation(implementationSettings);
				// set the button mode
				basePart.setImplementationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.outputs)) {
				outputsSettings = new ReferencesTableSettings(calculationComponent, ComponentPackage.eINSTANCE.getCalculationComponent_Outputs());
				basePart.initOutputs(outputsSettings);
			}
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.inputs)) {
				inputsSettings = new ReferencesTableSettings(calculationComponent, ComponentPackage.eINSTANCE.getCalculationComponent_Inputs());
				basePart.initInputs(inputsSettings);
			}
			// init filters
			
			
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.level)) {
				basePart.addFilterToLevel(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Level); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for level
				// End of user code
			}
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.customizationPipeline)) {
				basePart.addFilterToCustomizationPipeline(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof CustomizationPipeline); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for customizationPipeline
				// End of user code
			}
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.archiveSelector)) {
				basePart.addFilterToArchiveSelector(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Selector); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for archiveSelector
				// End of user code
			}
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.masterOn)) {
				basePart.addFilterToMasterOn(new EObjectFilter(InfrastructurePackage.Literals.MASTER_SERVER));
				// Start of user code for additional businessfilters for masterOn
				// End of user code
			}
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.implementation)) {
				basePart.addFilterToImplementation(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof CalculationModule);
					}
					
				});
				// Start of user code for additional businessfilters for implementation
				// End of user code
			}
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.outputs)) {
				basePart.addFilterToOutputs(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof OutputDefinition); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for outputs
				// End of user code
			}
			if (isAccessible(ComponentViewsRepository.CalculationComponent.Properties.inputs)) {
				basePart.addFilterToInputs(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof InputDefinition); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for inputs
				// End of user code
			}
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}












	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ComponentViewsRepository.CalculationComponent.Properties.shortDescription) {
			return WorldPackage.eINSTANCE.getDocumentable_ShortDescription();
		}
		if (editorKey == ComponentViewsRepository.CalculationComponent.Properties.name) {
			return WorldPackage.eINSTANCE.getDocumentable_Name();
		}
		if (editorKey == ComponentViewsRepository.CalculationComponent.Properties.level) {
			return ComponentPackage.eINSTANCE.getComponent_Level();
		}
		if (editorKey == ComponentViewsRepository.CalculationComponent.Properties.customizationPipeline) {
			return ComponentPackage.eINSTANCE.getComponent_CustomizationPipeline();
		}
		if (editorKey == ComponentViewsRepository.CalculationComponent.Properties.archiveSelector) {
			return ComponentPackage.eINSTANCE.getComponent_ArchiveSelector();
		}
		if (editorKey == ComponentViewsRepository.CalculationComponent.Properties.masterOn) {
			return ComponentPackage.eINSTANCE.getMasterComponent_MasterOn();
		}
		if (editorKey == ComponentViewsRepository.CalculationComponent.Properties.implementation) {
			return ComponentPackage.eINSTANCE.getCalculationComponent_Implementation();
		}
		if (editorKey == ComponentViewsRepository.CalculationComponent.Properties.outputs) {
			return ComponentPackage.eINSTANCE.getCalculationComponent_Outputs();
		}
		if (editorKey == ComponentViewsRepository.CalculationComponent.Properties.inputs) {
			return ComponentPackage.eINSTANCE.getCalculationComponent_Inputs();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CalculationComponent calculationComponent = (CalculationComponent)semanticObject;
		if (ComponentViewsRepository.CalculationComponent.Properties.shortDescription == event.getAffectedEditor()) {
			calculationComponent.setShortDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ComponentViewsRepository.CalculationComponent.Properties.name == event.getAffectedEditor()) {
			calculationComponent.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ComponentViewsRepository.CalculationComponent.Properties.level == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				levelSettings.setToReference((Level)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Level eObject = ComponentFactory.eINSTANCE.createLevel();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				levelSettings.setToReference(eObject);
			}
		}
		if (ComponentViewsRepository.CalculationComponent.Properties.customizationPipeline == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				customizationPipelineSettings.setToReference((CustomizationPipeline)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, customizationPipelineSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ComponentViewsRepository.CalculationComponent.Properties.archiveSelector == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				archiveSelectorSettings.setToReference((Selector)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, archiveSelectorSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ComponentViewsRepository.CalculationComponent.Properties.masterOn == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof MasterServer) {
					masterOnSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				masterOnSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				masterOnSettings.move(event.getNewIndex(), (MasterServer) event.getNewValue());
			}
		}
		if (ComponentViewsRepository.CalculationComponent.Properties.implementation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				implementationSettings.setToReference((CalculationModule)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, implementationSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ComponentViewsRepository.CalculationComponent.Properties.outputs == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, outputsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outputsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outputsSettings.move(event.getNewIndex(), (OutputDefinition) event.getNewValue());
			}
		}
		if (ComponentViewsRepository.CalculationComponent.Properties.inputs == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, inputsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				inputsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				inputsSettings.move(event.getNewIndex(), (InputDefinition) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			CalculationComponentPropertiesEditionPart basePart = (CalculationComponentPropertiesEditionPart)editingPart;
			if (WorldPackage.eINSTANCE.getDocumentable_ShortDescription().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ComponentViewsRepository.CalculationComponent.Properties.shortDescription)) {
				if (msg.getNewValue() != null) {
					basePart.setShortDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setShortDescription("");
				}
			}
			if (WorldPackage.eINSTANCE.getDocumentable_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(ComponentViewsRepository.CalculationComponent.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ComponentPackage.eINSTANCE.getComponent_Level().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.CalculationComponent.Properties.level))
				basePart.setLevel((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getComponent_CustomizationPipeline().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.CalculationComponent.Properties.customizationPipeline))
				basePart.setCustomizationPipeline((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getComponent_ArchiveSelector().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.CalculationComponent.Properties.archiveSelector))
				basePart.setArchiveSelector((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getMasterComponent_MasterOn().equals(msg.getFeature())  && isAccessible(ComponentViewsRepository.CalculationComponent.Properties.masterOn))
				basePart.updateMasterOn();
			if (ComponentPackage.eINSTANCE.getCalculationComponent_Implementation().equals(msg.getFeature()) && basePart != null && isAccessible(ComponentViewsRepository.CalculationComponent.Properties.implementation))
				basePart.setImplementation((EObject)msg.getNewValue());
			if (ComponentPackage.eINSTANCE.getCalculationComponent_Outputs().equals(msg.getFeature()) && isAccessible(ComponentViewsRepository.CalculationComponent.Properties.outputs))
				basePart.updateOutputs();
			if (ComponentPackage.eINSTANCE.getCalculationComponent_Inputs().equals(msg.getFeature()) && isAccessible(ComponentViewsRepository.CalculationComponent.Properties.inputs))
				basePart.updateInputs();
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			WorldPackage.eINSTANCE.getDocumentable_ShortDescription(),
			WorldPackage.eINSTANCE.getDocumentable_Name(),
			ComponentPackage.eINSTANCE.getComponent_Level(),
			ComponentPackage.eINSTANCE.getComponent_CustomizationPipeline(),
			ComponentPackage.eINSTANCE.getComponent_ArchiveSelector(),
			ComponentPackage.eINSTANCE.getMasterComponent_MasterOn(),
			ComponentPackage.eINSTANCE.getCalculationComponent_Implementation(),
			ComponentPackage.eINSTANCE.getCalculationComponent_Outputs(),
			ComponentPackage.eINSTANCE.getCalculationComponent_Inputs()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ComponentViewsRepository.CalculationComponent.Properties.implementation;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ComponentViewsRepository.CalculationComponent.Properties.shortDescription == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(WorldPackage.eINSTANCE.getDocumentable_ShortDescription().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(WorldPackage.eINSTANCE.getDocumentable_ShortDescription().getEAttributeType(), newValue);
				}
				if (ComponentViewsRepository.CalculationComponent.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(WorldPackage.eINSTANCE.getDocumentable_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(WorldPackage.eINSTANCE.getDocumentable_Name().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

}