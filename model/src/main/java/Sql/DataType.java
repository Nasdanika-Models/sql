/**
 */
package Sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sql.DataType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link Sql.DataType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link Sql.DataType#getPrecision <em>Precision</em>}</li>
 *   <li>{@link Sql.DataType#getLiteralPrefix <em>Literal Prefix</em>}</li>
 *   <li>{@link Sql.DataType#getLiteralSuffix <em>Literal Suffix</em>}</li>
 *   <li>{@link Sql.DataType#getCreateParams <em>Create Params</em>}</li>
 *   <li>{@link Sql.DataType#getNullable <em>Nullable</em>}</li>
 *   <li>{@link Sql.DataType#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link Sql.DataType#getSearchable <em>Searchable</em>}</li>
 *   <li>{@link Sql.DataType#getUnsignedAttribute <em>Unsigned Attribute</em>}</li>
 *   <li>{@link Sql.DataType#getFixedPrecScale <em>Fixed Prec Scale</em>}</li>
 *   <li>{@link Sql.DataType#getAutoIncrement <em>Auto Increment</em>}</li>
 *   <li>{@link Sql.DataType#getLocalTypeName <em>Local Type Name</em>}</li>
 *   <li>{@link Sql.DataType#getMinimumScale <em>Minimum Scale</em>}</li>
 *   <li>{@link Sql.DataType#getMaximumScale <em>Maximum Scale</em>}</li>
 *   <li>{@link Sql.DataType#getSqlDataType <em>Sql Data Type</em>}</li>
 *   <li>{@link Sql.DataType#getSqlDatetimeSub <em>Sql Datetime Sub</em>}</li>
 *   <li>{@link Sql.DataType#getNumPrecRadix <em>Num Prec Radix</em>}</li>
 * </ul>
 *
 * @see Sql.SqlPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see Sql.SqlPackage#getDataType_TypeName()
	 * @model annotation="urn:org.nasdanika.models.sql column='TYPE_NAME'"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link Sql.DataType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(Integer)
	 * @see Sql.SqlPackage#getDataType_DataType()
	 * @model annotation="urn:org.nasdanika.models.sql column='DATA_TYPE'"
	 * @generated
	 */
	Integer getDataType();

	/**
	 * Sets the value of the '{@link Sql.DataType#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Integer value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(Integer)
	 * @see Sql.SqlPackage#getDataType_Precision()
	 * @model annotation="urn:org.nasdanika.models.sql column='PRECISION'"
	 * @generated
	 */
	Integer getPrecision();

	/**
	 * Sets the value of the '{@link Sql.DataType#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Integer value);

	/**
	 * Returns the value of the '<em><b>Literal Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Prefix</em>' attribute.
	 * @see #setLiteralPrefix(String)
	 * @see Sql.SqlPackage#getDataType_LiteralPrefix()
	 * @model annotation="urn:org.nasdanika.models.sql column='LITERAL_PREFIX'"
	 * @generated
	 */
	String getLiteralPrefix();

	/**
	 * Sets the value of the '{@link Sql.DataType#getLiteralPrefix <em>Literal Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Prefix</em>' attribute.
	 * @see #getLiteralPrefix()
	 * @generated
	 */
	void setLiteralPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Literal Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Suffix</em>' attribute.
	 * @see #setLiteralSuffix(String)
	 * @see Sql.SqlPackage#getDataType_LiteralSuffix()
	 * @model annotation="urn:org.nasdanika.models.sql column='LITERAL_SUFFIX'"
	 * @generated
	 */
	String getLiteralSuffix();

	/**
	 * Sets the value of the '{@link Sql.DataType#getLiteralSuffix <em>Literal Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Suffix</em>' attribute.
	 * @see #getLiteralSuffix()
	 * @generated
	 */
	void setLiteralSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Create Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Params</em>' attribute.
	 * @see #setCreateParams(String)
	 * @see Sql.SqlPackage#getDataType_CreateParams()
	 * @model annotation="urn:org.nasdanika.models.sql column='CREATE_PARAMS'"
	 * @generated
	 */
	String getCreateParams();

	/**
	 * Sets the value of the '{@link Sql.DataType#getCreateParams <em>Create Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Params</em>' attribute.
	 * @see #getCreateParams()
	 * @generated
	 */
	void setCreateParams(String value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(Short)
	 * @see Sql.SqlPackage#getDataType_Nullable()
	 * @model annotation="urn:org.nasdanika.models.sql column='NULLABLE'"
	 * @generated
	 */
	Short getNullable();

	/**
	 * Sets the value of the '{@link Sql.DataType#getNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #getNullable()
	 * @generated
	 */
	void setNullable(Short value);

	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' attribute.
	 * @see #setCaseSensitive(Boolean)
	 * @see Sql.SqlPackage#getDataType_CaseSensitive()
	 * @model annotation="urn:org.nasdanika.models.sql column='CASE_SENSITIVE'"
	 * @generated
	 */
	Boolean getCaseSensitive();

	/**
	 * Sets the value of the '{@link Sql.DataType#getCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' attribute.
	 * @see #getCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Searchable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searchable</em>' attribute.
	 * @see #setSearchable(Short)
	 * @see Sql.SqlPackage#getDataType_Searchable()
	 * @model annotation="urn:org.nasdanika.models.sql column='SEARCHABLE'"
	 * @generated
	 */
	Short getSearchable();

	/**
	 * Sets the value of the '{@link Sql.DataType#getSearchable <em>Searchable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Searchable</em>' attribute.
	 * @see #getSearchable()
	 * @generated
	 */
	void setSearchable(Short value);

	/**
	 * Returns the value of the '<em><b>Unsigned Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned Attribute</em>' attribute.
	 * @see #setUnsignedAttribute(Boolean)
	 * @see Sql.SqlPackage#getDataType_UnsignedAttribute()
	 * @model annotation="urn:org.nasdanika.models.sql column='UNSIGNED_ATTRIBUTE'"
	 * @generated
	 */
	Boolean getUnsignedAttribute();

	/**
	 * Sets the value of the '{@link Sql.DataType#getUnsignedAttribute <em>Unsigned Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsigned Attribute</em>' attribute.
	 * @see #getUnsignedAttribute()
	 * @generated
	 */
	void setUnsignedAttribute(Boolean value);

	/**
	 * Returns the value of the '<em><b>Fixed Prec Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Prec Scale</em>' attribute.
	 * @see #setFixedPrecScale(Boolean)
	 * @see Sql.SqlPackage#getDataType_FixedPrecScale()
	 * @model annotation="urn:org.nasdanika.models.sql column='FIXED_PREC_SCALE'"
	 * @generated
	 */
	Boolean getFixedPrecScale();

	/**
	 * Sets the value of the '{@link Sql.DataType#getFixedPrecScale <em>Fixed Prec Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Prec Scale</em>' attribute.
	 * @see #getFixedPrecScale()
	 * @generated
	 */
	void setFixedPrecScale(Boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Increment</em>' attribute.
	 * @see #setAutoIncrement(Boolean)
	 * @see Sql.SqlPackage#getDataType_AutoIncrement()
	 * @model annotation="urn:org.nasdanika.models.sql column='AUTO_INCREMENT'"
	 * @generated
	 */
	Boolean getAutoIncrement();

	/**
	 * Sets the value of the '{@link Sql.DataType#getAutoIncrement <em>Auto Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Increment</em>' attribute.
	 * @see #getAutoIncrement()
	 * @generated
	 */
	void setAutoIncrement(Boolean value);

	/**
	 * Returns the value of the '<em><b>Local Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Type Name</em>' attribute.
	 * @see #setLocalTypeName(String)
	 * @see Sql.SqlPackage#getDataType_LocalTypeName()
	 * @model annotation="urn:org.nasdanika.models.sql column='LOCAL_TYPE_NAME'"
	 * @generated
	 */
	String getLocalTypeName();

	/**
	 * Sets the value of the '{@link Sql.DataType#getLocalTypeName <em>Local Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Type Name</em>' attribute.
	 * @see #getLocalTypeName()
	 * @generated
	 */
	void setLocalTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Minimum Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Scale</em>' attribute.
	 * @see #setMinimumScale(Short)
	 * @see Sql.SqlPackage#getDataType_MinimumScale()
	 * @model annotation="urn:org.nasdanika.models.sql column='MINIMUM_SCALE'"
	 * @generated
	 */
	Short getMinimumScale();

	/**
	 * Sets the value of the '{@link Sql.DataType#getMinimumScale <em>Minimum Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Scale</em>' attribute.
	 * @see #getMinimumScale()
	 * @generated
	 */
	void setMinimumScale(Short value);

	/**
	 * Returns the value of the '<em><b>Maximum Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Scale</em>' attribute.
	 * @see #setMaximumScale(Short)
	 * @see Sql.SqlPackage#getDataType_MaximumScale()
	 * @model annotation="urn:org.nasdanika.models.sql column='MAXIMUM_SCALE'"
	 * @generated
	 */
	Short getMaximumScale();

	/**
	 * Sets the value of the '{@link Sql.DataType#getMaximumScale <em>Maximum Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Scale</em>' attribute.
	 * @see #getMaximumScale()
	 * @generated
	 */
	void setMaximumScale(Short value);

	/**
	 * Returns the value of the '<em><b>Sql Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Data Type</em>' attribute.
	 * @see #setSqlDataType(Integer)
	 * @see Sql.SqlPackage#getDataType_SqlDataType()
	 * @model annotation="urn:org.nasdanika.models.sql column='SQL_DATA_TYPE'"
	 * @generated
	 */
	Integer getSqlDataType();

	/**
	 * Sets the value of the '{@link Sql.DataType#getSqlDataType <em>Sql Data Type</em>}' attribute.
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
	 * @see Sql.SqlPackage#getDataType_SqlDatetimeSub()
	 * @model annotation="urn:org.nasdanika.models.sql column='SQL_DATETIME_SUB'"
	 * @generated
	 */
	Integer getSqlDatetimeSub();

	/**
	 * Sets the value of the '{@link Sql.DataType#getSqlDatetimeSub <em>Sql Datetime Sub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Datetime Sub</em>' attribute.
	 * @see #getSqlDatetimeSub()
	 * @generated
	 */
	void setSqlDatetimeSub(Integer value);

	/**
	 * Returns the value of the '<em><b>Num Prec Radix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Prec Radix</em>' attribute.
	 * @see #setNumPrecRadix(Integer)
	 * @see Sql.SqlPackage#getDataType_NumPrecRadix()
	 * @model annotation="urn:org.nasdanika.models.sql column='NUM_PREC_RADIX'"
	 * @generated
	 */
	Integer getNumPrecRadix();

	/**
	 * Sets the value of the '{@link Sql.DataType#getNumPrecRadix <em>Num Prec Radix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Prec Radix</em>' attribute.
	 * @see #getNumPrecRadix()
	 * @generated
	 */
	void setNumPrecRadix(Integer value);

} // DataType
