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
package org.eclipse.scada.configuration.world.osgi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Feature Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.world.osgi.ItemFeatureEntry#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.world.osgi.ItemFeatureEntry#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getItemFeatureEntry()
 * @model abstract="true"
 * @generated
 */
public interface ItemFeatureEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getItemFeatureEntry_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.scada.configuration.world.osgi.ItemFeatureEntry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.scada.configuration.world.osgi.Item#getItemFeatures <em>Item Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' container reference.
	 * @see #setItem(Item)
	 * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getItemFeatureEntry_Item()
	 * @see org.eclipse.scada.configuration.world.osgi.Item#getItemFeatures
	 * @model opposite="itemFeatures" required="true" transient="false"
	 * @generated
	 */
	Item getItem();

	/**
	 * Sets the value of the '{@link org.eclipse.scada.configuration.world.osgi.ItemFeatureEntry#getItem <em>Item</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' container reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Item value);

} // ItemFeatureEntry
