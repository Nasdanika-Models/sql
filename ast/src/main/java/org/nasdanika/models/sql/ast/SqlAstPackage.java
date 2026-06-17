package org.nasdanika.models.sql.ast;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

public interface SqlAstPackage extends EPackage {
    String eNAME = "ast";
    String eNS_URI = "ecore://nasdanika.org/models/sql/ast";
    String eNS_PREFIX = "org.nasdanika.models.sql.ast";

    SqlAstPackage eINSTANCE = org.nasdanika.models.sql.ast.impl.SqlAstPackageImpl.init();

    int JOIN_TYPE = 0;

    int SORT_DIRECTION = 1;

    int SOURCE_SPAN = 2;
    int SOURCE_SPAN__START_LINE = 0 + 0;
    int SOURCE_SPAN__START_COLUMN = 0 + 1;
    int SOURCE_SPAN__END_LINE = 0 + 2;
    int SOURCE_SPAN__END_COLUMN = 0 + 3;
    int SOURCE_SPAN__START_OFFSET = 0 + 4;
    int SOURCE_SPAN__END_OFFSET = 0 + 5;
    int SOURCE_SPAN_FEATURE_COUNT = 0 + 6;

    int AST_NODE = 3;
    int AST_NODE__SOURCE_SPAN = 0 + 0;
    int AST_NODE__COMMENT = 0 + 1;
    int AST_NODE_FEATURE_COUNT = 0 + 2;

    int SQL_SCRIPT = 4;
    int SQL_SCRIPT__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;
    int SQL_SCRIPT__COMMENT = AST_NODE__COMMENT;
    int SQL_SCRIPT__SOURCE_URI = AST_NODE_FEATURE_COUNT + 0;
    int SQL_SCRIPT__DIALECT = AST_NODE_FEATURE_COUNT + 1;
    int SQL_SCRIPT__STATEMENTS = AST_NODE_FEATURE_COUNT + 2;
    int SQL_SCRIPT__LEADING_COMMENTS = AST_NODE_FEATURE_COUNT + 3;
    int SQL_SCRIPT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 4;

    int STATEMENT = 5;
    int STATEMENT__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;
    int STATEMENT__COMMENT = AST_NODE__COMMENT;
    int STATEMENT__RAW_SQL = AST_NODE_FEATURE_COUNT + 0;
    int STATEMENT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 1;

    int UNPARSED_STATEMENT = 6;
    int UNPARSED_STATEMENT__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;
    int UNPARSED_STATEMENT__COMMENT = STATEMENT__COMMENT;
    int UNPARSED_STATEMENT__RAW_SQL = STATEMENT__RAW_SQL;
    int UNPARSED_STATEMENT__ERROR_MESSAGE = STATEMENT_FEATURE_COUNT + 0;
    int UNPARSED_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

    int CREATE_TABLE = 7;
    int CREATE_TABLE__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;
    int CREATE_TABLE__COMMENT = STATEMENT__COMMENT;
    int CREATE_TABLE__RAW_SQL = STATEMENT__RAW_SQL;
    int CREATE_TABLE__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;
    int CREATE_TABLE__TABLE_NAME = STATEMENT_FEATURE_COUNT + 1;
    int CREATE_TABLE__IF_NOT_EXISTS = STATEMENT_FEATURE_COUNT + 2;
    int CREATE_TABLE__COLUMNS = STATEMENT_FEATURE_COUNT + 3;
    int CREATE_TABLE__CONSTRAINTS = STATEMENT_FEATURE_COUNT + 4;
    int CREATE_TABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

    int ALTER_TABLE = 8;
    int ALTER_TABLE__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;
    int ALTER_TABLE__COMMENT = STATEMENT__COMMENT;
    int ALTER_TABLE__RAW_SQL = STATEMENT__RAW_SQL;
    int ALTER_TABLE__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;
    int ALTER_TABLE__TABLE_NAME = STATEMENT_FEATURE_COUNT + 1;
    int ALTER_TABLE__OPERATIONS = STATEMENT_FEATURE_COUNT + 2;
    int ALTER_TABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

    int ALTER_OPERATION = 9;
    int ALTER_OPERATION__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;
    int ALTER_OPERATION__COMMENT = AST_NODE__COMMENT;
    int ALTER_OPERATION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 0;

