/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.DropView#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.DropView#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.DropView#isIfExists <em>If Exists</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getDropView()
 * @model
 * @generated
 */
public interface DropView extends Statement {
	/**
	 * Returns the value of the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Name</em>' attribute.
	 * @see #setSchemaName(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getDropView_SchemaName()
	 * @model
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.DropView#getSchemaName <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Name</em>' attribute.
	 * @see #getSchemaName()
	 * @generated
	 */
	void setSchemaName(String value);

	/**
	 * Returns the value of the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Name</em>' attribute.
	 * @see #setViewName(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getDropView_ViewName()
	 * @model required="true"
	 * @generated
	 */
	String getViewName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.DropView#getViewName <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name</em>' attribute.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(String value);

	/**
	 * Returns the value of the '<em><b>If Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Exists</em>' attribute.
	 * @see #setIfExists(boolean)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getDropView_IfExists()
	 * @model
	 * @generated
	 */
	boolean isIfExists();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.DropView#isIfExists <em>If Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Exists</em>' attribute.
	 * @see #isIfExists()
	 * @generated
	 */
	void setIfExists(boolean value);

} // DropView
