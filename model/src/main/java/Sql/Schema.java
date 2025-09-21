/**
 */
package Sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sql.Schema#getTableSchem <em>Table Schem</em>}</li>
 *   <li>{@link Sql.Schema#getTableCatalog <em>Table Catalog</em>}</li>
 * </ul>
 *
 * @see Sql.SqlPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Schem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Schem</em>' attribute.
	 * @see #setTableSchem(String)
	 * @see Sql.SqlPackage#getSchema_TableSchem()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_SCHEM'"
	 * @generated
	 */
	String getTableSchem();

	/**
	 * Sets the value of the '{@link Sql.Schema#getTableSchem <em>Table Schem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Schem</em>' attribute.
	 * @see #getTableSchem()
	 * @generated
	 */
	void setTableSchem(String value);

	/**
	 * Returns the value of the '<em><b>Table Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Catalog</em>' attribute.
	 * @see #setTableCatalog(String)
	 * @see Sql.SqlPackage#getSchema_TableCatalog()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_CATALOG'"
	 * @generated
	 */
	String getTableCatalog();

	/**
	 * Sets the value of the '{@link Sql.Schema#getTableCatalog <em>Table Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Catalog</em>' attribute.
	 * @see #getTableCatalog()
	 * @generated
	 */
	void setTableCatalog(String value);

} // Schema