    int ADD_COLUMN = 10;
    int ADD_COLUMN__SOURCE_SPAN = ALTER_OPERATION__SOURCE_SPAN;
    int ADD_COLUMN__COMMENT = ALTER_OPERATION__COMMENT;
    int ADD_COLUMN__COLUMN = ALTER_OPERATION_FEATURE_COUNT + 0;
    int ADD_COLUMN_FEATURE_COUNT = ALTER_OPERATION_FEATURE_COUNT + 1;

    int DROP_COLUMN = 11;
    int DROP_COLUMN__SOURCE_SPAN = ALTER_OPERATION__SOURCE_SPAN;
    int DROP_COLUMN__COMMENT = ALTER_OPERATION__COMMENT;
    int DROP_COLUMN__COLUMN_NAME = ALTER_OPERATION_FEATURE_COUNT + 0;
    int DROP_COLUMN_FEATURE_COUNT = ALTER_OPERATION_FEATURE_COUNT + 1;

    int ADD_CONSTRAINT = 12;
    int ADD_CONSTRAINT__SOURCE_SPAN = ALTER_OPERATION__SOURCE_SPAN;
    int ADD_CONSTRAINT__COMMENT = ALTER_OPERATION__COMMENT;
    int ADD_CONSTRAINT__CONSTRAINT = ALTER_OPERATION_FEATURE_COUNT + 0;
    int ADD_CONSTRAINT_FEATURE_COUNT = ALTER_OPERATION_FEATURE_COUNT + 1;

    int DROP_TABLE = 13;
    int DROP_TABLE__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;
    int DROP_TABLE__COMMENT = STATEMENT__COMMENT;
    int DROP_TABLE__RAW_SQL = STATEMENT__RAW_SQL;
    int DROP_TABLE__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;
    int DROP_TABLE__TABLE_NAME = STATEMENT_FEATURE_COUNT + 1;
    int DROP_TABLE__IF_EXISTS = STATEMENT_FEATURE_COUNT + 2;
    int DROP_TABLE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

    int CREATE_VIEW = 14;
    int CREATE_VIEW__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;
    int CREATE_VIEW__COMMENT = STATEMENT__COMMENT;
    int CREATE_VIEW__RAW_SQL = STATEMENT__RAW_SQL;
    int CREATE_VIEW__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;
    int CREATE_VIEW__VIEW_NAME = STATEMENT_FEATURE_COUNT + 1;
    int CREATE_VIEW__OR_REPLACE = STATEMENT_FEATURE_COUNT + 2;
    int CREATE_VIEW__QUERY = STATEMENT_FEATURE_COUNT + 3;
    int CREATE_VIEW_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

    int DROP_VIEW = 15;
    int DROP_VIEW__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;
    int DROP_VIEW__COMMENT = STATEMENT__COMMENT;
    int DROP_VIEW__RAW_SQL = STATEMENT__RAW_SQL;
    int DROP_VIEW__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;
    int DROP_VIEW__VIEW_NAME = STATEMENT_FEATURE_COUNT + 1;
    int DROP_VIEW__IF_EXISTS = STATEMENT_FEATURE_COUNT + 2;
    int DROP_VIEW_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

    int CREATE_INDEX = 16;
    int CREATE_INDEX__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;
    int CREATE_INDEX__COMMENT = STATEMENT__COMMENT;
    int CREATE_INDEX__RAW_SQL = STATEMENT__RAW_SQL;
    int CREATE_INDEX__INDEX_NAME = STATEMENT_FEATURE_COUNT + 0;
    int CREATE_INDEX__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 1;
    int CREATE_INDEX__TABLE_NAME = STATEMENT_FEATURE_COUNT + 2;
    int CREATE_INDEX__UNIQUE = STATEMENT_FEATURE_COUNT + 3;
    int CREATE_INDEX__COLUMN_NAMES = STATEMENT_FEATURE_COUNT + 4;
    int CREATE_INDEX_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

    int DROP_INDEX = 17;
    int DROP_INDEX__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;
    int DROP_INDEX__COMMENT = STATEMENT__COMMENT;
    int DROP_INDEX__RAW_SQL = STATEMENT__RAW_SQL;
    int DROP_INDEX__INDEX_NAME = STATEMENT_FEATURE_COUNT + 0;
    int DROP_INDEX__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 1;
    int DROP_INDEX__TABLE_NAME = STATEMENT_FEATURE_COUNT + 2;
    int DROP_INDEX_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

