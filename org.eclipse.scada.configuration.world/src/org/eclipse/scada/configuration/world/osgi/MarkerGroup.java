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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marker Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.world.osgi.MarkerGroup#getItems <em>Items</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.world.osgi.MarkerGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scada.configuration.world.osgi.MarkerGroup#getMarkers <em>Markers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getMarkerGroup()
 * @model
 * @generated
 */
public interface MarkerGroup extends EObject {
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
	 * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getMarkerGroup_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.scada.configuration.world.osgi.MarkerGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Markers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.scada.configuration.world.osgi.MarkerEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Markers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markers</em>' containment reference list.
	 * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getMarkerGroup_Markers()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<MarkerEntry> getMarkers();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.scada.configuration.world.osgi.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference list.
	 * @see org.eclipse.scada.configuration.world.osgi.OsgiPackage#getMarkerGroup_Items()
	 * @model
	 * @generated
	 */
	EList<Item> getItems();

} // MarkerGroup
