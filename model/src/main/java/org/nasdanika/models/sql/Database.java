/**
 */
package org.nasdanika.models.sql;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Objects;
import java.util.TreeMap;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.Util;
import org.nasdanika.models.sql.core.Connector;
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
	 * The list contents are of type {@link org.nasdanika.models.sql.TableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Types</em>' containment reference list.
	 * @see org.nasdanika.models.sql.SqlPackage#getDatabase_TableTypes()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<TableType> getTableTypes();

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
	
	default void load(
			DatabaseMetaData databaseMetaData,
			String schemaPattern,
			String tableNamePattern, 
			String[] tableTypes) throws SQLException {
		setUrl(databaseMetaData.getURL());
		ResultSet tableTypesRs = databaseMetaData.getTableTypes();
		while (tableTypesRs.next()) {
			TableType tType = SqlFactory.eINSTANCE.createTableType();
			tType.setName(tableTypesRs.getString("TABLE_TYPE"));
			getTableTypes().add(tType);
		}
		ResultSet dataTypes = databaseMetaData.getTypeInfo();
		Connector<DataType> dataTypeConnector = new Connector<>(SqlPackage.Literals.DATA_TYPE);
		while (dataTypes.next()) {
			DataType dType = dataTypeConnector.create(dataTypes);
			dType.setName(dataTypes.getString("TYPE_NAME"));
			getDataTypes().add(dType);
		}		
		ResultSet catalogs = databaseMetaData.getCatalogs();
		while (catalogs.next()) {
			Function<String,TableType> tableTypeResolver = tableTypeName -> getTableTypes().stream().filter(tt -> Objects.equals(tt.getName(), tableTypeName)).findFirst().orElse(null);
			Function<String,DataType> dataTypeResolver = dataTypeName -> getDataTypes().stream().filter(dt -> Objects.equals(dt.getName(), dataTypeName)).findFirst().orElse(null); 
			getCatalogs().add(Catalog.create(
					databaseMetaData, 
					catalogs,
					schemaPattern,
					tableTypeResolver,
					dataTypeResolver,
					tableNamePattern,
					tableTypes));						
		}
		
		record ImportedKeyRecord(
				String fkColumn,
				int keySeq,
				String pkCatalog,
				String pkSchema,
				String pkTable,
				String pkColumn,
				short updateRule,
				short deleteRule,
				short deferrability,
				String pkName,
				String fkName) {
			
		}

		// Imported keys
		for (Catalog catalog: getCatalogs()) {
			for (Schema schema: catalog.getSchemas()) {
				for (Table table: schema.getTables()) {
					List<ImportedKeyRecord> importedKeyRecords = new ArrayList<>();
					ResultSet importedKeys = databaseMetaData.getImportedKeys(catalog.getName(), schema.getName(), table.getName());
					while (importedKeys.next()) {
						importedKeyRecords.add(new ImportedKeyRecord(
								importedKeys.getString("FKCOLUMN_NAME"), 
								importedKeys.getInt("KEY_SEQ"), 
								importedKeys.getString("PKTABLE_CAT"), 
								importedKeys.getString("PKTABLE_SCHEM"), 
								importedKeys.getString("PKTABLE_NAME"), 
								importedKeys.getString("PKCOLUMN_NAME"), 
								importedKeys.getShort("UPDATE_RULE"), 
								importedKeys.getShort("DELETE_RULE"), 
								importedKeys.getShort("DEFERRABILITY"), 
								importedKeys.getString("PK_NAME"), 
								importedKeys.getString("FK_NAME")));
					}
					importedKeyRecords.sort((a,b) -> a.keySeq() - b.keySeq());
					for (Entry<String, List<ImportedKeyRecord>> ike: Util.groupBy(importedKeyRecords, ImportedKeyRecord::fkName).entrySet()) {
						ImportedKey importedKey = SqlFactory.eINSTANCE.createImportedKey();
						importedKey.setName(ike.getKey());
						for (ImportedKeyRecord ikr: ike.getValue()) {
							Table pkTable = getCatalogs()
								.stream()
								.filter(c -> c.getName().equals(ikr.pkCatalog()))
								.flatMap(c -> c.getSchemas().stream())
								.filter(s -> s.getName().equals(ikr.pkSchema()))
								.flatMap(s -> s.getTables().stream())
								.filter(t -> t.getName().equals(ikr.pkTable()))
								.findFirst()
								.get();
								
							importedKey.setPrimaryKey(pkTable.getPrimaryKey());
							importedKey.setDeferrability(switch (ikr.deferrability()) {
								case DatabaseMetaData.importedKeyInitiallyDeferred -> Deferrability.INITIALLY_DEFERRED;
								case DatabaseMetaData.importedKeyInitiallyImmediate -> Deferrability.INITIALLY_IMMEDIATE;
								case DatabaseMetaData.importedKeyNotDeferrable -> Deferrability.NOT_DEFERRABLE;
								default -> throw new IllegalArgumentException("Invalid deferrability value: " + ikr.deferrability());
							});
							importedKey.setUpdateRule(switch (ikr.updateRule()) {
								case DatabaseMetaData.importedKeyNoAction -> ImportedKeyRule.NO_ACTION;
								case DatabaseMetaData.importedKeyCascade -> ImportedKeyRule.KEY_CASCADE;
								case DatabaseMetaData.importedKeySetNull -> ImportedKeyRule.KEY_SET_NULL;
								case DatabaseMetaData.importedKeySetDefault -> ImportedKeyRule.KEY_SET_DEFAULT;
								case DatabaseMetaData.importedKeyRestrict -> ImportedKeyRule.KEY_RESTRICT;
								default -> throw new IllegalArgumentException("Invalid deferrability value: " + ikr.deferrability());
							});
							importedKey.setDeleteRule(switch (ikr.deleteRule()) {
								case DatabaseMetaData.importedKeyNoAction -> ImportedKeyRule.NO_ACTION;
								case DatabaseMetaData.importedKeyCascade -> ImportedKeyRule.KEY_CASCADE;
								case DatabaseMetaData.importedKeySetNull -> ImportedKeyRule.KEY_SET_NULL;
								case DatabaseMetaData.importedKeySetDefault -> ImportedKeyRule.KEY_SET_DEFAULT;
								case DatabaseMetaData.importedKeyRestrict -> ImportedKeyRule.KEY_RESTRICT;
								default -> throw new IllegalArgumentException("Invalid deferrability value: " + ikr.deferrability());
							});
							
							ImportedKeyColumn ikc = SqlFactory.eINSTANCE.createImportedKeyColumn();
							ikc.setPkColumn(pkTable.getColumns().stream().filter(c -> c.getName().equals(ikr.pkColumn())).findAny().get());
							ikc.setFkColumn(table.getColumns().stream().filter(c -> c.getName().equals(ikr.fkColumn())).findAny().get());							
							
							importedKey.getColumns().add(ikc);
						}
						table.getImportedKeys().add(importedKey);
					}					
				}
			}
		}
	}
	
	static Database create(
			DatabaseMetaData databaseMetaData,
			String schemaPattern,
			String tableNamePattern, 
			String[] tableTypes) throws SQLException {
		Database db = SqlFactory.eINSTANCE.createDatabase();
		db.load(databaseMetaData, schemaPattern, tableNamePattern, tableTypes);
		return db;
	}

} // Database
