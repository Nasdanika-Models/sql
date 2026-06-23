/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.CheckConstraint#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.CheckConstraint#getExpressionText <em>Expression Text</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getCheckConstraint()
 * @model
 * @generated
 */
public interface CheckConstraint extends TableConstraint {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCheckConstraint_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.CheckConstraint#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Expression Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Text</em>' attribute.
	 * @see #setExpressionText(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCheckConstraint_ExpressionText()
	 * @model
	 * @generated
	 */
	String getExpressionText();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.CheckConstraint#getExpressionText <em>Expression Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Text</em>' attribute.
	 * @see #getExpressionText()
	 * @generated
	 */
	void setExpressionText(String value);

} // CheckConstraint
