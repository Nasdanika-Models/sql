/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.DropIndex#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.DropIndex#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.DropIndex#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getDropIndex()
 * @model
 * @generated
 */
public interface DropIndex extends Statement {
	/**
	 * Returns the value of the '<em><b>Index Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Name</em>' attribute.
	 * @see #setIndexName(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getDropIndex_IndexName()
	 * @model required="true"
	 * @generated
	 */
	String getIndexName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.DropIndex#getIndexName <em>Index Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Name</em>' attribute.
	 * @see #getIndexName()
	 * @generated
	 */
	void setIndexName(String value);

	/**
	 * Returns the value of the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Name</em>' attribute.
	 * @see #setSchemaName(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getDropIndex_SchemaName()
	 * @model
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.DropIndex#getSchemaName <em>Schema Name</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.ast.AstPackage#getDropIndex_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.DropIndex#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

} // DropIndex
