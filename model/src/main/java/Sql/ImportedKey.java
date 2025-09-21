/**
 */
package Sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sql.ImportedKey#getPktableCat <em>Pktable Cat</em>}</li>
 *   <li>{@link Sql.ImportedKey#getPktableSchem <em>Pktable Schem</em>}</li>
 *   <li>{@link Sql.ImportedKey#getPktableName <em>Pktable Name</em>}</li>
 *   <li>{@link Sql.ImportedKey#getPkcolumnName <em>Pkcolumn Name</em>}</li>
 *   <li>{@link Sql.ImportedKey#getFktableCat <em>Fktable Cat</em>}</li>
 *   <li>{@link Sql.ImportedKey#getFktableSchem <em>Fktable Schem</em>}</li>
 *   <li>{@link Sql.ImportedKey#getFktableName <em>Fktable Name</em>}</li>
 *   <li>{@link Sql.ImportedKey#getFkcolumnName <em>Fkcolumn Name</em>}</li>
 *   <li>{@link Sql.ImportedKey#getKeySeq <em>Key Seq</em>}</li>
 *   <li>{@link Sql.ImportedKey#getUpdateRule <em>Update Rule</em>}</li>
 *   <li>{@link Sql.ImportedKey#getDeleteRule <em>Delete Rule</em>}</li>
 *   <li>{@link Sql.ImportedKey#getFkName <em>Fk Name</em>}</li>
 *   <li>{@link Sql.ImportedKey#getPkName <em>Pk Name</em>}</li>
 *   <li>{@link Sql.ImportedKey#getDeferrability <em>Deferrability</em>}</li>
 * </ul>
 *
 * @see Sql.SqlPackage#getImportedKey()
 * @model
 * @generated
 */
public interface ImportedKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Pktable Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pktable Cat</em>' attribute.
	 * @see #setPktableCat(String)
	 * @see Sql.SqlPackage#getImportedKey_PktableCat()
	 * @model annotation="urn:org.nasdanika.models.sql column='PKTABLE_CAT'"
	 * @generated
	 */
	String getPktableCat();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getPktableCat <em>Pktable Cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pktable Cat</em>' attribute.
	 * @see #getPktableCat()
	 * @generated
	 */
	void setPktableCat(String value);

	/**
	 * Returns the value of the '<em><b>Pktable Schem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pktable Schem</em>' attribute.
	 * @see #setPktableSchem(String)
	 * @see Sql.SqlPackage#getImportedKey_PktableSchem()
	 * @model annotation="urn:org.nasdanika.models.sql column='PKTABLE_SCHEM'"
	 * @generated
	 */
	String getPktableSchem();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getPktableSchem <em>Pktable Schem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pktable Schem</em>' attribute.
	 * @see #getPktableSchem()
	 * @generated
	 */
	void setPktableSchem(String value);

	/**
	 * Returns the value of the '<em><b>Pktable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pktable Name</em>' attribute.
	 * @see #setPktableName(String)
	 * @see Sql.SqlPackage#getImportedKey_PktableName()
	 * @model annotation="urn:org.nasdanika.models.sql column='PKTABLE_NAME'"
	 * @generated
	 */
	String getPktableName();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getPktableName <em>Pktable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pktable Name</em>' attribute.
	 * @see #getPktableName()
	 * @generated
	 */
	void setPktableName(String value);

	/**
	 * Returns the value of the '<em><b>Pkcolumn Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkcolumn Name</em>' attribute.
	 * @see #setPkcolumnName(String)
	 * @see Sql.SqlPackage#getImportedKey_PkcolumnName()
	 * @model annotation="urn:org.nasdanika.models.sql column='PKCOLUMN_NAME'"
	 * @generated
	 */
	String getPkcolumnName();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getPkcolumnName <em>Pkcolumn Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkcolumn Name</em>' attribute.
	 * @see #getPkcolumnName()
	 * @generated
	 */
	void setPkcolumnName(String value);

	/**
	 * Returns the value of the '<em><b>Fktable Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fktable Cat</em>' attribute.
	 * @see #setFktableCat(String)
	 * @see Sql.SqlPackage#getImportedKey_FktableCat()
	 * @model annotation="urn:org.nasdanika.models.sql column='FKTABLE_CAT'"
	 * @generated
	 */
	String getFktableCat();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getFktableCat <em>Fktable Cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fktable Cat</em>' attribute.
	 * @see #getFktableCat()
	 * @generated
	 */
	void setFktableCat(String value);

	/**
	 * Returns the value of the '<em><b>Fktable Schem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fktable Schem</em>' attribute.
	 * @see #setFktableSchem(String)
	 * @see Sql.SqlPackage#getImportedKey_FktableSchem()
	 * @model annotation="urn:org.nasdanika.models.sql column='FKTABLE_SCHEM'"
	 * @generated
	 */
	String getFktableSchem();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getFktableSchem <em>Fktable Schem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fktable Schem</em>' attribute.
	 * @see #getFktableSchem()
	 * @generated
	 */
	void setFktableSchem(String value);

	/**
	 * Returns the value of the '<em><b>Fktable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fktable Name</em>' attribute.
	 * @see #setFktableName(String)
	 * @see Sql.SqlPackage#getImportedKey_FktableName()
	 * @model annotation="urn:org.nasdanika.models.sql column='FKTABLE_NAME'"
	 * @generated
	 */
	String getFktableName();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getFktableName <em>Fktable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fktable Name</em>' attribute.
	 * @see #getFktableName()
	 * @generated
	 */
	void setFktableName(String value);

	/**
	 * Returns the value of the '<em><b>Fkcolumn Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fkcolumn Name</em>' attribute.
	 * @see #setFkcolumnName(String)
	 * @see Sql.SqlPackage#getImportedKey_FkcolumnName()
	 * @model annotation="urn:org.nasdanika.models.sql column='FKCOLUMN_NAME'"
	 * @generated
	 */
	String getFkcolumnName();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getFkcolumnName <em>Fkcolumn Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fkcolumn Name</em>' attribute.
	 * @see #getFkcolumnName()
	 * @generated
	 */
	void setFkcolumnName(String value);

	/**
	 * Returns the value of the '<em><b>Key Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Seq</em>' attribute.
	 * @see #setKeySeq(Short)
	 * @see Sql.SqlPackage#getImportedKey_KeySeq()
	 * @model annotation="urn:org.nasdanika.models.sql column='KEY_SEQ'"
	 * @generated
	 */
	Short getKeySeq();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getKeySeq <em>Key Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Seq</em>' attribute.
	 * @see #getKeySeq()
	 * @generated
	 */
	void setKeySeq(Short value);

	/**
	 * Returns the value of the '<em><b>Update Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Rule</em>' attribute.
	 * @see #setUpdateRule(Short)
	 * @see Sql.SqlPackage#getImportedKey_UpdateRule()
	 * @model annotation="urn:org.nasdanika.models.sql column='UPDATE_RULE'"
	 * @generated
	 */
	Short getUpdateRule();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getUpdateRule <em>Update Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Rule</em>' attribute.
	 * @see #getUpdateRule()
	 * @generated
	 */
	void setUpdateRule(Short value);

	/**
	 * Returns the value of the '<em><b>Delete Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Rule</em>' attribute.
	 * @see #setDeleteRule(Short)
	 * @see Sql.SqlPackage#getImportedKey_DeleteRule()
	 * @model annotation="urn:org.nasdanika.models.sql column='DELETE_RULE'"
	 * @generated
	 */
	Short getDeleteRule();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getDeleteRule <em>Delete Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Rule</em>' attribute.
	 * @see #getDeleteRule()
	 * @generated
	 */
	void setDeleteRule(Short value);

	/**
	 * Returns the value of the '<em><b>Fk Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fk Name</em>' attribute.
	 * @see #setFkName(String)
	 * @see Sql.SqlPackage#getImportedKey_FkName()
	 * @model annotation="urn:org.nasdanika.models.sql column='FK_NAME'"
	 * @generated
	 */
	String getFkName();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getFkName <em>Fk Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fk Name</em>' attribute.
	 * @see #getFkName()
	 * @generated
	 */
	void setFkName(String value);

	/**
	 * Returns the value of the '<em><b>Pk Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pk Name</em>' attribute.
	 * @see #setPkName(String)
	 * @see Sql.SqlPackage#getImportedKey_PkName()
	 * @model annotation="urn:org.nasdanika.models.sql column='PK_NAME'"
	 * @generated
	 */
	String getPkName();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getPkName <em>Pk Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pk Name</em>' attribute.
	 * @see #getPkName()
	 * @generated
	 */
	void setPkName(String value);

	/**
	 * Returns the value of the '<em><b>Deferrability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deferrability</em>' attribute.
	 * @see #setDeferrability(Short)
	 * @see Sql.SqlPackage#getImportedKey_Deferrability()
	 * @model annotation="urn:org.nasdanika.models.sql column='DEFERRABILITY'"
	 * @generated
	 */
	Short getDeferrability();

	/**
	 * Sets the value of the '{@link Sql.ImportedKey#getDeferrability <em>Deferrability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deferrability</em>' attribute.
	 * @see #getDeferrability()
	 * @generated
	 */
	void setDeferrability(Short value);

} // ImportedKey
