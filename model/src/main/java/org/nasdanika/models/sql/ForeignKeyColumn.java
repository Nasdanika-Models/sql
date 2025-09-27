/**
 */
package org.nasdanika.models.sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ForeignKeyColumn#getFkColumn <em>Fk Column</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ForeignKeyColumn#getPkColumn <em>Pk Column</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.SqlPackage#getForeignKeyColumn()
 * @model
 * @generated
 */
public interface ForeignKeyColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Fk Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fk Column</em>' reference.
	 * @see #setFkColumn(Column)
	 * @see org.nasdanika.models.sql.SqlPackage#getForeignKeyColumn_FkColumn()
	 * @model required="true"
	 * @generated
	 */
	Column getFkColumn();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ForeignKeyColumn#getFkColumn <em>Fk Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fk Column</em>' reference.
	 * @see #getFkColumn()
	 * @generated
	 */
	void setFkColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Pk Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pk Column</em>' reference.
	 * @see #setPkColumn(Column)
	 * @see org.nasdanika.models.sql.SqlPackage#getForeignKeyColumn_PkColumn()
	 * @model required="true"
	 * @generated
	 */
	Column getPkColumn();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ForeignKeyColumn#getPkColumn <em>Pk Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pk Column</em>' reference.
	 * @see #getPkColumn()
	 * @generated
	 */
	void setPkColumn(Column value);

} // ForeignKeyColumn
