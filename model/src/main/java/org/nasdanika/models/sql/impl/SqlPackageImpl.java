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
import org.nasdanika.models.sql.ImportedKey;
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
	private EEnum typeEEnum = null;

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

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Sql.SqlPackage.eNS_URI);
		Sql.impl.SqlPackageImpl theSqlPackage_1 = (Sql.impl.SqlPackageImpl)(registeredPackage instanceof Sql.impl.SqlPackageImpl ? registeredPackage : Sql.SqlPackage.eINSTANCE);

		// Create package meta-data objects
		theSqlPackage.createPackageContents();
		theSqlPackage_1.createPackageContents();

		// Initialize created meta-data
		theSqlPackage.initializePackageContents();
		theSqlPackage_1.initializePackageContents();

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
	public EReference getColumn_DataType() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
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
	public EClass getImportedKey() {
		return importedKeyEClass;
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
		createEReference(columnEClass, COLUMN__DATA_TYPE);

		primaryKeyEClass = createEClass(PRIMARY_KEY);

		importedKeyEClass = createEClass(IMPORTED_KEY);

		// Create enums
		typeEEnum = createEEnum(TYPE);
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
		initEReference(getColumn_DataType(), this.getDataType(), null, "dataType", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyEClass, PrimaryKey.class, "PrimaryKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(importedKeyEClass, ImportedKey.class, "ImportedKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
	}

} //SqlPackageImpl
