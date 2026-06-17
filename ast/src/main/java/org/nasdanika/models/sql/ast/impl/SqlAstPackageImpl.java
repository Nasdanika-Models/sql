package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.models.sql.ast.SqlAstFactory;
import org.nasdanika.models.sql.ast.SqlAstPackage;

public class SqlAstPackageImpl extends EPackageImpl implements SqlAstPackage {

    private static boolean isInited = false;
    private static SqlAstPackageImpl theInstance;

    private boolean isCreated = false;
    private boolean isInitialized = false;

    private EClass astNodeEClass;
    private EClass sqlScriptEClass;
    private EClass statementEClass;
    private EClass createTableEClass;
    private EClass alterTableEClass;
    private EClass dropTableEClass;
    private EClass createViewEClass;
    private EClass dropViewEClass;
    private EClass createIndexEClass;
    private EClass dropIndexEClass;
    private EClass selectEClass;
    private EClass insertEClass;
    private EClass updateEClass;
    private EClass deleteEClass;
    private EClass unparsedStatementEClass;
    private EClass columnDefinitionEClass;
    private EClass tableConstraintEClass;
    private EClass primaryKeyConstraintEClass;
    private EClass foreignKeyConstraintEClass;
    private EClass uniqueConstraintEClass;
    private EClass checkConstraintEClass;
    private EClass alterOperationEClass;
    private EClass addColumnEClass;
    private EClass dropColumnEClass;
    private EClass alterColumnEClass;
    private EClass addConstraintEClass;
    private EClass dropConstraintEClass;
    private EClass selectItemEClass;
    private EClass fromItemEClass;
    private EClass tableReferenceEClass;
    private EClass subSelectEClass;
    private EClass joinEClass;
    private EClass groupByElementEClass;
    private EClass orderByElementEClass;
    private EClass setClauseEClass;
    private EClass indexColumnEClass;
    private EClass expressionEClass;
    private EClass columnReferenceEClass;
    private EClass literalEClass;
    private EClass functionCallEClass;
    private EClass binaryExpressionEClass;
    private EClass unaryExpressionEClass;
    private EClass parenthesisEClass;
    private EClass caseExpressionEClass;
    private EClass whenClauseEClass;
    private EClass allColumnsEClass;
    private EClass subSelectExpressionEClass;
    private EClass inExpressionEClass;
    private EClass betweenExpressionEClass;
    private EClass isNullExpressionEClass;
    private EClass existsExpressionEClass;
    private EClass castExpressionEClass;
    private EClass expressionListEClass;

    private EEnum joinTypeEEnum;
    private EEnum literalTypeEEnum;

    private SqlAstPackageImpl() {
        super(eNS_URI, SqlAstFactory.eINSTANCE);
    }

    public static SqlAstPackage init() {
        if (isInited) {
            return theInstance;
        }
        isInited = true;
        theInstance = new SqlAstPackageImpl();
        theInstance.createPackageContents();
        theInstance.initializePackageContents();
        theInstance.freeze();
        EPackage.Registry.INSTANCE.put(SqlAstPackage.eNS_URI, theInstance);
        return theInstance;
    }

