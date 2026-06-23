/**
 */
package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getColumnNames <em>Column Names</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getReferencedTable <em>Referenced Table</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getReferencedSchema <em>Referenced Schema</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getOnUpdate <em>On Update</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getForeignKeyConstraint()
 * @model
 * @generated
 */
public interface ForeignKeyConstraint extends TableConstraint {
	/**
	 * Returns the value of the '<em><b>Column Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Names</em>' attribute list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getForeignKeyConstraint_ColumnNames()
	 * @model
	 * @generated
	 */
	EList<String> getColumnNames();

	/**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' attribute.
	 * @see #setReferencedTable(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getForeignKeyConstraint_ReferencedTable()
	 * @model required="true"
	 * @generated
	 */
	String getReferencedTable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getReferencedTable <em>Referenced Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Table</em>' attribute.
	 * @see #getReferencedTable()
	 * @generated
	 */
	void setReferencedTable(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Schema</em>' attribute.
	 * @see #setReferencedSchema(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getForeignKeyConstraint_ReferencedSchema()
	 * @model
	 * @generated
	 */
	String getReferencedSchema();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getReferencedSchema <em>Referenced Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Schema</em>' attribute.
	 * @see #getReferencedSchema()
	 * @generated
	 */
	void setReferencedSchema(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Columns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Columns</em>' attribute list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getForeignKeyConstraint_ReferencedColumns()
	 * @model
	 * @generated
	 */
	EList<String> getReferencedColumns();

	/**
	 * Returns the value of the '<em><b>On Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Delete</em>' attribute.
	 * @see #setOnDelete(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getForeignKeyConstraint_OnDelete()
	 * @model
	 * @generated
	 */
	String getOnDelete();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getOnDelete <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Delete</em>' attribute.
	 * @see #getOnDelete()
	 * @generated
	 */
	void setOnDelete(String value);

	/**
	 * Returns the value of the '<em><b>On Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Update</em>' attribute.
	 * @see #setOnUpdate(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getForeignKeyConstraint_OnUpdate()
	 * @model
	 * @generated
	 */
	String getOnUpdate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getOnUpdate <em>On Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Update</em>' attribute.
	 * @see #getOnUpdate()
	 * @generated
	 */
	void setOnUpdate(String value);

} // ForeignKeyConstraint