    int SELECT = 18;
    int SELECT__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;
    int SELECT__COMMENT = STATEMENT__COMMENT;
    int SELECT__RAW_SQL = STATEMENT__RAW_SQL;
    int SELECT__DISTINCT = STATEMENT_FEATURE_COUNT + 0;
    int SELECT__SELECT_ITEMS = STATEMENT_FEATURE_COUNT + 1;
    int SELECT__FROM_ITEMS = STATEMENT_FEATURE_COUNT + 2;
    int SELECT__JOINS = STATEMENT_FEATURE_COUNT + 3;
    int SELECT__WHERE = STATEMENT_FEATURE_COUNT + 4;
    int SELECT__GROUP_BY = STATEMENT_FEATURE_COUNT + 5;
    int SELECT__HAVING = STATEMENT_FEATURE_COUNT + 6;
    int SELECT__ORDER_BY = STATEMENT_FEATURE_COUNT + 7;
    int SELECT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 8;

    int INSERT = 19;
    int INSERT__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;
    int INSERT__COMMENT = STATEMENT__COMMENT;
    int INSERT__RAW_SQL = STATEMENT__RAW_SQL;
    int INSERT__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;
    int INSERT__TABLE_NAME = STATEMENT_FEATURE_COUNT + 1;
    int INSERT__COLUMN_NAMES = STATEMENT_FEATURE_COUNT + 2;
    int INSERT__VALUES = STATEMENT_FEATURE_COUNT + 3;
    int INSERT__SELECT = STATEMENT_FEATURE_COUNT + 4;
    int INSERT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

    int UPDATE = 20;
    int UPDATE__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;
    int UPDATE__COMMENT = STATEMENT__COMMENT;
    int UPDATE__RAW_SQL = STATEMENT__RAW_SQL;
    int UPDATE__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;
    int UPDATE__TABLE_NAME = STATEMENT_FEATURE_COUNT + 1;
    int UPDATE__SETS = STATEMENT_FEATURE_COUNT + 2;
    int UPDATE__WHERE = STATEMENT_FEATURE_COUNT + 3;
    int UPDATE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

    int SET_CLAUSE = 21;
    int SET_CLAUSE__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;
    int SET_CLAUSE__COMMENT = AST_NODE__COMMENT;
    int SET_CLAUSE__COLUMN_NAME = AST_NODE_FEATURE_COUNT + 0;
    int SET_CLAUSE__VALUE = AST_NODE_FEATURE_COUNT + 1;
    int SET_CLAUSE_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

    int DELETE = 22;
    int DELETE__SOURCE_SPAN = STATEMENT__SOURCE_SPAN;
    int DELETE__COMMENT = STATEMENT__COMMENT;
    int DELETE__RAW_SQL = STATEMENT__RAW_SQL;
    int DELETE__SCHEMA_NAME = STATEMENT_FEATURE_COUNT + 0;
    int DELETE__TABLE_NAME = STATEMENT_FEATURE_COUNT + 1;
    int DELETE__WHERE = STATEMENT_FEATURE_COUNT + 2;
    int DELETE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

    int COLUMN_DEFINITION = 23;
    int COLUMN_DEFINITION__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;
    int COLUMN_DEFINITION__COMMENT = AST_NODE__COMMENT;
    int COLUMN_DEFINITION__NAME = AST_NODE_FEATURE_COUNT + 0;
    int COLUMN_DEFINITION__DATA_TYPE = AST_NODE_FEATURE_COUNT + 1;
    int COLUMN_DEFINITION__NULLABLE = AST_NODE_FEATURE_COUNT + 2;
    int COLUMN_DEFINITION__DEFAULT_VALUE = AST_NODE_FEATURE_COUNT + 3;
    int COLUMN_DEFINITION__IDENTITY = AST_NODE_FEATURE_COUNT + 4;
    int COLUMN_DEFINITION__COMPUTED = AST_NODE_FEATURE_COUNT + 5;
    int COLUMN_DEFINITION__COMPUTED_EXPRESSION = AST_NODE_FEATURE_COUNT + 6;
    int COLUMN_DEFINITION__INLINE_CONSTRAINTS = AST_NODE_FEATURE_COUNT + 7;
    int COLUMN_DEFINITION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 8;

