/**
 */
package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.ExpressionList#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getExpressionList()
 * @model
 * @generated
 */
public interface ExpressionList extends Expression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.ast.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getExpressionList_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

} // ExpressionList
