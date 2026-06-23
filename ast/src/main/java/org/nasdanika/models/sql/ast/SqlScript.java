/**
 */
package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.SqlScript#getSourceUri <em>Source Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.SqlScript#getDialect <em>Dialect</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.SqlScript#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.SqlScript#getLeadingComments <em>Leading Comments</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getSqlScript()
 * @model
 * @generated
 */
public interface SqlScript extends AstNode {
	/**
	 * Returns the value of the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Uri</em>' attribute.
	 * @see #setSourceUri(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSqlScript_SourceUri()
	 * @model
	 * @generated
	 */
	String getSourceUri();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SqlScript#getSourceUri <em>Source Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Uri</em>' attribute.
	 * @see #getSourceUri()
	 * @generated
	 */
	void setSourceUri(String value);

	/**
	 * Returns the value of the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialect</em>' attribute.
	 * @see #setDialect(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSqlScript_Dialect()
	 * @model
	 * @generated
	 */
	String getDialect();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SqlScript#getDialect <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialect</em>' attribute.
	 * @see #getDialect()
	 * @generated
	 */
	void setDialect(String value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.ast.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSqlScript_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Leading Comments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leading Comments</em>' attribute list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSqlScript_LeadingComments()
	 * @model
	 * @generated
	 */
	EList<String> getLeadingComments();

} // SqlScript
