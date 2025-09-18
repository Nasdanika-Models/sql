/**
 */
package org.nasdanika.models.sql;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.Schema#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.SqlPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getSchema_Tables()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Table> getTables();

} // Schema