    int TABLE_CONSTRAINT = 24;
    int TABLE_CONSTRAINT__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;
    int TABLE_CONSTRAINT__COMMENT = AST_NODE__COMMENT;
    int TABLE_CONSTRAINT__NAME = AST_NODE_FEATURE_COUNT + 0;
    int TABLE_CONSTRAINT_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 1;

    int PRIMARY_KEY_CONSTRAINT = 25;
    int PRIMARY_KEY_CONSTRAINT__SOURCE_SPAN = TABLE_CONSTRAINT__SOURCE_SPAN;
    int PRIMARY_KEY_CONSTRAINT__COMMENT = TABLE_CONSTRAINT__COMMENT;
    int PRIMARY_KEY_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;
    int PRIMARY_KEY_CONSTRAINT__COLUMN_NAMES = TABLE_CONSTRAINT_FEATURE_COUNT + 0;
    int PRIMARY_KEY_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

    int FOREIGN_KEY_CONSTRAINT = 26;
    int FOREIGN_KEY_CONSTRAINT__SOURCE_SPAN = TABLE_CONSTRAINT__SOURCE_SPAN;
    int FOREIGN_KEY_CONSTRAINT__COMMENT = TABLE_CONSTRAINT__COMMENT;
    int FOREIGN_KEY_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;
    int FOREIGN_KEY_CONSTRAINT__COLUMN_NAMES = TABLE_CONSTRAINT_FEATURE_COUNT + 0;
    int FOREIGN_KEY_CONSTRAINT__REFERENCED_TABLE = TABLE_CONSTRAINT_FEATURE_COUNT + 1;
    int FOREIGN_KEY_CONSTRAINT__REFERENCED_SCHEMA = TABLE_CONSTRAINT_FEATURE_COUNT + 2;
    int FOREIGN_KEY_CONSTRAINT__REFERENCED_COLUMNS = TABLE_CONSTRAINT_FEATURE_COUNT + 3;
    int FOREIGN_KEY_CONSTRAINT__ON_DELETE = TABLE_CONSTRAINT_FEATURE_COUNT + 4;
    int FOREIGN_KEY_CONSTRAINT__ON_UPDATE = TABLE_CONSTRAINT_FEATURE_COUNT + 5;
    int FOREIGN_KEY_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 6;

    int UNIQUE_CONSTRAINT = 27;
    int UNIQUE_CONSTRAINT__SOURCE_SPAN = TABLE_CONSTRAINT__SOURCE_SPAN;
    int UNIQUE_CONSTRAINT__COMMENT = TABLE_CONSTRAINT__COMMENT;
    int UNIQUE_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;
    int UNIQUE_CONSTRAINT__COLUMN_NAMES = TABLE_CONSTRAINT_FEATURE_COUNT + 0;
    int UNIQUE_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

    int CHECK_CONSTRAINT = 28;
    int CHECK_CONSTRAINT__SOURCE_SPAN = TABLE_CONSTRAINT__SOURCE_SPAN;
    int CHECK_CONSTRAINT__COMMENT = TABLE_CONSTRAINT__COMMENT;
    int CHECK_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;
    int CHECK_CONSTRAINT__EXPRESSION = TABLE_CONSTRAINT_FEATURE_COUNT + 0;
    int CHECK_CONSTRAINT__EXPRESSION_TEXT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;
    int CHECK_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 2;

    int SELECT_ITEM = 29;
    int SELECT_ITEM__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;
    int SELECT_ITEM__COMMENT = AST_NODE__COMMENT;
    int SELECT_ITEM__EXPRESSION = AST_NODE_FEATURE_COUNT + 0;
    int SELECT_ITEM__ALIAS = AST_NODE_FEATURE_COUNT + 1;
    int SELECT_ITEM__ALL_COLUMNS = AST_NODE_FEATURE_COUNT + 2;
    int SELECT_ITEM__TABLE_ALIAS = AST_NODE_FEATURE_COUNT + 3;
    int SELECT_ITEM_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 4;

    int FROM_ITEM = 30;
    int FROM_ITEM__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;
    int FROM_ITEM__COMMENT = AST_NODE__COMMENT;
    int FROM_ITEM__ALIAS = AST_NODE_FEATURE_COUNT + 0;
    int FROM_ITEM_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 1;

