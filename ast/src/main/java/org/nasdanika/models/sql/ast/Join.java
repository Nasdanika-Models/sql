/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.Join#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.Join#getRightItem <em>Right Item</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.Join#getOnCondition <em>On Condition</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends AstNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.sql.ast.JoinType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.sql.ast.JoinType
	 * @see #setType(JoinType)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getJoin_Type()
	 * @model
	 * @generated
	 */
	JoinType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.Join#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.sql.ast.JoinType
	 * @see #getType()
	 * @generated
	 */
	void setType(JoinType value);

	/**
	 * Returns the value of the '<em><b>Right Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Item</em>' containment reference.
	 * @see #setRightItem(FromItem)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getJoin_RightItem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FromItem getRightItem();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.Join#getRightItem <em>Right Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Item</em>' containment reference.
	 * @see #getRightItem()
	 * @generated
	 */
	void setRightItem(FromItem value);

	/**
	 * Returns the value of the '<em><b>On Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Condition</em>' containment reference.
	 * @see #setOnCondition(Expression)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getJoin_OnCondition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOnCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.Join#getOnCondition <em>On Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Condition</em>' containment reference.
	 * @see #getOnCondition()
	 * @generated
	 */
	void setOnCondition(Expression value);

} // Join
