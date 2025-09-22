/**
 */
package org.nasdanika.models.sql.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.sql.Column;
import org.nasdanika.models.sql.DataType;
import org.nasdanika.models.sql.SqlPackage;

import org.nasdanika.models.sql.Type;
import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getColumnSize <em>Column Size</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getBufferLength <em>Buffer Length</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getDecimalDigits <em>Decimal Digits</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getNumPrecRadix <em>Num Prec Radix</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getNullable <em>Nullable</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getColumnDef <em>Column Def</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getSqlDataType <em>Sql Data Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getSqlDatetimeSub <em>Sql Datetime Sub</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getCharOctetLength <em>Char Octet Length</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getOrdinalPosition <em>Ordinal Position</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getIsNullable <em>Is Nullable</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getScopeCatalog <em>Scope Catalog</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getScopeSchema <em>Scope Schema</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getScopeTable <em>Scope Table</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getSourceDataType <em>Source Data Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getIsAutoincrement <em>Is Autoincrement</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ColumnImpl#getIsGeneratedcolumn <em>Is Generatedcolumn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends DocumentedNamedElementImpl implements Column {
	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final Type DATA_TYPE_EDEFAULT = Type.ARRAY;
	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getColumnSize() <em>Column Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COLUMN_SIZE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getBufferLength() <em>Buffer Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BUFFER_LENGTH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDecimalDigits() <em>Decimal Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalDigits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DECIMAL_DIGITS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNumPrecRadix() <em>Num Prec Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPrecRadix()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUM_PREC_RADIX_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NULLABLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getColumnDef() <em>Column Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnDef()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_DEF_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSqlDataType() <em>Sql Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlDataType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SQL_DATA_TYPE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSqlDatetimeSub() <em>Sql Datetime Sub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSqlDatetimeSub()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SQL_DATETIME_SUB_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCharOctetLength() <em>Char Octet Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharOctetLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHAR_OCTET_LENGTH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getOrdinalPosition() <em>Ordinal Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinalPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORDINAL_POSITION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getIsNullable() <em>Is Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsNullable()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_NULLABLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getScopeCatalog() <em>Scope Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_CATALOG_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getScopeSchema() <em>Scope Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_SCHEMA_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getScopeTable() <em>Scope Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeTable()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_TABLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSourceDataType() <em>Source Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDataType()
	 * @generated
	 * @ordered
	 */
	protected static final Short SOURCE_DATA_TYPE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getIsAutoincrement() <em>Is Autoincrement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAutoincrement()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_AUTOINCREMENT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getIsGeneratedcolumn() <em>Is Generatedcolumn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsGeneratedcolumn()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_GENERATEDCOLUMN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getType() {
		return (DataType)eDynamicGet(SqlPackage.COLUMN__TYPE, SqlPackage.Literals.COLUMN__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetType() {
		return (DataType)eDynamicGet(SqlPackage.COLUMN__TYPE, SqlPackage.Literals.COLUMN__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DataType newType) {
		eDynamicSet(SqlPackage.COLUMN__TYPE, SqlPackage.Literals.COLUMN__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getDataType() {
		return (Type)eDynamicGet(SqlPackage.COLUMN__DATA_TYPE, SqlPackage.Literals.COLUMN__DATA_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(Type newDataType) {
		eDynamicSet(SqlPackage.COLUMN__DATA_TYPE, SqlPackage.Literals.COLUMN__DATA_TYPE, newDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeName() {
		return (String)eDynamicGet(SqlPackage.COLUMN__TYPE_NAME, SqlPackage.Literals.COLUMN__TYPE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeName(String newTypeName) {
		eDynamicSet(SqlPackage.COLUMN__TYPE_NAME, SqlPackage.Literals.COLUMN__TYPE_NAME, newTypeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getColumnSize() {
		return (Integer)eDynamicGet(SqlPackage.COLUMN__COLUMN_SIZE, SqlPackage.Literals.COLUMN__COLUMN_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnSize(Integer newColumnSize) {
		eDynamicSet(SqlPackage.COLUMN__COLUMN_SIZE, SqlPackage.Literals.COLUMN__COLUMN_SIZE, newColumnSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBufferLength() {
		return (Integer)eDynamicGet(SqlPackage.COLUMN__BUFFER_LENGTH, SqlPackage.Literals.COLUMN__BUFFER_LENGTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBufferLength(Integer newBufferLength) {
		eDynamicSet(SqlPackage.COLUMN__BUFFER_LENGTH, SqlPackage.Literals.COLUMN__BUFFER_LENGTH, newBufferLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDecimalDigits() {
		return (Integer)eDynamicGet(SqlPackage.COLUMN__DECIMAL_DIGITS, SqlPackage.Literals.COLUMN__DECIMAL_DIGITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecimalDigits(Integer newDecimalDigits) {
		eDynamicSet(SqlPackage.COLUMN__DECIMAL_DIGITS, SqlPackage.Literals.COLUMN__DECIMAL_DIGITS, newDecimalDigits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumPrecRadix() {
		return (Integer)eDynamicGet(SqlPackage.COLUMN__NUM_PREC_RADIX, SqlPackage.Literals.COLUMN__NUM_PREC_RADIX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumPrecRadix(Integer newNumPrecRadix) {
		eDynamicSet(SqlPackage.COLUMN__NUM_PREC_RADIX, SqlPackage.Literals.COLUMN__NUM_PREC_RADIX, newNumPrecRadix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNullable() {
		return (Integer)eDynamicGet(SqlPackage.COLUMN__NULLABLE, SqlPackage.Literals.COLUMN__NULLABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullable(Integer newNullable) {
		eDynamicSet(SqlPackage.COLUMN__NULLABLE, SqlPackage.Literals.COLUMN__NULLABLE, newNullable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return (String)eDynamicGet(SqlPackage.COLUMN__REMARKS, SqlPackage.Literals.COLUMN__REMARKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		eDynamicSet(SqlPackage.COLUMN__REMARKS, SqlPackage.Literals.COLUMN__REMARKS, newRemarks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColumnDef() {
		return (String)eDynamicGet(SqlPackage.COLUMN__COLUMN_DEF, SqlPackage.Literals.COLUMN__COLUMN_DEF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnDef(String newColumnDef) {
		eDynamicSet(SqlPackage.COLUMN__COLUMN_DEF, SqlPackage.Literals.COLUMN__COLUMN_DEF, newColumnDef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSqlDataType() {
		return (Integer)eDynamicGet(SqlPackage.COLUMN__SQL_DATA_TYPE, SqlPackage.Literals.COLUMN__SQL_DATA_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSqlDataType(Integer newSqlDataType) {
		eDynamicSet(SqlPackage.COLUMN__SQL_DATA_TYPE, SqlPackage.Literals.COLUMN__SQL_DATA_TYPE, newSqlDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSqlDatetimeSub() {
		return (Integer)eDynamicGet(SqlPackage.COLUMN__SQL_DATETIME_SUB, SqlPackage.Literals.COLUMN__SQL_DATETIME_SUB, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSqlDatetimeSub(Integer newSqlDatetimeSub) {
		eDynamicSet(SqlPackage.COLUMN__SQL_DATETIME_SUB, SqlPackage.Literals.COLUMN__SQL_DATETIME_SUB, newSqlDatetimeSub);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCharOctetLength() {
		return (Integer)eDynamicGet(SqlPackage.COLUMN__CHAR_OCTET_LENGTH, SqlPackage.Literals.COLUMN__CHAR_OCTET_LENGTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharOctetLength(Integer newCharOctetLength) {
		eDynamicSet(SqlPackage.COLUMN__CHAR_OCTET_LENGTH, SqlPackage.Literals.COLUMN__CHAR_OCTET_LENGTH, newCharOctetLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOrdinalPosition() {
		return (Integer)eDynamicGet(SqlPackage.COLUMN__ORDINAL_POSITION, SqlPackage.Literals.COLUMN__ORDINAL_POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrdinalPosition(Integer newOrdinalPosition) {
		eDynamicSet(SqlPackage.COLUMN__ORDINAL_POSITION, SqlPackage.Literals.COLUMN__ORDINAL_POSITION, newOrdinalPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIsNullable() {
		return (String)eDynamicGet(SqlPackage.COLUMN__IS_NULLABLE, SqlPackage.Literals.COLUMN__IS_NULLABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNullable(String newIsNullable) {
		eDynamicSet(SqlPackage.COLUMN__IS_NULLABLE, SqlPackage.Literals.COLUMN__IS_NULLABLE, newIsNullable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScopeCatalog() {
		return (String)eDynamicGet(SqlPackage.COLUMN__SCOPE_CATALOG, SqlPackage.Literals.COLUMN__SCOPE_CATALOG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScopeCatalog(String newScopeCatalog) {
		eDynamicSet(SqlPackage.COLUMN__SCOPE_CATALOG, SqlPackage.Literals.COLUMN__SCOPE_CATALOG, newScopeCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScopeSchema() {
		return (String)eDynamicGet(SqlPackage.COLUMN__SCOPE_SCHEMA, SqlPackage.Literals.COLUMN__SCOPE_SCHEMA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScopeSchema(String newScopeSchema) {
		eDynamicSet(SqlPackage.COLUMN__SCOPE_SCHEMA, SqlPackage.Literals.COLUMN__SCOPE_SCHEMA, newScopeSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScopeTable() {
		return (String)eDynamicGet(SqlPackage.COLUMN__SCOPE_TABLE, SqlPackage.Literals.COLUMN__SCOPE_TABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScopeTable(String newScopeTable) {
		eDynamicSet(SqlPackage.COLUMN__SCOPE_TABLE, SqlPackage.Literals.COLUMN__SCOPE_TABLE, newScopeTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Short getSourceDataType() {
		return (Short)eDynamicGet(SqlPackage.COLUMN__SOURCE_DATA_TYPE, SqlPackage.Literals.COLUMN__SOURCE_DATA_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceDataType(Short newSourceDataType) {
		eDynamicSet(SqlPackage.COLUMN__SOURCE_DATA_TYPE, SqlPackage.Literals.COLUMN__SOURCE_DATA_TYPE, newSourceDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIsAutoincrement() {
		return (String)eDynamicGet(SqlPackage.COLUMN__IS_AUTOINCREMENT, SqlPackage.Literals.COLUMN__IS_AUTOINCREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAutoincrement(String newIsAutoincrement) {
		eDynamicSet(SqlPackage.COLUMN__IS_AUTOINCREMENT, SqlPackage.Literals.COLUMN__IS_AUTOINCREMENT, newIsAutoincrement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIsGeneratedcolumn() {
		return (String)eDynamicGet(SqlPackage.COLUMN__IS_GENERATEDCOLUMN, SqlPackage.Literals.COLUMN__IS_GENERATEDCOLUMN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsGeneratedcolumn(String newIsGeneratedcolumn) {
		eDynamicSet(SqlPackage.COLUMN__IS_GENERATEDCOLUMN, SqlPackage.Literals.COLUMN__IS_GENERATEDCOLUMN, newIsGeneratedcolumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlPackage.COLUMN__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case SqlPackage.COLUMN__DATA_TYPE:
				return getDataType();
			case SqlPackage.COLUMN__TYPE_NAME:
				return getTypeName();
			case SqlPackage.COLUMN__COLUMN_SIZE:
				return getColumnSize();
			case SqlPackage.COLUMN__BUFFER_LENGTH:
				return getBufferLength();
			case SqlPackage.COLUMN__DECIMAL_DIGITS:
				return getDecimalDigits();
			case SqlPackage.COLUMN__NUM_PREC_RADIX:
				return getNumPrecRadix();
			case SqlPackage.COLUMN__NULLABLE:
				return getNullable();
			case SqlPackage.COLUMN__REMARKS:
				return getRemarks();
			case SqlPackage.COLUMN__COLUMN_DEF:
				return getColumnDef();
			case SqlPackage.COLUMN__SQL_DATA_TYPE:
				return getSqlDataType();
			case SqlPackage.COLUMN__SQL_DATETIME_SUB:
				return getSqlDatetimeSub();
			case SqlPackage.COLUMN__CHAR_OCTET_LENGTH:
				return getCharOctetLength();
			case SqlPackage.COLUMN__ORDINAL_POSITION:
				return getOrdinalPosition();
			case SqlPackage.COLUMN__IS_NULLABLE:
				return getIsNullable();
			case SqlPackage.COLUMN__SCOPE_CATALOG:
				return getScopeCatalog();
			case SqlPackage.COLUMN__SCOPE_SCHEMA:
				return getScopeSchema();
			case SqlPackage.COLUMN__SCOPE_TABLE:
				return getScopeTable();
			case SqlPackage.COLUMN__SOURCE_DATA_TYPE:
				return getSourceDataType();
			case SqlPackage.COLUMN__IS_AUTOINCREMENT:
				return getIsAutoincrement();
			case SqlPackage.COLUMN__IS_GENERATEDCOLUMN:
				return getIsGeneratedcolumn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SqlPackage.COLUMN__TYPE:
				setType((DataType)newValue);
				return;
			case SqlPackage.COLUMN__DATA_TYPE:
				setDataType((Type)newValue);
				return;
			case SqlPackage.COLUMN__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case SqlPackage.COLUMN__COLUMN_SIZE:
				setColumnSize((Integer)newValue);
				return;
			case SqlPackage.COLUMN__BUFFER_LENGTH:
				setBufferLength((Integer)newValue);
				return;
			case SqlPackage.COLUMN__DECIMAL_DIGITS:
				setDecimalDigits((Integer)newValue);
				return;
			case SqlPackage.COLUMN__NUM_PREC_RADIX:
				setNumPrecRadix((Integer)newValue);
				return;
			case SqlPackage.COLUMN__NULLABLE:
				setNullable((Integer)newValue);
				return;
			case SqlPackage.COLUMN__REMARKS:
				setRemarks((String)newValue);
				return;
			case SqlPackage.COLUMN__COLUMN_DEF:
				setColumnDef((String)newValue);
				return;
			case SqlPackage.COLUMN__SQL_DATA_TYPE:
				setSqlDataType((Integer)newValue);
				return;
			case SqlPackage.COLUMN__SQL_DATETIME_SUB:
				setSqlDatetimeSub((Integer)newValue);
				return;
			case SqlPackage.COLUMN__CHAR_OCTET_LENGTH:
				setCharOctetLength((Integer)newValue);
				return;
			case SqlPackage.COLUMN__ORDINAL_POSITION:
				setOrdinalPosition((Integer)newValue);
				return;
			case SqlPackage.COLUMN__IS_NULLABLE:
				setIsNullable((String)newValue);
				return;
			case SqlPackage.COLUMN__SCOPE_CATALOG:
				setScopeCatalog((String)newValue);
				return;
			case SqlPackage.COLUMN__SCOPE_SCHEMA:
				setScopeSchema((String)newValue);
				return;
			case SqlPackage.COLUMN__SCOPE_TABLE:
				setScopeTable((String)newValue);
				return;
			case SqlPackage.COLUMN__SOURCE_DATA_TYPE:
				setSourceDataType((Short)newValue);
				return;
			case SqlPackage.COLUMN__IS_AUTOINCREMENT:
				setIsAutoincrement((String)newValue);
				return;
			case SqlPackage.COLUMN__IS_GENERATEDCOLUMN:
				setIsGeneratedcolumn((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SqlPackage.COLUMN__TYPE:
				setType((DataType)null);
				return;
			case SqlPackage.COLUMN__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case SqlPackage.COLUMN__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case SqlPackage.COLUMN__COLUMN_SIZE:
				setColumnSize(COLUMN_SIZE_EDEFAULT);
				return;
			case SqlPackage.COLUMN__BUFFER_LENGTH:
				setBufferLength(BUFFER_LENGTH_EDEFAULT);
				return;
			case SqlPackage.COLUMN__DECIMAL_DIGITS:
				setDecimalDigits(DECIMAL_DIGITS_EDEFAULT);
				return;
			case SqlPackage.COLUMN__NUM_PREC_RADIX:
				setNumPrecRadix(NUM_PREC_RADIX_EDEFAULT);
				return;
			case SqlPackage.COLUMN__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case SqlPackage.COLUMN__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case SqlPackage.COLUMN__COLUMN_DEF:
				setColumnDef(COLUMN_DEF_EDEFAULT);
				return;
			case SqlPackage.COLUMN__SQL_DATA_TYPE:
				setSqlDataType(SQL_DATA_TYPE_EDEFAULT);
				return;
			case SqlPackage.COLUMN__SQL_DATETIME_SUB:
				setSqlDatetimeSub(SQL_DATETIME_SUB_EDEFAULT);
				return;
			case SqlPackage.COLUMN__CHAR_OCTET_LENGTH:
				setCharOctetLength(CHAR_OCTET_LENGTH_EDEFAULT);
				return;
			case SqlPackage.COLUMN__ORDINAL_POSITION:
				setOrdinalPosition(ORDINAL_POSITION_EDEFAULT);
				return;
			case SqlPackage.COLUMN__IS_NULLABLE:
				setIsNullable(IS_NULLABLE_EDEFAULT);
				return;
			case SqlPackage.COLUMN__SCOPE_CATALOG:
				setScopeCatalog(SCOPE_CATALOG_EDEFAULT);
				return;
			case SqlPackage.COLUMN__SCOPE_SCHEMA:
				setScopeSchema(SCOPE_SCHEMA_EDEFAULT);
				return;
			case SqlPackage.COLUMN__SCOPE_TABLE:
				setScopeTable(SCOPE_TABLE_EDEFAULT);
				return;
			case SqlPackage.COLUMN__SOURCE_DATA_TYPE:
				setSourceDataType(SOURCE_DATA_TYPE_EDEFAULT);
				return;
			case SqlPackage.COLUMN__IS_AUTOINCREMENT:
				setIsAutoincrement(IS_AUTOINCREMENT_EDEFAULT);
				return;
			case SqlPackage.COLUMN__IS_GENERATEDCOLUMN:
				setIsGeneratedcolumn(IS_GENERATEDCOLUMN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SqlPackage.COLUMN__TYPE:
				return basicGetType() != null;
			case SqlPackage.COLUMN__DATA_TYPE:
				return getDataType() != DATA_TYPE_EDEFAULT;
			case SqlPackage.COLUMN__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? getTypeName() != null : !TYPE_NAME_EDEFAULT.equals(getTypeName());
			case SqlPackage.COLUMN__COLUMN_SIZE:
				return COLUMN_SIZE_EDEFAULT == null ? getColumnSize() != null : !COLUMN_SIZE_EDEFAULT.equals(getColumnSize());
			case SqlPackage.COLUMN__BUFFER_LENGTH:
				return BUFFER_LENGTH_EDEFAULT == null ? getBufferLength() != null : !BUFFER_LENGTH_EDEFAULT.equals(getBufferLength());
			case SqlPackage.COLUMN__DECIMAL_DIGITS:
				return DECIMAL_DIGITS_EDEFAULT == null ? getDecimalDigits() != null : !DECIMAL_DIGITS_EDEFAULT.equals(getDecimalDigits());
			case SqlPackage.COLUMN__NUM_PREC_RADIX:
				return NUM_PREC_RADIX_EDEFAULT == null ? getNumPrecRadix() != null : !NUM_PREC_RADIX_EDEFAULT.equals(getNumPrecRadix());
			case SqlPackage.COLUMN__NULLABLE:
				return NULLABLE_EDEFAULT == null ? getNullable() != null : !NULLABLE_EDEFAULT.equals(getNullable());
			case SqlPackage.COLUMN__REMARKS:
				return REMARKS_EDEFAULT == null ? getRemarks() != null : !REMARKS_EDEFAULT.equals(getRemarks());
			case SqlPackage.COLUMN__COLUMN_DEF:
				return COLUMN_DEF_EDEFAULT == null ? getColumnDef() != null : !COLUMN_DEF_EDEFAULT.equals(getColumnDef());
			case SqlPackage.COLUMN__SQL_DATA_TYPE:
				return SQL_DATA_TYPE_EDEFAULT == null ? getSqlDataType() != null : !SQL_DATA_TYPE_EDEFAULT.equals(getSqlDataType());
			case SqlPackage.COLUMN__SQL_DATETIME_SUB:
				return SQL_DATETIME_SUB_EDEFAULT == null ? getSqlDatetimeSub() != null : !SQL_DATETIME_SUB_EDEFAULT.equals(getSqlDatetimeSub());
			case SqlPackage.COLUMN__CHAR_OCTET_LENGTH:
				return CHAR_OCTET_LENGTH_EDEFAULT == null ? getCharOctetLength() != null : !CHAR_OCTET_LENGTH_EDEFAULT.equals(getCharOctetLength());
			case SqlPackage.COLUMN__ORDINAL_POSITION:
				return ORDINAL_POSITION_EDEFAULT == null ? getOrdinalPosition() != null : !ORDINAL_POSITION_EDEFAULT.equals(getOrdinalPosition());
			case SqlPackage.COLUMN__IS_NULLABLE:
				return IS_NULLABLE_EDEFAULT == null ? getIsNullable() != null : !IS_NULLABLE_EDEFAULT.equals(getIsNullable());
			case SqlPackage.COLUMN__SCOPE_CATALOG:
				return SCOPE_CATALOG_EDEFAULT == null ? getScopeCatalog() != null : !SCOPE_CATALOG_EDEFAULT.equals(getScopeCatalog());
			case SqlPackage.COLUMN__SCOPE_SCHEMA:
				return SCOPE_SCHEMA_EDEFAULT == null ? getScopeSchema() != null : !SCOPE_SCHEMA_EDEFAULT.equals(getScopeSchema());
			case SqlPackage.COLUMN__SCOPE_TABLE:
				return SCOPE_TABLE_EDEFAULT == null ? getScopeTable() != null : !SCOPE_TABLE_EDEFAULT.equals(getScopeTable());
			case SqlPackage.COLUMN__SOURCE_DATA_TYPE:
				return SOURCE_DATA_TYPE_EDEFAULT == null ? getSourceDataType() != null : !SOURCE_DATA_TYPE_EDEFAULT.equals(getSourceDataType());
			case SqlPackage.COLUMN__IS_AUTOINCREMENT:
				return IS_AUTOINCREMENT_EDEFAULT == null ? getIsAutoincrement() != null : !IS_AUTOINCREMENT_EDEFAULT.equals(getIsAutoincrement());
			case SqlPackage.COLUMN__IS_GENERATEDCOLUMN:
				return IS_GENERATEDCOLUMN_EDEFAULT == null ? getIsGeneratedcolumn() != null : !IS_GENERATEDCOLUMN_EDEFAULT.equals(getIsGeneratedcolumn());
		}
		return super.eIsSet(featureID);
	}

} //ColumnImpl
