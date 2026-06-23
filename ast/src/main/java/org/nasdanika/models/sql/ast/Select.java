/**
 */
package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.Select#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.Select#getSelectItems <em>Select Items</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.Select#getFromItems <em>From Items</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.Select#getJoins <em>Joins</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.Select#getWhere <em>Where</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.Select#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.Select#getHaving <em>Having</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.Select#getOrderBy <em>Order By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends Statement {
	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct</em>' attribute.
	 * @see #setDistinct(boolean)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSelect_Distinct()
	 * @model
	 * @generated
	 */
	boolean isDistinct();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.Select#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' attribute.
	 * @see #isDistinct()
	 * @generated
	 */
	void setDistinct(boolean value);

	/**
	 * Returns the value of the '<em><b>Select Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.ast.SelectItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Items</em>' containment reference list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSelect_SelectItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<SelectItem> getSelectItems();

	/**
	 * Returns the value of the '<em><b>From Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.ast.FromItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Items</em>' containment reference list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSelect_FromItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<FromItem> getFromItems();

	/**
	 * Returns the value of the '<em><b>Joins</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.ast.Join}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joins</em>' containment reference list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSelect_Joins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Join> getJoins();

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Expression)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSelect_Where()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWhere();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.Select#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Expression value);

	/**
	 * Returns the value of the '<em><b>Group By</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.ast.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group By</em>' containment reference list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSelect_GroupBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getGroupBy();

	/**
	 * Returns the value of the '<em><b>Having</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Having</em>' containment reference.
	 * @see #setHaving(Expression)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSelect_Having()
	 * @model containment="true"
	 * @generated
	 */
	Expression getHaving();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.Select#getHaving <em>Having</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Having</em>' containment reference.
	 * @see #getHaving()
	 * @generated
	 */
	void setHaving(Expression value);

	/**
	 * Returns the value of the '<em><b>Order By</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.ast.OrderByItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By</em>' containment reference list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSelect_OrderBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderByItem> getOrderBy();

} // Select
