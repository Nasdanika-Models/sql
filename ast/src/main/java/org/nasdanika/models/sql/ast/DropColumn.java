/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.DropColumn#getColumnName <em>Column Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getDropColumn()
 * @model
 * @generated
 */
public interface DropColumn extends AlterOperation {
	/**
	 * Returns the value of the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Name</em>' attribute.
	 * @see #setColumnName(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getDropColumn_ColumnName()
	 * @model required="true"
	 * @generated
	 */
	String getColumnName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.DropColumn#getColumnName <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Name</em>' attribute.
	 * @see #getColumnName()
	 * @generated
	 */
	void setColumnName(String value);

} // DropColumn
