/**
 */
package Sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sql.Column#getTableCat <em>Table Cat</em>}</li>
 *   <li>{@link Sql.Column#getTableSchem <em>Table Schem</em>}</li>
 *   <li>{@link Sql.Column#getTableName <em>Table Name</em>}</li>
 *   <li>{@link Sql.Column#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link Sql.Column#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Sql.Column#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link Sql.Column#getColumnSize <em>Column Size</em>}</li>
 *   <li>{@link Sql.Column#getBufferLength <em>Buffer Length</em>}</li>
 *   <li>{@link Sql.Column#getDecimalDigits <em>Decimal Digits</em>}</li>
 *   <li>{@link Sql.Column#getNumPrecRadix <em>Num Prec Radix</em>}</li>
 *   <li>{@link Sql.Column#getNullable <em>Nullable</em>}</li>
 *   <li>{@link Sql.Column#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link Sql.Column#getColumnDef <em>Column Def</em>}</li>
 *   <li>{@link Sql.Column#getSqlDataType <em>Sql Data Type</em>}</li>
 *   <li>{@link Sql.Column#getSqlDatetimeSub <em>Sql Datetime Sub</em>}</li>
 *   <li>{@link Sql.Column#getCharOctetLength <em>Char Octet Length</em>}</li>
 *   <li>{@link Sql.Column#getOrdinalPosition <em>Ordinal Position</em>}</li>
 *   <li>{@link Sql.Column#getIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link Sql.Column#getScopeCatalog <em>Scope Catalog</em>}</li>
 *   <li>{@link Sql.Column#getScopeSchema <em>Scope Schema</em>}</li>
 *   <li>{@link Sql.Column#getScopeTable <em>Scope Table</em>}</li>
 *   <li>{@link Sql.Column#getSourceDataType <em>Source Data Type</em>}</li>
 *   <li>{@link Sql.Column#getIsAutoincrement <em>Is Autoincrement</em>}</li>
 *   <li>{@link Sql.Column#getIsGeneratedcolumn <em>Is Generatedcolumn</em>}</li>
 * </ul>
 *
 * @see Sql.SqlPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Cat</em>' attribute.
	 * @see #setTableCat(String)
	 * @see Sql.SqlPackage#getColumn_TableCat()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_CAT'"
	 * @generated
	 */
	String getTableCat();

	/**
	 * Sets the value of the '{@link Sql.Column#getTableCat <em>Table Cat</em>}' attribute.
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
	 * @see Sql.SqlPackage#getColumn_TableSchem()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_SCHEM'"
	 * @generated
	 */
	String getTableSchem();

	/**
	 * Sets the value of the '{@link Sql.Column#getTableSchem <em>Table Schem</em>}' attribute.
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
	 * @see Sql.SqlPackage#getColumn_TableName()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_NAME'"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link Sql.Column#getTableName <em>Table Name</em>}' attribute.
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
	 * @see Sql.SqlPackage#getColumn_ColumnName()
	 * @model annotation="urn:org.nasdanika.models.sql column='COLUMN_NAME'"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link Sql.Column#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(Integer)
	 * @see Sql.SqlPackage#getColumn_DataType()
	 * @model annotation="urn:org.nasdanika.models.sql column='DATA_TYPE'"
	 * @generated
	 */
	Integer getDataType();

	/**
	 * Sets the value of the '{@link Sql.Column#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Integer value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see Sql.SqlPackage#getColumn_TypeName()
	 * @model annotation="urn:org.nasdanika.models.sql column='TYPE_NAME'"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link Sql.Column#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Column Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Size</em>' attribute.
	 * @see #setColumnSize(Integer)
	 * @see Sql.SqlPackage#getColumn_ColumnSize()
	 * @model annotation="urn:org.nasdanika.models.sql column='COLUMN_SIZE'"
	 * @generated
	 */
	Integer getColumnSize();

	/**
	 * Sets the value of the '{@link Sql.Column#getColumnSize <em>Column Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Size</em>' attribute.
	 * @see #getColumnSize()
	 * @generated
	 */
	void setColumnSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Buffer Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Length</em>' attribute.
	 * @see #setBufferLength(Integer)
	 * @see Sql.SqlPackage#getColumn_BufferLength()
	 * @model annotation="urn:org.nasdanika.models.sql column='BUFFER_LENGTH'"
	 * @generated
	 */
	Integer getBufferLength();

	/**
	 * Sets the value of the '{@link Sql.Column#getBufferLength <em>Buffer Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Length</em>' attribute.
	 * @see #getBufferLength()
	 * @generated
	 */
	void setBufferLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Decimal Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Digits</em>' attribute.
	 * @see #setDecimalDigits(Integer)
	 * @see Sql.SqlPackage#getColumn_DecimalDigits()
	 * @model annotation="urn:org.nasdanika.models.sql column='DECIMAL_DIGITS'"
	 * @generated
	 */
	Integer getDecimalDigits();

	/**
	 * Sets the value of the '{@link Sql.Column#getDecimalDigits <em>Decimal Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Digits</em>' attribute.
	 * @see #getDecimalDigits()
	 * @generated
	 */
	void setDecimalDigits(Integer value);

	/**
	 * Returns the value of the '<em><b>Num Prec Radix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Prec Radix</em>' attribute.
	 * @see #setNumPrecRadix(Integer)
	 * @see Sql.SqlPackage#getColumn_NumPrecRadix()
	 * @model annotation="urn:org.nasdanika.models.sql column='NUM_PREC_RADIX'"
	 * @generated
	 */
	Integer getNumPrecRadix();

	/**
	 * Sets the value of the '{@link Sql.Column#getNumPrecRadix <em>Num Prec Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Prec Radix</em>' attribute.
	 * @see #getNumPrecRadix()
	 * @generated
	 */
	void setNumPrecRadix(Integer value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(Integer)
	 * @see Sql.SqlPackage#getColumn_Nullable()
	 * @model annotation="urn:org.nasdanika.models.sql column='NULLABLE'"
	 * @generated
	 */
	Integer getNullable();

	/**
	 * Sets the value of the '{@link Sql.Column#getNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #getNullable()
	 * @generated
	 */
	void setNullable(Integer value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see Sql.SqlPackage#getColumn_Remarks()
	 * @model annotation="urn:org.nasdanika.models.sql column='REMARKS'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link Sql.Column#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Column Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Def</em>' attribute.
	 * @see #setColumnDef(String)
	 * @see Sql.SqlPackage#getColumn_ColumnDef()
	 * @model annotation="urn:org.nasdanika.models.sql column='COLUMN_DEF'"
	 * @generated
	 */
	String getColumnDef();

	/**
	 * Sets the value of the '{@link Sql.Column#getColumnDef <em>Column Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Def</em>' attribute.
	 * @see #getColumnDef()
	 * @generated
	 */
	void setColumnDef(String value);

	/**
	 * Returns the value of the '<em><b>Sql Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Data Type</em>' attribute.
	 * @see #setSqlDataType(Integer)
	 * @see Sql.SqlPackage#getColumn_SqlDataType()
	 * @model annotation="urn:org.nasdanika.models.sql column='SQL_DATA_TYPE'"
	 * @generated
	 */
	Integer getSqlDataType();

	/**
	 * Sets the value of the '{@link Sql.Column#getSqlDataType <em>Sql Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Data Type</em>' attribute.
	 * @see #getSqlDataType()
	 * @generated
	 */
	void setSqlDataType(Integer value);

	/**
	 * Returns the value of the '<em><b>Sql Datetime Sub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Datetime Sub</em>' attribute.
	 * @see #setSqlDatetimeSub(Integer)
	 * @see Sql.SqlPackage#getColumn_SqlDatetimeSub()
	 * @model annotation="urn:org.nasdanika.models.sql column='SQL_DATETIME_SUB'"
	 * @generated
	 */
	Integer getSqlDatetimeSub();

	/**
	 * Sets the value of the '{@link Sql.Column#getSqlDatetimeSub <em>Sql Datetime Sub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Datetime Sub</em>' attribute.
	 * @see #getSqlDatetimeSub()
	 * @generated
	 */
	void setSqlDatetimeSub(Integer value);

	/**
	 * Returns the value of the '<em><b>Char Octet Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Octet Length</em>' attribute.
	 * @see #setCharOctetLength(Integer)
	 * @see Sql.SqlPackage#getColumn_CharOctetLength()
	 * @model annotation="urn:org.nasdanika.models.sql column='CHAR_OCTET_LENGTH'"
	 * @generated
	 */
	Integer getCharOctetLength();

	/**
	 * Sets the value of the '{@link Sql.Column#getCharOctetLength <em>Char Octet Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Octet Length</em>' attribute.
	 * @see #getCharOctetLength()
	 * @generated
	 */
	void setCharOctetLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Ordinal Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinal Position</em>' attribute.
	 * @see #setOrdinalPosition(Integer)
	 * @see Sql.SqlPackage#getColumn_OrdinalPosition()
	 * @model annotation="urn:org.nasdanika.models.sql column='ORDINAL_POSITION'"
	 * @generated
	 */
	Integer getOrdinalPosition();

	/**
	 * Sets the value of the '{@link Sql.Column#getOrdinalPosition <em>Ordinal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinal Position</em>' attribute.
	 * @see #getOrdinalPosition()
	 * @generated
	 */
	void setOrdinalPosition(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nullable</em>' attribute.
	 * @see #setIsNullable(String)
	 * @see Sql.SqlPackage#getColumn_IsNullable()
	 * @model annotation="urn:org.nasdanika.models.sql column='IS_NULLABLE'"
	 * @generated
	 */
	String getIsNullable();

	/**
	 * Sets the value of the '{@link Sql.Column#getIsNullable <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nullable</em>' attribute.
	 * @see #getIsNullable()
	 * @generated
	 */
	void setIsNullable(String value);

	/**
	 * Returns the value of the '<em><b>Scope Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Catalog</em>' attribute.
	 * @see #setScopeCatalog(String)
	 * @see Sql.SqlPackage#getColumn_ScopeCatalog()
	 * @model annotation="urn:org.nasdanika.models.sql column='SCOPE_CATALOG'"
	 * @generated
	 */
	String getScopeCatalog();

	/**
	 * Sets the value of the '{@link Sql.Column#getScopeCatalog <em>Scope Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Catalog</em>' attribute.
	 * @see #getScopeCatalog()
	 * @generated
	 */
	void setScopeCatalog(String value);

	/**
	 * Returns the value of the '<em><b>Scope Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Schema</em>' attribute.
	 * @see #setScopeSchema(String)
	 * @see Sql.SqlPackage#getColumn_ScopeSchema()
	 * @model annotation="urn:org.nasdanika.models.sql column='SCOPE_SCHEMA'"
	 * @generated
	 */
	String getScopeSchema();

	/**
	 * Sets the value of the '{@link Sql.Column#getScopeSchema <em>Scope Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Schema</em>' attribute.
	 * @see #getScopeSchema()
	 * @generated
	 */
	void setScopeSchema(String value);

	/**
	 * Returns the value of the '<em><b>Scope Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Table</em>' attribute.
	 * @see #setScopeTable(String)
	 * @see Sql.SqlPackage#getColumn_ScopeTable()
	 * @model annotation="urn:org.nasdanika.models.sql column='SCOPE_TABLE'"
	 * @generated
	 */
	String getScopeTable();

	/**
	 * Sets the value of the '{@link Sql.Column#getScopeTable <em>Scope Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Table</em>' attribute.
	 * @see #getScopeTable()
	 * @generated
	 */
	void setScopeTable(String value);

	/**
	 * Returns the value of the '<em><b>Source Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Data Type</em>' attribute.
	 * @see #setSourceDataType(Short)
	 * @see Sql.SqlPackage#getColumn_SourceDataType()
	 * @model annotation="urn:org.nasdanika.models.sql column='SOURCE_DATA_TYPE'"
	 * @generated
	 */
	Short getSourceDataType();

	/**
	 * Sets the value of the '{@link Sql.Column#getSourceDataType <em>Source Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Data Type</em>' attribute.
	 * @see #getSourceDataType()
	 * @generated
	 */
	void setSourceDataType(Short value);

	/**
	 * Returns the value of the '<em><b>Is Autoincrement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Autoincrement</em>' attribute.
	 * @see #setIsAutoincrement(String)
	 * @see Sql.SqlPackage#getColumn_IsAutoincrement()
	 * @model annotation="urn:org.nasdanika.models.sql column='IS_AUTOINCREMENT'"
	 * @generated
	 */
	String getIsAutoincrement();

	/**
	 * Sets the value of the '{@link Sql.Column#getIsAutoincrement <em>Is Autoincrement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Autoincrement</em>' attribute.
	 * @see #getIsAutoincrement()
	 * @generated
	 */
	void setIsAutoincrement(String value);

	/**
	 * Returns the value of the '<em><b>Is Generatedcolumn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Generatedcolumn</em>' attribute.
	 * @see #setIsGeneratedcolumn(String)
	 * @see Sql.SqlPackage#getColumn_IsGeneratedcolumn()
	 * @model annotation="urn:org.nasdanika.models.sql column='IS_GENERATEDCOLUMN'"
	 * @generated
	 */
	String getIsGeneratedcolumn();

	/**
	 * Sets the value of the '{@link Sql.Column#getIsGeneratedcolumn <em>Is Generatedcolumn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Generatedcolumn</em>' attribute.
	 * @see #getIsGeneratedcolumn()
	 * @generated
	 */
	void setIsGeneratedcolumn(String value);

} // Column
