/**
 */
package Sql.impl;

import Sql.DataType;
import Sql.SqlPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Sql.impl.DataTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getLiteralPrefix <em>Literal Prefix</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getLiteralSuffix <em>Literal Suffix</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getCreateParams <em>Create Params</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getNullable <em>Nullable</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getSearchable <em>Searchable</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getUnsignedAttribute <em>Unsigned Attribute</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getFixedPrecScale <em>Fixed Prec Scale</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getAutoIncrement <em>Auto Increment</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getLocalTypeName <em>Local Type Name</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getMinimumScale <em>Minimum Scale</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getMaximumScale <em>Maximum Scale</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getSqlDataType <em>Sql Data Type</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getSqlDatetimeSub <em>Sql Datetime Sub</em>}</li>
 *   <li>{@link Sql.impl.DataTypeImpl#getNumPrecRadix <em>Num Prec Radix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends MinimalEObjectImpl.Container implements DataType {
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
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRECISION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLiteralPrefix() <em>Literal Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String LITERAL_PREFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLiteralSuffix() <em>Literal Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String LITERAL_SUFFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCreateParams() <em>Create Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateParams()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_PARAMS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable()
	 * @generated
	 * @ordered
	 */
	protected static final Short NULLABLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CASE_SENSITIVE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSearchable() <em>Searchable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchable()
	 * @generated
	 * @ordered
	 */
	protected static final Short SEARCHABLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUnsignedAttribute() <em>Unsigned Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsignedAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNSIGNED_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFixedPrecScale() <em>Fixed Prec Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPrecScale()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FIXED_PREC_SCALE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAutoIncrement() <em>Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_INCREMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLocalTypeName() <em>Local Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_TYPE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinimumScale() <em>Minimum Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumScale()
	 * @generated
	 * @ordered
	 */
	protected static final Short MINIMUM_SCALE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaximumScale() <em>Maximum Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumScale()
	 * @generated
	 * @ordered
	 */
	protected static final Short MAXIMUM_SCALE_EDEFAULT = null;

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
	 * The default value of the '{@link #getNumPrecRadix() <em>Num Prec Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPrecRadix()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUM_PREC_RADIX_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeName() {
		return (String)eDynamicGet(SqlPackage.DATA_TYPE__TYPE_NAME, SqlPackage.Literals.DATA_TYPE__TYPE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeName(String newTypeName) {
		eDynamicSet(SqlPackage.DATA_TYPE__TYPE_NAME, SqlPackage.Literals.DATA_TYPE__TYPE_NAME, newTypeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataType() {
		return (Integer)eDynamicGet(SqlPackage.DATA_TYPE__DATA_TYPE, SqlPackage.Literals.DATA_TYPE__DATA_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(Integer newDataType) {
		eDynamicSet(SqlPackage.DATA_TYPE__DATA_TYPE, SqlPackage.Literals.DATA_TYPE__DATA_TYPE, newDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrecision() {
		return (Integer)eDynamicGet(SqlPackage.DATA_TYPE__PRECISION, SqlPackage.Literals.DATA_TYPE__PRECISION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecision(Integer newPrecision) {
		eDynamicSet(SqlPackage.DATA_TYPE__PRECISION, SqlPackage.Literals.DATA_TYPE__PRECISION, newPrecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteralPrefix() {
		return (String)eDynamicGet(SqlPackage.DATA_TYPE__LITERAL_PREFIX, SqlPackage.Literals.DATA_TYPE__LITERAL_PREFIX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiteralPrefix(String newLiteralPrefix) {
		eDynamicSet(SqlPackage.DATA_TYPE__LITERAL_PREFIX, SqlPackage.Literals.DATA_TYPE__LITERAL_PREFIX, newLiteralPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteralSuffix() {
		return (String)eDynamicGet(SqlPackage.DATA_TYPE__LITERAL_SUFFIX, SqlPackage.Literals.DATA_TYPE__LITERAL_SUFFIX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiteralSuffix(String newLiteralSuffix) {
		eDynamicSet(SqlPackage.DATA_TYPE__LITERAL_SUFFIX, SqlPackage.Literals.DATA_TYPE__LITERAL_SUFFIX, newLiteralSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateParams() {
		return (String)eDynamicGet(SqlPackage.DATA_TYPE__CREATE_PARAMS, SqlPackage.Literals.DATA_TYPE__CREATE_PARAMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateParams(String newCreateParams) {
		eDynamicSet(SqlPackage.DATA_TYPE__CREATE_PARAMS, SqlPackage.Literals.DATA_TYPE__CREATE_PARAMS, newCreateParams);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Short getNullable() {
		return (Short)eDynamicGet(SqlPackage.DATA_TYPE__NULLABLE, SqlPackage.Literals.DATA_TYPE__NULLABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullable(Short newNullable) {
		eDynamicSet(SqlPackage.DATA_TYPE__NULLABLE, SqlPackage.Literals.DATA_TYPE__NULLABLE, newNullable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCaseSensitive() {
		return (Boolean)eDynamicGet(SqlPackage.DATA_TYPE__CASE_SENSITIVE, SqlPackage.Literals.DATA_TYPE__CASE_SENSITIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseSensitive(Boolean newCaseSensitive) {
		eDynamicSet(SqlPackage.DATA_TYPE__CASE_SENSITIVE, SqlPackage.Literals.DATA_TYPE__CASE_SENSITIVE, newCaseSensitive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Short getSearchable() {
		return (Short)eDynamicGet(SqlPackage.DATA_TYPE__SEARCHABLE, SqlPackage.Literals.DATA_TYPE__SEARCHABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSearchable(Short newSearchable) {
		eDynamicSet(SqlPackage.DATA_TYPE__SEARCHABLE, SqlPackage.Literals.DATA_TYPE__SEARCHABLE, newSearchable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUnsignedAttribute() {
		return (Boolean)eDynamicGet(SqlPackage.DATA_TYPE__UNSIGNED_ATTRIBUTE, SqlPackage.Literals.DATA_TYPE__UNSIGNED_ATTRIBUTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnsignedAttribute(Boolean newUnsignedAttribute) {
		eDynamicSet(SqlPackage.DATA_TYPE__UNSIGNED_ATTRIBUTE, SqlPackage.Literals.DATA_TYPE__UNSIGNED_ATTRIBUTE, newUnsignedAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFixedPrecScale() {
		return (Boolean)eDynamicGet(SqlPackage.DATA_TYPE__FIXED_PREC_SCALE, SqlPackage.Literals.DATA_TYPE__FIXED_PREC_SCALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedPrecScale(Boolean newFixedPrecScale) {
		eDynamicSet(SqlPackage.DATA_TYPE__FIXED_PREC_SCALE, SqlPackage.Literals.DATA_TYPE__FIXED_PREC_SCALE, newFixedPrecScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoIncrement() {
		return (Boolean)eDynamicGet(SqlPackage.DATA_TYPE__AUTO_INCREMENT, SqlPackage.Literals.DATA_TYPE__AUTO_INCREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoIncrement(Boolean newAutoIncrement) {
		eDynamicSet(SqlPackage.DATA_TYPE__AUTO_INCREMENT, SqlPackage.Literals.DATA_TYPE__AUTO_INCREMENT, newAutoIncrement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalTypeName() {
		return (String)eDynamicGet(SqlPackage.DATA_TYPE__LOCAL_TYPE_NAME, SqlPackage.Literals.DATA_TYPE__LOCAL_TYPE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalTypeName(String newLocalTypeName) {
		eDynamicSet(SqlPackage.DATA_TYPE__LOCAL_TYPE_NAME, SqlPackage.Literals.DATA_TYPE__LOCAL_TYPE_NAME, newLocalTypeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Short getMinimumScale() {
		return (Short)eDynamicGet(SqlPackage.DATA_TYPE__MINIMUM_SCALE, SqlPackage.Literals.DATA_TYPE__MINIMUM_SCALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumScale(Short newMinimumScale) {
		eDynamicSet(SqlPackage.DATA_TYPE__MINIMUM_SCALE, SqlPackage.Literals.DATA_TYPE__MINIMUM_SCALE, newMinimumScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Short getMaximumScale() {
		return (Short)eDynamicGet(SqlPackage.DATA_TYPE__MAXIMUM_SCALE, SqlPackage.Literals.DATA_TYPE__MAXIMUM_SCALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumScale(Short newMaximumScale) {
		eDynamicSet(SqlPackage.DATA_TYPE__MAXIMUM_SCALE, SqlPackage.Literals.DATA_TYPE__MAXIMUM_SCALE, newMaximumScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSqlDataType() {
		return (Integer)eDynamicGet(SqlPackage.DATA_TYPE__SQL_DATA_TYPE, SqlPackage.Literals.DATA_TYPE__SQL_DATA_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSqlDataType(Integer newSqlDataType) {
		eDynamicSet(SqlPackage.DATA_TYPE__SQL_DATA_TYPE, SqlPackage.Literals.DATA_TYPE__SQL_DATA_TYPE, newSqlDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSqlDatetimeSub() {
		return (Integer)eDynamicGet(SqlPackage.DATA_TYPE__SQL_DATETIME_SUB, SqlPackage.Literals.DATA_TYPE__SQL_DATETIME_SUB, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSqlDatetimeSub(Integer newSqlDatetimeSub) {
		eDynamicSet(SqlPackage.DATA_TYPE__SQL_DATETIME_SUB, SqlPackage.Literals.DATA_TYPE__SQL_DATETIME_SUB, newSqlDatetimeSub);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumPrecRadix() {
		return (Integer)eDynamicGet(SqlPackage.DATA_TYPE__NUM_PREC_RADIX, SqlPackage.Literals.DATA_TYPE__NUM_PREC_RADIX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumPrecRadix(Integer newNumPrecRadix) {
		eDynamicSet(SqlPackage.DATA_TYPE__NUM_PREC_RADIX, SqlPackage.Literals.DATA_TYPE__NUM_PREC_RADIX, newNumPrecRadix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlPackage.DATA_TYPE__TYPE_NAME:
				return getTypeName();
			case SqlPackage.DATA_TYPE__DATA_TYPE:
				return getDataType();
			case SqlPackage.DATA_TYPE__PRECISION:
				return getPrecision();
			case SqlPackage.DATA_TYPE__LITERAL_PREFIX:
				return getLiteralPrefix();
			case SqlPackage.DATA_TYPE__LITERAL_SUFFIX:
				return getLiteralSuffix();
			case SqlPackage.DATA_TYPE__CREATE_PARAMS:
				return getCreateParams();
			case SqlPackage.DATA_TYPE__NULLABLE:
				return getNullable();
			case SqlPackage.DATA_TYPE__CASE_SENSITIVE:
				return getCaseSensitive();
			case SqlPackage.DATA_TYPE__SEARCHABLE:
				return getSearchable();
			case SqlPackage.DATA_TYPE__UNSIGNED_ATTRIBUTE:
				return getUnsignedAttribute();
			case SqlPackage.DATA_TYPE__FIXED_PREC_SCALE:
				return getFixedPrecScale();
			case SqlPackage.DATA_TYPE__AUTO_INCREMENT:
				return getAutoIncrement();
			case SqlPackage.DATA_TYPE__LOCAL_TYPE_NAME:
				return getLocalTypeName();
			case SqlPackage.DATA_TYPE__MINIMUM_SCALE:
				return getMinimumScale();
			case SqlPackage.DATA_TYPE__MAXIMUM_SCALE:
				return getMaximumScale();
			case SqlPackage.DATA_TYPE__SQL_DATA_TYPE:
				return getSqlDataType();
			case SqlPackage.DATA_TYPE__SQL_DATETIME_SUB:
				return getSqlDatetimeSub();
			case SqlPackage.DATA_TYPE__NUM_PREC_RADIX:
				return getNumPrecRadix();
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
			case SqlPackage.DATA_TYPE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case SqlPackage.DATA_TYPE__DATA_TYPE:
				setDataType((Integer)newValue);
				return;
			case SqlPackage.DATA_TYPE__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case SqlPackage.DATA_TYPE__LITERAL_PREFIX:
				setLiteralPrefix((String)newValue);
				return;
			case SqlPackage.DATA_TYPE__LITERAL_SUFFIX:
				setLiteralSuffix((String)newValue);
				return;
			case SqlPackage.DATA_TYPE__CREATE_PARAMS:
				setCreateParams((String)newValue);
				return;
			case SqlPackage.DATA_TYPE__NULLABLE:
				setNullable((Short)newValue);
				return;
			case SqlPackage.DATA_TYPE__CASE_SENSITIVE:
				setCaseSensitive((Boolean)newValue);
				return;
			case SqlPackage.DATA_TYPE__SEARCHABLE:
				setSearchable((Short)newValue);
				return;
			case SqlPackage.DATA_TYPE__UNSIGNED_ATTRIBUTE:
				setUnsignedAttribute((Boolean)newValue);
				return;
			case SqlPackage.DATA_TYPE__FIXED_PREC_SCALE:
				setFixedPrecScale((Boolean)newValue);
				return;
			case SqlPackage.DATA_TYPE__AUTO_INCREMENT:
				setAutoIncrement((Boolean)newValue);
				return;
			case SqlPackage.DATA_TYPE__LOCAL_TYPE_NAME:
				setLocalTypeName((String)newValue);
				return;
			case SqlPackage.DATA_TYPE__MINIMUM_SCALE:
				setMinimumScale((Short)newValue);
				return;
			case SqlPackage.DATA_TYPE__MAXIMUM_SCALE:
				setMaximumScale((Short)newValue);
				return;
			case SqlPackage.DATA_TYPE__SQL_DATA_TYPE:
				setSqlDataType((Integer)newValue);
				return;
			case SqlPackage.DATA_TYPE__SQL_DATETIME_SUB:
				setSqlDatetimeSub((Integer)newValue);
				return;
			case SqlPackage.DATA_TYPE__NUM_PREC_RADIX:
				setNumPrecRadix((Integer)newValue);
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
			case SqlPackage.DATA_TYPE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__LITERAL_PREFIX:
				setLiteralPrefix(LITERAL_PREFIX_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__LITERAL_SUFFIX:
				setLiteralSuffix(LITERAL_SUFFIX_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__CREATE_PARAMS:
				setCreateParams(CREATE_PARAMS_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__CASE_SENSITIVE:
				setCaseSensitive(CASE_SENSITIVE_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__SEARCHABLE:
				setSearchable(SEARCHABLE_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__UNSIGNED_ATTRIBUTE:
				setUnsignedAttribute(UNSIGNED_ATTRIBUTE_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__FIXED_PREC_SCALE:
				setFixedPrecScale(FIXED_PREC_SCALE_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__AUTO_INCREMENT:
				setAutoIncrement(AUTO_INCREMENT_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__LOCAL_TYPE_NAME:
				setLocalTypeName(LOCAL_TYPE_NAME_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__MINIMUM_SCALE:
				setMinimumScale(MINIMUM_SCALE_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__MAXIMUM_SCALE:
				setMaximumScale(MAXIMUM_SCALE_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__SQL_DATA_TYPE:
				setSqlDataType(SQL_DATA_TYPE_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__SQL_DATETIME_SUB:
				setSqlDatetimeSub(SQL_DATETIME_SUB_EDEFAULT);
				return;
			case SqlPackage.DATA_TYPE__NUM_PREC_RADIX:
				setNumPrecRadix(NUM_PREC_RADIX_EDEFAULT);
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
			case SqlPackage.DATA_TYPE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? getTypeName() != null : !TYPE_NAME_EDEFAULT.equals(getTypeName());
			case SqlPackage.DATA_TYPE__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? getDataType() != null : !DATA_TYPE_EDEFAULT.equals(getDataType());
			case SqlPackage.DATA_TYPE__PRECISION:
				return PRECISION_EDEFAULT == null ? getPrecision() != null : !PRECISION_EDEFAULT.equals(getPrecision());
			case SqlPackage.DATA_TYPE__LITERAL_PREFIX:
				return LITERAL_PREFIX_EDEFAULT == null ? getLiteralPrefix() != null : !LITERAL_PREFIX_EDEFAULT.equals(getLiteralPrefix());
			case SqlPackage.DATA_TYPE__LITERAL_SUFFIX:
				return LITERAL_SUFFIX_EDEFAULT == null ? getLiteralSuffix() != null : !LITERAL_SUFFIX_EDEFAULT.equals(getLiteralSuffix());
			case SqlPackage.DATA_TYPE__CREATE_PARAMS:
				return CREATE_PARAMS_EDEFAULT == null ? getCreateParams() != null : !CREATE_PARAMS_EDEFAULT.equals(getCreateParams());
			case SqlPackage.DATA_TYPE__NULLABLE:
				return NULLABLE_EDEFAULT == null ? getNullable() != null : !NULLABLE_EDEFAULT.equals(getNullable());
			case SqlPackage.DATA_TYPE__CASE_SENSITIVE:
				return CASE_SENSITIVE_EDEFAULT == null ? getCaseSensitive() != null : !CASE_SENSITIVE_EDEFAULT.equals(getCaseSensitive());
			case SqlPackage.DATA_TYPE__SEARCHABLE:
				return SEARCHABLE_EDEFAULT == null ? getSearchable() != null : !SEARCHABLE_EDEFAULT.equals(getSearchable());
			case SqlPackage.DATA_TYPE__UNSIGNED_ATTRIBUTE:
				return UNSIGNED_ATTRIBUTE_EDEFAULT == null ? getUnsignedAttribute() != null : !UNSIGNED_ATTRIBUTE_EDEFAULT.equals(getUnsignedAttribute());
			case SqlPackage.DATA_TYPE__FIXED_PREC_SCALE:
				return FIXED_PREC_SCALE_EDEFAULT == null ? getFixedPrecScale() != null : !FIXED_PREC_SCALE_EDEFAULT.equals(getFixedPrecScale());
			case SqlPackage.DATA_TYPE__AUTO_INCREMENT:
				return AUTO_INCREMENT_EDEFAULT == null ? getAutoIncrement() != null : !AUTO_INCREMENT_EDEFAULT.equals(getAutoIncrement());
			case SqlPackage.DATA_TYPE__LOCAL_TYPE_NAME:
				return LOCAL_TYPE_NAME_EDEFAULT == null ? getLocalTypeName() != null : !LOCAL_TYPE_NAME_EDEFAULT.equals(getLocalTypeName());
			case SqlPackage.DATA_TYPE__MINIMUM_SCALE:
				return MINIMUM_SCALE_EDEFAULT == null ? getMinimumScale() != null : !MINIMUM_SCALE_EDEFAULT.equals(getMinimumScale());
			case SqlPackage.DATA_TYPE__MAXIMUM_SCALE:
				return MAXIMUM_SCALE_EDEFAULT == null ? getMaximumScale() != null : !MAXIMUM_SCALE_EDEFAULT.equals(getMaximumScale());
			case SqlPackage.DATA_TYPE__SQL_DATA_TYPE:
				return SQL_DATA_TYPE_EDEFAULT == null ? getSqlDataType() != null : !SQL_DATA_TYPE_EDEFAULT.equals(getSqlDataType());
			case SqlPackage.DATA_TYPE__SQL_DATETIME_SUB:
				return SQL_DATETIME_SUB_EDEFAULT == null ? getSqlDatetimeSub() != null : !SQL_DATETIME_SUB_EDEFAULT.equals(getSqlDatetimeSub());
			case SqlPackage.DATA_TYPE__NUM_PREC_RADIX:
				return NUM_PREC_RADIX_EDEFAULT == null ? getNumPrecRadix() != null : !NUM_PREC_RADIX_EDEFAULT.equals(getNumPrecRadix());
		}
		return super.eIsSet(featureID);
	}

} //DataTypeImpl
