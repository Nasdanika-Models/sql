/**
 */
package Sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sql.Table#getTableCat <em>Table Cat</em>}</li>
 *   <li>{@link Sql.Table#getTableSchem <em>Table Schem</em>}</li>
 *   <li>{@link Sql.Table#getTableName <em>Table Name</em>}</li>
 *   <li>{@link Sql.Table#getTableType <em>Table Type</em>}</li>
 *   <li>{@link Sql.Table#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link Sql.Table#getTypeCat <em>Type Cat</em>}</li>
 *   <li>{@link Sql.Table#getTypeSchem <em>Type Schem</em>}</li>
 *   <li>{@link Sql.Table#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link Sql.Table#getSelfReferencingColName <em>Self Referencing Col Name</em>}</li>
 *   <li>{@link Sql.Table#getRefGeneration <em>Ref Generation</em>}</li>
 * </ul>
 *
 * @see Sql.SqlPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Cat</em>' attribute.
	 * @see #setTableCat(String)
	 * @see Sql.SqlPackage#getTable_TableCat()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_CAT'"
	 * @generated
	 */
	String getTableCat();

	/**
	 * Sets the value of the '{@link Sql.Table#getTableCat <em>Table Cat</em>}' attribute.
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
	 * @see Sql.SqlPackage#getTable_TableSchem()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_SCHEM'"
	 * @generated
	 */
	String getTableSchem();

	/**
	 * Sets the value of the '{@link Sql.Table#getTableSchem <em>Table Schem</em>}' attribute.
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
	 * @see Sql.SqlPackage#getTable_TableName()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_NAME'"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link Sql.Table#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Table Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Type</em>' attribute.
	 * @see #setTableType(String)
	 * @see Sql.SqlPackage#getTable_TableType()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_TYPE'"
	 * @generated
	 */
	String getTableType();

	/**
	 * Sets the value of the '{@link Sql.Table#getTableType <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Type</em>' attribute.
	 * @see #getTableType()
	 * @generated
	 */
	void setTableType(String value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see Sql.SqlPackage#getTable_Remarks()
	 * @model annotation="urn:org.nasdanika.models.sql column='REMARKS'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link Sql.Table#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Type Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Cat</em>' attribute.
	 * @see #setTypeCat(String)
	 * @see Sql.SqlPackage#getTable_TypeCat()
	 * @model annotation="urn:org.nasdanika.models.sql column='TYPE_CAT'"
	 * @generated
	 */
	String getTypeCat();

	/**
	 * Sets the value of the '{@link Sql.Table#getTypeCat <em>Type Cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Cat</em>' attribute.
	 * @see #getTypeCat()
	 * @generated
	 */
	void setTypeCat(String value);

	/**
	 * Returns the value of the '<em><b>Type Schem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Schem</em>' attribute.
	 * @see #setTypeSchem(String)
	 * @see Sql.SqlPackage#getTable_TypeSchem()
	 * @model annotation="urn:org.nasdanika.models.sql column='TYPE_SCHEM'"
	 * @generated
	 */
	String getTypeSchem();

	/**
	 * Sets the value of the '{@link Sql.Table#getTypeSchem <em>Type Schem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Schem</em>' attribute.
	 * @see #getTypeSchem()
	 * @generated
	 */
	void setTypeSchem(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see Sql.SqlPackage#getTable_TypeName()
	 * @model annotation="urn:org.nasdanika.models.sql column='TYPE_NAME'"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link Sql.Table#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Self Referencing Col Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Referencing Col Name</em>' attribute.
	 * @see #setSelfReferencingColName(String)
	 * @see Sql.SqlPackage#getTable_SelfReferencingColName()
	 * @model annotation="urn:org.nasdanika.models.sql column='SELF_REFERENCING_COL_NAME'"
	 * @generated
	 */
	String getSelfReferencingColName();

	/**
	 * Sets the value of the '{@link Sql.Table#getSelfReferencingColName <em>Self Referencing Col Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Referencing Col Name</em>' attribute.
	 * @see #getSelfReferencingColName()
	 * @generated
	 */
	void setSelfReferencingColName(String value);

	/**
	 * Returns the value of the '<em><b>Ref Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Generation</em>' attribute.
	 * @see #setRefGeneration(String)
	 * @see Sql.SqlPackage#getTable_RefGeneration()
	 * @model annotation="urn:org.nasdanika.models.sql column='REF_GENERATION'"
	 * @generated
	 */
	String getRefGeneration();

	/**
	 * Sets the value of the '{@link Sql.Table#getRefGeneration <em>Ref Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Generation</em>' attribute.
	 * @see #getRefGeneration()
	 * @generated
	 */
	void setRefGeneration(String value);

} // Table
