/**
 */
package org.nasdanika.models.sql;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.Database#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Database#getDriverClass <em>Driver Class</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Database#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Database#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Database#getTableTypes <em>Table Types</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Database#getCatalogs <em>Catalogs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.SqlPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.models.sql.SqlPackage#getDatabase_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Database#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Driver Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Class</em>' attribute.
	 * @see #setDriverClass(String)
	 * @see org.nasdanika.models.sql.SqlPackage#getDatabase_DriverClass()
	 * @model
	 * @generated
	 */
	String getDriverClass();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Database#getDriverClass <em>Driver Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Class</em>' attribute.
	 * @see #getDriverClass()
	 * @generated
	 */
	void setDriverClass(String value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' attribute list.
	 * @see org.nasdanika.models.sql.SqlPackage#getDatabase_Dependencies()
	 * @model
	 * @generated
	 */
	EList<String> getDependencies();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getDatabase_DataTypes()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<DataType> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Table Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Types</em>' containment reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getDatabase_TableTypes()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<DataType> getTableTypes();

	/**
	 * Returns the value of the '<em><b>Catalogs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.Catalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalogs</em>' containment reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getDatabase_Catalogs()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Catalog> getCatalogs();

} // Database
