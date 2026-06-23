/**
 */
package org.nasdanika.models.sql.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.CreateView#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.CreateView#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.CreateView#isOrReplace <em>Or Replace</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.CreateView#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getCreateView()
 * @model
 * @generated
 */
public interface CreateView extends Statement {
	/**
	 * Returns the value of the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Name</em>' attribute.
	 * @see #setSchemaName(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCreateView_SchemaName()
	 * @model
	 * @generated
	 */
	String getSchemaName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.CreateView#getSchemaName <em>Schema Name</em>}' attribute.
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
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCreateView_ViewName()
	 * @model required="true"
	 * @generated
	 */
	String getViewName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.CreateView#getViewName <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Name</em>' attribute.
	 * @see #getViewName()
	 * @generated
	 */
	void setViewName(String value);

	/**
	 * Returns the value of the '<em><b>Or Replace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or Replace</em>' attribute.
	 * @see #setOrReplace(boolean)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCreateView_OrReplace()
	 * @model
	 * @generated
	 */
	boolean isOrReplace();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.CreateView#isOrReplace <em>Or Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or Replace</em>' attribute.
	 * @see #isOrReplace()
	 * @generated
	 */
	void setOrReplace(boolean value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference.
	 * @see #setQuery(Select)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getCreateView_Query()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Select getQuery();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.CreateView#getQuery <em>Query</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' containment reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Select value);

} // CreateView
