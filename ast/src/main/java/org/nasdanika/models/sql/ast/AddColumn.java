/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.AddColumn#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getAddColumn()
 * @model
 * @generated
 */
public interface AddColumn extends AlterOperation {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference.
	 * @see #setColumn(ColumnDefinition)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getAddColumn_Column()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ColumnDefinition getColumn();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.AddColumn#getColumn <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' containment reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(ColumnDefinition value);

} // AddColumn
