/**
 */
package org.nasdanika.models.sql;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.Catalog#getSchemas <em>Schemas</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.SqlPackage#getCatalog()
 * @model
 * @generated
 */
public interface Catalog extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getCatalog_Schemas()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Schema> getSchemas();

} // Catalog