    private void createPackageContents() {
        if (isCreated) {
            return;
        }
        isCreated = true;
        astNodeEClass = createEClass(AST_NODE);
        sqlScriptEClass = createEClass(SQL_SCRIPT);
        statementEClass = createEClass(STATEMENT);
        createTableEClass = createEClass(CREATE_TABLE);
        alterTableEClass = createEClass(ALTER_TABLE);
        dropTableEClass = createEClass(DROP_TABLE);
        createViewEClass = createEClass(CREATE_VIEW);
        dropViewEClass = createEClass(DROP_VIEW);
        createIndexEClass = createEClass(CREATE_INDEX);
        dropIndexEClass = createEClass(DROP_INDEX);
        selectEClass = createEClass(SELECT);
        insertEClass = createEClass(INSERT);
        updateEClass = createEClass(UPDATE);
        deleteEClass = createEClass(DELETE);
        unparsedStatementEClass = createEClass(UNPARSED_STATEMENT);
        columnDefinitionEClass = createEClass(COLUMN_DEFINITION);
        tableConstraintEClass = createEClass(TABLE_CONSTRAINT);
        primaryKeyConstraintEClass = createEClass(PRIMARY_KEY_CONSTRAINT);
        foreignKeyConstraintEClass = createEClass(FOREIGN_KEY_CONSTRAINT);
        uniqueConstraintEClass = createEClass(UNIQUE_CONSTRAINT);
        checkConstraintEClass = createEClass(CHECK_CONSTRAINT);
        alterOperationEClass = createEClass(ALTER_OPERATION);
        addColumnEClass = createEClass(ADD_COLUMN);
        dropColumnEClass = createEClass(DROP_COLUMN);
        alterColumnEClass = createEClass(ALTER_COLUMN);
        addConstraintEClass = createEClass(ADD_CONSTRAINT);
        dropConstraintEClass = createEClass(DROP_CONSTRAINT);
        selectItemEClass = createEClass(SELECT_ITEM);
        fromItemEClass = createEClass(FROM_ITEM);
        tableReferenceEClass = createEClass(TABLE_REFERENCE);
        subSelectEClass = createEClass(SUB_SELECT);
        joinEClass = createEClass(JOIN);
        groupByElementEClass = createEClass(GROUP_BY_ELEMENT);
        orderByElementEClass = createEClass(ORDER_BY_ELEMENT);
        setClauseEClass = createEClass(SET_CLAUSE);
        indexColumnEClass = createEClass(INDEX_COLUMN);
        expressionEClass = createEClass(EXPRESSION);
        columnReferenceEClass = createEClass(COLUMN_REFERENCE);
        literalEClass = createEClass(LITERAL);
        functionCallEClass = createEClass(FUNCTION_CALL);
        binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
        unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
        parenthesisEClass = createEClass(PARENTHESIS);
        caseExpressionEClass = createEClass(CASE_EXPRESSION);
        whenClauseEClass = createEClass(WHEN_CLAUSE);
        allColumnsEClass = createEClass(ALL_COLUMNS);
        subSelectExpressionEClass = createEClass(SUB_SELECT_EXPRESSION);
        inExpressionEClass = createEClass(IN_EXPRESSION);
        betweenExpressionEClass = createEClass(BETWEEN_EXPRESSION);
        isNullExpressionEClass = createEClass(IS_NULL_EXPRESSION);
        existsExpressionEClass = createEClass(EXISTS_EXPRESSION);
        castExpressionEClass = createEClass(CAST_EXPRESSION);
        expressionListEClass = createEClass(EXPRESSION_LIST);

        joinTypeEEnum = createEEnum(53);
        literalTypeEEnum = createEEnum(54);
    }

