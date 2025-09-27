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
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.Catalog#getSchemas <em>Schemas</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.SqlPackage#getCatalog()
 * @model
 * @generated
 */
public interface Catalog extends DocumentedNamedElement {
	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.sql.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getCatalog_Schemas()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Schema> getSchemas();
	
	default void load(
			DatabaseMetaData databaseMetaData, 
			ResultSet resultSet,
			String schemaPattern,
			Function<String,TableType> tableTypeResolver,
			Function<String,DataType> dataTypeResolver, 
			String tableNamePattern, 
			String[] tableTypes) throws SQLException {
		setName(resultSet.getString("TABLE_CAT"));		
		ResultSet schemas = databaseMetaData.getSchemas(getName(), schemaPattern);
		while (schemas.next()) {
			getSchemas().add(Schema.create(
					databaseMetaData, 
					schemas, 
					tableTypeResolver, 
					dataTypeResolver,
					tableNamePattern,
					tableTypes));
		}								
	}
	
	static Catalog create(
			DatabaseMetaData databaseMetaData, 
			ResultSet resultSet,
			String schemaPattern,
			Function<String,TableType> tableTypeResolver,
			Function<String,DataType> dataTypeResolver,
			String tableNamePattern, 
			String[] tableTypes) throws SQLException {
		Catalog catalog = SqlFactory.eINSTANCE.createCatalog();
		catalog.load(
				databaseMetaData, 
				resultSet, 
				schemaPattern,
				tableTypeResolver, 
				dataTypeResolver, 
				tableNamePattern,
				tableTypes);
		return catalog;		
	}

} // Catalog
