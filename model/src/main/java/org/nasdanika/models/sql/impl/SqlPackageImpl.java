/**
 */
package org.nasdanika.models.sql.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.sql.Catalog;
import org.nasdanika.models.sql.Column;
import org.nasdanika.models.sql.DataType;
import org.nasdanika.models.sql.Database;
import org.nasdanika.models.sql.Deferrability;
import org.nasdanika.models.sql.ImportedKey;
import org.nasdanika.models.sql.ImportedKeyColumn;
import org.nasdanika.models.sql.ImportedKeyRule;
import org.nasdanika.models.sql.PrimaryKey;
import org.nasdanika.models.sql.Schema;
import org.nasdanika.models.sql.SqlFactory;
import org.nasdanika.models.sql.SqlPackage;
import org.nasdanika.models.sql.Table;
import org.nasdanika.models.sql.TableType;

import org.nasdanika.models.sql.Type;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlPackageImpl extends EPackageImpl implements SqlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importedKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importedKeyColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum importedKeyRuleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deferrabilityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.sql.SqlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SqlPackageImpl() {
		super(eNS_URI, SqlFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SqlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SqlPackage init() {
		if (isInited) return (SqlPackage)EPackage.Registry.INSTANCE.getEPackage(SqlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSqlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SqlPackageImpl theSqlPackage = registeredSqlPackage instanceof SqlPackageImpl ? (SqlPackageImpl)registeredSqlPackage : new SqlPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		NcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSqlPackage.createPackageContents();

		// Initialize created meta-data
		theSqlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSqlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SqlPackage.eNS_URI, theSqlPackage);
		return theSqlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabase_Url() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabase_DriverClass() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabase_Dependencies() {
		return (EAttribute)databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabase_DataTypes() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabase_TableTypes() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabase_Catalogs() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_DataType() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_Precision() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_LiteralPrefix() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_LiteralSuffix() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_CreateParams() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_Nullable() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_CaseSensitive() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_Searchable() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_UnsignedAttribute() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_FixedPrecScale() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_AutoIncrement() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_LocalTypeName() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_MinimumScale() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_MaximumScale() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_SqlDataType() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_SqlDatetimeSub() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_NumPrecRadix() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableType() {
		return tableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalog_Schemas() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchema_Tables() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Type() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_PrimaryKey() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_ImportedKeys() {
		return (EReference)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColumn_Type() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_DataType() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_TypeName() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ColumnSize() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_BufferLength() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_DecimalDigits() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_NumPrecRadix() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_Nullable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_Remarks() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ColumnDef() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_SqlDataType() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_SqlDatetimeSub() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_CharOctetLength() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_OrdinalPosition() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_IsNullable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ScopeCatalog() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ScopeSchema() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ScopeTable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_SourceDataType() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_IsAutoincrement() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_IsGeneratedcolumn() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimaryKey() {
		return primaryKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimaryKey_Columns() {
		return (EReference)primaryKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportedKey() {
		return importedKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportedKey_Columns() {
		return (EReference)importedKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportedKey_PrimaryKey() {
		return (EReference)importedKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_UpdateRule() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_DeleteRule() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_Deferrability() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportedKeyColumn() {
		return importedKeyColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportedKeyColumn_FkColumn() {
		return (EReference)importedKeyColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportedKeyColumn_PkColumn() {
		return (EReference)importedKeyColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImportedKeyRule() {
		return importedKeyRuleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDeferrability() {
		return deferrabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqlFactory getSqlFactory() {
		return (SqlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		databaseEClass = createEClass(DATABASE);
		createEAttribute(databaseEClass, DATABASE__URL);
		createEAttribute(databaseEClass, DATABASE__DRIVER_CLASS);
		createEAttribute(databaseEClass, DATABASE__DEPENDENCIES);
		createEReference(databaseEClass, DATABASE__DATA_TYPES);
		createEReference(databaseEClass, DATABASE__TABLE_TYPES);
		createEReference(databaseEClass, DATABASE__CATALOGS);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__PRECISION);
		createEAttribute(dataTypeEClass, DATA_TYPE__LITERAL_PREFIX);
		createEAttribute(dataTypeEClass, DATA_TYPE__LITERAL_SUFFIX);
		createEAttribute(dataTypeEClass, DATA_TYPE__CREATE_PARAMS);
		createEAttribute(dataTypeEClass, DATA_TYPE__NULLABLE);
		createEAttribute(dataTypeEClass, DATA_TYPE__CASE_SENSITIVE);
		createEAttribute(dataTypeEClass, DATA_TYPE__SEARCHABLE);
		createEAttribute(dataTypeEClass, DATA_TYPE__UNSIGNED_ATTRIBUTE);
		createEAttribute(dataTypeEClass, DATA_TYPE__FIXED_PREC_SCALE);
		createEAttribute(dataTypeEClass, DATA_TYPE__AUTO_INCREMENT);
		createEAttribute(dataTypeEClass, DATA_TYPE__LOCAL_TYPE_NAME);
		createEAttribute(dataTypeEClass, DATA_TYPE__MINIMUM_SCALE);
		createEAttribute(dataTypeEClass, DATA_TYPE__MAXIMUM_SCALE);
		createEAttribute(dataTypeEClass, DATA_TYPE__SQL_DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__SQL_DATETIME_SUB);
		createEAttribute(dataTypeEClass, DATA_TYPE__NUM_PREC_RADIX);

		tableTypeEClass = createEClass(TABLE_TYPE);

		catalogEClass = createEClass(CATALOG);
		createEReference(catalogEClass, CATALOG__SCHEMAS);

		schemaEClass = createEClass(SCHEMA);
		createEReference(schemaEClass, SCHEMA__TABLES);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__TYPE);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEReference(tableEClass, TABLE__PRIMARY_KEY);
		createEReference(tableEClass, TABLE__IMPORTED_KEYS);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__TYPE);
		createEAttribute(columnEClass, COLUMN__DATA_TYPE);
		createEAttribute(columnEClass, COLUMN__TYPE_NAME);
		createEAttribute(columnEClass, COLUMN__COLUMN_SIZE);
		createEAttribute(columnEClass, COLUMN__BUFFER_LENGTH);
		createEAttribute(columnEClass, COLUMN__DECIMAL_DIGITS);
		createEAttribute(columnEClass, COLUMN__NUM_PREC_RADIX);
		createEAttribute(columnEClass, COLUMN__NULLABLE);
		createEAttribute(columnEClass, COLUMN__REMARKS);
		createEAttribute(columnEClass, COLUMN__COLUMN_DEF);
		createEAttribute(columnEClass, COLUMN__SQL_DATA_TYPE);
		createEAttribute(columnEClass, COLUMN__SQL_DATETIME_SUB);
		createEAttribute(columnEClass, COLUMN__CHAR_OCTET_LENGTH);
		createEAttribute(columnEClass, COLUMN__ORDINAL_POSITION);
		createEAttribute(columnEClass, COLUMN__IS_NULLABLE);
		createEAttribute(columnEClass, COLUMN__SCOPE_CATALOG);
		createEAttribute(columnEClass, COLUMN__SCOPE_SCHEMA);
		createEAttribute(columnEClass, COLUMN__SCOPE_TABLE);
		createEAttribute(columnEClass, COLUMN__SOURCE_DATA_TYPE);
		createEAttribute(columnEClass, COLUMN__IS_AUTOINCREMENT);
		createEAttribute(columnEClass, COLUMN__IS_GENERATEDCOLUMN);

		primaryKeyEClass = createEClass(PRIMARY_KEY);
		createEReference(primaryKeyEClass, PRIMARY_KEY__COLUMNS);

		importedKeyEClass = createEClass(IMPORTED_KEY);
		createEReference(importedKeyEClass, IMPORTED_KEY__COLUMNS);
		createEReference(importedKeyEClass, IMPORTED_KEY__PRIMARY_KEY);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__UPDATE_RULE);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__DELETE_RULE);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__DEFERRABILITY);

		importedKeyColumnEClass = createEClass(IMPORTED_KEY_COLUMN);
		createEReference(importedKeyColumnEClass, IMPORTED_KEY_COLUMN__FK_COLUMN);
		createEReference(importedKeyColumnEClass, IMPORTED_KEY_COLUMN__PK_COLUMN);

		// Create enums
		typeEEnum = createEEnum(TYPE);
		importedKeyRuleEEnum = createEEnum(IMPORTED_KEY_RULE);
		deferrabilityEEnum = createEEnum(DEFERRABILITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		databaseEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		dataTypeEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		tableTypeEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		catalogEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		schemaEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		tableEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		columnEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		primaryKeyEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());
		importedKeyEClass.getESuperTypes().add(theNcorePackage.getDocumentedNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabase_Url(), ecorePackage.getEString(), "url", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_DriverClass(), ecorePackage.getEString(), "driverClass", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabase_Dependencies(), ecorePackage.getEString(), "dependencies", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_DataTypes(), this.getDataType(), null, "dataTypes", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDatabase_DataTypes().getEKeys().add(theNcorePackage.getNamedElement_Name());
		initEReference(getDatabase_TableTypes(), this.getTableType(), null, "tableTypes", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDatabase_TableTypes().getEKeys().add(theNcorePackage.getNamedElement_Name());
		initEReference(getDatabase_Catalogs(), this.getCatalog(), null, "catalogs", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDatabase_Catalogs().getEKeys().add(theNcorePackage.getNamedElement_Name());

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_DataType(), this.getType(), "dataType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Precision(), ecorePackage.getEIntegerObject(), "precision", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_LiteralPrefix(), ecorePackage.getEString(), "literalPrefix", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_LiteralSuffix(), ecorePackage.getEString(), "literalSuffix", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_CreateParams(), ecorePackage.getEString(), "createParams", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Nullable(), ecorePackage.getEShortObject(), "nullable", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_CaseSensitive(), ecorePackage.getEBooleanObject(), "caseSensitive", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Searchable(), ecorePackage.getEShortObject(), "searchable", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_UnsignedAttribute(), ecorePackage.getEBooleanObject(), "unsignedAttribute", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_FixedPrecScale(), ecorePackage.getEBooleanObject(), "fixedPrecScale", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_AutoIncrement(), ecorePackage.getEBooleanObject(), "autoIncrement", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_LocalTypeName(), ecorePackage.getEString(), "localTypeName", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_MinimumScale(), ecorePackage.getEShortObject(), "minimumScale", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_MaximumScale(), ecorePackage.getEShortObject(), "maximumScale", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_SqlDataType(), ecorePackage.getEIntegerObject(), "sqlDataType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_SqlDatetimeSub(), ecorePackage.getEIntegerObject(), "sqlDatetimeSub", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_NumPrecRadix(), ecorePackage.getEIntegerObject(), "numPrecRadix", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableTypeEClass, TableType.class, "TableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalog_Schemas(), this.getSchema(), null, "schemas", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCatalog_Schemas().getEKeys().add(theNcorePackage.getNamedElement_Name());

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchema_Tables(), this.getTable(), null, "tables", null, 0, -1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSchema_Tables().getEKeys().add(theNcorePackage.getNamedElement_Name());

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Type(), this.getTableType(), null, "type", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Columns(), this.getColumn(), null, "columns", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTable_Columns().getEKeys().add(theNcorePackage.getNamedElement_Name());
		initEReference(getTable_PrimaryKey(), this.getPrimaryKey(), null, "primaryKey", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTable_PrimaryKey().getEKeys().add(theNcorePackage.getNamedElement_Name());
		initEReference(getTable_ImportedKeys(), this.getImportedKey(), null, "importedKeys", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTable_ImportedKeys().getEKeys().add(theNcorePackage.getNamedElement_Name());

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Type(), this.getDataType(), null, "type", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_DataType(), this.getType(), "dataType", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ColumnSize(), ecorePackage.getEIntegerObject(), "columnSize", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_BufferLength(), ecorePackage.getEIntegerObject(), "bufferLength", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_DecimalDigits(), ecorePackage.getEIntegerObject(), "decimalDigits", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_NumPrecRadix(), ecorePackage.getEIntegerObject(), "numPrecRadix", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Nullable(), ecorePackage.getEIntegerObject(), "nullable", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Remarks(), ecorePackage.getEString(), "remarks", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ColumnDef(), ecorePackage.getEString(), "columnDef", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_SqlDataType(), ecorePackage.getEIntegerObject(), "sqlDataType", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_SqlDatetimeSub(), ecorePackage.getEIntegerObject(), "sqlDatetimeSub", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_CharOctetLength(), ecorePackage.getEIntegerObject(), "charOctetLength", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_OrdinalPosition(), ecorePackage.getEIntegerObject(), "ordinalPosition", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_IsNullable(), ecorePackage.getEString(), "isNullable", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ScopeCatalog(), ecorePackage.getEString(), "scopeCatalog", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ScopeSchema(), ecorePackage.getEString(), "scopeSchema", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ScopeTable(), ecorePackage.getEString(), "scopeTable", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_SourceDataType(), ecorePackage.getEShortObject(), "sourceDataType", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_IsAutoincrement(), ecorePackage.getEString(), "isAutoincrement", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_IsGeneratedcolumn(), ecorePackage.getEString(), "isGeneratedcolumn", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyEClass, PrimaryKey.class, "PrimaryKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimaryKey_Columns(), this.getColumn(), null, "columns", null, 1, -1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importedKeyEClass, ImportedKey.class, "ImportedKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportedKey_Columns(), this.getImportedKeyColumn(), null, "columns", null, 0, -1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImportedKey_PrimaryKey(), this.getPrimaryKey(), null, "primaryKey", null, 1, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_UpdateRule(), this.getImportedKeyRule(), "updateRule", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_DeleteRule(), this.getImportedKeyRule(), "deleteRule", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_Deferrability(), this.getDeferrability(), "deferrability", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importedKeyColumnEClass, ImportedKeyColumn.class, "ImportedKeyColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportedKeyColumn_FkColumn(), this.getColumn(), null, "fkColumn", null, 1, 1, ImportedKeyColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImportedKeyColumn_PkColumn(), this.getColumn(), null, "pkColumn", null, 1, 1, ImportedKeyColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.ARRAY);
		addEEnumLiteral(typeEEnum, Type.BIGINT);
		addEEnumLiteral(typeEEnum, Type.BINARY);
		addEEnumLiteral(typeEEnum, Type.BIT);
		addEEnumLiteral(typeEEnum, Type.BLOB);
		addEEnumLiteral(typeEEnum, Type.BOOLEAN);
		addEEnumLiteral(typeEEnum, Type.CHAR);
		addEEnumLiteral(typeEEnum, Type.CLOB);
		addEEnumLiteral(typeEEnum, Type.DATALINK);
		addEEnumLiteral(typeEEnum, Type.DATE);
		addEEnumLiteral(typeEEnum, Type.DECIMAL);
		addEEnumLiteral(typeEEnum, Type.DISTINCT);
		addEEnumLiteral(typeEEnum, Type.DOUBLE);
		addEEnumLiteral(typeEEnum, Type.FLOAT);
		addEEnumLiteral(typeEEnum, Type.INTEGER);
		addEEnumLiteral(typeEEnum, Type.JAVA_OBJECT);
		addEEnumLiteral(typeEEnum, Type.LONGNVARCHAR);
		addEEnumLiteral(typeEEnum, Type.LONGVARBINARY);
		addEEnumLiteral(typeEEnum, Type.LONGVARCHAR);
		addEEnumLiteral(typeEEnum, Type.NCHAR);
		addEEnumLiteral(typeEEnum, Type.NCLOB);
		addEEnumLiteral(typeEEnum, Type.NULL);
		addEEnumLiteral(typeEEnum, Type.NUMERIC);
		addEEnumLiteral(typeEEnum, Type.NVARCHAR);
		addEEnumLiteral(typeEEnum, Type.OTHER);
		addEEnumLiteral(typeEEnum, Type.REAL);
		addEEnumLiteral(typeEEnum, Type.REF);
		addEEnumLiteral(typeEEnum, Type.REF_CURSOR);
		addEEnumLiteral(typeEEnum, Type.ROWID);
		addEEnumLiteral(typeEEnum, Type.SMALLINT);
		addEEnumLiteral(typeEEnum, Type.SQLXML);
		addEEnumLiteral(typeEEnum, Type.STRUCT);
		addEEnumLiteral(typeEEnum, Type.TIME);
		addEEnumLiteral(typeEEnum, Type.TIMESTAMP);
		addEEnumLiteral(typeEEnum, Type.TIMESTAMP_WITH_TIMEZONE);
		addEEnumLiteral(typeEEnum, Type.TIME_WITH_TIMEZONE);
		addEEnumLiteral(typeEEnum, Type.TINYINT);
		addEEnumLiteral(typeEEnum, Type.VARBINARY);
		addEEnumLiteral(typeEEnum, Type.VARCHAR);

		initEEnum(importedKeyRuleEEnum, ImportedKeyRule.class, "ImportedKeyRule");
		addEEnumLiteral(importedKeyRuleEEnum, ImportedKeyRule.KEY_CASCADE);
		addEEnumLiteral(importedKeyRuleEEnum, ImportedKeyRule.KEY_RESTRICT);
		addEEnumLiteral(importedKeyRuleEEnum, ImportedKeyRule.KEY_SET_NULL);
		addEEnumLiteral(importedKeyRuleEEnum, ImportedKeyRule.NO_ACTION);
		addEEnumLiteral(importedKeyRuleEEnum, ImportedKeyRule.KEY_SET_DEFAULT);

		initEEnum(deferrabilityEEnum, Deferrability.class, "Deferrability");
		addEEnumLiteral(deferrabilityEEnum, Deferrability.INITIALLY_DEFERRED);
		addEEnumLiteral(deferrabilityEEnum, Deferrability.INITIALLY_IMMEDIATE);
		addEEnumLiteral(deferrabilityEEnum, Deferrability.NOT_DEFERRABLE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:org.nasdanika.models.sql
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika.models.sql</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika.models.sql";
		addAnnotation
		  (getDataType_DataType(),
		   source,
		   new String[] {
			   "enum-value", "DATA_TYPE"
		   });
		addAnnotation
		  (getDataType_Precision(),
		   source,
		   new String[] {
			   "column", "PRECISION"
		   });
		addAnnotation
		  (getDataType_LiteralPrefix(),
		   source,
		   new String[] {
			   "column", "LITERAL_PREFIX"
		   });
		addAnnotation
		  (getDataType_LiteralSuffix(),
		   source,
		   new String[] {
			   "column", "LITERAL_SUFFIX"
		   });
		addAnnotation
		  (getDataType_CreateParams(),
		   source,
		   new String[] {
			   "column", "CREATE_PARAMS"
		   });
		addAnnotation
		  (getDataType_Nullable(),
		   source,
		   new String[] {
			   "column", "NULLABLE"
		   });
		addAnnotation
		  (getDataType_CaseSensitive(),
		   source,
		   new String[] {
			   "column", "CASE_SENSITIVE"
		   });
		addAnnotation
		  (getDataType_Searchable(),
		   source,
		   new String[] {
			   "column", "SEARCHABLE"
		   });
		addAnnotation
		  (getDataType_UnsignedAttribute(),
		   source,
		   new String[] {
			   "column", "UNSIGNED_ATTRIBUTE"
		   });
		addAnnotation
		  (getDataType_FixedPrecScale(),
		   source,
		   new String[] {
			   "column", "FIXED_PREC_SCALE"
		   });
		addAnnotation
		  (getDataType_AutoIncrement(),
		   source,
		   new String[] {
			   "column", "AUTO_INCREMENT"
		   });
		addAnnotation
		  (getDataType_LocalTypeName(),
		   source,
		   new String[] {
			   "column", "LOCAL_TYPE_NAME"
		   });
		addAnnotation
		  (getDataType_MinimumScale(),
		   source,
		   new String[] {
			   "column", "MINIMUM_SCALE"
		   });
		addAnnotation
		  (getDataType_MaximumScale(),
		   source,
		   new String[] {
			   "column", "MAXIMUM_SCALE"
		   });
		addAnnotation
		  (getDataType_SqlDataType(),
		   source,
		   new String[] {
			   "column", "SQL_DATA_TYPE"
		   });
		addAnnotation
		  (getDataType_SqlDatetimeSub(),
		   source,
		   new String[] {
			   "column", "SQL_DATETIME_SUB"
		   });
		addAnnotation
		  (getDataType_NumPrecRadix(),
		   source,
		   new String[] {
			   "column", "NUM_PREC_RADIX"
		   });
		addAnnotation
		  (getColumn_DataType(),
		   source,
		   new String[] {
			   "enum-value", "DATA_TYPE"
		   });
		addAnnotation
		  (getColumn_TypeName(),
		   source,
		   new String[] {
			   "column", "TYPE_NAME"
		   });
		addAnnotation
		  (getColumn_ColumnSize(),
		   source,
		   new String[] {
			   "column", "COLUMN_SIZE"
		   });
		addAnnotation
		  (getColumn_BufferLength(),
		   source,
		   new String[] {
			   "column", "BUFFER_LENGTH"
		   });
		addAnnotation
		  (getColumn_DecimalDigits(),
		   source,
		   new String[] {
			   "column", "DECIMAL_DIGITS"
		   });
		addAnnotation
		  (getColumn_NumPrecRadix(),
		   source,
		   new String[] {
			   "column", "NUM_PREC_RADIX"
		   });
		addAnnotation
		  (getColumn_Nullable(),
		   source,
		   new String[] {
			   "column", "NULLABLE"
		   });
		addAnnotation
		  (getColumn_Remarks(),
		   source,
		   new String[] {
			   "column", "REMARKS"
		   });
		addAnnotation
		  (getColumn_ColumnDef(),
		   source,
		   new String[] {
			   "column", "COLUMN_DEF"
		   });
		addAnnotation
		  (getColumn_SqlDataType(),
		   source,
		   new String[] {
			   "column", "SQL_DATA_TYPE"
		   });
		addAnnotation
		  (getColumn_SqlDatetimeSub(),
		   source,
		   new String[] {
			   "column", "SQL_DATETIME_SUB"
		   });
		addAnnotation
		  (getColumn_CharOctetLength(),
		   source,
		   new String[] {
			   "column", "CHAR_OCTET_LENGTH"
		   });
		addAnnotation
		  (getColumn_OrdinalPosition(),
		   source,
		   new String[] {
			   "column", "ORDINAL_POSITION"
		   });
		addAnnotation
		  (getColumn_IsNullable(),
		   source,
		   new String[] {
			   "column", "IS_NULLABLE"
		   });
		addAnnotation
		  (getColumn_ScopeCatalog(),
		   source,
		   new String[] {
			   "column", "SCOPE_CATALOG"
		   });
		addAnnotation
		  (getColumn_ScopeSchema(),
		   source,
		   new String[] {
			   "column", "SCOPE_SCHEMA"
		   });
		addAnnotation
		  (getColumn_ScopeTable(),
		   source,
		   new String[] {
			   "column", "SCOPE_TABLE"
		   });
		addAnnotation
		  (getColumn_SourceDataType(),
		   source,
		   new String[] {
			   "column", "SOURCE_DATA_TYPE"
		   });
		addAnnotation
		  (getColumn_IsAutoincrement(),
		   source,
		   new String[] {
			   "column", "IS_AUTOINCREMENT"
		   });
		addAnnotation
		  (getColumn_IsGeneratedcolumn(),
		   source,
		   new String[] {
			   "column", "IS_GENERATEDCOLUMN"
		   });
		addAnnotation
		  (getImportedKey_UpdateRule(),
		   source,
		   new String[] {
			   "enum-value", "UPDATE_RULE"
		   });
		addAnnotation
		  (getImportedKey_DeleteRule(),
		   source,
		   new String[] {
			   "enum-value", "DELETE_RULE"
		   });
		addAnnotation
		  (getImportedKey_Deferrability(),
		   source,
		   new String[] {
			   "enum-value", "DEFERRABILITY"
		   });
	}

} //SqlPackageImpl
