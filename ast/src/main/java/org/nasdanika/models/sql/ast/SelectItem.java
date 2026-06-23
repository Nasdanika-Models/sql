/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.SelectItem#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.SelectItem#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.SelectItem#isAllColumns <em>All Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.SelectItem#getTableAlias <em>Table Alias</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getSelectItem()
 * @model
 * @generated
 */
public interface SelectItem extends AstNode {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSelectItem_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SelectItem#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSelectItem_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SelectItem#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>All Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Columns</em>' attribute.
	 * @see #setAllColumns(boolean)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSelectItem_AllColumns()
	 * @model
	 * @generated
	 */
	boolean isAllColumns();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SelectItem#isAllColumns <em>All Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Columns</em>' attribute.
	 * @see #isAllColumns()
	 * @generated
	 */
	void setAllColumns(boolean value);

	/**
	 * Returns the value of the '<em><b>Table Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Alias</em>' attribute.
	 * @see #setTableAlias(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSelectItem_TableAlias()
	 * @model
	 * @generated
	 */
	String getTableAlias();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SelectItem#getTableAlias <em>Table Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Alias</em>' attribute.
	 * @see #getTableAlias()
	 * @generated
	 */
	void setTableAlias(String value);

} // SelectItem
