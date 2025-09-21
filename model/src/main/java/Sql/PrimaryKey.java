/**
 */
package Sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sql.PrimaryKey#getTableCat <em>Table Cat</em>}</li>
 *   <li>{@link Sql.PrimaryKey#getTableSchem <em>Table Schem</em>}</li>
 *   <li>{@link Sql.PrimaryKey#getTableName <em>Table Name</em>}</li>
 *   <li>{@link Sql.PrimaryKey#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link Sql.PrimaryKey#getKeySeq <em>Key Seq</em>}</li>
 *   <li>{@link Sql.PrimaryKey#getPkName <em>Pk Name</em>}</li>
 * </ul>
 *
 * @see Sql.SqlPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Cat</em>' attribute.
	 * @see #setTableCat(String)
	 * @see Sql.SqlPackage#getPrimaryKey_TableCat()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_CAT'"
	 * @generated
	 */
	String getTableCat();

	/**
	 * Sets the value of the '{@link Sql.PrimaryKey#getTableCat <em>Table Cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Cat</em>' attribute.
	 * @see #getTableCat()
	 * @generated
	 */
	void setTableCat(String value);

	/**
	 * Returns the value of the '<em><b>Table Schem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Schem</em>' attribute.
	 * @see #setTableSchem(String)
	 * @see Sql.SqlPackage#getPrimaryKey_TableSchem()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_SCHEM'"
	 * @generated
	 */
	String getTableSchem();

	/**
	 * Sets the value of the '{@link Sql.PrimaryKey#getTableSchem <em>Table Schem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Schem</em>' attribute.
	 * @see #getTableSchem()
	 * @generated
	 */
	void setTableSchem(String value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see Sql.SqlPackage#getPrimaryKey_TableName()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_NAME'"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link Sql.PrimaryKey#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see Sql.SqlPackage#getPrimaryKey_ColumnName()
	 * @model annotation="urn:org.nasdanika.models.sql column='COLUMN_NAME'"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link Sql.PrimaryKey#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Key Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Seq</em>' attribute.
	 * @see #setKeySeq(Short)
	 * @see Sql.SqlPackage#getPrimaryKey_KeySeq()
	 * @model annotation="urn:org.nasdanika.models.sql column='KEY_SEQ'"
	 * @generated
	 */
	Short getKeySeq();

	/**
	 * Sets the value of the '{@link Sql.PrimaryKey#getKeySeq <em>Key Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Seq</em>' attribute.
	 * @see #getKeySeq()
	 * @generated
	 */
	void setKeySeq(Short value);

	/**
	 * Returns the value of the '<em><b>Pk Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pk Name</em>' attribute.
	 * @see #setPkName(String)
	 * @see Sql.SqlPackage#getPrimaryKey_PkName()
	 * @model annotation="urn:org.nasdanika.models.sql column='PK_NAME'"
	 * @generated
	 */
	String getPkName();

	/**
	 * Sets the value of the '{@link Sql.PrimaryKey#getPkName <em>Pk Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pk Name</em>' attribute.
	 * @see #getPkName()
	 * @generated
	 */
	void setPkName(String value);

} // PrimaryKey
