/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.SubSelect#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getSubSelect()
 * @model
 * @generated
 */
public interface SubSelect extends FromItem {
	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference.
	 * @see #setSelect(Select)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSubSelect_Select()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Select getSelect();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SubSelect#getSelect <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' containment reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(Select value);

} // SubSelect
