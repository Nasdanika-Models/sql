/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.Statement#getRawSql <em>Raw Sql</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends AstNode {
	/**
	 * Returns the value of the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Sql</em>' attribute.
	 * @see #setRawSql(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getStatement_RawSql()
	 * @model
	 * @generated
	 */
	String getRawSql();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.Statement#getRawSql <em>Raw Sql</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Sql</em>' attribute.
	 * @see #getRawSql()
	 * @generated
	 */
	void setRawSql(String value);

} // Statement
