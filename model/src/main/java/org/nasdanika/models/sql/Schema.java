/**
 */
package org.nasdanika.models.sql;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.Schema#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.SqlPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getSchema_Tables()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Table> getTables();
		
	default void load(
			DatabaseMetaData databaseMetaData, 
			ResultSet resultSet,
			Function<String,TableType> tableTypeResolver,
			Function<String,DataType> dataTypeResolver, 
			String tableNamePattern, 
			String[] tableTypes) throws SQLException {
		
		setName(resultSet.getString("TABLE_SCHEM"));		
		ResultSet tables = databaseMetaData.getTables(
				resultSet.getString("TABLE_CATALOG"),
				getName(), 
				tableNamePattern, 
				tableTypes);
		
		while (tables.next()) {
			getTables().add(Table.create(databaseMetaData, tables, tableTypeResolver, dataTypeResolver));
		}								
	}
	
	static Schema create(
			DatabaseMetaData databaseMetaData, 
			ResultSet resultSet,
			Function<String,TableType> tableTypeResolver,
			Function<String,DataType> dataTypeResolver,
			String tableNamePattern, 
			String[] tableTypes) throws SQLException {
		Schema schema = SqlFactory.eINSTANCE.createSchema();
		
		schema.load(
				databaseMetaData, 
				resultSet, 
				tableTypeResolver, 
				dataTypeResolver, 
				tableNamePattern, 
				tableTypes);
		
		return schema;		
	}	

} // Schema
