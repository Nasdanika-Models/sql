/**
 */
package Sql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Sql.SqlFactory
 * @model kind="package"
 * @generated
 */
public interface SqlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Sql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "null";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "null";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SqlPackage eINSTANCE = Sql.impl.SqlPackageImpl.init();

	/**
	 * The meta object id for the '{@link Sql.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sql.impl.DataTypeImpl
	 * @see Sql.impl.SqlPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PRECISION = 2;

	/**
	 * The feature id for the '<em><b>Literal Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LITERAL_PREFIX = 3;

	/**
	 * The feature id for the '<em><b>Literal Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LITERAL_SUFFIX = 4;

	/**
	 * The feature id for the '<em><b>Create Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CREATE_PARAMS = 5;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NULLABLE = 6;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CASE_SENSITIVE = 7;

	/**
	 * The feature id for the '<em><b>Searchable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SEARCHABLE = 8;

	/**
	 * The feature id for the '<em><b>Unsigned Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__UNSIGNED_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Fixed Prec Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__FIXED_PREC_SCALE = 10;

	/**
	 * The feature id for the '<em><b>Auto Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__AUTO_INCREMENT = 11;

	/**
	 * The feature id for the '<em><b>Local Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LOCAL_TYPE_NAME = 12;

	/**
	 * The feature id for the '<em><b>Minimum Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MINIMUM_SCALE = 13;

	/**
	 * The feature id for the '<em><b>Maximum Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MAXIMUM_SCALE = 14;

	/**
	 * The feature id for the '<em><b>Sql Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SQL_DATA_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Sql Datetime Sub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SQL_DATETIME_SUB = 16;

	/**
	 * The feature id for the '<em><b>Num Prec Radix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NUM_PREC_RADIX = 17;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sql.impl.TableTypeImpl <em>Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sql.impl.TableTypeImpl
	 * @see Sql.impl.SqlPackageImpl#getTableType()
	 * @generated
	 */
	int TABLE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Table Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TABLE_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sql.impl.CatalogImpl <em>Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sql.impl.CatalogImpl
	 * @see Sql.impl.SqlPackageImpl#getCatalog()
	 * @generated
	 */
	int CATALOG = 2;

	/**
	 * The feature id for the '<em><b>Table Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG__TABLE_CAT = 0;

	/**
	 * The number of structural features of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sql.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sql.impl.SchemaImpl
	 * @see Sql.impl.SqlPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 3;

	/**
	 * The feature id for the '<em><b>Table Schem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TABLE_SCHEM = 0;

	/**
	 * The feature id for the '<em><b>Table Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TABLE_CATALOG = 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sql.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sql.impl.TableImpl
	 * @see Sql.impl.SqlPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 4;

	/**
	 * The feature id for the '<em><b>Table Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_CAT = 0;

	/**
	 * The feature id for the '<em><b>Table Schem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_SCHEM = 1;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Table Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__REMARKS = 4;

	/**
	 * The feature id for the '<em><b>Type Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TYPE_CAT = 5;

	/**
	 * The feature id for the '<em><b>Type Schem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TYPE_SCHEM = 6;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TYPE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Self Referencing Col Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SELF_REFERENCING_COL_NAME = 8;

	/**
	 * The feature id for the '<em><b>Ref Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__REF_GENERATION = 9;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sql.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sql.impl.ColumnImpl
	 * @see Sql.impl.SqlPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Table Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE_CAT = 0;

	/**
	 * The feature id for the '<em><b>Table Schem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE_SCHEM = 1;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_NAME = 3;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Column Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_SIZE = 6;

	/**
	 * The feature id for the '<em><b>Buffer Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__BUFFER_LENGTH = 7;

	/**
	 * The feature id for the '<em><b>Decimal Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__DECIMAL_DIGITS = 8;

	/**
	 * The feature id for the '<em><b>Num Prec Radix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NUM_PREC_RADIX = 9;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NULLABLE = 10;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__REMARKS = 11;

	/**
	 * The feature id for the '<em><b>Column Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_DEF = 12;

	/**
	 * The feature id for the '<em><b>Sql Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SQL_DATA_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Sql Datetime Sub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SQL_DATETIME_SUB = 14;

	/**
	 * The feature id for the '<em><b>Char Octet Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CHAR_OCTET_LENGTH = 15;

	/**
	 * The feature id for the '<em><b>Ordinal Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ORDINAL_POSITION = 16;

	/**
	 * The feature id for the '<em><b>Is Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_NULLABLE = 17;

	/**
	 * The feature id for the '<em><b>Scope Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SCOPE_CATALOG = 18;

	/**
	 * The feature id for the '<em><b>Scope Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SCOPE_SCHEMA = 19;

	/**
	 * The feature id for the '<em><b>Scope Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SCOPE_TABLE = 20;

	/**
	 * The feature id for the '<em><b>Source Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__SOURCE_DATA_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Is Autoincrement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_AUTOINCREMENT = 22;

	/**
	 * The feature id for the '<em><b>Is Generatedcolumn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__IS_GENERATEDCOLUMN = 23;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sql.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sql.impl.PrimaryKeyImpl
	 * @see Sql.impl.SqlPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 6;

	/**
	 * The feature id for the '<em><b>Table Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__TABLE_CAT = 0;

	/**
	 * The feature id for the '<em><b>Table Schem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__TABLE_SCHEM = 1;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__TABLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__COLUMN_NAME = 3;

	/**
	 * The feature id for the '<em><b>Key Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__KEY_SEQ = 4;

	/**
	 * The feature id for the '<em><b>Pk Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__PK_NAME = 5;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sql.impl.ImportedKeyImpl <em>Imported Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sql.impl.ImportedKeyImpl
	 * @see Sql.impl.SqlPackageImpl#getImportedKey()
	 * @generated
	 */
	int IMPORTED_KEY = 7;

	/**
	 * The feature id for the '<em><b>Pktable Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__PKTABLE_CAT = 0;

	/**
	 * The feature id for the '<em><b>Pktable Schem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__PKTABLE_SCHEM = 1;

	/**
	 * The feature id for the '<em><b>Pktable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__PKTABLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Pkcolumn Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__PKCOLUMN_NAME = 3;

	/**
	 * The feature id for the '<em><b>Fktable Cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__FKTABLE_CAT = 4;

	/**
	 * The feature id for the '<em><b>Fktable Schem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__FKTABLE_SCHEM = 5;

	/**
	 * The feature id for the '<em><b>Fktable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__FKTABLE_NAME = 6;

	/**
	 * The feature id for the '<em><b>Fkcolumn Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__FKCOLUMN_NAME = 7;

	/**
	 * The feature id for the '<em><b>Key Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__KEY_SEQ = 8;

	/**
	 * The feature id for the '<em><b>Update Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__UPDATE_RULE = 9;

	/**
	 * The feature id for the '<em><b>Delete Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__DELETE_RULE = 10;

	/**
	 * The feature id for the '<em><b>Fk Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__FK_NAME = 11;

	/**
	 * The feature id for the '<em><b>Pk Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__PK_NAME = 12;

	/**
	 * The feature id for the '<em><b>Deferrability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY__DEFERRABILITY = 13;

	/**
	 * The number of structural features of the '<em>Imported Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Imported Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Sql.Types <em>Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Sql.Types
	 * @see Sql.impl.SqlPackageImpl#getTypes()
	 * @generated
	 */
	int TYPES = 8;


	/**
	 * Returns the meta object for class '{@link Sql.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see Sql.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see Sql.DataType#getTypeName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see Sql.DataType#getDataType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_DataType();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see Sql.DataType#getPrecision()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Precision();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getLiteralPrefix <em>Literal Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Prefix</em>'.
	 * @see Sql.DataType#getLiteralPrefix()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_LiteralPrefix();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getLiteralSuffix <em>Literal Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Suffix</em>'.
	 * @see Sql.DataType#getLiteralSuffix()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_LiteralSuffix();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getCreateParams <em>Create Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Params</em>'.
	 * @see Sql.DataType#getCreateParams()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_CreateParams();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see Sql.DataType#getNullable()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getCaseSensitive <em>Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Sensitive</em>'.
	 * @see Sql.DataType#getCaseSensitive()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_CaseSensitive();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getSearchable <em>Searchable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Searchable</em>'.
	 * @see Sql.DataType#getSearchable()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Searchable();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getUnsignedAttribute <em>Unsigned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsigned Attribute</em>'.
	 * @see Sql.DataType#getUnsignedAttribute()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_UnsignedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getFixedPrecScale <em>Fixed Prec Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Prec Scale</em>'.
	 * @see Sql.DataType#getFixedPrecScale()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_FixedPrecScale();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getAutoIncrement <em>Auto Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Increment</em>'.
	 * @see Sql.DataType#getAutoIncrement()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_AutoIncrement();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getLocalTypeName <em>Local Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Type Name</em>'.
	 * @see Sql.DataType#getLocalTypeName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_LocalTypeName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getMinimumScale <em>Minimum Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Scale</em>'.
	 * @see Sql.DataType#getMinimumScale()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_MinimumScale();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getMaximumScale <em>Maximum Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Scale</em>'.
	 * @see Sql.DataType#getMaximumScale()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_MaximumScale();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getSqlDataType <em>Sql Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Data Type</em>'.
	 * @see Sql.DataType#getSqlDataType()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_SqlDataType();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getSqlDatetimeSub <em>Sql Datetime Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Datetime Sub</em>'.
	 * @see Sql.DataType#getSqlDatetimeSub()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_SqlDatetimeSub();

	/**
	 * Returns the meta object for the attribute '{@link Sql.DataType#getNumPrecRadix <em>Num Prec Radix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Prec Radix</em>'.
	 * @see Sql.DataType#getNumPrecRadix()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_NumPrecRadix();

	/**
	 * Returns the meta object for class '{@link Sql.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Type</em>'.
	 * @see Sql.TableType
	 * @generated
	 */
	EClass getTableType();

	/**
	 * Returns the meta object for the attribute '{@link Sql.TableType#getTableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Type</em>'.
	 * @see Sql.TableType#getTableType()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_TableType();

	/**
	 * Returns the meta object for class '{@link Sql.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalog</em>'.
	 * @see Sql.Catalog
	 * @generated
	 */
	EClass getCatalog();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Catalog#getTableCat <em>Table Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Cat</em>'.
	 * @see Sql.Catalog#getTableCat()
	 * @see #getCatalog()
	 * @generated
	 */
	EAttribute getCatalog_TableCat();

	/**
	 * Returns the meta object for class '{@link Sql.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see Sql.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Schema#getTableSchem <em>Table Schem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Schem</em>'.
	 * @see Sql.Schema#getTableSchem()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_TableSchem();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Schema#getTableCatalog <em>Table Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Catalog</em>'.
	 * @see Sql.Schema#getTableCatalog()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_TableCatalog();

	/**
	 * Returns the meta object for class '{@link Sql.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see Sql.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Table#getTableCat <em>Table Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Cat</em>'.
	 * @see Sql.Table#getTableCat()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TableCat();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Table#getTableSchem <em>Table Schem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Schem</em>'.
	 * @see Sql.Table#getTableSchem()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TableSchem();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Table#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see Sql.Table#getTableName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TableName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Table#getTableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Type</em>'.
	 * @see Sql.Table#getTableType()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TableType();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Table#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see Sql.Table#getRemarks()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Table#getTypeCat <em>Type Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Cat</em>'.
	 * @see Sql.Table#getTypeCat()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TypeCat();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Table#getTypeSchem <em>Type Schem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Schem</em>'.
	 * @see Sql.Table#getTypeSchem()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TypeSchem();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Table#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see Sql.Table#getTypeName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Table#getSelfReferencingColName <em>Self Referencing Col Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Referencing Col Name</em>'.
	 * @see Sql.Table#getSelfReferencingColName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_SelfReferencingColName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Table#getRefGeneration <em>Ref Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Generation</em>'.
	 * @see Sql.Table#getRefGeneration()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_RefGeneration();

	/**
	 * Returns the meta object for class '{@link Sql.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see Sql.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getTableCat <em>Table Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Cat</em>'.
	 * @see Sql.Column#getTableCat()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_TableCat();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getTableSchem <em>Table Schem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Schem</em>'.
	 * @see Sql.Column#getTableSchem()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_TableSchem();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see Sql.Column#getTableName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_TableName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see Sql.Column#getColumnName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see Sql.Column#getDataType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_DataType();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see Sql.Column#getTypeName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getColumnSize <em>Column Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Size</em>'.
	 * @see Sql.Column#getColumnSize()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnSize();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getBufferLength <em>Buffer Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffer Length</em>'.
	 * @see Sql.Column#getBufferLength()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_BufferLength();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getDecimalDigits <em>Decimal Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Digits</em>'.
	 * @see Sql.Column#getDecimalDigits()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_DecimalDigits();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getNumPrecRadix <em>Num Prec Radix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Prec Radix</em>'.
	 * @see Sql.Column#getNumPrecRadix()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_NumPrecRadix();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see Sql.Column#getNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see Sql.Column#getRemarks()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getColumnDef <em>Column Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Def</em>'.
	 * @see Sql.Column#getColumnDef()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnDef();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getSqlDataType <em>Sql Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Data Type</em>'.
	 * @see Sql.Column#getSqlDataType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_SqlDataType();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getSqlDatetimeSub <em>Sql Datetime Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sql Datetime Sub</em>'.
	 * @see Sql.Column#getSqlDatetimeSub()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_SqlDatetimeSub();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getCharOctetLength <em>Char Octet Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char Octet Length</em>'.
	 * @see Sql.Column#getCharOctetLength()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_CharOctetLength();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getOrdinalPosition <em>Ordinal Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordinal Position</em>'.
	 * @see Sql.Column#getOrdinalPosition()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_OrdinalPosition();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getIsNullable <em>Is Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nullable</em>'.
	 * @see Sql.Column#getIsNullable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsNullable();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getScopeCatalog <em>Scope Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope Catalog</em>'.
	 * @see Sql.Column#getScopeCatalog()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ScopeCatalog();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getScopeSchema <em>Scope Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope Schema</em>'.
	 * @see Sql.Column#getScopeSchema()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ScopeSchema();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getScopeTable <em>Scope Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope Table</em>'.
	 * @see Sql.Column#getScopeTable()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ScopeTable();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getSourceDataType <em>Source Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Data Type</em>'.
	 * @see Sql.Column#getSourceDataType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_SourceDataType();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getIsAutoincrement <em>Is Autoincrement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Autoincrement</em>'.
	 * @see Sql.Column#getIsAutoincrement()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsAutoincrement();

	/**
	 * Returns the meta object for the attribute '{@link Sql.Column#getIsGeneratedcolumn <em>Is Generatedcolumn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Generatedcolumn</em>'.
	 * @see Sql.Column#getIsGeneratedcolumn()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_IsGeneratedcolumn();

	/**
	 * Returns the meta object for class '{@link Sql.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see Sql.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link Sql.PrimaryKey#getTableCat <em>Table Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Cat</em>'.
	 * @see Sql.PrimaryKey#getTableCat()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_TableCat();

	/**
	 * Returns the meta object for the attribute '{@link Sql.PrimaryKey#getTableSchem <em>Table Schem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Schem</em>'.
	 * @see Sql.PrimaryKey#getTableSchem()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_TableSchem();

	/**
	 * Returns the meta object for the attribute '{@link Sql.PrimaryKey#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see Sql.PrimaryKey#getTableName()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_TableName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.PrimaryKey#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see Sql.PrimaryKey#getColumnName()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.PrimaryKey#getKeySeq <em>Key Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Seq</em>'.
	 * @see Sql.PrimaryKey#getKeySeq()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_KeySeq();

	/**
	 * Returns the meta object for the attribute '{@link Sql.PrimaryKey#getPkName <em>Pk Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Name</em>'.
	 * @see Sql.PrimaryKey#getPkName()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EAttribute getPrimaryKey_PkName();

	/**
	 * Returns the meta object for class '{@link Sql.ImportedKey <em>Imported Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Key</em>'.
	 * @see Sql.ImportedKey
	 * @generated
	 */
	EClass getImportedKey();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getPktableCat <em>Pktable Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pktable Cat</em>'.
	 * @see Sql.ImportedKey#getPktableCat()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_PktableCat();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getPktableSchem <em>Pktable Schem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pktable Schem</em>'.
	 * @see Sql.ImportedKey#getPktableSchem()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_PktableSchem();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getPktableName <em>Pktable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pktable Name</em>'.
	 * @see Sql.ImportedKey#getPktableName()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_PktableName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getPkcolumnName <em>Pkcolumn Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pkcolumn Name</em>'.
	 * @see Sql.ImportedKey#getPkcolumnName()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_PkcolumnName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getFktableCat <em>Fktable Cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fktable Cat</em>'.
	 * @see Sql.ImportedKey#getFktableCat()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_FktableCat();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getFktableSchem <em>Fktable Schem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fktable Schem</em>'.
	 * @see Sql.ImportedKey#getFktableSchem()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_FktableSchem();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getFktableName <em>Fktable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fktable Name</em>'.
	 * @see Sql.ImportedKey#getFktableName()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_FktableName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getFkcolumnName <em>Fkcolumn Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fkcolumn Name</em>'.
	 * @see Sql.ImportedKey#getFkcolumnName()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_FkcolumnName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getKeySeq <em>Key Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Seq</em>'.
	 * @see Sql.ImportedKey#getKeySeq()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_KeySeq();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getUpdateRule <em>Update Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Rule</em>'.
	 * @see Sql.ImportedKey#getUpdateRule()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_UpdateRule();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getDeleteRule <em>Delete Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Rule</em>'.
	 * @see Sql.ImportedKey#getDeleteRule()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_DeleteRule();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getFkName <em>Fk Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fk Name</em>'.
	 * @see Sql.ImportedKey#getFkName()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_FkName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getPkName <em>Pk Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk Name</em>'.
	 * @see Sql.ImportedKey#getPkName()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_PkName();

	/**
	 * Returns the meta object for the attribute '{@link Sql.ImportedKey#getDeferrability <em>Deferrability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deferrability</em>'.
	 * @see Sql.ImportedKey#getDeferrability()
	 * @see #getImportedKey()
	 * @generated
	 */
	EAttribute getImportedKey_Deferrability();

	/**
	 * Returns the meta object for enum '{@link Sql.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Types</em>'.
	 * @see Sql.Types
	 * @generated
	 */
	EEnum getTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SqlFactory getSqlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Sql.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sql.impl.DataTypeImpl
		 * @see Sql.impl.SqlPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__TYPE_NAME = eINSTANCE.getDataType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__DATA_TYPE = eINSTANCE.getDataType_DataType();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__PRECISION = eINSTANCE.getDataType_Precision();

		/**
		 * The meta object literal for the '<em><b>Literal Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__LITERAL_PREFIX = eINSTANCE.getDataType_LiteralPrefix();

		/**
		 * The meta object literal for the '<em><b>Literal Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__LITERAL_SUFFIX = eINSTANCE.getDataType_LiteralSuffix();

		/**
		 * The meta object literal for the '<em><b>Create Params</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__CREATE_PARAMS = eINSTANCE.getDataType_CreateParams();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NULLABLE = eINSTANCE.getDataType_Nullable();

		/**
		 * The meta object literal for the '<em><b>Case Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__CASE_SENSITIVE = eINSTANCE.getDataType_CaseSensitive();

		/**
		 * The meta object literal for the '<em><b>Searchable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__SEARCHABLE = eINSTANCE.getDataType_Searchable();

		/**
		 * The meta object literal for the '<em><b>Unsigned Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__UNSIGNED_ATTRIBUTE = eINSTANCE.getDataType_UnsignedAttribute();

		/**
		 * The meta object literal for the '<em><b>Fixed Prec Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__FIXED_PREC_SCALE = eINSTANCE.getDataType_FixedPrecScale();

		/**
		 * The meta object literal for the '<em><b>Auto Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__AUTO_INCREMENT = eINSTANCE.getDataType_AutoIncrement();

		/**
		 * The meta object literal for the '<em><b>Local Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__LOCAL_TYPE_NAME = eINSTANCE.getDataType_LocalTypeName();

		/**
		 * The meta object literal for the '<em><b>Minimum Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__MINIMUM_SCALE = eINSTANCE.getDataType_MinimumScale();

		/**
		 * The meta object literal for the '<em><b>Maximum Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__MAXIMUM_SCALE = eINSTANCE.getDataType_MaximumScale();

		/**
		 * The meta object literal for the '<em><b>Sql Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__SQL_DATA_TYPE = eINSTANCE.getDataType_SqlDataType();

		/**
		 * The meta object literal for the '<em><b>Sql Datetime Sub</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__SQL_DATETIME_SUB = eINSTANCE.getDataType_SqlDatetimeSub();

		/**
		 * The meta object literal for the '<em><b>Num Prec Radix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NUM_PREC_RADIX = eINSTANCE.getDataType_NumPrecRadix();

		/**
		 * The meta object literal for the '{@link Sql.impl.TableTypeImpl <em>Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sql.impl.TableTypeImpl
		 * @see Sql.impl.SqlPackageImpl#getTableType()
		 * @generated
		 */
		EClass TABLE_TYPE = eINSTANCE.getTableType();

		/**
		 * The meta object literal for the '<em><b>Table Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__TABLE_TYPE = eINSTANCE.getTableType_TableType();

		/**
		 * The meta object literal for the '{@link Sql.impl.CatalogImpl <em>Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sql.impl.CatalogImpl
		 * @see Sql.impl.SqlPackageImpl#getCatalog()
		 * @generated
		 */
		EClass CATALOG = eINSTANCE.getCatalog();

		/**
		 * The meta object literal for the '<em><b>Table Cat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOG__TABLE_CAT = eINSTANCE.getCatalog_TableCat();

		/**
		 * The meta object literal for the '{@link Sql.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sql.impl.SchemaImpl
		 * @see Sql.impl.SqlPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Table Schem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__TABLE_SCHEM = eINSTANCE.getSchema_TableSchem();

		/**
		 * The meta object literal for the '<em><b>Table Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__TABLE_CATALOG = eINSTANCE.getSchema_TableCatalog();

		/**
		 * The meta object literal for the '{@link Sql.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sql.impl.TableImpl
		 * @see Sql.impl.SqlPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Table Cat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TABLE_CAT = eINSTANCE.getTable_TableCat();

		/**
		 * The meta object literal for the '<em><b>Table Schem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TABLE_SCHEM = eINSTANCE.getTable_TableSchem();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TABLE_NAME = eINSTANCE.getTable_TableName();

		/**
		 * The meta object literal for the '<em><b>Table Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TABLE_TYPE = eINSTANCE.getTable_TableType();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__REMARKS = eINSTANCE.getTable_Remarks();

		/**
		 * The meta object literal for the '<em><b>Type Cat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TYPE_CAT = eINSTANCE.getTable_TypeCat();

		/**
		 * The meta object literal for the '<em><b>Type Schem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TYPE_SCHEM = eINSTANCE.getTable_TypeSchem();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TYPE_NAME = eINSTANCE.getTable_TypeName();

		/**
		 * The meta object literal for the '<em><b>Self Referencing Col Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__SELF_REFERENCING_COL_NAME = eINSTANCE.getTable_SelfReferencingColName();

		/**
		 * The meta object literal for the '<em><b>Ref Generation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__REF_GENERATION = eINSTANCE.getTable_RefGeneration();

		/**
		 * The meta object literal for the '{@link Sql.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sql.impl.ColumnImpl
		 * @see Sql.impl.SqlPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Table Cat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TABLE_CAT = eINSTANCE.getColumn_TableCat();

		/**
		 * The meta object literal for the '<em><b>Table Schem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TABLE_SCHEM = eINSTANCE.getColumn_TableSchem();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TABLE_NAME = eINSTANCE.getColumn_TableName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLUMN_NAME = eINSTANCE.getColumn_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DATA_TYPE = eINSTANCE.getColumn_DataType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE_NAME = eINSTANCE.getColumn_TypeName();

		/**
		 * The meta object literal for the '<em><b>Column Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLUMN_SIZE = eINSTANCE.getColumn_ColumnSize();

		/**
		 * The meta object literal for the '<em><b>Buffer Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__BUFFER_LENGTH = eINSTANCE.getColumn_BufferLength();

		/**
		 * The meta object literal for the '<em><b>Decimal Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__DECIMAL_DIGITS = eINSTANCE.getColumn_DecimalDigits();

		/**
		 * The meta object literal for the '<em><b>Num Prec Radix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NUM_PREC_RADIX = eINSTANCE.getColumn_NumPrecRadix();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NULLABLE = eINSTANCE.getColumn_Nullable();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__REMARKS = eINSTANCE.getColumn_Remarks();

		/**
		 * The meta object literal for the '<em><b>Column Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLUMN_DEF = eINSTANCE.getColumn_ColumnDef();

		/**
		 * The meta object literal for the '<em><b>Sql Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SQL_DATA_TYPE = eINSTANCE.getColumn_SqlDataType();

		/**
		 * The meta object literal for the '<em><b>Sql Datetime Sub</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SQL_DATETIME_SUB = eINSTANCE.getColumn_SqlDatetimeSub();

		/**
		 * The meta object literal for the '<em><b>Char Octet Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__CHAR_OCTET_LENGTH = eINSTANCE.getColumn_CharOctetLength();

		/**
		 * The meta object literal for the '<em><b>Ordinal Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__ORDINAL_POSITION = eINSTANCE.getColumn_OrdinalPosition();

		/**
		 * The meta object literal for the '<em><b>Is Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_NULLABLE = eINSTANCE.getColumn_IsNullable();

		/**
		 * The meta object literal for the '<em><b>Scope Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SCOPE_CATALOG = eINSTANCE.getColumn_ScopeCatalog();

		/**
		 * The meta object literal for the '<em><b>Scope Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SCOPE_SCHEMA = eINSTANCE.getColumn_ScopeSchema();

		/**
		 * The meta object literal for the '<em><b>Scope Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SCOPE_TABLE = eINSTANCE.getColumn_ScopeTable();

		/**
		 * The meta object literal for the '<em><b>Source Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__SOURCE_DATA_TYPE = eINSTANCE.getColumn_SourceDataType();

		/**
		 * The meta object literal for the '<em><b>Is Autoincrement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_AUTOINCREMENT = eINSTANCE.getColumn_IsAutoincrement();

		/**
		 * The meta object literal for the '<em><b>Is Generatedcolumn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__IS_GENERATEDCOLUMN = eINSTANCE.getColumn_IsGeneratedcolumn();

		/**
		 * The meta object literal for the '{@link Sql.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sql.impl.PrimaryKeyImpl
		 * @see Sql.impl.SqlPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Table Cat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__TABLE_CAT = eINSTANCE.getPrimaryKey_TableCat();

		/**
		 * The meta object literal for the '<em><b>Table Schem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__TABLE_SCHEM = eINSTANCE.getPrimaryKey_TableSchem();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__TABLE_NAME = eINSTANCE.getPrimaryKey_TableName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__COLUMN_NAME = eINSTANCE.getPrimaryKey_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Key Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__KEY_SEQ = eINSTANCE.getPrimaryKey_KeySeq();

		/**
		 * The meta object literal for the '<em><b>Pk Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY__PK_NAME = eINSTANCE.getPrimaryKey_PkName();

		/**
		 * The meta object literal for the '{@link Sql.impl.ImportedKeyImpl <em>Imported Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sql.impl.ImportedKeyImpl
		 * @see Sql.impl.SqlPackageImpl#getImportedKey()
		 * @generated
		 */
		EClass IMPORTED_KEY = eINSTANCE.getImportedKey();

		/**
		 * The meta object literal for the '<em><b>Pktable Cat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__PKTABLE_CAT = eINSTANCE.getImportedKey_PktableCat();

		/**
		 * The meta object literal for the '<em><b>Pktable Schem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__PKTABLE_SCHEM = eINSTANCE.getImportedKey_PktableSchem();

		/**
		 * The meta object literal for the '<em><b>Pktable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__PKTABLE_NAME = eINSTANCE.getImportedKey_PktableName();

		/**
		 * The meta object literal for the '<em><b>Pkcolumn Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__PKCOLUMN_NAME = eINSTANCE.getImportedKey_PkcolumnName();

		/**
		 * The meta object literal for the '<em><b>Fktable Cat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__FKTABLE_CAT = eINSTANCE.getImportedKey_FktableCat();

		/**
		 * The meta object literal for the '<em><b>Fktable Schem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__FKTABLE_SCHEM = eINSTANCE.getImportedKey_FktableSchem();

		/**
		 * The meta object literal for the '<em><b>Fktable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__FKTABLE_NAME = eINSTANCE.getImportedKey_FktableName();

		/**
		 * The meta object literal for the '<em><b>Fkcolumn Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__FKCOLUMN_NAME = eINSTANCE.getImportedKey_FkcolumnName();

		/**
		 * The meta object literal for the '<em><b>Key Seq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__KEY_SEQ = eINSTANCE.getImportedKey_KeySeq();

		/**
		 * The meta object literal for the '<em><b>Update Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__UPDATE_RULE = eINSTANCE.getImportedKey_UpdateRule();

		/**
		 * The meta object literal for the '<em><b>Delete Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__DELETE_RULE = eINSTANCE.getImportedKey_DeleteRule();

		/**
		 * The meta object literal for the '<em><b>Fk Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__FK_NAME = eINSTANCE.getImportedKey_FkName();

		/**
		 * The meta object literal for the '<em><b>Pk Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__PK_NAME = eINSTANCE.getImportedKey_PkName();

		/**
		 * The meta object literal for the '<em><b>Deferrability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_KEY__DEFERRABILITY = eINSTANCE.getImportedKey_Deferrability();

		/**
		 * The meta object literal for the '{@link Sql.Types <em>Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Sql.Types
		 * @see Sql.impl.SqlPackageImpl#getTypes()
		 * @generated
		 */
		EEnum TYPES = eINSTANCE.getTypes();

	}

} //SqlPackage