    int TABLE_REFERENCE = 31;
    int TABLE_REFERENCE__SOURCE_SPAN = FROM_ITEM__SOURCE_SPAN;
    int TABLE_REFERENCE__COMMENT = FROM_ITEM__COMMENT;
    int TABLE_REFERENCE__ALIAS = FROM_ITEM__ALIAS;
    int TABLE_REFERENCE__SCHEMA_NAME = FROM_ITEM_FEATURE_COUNT + 0;
    int TABLE_REFERENCE__TABLE_NAME = FROM_ITEM_FEATURE_COUNT + 1;
    int TABLE_REFERENCE_FEATURE_COUNT = FROM_ITEM_FEATURE_COUNT + 2;

    int SUB_SELECT = 32;
    int SUB_SELECT__SOURCE_SPAN = FROM_ITEM__SOURCE_SPAN;
    int SUB_SELECT__COMMENT = FROM_ITEM__COMMENT;
    int SUB_SELECT__ALIAS = FROM_ITEM__ALIAS;
    int SUB_SELECT__SELECT = FROM_ITEM_FEATURE_COUNT + 0;
    int SUB_SELECT_FEATURE_COUNT = FROM_ITEM_FEATURE_COUNT + 1;

    int JOIN = 33;
    int JOIN__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;
    int JOIN__COMMENT = AST_NODE__COMMENT;
    int JOIN__TYPE = AST_NODE_FEATURE_COUNT + 0;
    int JOIN__RIGHT_ITEM = AST_NODE_FEATURE_COUNT + 1;
    int JOIN__ON_CONDITION = AST_NODE_FEATURE_COUNT + 2;
    int JOIN_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 3;

    int ORDER_BY_ITEM = 34;
    int ORDER_BY_ITEM__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;
    int ORDER_BY_ITEM__COMMENT = AST_NODE__COMMENT;
    int ORDER_BY_ITEM__EXPRESSION = AST_NODE_FEATURE_COUNT + 0;
    int ORDER_BY_ITEM__DIRECTION = AST_NODE_FEATURE_COUNT + 1;
    int ORDER_BY_ITEM_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

    int EXPRESSION = 35;
    int EXPRESSION__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;
    int EXPRESSION__COMMENT = AST_NODE__COMMENT;
    int EXPRESSION_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 0;

    int COLUMN_REFERENCE = 36;
    int COLUMN_REFERENCE__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;
    int COLUMN_REFERENCE__COMMENT = EXPRESSION__COMMENT;
    int COLUMN_REFERENCE__TABLE_NAME = EXPRESSION_FEATURE_COUNT + 0;
    int COLUMN_REFERENCE__SCHEMA_NAME = EXPRESSION_FEATURE_COUNT + 1;
    int COLUMN_REFERENCE__COLUMN_NAME = EXPRESSION_FEATURE_COUNT + 2;
    int COLUMN_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    int LITERAL = 37;
    int LITERAL__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;
    int LITERAL__COMMENT = EXPRESSION__COMMENT;
    int LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;
    int LITERAL__TYPE = EXPRESSION_FEATURE_COUNT + 1;
    int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

    int FUNCTION_CALL = 38;
    int FUNCTION_CALL__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;
    int FUNCTION_CALL__COMMENT = EXPRESSION__COMMENT;
    int FUNCTION_CALL__NAME = EXPRESSION_FEATURE_COUNT + 0;
    int FUNCTION_CALL__SCHEMA_NAME = EXPRESSION_FEATURE_COUNT + 1;
    int FUNCTION_CALL__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 2;
    int FUNCTION_CALL__DISTINCT = EXPRESSION_FEATURE_COUNT + 3;
    int FUNCTION_CALL__ALL_COLUMNS = EXPRESSION_FEATURE_COUNT + 4;
    int FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 5;

    int BINARY_EXPRESSION = 39;
    int BINARY_EXPRESSION__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;
    int BINARY_EXPRESSION__COMMENT = EXPRESSION__COMMENT;
    int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;
    int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;
    int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;
    int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    int UNARY_EXPRESSION = 40;
    int UNARY_EXPRESSION__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;
    int UNARY_EXPRESSION__COMMENT = EXPRESSION__COMMENT;
    int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;
    int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;
    int UNARY_EXPRESSION__PREFIX = EXPRESSION_FEATURE_COUNT + 2;
    int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    int PARENTHESIS = 41;
    int PARENTHESIS__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;
    int PARENTHESIS__COMMENT = EXPRESSION__COMMENT;
    int PARENTHESIS__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;
    int PARENTHESIS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    int CASE_EXPRESSION = 42;
    int CASE_EXPRESSION__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;
    int CASE_EXPRESSION__COMMENT = EXPRESSION__COMMENT;
    int CASE_EXPRESSION__SWITCH_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;
    int CASE_EXPRESSION__WHEN_CLAUSES = EXPRESSION_FEATURE_COUNT + 1;
    int CASE_EXPRESSION__ELSE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;
    int CASE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

