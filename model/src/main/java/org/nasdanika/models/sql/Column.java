/**
 */
package org.nasdanika.models.sql;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Function;

import org.nasdanika.models.sql.core.Connector;
import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.Column#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getColumnSize <em>Column Size</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getBufferLength <em>Buffer Length</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getDecimalDigits <em>Decimal Digits</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getNumPrecRadix <em>Num Prec Radix</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getNullable <em>Nullable</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getColumnDef <em>Column Def</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getSqlDataType <em>Sql Data Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getSqlDatetimeSub <em>Sql Datetime Sub</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getCharOctetLength <em>Char Octet Length</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getOrdinalPosition <em>Ordinal Position</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getScopeCatalog <em>Scope Catalog</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getScopeSchema <em>Scope Schema</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getScopeTable <em>Scope Table</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getSourceDataType <em>Source Data Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getIsAutoincrement <em>Is Autoincrement</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getIsGeneratedcolumn <em>Is Generatedcolumn</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Column#getNonNulls <em>Non Nulls</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.SqlPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.sql.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see org.nasdanika.models.sql.Type
	 * @see #setDataType(Type)
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_DataType()
	 * @model annotation="urn:org.nasdanika.models.sql enum-value='DATA_TYPE'"
	 * @generated
	 */
	Type getDataType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see org.nasdanika.models.sql.Type
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Type value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_TypeName()
	 * @model annotation="urn:org.nasdanika.models.sql column='TYPE_NAME'"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getTypeName <em>Type Name</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_ColumnSize()
	 * @model annotation="urn:org.nasdanika.models.sql column='COLUMN_SIZE'"
	 * @generated
	 */
	Integer getColumnSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getColumnSize <em>Column Size</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_BufferLength()
	 * @model annotation="urn:org.nasdanika.models.sql column='BUFFER_LENGTH'"
	 * @generated
	 */
	Integer getBufferLength();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getBufferLength <em>Buffer Length</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_DecimalDigits()
	 * @model annotation="urn:org.nasdanika.models.sql column='DECIMAL_DIGITS'"
	 * @generated
	 */
	Integer getDecimalDigits();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getDecimalDigits <em>Decimal Digits</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_NumPrecRadix()
	 * @model annotation="urn:org.nasdanika.models.sql column='NUM_PREC_RADIX'"
	 * @generated
	 */
	Integer getNumPrecRadix();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getNumPrecRadix <em>Num Prec Radix</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_Nullable()
	 * @model annotation="urn:org.nasdanika.models.sql column='NULLABLE'"
	 * @generated
	 */
	Integer getNullable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getNullable <em>Nullable</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_Remarks()
	 * @model annotation="urn:org.nasdanika.models.sql column='REMARKS'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getRemarks <em>Remarks</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_ColumnDef()
	 * @model annotation="urn:org.nasdanika.models.sql column='COLUMN_DEF'"
	 * @generated
	 */
	String getColumnDef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getColumnDef <em>Column Def</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_SqlDataType()
	 * @model annotation="urn:org.nasdanika.models.sql column='SQL_DATA_TYPE'"
	 * @generated
	 */
	Integer getSqlDataType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getSqlDataType <em>Sql Data Type</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_SqlDatetimeSub()
	 * @model annotation="urn:org.nasdanika.models.sql column='SQL_DATETIME_SUB'"
	 * @generated
	 */
	Integer getSqlDatetimeSub();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getSqlDatetimeSub <em>Sql Datetime Sub</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_CharOctetLength()
	 * @model annotation="urn:org.nasdanika.models.sql column='CHAR_OCTET_LENGTH'"
	 * @generated
	 */
	Integer getCharOctetLength();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getCharOctetLength <em>Char Octet Length</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_OrdinalPosition()
	 * @model annotation="urn:org.nasdanika.models.sql column='ORDINAL_POSITION'"
	 * @generated
	 */
	Integer getOrdinalPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getOrdinalPosition <em>Ordinal Position</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_IsNullable()
	 * @model annotation="urn:org.nasdanika.models.sql column='IS_NULLABLE'"
	 * @generated
	 */
	String getIsNullable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getIsNullable <em>Is Nullable</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_ScopeCatalog()
	 * @model annotation="urn:org.nasdanika.models.sql column='SCOPE_CATALOG'"
	 * @generated
	 */
	String getScopeCatalog();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getScopeCatalog <em>Scope Catalog</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_ScopeSchema()
	 * @model annotation="urn:org.nasdanika.models.sql column='SCOPE_SCHEMA'"
	 * @generated
	 */
	String getScopeSchema();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getScopeSchema <em>Scope Schema</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_ScopeTable()
	 * @model annotation="urn:org.nasdanika.models.sql column='SCOPE_TABLE'"
	 * @generated
	 */
	String getScopeTable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getScopeTable <em>Scope Table</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_SourceDataType()
	 * @model annotation="urn:org.nasdanika.models.sql column='SOURCE_DATA_TYPE'"
	 * @generated
	 */
	Short getSourceDataType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getSourceDataType <em>Source Data Type</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_IsAutoincrement()
	 * @model annotation="urn:org.nasdanika.models.sql column='IS_AUTOINCREMENT'"
	 * @generated
	 */
	String getIsAutoincrement();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getIsAutoincrement <em>Is Autoincrement</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_IsGeneratedcolumn()
	 * @model annotation="urn:org.nasdanika.models.sql column='IS_GENERATEDCOLUMN'"
	 * @generated
	 */
	String getIsGeneratedcolumn();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getIsGeneratedcolumn <em>Is Generatedcolumn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Generatedcolumn</em>' attribute.
	 * @see #getIsGeneratedcolumn()
	 * @generated
	 */
	void setIsGeneratedcolumn(String value);

	/**
	 * Returns the value of the '<em><b>Non Nulls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Nulls</em>' attribute.
	 * @see #setNonNulls(Long)
	 * @see org.nasdanika.models.sql.SqlPackage#getColumn_NonNulls()
	 * @model
	 * @generated
	 */
	Long getNonNulls();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Column#getNonNulls <em>Non Nulls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Nulls</em>' attribute.
	 * @see #getNonNulls()
	 * @generated
	 */
	void setNonNulls(Long value);

	default void load(
			DatabaseMetaData databaseMetaData, 
			ResultSet resultSet,
			Function<String,DataType> dataTypeResolver) throws SQLException {
		
		Connector<Column> columnConnector = new Connector<>(SqlPackage.Literals.COLUMN);
		columnConnector.inject(resultSet, this);
		setType(dataTypeResolver.apply(getTypeName()));
		setName(resultSet.getString("COLUMN_NAME"));
	}
	
	static Column create(
			DatabaseMetaData databaseMetaData, 
			ResultSet resultSet,
			Function<String,DataType> dataTypeResolver) throws SQLException {
		Column column = SqlFactory.eINSTANCE.createColumn();
		column.load(databaseMetaData, resultSet, dataTypeResolver);
		return column;		
	}	

} // Column
