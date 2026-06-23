/**
 */
package org.nasdanika.models.sql.ast;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.nasdanika.models.sql.ast.AstFactory
 * @model kind="package"
 * @generated
 */
public interface AstPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ast";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://sql.models.nasdanika.org/ast";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.sql.ast";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AstPackage eINSTANCE = org.nasdanika.models.sql.ast.impl.AstPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.SourceSpanImpl <em>Source Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.SourceSpanImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSourceSpan()
	 * @generated
	 */
	int SOURCE_SPAN = 0;

	/**
	 * The feature id for the '<em><b>Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SPAN__START_LINE = 0;

	/**
	 * The feature id for the '<em><b>Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SPAN__START_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SPAN__END_LINE = 2;

	/**
	 * The feature id for the '<em><b>End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SPAN__END_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SPAN__START_OFFSET = 4;

	/**
	 * The feature id for the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SPAN__END_OFFSET = 5;

	/**
	 * The number of structural features of the '<em>Source Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SPAN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Source Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_SPAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.AstNodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.AstNodeImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getAstNode()
	 * @generated
	 */
	int AST_NODE = 1;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE__SOURCE_SPAN = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE__COMMENT = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AST_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.SqlScriptImpl <em>Sql Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.SqlScriptImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSqlScript()
	 * @generated
	 */
	int SQL_SCRIPT = 2;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SCRIPT__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SCRIPT__COMMENT = AST_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Source Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SCRIPT__SOURCE_URI = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SCRIPT__DIALECT = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SCRIPT__STATEMENTS = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Leading Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SCRIPT__LEADING_COMMENTS = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sql Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SCRIPT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sql Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_SCRIPT_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.StatementImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__COMMENT = AST_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__RAW_SQL = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.UnparsedStatementImpl <em>Unparsed Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.UnparsedStatementImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getUnparsedStatement()
	 * @generated
	 */
	int UNPARSED_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_STATEMENT__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_STATEMENT__COMMENT = STATEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_STATEMENT__RAW_SQL = STATEMENT__RAW_SQL;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_STATEMENT__ERROR_MESSAGE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unparsed Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unparsed Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPARSED_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.CreateTableImpl <em>Create Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.CreateTableImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getCreateTable()
	 * @generated
	 */
	int CREATE_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE__COMMENT = STATEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE__RAW_SQL = STATEMENT__RAW_SQL;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE__TABLE_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If Not Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE__IF_NOT_EXISTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE__COLUMNS = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE__CONSTRAINTS = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Create Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Create Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TABLE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.AlterTableImpl <em>Alter Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.AlterTableImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getAlterTable()
	 * @generated
	 */
	int ALTER_TABLE = 6;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_TABLE__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_TABLE__COMMENT = STATEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_TABLE__RAW_SQL = STATEMENT__RAW_SQL;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_TABLE__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_TABLE__TABLE_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_TABLE__OPERATIONS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alter Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_TABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Alter Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_TABLE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.AlterOperationImpl <em>Alter Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.AlterOperationImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getAlterOperation()
	 * @generated
	 */
	int ALTER_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_OPERATION__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_OPERATION__COMMENT = AST_NODE__COMMENT;

	/**
	 * The number of structural features of the '<em>Alter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_OPERATION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alter Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTER_OPERATION_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.AddColumnImpl <em>Add Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.AddColumnImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getAddColumn()
	 * @generated
	 */
	int ADD_COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN__SOURCE_SPAN = ALTER_OPERATION__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN__COMMENT = ALTER_OPERATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN__COLUMN = ALTER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN_FEATURE_COUNT = ALTER_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_COLUMN_OPERATION_COUNT = ALTER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.DropColumnImpl <em>Drop Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.DropColumnImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getDropColumn()
	 * @generated
	 */
	int DROP_COLUMN = 9;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLUMN__SOURCE_SPAN = ALTER_OPERATION__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLUMN__COMMENT = ALTER_OPERATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLUMN__COLUMN_NAME = ALTER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLUMN_FEATURE_COUNT = ALTER_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drop Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_COLUMN_OPERATION_COUNT = ALTER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.AddConstraintImpl <em>Add Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.AddConstraintImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getAddConstraint()
	 * @generated
	 */
	int ADD_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSTRAINT__SOURCE_SPAN = ALTER_OPERATION__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSTRAINT__COMMENT = ALTER_OPERATION__COMMENT;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSTRAINT__CONSTRAINT = ALTER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSTRAINT_FEATURE_COUNT = ALTER_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CONSTRAINT_OPERATION_COUNT = ALTER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.DropTableImpl <em>Drop Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.DropTableImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getDropTable()
	 * @generated
	 */
	int DROP_TABLE = 11;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE__COMMENT = STATEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE__RAW_SQL = STATEMENT__RAW_SQL;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE__TABLE_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE__IF_EXISTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Drop Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Drop Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.CreateViewImpl <em>Create View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.CreateViewImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getCreateView()
	 * @generated
	 */
	int CREATE_VIEW = 12;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__COMMENT = STATEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__RAW_SQL = STATEMENT__RAW_SQL;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__VIEW_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Or Replace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__OR_REPLACE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW__QUERY = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Create View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Create View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VIEW_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.DropViewImpl <em>Drop View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.DropViewImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getDropView()
	 * @generated
	 */
	int DROP_VIEW = 13;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW__COMMENT = STATEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW__RAW_SQL = STATEMENT__RAW_SQL;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW__VIEW_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If Exists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW__IF_EXISTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Drop View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Drop View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_VIEW_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.CreateIndexImpl <em>Create Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.CreateIndexImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getCreateIndex()
	 * @generated
	 */
	int CREATE_INDEX = 14;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX__COMMENT = STATEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX__RAW_SQL = STATEMENT__RAW_SQL;

	/**
	 * The feature id for the '<em><b>Index Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX__INDEX_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX__TABLE_NAME = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX__UNIQUE = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Column Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX__COLUMN_NAMES = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Create Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Create Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_INDEX_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.DropIndexImpl <em>Drop Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.DropIndexImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getDropIndex()
	 * @generated
	 */
	int DROP_INDEX = 15;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX__COMMENT = STATEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX__RAW_SQL = STATEMENT__RAW_SQL;

	/**
	 * The feature id for the '<em><b>Index Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX__INDEX_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX__TABLE_NAME = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Drop Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Drop Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_INDEX_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.SelectImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 16;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__COMMENT = STATEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__RAW_SQL = STATEMENT__RAW_SQL;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__DISTINCT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Select Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__SELECT_ITEMS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__FROM_ITEMS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Joins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__JOINS = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__WHERE = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Group By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__GROUP_BY = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Having</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__HAVING = STATEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__ORDER_BY = STATEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.InsertImpl <em>Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.InsertImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getInsert()
	 * @generated
	 */
	int INSERT = 17;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__COMMENT = STATEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__RAW_SQL = STATEMENT__RAW_SQL;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__TABLE_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__COLUMN_NAMES = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__VALUES = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__SELECT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.UpdateImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 18;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__COMMENT = STATEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__RAW_SQL = STATEMENT__RAW_SQL;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__TABLE_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__SETS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__WHERE = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.SetClauseImpl <em>Set Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.SetClauseImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSetClause()
	 * @generated
	 */
	int SET_CLAUSE = 19;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLAUSE__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLAUSE__COMMENT = AST_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLAUSE__COLUMN_NAME = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLAUSE__VALUE = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLAUSE_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CLAUSE_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.DeleteImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 20;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__COMMENT = STATEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Raw Sql</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__RAW_SQL = STATEMENT__RAW_SQL;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__TABLE_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__WHERE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.ColumnDefinitionImpl <em>Column Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.ColumnDefinitionImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getColumnDefinition()
	 * @generated
	 */
	int COLUMN_DEFINITION = 21;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION__COMMENT = AST_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION__NAME = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION__DATA_TYPE = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION__NULLABLE = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION__DEFAULT_VALUE = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION__IDENTITY = AST_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Computed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION__COMPUTED = AST_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Computed Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION__COMPUTED_EXPRESSION = AST_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Inline Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION__INLINE_CONSTRAINTS = AST_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Column Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Column Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DEFINITION_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.TableConstraintImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getTableConstraint()
	 * @generated
	 */
	int TABLE_CONSTRAINT = 22;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT__COMMENT = AST_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT__NAME = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.PrimaryKeyConstraintImpl <em>Primary Key Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.PrimaryKeyConstraintImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getPrimaryKeyConstraint()
	 * @generated
	 */
	int PRIMARY_KEY_CONSTRAINT = 23;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT__SOURCE_SPAN = TABLE_CONSTRAINT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT__COMMENT = TABLE_CONSTRAINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT__COLUMN_NAMES = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primary Key Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primary Key Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_CONSTRAINT_OPERATION_COUNT = TABLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.ForeignKeyConstraintImpl <em>Foreign Key Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.ForeignKeyConstraintImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getForeignKeyConstraint()
	 * @generated
	 */
	int FOREIGN_KEY_CONSTRAINT = 24;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT__SOURCE_SPAN = TABLE_CONSTRAINT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT__COMMENT = TABLE_CONSTRAINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT__COLUMN_NAMES = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT__REFERENCED_TABLE = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referenced Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT__REFERENCED_SCHEMA = TABLE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Referenced Columns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT__REFERENCED_COLUMNS = TABLE_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT__ON_DELETE = TABLE_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>On Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT__ON_UPDATE = TABLE_CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Foreign Key Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Foreign Key Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_CONSTRAINT_OPERATION_COUNT = TABLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.UniqueConstraintImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getUniqueConstraint()
	 * @generated
	 */
	int UNIQUE_CONSTRAINT = 25;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__SOURCE_SPAN = TABLE_CONSTRAINT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__COMMENT = TABLE_CONSTRAINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__COLUMN_NAMES = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_OPERATION_COUNT = TABLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.CheckConstraintImpl <em>Check Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.CheckConstraintImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getCheckConstraint()
	 * @generated
	 */
	int CHECK_CONSTRAINT = 26;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__SOURCE_SPAN = TABLE_CONSTRAINT__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__COMMENT = TABLE_CONSTRAINT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__EXPRESSION = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__EXPRESSION_TEXT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Check Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Check Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT_OPERATION_COUNT = TABLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.SelectItemImpl <em>Select Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.SelectItemImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSelectItem()
	 * @generated
	 */
	int SELECT_ITEM = 27;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ITEM__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ITEM__COMMENT = AST_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ITEM__EXPRESSION = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ITEM__ALIAS = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ITEM__ALL_COLUMNS = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Table Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ITEM__TABLE_ALIAS = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Select Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ITEM_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Select Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_ITEM_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.FromItemImpl <em>From Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.FromItemImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getFromItem()
	 * @generated
	 */
	int FROM_ITEM = 28;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ITEM__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ITEM__COMMENT = AST_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ITEM__ALIAS = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>From Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ITEM_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>From Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ITEM_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.TableReferenceImpl <em>Table Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.TableReferenceImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getTableReference()
	 * @generated
	 */
	int TABLE_REFERENCE = 29;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_REFERENCE__SOURCE_SPAN = FROM_ITEM__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_REFERENCE__COMMENT = FROM_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_REFERENCE__ALIAS = FROM_ITEM__ALIAS;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_REFERENCE__SCHEMA_NAME = FROM_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_REFERENCE__TABLE_NAME = FROM_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_REFERENCE_FEATURE_COUNT = FROM_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_REFERENCE_OPERATION_COUNT = FROM_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.SubSelectImpl <em>Sub Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.SubSelectImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSubSelect()
	 * @generated
	 */
	int SUB_SELECT = 30;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SELECT__SOURCE_SPAN = FROM_ITEM__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SELECT__COMMENT = FROM_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SELECT__ALIAS = FROM_ITEM__ALIAS;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SELECT__SELECT = FROM_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SELECT_FEATURE_COUNT = FROM_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SELECT_OPERATION_COUNT = FROM_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.JoinImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 31;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__COMMENT = AST_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__TYPE = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__RIGHT_ITEM = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ON_CONDITION = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.OrderByItemImpl <em>Order By Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.OrderByItemImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getOrderByItem()
	 * @generated
	 */
	int ORDER_BY_ITEM = 32;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_ITEM__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_ITEM__COMMENT = AST_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_ITEM__EXPRESSION = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_ITEM__DIRECTION = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Order By Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_ITEM_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Order By Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_ITEM_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.ExpressionImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 33;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__COMMENT = AST_NODE__COMMENT;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.ColumnReferenceImpl <em>Column Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.ColumnReferenceImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getColumnReference()
	 * @generated
	 */
	int COLUMN_REFERENCE = 34;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__COMMENT = EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__TABLE_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__SCHEMA_NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__COLUMN_NAME = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Column Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Column Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.LiteralImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 35;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__COMMENT = EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.FunctionCallImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 36;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__COMMENT = EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__SCHEMA_NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__DISTINCT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ALL_COLUMNS = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.BinaryExpressionImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 37;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__COMMENT = EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.UnaryExpressionImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 38;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__COMMENT = EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__PREFIX = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.ParenthesisImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getParenthesis()
	 * @generated
	 */
	int PARENTHESIS = 39;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS__COMMENT = EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parenthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parenthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.CaseExpressionImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getCaseExpression()
	 * @generated
	 */
	int CASE_EXPRESSION = 40;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__COMMENT = EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Switch Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__SWITCH_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>When Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__WHEN_CLAUSES = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION__ELSE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Case Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Case Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.WhenClauseImpl <em>When Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.WhenClauseImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getWhenClause()
	 * @generated
	 */
	int WHEN_CLAUSE = 41;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CLAUSE__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CLAUSE__COMMENT = AST_NODE__COMMENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CLAUSE__CONDITION = AST_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CLAUSE__RESULT = AST_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>When Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CLAUSE_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>When Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CLAUSE_OPERATION_COUNT = AST_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.AllColumnsImpl <em>All Columns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.AllColumnsImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getAllColumns()
	 * @generated
	 */
	int ALL_COLUMNS = 42;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_COLUMNS__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_COLUMNS__COMMENT = EXPRESSION__COMMENT;

	/**
	 * The number of structural features of the '<em>All Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_COLUMNS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>All Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_COLUMNS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.impl.ExpressionListImpl <em>Expression List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.impl.ExpressionListImpl
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getExpressionList()
	 * @generated
	 */
	int EXPRESSION_LIST = 43;

	/**
	 * The feature id for the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__COMMENT = EXPRESSION__COMMENT;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.JoinType <em>Join Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.JoinType
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getJoinType()
	 * @generated
	 */
	int JOIN_TYPE = 44;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.sql.ast.SortDirection <em>Sort Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.sql.ast.SortDirection
	 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSortDirection()
	 * @generated
	 */
	int SORT_DIRECTION = 45;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.SourceSpan <em>Source Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Span</em>'.
	 * @see org.nasdanika.models.sql.ast.SourceSpan
	 * @generated
	 */
	EClass getSourceSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.SourceSpan#getStartLine <em>Start Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Line</em>'.
	 * @see org.nasdanika.models.sql.ast.SourceSpan#getStartLine()
	 * @see #getSourceSpan()
	 * @generated
	 */
	EAttribute getSourceSpan_StartLine();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.SourceSpan#getStartColumn <em>Start Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Column</em>'.
	 * @see org.nasdanika.models.sql.ast.SourceSpan#getStartColumn()
	 * @see #getSourceSpan()
	 * @generated
	 */
	EAttribute getSourceSpan_StartColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.SourceSpan#getEndLine <em>End Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Line</em>'.
	 * @see org.nasdanika.models.sql.ast.SourceSpan#getEndLine()
	 * @see #getSourceSpan()
	 * @generated
	 */
	EAttribute getSourceSpan_EndLine();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.SourceSpan#getEndColumn <em>End Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Column</em>'.
	 * @see org.nasdanika.models.sql.ast.SourceSpan#getEndColumn()
	 * @see #getSourceSpan()
	 * @generated
	 */
	EAttribute getSourceSpan_EndColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.SourceSpan#getStartOffset <em>Start Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Offset</em>'.
	 * @see org.nasdanika.models.sql.ast.SourceSpan#getStartOffset()
	 * @see #getSourceSpan()
	 * @generated
	 */
	EAttribute getSourceSpan_StartOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.SourceSpan#getEndOffset <em>End Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Offset</em>'.
	 * @see org.nasdanika.models.sql.ast.SourceSpan#getEndOffset()
	 * @see #getSourceSpan()
	 * @generated
	 */
	EAttribute getSourceSpan_EndOffset();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.AstNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.nasdanika.models.sql.ast.AstNode
	 * @generated
	 */
	EClass getAstNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.AstNode#getSourceSpan <em>Source Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Span</em>'.
	 * @see org.nasdanika.models.sql.ast.AstNode#getSourceSpan()
	 * @see #getAstNode()
	 * @generated
	 */
	EReference getAstNode_SourceSpan();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.AstNode#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.models.sql.ast.AstNode#getComment()
	 * @see #getAstNode()
	 * @generated
	 */
	EAttribute getAstNode_Comment();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.SqlScript <em>Sql Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sql Script</em>'.
	 * @see org.nasdanika.models.sql.ast.SqlScript
	 * @generated
	 */
	EClass getSqlScript();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.SqlScript#getSourceUri <em>Source Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Uri</em>'.
	 * @see org.nasdanika.models.sql.ast.SqlScript#getSourceUri()
	 * @see #getSqlScript()
	 * @generated
	 */
	EAttribute getSqlScript_SourceUri();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.SqlScript#getDialect <em>Dialect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialect</em>'.
	 * @see org.nasdanika.models.sql.ast.SqlScript#getDialect()
	 * @see #getSqlScript()
	 * @generated
	 */
	EAttribute getSqlScript_Dialect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.SqlScript#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.nasdanika.models.sql.ast.SqlScript#getStatements()
	 * @see #getSqlScript()
	 * @generated
	 */
	EReference getSqlScript_Statements();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.sql.ast.SqlScript#getLeadingComments <em>Leading Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Leading Comments</em>'.
	 * @see org.nasdanika.models.sql.ast.SqlScript#getLeadingComments()
	 * @see #getSqlScript()
	 * @generated
	 */
	EAttribute getSqlScript_LeadingComments();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.nasdanika.models.sql.ast.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.Statement#getRawSql <em>Raw Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Sql</em>'.
	 * @see org.nasdanika.models.sql.ast.Statement#getRawSql()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_RawSql();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.UnparsedStatement <em>Unparsed Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unparsed Statement</em>'.
	 * @see org.nasdanika.models.sql.ast.UnparsedStatement
	 * @generated
	 */
	EClass getUnparsedStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.UnparsedStatement#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see org.nasdanika.models.sql.ast.UnparsedStatement#getErrorMessage()
	 * @see #getUnparsedStatement()
	 * @generated
	 */
	EAttribute getUnparsedStatement_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.CreateTable <em>Create Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Table</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateTable
	 * @generated
	 */
	EClass getCreateTable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.CreateTable#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateTable#getSchemaName()
	 * @see #getCreateTable()
	 * @generated
	 */
	EAttribute getCreateTable_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.CreateTable#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateTable#getTableName()
	 * @see #getCreateTable()
	 * @generated
	 */
	EAttribute getCreateTable_TableName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.CreateTable#isIfNotExists <em>If Not Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Not Exists</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateTable#isIfNotExists()
	 * @see #getCreateTable()
	 * @generated
	 */
	EAttribute getCreateTable_IfNotExists();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.CreateTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateTable#getColumns()
	 * @see #getCreateTable()
	 * @generated
	 */
	EReference getCreateTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.CreateTable#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateTable#getConstraints()
	 * @see #getCreateTable()
	 * @generated
	 */
	EReference getCreateTable_Constraints();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.AlterTable <em>Alter Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alter Table</em>'.
	 * @see org.nasdanika.models.sql.ast.AlterTable
	 * @generated
	 */
	EClass getAlterTable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.AlterTable#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.AlterTable#getSchemaName()
	 * @see #getAlterTable()
	 * @generated
	 */
	EAttribute getAlterTable_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.AlterTable#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.nasdanika.models.sql.ast.AlterTable#getTableName()
	 * @see #getAlterTable()
	 * @generated
	 */
	EAttribute getAlterTable_TableName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.AlterTable#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.nasdanika.models.sql.ast.AlterTable#getOperations()
	 * @see #getAlterTable()
	 * @generated
	 */
	EReference getAlterTable_Operations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.AlterOperation <em>Alter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alter Operation</em>'.
	 * @see org.nasdanika.models.sql.ast.AlterOperation
	 * @generated
	 */
	EClass getAlterOperation();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.AddColumn <em>Add Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Column</em>'.
	 * @see org.nasdanika.models.sql.ast.AddColumn
	 * @generated
	 */
	EClass getAddColumn();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.AddColumn#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see org.nasdanika.models.sql.ast.AddColumn#getColumn()
	 * @see #getAddColumn()
	 * @generated
	 */
	EReference getAddColumn_Column();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.DropColumn <em>Drop Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Column</em>'.
	 * @see org.nasdanika.models.sql.ast.DropColumn
	 * @generated
	 */
	EClass getDropColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.DropColumn#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.nasdanika.models.sql.ast.DropColumn#getColumnName()
	 * @see #getDropColumn()
	 * @generated
	 */
	EAttribute getDropColumn_ColumnName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.AddConstraint <em>Add Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Constraint</em>'.
	 * @see org.nasdanika.models.sql.ast.AddConstraint
	 * @generated
	 */
	EClass getAddConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.AddConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see org.nasdanika.models.sql.ast.AddConstraint#getConstraint()
	 * @see #getAddConstraint()
	 * @generated
	 */
	EReference getAddConstraint_Constraint();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.DropTable <em>Drop Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Table</em>'.
	 * @see org.nasdanika.models.sql.ast.DropTable
	 * @generated
	 */
	EClass getDropTable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.DropTable#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.DropTable#getSchemaName()
	 * @see #getDropTable()
	 * @generated
	 */
	EAttribute getDropTable_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.DropTable#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.nasdanika.models.sql.ast.DropTable#getTableName()
	 * @see #getDropTable()
	 * @generated
	 */
	EAttribute getDropTable_TableName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.DropTable#isIfExists <em>If Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Exists</em>'.
	 * @see org.nasdanika.models.sql.ast.DropTable#isIfExists()
	 * @see #getDropTable()
	 * @generated
	 */
	EAttribute getDropTable_IfExists();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.CreateView <em>Create View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create View</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateView
	 * @generated
	 */
	EClass getCreateView();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.CreateView#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateView#getSchemaName()
	 * @see #getCreateView()
	 * @generated
	 */
	EAttribute getCreateView_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.CreateView#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateView#getViewName()
	 * @see #getCreateView()
	 * @generated
	 */
	EAttribute getCreateView_ViewName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.CreateView#isOrReplace <em>Or Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Or Replace</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateView#isOrReplace()
	 * @see #getCreateView()
	 * @generated
	 */
	EAttribute getCreateView_OrReplace();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.CreateView#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateView#getQuery()
	 * @see #getCreateView()
	 * @generated
	 */
	EReference getCreateView_Query();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.DropView <em>Drop View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop View</em>'.
	 * @see org.nasdanika.models.sql.ast.DropView
	 * @generated
	 */
	EClass getDropView();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.DropView#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.DropView#getSchemaName()
	 * @see #getDropView()
	 * @generated
	 */
	EAttribute getDropView_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.DropView#getViewName <em>View Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Name</em>'.
	 * @see org.nasdanika.models.sql.ast.DropView#getViewName()
	 * @see #getDropView()
	 * @generated
	 */
	EAttribute getDropView_ViewName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.DropView#isIfExists <em>If Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Exists</em>'.
	 * @see org.nasdanika.models.sql.ast.DropView#isIfExists()
	 * @see #getDropView()
	 * @generated
	 */
	EAttribute getDropView_IfExists();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.CreateIndex <em>Create Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Index</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateIndex
	 * @generated
	 */
	EClass getCreateIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.CreateIndex#getIndexName <em>Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Name</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateIndex#getIndexName()
	 * @see #getCreateIndex()
	 * @generated
	 */
	EAttribute getCreateIndex_IndexName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.CreateIndex#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateIndex#getSchemaName()
	 * @see #getCreateIndex()
	 * @generated
	 */
	EAttribute getCreateIndex_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.CreateIndex#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateIndex#getTableName()
	 * @see #getCreateIndex()
	 * @generated
	 */
	EAttribute getCreateIndex_TableName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.CreateIndex#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateIndex#isUnique()
	 * @see #getCreateIndex()
	 * @generated
	 */
	EAttribute getCreateIndex_Unique();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.sql.ast.CreateIndex#getColumnNames <em>Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Names</em>'.
	 * @see org.nasdanika.models.sql.ast.CreateIndex#getColumnNames()
	 * @see #getCreateIndex()
	 * @generated
	 */
	EAttribute getCreateIndex_ColumnNames();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.DropIndex <em>Drop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Index</em>'.
	 * @see org.nasdanika.models.sql.ast.DropIndex
	 * @generated
	 */
	EClass getDropIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.DropIndex#getIndexName <em>Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index Name</em>'.
	 * @see org.nasdanika.models.sql.ast.DropIndex#getIndexName()
	 * @see #getDropIndex()
	 * @generated
	 */
	EAttribute getDropIndex_IndexName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.DropIndex#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.DropIndex#getSchemaName()
	 * @see #getDropIndex()
	 * @generated
	 */
	EAttribute getDropIndex_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.DropIndex#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.nasdanika.models.sql.ast.DropIndex#getTableName()
	 * @see #getDropIndex()
	 * @generated
	 */
	EAttribute getDropIndex_TableName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see org.nasdanika.models.sql.ast.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.Select#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see org.nasdanika.models.sql.ast.Select#isDistinct()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Distinct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.Select#getSelectItems <em>Select Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select Items</em>'.
	 * @see org.nasdanika.models.sql.ast.Select#getSelectItems()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_SelectItems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.Select#getFromItems <em>From Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>From Items</em>'.
	 * @see org.nasdanika.models.sql.ast.Select#getFromItems()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_FromItems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.Select#getJoins <em>Joins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joins</em>'.
	 * @see org.nasdanika.models.sql.ast.Select#getJoins()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Joins();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.Select#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see org.nasdanika.models.sql.ast.Select#getWhere()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Where();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.Select#getGroupBy <em>Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group By</em>'.
	 * @see org.nasdanika.models.sql.ast.Select#getGroupBy()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_GroupBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.Select#getHaving <em>Having</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Having</em>'.
	 * @see org.nasdanika.models.sql.ast.Select#getHaving()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Having();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.Select#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order By</em>'.
	 * @see org.nasdanika.models.sql.ast.Select#getOrderBy()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_OrderBy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert</em>'.
	 * @see org.nasdanika.models.sql.ast.Insert
	 * @generated
	 */
	EClass getInsert();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.Insert#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.Insert#getSchemaName()
	 * @see #getInsert()
	 * @generated
	 */
	EAttribute getInsert_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.Insert#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.nasdanika.models.sql.ast.Insert#getTableName()
	 * @see #getInsert()
	 * @generated
	 */
	EAttribute getInsert_TableName();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.sql.ast.Insert#getColumnNames <em>Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Names</em>'.
	 * @see org.nasdanika.models.sql.ast.Insert#getColumnNames()
	 * @see #getInsert()
	 * @generated
	 */
	EAttribute getInsert_ColumnNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.Insert#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.nasdanika.models.sql.ast.Insert#getValues()
	 * @see #getInsert()
	 * @generated
	 */
	EReference getInsert_Values();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.Insert#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see org.nasdanika.models.sql.ast.Insert#getSelect()
	 * @see #getInsert()
	 * @generated
	 */
	EReference getInsert_Select();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see org.nasdanika.models.sql.ast.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.Update#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.Update#getSchemaName()
	 * @see #getUpdate()
	 * @generated
	 */
	EAttribute getUpdate_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.Update#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.nasdanika.models.sql.ast.Update#getTableName()
	 * @see #getUpdate()
	 * @generated
	 */
	EAttribute getUpdate_TableName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.Update#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sets</em>'.
	 * @see org.nasdanika.models.sql.ast.Update#getSets()
	 * @see #getUpdate()
	 * @generated
	 */
	EReference getUpdate_Sets();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.Update#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see org.nasdanika.models.sql.ast.Update#getWhere()
	 * @see #getUpdate()
	 * @generated
	 */
	EReference getUpdate_Where();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.SetClause <em>Set Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Clause</em>'.
	 * @see org.nasdanika.models.sql.ast.SetClause
	 * @generated
	 */
	EClass getSetClause();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.SetClause#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.nasdanika.models.sql.ast.SetClause#getColumnName()
	 * @see #getSetClause()
	 * @generated
	 */
	EAttribute getSetClause_ColumnName();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.SetClause#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.nasdanika.models.sql.ast.SetClause#getValue()
	 * @see #getSetClause()
	 * @generated
	 */
	EReference getSetClause_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see org.nasdanika.models.sql.ast.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.Delete#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.Delete#getSchemaName()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.Delete#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.nasdanika.models.sql.ast.Delete#getTableName()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_TableName();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.Delete#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see org.nasdanika.models.sql.ast.Delete#getWhere()
	 * @see #getDelete()
	 * @generated
	 */
	EReference getDelete_Where();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.ColumnDefinition <em>Column Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Definition</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnDefinition
	 * @generated
	 */
	EClass getColumnDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ColumnDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnDefinition#getName()
	 * @see #getColumnDefinition()
	 * @generated
	 */
	EAttribute getColumnDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ColumnDefinition#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnDefinition#getDataType()
	 * @see #getColumnDefinition()
	 * @generated
	 */
	EAttribute getColumnDefinition_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ColumnDefinition#getNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnDefinition#getNullable()
	 * @see #getColumnDefinition()
	 * @generated
	 */
	EAttribute getColumnDefinition_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ColumnDefinition#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnDefinition#getDefaultValue()
	 * @see #getColumnDefinition()
	 * @generated
	 */
	EAttribute getColumnDefinition_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ColumnDefinition#isIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnDefinition#isIdentity()
	 * @see #getColumnDefinition()
	 * @generated
	 */
	EAttribute getColumnDefinition_Identity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ColumnDefinition#isComputed <em>Computed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computed</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnDefinition#isComputed()
	 * @see #getColumnDefinition()
	 * @generated
	 */
	EAttribute getColumnDefinition_Computed();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ColumnDefinition#getComputedExpression <em>Computed Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computed Expression</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnDefinition#getComputedExpression()
	 * @see #getColumnDefinition()
	 * @generated
	 */
	EAttribute getColumnDefinition_ComputedExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.ColumnDefinition#getInlineConstraints <em>Inline Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inline Constraints</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnDefinition#getInlineConstraints()
	 * @see #getColumnDefinition()
	 * @generated
	 */
	EReference getColumnDefinition_InlineConstraints();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.TableConstraint <em>Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Constraint</em>'.
	 * @see org.nasdanika.models.sql.ast.TableConstraint
	 * @generated
	 */
	EClass getTableConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.TableConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.sql.ast.TableConstraint#getName()
	 * @see #getTableConstraint()
	 * @generated
	 */
	EAttribute getTableConstraint_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.PrimaryKeyConstraint <em>Primary Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Constraint</em>'.
	 * @see org.nasdanika.models.sql.ast.PrimaryKeyConstraint
	 * @generated
	 */
	EClass getPrimaryKeyConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.sql.ast.PrimaryKeyConstraint#getColumnNames <em>Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Names</em>'.
	 * @see org.nasdanika.models.sql.ast.PrimaryKeyConstraint#getColumnNames()
	 * @see #getPrimaryKeyConstraint()
	 * @generated
	 */
	EAttribute getPrimaryKeyConstraint_ColumnNames();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint <em>Foreign Key Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key Constraint</em>'.
	 * @see org.nasdanika.models.sql.ast.ForeignKeyConstraint
	 * @generated
	 */
	EClass getForeignKeyConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getColumnNames <em>Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Names</em>'.
	 * @see org.nasdanika.models.sql.ast.ForeignKeyConstraint#getColumnNames()
	 * @see #getForeignKeyConstraint()
	 * @generated
	 */
	EAttribute getForeignKeyConstraint_ColumnNames();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Table</em>'.
	 * @see org.nasdanika.models.sql.ast.ForeignKeyConstraint#getReferencedTable()
	 * @see #getForeignKeyConstraint()
	 * @generated
	 */
	EAttribute getForeignKeyConstraint_ReferencedTable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getReferencedSchema <em>Referenced Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Schema</em>'.
	 * @see org.nasdanika.models.sql.ast.ForeignKeyConstraint#getReferencedSchema()
	 * @see #getForeignKeyConstraint()
	 * @generated
	 */
	EAttribute getForeignKeyConstraint_ReferencedSchema();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getReferencedColumns <em>Referenced Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Referenced Columns</em>'.
	 * @see org.nasdanika.models.sql.ast.ForeignKeyConstraint#getReferencedColumns()
	 * @see #getForeignKeyConstraint()
	 * @generated
	 */
	EAttribute getForeignKeyConstraint_ReferencedColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getOnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Delete</em>'.
	 * @see org.nasdanika.models.sql.ast.ForeignKeyConstraint#getOnDelete()
	 * @see #getForeignKeyConstraint()
	 * @generated
	 */
	EAttribute getForeignKeyConstraint_OnDelete();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ForeignKeyConstraint#getOnUpdate <em>On Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Update</em>'.
	 * @see org.nasdanika.models.sql.ast.ForeignKeyConstraint#getOnUpdate()
	 * @see #getForeignKeyConstraint()
	 * @generated
	 */
	EAttribute getForeignKeyConstraint_OnUpdate();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.UniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Constraint</em>'.
	 * @see org.nasdanika.models.sql.ast.UniqueConstraint
	 * @generated
	 */
	EClass getUniqueConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.sql.ast.UniqueConstraint#getColumnNames <em>Column Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Names</em>'.
	 * @see org.nasdanika.models.sql.ast.UniqueConstraint#getColumnNames()
	 * @see #getUniqueConstraint()
	 * @generated
	 */
	EAttribute getUniqueConstraint_ColumnNames();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.CheckConstraint <em>Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Constraint</em>'.
	 * @see org.nasdanika.models.sql.ast.CheckConstraint
	 * @generated
	 */
	EClass getCheckConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.CheckConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.models.sql.ast.CheckConstraint#getExpression()
	 * @see #getCheckConstraint()
	 * @generated
	 */
	EReference getCheckConstraint_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.CheckConstraint#getExpressionText <em>Expression Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Text</em>'.
	 * @see org.nasdanika.models.sql.ast.CheckConstraint#getExpressionText()
	 * @see #getCheckConstraint()
	 * @generated
	 */
	EAttribute getCheckConstraint_ExpressionText();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.SelectItem <em>Select Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Item</em>'.
	 * @see org.nasdanika.models.sql.ast.SelectItem
	 * @generated
	 */
	EClass getSelectItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.SelectItem#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.models.sql.ast.SelectItem#getExpression()
	 * @see #getSelectItem()
	 * @generated
	 */
	EReference getSelectItem_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.SelectItem#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.nasdanika.models.sql.ast.SelectItem#getAlias()
	 * @see #getSelectItem()
	 * @generated
	 */
	EAttribute getSelectItem_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.SelectItem#isAllColumns <em>All Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Columns</em>'.
	 * @see org.nasdanika.models.sql.ast.SelectItem#isAllColumns()
	 * @see #getSelectItem()
	 * @generated
	 */
	EAttribute getSelectItem_AllColumns();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.SelectItem#getTableAlias <em>Table Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Alias</em>'.
	 * @see org.nasdanika.models.sql.ast.SelectItem#getTableAlias()
	 * @see #getSelectItem()
	 * @generated
	 */
	EAttribute getSelectItem_TableAlias();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.FromItem <em>From Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Item</em>'.
	 * @see org.nasdanika.models.sql.ast.FromItem
	 * @generated
	 */
	EClass getFromItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.FromItem#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.nasdanika.models.sql.ast.FromItem#getAlias()
	 * @see #getFromItem()
	 * @generated
	 */
	EAttribute getFromItem_Alias();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.TableReference <em>Table Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Reference</em>'.
	 * @see org.nasdanika.models.sql.ast.TableReference
	 * @generated
	 */
	EClass getTableReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.TableReference#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.TableReference#getSchemaName()
	 * @see #getTableReference()
	 * @generated
	 */
	EAttribute getTableReference_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.TableReference#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.nasdanika.models.sql.ast.TableReference#getTableName()
	 * @see #getTableReference()
	 * @generated
	 */
	EAttribute getTableReference_TableName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.SubSelect <em>Sub Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Select</em>'.
	 * @see org.nasdanika.models.sql.ast.SubSelect
	 * @generated
	 */
	EClass getSubSelect();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.SubSelect#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see org.nasdanika.models.sql.ast.SubSelect#getSelect()
	 * @see #getSubSelect()
	 * @generated
	 */
	EReference getSubSelect_Select();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see org.nasdanika.models.sql.ast.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.Join#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.sql.ast.Join#getType()
	 * @see #getJoin()
	 * @generated
	 */
	EAttribute getJoin_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.Join#getRightItem <em>Right Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Item</em>'.
	 * @see org.nasdanika.models.sql.ast.Join#getRightItem()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_RightItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.Join#getOnCondition <em>On Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Condition</em>'.
	 * @see org.nasdanika.models.sql.ast.Join#getOnCondition()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_OnCondition();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.OrderByItem <em>Order By Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order By Item</em>'.
	 * @see org.nasdanika.models.sql.ast.OrderByItem
	 * @generated
	 */
	EClass getOrderByItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.OrderByItem#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.models.sql.ast.OrderByItem#getExpression()
	 * @see #getOrderByItem()
	 * @generated
	 */
	EReference getOrderByItem_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.OrderByItem#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.nasdanika.models.sql.ast.OrderByItem#getDirection()
	 * @see #getOrderByItem()
	 * @generated
	 */
	EAttribute getOrderByItem_Direction();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.nasdanika.models.sql.ast.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.ColumnReference <em>Column Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Reference</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnReference
	 * @generated
	 */
	EClass getColumnReference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ColumnReference#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnReference#getTableName()
	 * @see #getColumnReference()
	 * @generated
	 */
	EAttribute getColumnReference_TableName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ColumnReference#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnReference#getSchemaName()
	 * @see #getColumnReference()
	 * @generated
	 */
	EAttribute getColumnReference_SchemaName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.ColumnReference#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see org.nasdanika.models.sql.ast.ColumnReference#getColumnName()
	 * @see #getColumnReference()
	 * @generated
	 */
	EAttribute getColumnReference_ColumnName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.nasdanika.models.sql.ast.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.sql.ast.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.Literal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.sql.ast.Literal#getType()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see org.nasdanika.models.sql.ast.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.FunctionCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.sql.ast.FunctionCall#getName()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.FunctionCall#getSchemaName <em>Schema Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Name</em>'.
	 * @see org.nasdanika.models.sql.ast.FunctionCall#getSchemaName()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_SchemaName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.FunctionCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.nasdanika.models.sql.ast.FunctionCall#getArguments()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.FunctionCall#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see org.nasdanika.models.sql.ast.FunctionCall#isDistinct()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_Distinct();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.FunctionCall#isAllColumns <em>All Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Columns</em>'.
	 * @see org.nasdanika.models.sql.ast.FunctionCall#isAllColumns()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_AllColumns();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.nasdanika.models.sql.ast.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.nasdanika.models.sql.ast.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.nasdanika.models.sql.ast.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.nasdanika.models.sql.ast.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.nasdanika.models.sql.ast.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.UnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.nasdanika.models.sql.ast.UnaryExpression#getOperand()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operand();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.nasdanika.models.sql.ast.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.sql.ast.UnaryExpression#isPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.nasdanika.models.sql.ast.UnaryExpression#isPrefix()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Prefix();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.Parenthesis <em>Parenthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesis</em>'.
	 * @see org.nasdanika.models.sql.ast.Parenthesis
	 * @generated
	 */
	EClass getParenthesis();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.Parenthesis#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.nasdanika.models.sql.ast.Parenthesis#getExpression()
	 * @see #getParenthesis()
	 * @generated
	 */
	EReference getParenthesis_Expression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.CaseExpression <em>Case Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Expression</em>'.
	 * @see org.nasdanika.models.sql.ast.CaseExpression
	 * @generated
	 */
	EClass getCaseExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.CaseExpression#getSwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Switch Expression</em>'.
	 * @see org.nasdanika.models.sql.ast.CaseExpression#getSwitchExpression()
	 * @see #getCaseExpression()
	 * @generated
	 */
	EReference getCaseExpression_SwitchExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.CaseExpression#getWhenClauses <em>When Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When Clauses</em>'.
	 * @see org.nasdanika.models.sql.ast.CaseExpression#getWhenClauses()
	 * @see #getCaseExpression()
	 * @generated
	 */
	EReference getCaseExpression_WhenClauses();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.CaseExpression#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see org.nasdanika.models.sql.ast.CaseExpression#getElseExpression()
	 * @see #getCaseExpression()
	 * @generated
	 */
	EReference getCaseExpression_ElseExpression();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.WhenClause <em>When Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Clause</em>'.
	 * @see org.nasdanika.models.sql.ast.WhenClause
	 * @generated
	 */
	EClass getWhenClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.WhenClause#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.nasdanika.models.sql.ast.WhenClause#getCondition()
	 * @see #getWhenClause()
	 * @generated
	 */
	EReference getWhenClause_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.sql.ast.WhenClause#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see org.nasdanika.models.sql.ast.WhenClause#getResult()
	 * @see #getWhenClause()
	 * @generated
	 */
	EReference getWhenClause_Result();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.AllColumns <em>All Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Columns</em>'.
	 * @see org.nasdanika.models.sql.ast.AllColumns
	 * @generated
	 */
	EClass getAllColumns();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.sql.ast.ExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression List</em>'.
	 * @see org.nasdanika.models.sql.ast.ExpressionList
	 * @generated
	 */
	EClass getExpressionList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.sql.ast.ExpressionList#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.nasdanika.models.sql.ast.ExpressionList#getExpressions()
	 * @see #getExpressionList()
	 * @generated
	 */
	EReference getExpressionList_Expressions();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.sql.ast.JoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Join Type</em>'.
	 * @see org.nasdanika.models.sql.ast.JoinType
	 * @generated
	 */
	EEnum getJoinType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.sql.ast.SortDirection <em>Sort Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Direction</em>'.
	 * @see org.nasdanika.models.sql.ast.SortDirection
	 * @generated
	 */
	EEnum getSortDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AstFactory getAstFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.SourceSpanImpl <em>Source Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.SourceSpanImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSourceSpan()
		 * @generated
		 */
		EClass SOURCE_SPAN = eINSTANCE.getSourceSpan();

		/**
		 * The meta object literal for the '<em><b>Start Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_SPAN__START_LINE = eINSTANCE.getSourceSpan_StartLine();

		/**
		 * The meta object literal for the '<em><b>Start Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_SPAN__START_COLUMN = eINSTANCE.getSourceSpan_StartColumn();

		/**
		 * The meta object literal for the '<em><b>End Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_SPAN__END_LINE = eINSTANCE.getSourceSpan_EndLine();

		/**
		 * The meta object literal for the '<em><b>End Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_SPAN__END_COLUMN = eINSTANCE.getSourceSpan_EndColumn();

		/**
		 * The meta object literal for the '<em><b>Start Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_SPAN__START_OFFSET = eINSTANCE.getSourceSpan_StartOffset();

		/**
		 * The meta object literal for the '<em><b>End Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_SPAN__END_OFFSET = eINSTANCE.getSourceSpan_EndOffset();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.AstNodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.AstNodeImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getAstNode()
		 * @generated
		 */
		EClass AST_NODE = eINSTANCE.getAstNode();

		/**
		 * The meta object literal for the '<em><b>Source Span</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AST_NODE__SOURCE_SPAN = eINSTANCE.getAstNode_SourceSpan();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AST_NODE__COMMENT = eINSTANCE.getAstNode_Comment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.SqlScriptImpl <em>Sql Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.SqlScriptImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSqlScript()
		 * @generated
		 */
		EClass SQL_SCRIPT = eINSTANCE.getSqlScript();

		/**
		 * The meta object literal for the '<em><b>Source Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_SCRIPT__SOURCE_URI = eINSTANCE.getSqlScript_SourceUri();

		/**
		 * The meta object literal for the '<em><b>Dialect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_SCRIPT__DIALECT = eINSTANCE.getSqlScript_Dialect();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_SCRIPT__STATEMENTS = eINSTANCE.getSqlScript_Statements();

		/**
		 * The meta object literal for the '<em><b>Leading Comments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQL_SCRIPT__LEADING_COMMENTS = eINSTANCE.getSqlScript_LeadingComments();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.StatementImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Raw Sql</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__RAW_SQL = eINSTANCE.getStatement_RawSql();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.UnparsedStatementImpl <em>Unparsed Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.UnparsedStatementImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getUnparsedStatement()
		 * @generated
		 */
		EClass UNPARSED_STATEMENT = eINSTANCE.getUnparsedStatement();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNPARSED_STATEMENT__ERROR_MESSAGE = eINSTANCE.getUnparsedStatement_ErrorMessage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.CreateTableImpl <em>Create Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.CreateTableImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getCreateTable()
		 * @generated
		 */
		EClass CREATE_TABLE = eINSTANCE.getCreateTable();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TABLE__SCHEMA_NAME = eINSTANCE.getCreateTable_SchemaName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TABLE__TABLE_NAME = eINSTANCE.getCreateTable_TableName();

		/**
		 * The meta object literal for the '<em><b>If Not Exists</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TABLE__IF_NOT_EXISTS = eINSTANCE.getCreateTable_IfNotExists();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TABLE__COLUMNS = eINSTANCE.getCreateTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TABLE__CONSTRAINTS = eINSTANCE.getCreateTable_Constraints();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.AlterTableImpl <em>Alter Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.AlterTableImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getAlterTable()
		 * @generated
		 */
		EClass ALTER_TABLE = eINSTANCE.getAlterTable();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTER_TABLE__SCHEMA_NAME = eINSTANCE.getAlterTable_SchemaName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTER_TABLE__TABLE_NAME = eINSTANCE.getAlterTable_TableName();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTER_TABLE__OPERATIONS = eINSTANCE.getAlterTable_Operations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.AlterOperationImpl <em>Alter Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.AlterOperationImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getAlterOperation()
		 * @generated
		 */
		EClass ALTER_OPERATION = eINSTANCE.getAlterOperation();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.AddColumnImpl <em>Add Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.AddColumnImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getAddColumn()
		 * @generated
		 */
		EClass ADD_COLUMN = eINSTANCE.getAddColumn();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_COLUMN__COLUMN = eINSTANCE.getAddColumn_Column();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.DropColumnImpl <em>Drop Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.DropColumnImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getDropColumn()
		 * @generated
		 */
		EClass DROP_COLUMN = eINSTANCE.getDropColumn();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_COLUMN__COLUMN_NAME = eINSTANCE.getDropColumn_ColumnName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.AddConstraintImpl <em>Add Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.AddConstraintImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getAddConstraint()
		 * @generated
		 */
		EClass ADD_CONSTRAINT = eINSTANCE.getAddConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_CONSTRAINT__CONSTRAINT = eINSTANCE.getAddConstraint_Constraint();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.DropTableImpl <em>Drop Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.DropTableImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getDropTable()
		 * @generated
		 */
		EClass DROP_TABLE = eINSTANCE.getDropTable();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_TABLE__SCHEMA_NAME = eINSTANCE.getDropTable_SchemaName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_TABLE__TABLE_NAME = eINSTANCE.getDropTable_TableName();

		/**
		 * The meta object literal for the '<em><b>If Exists</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_TABLE__IF_EXISTS = eINSTANCE.getDropTable_IfExists();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.CreateViewImpl <em>Create View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.CreateViewImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getCreateView()
		 * @generated
		 */
		EClass CREATE_VIEW = eINSTANCE.getCreateView();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_VIEW__SCHEMA_NAME = eINSTANCE.getCreateView_SchemaName();

		/**
		 * The meta object literal for the '<em><b>View Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_VIEW__VIEW_NAME = eINSTANCE.getCreateView_ViewName();

		/**
		 * The meta object literal for the '<em><b>Or Replace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_VIEW__OR_REPLACE = eINSTANCE.getCreateView_OrReplace();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_VIEW__QUERY = eINSTANCE.getCreateView_Query();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.DropViewImpl <em>Drop View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.DropViewImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getDropView()
		 * @generated
		 */
		EClass DROP_VIEW = eINSTANCE.getDropView();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_VIEW__SCHEMA_NAME = eINSTANCE.getDropView_SchemaName();

		/**
		 * The meta object literal for the '<em><b>View Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_VIEW__VIEW_NAME = eINSTANCE.getDropView_ViewName();

		/**
		 * The meta object literal for the '<em><b>If Exists</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_VIEW__IF_EXISTS = eINSTANCE.getDropView_IfExists();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.CreateIndexImpl <em>Create Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.CreateIndexImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getCreateIndex()
		 * @generated
		 */
		EClass CREATE_INDEX = eINSTANCE.getCreateIndex();

		/**
		 * The meta object literal for the '<em><b>Index Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_INDEX__INDEX_NAME = eINSTANCE.getCreateIndex_IndexName();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_INDEX__SCHEMA_NAME = eINSTANCE.getCreateIndex_SchemaName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_INDEX__TABLE_NAME = eINSTANCE.getCreateIndex_TableName();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_INDEX__UNIQUE = eINSTANCE.getCreateIndex_Unique();

		/**
		 * The meta object literal for the '<em><b>Column Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_INDEX__COLUMN_NAMES = eINSTANCE.getCreateIndex_ColumnNames();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.DropIndexImpl <em>Drop Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.DropIndexImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getDropIndex()
		 * @generated
		 */
		EClass DROP_INDEX = eINSTANCE.getDropIndex();

		/**
		 * The meta object literal for the '<em><b>Index Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_INDEX__INDEX_NAME = eINSTANCE.getDropIndex_IndexName();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_INDEX__SCHEMA_NAME = eINSTANCE.getDropIndex_SchemaName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_INDEX__TABLE_NAME = eINSTANCE.getDropIndex_TableName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.SelectImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__DISTINCT = eINSTANCE.getSelect_Distinct();

		/**
		 * The meta object literal for the '<em><b>Select Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__SELECT_ITEMS = eINSTANCE.getSelect_SelectItems();

		/**
		 * The meta object literal for the '<em><b>From Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__FROM_ITEMS = eINSTANCE.getSelect_FromItems();

		/**
		 * The meta object literal for the '<em><b>Joins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__JOINS = eINSTANCE.getSelect_Joins();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__WHERE = eINSTANCE.getSelect_Where();

		/**
		 * The meta object literal for the '<em><b>Group By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__GROUP_BY = eINSTANCE.getSelect_GroupBy();

		/**
		 * The meta object literal for the '<em><b>Having</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__HAVING = eINSTANCE.getSelect_Having();

		/**
		 * The meta object literal for the '<em><b>Order By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__ORDER_BY = eINSTANCE.getSelect_OrderBy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.InsertImpl <em>Insert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.InsertImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getInsert()
		 * @generated
		 */
		EClass INSERT = eINSTANCE.getInsert();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT__SCHEMA_NAME = eINSTANCE.getInsert_SchemaName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT__TABLE_NAME = eINSTANCE.getInsert_TableName();

		/**
		 * The meta object literal for the '<em><b>Column Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT__COLUMN_NAMES = eINSTANCE.getInsert_ColumnNames();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT__VALUES = eINSTANCE.getInsert_Values();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT__SELECT = eINSTANCE.getInsert_Select();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.UpdateImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE__SCHEMA_NAME = eINSTANCE.getUpdate_SchemaName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE__TABLE_NAME = eINSTANCE.getUpdate_TableName();

		/**
		 * The meta object literal for the '<em><b>Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE__SETS = eINSTANCE.getUpdate_Sets();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE__WHERE = eINSTANCE.getUpdate_Where();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.SetClauseImpl <em>Set Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.SetClauseImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSetClause()
		 * @generated
		 */
		EClass SET_CLAUSE = eINSTANCE.getSetClause();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_CLAUSE__COLUMN_NAME = eINSTANCE.getSetClause_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_CLAUSE__VALUE = eINSTANCE.getSetClause_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.DeleteImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__SCHEMA_NAME = eINSTANCE.getDelete_SchemaName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__TABLE_NAME = eINSTANCE.getDelete_TableName();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE__WHERE = eINSTANCE.getDelete_Where();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.ColumnDefinitionImpl <em>Column Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.ColumnDefinitionImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getColumnDefinition()
		 * @generated
		 */
		EClass COLUMN_DEFINITION = eINSTANCE.getColumnDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DEFINITION__NAME = eINSTANCE.getColumnDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DEFINITION__DATA_TYPE = eINSTANCE.getColumnDefinition_DataType();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DEFINITION__NULLABLE = eINSTANCE.getColumnDefinition_Nullable();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DEFINITION__DEFAULT_VALUE = eINSTANCE.getColumnDefinition_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DEFINITION__IDENTITY = eINSTANCE.getColumnDefinition_Identity();

		/**
		 * The meta object literal for the '<em><b>Computed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DEFINITION__COMPUTED = eINSTANCE.getColumnDefinition_Computed();

		/**
		 * The meta object literal for the '<em><b>Computed Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DEFINITION__COMPUTED_EXPRESSION = eINSTANCE.getColumnDefinition_ComputedExpression();

		/**
		 * The meta object literal for the '<em><b>Inline Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_DEFINITION__INLINE_CONSTRAINTS = eINSTANCE.getColumnDefinition_InlineConstraints();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.TableConstraintImpl <em>Table Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.TableConstraintImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getTableConstraint()
		 * @generated
		 */
		EClass TABLE_CONSTRAINT = eINSTANCE.getTableConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CONSTRAINT__NAME = eINSTANCE.getTableConstraint_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.PrimaryKeyConstraintImpl <em>Primary Key Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.PrimaryKeyConstraintImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getPrimaryKeyConstraint()
		 * @generated
		 */
		EClass PRIMARY_KEY_CONSTRAINT = eINSTANCE.getPrimaryKeyConstraint();

		/**
		 * The meta object literal for the '<em><b>Column Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_KEY_CONSTRAINT__COLUMN_NAMES = eINSTANCE.getPrimaryKeyConstraint_ColumnNames();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.ForeignKeyConstraintImpl <em>Foreign Key Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.ForeignKeyConstraintImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getForeignKeyConstraint()
		 * @generated
		 */
		EClass FOREIGN_KEY_CONSTRAINT = eINSTANCE.getForeignKeyConstraint();

		/**
		 * The meta object literal for the '<em><b>Column Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY_CONSTRAINT__COLUMN_NAMES = eINSTANCE.getForeignKeyConstraint_ColumnNames();

		/**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY_CONSTRAINT__REFERENCED_TABLE = eINSTANCE.getForeignKeyConstraint_ReferencedTable();

		/**
		 * The meta object literal for the '<em><b>Referenced Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY_CONSTRAINT__REFERENCED_SCHEMA = eINSTANCE.getForeignKeyConstraint_ReferencedSchema();

		/**
		 * The meta object literal for the '<em><b>Referenced Columns</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY_CONSTRAINT__REFERENCED_COLUMNS = eINSTANCE.getForeignKeyConstraint_ReferencedColumns();

		/**
		 * The meta object literal for the '<em><b>On Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY_CONSTRAINT__ON_DELETE = eINSTANCE.getForeignKeyConstraint_OnDelete();

		/**
		 * The meta object literal for the '<em><b>On Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY_CONSTRAINT__ON_UPDATE = eINSTANCE.getForeignKeyConstraint_OnUpdate();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.UniqueConstraintImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getUniqueConstraint()
		 * @generated
		 */
		EClass UNIQUE_CONSTRAINT = eINSTANCE.getUniqueConstraint();

		/**
		 * The meta object literal for the '<em><b>Column Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIQUE_CONSTRAINT__COLUMN_NAMES = eINSTANCE.getUniqueConstraint_ColumnNames();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.CheckConstraintImpl <em>Check Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.CheckConstraintImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getCheckConstraint()
		 * @generated
		 */
		EClass CHECK_CONSTRAINT = eINSTANCE.getCheckConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_CONSTRAINT__EXPRESSION = eINSTANCE.getCheckConstraint_Expression();

		/**
		 * The meta object literal for the '<em><b>Expression Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_CONSTRAINT__EXPRESSION_TEXT = eINSTANCE.getCheckConstraint_ExpressionText();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.SelectItemImpl <em>Select Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.SelectItemImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSelectItem()
		 * @generated
		 */
		EClass SELECT_ITEM = eINSTANCE.getSelectItem();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_ITEM__EXPRESSION = eINSTANCE.getSelectItem_Expression();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_ITEM__ALIAS = eINSTANCE.getSelectItem_Alias();

		/**
		 * The meta object literal for the '<em><b>All Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_ITEM__ALL_COLUMNS = eINSTANCE.getSelectItem_AllColumns();

		/**
		 * The meta object literal for the '<em><b>Table Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_ITEM__TABLE_ALIAS = eINSTANCE.getSelectItem_TableAlias();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.FromItemImpl <em>From Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.FromItemImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getFromItem()
		 * @generated
		 */
		EClass FROM_ITEM = eINSTANCE.getFromItem();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_ITEM__ALIAS = eINSTANCE.getFromItem_Alias();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.TableReferenceImpl <em>Table Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.TableReferenceImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getTableReference()
		 * @generated
		 */
		EClass TABLE_REFERENCE = eINSTANCE.getTableReference();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_REFERENCE__SCHEMA_NAME = eINSTANCE.getTableReference_SchemaName();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_REFERENCE__TABLE_NAME = eINSTANCE.getTableReference_TableName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.SubSelectImpl <em>Sub Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.SubSelectImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSubSelect()
		 * @generated
		 */
		EClass SUB_SELECT = eINSTANCE.getSubSelect();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SELECT__SELECT = eINSTANCE.getSubSelect_Select();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.JoinImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN__TYPE = eINSTANCE.getJoin_Type();

		/**
		 * The meta object literal for the '<em><b>Right Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__RIGHT_ITEM = eINSTANCE.getJoin_RightItem();

		/**
		 * The meta object literal for the '<em><b>On Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__ON_CONDITION = eINSTANCE.getJoin_OnCondition();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.OrderByItemImpl <em>Order By Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.OrderByItemImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getOrderByItem()
		 * @generated
		 */
		EClass ORDER_BY_ITEM = eINSTANCE.getOrderByItem();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_BY_ITEM__EXPRESSION = eINSTANCE.getOrderByItem_Expression();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_BY_ITEM__DIRECTION = eINSTANCE.getOrderByItem_Direction();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.ExpressionImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.ColumnReferenceImpl <em>Column Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.ColumnReferenceImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getColumnReference()
		 * @generated
		 */
		EClass COLUMN_REFERENCE = eINSTANCE.getColumnReference();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_REFERENCE__TABLE_NAME = eINSTANCE.getColumnReference_TableName();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_REFERENCE__SCHEMA_NAME = eINSTANCE.getColumnReference_SchemaName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_REFERENCE__COLUMN_NAME = eINSTANCE.getColumnReference_ColumnName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.LiteralImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__TYPE = eINSTANCE.getLiteral_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.FunctionCallImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__NAME = eINSTANCE.getFunctionCall_Name();

		/**
		 * The meta object literal for the '<em><b>Schema Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__SCHEMA_NAME = eINSTANCE.getFunctionCall_SchemaName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__ARGUMENTS = eINSTANCE.getFunctionCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__DISTINCT = eINSTANCE.getFunctionCall_Distinct();

		/**
		 * The meta object literal for the '<em><b>All Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__ALL_COLUMNS = eINSTANCE.getFunctionCall_AllColumns();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.BinaryExpressionImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.UnaryExpressionImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__OPERAND = eINSTANCE.getUnaryExpression_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__PREFIX = eINSTANCE.getUnaryExpression_Prefix();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.ParenthesisImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getParenthesis()
		 * @generated
		 */
		EClass PARENTHESIS = eINSTANCE.getParenthesis();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARENTHESIS__EXPRESSION = eINSTANCE.getParenthesis_Expression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.CaseExpressionImpl <em>Case Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.CaseExpressionImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getCaseExpression()
		 * @generated
		 */
		EClass CASE_EXPRESSION = eINSTANCE.getCaseExpression();

		/**
		 * The meta object literal for the '<em><b>Switch Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_EXPRESSION__SWITCH_EXPRESSION = eINSTANCE.getCaseExpression_SwitchExpression();

		/**
		 * The meta object literal for the '<em><b>When Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_EXPRESSION__WHEN_CLAUSES = eINSTANCE.getCaseExpression_WhenClauses();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_EXPRESSION__ELSE_EXPRESSION = eINSTANCE.getCaseExpression_ElseExpression();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.WhenClauseImpl <em>When Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.WhenClauseImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getWhenClause()
		 * @generated
		 */
		EClass WHEN_CLAUSE = eINSTANCE.getWhenClause();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_CLAUSE__CONDITION = eINSTANCE.getWhenClause_Condition();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_CLAUSE__RESULT = eINSTANCE.getWhenClause_Result();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.AllColumnsImpl <em>All Columns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.AllColumnsImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getAllColumns()
		 * @generated
		 */
		EClass ALL_COLUMNS = eINSTANCE.getAllColumns();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.impl.ExpressionListImpl <em>Expression List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.impl.ExpressionListImpl
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getExpressionList()
		 * @generated
		 */
		EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LIST__EXPRESSIONS = eINSTANCE.getExpressionList_Expressions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.JoinType <em>Join Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.JoinType
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getJoinType()
		 * @generated
		 */
		EEnum JOIN_TYPE = eINSTANCE.getJoinType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.sql.ast.SortDirection <em>Sort Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.sql.ast.SortDirection
		 * @see org.nasdanika.models.sql.ast.impl.AstPackageImpl#getSortDirection()
		 * @generated
		 */
		EEnum SORT_DIRECTION = eINSTANCE.getSortDirection();

	}

} //AstPackage
