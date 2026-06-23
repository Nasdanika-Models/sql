/**
 */
package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.CaseExpression#getSwitchExpression <em>Switch Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.CaseExpression#getWhenClauses <em>When Clauses</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.CaseExpression#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getCaseExpression()
 * @model
 * @generated
 */
public interface CaseExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Switch Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch Expression</em>' containment reference.
	 * @see #setSwitchExpression(Expression)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCaseExpression_SwitchExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSwitchExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.CaseExpression#getSwitchExpression <em>Switch Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch Expression</em>' containment reference.
	 * @see #getSwitchExpression()
	 * @generated
	 */
	void setSwitchExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>When Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.ast.WhenClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Clauses</em>' containment reference list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCaseExpression_WhenClauses()
	 * @model containment="true"
	 * @generated
	 */
	EList<WhenClause> getWhenClauses();

	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' containment reference.
	 * @see #setElseExpression(Expression)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCaseExpression_ElseExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getElseExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.CaseExpression#getElseExpression <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' containment reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(Expression value);

} // CaseExpression
