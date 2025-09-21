/**
 */
package Sql.impl;

import Sql.Catalog;
import Sql.Column;
import Sql.DataType;
import Sql.ImportedKey;
import Sql.PrimaryKey;
import Sql.Schema;
import Sql.SqlFactory;
import Sql.SqlPackage;
import Sql.Table;
import Sql.TableType;
import Sql.Types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
	private EEnum typesEEnum = null;

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
	 * @see Sql.SqlPackage#eNS_URI
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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(org.nasdanika.models.sql.SqlPackage.eNS_URI);
		org.nasdanika.models.sql.impl.SqlPackageImpl theSqlPackage_1 = (org.nasdanika.models.sql.impl.SqlPackageImpl)(registeredPackage instanceof org.nasdanika.models.sql.impl.SqlPackageImpl ? registeredPackage : org.nasdanika.models.sql.SqlPackage.eINSTANCE);

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
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_TypeName() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_DataType() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_Precision() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_LiteralPrefix() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_LiteralSuffix() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_CreateParams() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_Nullable() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_CaseSensitive() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_Searchable() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_UnsignedAttribute() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_FixedPrecScale() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_AutoIncrement() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_LocalTypeName() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_MinimumScale() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_MaximumScale() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_SqlDataType() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_SqlDatetimeSub() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_NumPrecRadix() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(17);
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
	public EAttribute getTableType_TableType() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getCatalog_TableCat() {
		return (EAttribute)catalogEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getSchema_TableSchem() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchema_TableCatalog() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getTable_TableCat() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_TableSchem() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_TableName() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_TableType() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_Remarks() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_TypeCat() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_TypeSchem() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_TypeName() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_SelfReferencingColName() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTable_RefGeneration() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getColumn_TableCat() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_TableSchem() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_TableName() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ColumnName() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_DataType() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_TypeName() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ColumnSize() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_BufferLength() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_DecimalDigits() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_NumPrecRadix() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_Nullable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_Remarks() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ColumnDef() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_SqlDataType() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_SqlDatetimeSub() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_CharOctetLength() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_OrdinalPosition() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_IsNullable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ScopeCatalog() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ScopeSchema() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_ScopeTable() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_SourceDataType() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_IsAutoincrement() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumn_IsGeneratedcolumn() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(23);
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
	public EAttribute getPrimaryKey_TableCat() {
		return (EAttribute)primaryKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaryKey_TableSchem() {
		return (EAttribute)primaryKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaryKey_TableName() {
		return (EAttribute)primaryKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaryKey_ColumnName() {
		return (EAttribute)primaryKeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaryKey_KeySeq() {
		return (EAttribute)primaryKeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaryKey_PkName() {
		return (EAttribute)primaryKeyEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getImportedKey_PktableCat() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_PktableSchem() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_PktableName() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_PkcolumnName() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_FktableCat() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_FktableSchem() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_FktableName() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_FkcolumnName() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_KeySeq() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_UpdateRule() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_DeleteRule() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_FkName() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_PkName() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportedKey_Deferrability() {
		return (EAttribute)importedKeyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypes() {
		return typesEEnum;
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
		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__TYPE_NAME);
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
		createEAttribute(tableTypeEClass, TABLE_TYPE__TABLE_TYPE);

		catalogEClass = createEClass(CATALOG);
		createEAttribute(catalogEClass, CATALOG__TABLE_CAT);

		schemaEClass = createEClass(SCHEMA);
		createEAttribute(schemaEClass, SCHEMA__TABLE_SCHEM);
		createEAttribute(schemaEClass, SCHEMA__TABLE_CATALOG);

		tableEClass = createEClass(TABLE);
		createEAttribute(tableEClass, TABLE__TABLE_CAT);
		createEAttribute(tableEClass, TABLE__TABLE_SCHEM);
		createEAttribute(tableEClass, TABLE__TABLE_NAME);
		createEAttribute(tableEClass, TABLE__TABLE_TYPE);
		createEAttribute(tableEClass, TABLE__REMARKS);
		createEAttribute(tableEClass, TABLE__TYPE_CAT);
		createEAttribute(tableEClass, TABLE__TYPE_SCHEM);
		createEAttribute(tableEClass, TABLE__TYPE_NAME);
		createEAttribute(tableEClass, TABLE__SELF_REFERENCING_COL_NAME);
		createEAttribute(tableEClass, TABLE__REF_GENERATION);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__TABLE_CAT);
		createEAttribute(columnEClass, COLUMN__TABLE_SCHEM);
		createEAttribute(columnEClass, COLUMN__TABLE_NAME);
		createEAttribute(columnEClass, COLUMN__COLUMN_NAME);
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
		createEAttribute(primaryKeyEClass, PRIMARY_KEY__TABLE_CAT);
		createEAttribute(primaryKeyEClass, PRIMARY_KEY__TABLE_SCHEM);
		createEAttribute(primaryKeyEClass, PRIMARY_KEY__TABLE_NAME);
		createEAttribute(primaryKeyEClass, PRIMARY_KEY__COLUMN_NAME);
		createEAttribute(primaryKeyEClass, PRIMARY_KEY__KEY_SEQ);
		createEAttribute(primaryKeyEClass, PRIMARY_KEY__PK_NAME);

		importedKeyEClass = createEClass(IMPORTED_KEY);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__PKTABLE_CAT);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__PKTABLE_SCHEM);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__PKTABLE_NAME);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__PKCOLUMN_NAME);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__FKTABLE_CAT);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__FKTABLE_SCHEM);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__FKTABLE_NAME);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__FKCOLUMN_NAME);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__KEY_SEQ);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__UPDATE_RULE);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__DELETE_RULE);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__FK_NAME);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__PK_NAME);
		createEAttribute(importedKeyEClass, IMPORTED_KEY__DEFERRABILITY);

		// Create enums
		typesEEnum = createEEnum(TYPES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_DataType(), ecorePackage.getEIntegerObject(), "dataType", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getTableType_TableType(), ecorePackage.getEString(), "tableType", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalog_TableCat(), ecorePackage.getEString(), "tableCat", null, 0, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchema_TableSchem(), ecorePackage.getEString(), "tableSchem", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchema_TableCatalog(), ecorePackage.getEString(), "tableCatalog", null, 0, 1, Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTable_TableCat(), ecorePackage.getEString(), "tableCat", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_TableSchem(), ecorePackage.getEString(), "tableSchem", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_TableType(), ecorePackage.getEString(), "tableType", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_Remarks(), ecorePackage.getEString(), "remarks", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_TypeCat(), ecorePackage.getEString(), "typeCat", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_TypeSchem(), ecorePackage.getEString(), "typeSchem", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_SelfReferencingColName(), ecorePackage.getEString(), "selfReferencingColName", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTable_RefGeneration(), ecorePackage.getEString(), "refGeneration", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_TableCat(), ecorePackage.getEString(), "tableCat", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_TableSchem(), ecorePackage.getEString(), "tableSchem", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_DataType(), ecorePackage.getEIntegerObject(), "dataType", null, 0, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getPrimaryKey_TableCat(), ecorePackage.getEString(), "tableCat", null, 0, 1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaryKey_TableSchem(), ecorePackage.getEString(), "tableSchem", null, 0, 1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaryKey_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaryKey_ColumnName(), ecorePackage.getEString(), "columnName", null, 0, 1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaryKey_KeySeq(), ecorePackage.getEShortObject(), "keySeq", null, 0, 1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimaryKey_PkName(), ecorePackage.getEString(), "pkName", null, 0, 1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importedKeyEClass, ImportedKey.class, "ImportedKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportedKey_PktableCat(), ecorePackage.getEString(), "pktableCat", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_PktableSchem(), ecorePackage.getEString(), "pktableSchem", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_PktableName(), ecorePackage.getEString(), "pktableName", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_PkcolumnName(), ecorePackage.getEString(), "pkcolumnName", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_FktableCat(), ecorePackage.getEString(), "fktableCat", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_FktableSchem(), ecorePackage.getEString(), "fktableSchem", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_FktableName(), ecorePackage.getEString(), "fktableName", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_FkcolumnName(), ecorePackage.getEString(), "fkcolumnName", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_KeySeq(), ecorePackage.getEShortObject(), "keySeq", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_UpdateRule(), ecorePackage.getEShortObject(), "updateRule", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_DeleteRule(), ecorePackage.getEShortObject(), "deleteRule", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_FkName(), ecorePackage.getEString(), "fkName", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_PkName(), ecorePackage.getEString(), "pkName", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportedKey_Deferrability(), ecorePackage.getEShortObject(), "deferrability", null, 0, 1, ImportedKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typesEEnum, Types.class, "Types");
		addEEnumLiteral(typesEEnum, Types.ARRAY);
		addEEnumLiteral(typesEEnum, Types.BIGINT);
		addEEnumLiteral(typesEEnum, Types.BINARY);
		addEEnumLiteral(typesEEnum, Types.BIT);
		addEEnumLiteral(typesEEnum, Types.BLOB);
		addEEnumLiteral(typesEEnum, Types.BOOLEAN);
		addEEnumLiteral(typesEEnum, Types.CHAR);
		addEEnumLiteral(typesEEnum, Types.CLOB);
		addEEnumLiteral(typesEEnum, Types.DATALINK);
		addEEnumLiteral(typesEEnum, Types.DATE);
		addEEnumLiteral(typesEEnum, Types.DECIMAL);
		addEEnumLiteral(typesEEnum, Types.DISTINCT);
		addEEnumLiteral(typesEEnum, Types.DOUBLE);
		addEEnumLiteral(typesEEnum, Types.FLOAT);
		addEEnumLiteral(typesEEnum, Types.INTEGER);
		addEEnumLiteral(typesEEnum, Types.JAVA_OBJECT);
		addEEnumLiteral(typesEEnum, Types.LONGNVARCHAR);
		addEEnumLiteral(typesEEnum, Types.LONGVARBINARY);
		addEEnumLiteral(typesEEnum, Types.LONGVARCHAR);
		addEEnumLiteral(typesEEnum, Types.NCHAR);
		addEEnumLiteral(typesEEnum, Types.NCLOB);
		addEEnumLiteral(typesEEnum, Types.NULL);
		addEEnumLiteral(typesEEnum, Types.NUMERIC);
		addEEnumLiteral(typesEEnum, Types.NVARCHAR);
		addEEnumLiteral(typesEEnum, Types.OTHER);
		addEEnumLiteral(typesEEnum, Types.REAL);
		addEEnumLiteral(typesEEnum, Types.REF);
		addEEnumLiteral(typesEEnum, Types.REF_CURSOR);
		addEEnumLiteral(typesEEnum, Types.ROWID);
		addEEnumLiteral(typesEEnum, Types.SMALLINT);
		addEEnumLiteral(typesEEnum, Types.SQLXML);
		addEEnumLiteral(typesEEnum, Types.STRUCT);
		addEEnumLiteral(typesEEnum, Types.TIME);
		addEEnumLiteral(typesEEnum, Types.TIMESTAMP);
		addEEnumLiteral(typesEEnum, Types.TIMESTAMP_WITH_TIMEZONE);
		addEEnumLiteral(typesEEnum, Types.TIME_WITH_TIMEZONE);
		addEEnumLiteral(typesEEnum, Types.TINYINT);
		addEEnumLiteral(typesEEnum, Types.VARBINARY);
		addEEnumLiteral(typesEEnum, Types.VARCHAR);

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
		  (getDataType_TypeName(),
		   source,
		   new String[] {
			   "column", "TYPE_NAME"
		   });
		addAnnotation
		  (getDataType_DataType(),
		   source,
		   new String[] {
			   "column", "DATA_TYPE"
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
		  (getTableType_TableType(),
		   source,
		   new String[] {
			   "column", "TABLE_TYPE"
		   });
		addAnnotation
		  (getCatalog_TableCat(),
		   source,
		   new String[] {
			   "column", "TABLE_CAT"
		   });
		addAnnotation
		  (getSchema_TableSchem(),
		   source,
		   new String[] {
			   "column", "TABLE_SCHEM"
		   });
		addAnnotation
		  (getSchema_TableCatalog(),
		   source,
		   new String[] {
			   "column", "TABLE_CATALOG"
		   });
		addAnnotation
		  (getTable_TableCat(),
		   source,
		   new String[] {
			   "column", "TABLE_CAT"
		   });
		addAnnotation
		  (getTable_TableSchem(),
		   source,
		   new String[] {
			   "column", "TABLE_SCHEM"
		   });
		addAnnotation
		  (getTable_TableName(),
		   source,
		   new String[] {
			   "column", "TABLE_NAME"
		   });
		addAnnotation
		  (getTable_TableType(),
		   source,
		   new String[] {
			   "column", "TABLE_TYPE"
		   });
		addAnnotation
		  (getTable_Remarks(),
		   source,
		   new String[] {
			   "column", "REMARKS"
		   });
		addAnnotation
		  (getTable_TypeCat(),
		   source,
		   new String[] {
			   "column", "TYPE_CAT"
		   });
		addAnnotation
		  (getTable_TypeSchem(),
		   source,
		   new String[] {
			   "column", "TYPE_SCHEM"
		   });
		addAnnotation
		  (getTable_TypeName(),
		   source,
		   new String[] {
			   "column", "TYPE_NAME"
		   });
		addAnnotation
		  (getTable_SelfReferencingColName(),
		   source,
		   new String[] {
			   "column", "SELF_REFERENCING_COL_NAME"
		   });
		addAnnotation
		  (getTable_RefGeneration(),
		   source,
		   new String[] {
			   "column", "REF_GENERATION"
		   });
		addAnnotation
		  (getColumn_TableCat(),
		   source,
		   new String[] {
			   "column", "TABLE_CAT"
		   });
		addAnnotation
		  (getColumn_TableSchem(),
		   source,
		   new String[] {
			   "column", "TABLE_SCHEM"
		   });
		addAnnotation
		  (getColumn_TableName(),
		   source,
		   new String[] {
			   "column", "TABLE_NAME"
		   });
		addAnnotation
		  (getColumn_ColumnName(),
		   source,
		   new String[] {
			   "column", "COLUMN_NAME"
		   });
		addAnnotation
		  (getColumn_DataType(),
		   source,
		   new String[] {
			   "column", "DATA_TYPE"
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
		  (getPrimaryKey_TableCat(),
		   source,
		   new String[] {
			   "column", "TABLE_CAT"
		   });
		addAnnotation
		  (getPrimaryKey_TableSchem(),
		   source,
		   new String[] {
			   "column", "TABLE_SCHEM"
		   });
		addAnnotation
		  (getPrimaryKey_TableName(),
		   source,
		   new String[] {
			   "column", "TABLE_NAME"
		   });
		addAnnotation
		  (getPrimaryKey_ColumnName(),
		   source,
		   new String[] {
			   "column", "COLUMN_NAME"
		   });
		addAnnotation
		  (getPrimaryKey_KeySeq(),
		   source,
		   new String[] {
			   "column", "KEY_SEQ"
		   });
		addAnnotation
		  (getPrimaryKey_PkName(),
		   source,
		   new String[] {
			   "column", "PK_NAME"
		   });
		addAnnotation
		  (getImportedKey_PktableCat(),
		   source,
		   new String[] {
			   "column", "PKTABLE_CAT"
		   });
		addAnnotation
		  (getImportedKey_PktableSchem(),
		   source,
		   new String[] {
			   "column", "PKTABLE_SCHEM"
		   });
		addAnnotation
		  (getImportedKey_PktableName(),
		   source,
		   new String[] {
			   "column", "PKTABLE_NAME"
		   });
		addAnnotation
		  (getImportedKey_PkcolumnName(),
		   source,
		   new String[] {
			   "column", "PKCOLUMN_NAME"
		   });
		addAnnotation
		  (getImportedKey_FktableCat(),
		   source,
		   new String[] {
			   "column", "FKTABLE_CAT"
		   });
		addAnnotation
		  (getImportedKey_FktableSchem(),
		   source,
		   new String[] {
			   "column", "FKTABLE_SCHEM"
		   });
		addAnnotation
		  (getImportedKey_FktableName(),
		   source,
		   new String[] {
			   "column", "FKTABLE_NAME"
		   });
		addAnnotation
		  (getImportedKey_FkcolumnName(),
		   source,
		   new String[] {
			   "column", "FKCOLUMN_NAME"
		   });
		addAnnotation
		  (getImportedKey_KeySeq(),
		   source,
		   new String[] {
			   "column", "KEY_SEQ"
		   });
		addAnnotation
		  (getImportedKey_UpdateRule(),
		   source,
		   new String[] {
			   "column", "UPDATE_RULE"
		   });
		addAnnotation
		  (getImportedKey_DeleteRule(),
		   source,
		   new String[] {
			   "column", "DELETE_RULE"
		   });
		addAnnotation
		  (getImportedKey_FkName(),
		   source,
		   new String[] {
			   "column", "FK_NAME"
		   });
		addAnnotation
		  (getImportedKey_PkName(),
		   source,
		   new String[] {
			   "column", "PK_NAME"
		   });
		addAnnotation
		  (getImportedKey_Deferrability(),
		   source,
		   new String[] {
			   "column", "DEFERRABILITY"
		   });
	}

} //SqlPackageImpl