    int WHEN_CLAUSE = 43;
    int WHEN_CLAUSE__SOURCE_SPAN = AST_NODE__SOURCE_SPAN;
    int WHEN_CLAUSE__COMMENT = AST_NODE__COMMENT;
    int WHEN_CLAUSE__CONDITION = AST_NODE_FEATURE_COUNT + 0;
    int WHEN_CLAUSE__RESULT = AST_NODE_FEATURE_COUNT + 1;
    int WHEN_CLAUSE_FEATURE_COUNT = AST_NODE_FEATURE_COUNT + 2;

    int ALL_COLUMNS = 44;
    int ALL_COLUMNS__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;
    int ALL_COLUMNS__COMMENT = EXPRESSION__COMMENT;
    int ALL_COLUMNS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

    int EXPRESSION_LIST = 45;
    int EXPRESSION_LIST__SOURCE_SPAN = EXPRESSION__SOURCE_SPAN;
    int EXPRESSION_LIST__COMMENT = EXPRESSION__COMMENT;
    int EXPRESSION_LIST__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;
    int EXPRESSION_LIST_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

    EClass getSourceSpan();
    EAttribute getSourceSpan_StartLine();
    EAttribute getSourceSpan_StartColumn();
    EAttribute getSourceSpan_EndLine();
    EAttribute getSourceSpan_EndColumn();
    EAttribute getSourceSpan_StartOffset();
    EAttribute getSourceSpan_EndOffset();

    EClass getAstNode();
    EReference getAstNode_SourceSpan();
    EAttribute getAstNode_Comment();

    EClass getSqlScript();
    EAttribute getSqlScript_SourceUri();
    EAttribute getSqlScript_Dialect();
    EReference getSqlScript_Statements();
    EAttribute getSqlScript_LeadingComments();

    EClass getStatement();
    EAttribute getStatement_RawSql();

    EClass getUnparsedStatement();
    EAttribute getUnparsedStatement_ErrorMessage();

    EClass getCreateTable();
    EAttribute getCreateTable_SchemaName();
    EAttribute getCreateTable_TableName();
    EAttribute getCreateTable_IfNotExists();
    EReference getCreateTable_Columns();
    EReference getCreateTable_Constraints();

    EClass getAlterTable();
    EAttribute getAlterTable_SchemaName();
    EAttribute getAlterTable_TableName();
    EReference getAlterTable_Operations();

    EClass getAlterOperation();

    EClass getAddColumn();
    EReference getAddColumn_Column();

    EClass getDropColumn();
    EAttribute getDropColumn_ColumnName();

    EClass getAddConstraint();
    EReference getAddConstraint_Constraint();

    EClass getDropTable();
    EAttribute getDropTable_SchemaName();
    EAttribute getDropTable_TableName();
    EAttribute getDropTable_IfExists();

    EClass getCreateView();
    EAttribute getCreateView_SchemaName();
    EAttribute getCreateView_ViewName();
    EAttribute getCreateView_OrReplace();
    EReference getCreateView_Query();

    EClass getDropView();
    EAttribute getDropView_SchemaName();
    EAttribute getDropView_ViewName();
    EAttribute getDropView_IfExists();

    EClass getCreateIndex();
    EAttribute getCreateIndex_IndexName();
    EAttribute getCreateIndex_SchemaName();
    EAttribute getCreateIndex_TableName();
    EAttribute getCreateIndex_Unique();
    EAttribute getCreateIndex_ColumnNames();

    EClass getDropIndex();
    EAttribute getDropIndex_IndexName();
    EAttribute getDropIndex_SchemaName();
    EAttribute getDropIndex_TableName();

    EClass getSelect();
    EAttribute getSelect_Distinct();
    EReference getSelect_SelectItems();
    EReference getSelect_FromItems();
    EReference getSelect_Joins();
    EReference getSelect_Where();
    EReference getSelect_GroupBy();
    EReference getSelect_Having();
    EReference getSelect_OrderBy();

