/**
 */
package Sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Sql.Catalog#getTableCat <em>Table Cat</em>}</li>
 * </ul>
 *
 * @see Sql.SqlPackage#getCatalog()
 * @model
 * @generated
 */
public interface Catalog extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Cat</em>' attribute.
	 * @see #setTableCat(String)
	 * @see Sql.SqlPackage#getCatalog_TableCat()
	 * @model annotation="urn:org.nasdanika.models.sql column='TABLE_CAT'"
	 * @generated
	 */
	String getTableCat();

	/**
	 * Sets the value of the '{@link Sql.Catalog#getTableCat <em>Table Cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Cat</em>' attribute.
	 * @see #getTableCat()
	 * @generated
	 */
	void setTableCat(String value);

} // Catalog
