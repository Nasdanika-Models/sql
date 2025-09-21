/**
 */
package Sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sql.TableType#getTableType <em>Table Type</em>}</li>
 * </ul>
 *
 * @see Sql.SqlPackage#getTableType()
 * @model
 * @generated
 */
public interface TableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Type</em>' attribute.
	 * @see #setTableType(String)
	 * @see Sql.SqlPackage#getTableType_TableType()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_TYPE'"
	 * @generated
	 */
	String getTableType();

	/**
	 * Sets the value of the '{@link Sql.TableType#getTableType <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Type</em>' attribute.
	 * @see #getTableType()
	 * @generated
	 */
	void setTableType(String value);

} // TableType
