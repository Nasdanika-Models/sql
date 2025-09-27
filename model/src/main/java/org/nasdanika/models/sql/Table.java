/**
 */
package org.nasdanika.models.sql;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.Table#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.Table#getImportedKeys <em>Imported Keys</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.SqlPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TableType)
	 * @see org.nasdanika.models.sql.SqlPackage#getTable_Type()
	 * @model
	 * @generated
	 */
	TableType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Table#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TableType value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getTable_Columns()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' containment reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see org.nasdanika.models.sql.SqlPackage#getTable_PrimaryKey()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.Table#getPrimaryKey <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' containment reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Imported Keys</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Keys</em>' containment reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getTable_ImportedKeys()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<ForeignKey> getImportedKeys();
	
	default void load(
			DatabaseMetaData databaseMetaData, 
			ResultSet resultSet,
			Function<String,TableType> tableTypeResolver,
			Function<String,DataType> dataTypeResolver) throws SQLException {
		setName(resultSet.getString("TABLE_NAME"));		
		setType(tableTypeResolver.apply(resultSet.getString("TYPE_NAME")));
		ResultSet columns = databaseMetaData.getColumns(resultSet.getString("TABLE_CAT"),  resultSet.getString("TABLE_SCHEM"), getName(), null);
		while (columns.next()) {
			getColumns().add(Column.create(databaseMetaData, columns, dataTypeResolver));
		}		
		Map<Integer, Column> pkColumns = new TreeMap<>();
		ResultSet primaryKeys = databaseMetaData.getPrimaryKeys(resultSet.getString("TABLE_CAT"),  resultSet.getString("TABLE_SCHEM"), getName());
		PrimaryKey pk = SqlFactory.eINSTANCE.createPrimaryKey();		
		while (primaryKeys.next()) {
			String colName = primaryKeys.getString("COLUMN_NAME");
			pkColumns.put(primaryKeys.getInt("KEY_SEQ"), getColumns().stream().filter(c -> Objects.equals(c.getName(), colName)).findFirst().get());
			String pkName = primaryKeys.getString("PK_NAME");
			if (pk.getName() != null && !pkName.equals(pk.getName())) {
				throw new IllegalStateException("More than one primary key: " + pkName + ", " + pk.getName());
			}	
			pk.setName(pkName);
		}
		pk.getColumns().addAll(pkColumns.values());
		if (!pk.getColumns().isEmpty()) {
			setPrimaryKey(pk);
		}
	}
	
	static Table create(
			DatabaseMetaData databaseMetaData, 
			ResultSet resultSet,
			Function<String,TableType> tableTypeResolver,
			Function<String,DataType> dataTypeResolver) throws SQLException {
		Table table = SqlFactory.eINSTANCE.createTable();
		table.load(databaseMetaData, resultSet, tableTypeResolver, dataTypeResolver);
		return table;		
	}	
	
} // Table
