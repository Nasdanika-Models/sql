/**
 */
package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.ColumnDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.ColumnDefinition#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.ColumnDefinition#getNullable <em>Nullable</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.ColumnDefinition#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.ColumnDefinition#isIdentity <em>Identity</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.ColumnDefinition#isComputed <em>Computed</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.ColumnDefinition#getComputedExpression <em>Computed Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.ColumnDefinition#getInlineConstraints <em>Inline Constraints</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getColumnDefinition()
 * @model
 * @generated
 */
public interface ColumnDefinition extends AstNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getColumnDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.ColumnDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see #setDataType(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getColumnDefinition_DataType()
	 * @model required="true"
	 * @generated
	 */
	String getDataType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.ColumnDefinition#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(String value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(Boolean)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getColumnDefinition_Nullable()
	 * @model
	 * @generated
	 */
	Boolean getNullable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.ColumnDefinition#getNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #getNullable()
	 * @generated
	 */
	void setNullable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getColumnDefinition_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.ColumnDefinition#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(boolean)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getColumnDefinition_Identity()
	 * @model
	 * @generated
	 */
	boolean isIdentity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.ColumnDefinition#isIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #isIdentity()
	 * @generated
	 */
	void setIdentity(boolean value);

	/**
	 * Returns the value of the '<em><b>Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed</em>' attribute.
	 * @see #setComputed(boolean)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getColumnDefinition_Computed()
	 * @model
	 * @generated
	 */
	boolean isComputed();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.ColumnDefinition#isComputed <em>Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed</em>' attribute.
	 * @see #isComputed()
	 * @generated
	 */
	void setComputed(boolean value);

	/**
	 * Returns the value of the '<em><b>Computed Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed Expression</em>' attribute.
	 * @see #setComputedExpression(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getColumnDefinition_ComputedExpression()
	 * @model
	 * @generated
	 */
	String getComputedExpression();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.ColumnDefinition#getComputedExpression <em>Computed Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed Expression</em>' attribute.
	 * @see #getComputedExpression()
	 * @generated
	 */
	void setComputedExpression(String value);

	/**
	 * Returns the value of the '<em><b>Inline Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.ast.TableConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inline Constraints</em>' containment reference list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getColumnDefinition_InlineConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableConstraint> getInlineConstraints();

} // ColumnDefinition