    private void initializePackageContents() {
        if (isInitialized) {
            return;
        }
        isInitialized = true;

        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        astNodeEClass.setName("AstNode");
        astNodeEClass.setAbstract(true);
        sqlScriptEClass.setName("SqlScript");
        statementEClass.setName("Statement");
        statementEClass.setAbstract(true);
        createTableEClass.setName("CreateTable");
        alterTableEClass.setName("AlterTable");
        dropTableEClass.setName("DropTable");
        createViewEClass.setName("CreateView");
        dropViewEClass.setName("DropView");
        createIndexEClass.setName("CreateIndex");
        dropIndexEClass.setName("DropIndex");
        selectEClass.setName("Select");
        insertEClass.setName("Insert");
        updateEClass.setName("Update");
        deleteEClass.setName("Delete");
        unparsedStatementEClass.setName("UnparsedStatement");
        columnDefinitionEClass.setName("ColumnDefinition");
        tableConstraintEClass.setName("TableConstraint");
        tableConstraintEClass.setAbstract(true);
        primaryKeyConstraintEClass.setName("PrimaryKeyConstraint");
        foreignKeyConstraintEClass.setName("ForeignKeyConstraint");
        uniqueConstraintEClass.setName("UniqueConstraint");
        checkConstraintEClass.setName("CheckConstraint");
        alterOperationEClass.setName("AlterOperation");
        alterOperationEClass.setAbstract(true);
        addColumnEClass.setName("AddColumn");
        dropColumnEClass.setName("DropColumn");
        alterColumnEClass.setName("AlterColumn");
        addConstraintEClass.setName("AddConstraint");
        dropConstraintEClass.setName("DropConstraint");
        selectItemEClass.setName("SelectItem");
        fromItemEClass.setName("FromItem");
        fromItemEClass.setAbstract(true);
        tableReferenceEClass.setName("TableReference");
        subSelectEClass.setName("SubSelect");
        joinEClass.setName("Join");
        groupByElementEClass.setName("GroupByElement");
        orderByElementEClass.setName("OrderByElement");
        setClauseEClass.setName("SetClause");
        indexColumnEClass.setName("IndexColumn");
        expressionEClass.setName("Expression");
        expressionEClass.setAbstract(true);
        columnReferenceEClass.setName("ColumnReference");
        literalEClass.setName("Literal");
        functionCallEClass.setName("FunctionCall");
        binaryExpressionEClass.setName("BinaryExpression");
        unaryExpressionEClass.setName("UnaryExpression");
        parenthesisEClass.setName("Parenthesis");
        caseExpressionEClass.setName("CaseExpression");
        whenClauseEClass.setName("WhenClause");
        allColumnsEClass.setName("AllColumns");
        subSelectExpressionEClass.setName("SubSelectExpression");
        inExpressionEClass.setName("InExpression");
        betweenExpressionEClass.setName("BetweenExpression");
        isNullExpressionEClass.setName("IsNullExpression");
        existsExpressionEClass.setName("ExistsExpression");
        castExpressionEClass.setName("CastExpression");
        expressionListEClass.setName("ExpressionList");

        joinTypeEEnum.setName("JoinType");
        literalTypeEEnum.setName("LiteralType");

        statementEClass.getESuperTypes().add(astNodeEClass);
        createTableEClass.getESuperTypes().add(statementEClass);
        alterTableEClass.getESuperTypes().add(statementEClass);
        dropTableEClass.getESuperTypes().add(statementEClass);
        createViewEClass.getESuperTypes().add(statementEClass);
        dropViewEClass.getESuperTypes().add(statementEClass);
        createIndexEClass.getESuperTypes().add(statementEClass);
        dropIndexEClass.getESuperTypes().add(statementEClass);
        selectEClass.getESuperTypes().add(statementEClass);
        insertEClass.getESuperTypes().add(statementEClass);
        updateEClass.getESuperTypes().add(statementEClass);
        deleteEClass.getESuperTypes().add(statementEClass);
        unparsedStatementEClass.getESuperTypes().add(statementEClass);
        columnDefinitionEClass.getESuperTypes().add(astNodeEClass);
        tableConstraintEClass.getESuperTypes().add(astNodeEClass);
        primaryKeyConstraintEClass.getESuperTypes().add(tableConstraintEClass);
        foreignKeyConstraintEClass.getESuperTypes().add(tableConstraintEClass);
        uniqueConstraintEClass.getESuperTypes().add(tableConstraintEClass);
        checkConstraintEClass.getESuperTypes().add(tableConstraintEClass);
        alterOperationEClass.getESuperTypes().add(astNodeEClass);
        addColumnEClass.getESuperTypes().add(alterOperationEClass);
        dropColumnEClass.getESuperTypes().add(alterOperationEClass);
        alterColumnEClass.getESuperTypes().add(alterOperationEClass);
        addConstraintEClass.getESuperTypes().add(alterOperationEClass);
        dropConstraintEClass.getESuperTypes().add(alterOperationEClass);
        selectItemEClass.getESuperTypes().add(astNodeEClass);
        fromItemEClass.getESuperTypes().add(astNodeEClass);
        tableReferenceEClass.getESuperTypes().add(fromItemEClass);
        subSelectEClass.getESuperTypes().add(fromItemEClass);
        joinEClass.getESuperTypes().add(astNodeEClass);
        groupByElementEClass.getESuperTypes().add(astNodeEClass);
        orderByElementEClass.getESuperTypes().add(astNodeEClass);
        setClauseEClass.getESuperTypes().add(astNodeEClass);
        indexColumnEClass.getESuperTypes().add(astNodeEClass);
        expressionEClass.getESuperTypes().add(astNodeEClass);
        columnReferenceEClass.getESuperTypes().add(expressionEClass);
        literalEClass.getESuperTypes().add(expressionEClass);
        functionCallEClass.getESuperTypes().add(expressionEClass);
        binaryExpressionEClass.getESuperTypes().add(expressionEClass);
        unaryExpressionEClass.getESuperTypes().add(expressionEClass);
        parenthesisEClass.getESuperTypes().add(expressionEClass);
        caseExpressionEClass.getESuperTypes().add(expressionEClass);
        allColumnsEClass.getESuperTypes().add(expressionEClass);
        subSelectExpressionEClass.getESuperTypes().add(expressionEClass);
        inExpressionEClass.getESuperTypes().add(expressionEClass);
        betweenExpressionEClass.getESuperTypes().add(expressionEClass);
        isNullExpressionEClass.getESuperTypes().add(expressionEClass);
        existsExpressionEClass.getESuperTypes().add(expressionEClass);
        castExpressionEClass.getESuperTypes().add(expressionEClass);
        expressionListEClass.getESuperTypes().add(astNodeEClass);
        whenClauseEClass.getESuperTypes().add(astNodeEClass);

        createResource(eNS_URI);
    }

