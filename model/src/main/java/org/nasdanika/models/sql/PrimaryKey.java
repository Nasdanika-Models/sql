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
 *   <li>{@link org.nasdanika.models.sql.PrimaryKey#getExportedKeys <em>Exported Keys</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Exported Keys</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.sql.ForeignKey#getPrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported Keys</em>' reference.
	 * @see #setExportedKeys(ForeignKey)
	 * @see org.nasdanika.models.sql.SqlPackage#getPrimaryKey_ExportedKeys()
	 * @see org.nasdanika.models.sql.ForeignKey#getPrimaryKey
	 * @model opposite="primaryKey"
	 * @generated
	 */
	ForeignKey getExportedKeys();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.PrimaryKey#getExportedKeys <em>Exported Keys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported Keys</em>' reference.
	 * @see #getExportedKeys()
	 * @generated
	 */
	void setExportedKeys(ForeignKey value);
} // PrimaryKey
