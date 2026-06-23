/**
 */
package org.nasdanika.models.sql.ast;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.UniqueConstraint#getColumnNames <em>Column Names</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getUniqueConstraint()
 * @model
 * @generated
 */
public interface UniqueConstraint extends TableConstraint {
	/**
	 * Returns the value of the '<em><b>Column Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Names</em>' attribute list.
	 * @see org.nasdanika.models.sql.ast.AstPackage#getUniqueConstraint_ColumnNames()
	 * @model
	 * @generated
	 */
	EList<String> getColumnNames();

} // UniqueConstraint
