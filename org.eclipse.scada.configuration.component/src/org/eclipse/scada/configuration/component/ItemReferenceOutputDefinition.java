/**
 * Copyright (c) 2014 IBH SYSTEMS GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBH SYSTEMS GmbH - initial API and implementation and/or initial documentation
 * 
 */
package org.eclipse.scada.configuration.component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Reference Output Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scada.configuration.component.ItemReferenceOutputDefinition#getItemId <em>Item Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scada.configuration.component.ComponentPackage#getItemReferenceOutputDefinition()
 * @model
 * @generated
 */
public interface ItemReferenceOutputDefinition extends OutputDefinition
{
    /**
     * Returns the value of the '<em><b>Item Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Item Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Item Id</em>' attribute.
     * @see #setItemId(String)
     * @see org.eclipse.scada.configuration.component.ComponentPackage#getItemReferenceOutputDefinition_ItemId()
     * @model required="true"
     * @generated
     */
    String getItemId ();

    /**
     * Sets the value of the '{@link org.eclipse.scada.configuration.component.ItemReferenceOutputDefinition#getItemId <em>Item Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Item Id</em>' attribute.
     * @see #getItemId()
     * @generated
     */
    void setItemId ( String value );

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model required="true"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final org.eclipse.scada.configuration.component.AbsoluteDanglingReference danglingRef = org.eclipse.scada.configuration.component.ComponentFactory.eINSTANCE.createAbsoluteDanglingReference ();\ndanglingRef.setName ( getItemId () );\nreturn danglingRef;'"
     * @generated
     */
    DanglingItemReference createReference ();

} // ItemReferenceOutputDefinition
