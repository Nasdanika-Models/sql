/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.AddConstraint#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getAddConstraint()
 * @model
 * @generated
 */
public interface AddConstraint extends AlterOperation {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(TableConstraint)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getAddConstraint_Constraint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TableConstraint getConstraint();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.AddConstraint#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(TableConstraint value);

} // AddConstraint
