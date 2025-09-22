/**
 */
package org.nasdanika.models.sql;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ImportedKey#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ImportedKey#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ImportedKey#getUpdateRule <em>Update Rule</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ImportedKey#getDeleteRule <em>Delete Rule</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ImportedKey#getDeferrability <em>Deferrability</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.SqlPackage#getImportedKey()
 * @model
 * @generated
 */
public interface ImportedKey extends DocumentedNamedElement {

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.ImportedKeyColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getImportedKey_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportedKeyColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see org.nasdanika.models.sql.SqlPackage#getImportedKey_PrimaryKey()
	 * @model required="true"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ImportedKey#getPrimaryKey <em>Primary Key</em>}' reference.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getImportedKey_UpdateRule()
	 * @model annotation="urn:org.nasdanika.models.sql enum-value='UPDATE_RULE'"
	 * @generated
	 */
	ImportedKeyRule getUpdateRule();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ImportedKey#getUpdateRule <em>Update Rule</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getImportedKey_DeleteRule()
	 * @model annotation="urn:org.nasdanika.models.sql enum-value='DELETE_RULE'"
	 * @generated
	 */
	ImportedKeyRule getDeleteRule();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ImportedKey#getDeleteRule <em>Delete Rule</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getImportedKey_Deferrability()
	 * @model annotation="urn:org.nasdanika.models.sql enum-value='DEFERRABILITY'"
	 * @generated
	 */
	Deferrability getDeferrability();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ImportedKey#getDeferrability <em>Deferrability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deferrability</em>' attribute.
	 * @see org.nasdanika.models.sql.Deferrability
	 * @see #getDeferrability()
	 * @generated
	 */
	void setDeferrability(Deferrability value);
} // ImportedKey