    @Override public EClass getAstNode() { return astNodeEClass; }
    @Override public EClass getSqlScript() { return sqlScriptEClass; }
    @Override public EClass getStatement() { return statementEClass; }
    @Override public EClass getCreateTable() { return createTableEClass; }
    @Override public EClass getAlterTable() { return alterTableEClass; }
    @Override public EClass getDropTable() { return dropTableEClass; }
    @Override public EClass getCreateView() { return createViewEClass; }
    @Override public EClass getDropView() { return dropViewEClass; }
    @Override public EClass getCreateIndex() { return createIndexEClass; }
    @Override public EClass getDropIndex() { return dropIndexEClass; }
    @Override public EClass getSelect() { return selectEClass; }
    @Override public EClass getInsert() { return insertEClass; }
    @Override public EClass getUpdate() { return updateEClass; }
    @Override public EClass getDelete() { return deleteEClass; }
    @Override public EClass getUnparsedStatement() { return unparsedStatementEClass; }
    @Override public EClass getColumnDefinition() { return columnDefinitionEClass; }
    @Override public EClass getTableConstraint() { return tableConstraintEClass; }
    @Override public EClass getPrimaryKeyConstraint() { return primaryKeyConstraintEClass; }
    @Override public EClass getForeignKeyConstraint() { return foreignKeyConstraintEClass; }
    @Override public EClass getUniqueConstraint() { return uniqueConstraintEClass; }
    @Override public EClass getCheckConstraint() { return checkConstraintEClass; }
    @Override public EClass getAlterOperation() { return alterOperationEClass; }
    @Override public EClass getAddColumn() { return addColumnEClass; }
    @Override public EClass getDropColumn() { return dropColumnEClass; }
    @Override public EClass getAlterColumn() { return alterColumnEClass; }
    @Override public EClass getAddConstraint() { return addConstraintEClass; }
    @Override public EClass getDropConstraint() { return dropConstraintEClass; }
    @Override public EClass getSelectItem() { return selectItemEClass; }
    @Override public EClass getFromItem() { return fromItemEClass; }
    @Override public EClass getTableReference() { return tableReferenceEClass; }
    @Override public EClass getSubSelect() { return subSelectEClass; }
    @Override public EClass getJoin() { return joinEClass; }
    @Override public EClass getGroupByElement() { return groupByElementEClass; }
    @Override public EClass getOrderByElement() { return orderByElementEClass; }
    @Override public EClass getSetClause() { return setClauseEClass; }
    @Override public EClass getIndexColumn() { return indexColumnEClass; }
    @Override public EClass getExpression() { return expressionEClass; }
    @Override public EClass getColumnReference() { return columnReferenceEClass; }
    @Override public EClass getLiteral() { return literalEClass; }
    @Override public EClass getFunctionCall() { return functionCallEClass; }
    @Override public EClass getBinaryExpression() { return binaryExpressionEClass; }
    @Override public EClass getUnaryExpression() { return unaryExpressionEClass; }
    @Override public EClass getParenthesis() { return parenthesisEClass; }
    @Override public EClass getCaseExpression() { return caseExpressionEClass; }
    @Override public EClass getWhenClause() { return whenClauseEClass; }
    @Override public EClass getAllColumns() { return allColumnsEClass; }
    @Override public EClass getSubSelectExpression() { return subSelectExpressionEClass; }
    @Override public EClass getInExpression() { return inExpressionEClass; }
    @Override public EClass getBetweenExpression() { return betweenExpressionEClass; }
    @Override public EClass getIsNullExpression() { return isNullExpressionEClass; }
    @Override public EClass getExistsExpression() { return existsExpressionEClass; }
    @Override public EClass getCastExpression() { return castExpressionEClass; }
    @Override public EClass getExpressionList() { return expressionListEClass; }
    @Override public EEnum getJoinTypeEnum() { return joinTypeEEnum; }
    @Override public EEnum getLiteralTypeEnum() { return literalTypeEEnum; }
}
