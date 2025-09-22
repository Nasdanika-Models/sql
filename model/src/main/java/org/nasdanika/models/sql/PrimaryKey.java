/**
 */
package org.nasdanika.models.sql;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.PrimaryKey#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.SqlPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends DocumentedNamedElement {

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getPrimaryKey_Columns()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getColumns();
} // PrimaryKey