    EClass getInsert();
    EAttribute getInsert_SchemaName();
    EAttribute getInsert_TableName();
    EAttribute getInsert_ColumnNames();
    EReference getInsert_Values();
    EReference getInsert_Select();

    EClass getUpdate();
    EAttribute getUpdate_SchemaName();
    EAttribute getUpdate_TableName();
    EReference getUpdate_Sets();
    EReference getUpdate_Where();

    EClass getSetClause();
    EAttribute getSetClause_ColumnName();
    EReference getSetClause_Value();

    EClass getDelete();
    EAttribute getDelete_SchemaName();
    EAttribute getDelete_TableName();
    EReference getDelete_Where();

    EClass getColumnDefinition();
    EAttribute getColumnDefinition_Name();
    EAttribute getColumnDefinition_DataType();
    EAttribute getColumnDefinition_Nullable();
    EAttribute getColumnDefinition_DefaultValue();
    EAttribute getColumnDefinition_Identity();
    EAttribute getColumnDefinition_Computed();
    EAttribute getColumnDefinition_ComputedExpression();
    EReference getColumnDefinition_InlineConstraints();

    EClass getTableConstraint();
    EAttribute getTableConstraint_Name();

    EClass getPrimaryKeyConstraint();
    EAttribute getPrimaryKeyConstraint_ColumnNames();

    EClass getForeignKeyConstraint();
    EAttribute getForeignKeyConstraint_ColumnNames();
    EAttribute getForeignKeyConstraint_ReferencedTable();
    EAttribute getForeignKeyConstraint_ReferencedSchema();
    EAttribute getForeignKeyConstraint_ReferencedColumns();
    EAttribute getForeignKeyConstraint_OnDelete();
    EAttribute getForeignKeyConstraint_OnUpdate();

    EClass getUniqueConstraint();
    EAttribute getUniqueConstraint_ColumnNames();

    EClass getCheckConstraint();
    EReference getCheckConstraint_Expression();
    EAttribute getCheckConstraint_ExpressionText();

    EClass getSelectItem();
    EReference getSelectItem_Expression();
    EAttribute getSelectItem_Alias();
    EAttribute getSelectItem_AllColumns();
    EAttribute getSelectItem_TableAlias();

    EClass getFromItem();
    EAttribute getFromItem_Alias();

    EClass getTableReference();
    EAttribute getTableReference_SchemaName();
    EAttribute getTableReference_TableName();

    EClass getSubSelect();
    EReference getSubSelect_Select();

    EClass getJoin();
    EAttribute getJoin_Type();
    EReference getJoin_RightItem();
    EReference getJoin_OnCondition();

    EClass getOrderByItem();
    EReference getOrderByItem_Expression();
    EAttribute getOrderByItem_Direction();

    EClass getExpression();

    EClass getColumnReference();
    EAttribute getColumnReference_TableName();
    EAttribute getColumnReference_SchemaName();
    EAttribute getColumnReference_ColumnName();

    EClass getLiteral();
    EAttribute getLiteral_Value();
    EAttribute getLiteral_Type();

    EClass getFunctionCall();
    EAttribute getFunctionCall_Name();
    EAttribute getFunctionCall_SchemaName();
    EReference getFunctionCall_Arguments();
    EAttribute getFunctionCall_Distinct();
    EAttribute getFunctionCall_AllColumns();

    EClass getBinaryExpression();
    EReference getBinaryExpression_Left();
    EReference getBinaryExpression_Right();
    EAttribute getBinaryExpression_Operator();

    EClass getUnaryExpression();
    EReference getUnaryExpression_Operand();
    EAttribute getUnaryExpression_Operator();
    EAttribute getUnaryExpression_Prefix();

    EClass getParenthesis();
    EReference getParenthesis_Expression();

    EClass getCaseExpression();
    EReference getCaseExpression_SwitchExpression();
    EReference getCaseExpression_WhenClauses();
    EReference getCaseExpression_ElseExpression();

    EClass getWhenClause();
    EReference getWhenClause_Condition();
    EReference getWhenClause_Result();

    EClass getAllColumns();

    EClass getExpressionList();
    EReference getExpressionList_Expressions();

    EEnum getJoinType();
    EEnum getSortDirection();

    SqlAstFactory getSqlAstFactory();
}
