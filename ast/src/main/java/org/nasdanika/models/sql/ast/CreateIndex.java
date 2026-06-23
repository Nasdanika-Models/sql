/**
 */
package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.CreateIndex#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.CreateIndex#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.CreateIndex#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.CreateIndex#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.CreateIndex#getColumnNames <em>Column Names</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getCreateIndex()
 * @model
 * @generated
 */
public interface CreateIndex extends Statement {
	/**
	 * Returns the value of the '<em><b>Index Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Name</em>' attribute.
	 * @see #setIndexName(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCreateIndex_IndexName()
	 * @model required="true"
	 * @generated
	 */
	String getIndexName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.CreateIndex#getIndexName <em>Index Name</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCreateIndex_SchemaName()
	 * @model
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.CreateIndex#getSchemaName <em>Schema Name</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCreateIndex_TableName()
	 * @model required="true"
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.CreateIndex#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCreateIndex_Unique()
	 * @model
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.CreateIndex#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Column Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Names</em>' attribute list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCreateIndex_ColumnNames()
	 * @model
	 * @generated
	 */
	EList<String> getColumnNames();

} // CreateIndex
