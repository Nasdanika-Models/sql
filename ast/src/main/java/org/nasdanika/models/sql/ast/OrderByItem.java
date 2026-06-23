/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order By Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.OrderByItem#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.OrderByItem#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getOrderByItem()
 * @model
 * @generated
 */
public interface OrderByItem extends AstNode {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getOrderByItem_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.OrderByItem#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.sql.ast.SortDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.nasdanika.models.sql.ast.SortDirection
	 * @see #setDirection(SortDirection)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getOrderByItem_Direction()
	 * @model
	 * @generated
	 */
	SortDirection getDirection();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.OrderByItem#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.nasdanika.models.sql.ast.SortDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(SortDirection value);

} // OrderByItem
