/**
 */
package org.nasdanika.models.sql;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ForeignKey#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ForeignKey#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ForeignKey#getUpdateRule <em>Update Rule</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ForeignKey#getDeleteRule <em>Delete Rule</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ForeignKey#getDeferrability <em>Deferrability</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.SqlPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.ForeignKeyColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getForeignKey_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKeyColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.sql.PrimaryKey#getExportedKeys <em>Exported Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see org.nasdanika.models.sql.SqlPackage#getForeignKey_PrimaryKey()
	 * @see org.nasdanika.models.sql.PrimaryKey#getExportedKeys
	 * @model opposite="exportedKeys" required="true"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ForeignKey#getPrimaryKey <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Update Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.sql.ImportedKeyRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Rule</em>' attribute.
	 * @see org.nasdanika.models.sql.ImportedKeyRule
	 * @see #setUpdateRule(ImportedKeyRule)
	 * @see org.nasdanika.models.sql.SqlPackage#getForeignKey_UpdateRule()
	 * @model annotation="urn:org.nasdanika.models.sql enum-value='UPDATE_RULE'"
	 * @generated
	 */
	ImportedKeyRule getUpdateRule();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ForeignKey#getUpdateRule <em>Update Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Rule</em>' attribute.
	 * @see org.nasdanika.models.sql.ImportedKeyRule
	 * @see #getUpdateRule()
	 * @generated
	 */
	void setUpdateRule(ImportedKeyRule value);

	/**
	 * Returns the value of the '<em><b>Delete Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.sql.ImportedKeyRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Rule</em>' attribute.
	 * @see org.nasdanika.models.sql.ImportedKeyRule
	 * @see #setDeleteRule(ImportedKeyRule)
	 * @see org.nasdanika.models.sql.SqlPackage#getForeignKey_DeleteRule()
	 * @model annotation="urn:org.nasdanika.models.sql enum-value='DELETE_RULE'"
	 * @generated
	 */
	ImportedKeyRule getDeleteRule();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ForeignKey#getDeleteRule <em>Delete Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Rule</em>' attribute.
	 * @see org.nasdanika.models.sql.ImportedKeyRule
	 * @see #getDeleteRule()
	 * @generated
	 */
	void setDeleteRule(ImportedKeyRule value);

	/**
	 * Returns the value of the '<em><b>Deferrability</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.sql.Deferrability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrability</em>' attribute.
	 * @see org.nasdanika.models.sql.Deferrability
	 * @see #setDeferrability(Deferrability)
	 * @see org.nasdanika.models.sql.SqlPackage#getForeignKey_Deferrability()
	 * @model annotation="urn:org.nasdanika.models.sql enum-value='DEFERRABILITY'"
	 * @generated
	 */
	Deferrability getDeferrability();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ForeignKey#getDeferrability <em>Deferrability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deferrability</em>' attribute.
	 * @see org.nasdanika.models.sql.Deferrability
	 * @see #getDeferrability()
	 * @generated
	 */
	void setDeferrability(Deferrability value);

} // ForeignKey
