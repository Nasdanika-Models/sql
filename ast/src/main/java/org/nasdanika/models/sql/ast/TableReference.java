/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.TableReference#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.TableReference#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getTableReference()
 * @model
 * @generated
 */
public interface TableReference extends FromItem {
	/**
	 * Returns the value of the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Name</em>' attribute.
	 * @see #setSchemaName(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getTableReference_SchemaName()
	 * @model
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.TableReference#getSchemaName <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Name</em>' attribute.
	 * @see #getSchemaName()
	 * @generated
	 */
	void setSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getTableReference_TableName()
	 * @model required="true"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.TableReference#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

} // TableReference
