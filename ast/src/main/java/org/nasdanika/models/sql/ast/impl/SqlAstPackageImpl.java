package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.models.sql.ast.*;

public class SqlAstPackageImpl extends EPackageImpl implements SqlAstPackage {
    private EClass sourceSpanEClass = null;
    private EClass astNodeEClass = null;
    private EClass sqlScriptEClass = null;
    private EClass statementEClass = null;
    private EClass unparsedStatementEClass = null;
    private EClass createTableEClass = null;
    private EClass alterTableEClass = null;
    private EClass alterOperationEClass = null;
    private EClass addColumnEClass = null;
    private EClass dropColumnEClass = null;
    private EClass addConstraintEClass = null;
    private EClass dropTableEClass = null;
    private EClass createViewEClass = null;
    private EClass dropViewEClass = null;
    private EClass createIndexEClass = null;
    private EClass dropIndexEClass = null;
    private EClass selectEClass = null;
    private EClass insertEClass = null;
    private EClass updateEClass = null;
    private EClass setClauseEClass = null;
    private EClass deleteEClass = null;
    private EClass columnDefinitionEClass = null;
    private EClass tableConstraintEClass = null;
    private EClass primaryKeyConstraintEClass = null;
    private EClass foreignKeyConstraintEClass = null;
    private EClass uniqueConstraintEClass = null;
    private EClass checkConstraintEClass = null;
    private EClass selectItemEClass = null;
    private EClass fromItemEClass = null;
    private EClass tableReferenceEClass = null;
    private EClass subSelectEClass = null;
    private EClass joinEClass = null;
    private EClass orderByItemEClass = null;
    private EClass expressionEClass = null;
    private EClass columnReferenceEClass = null;
    private EClass literalEClass = null;
    private EClass functionCallEClass = null;
    private EClass binaryExpressionEClass = null;
    private EClass unaryExpressionEClass = null;
    private EClass parenthesisEClass = null;
    private EClass caseExpressionEClass = null;
    private EClass whenClauseEClass = null;
    private EClass allColumnsEClass = null;
    private EClass expressionListEClass = null;
    private EEnum joinTypeEEnum = null;
    private EEnum sortDirectionEEnum = null;

    private static boolean isInited = false;
    private boolean isCreated = false;
    private boolean isInitialized = false;

    private SqlAstPackageImpl() {
        super(eNS_URI, SqlAstFactory.eINSTANCE);
    }

    public static SqlAstPackage init() {
        if (isInited) {
            return (SqlAstPackage) EPackage.Registry.INSTANCE.getEPackage(eNS_URI);
        }
        Object registered = EPackage.Registry.INSTANCE.get(eNS_URI);
        SqlAstPackageImpl theSqlAstPackage = registered instanceof SqlAstPackageImpl ? (SqlAstPackageImpl) registered : new SqlAstPackageImpl();
        isInited = true;
        theSqlAstPackage.createPackageContents();
        theSqlAstPackage.initializePackageContents();
        theSqlAstPackage.freeze();
        EPackage.Registry.INSTANCE.put(eNS_URI, theSqlAstPackage);
        return theSqlAstPackage;
    }

    @Override
    public EClass getSourceSpan() {
        return sourceSpanEClass;
    }

    @Override
    public EAttribute getSourceSpan_StartLine() {
        return (EAttribute) sourceSpanEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getSourceSpan_StartColumn() {
        return (EAttribute) sourceSpanEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getSourceSpan_EndLine() {
        return (EAttribute) sourceSpanEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getSourceSpan_EndColumn() {
        return (EAttribute) sourceSpanEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EAttribute getSourceSpan_StartOffset() {
        return (EAttribute) sourceSpanEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EAttribute getSourceSpan_EndOffset() {
        return (EAttribute) sourceSpanEClass.getEStructuralFeatures().get(5);
    }

    @Override
    public EClass getAstNode() {
        return astNodeEClass;
    }

    @Override
    public EReference getAstNode_SourceSpan() {
        return (EReference) astNodeEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getAstNode_Comment() {
        return (EAttribute) astNodeEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EClass getSqlScript() {
        return sqlScriptEClass;
    }

    @Override
    public EAttribute getSqlScript_SourceUri() {
        return (EAttribute) sqlScriptEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getSqlScript_Dialect() {
        return (EAttribute) sqlScriptEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EReference getSqlScript_Statements() {
        return (EReference) sqlScriptEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getSqlScript_LeadingComments() {
        return (EAttribute) sqlScriptEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EClass getStatement() {
        return statementEClass;
    }

    @Override
    public EAttribute getStatement_RawSql() {
        return (EAttribute) statementEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EClass getUnparsedStatement() {
        return unparsedStatementEClass;
    }

    @Override
    public EAttribute getUnparsedStatement_ErrorMessage() {
        return (EAttribute) unparsedStatementEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EClass getCreateTable() {
        return createTableEClass;
    }

    @Override
    public EAttribute getCreateTable_SchemaName() {
        return (EAttribute) createTableEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getCreateTable_TableName() {
        return (EAttribute) createTableEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getCreateTable_IfNotExists() {
        return (EAttribute) createTableEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EReference getCreateTable_Columns() {
        return (EReference) createTableEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EReference getCreateTable_Constraints() {
        return (EReference) createTableEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EClass getAlterTable() {
        return alterTableEClass;
    }

    @Override
    public EAttribute getAlterTable_SchemaName() {
        return (EAttribute) alterTableEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getAlterTable_TableName() {
        return (EAttribute) alterTableEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EReference getAlterTable_Operations() {
        return (EReference) alterTableEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getAlterOperation() {
        return alterOperationEClass;
    }

    @Override
    public EClass getAddColumn() {
        return addColumnEClass;
    }

    @Override
    public EReference getAddColumn_Column() {
        return (EReference) addColumnEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EClass getDropColumn() {
        return dropColumnEClass;
    }

    @Override
    public EAttribute getDropColumn_ColumnName() {
        return (EAttribute) dropColumnEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EClass getAddConstraint() {
        return addConstraintEClass;
    }

    @Override
    public EReference getAddConstraint_Constraint() {
        return (EReference) addConstraintEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EClass getDropTable() {
        return dropTableEClass;
    }

    @Override
    public EAttribute getDropTable_SchemaName() {
        return (EAttribute) dropTableEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getDropTable_TableName() {
        return (EAttribute) dropTableEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getDropTable_IfExists() {
        return (EAttribute) dropTableEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getCreateView() {
        return createViewEClass;
    }

    @Override
    public EAttribute getCreateView_SchemaName() {
        return (EAttribute) createViewEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getCreateView_ViewName() {
        return (EAttribute) createViewEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getCreateView_OrReplace() {
        return (EAttribute) createViewEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EReference getCreateView_Query() {
        return (EReference) createViewEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EClass getDropView() {
        return dropViewEClass;
    }

    @Override
    public EAttribute getDropView_SchemaName() {
        return (EAttribute) dropViewEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getDropView_ViewName() {
        return (EAttribute) dropViewEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getDropView_IfExists() {
        return (EAttribute) dropViewEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getCreateIndex() {
        return createIndexEClass;
    }

    @Override
    public EAttribute getCreateIndex_IndexName() {
        return (EAttribute) createIndexEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getCreateIndex_SchemaName() {
        return (EAttribute) createIndexEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getCreateIndex_TableName() {
        return (EAttribute) createIndexEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getCreateIndex_Unique() {
        return (EAttribute) createIndexEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EAttribute getCreateIndex_ColumnNames() {
        return (EAttribute) createIndexEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EClass getDropIndex() {
        return dropIndexEClass;
    }

    @Override
    public EAttribute getDropIndex_IndexName() {
        return (EAttribute) dropIndexEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getDropIndex_SchemaName() {
        return (EAttribute) dropIndexEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getDropIndex_TableName() {
        return (EAttribute) dropIndexEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getSelect() {
        return selectEClass;
    }

    @Override
    public EAttribute getSelect_Distinct() {
        return (EAttribute) selectEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EReference getSelect_SelectItems() {
        return (EReference) selectEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EReference getSelect_FromItems() {
        return (EReference) selectEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EReference getSelect_Joins() {
        return (EReference) selectEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EReference getSelect_Where() {
        return (EReference) selectEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EReference getSelect_GroupBy() {
        return (EReference) selectEClass.getEStructuralFeatures().get(5);
    }

    @Override
    public EReference getSelect_Having() {
        return (EReference) selectEClass.getEStructuralFeatures().get(6);
    }

    @Override
    public EReference getSelect_OrderBy() {
        return (EReference) selectEClass.getEStructuralFeatures().get(7);
    }

    @Override
    public EClass getInsert() {
        return insertEClass;
    }

    @Override
    public EAttribute getInsert_SchemaName() {
        return (EAttribute) insertEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getInsert_TableName() {
        return (EAttribute) insertEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getInsert_ColumnNames() {
        return (EAttribute) insertEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EReference getInsert_Values() {
        return (EReference) insertEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EReference getInsert_Select() {
        return (EReference) insertEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EClass getUpdate() {
        return updateEClass;
    }

    @Override
    public EAttribute getUpdate_SchemaName() {
        return (EAttribute) updateEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getUpdate_TableName() {
        return (EAttribute) updateEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EReference getUpdate_Sets() {
        return (EReference) updateEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EReference getUpdate_Where() {
        return (EReference) updateEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EClass getSetClause() {
        return setClauseEClass;
    }

    @Override
    public EAttribute getSetClause_ColumnName() {
        return (EAttribute) setClauseEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EReference getSetClause_Value() {
        return (EReference) setClauseEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EClass getDelete() {
        return deleteEClass;
    }

    @Override
    public EAttribute getDelete_SchemaName() {
        return (EAttribute) deleteEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getDelete_TableName() {
        return (EAttribute) deleteEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EReference getDelete_Where() {
        return (EReference) deleteEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getColumnDefinition() {
        return columnDefinitionEClass;
    }

    @Override
    public EAttribute getColumnDefinition_Name() {
        return (EAttribute) columnDefinitionEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getColumnDefinition_DataType() {
        return (EAttribute) columnDefinitionEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getColumnDefinition_Nullable() {
        return (EAttribute) columnDefinitionEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getColumnDefinition_DefaultValue() {
        return (EAttribute) columnDefinitionEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EAttribute getColumnDefinition_Identity() {
        return (EAttribute) columnDefinitionEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EAttribute getColumnDefinition_Computed() {
        return (EAttribute) columnDefinitionEClass.getEStructuralFeatures().get(5);
    }

    @Override
    public EAttribute getColumnDefinition_ComputedExpression() {
        return (EAttribute) columnDefinitionEClass.getEStructuralFeatures().get(6);
    }

    @Override
    public EReference getColumnDefinition_InlineConstraints() {
        return (EReference) columnDefinitionEClass.getEStructuralFeatures().get(7);
    }

    @Override
    public EClass getTableConstraint() {
        return tableConstraintEClass;
    }

    @Override
    public EAttribute getTableConstraint_Name() {
        return (EAttribute) tableConstraintEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EClass getPrimaryKeyConstraint() {
        return primaryKeyConstraintEClass;
    }

    @Override
    public EAttribute getPrimaryKeyConstraint_ColumnNames() {
        return (EAttribute) primaryKeyConstraintEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EClass getForeignKeyConstraint() {
        return foreignKeyConstraintEClass;
    }

    @Override
    public EAttribute getForeignKeyConstraint_ColumnNames() {
        return (EAttribute) foreignKeyConstraintEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getForeignKeyConstraint_ReferencedTable() {
        return (EAttribute) foreignKeyConstraintEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getForeignKeyConstraint_ReferencedSchema() {
        return (EAttribute) foreignKeyConstraintEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getForeignKeyConstraint_ReferencedColumns() {
        return (EAttribute) foreignKeyConstraintEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EAttribute getForeignKeyConstraint_OnDelete() {
        return (EAttribute) foreignKeyConstraintEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EAttribute getForeignKeyConstraint_OnUpdate() {
        return (EAttribute) foreignKeyConstraintEClass.getEStructuralFeatures().get(5);
    }

    @Override
    public EClass getUniqueConstraint() {
        return uniqueConstraintEClass;
    }

    @Override
    public EAttribute getUniqueConstraint_ColumnNames() {
        return (EAttribute) uniqueConstraintEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EClass getCheckConstraint() {
        return checkConstraintEClass;
    }

    @Override
    public EReference getCheckConstraint_Expression() {
        return (EReference) checkConstraintEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getCheckConstraint_ExpressionText() {
        return (EAttribute) checkConstraintEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EClass getSelectItem() {
        return selectItemEClass;
    }

    @Override
    public EReference getSelectItem_Expression() {
        return (EReference) selectItemEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getSelectItem_Alias() {
        return (EAttribute) selectItemEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getSelectItem_AllColumns() {
        return (EAttribute) selectItemEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getSelectItem_TableAlias() {
        return (EAttribute) selectItemEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EClass getFromItem() {
        return fromItemEClass;
    }

    @Override
    public EAttribute getFromItem_Alias() {
        return (EAttribute) fromItemEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EClass getTableReference() {
        return tableReferenceEClass;
    }

    @Override
    public EAttribute getTableReference_SchemaName() {
        return (EAttribute) tableReferenceEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getTableReference_TableName() {
        return (EAttribute) tableReferenceEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EClass getSubSelect() {
        return subSelectEClass;
    }

    @Override
    public EReference getSubSelect_Select() {
        return (EReference) subSelectEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EClass getJoin() {
        return joinEClass;
    }

    @Override
    public EAttribute getJoin_Type() {
        return (EAttribute) joinEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EReference getJoin_RightItem() {
        return (EReference) joinEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EReference getJoin_OnCondition() {
        return (EReference) joinEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getOrderByItem() {
        return orderByItemEClass;
    }

    @Override
    public EReference getOrderByItem_Expression() {
        return (EReference) orderByItemEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getOrderByItem_Direction() {
        return (EAttribute) orderByItemEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EClass getExpression() {
        return expressionEClass;
    }

    @Override
    public EClass getColumnReference() {
        return columnReferenceEClass;
    }

    @Override
    public EAttribute getColumnReference_TableName() {
        return (EAttribute) columnReferenceEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getColumnReference_SchemaName() {
        return (EAttribute) columnReferenceEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getColumnReference_ColumnName() {
        return (EAttribute) columnReferenceEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getLiteral() {
        return literalEClass;
    }

    @Override
    public EAttribute getLiteral_Value() {
        return (EAttribute) literalEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getLiteral_Type() {
        return (EAttribute) literalEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EClass getFunctionCall() {
        return functionCallEClass;
    }

    @Override
    public EAttribute getFunctionCall_Name() {
        return (EAttribute) functionCallEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getFunctionCall_SchemaName() {
        return (EAttribute) functionCallEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EReference getFunctionCall_Arguments() {
        return (EReference) functionCallEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EAttribute getFunctionCall_Distinct() {
        return (EAttribute) functionCallEClass.getEStructuralFeatures().get(3);
    }

    @Override
    public EAttribute getFunctionCall_AllColumns() {
        return (EAttribute) functionCallEClass.getEStructuralFeatures().get(4);
    }

    @Override
    public EClass getBinaryExpression() {
        return binaryExpressionEClass;
    }

    @Override
    public EReference getBinaryExpression_Left() {
        return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EReference getBinaryExpression_Right() {
        return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getBinaryExpression_Operator() {
        return (EAttribute) binaryExpressionEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getUnaryExpression() {
        return unaryExpressionEClass;
    }

    @Override
    public EReference getUnaryExpression_Operand() {
        return (EReference) unaryExpressionEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EAttribute getUnaryExpression_Operator() {
        return (EAttribute) unaryExpressionEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EAttribute getUnaryExpression_Prefix() {
        return (EAttribute) unaryExpressionEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getParenthesis() {
        return parenthesisEClass;
    }

    @Override
    public EReference getParenthesis_Expression() {
        return (EReference) parenthesisEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EClass getCaseExpression() {
        return caseExpressionEClass;
    }

    @Override
    public EReference getCaseExpression_SwitchExpression() {
        return (EReference) caseExpressionEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EReference getCaseExpression_WhenClauses() {
        return (EReference) caseExpressionEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EReference getCaseExpression_ElseExpression() {
        return (EReference) caseExpressionEClass.getEStructuralFeatures().get(2);
    }

    @Override
    public EClass getWhenClause() {
        return whenClauseEClass;
    }

    @Override
    public EReference getWhenClause_Condition() {
        return (EReference) whenClauseEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EReference getWhenClause_Result() {
        return (EReference) whenClauseEClass.getEStructuralFeatures().get(1);
    }

    @Override
    public EClass getAllColumns() {
        return allColumnsEClass;
    }

    @Override
    public EClass getExpressionList() {
        return expressionListEClass;
    }

    @Override
    public EReference getExpressionList_Expressions() {
        return (EReference) expressionListEClass.getEStructuralFeatures().get(0);
    }

    @Override
    public EEnum getJoinType() {
        return joinTypeEEnum;
    }

    @Override
    public EEnum getSortDirection() {
        return sortDirectionEEnum;
    }

    @Override
    public SqlAstFactory getSqlAstFactory() {
        return (SqlAstFactory) getEFactoryInstance();
    }

    public void createPackageContents() {
        if (isCreated) {
            return;
        }
        isCreated = true;
        sourceSpanEClass = createEClass(SOURCE_SPAN);
        createEAttribute(sourceSpanEClass, SOURCE_SPAN__START_LINE);
        createEAttribute(sourceSpanEClass, SOURCE_SPAN__START_COLUMN);
        createEAttribute(sourceSpanEClass, SOURCE_SPAN__END_LINE);
        createEAttribute(sourceSpanEClass, SOURCE_SPAN__END_COLUMN);
        createEAttribute(sourceSpanEClass, SOURCE_SPAN__START_OFFSET);
        createEAttribute(sourceSpanEClass, SOURCE_SPAN__END_OFFSET);
        astNodeEClass = createEClass(AST_NODE);
        createEReference(astNodeEClass, AST_NODE__SOURCE_SPAN);
        createEAttribute(astNodeEClass, AST_NODE__COMMENT);
        sqlScriptEClass = createEClass(SQL_SCRIPT);
        createEAttribute(sqlScriptEClass, SQL_SCRIPT__SOURCE_URI);
        createEAttribute(sqlScriptEClass, SQL_SCRIPT__DIALECT);
        createEReference(sqlScriptEClass, SQL_SCRIPT__STATEMENTS);
        createEAttribute(sqlScriptEClass, SQL_SCRIPT__LEADING_COMMENTS);
        statementEClass = createEClass(STATEMENT);
        createEAttribute(statementEClass, STATEMENT__RAW_SQL);
        unparsedStatementEClass = createEClass(UNPARSED_STATEMENT);
        createEAttribute(unparsedStatementEClass, UNPARSED_STATEMENT__ERROR_MESSAGE);
        createTableEClass = createEClass(CREATE_TABLE);
        createEAttribute(createTableEClass, CREATE_TABLE__SCHEMA_NAME);
        createEAttribute(createTableEClass, CREATE_TABLE__TABLE_NAME);
        createEAttribute(createTableEClass, CREATE_TABLE__IF_NOT_EXISTS);
        createEReference(createTableEClass, CREATE_TABLE__COLUMNS);
        createEReference(createTableEClass, CREATE_TABLE__CONSTRAINTS);
        alterTableEClass = createEClass(ALTER_TABLE);
        createEAttribute(alterTableEClass, ALTER_TABLE__SCHEMA_NAME);
        createEAttribute(alterTableEClass, ALTER_TABLE__TABLE_NAME);
        createEReference(alterTableEClass, ALTER_TABLE__OPERATIONS);
        alterOperationEClass = createEClass(ALTER_OPERATION);
        addColumnEClass = createEClass(ADD_COLUMN);
        createEReference(addColumnEClass, ADD_COLUMN__COLUMN);
        dropColumnEClass = createEClass(DROP_COLUMN);
        createEAttribute(dropColumnEClass, DROP_COLUMN__COLUMN_NAME);
        addConstraintEClass = createEClass(ADD_CONSTRAINT);
        createEReference(addConstraintEClass, ADD_CONSTRAINT__CONSTRAINT);
        dropTableEClass = createEClass(DROP_TABLE);
        createEAttribute(dropTableEClass, DROP_TABLE__SCHEMA_NAME);
        createEAttribute(dropTableEClass, DROP_TABLE__TABLE_NAME);
        createEAttribute(dropTableEClass, DROP_TABLE__IF_EXISTS);
        createViewEClass = createEClass(CREATE_VIEW);
        createEAttribute(createViewEClass, CREATE_VIEW__SCHEMA_NAME);
        createEAttribute(createViewEClass, CREATE_VIEW__VIEW_NAME);
        createEAttribute(createViewEClass, CREATE_VIEW__OR_REPLACE);
        createEReference(createViewEClass, CREATE_VIEW__QUERY);
        dropViewEClass = createEClass(DROP_VIEW);
        createEAttribute(dropViewEClass, DROP_VIEW__SCHEMA_NAME);
        createEAttribute(dropViewEClass, DROP_VIEW__VIEW_NAME);
        createEAttribute(dropViewEClass, DROP_VIEW__IF_EXISTS);
        createIndexEClass = createEClass(CREATE_INDEX);
        createEAttribute(createIndexEClass, CREATE_INDEX__INDEX_NAME);
        createEAttribute(createIndexEClass, CREATE_INDEX__SCHEMA_NAME);
        createEAttribute(createIndexEClass, CREATE_INDEX__TABLE_NAME);
        createEAttribute(createIndexEClass, CREATE_INDEX__UNIQUE);
        createEAttribute(createIndexEClass, CREATE_INDEX__COLUMN_NAMES);
        dropIndexEClass = createEClass(DROP_INDEX);
        createEAttribute(dropIndexEClass, DROP_INDEX__INDEX_NAME);
        createEAttribute(dropIndexEClass, DROP_INDEX__SCHEMA_NAME);
        createEAttribute(dropIndexEClass, DROP_INDEX__TABLE_NAME);
        selectEClass = createEClass(SELECT);
        createEAttribute(selectEClass, SELECT__DISTINCT);
        createEReference(selectEClass, SELECT__SELECT_ITEMS);
        createEReference(selectEClass, SELECT__FROM_ITEMS);
        createEReference(selectEClass, SELECT__JOINS);
        createEReference(selectEClass, SELECT__WHERE);
        createEReference(selectEClass, SELECT__GROUP_BY);
        createEReference(selectEClass, SELECT__HAVING);
        createEReference(selectEClass, SELECT__ORDER_BY);
        insertEClass = createEClass(INSERT);
        createEAttribute(insertEClass, INSERT__SCHEMA_NAME);
        createEAttribute(insertEClass, INSERT__TABLE_NAME);
        createEAttribute(insertEClass, INSERT__COLUMN_NAMES);
        createEReference(insertEClass, INSERT__VALUES);
        createEReference(insertEClass, INSERT__SELECT);
        updateEClass = createEClass(UPDATE);
        createEAttribute(updateEClass, UPDATE__SCHEMA_NAME);
        createEAttribute(updateEClass, UPDATE__TABLE_NAME);
        createEReference(updateEClass, UPDATE__SETS);
        createEReference(updateEClass, UPDATE__WHERE);
        setClauseEClass = createEClass(SET_CLAUSE);
        createEAttribute(setClauseEClass, SET_CLAUSE__COLUMN_NAME);
        createEReference(setClauseEClass, SET_CLAUSE__VALUE);
        deleteEClass = createEClass(DELETE);
        createEAttribute(deleteEClass, DELETE__SCHEMA_NAME);
        createEAttribute(deleteEClass, DELETE__TABLE_NAME);
        createEReference(deleteEClass, DELETE__WHERE);
        columnDefinitionEClass = createEClass(COLUMN_DEFINITION);
        createEAttribute(columnDefinitionEClass, COLUMN_DEFINITION__NAME);
        createEAttribute(columnDefinitionEClass, COLUMN_DEFINITION__DATA_TYPE);
        createEAttribute(columnDefinitionEClass, COLUMN_DEFINITION__NULLABLE);
        createEAttribute(columnDefinitionEClass, COLUMN_DEFINITION__DEFAULT_VALUE);
        createEAttribute(columnDefinitionEClass, COLUMN_DEFINITION__IDENTITY);
        createEAttribute(columnDefinitionEClass, COLUMN_DEFINITION__COMPUTED);
        createEAttribute(columnDefinitionEClass, COLUMN_DEFINITION__COMPUTED_EXPRESSION);
        createEReference(columnDefinitionEClass, COLUMN_DEFINITION__INLINE_CONSTRAINTS);
        tableConstraintEClass = createEClass(TABLE_CONSTRAINT);
        createEAttribute(tableConstraintEClass, TABLE_CONSTRAINT__NAME);
        primaryKeyConstraintEClass = createEClass(PRIMARY_KEY_CONSTRAINT);
        createEAttribute(primaryKeyConstraintEClass, PRIMARY_KEY_CONSTRAINT__COLUMN_NAMES);
        foreignKeyConstraintEClass = createEClass(FOREIGN_KEY_CONSTRAINT);
        createEAttribute(foreignKeyConstraintEClass, FOREIGN_KEY_CONSTRAINT__COLUMN_NAMES);
        createEAttribute(foreignKeyConstraintEClass, FOREIGN_KEY_CONSTRAINT__REFERENCED_TABLE);
        createEAttribute(foreignKeyConstraintEClass, FOREIGN_KEY_CONSTRAINT__REFERENCED_SCHEMA);
        createEAttribute(foreignKeyConstraintEClass, FOREIGN_KEY_CONSTRAINT__REFERENCED_COLUMNS);
        createEAttribute(foreignKeyConstraintEClass, FOREIGN_KEY_CONSTRAINT__ON_DELETE);
        createEAttribute(foreignKeyConstraintEClass, FOREIGN_KEY_CONSTRAINT__ON_UPDATE);
        uniqueConstraintEClass = createEClass(UNIQUE_CONSTRAINT);
        createEAttribute(uniqueConstraintEClass, UNIQUE_CONSTRAINT__COLUMN_NAMES);
        checkConstraintEClass = createEClass(CHECK_CONSTRAINT);
        createEReference(checkConstraintEClass, CHECK_CONSTRAINT__EXPRESSION);
        createEAttribute(checkConstraintEClass, CHECK_CONSTRAINT__EXPRESSION_TEXT);
        selectItemEClass = createEClass(SELECT_ITEM);
        createEReference(selectItemEClass, SELECT_ITEM__EXPRESSION);
        createEAttribute(selectItemEClass, SELECT_ITEM__ALIAS);
        createEAttribute(selectItemEClass, SELECT_ITEM__ALL_COLUMNS);
        createEAttribute(selectItemEClass, SELECT_ITEM__TABLE_ALIAS);
        fromItemEClass = createEClass(FROM_ITEM);
        createEAttribute(fromItemEClass, FROM_ITEM__ALIAS);
        tableReferenceEClass = createEClass(TABLE_REFERENCE);
        createEAttribute(tableReferenceEClass, TABLE_REFERENCE__SCHEMA_NAME);
        createEAttribute(tableReferenceEClass, TABLE_REFERENCE__TABLE_NAME);
        subSelectEClass = createEClass(SUB_SELECT);
        createEReference(subSelectEClass, SUB_SELECT__SELECT);
        joinEClass = createEClass(JOIN);
        createEAttribute(joinEClass, JOIN__TYPE);
        createEReference(joinEClass, JOIN__RIGHT_ITEM);
        createEReference(joinEClass, JOIN__ON_CONDITION);
        orderByItemEClass = createEClass(ORDER_BY_ITEM);
        createEReference(orderByItemEClass, ORDER_BY_ITEM__EXPRESSION);
        createEAttribute(orderByItemEClass, ORDER_BY_ITEM__DIRECTION);
        expressionEClass = createEClass(EXPRESSION);
        columnReferenceEClass = createEClass(COLUMN_REFERENCE);
        createEAttribute(columnReferenceEClass, COLUMN_REFERENCE__TABLE_NAME);
        createEAttribute(columnReferenceEClass, COLUMN_REFERENCE__SCHEMA_NAME);
        createEAttribute(columnReferenceEClass, COLUMN_REFERENCE__COLUMN_NAME);
        literalEClass = createEClass(LITERAL);
        createEAttribute(literalEClass, LITERAL__VALUE);
        createEAttribute(literalEClass, LITERAL__TYPE);
        functionCallEClass = createEClass(FUNCTION_CALL);
        createEAttribute(functionCallEClass, FUNCTION_CALL__NAME);
        createEAttribute(functionCallEClass, FUNCTION_CALL__SCHEMA_NAME);
        createEReference(functionCallEClass, FUNCTION_CALL__ARGUMENTS);
        createEAttribute(functionCallEClass, FUNCTION_CALL__DISTINCT);
        createEAttribute(functionCallEClass, FUNCTION_CALL__ALL_COLUMNS);
        binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
        createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
        createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);
        createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OPERATOR);
        unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
        createEReference(unaryExpressionEClass, UNARY_EXPRESSION__OPERAND);
        createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OPERATOR);
        createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__PREFIX);
        parenthesisEClass = createEClass(PARENTHESIS);
        createEReference(parenthesisEClass, PARENTHESIS__EXPRESSION);
        caseExpressionEClass = createEClass(CASE_EXPRESSION);
        createEReference(caseExpressionEClass, CASE_EXPRESSION__SWITCH_EXPRESSION);
        createEReference(caseExpressionEClass, CASE_EXPRESSION__WHEN_CLAUSES);
        createEReference(caseExpressionEClass, CASE_EXPRESSION__ELSE_EXPRESSION);
        whenClauseEClass = createEClass(WHEN_CLAUSE);
        createEReference(whenClauseEClass, WHEN_CLAUSE__CONDITION);
        createEReference(whenClauseEClass, WHEN_CLAUSE__RESULT);
        allColumnsEClass = createEClass(ALL_COLUMNS);
        expressionListEClass = createEClass(EXPRESSION_LIST);
        createEReference(expressionListEClass, EXPRESSION_LIST__EXPRESSIONS);
        joinTypeEEnum = createEEnum(JOIN_TYPE);
        sortDirectionEEnum = createEEnum(SORT_DIRECTION);
    }

    public void initializePackageContents() {
        if (isInitialized) {
            return;
        }
        isInitialized = true;

        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        getSqlScript().getESuperTypes().add(this.getAstNode());
        getStatement().getESuperTypes().add(this.getAstNode());
        getUnparsedStatement().getESuperTypes().add(this.getStatement());
        getCreateTable().getESuperTypes().add(this.getStatement());
        getAlterTable().getESuperTypes().add(this.getStatement());
        getAlterOperation().getESuperTypes().add(this.getAstNode());
        getAddColumn().getESuperTypes().add(this.getAlterOperation());
        getDropColumn().getESuperTypes().add(this.getAlterOperation());
        getAddConstraint().getESuperTypes().add(this.getAlterOperation());
        getDropTable().getESuperTypes().add(this.getStatement());
        getCreateView().getESuperTypes().add(this.getStatement());
        getDropView().getESuperTypes().add(this.getStatement());
        getCreateIndex().getESuperTypes().add(this.getStatement());
        getDropIndex().getESuperTypes().add(this.getStatement());
        getSelect().getESuperTypes().add(this.getStatement());
        getInsert().getESuperTypes().add(this.getStatement());
        getUpdate().getESuperTypes().add(this.getStatement());
        getSetClause().getESuperTypes().add(this.getAstNode());
        getDelete().getESuperTypes().add(this.getStatement());
        getColumnDefinition().getESuperTypes().add(this.getAstNode());
        getTableConstraint().getESuperTypes().add(this.getAstNode());
        getPrimaryKeyConstraint().getESuperTypes().add(this.getTableConstraint());
        getForeignKeyConstraint().getESuperTypes().add(this.getTableConstraint());
        getUniqueConstraint().getESuperTypes().add(this.getTableConstraint());
        getCheckConstraint().getESuperTypes().add(this.getTableConstraint());
        getSelectItem().getESuperTypes().add(this.getAstNode());
        getFromItem().getESuperTypes().add(this.getAstNode());
        getTableReference().getESuperTypes().add(this.getFromItem());
        getSubSelect().getESuperTypes().add(this.getFromItem());
        getJoin().getESuperTypes().add(this.getAstNode());
        getOrderByItem().getESuperTypes().add(this.getAstNode());
        getExpression().getESuperTypes().add(this.getAstNode());
        getColumnReference().getESuperTypes().add(this.getExpression());
        getLiteral().getESuperTypes().add(this.getExpression());
        getFunctionCall().getESuperTypes().add(this.getExpression());
        getBinaryExpression().getESuperTypes().add(this.getExpression());
        getUnaryExpression().getESuperTypes().add(this.getExpression());
        getParenthesis().getESuperTypes().add(this.getExpression());
        getCaseExpression().getESuperTypes().add(this.getExpression());
        getWhenClause().getESuperTypes().add(this.getAstNode());
        getAllColumns().getESuperTypes().add(this.getExpression());
        getExpressionList().getESuperTypes().add(this.getExpression());

        initEClass(sourceSpanEClass, SourceSpan.class, "SourceSpan", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSourceSpan_StartLine(), EcorePackage.eINSTANCE.getEInt(), "startLine", null, 0, 1, SourceSpan.class, false, false, true, false, false, false, true, false);
        initEAttribute(getSourceSpan_StartColumn(), EcorePackage.eINSTANCE.getEInt(), "startColumn", null, 0, 1, SourceSpan.class, false, false, true, false, false, false, true, false);
        initEAttribute(getSourceSpan_EndLine(), EcorePackage.eINSTANCE.getEInt(), "endLine", null, 0, 1, SourceSpan.class, false, false, true, false, false, false, true, false);
        initEAttribute(getSourceSpan_EndColumn(), EcorePackage.eINSTANCE.getEInt(), "endColumn", null, 0, 1, SourceSpan.class, false, false, true, false, false, false, true, false);
        initEAttribute(getSourceSpan_StartOffset(), EcorePackage.eINSTANCE.getEInt(), "startOffset", null, 0, 1, SourceSpan.class, false, false, true, false, false, false, true, false);
        initEAttribute(getSourceSpan_EndOffset(), EcorePackage.eINSTANCE.getEInt(), "endOffset", null, 0, 1, SourceSpan.class, false, false, true, false, false, false, true, false);

        initEClass(astNodeEClass, AstNode.class, "AstNode", true, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAstNode_SourceSpan(), this.getSourceSpan(), null, "sourceSpan", null, 0, 1, AstNode.class, false, false, true, false, false, true, true, false);
        initEAttribute(getAstNode_Comment(), EcorePackage.eINSTANCE.getEString(), "comment", null, 0, 1, AstNode.class, false, false, true, false, false, false, true, false);

        initEClass(sqlScriptEClass, SqlScript.class, "SqlScript", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSqlScript_SourceUri(), EcorePackage.eINSTANCE.getEString(), "sourceUri", null, 0, 1, SqlScript.class, false, false, true, false, false, false, true, false);
        initEAttribute(getSqlScript_Dialect(), EcorePackage.eINSTANCE.getEString(), "dialect", null, 0, 1, SqlScript.class, false, false, true, false, false, false, true, false);
        initEReference(getSqlScript_Statements(), this.getStatement(), null, "statements", null, 0, -1, SqlScript.class, false, false, true, false, false, true, true, false);
        initEAttribute(getSqlScript_LeadingComments(), EcorePackage.eINSTANCE.getEString(), "leadingComments", null, 0, -1, SqlScript.class, false, false, true, false, false, false, true, false);

        initEClass(statementEClass, Statement.class, "Statement", true, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStatement_RawSql(), EcorePackage.eINSTANCE.getEString(), "rawSql", null, 0, 1, Statement.class, false, false, true, false, false, false, true, false);

        initEClass(unparsedStatementEClass, UnparsedStatement.class, "UnparsedStatement", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getUnparsedStatement_ErrorMessage(), EcorePackage.eINSTANCE.getEString(), "errorMessage", null, 0, 1, UnparsedStatement.class, false, false, true, false, false, false, true, false);

        initEClass(createTableEClass, CreateTable.class, "CreateTable", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCreateTable_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, CreateTable.class, false, false, true, false, false, false, true, false);
        initEAttribute(getCreateTable_TableName(), EcorePackage.eINSTANCE.getEString(), "tableName", null, 0, 1, CreateTable.class, false, false, true, false, false, false, true, false);
        initEAttribute(getCreateTable_IfNotExists(), EcorePackage.eINSTANCE.getEBoolean(), "ifNotExists", null, 0, 1, CreateTable.class, false, false, true, false, false, false, true, false);
        initEReference(getCreateTable_Columns(), this.getColumnDefinition(), null, "columns", null, 0, -1, CreateTable.class, false, false, true, false, false, true, true, false);
        initEReference(getCreateTable_Constraints(), this.getTableConstraint(), null, "constraints", null, 0, -1, CreateTable.class, false, false, true, false, false, true, true, false);

        initEClass(alterTableEClass, AlterTable.class, "AlterTable", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAlterTable_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, AlterTable.class, false, false, true, false, false, false, true, false);
        initEAttribute(getAlterTable_TableName(), EcorePackage.eINSTANCE.getEString(), "tableName", null, 0, 1, AlterTable.class, false, false, true, false, false, false, true, false);
        initEReference(getAlterTable_Operations(), this.getAlterOperation(), null, "operations", null, 0, -1, AlterTable.class, false, false, true, false, false, true, true, false);

        initEClass(alterOperationEClass, AlterOperation.class, "AlterOperation", true, false, IS_GENERATED_INSTANCE_CLASS);

        initEClass(addColumnEClass, AddColumn.class, "AddColumn", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAddColumn_Column(), this.getColumnDefinition(), null, "column", null, 0, 1, AddColumn.class, false, false, true, false, false, true, true, false);

        initEClass(dropColumnEClass, DropColumn.class, "DropColumn", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDropColumn_ColumnName(), EcorePackage.eINSTANCE.getEString(), "columnName", null, 0, 1, DropColumn.class, false, false, true, false, false, false, true, false);

        initEClass(addConstraintEClass, AddConstraint.class, "AddConstraint", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAddConstraint_Constraint(), this.getTableConstraint(), null, "constraint", null, 0, 1, AddConstraint.class, false, false, true, false, false, true, true, false);

        initEClass(dropTableEClass, DropTable.class, "DropTable", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDropTable_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, DropTable.class, false, false, true, false, false, false, true, false);
        initEAttribute(getDropTable_TableName(), EcorePackage.eINSTANCE.getEString(), "tableName", null, 0, 1, DropTable.class, false, false, true, false, false, false, true, false);
        initEAttribute(getDropTable_IfExists(), EcorePackage.eINSTANCE.getEBoolean(), "ifExists", null, 0, 1, DropTable.class, false, false, true, false, false, false, true, false);

        initEClass(createViewEClass, CreateView.class, "CreateView", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCreateView_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, CreateView.class, false, false, true, false, false, false, true, false);
        initEAttribute(getCreateView_ViewName(), EcorePackage.eINSTANCE.getEString(), "viewName", null, 0, 1, CreateView.class, false, false, true, false, false, false, true, false);
        initEAttribute(getCreateView_OrReplace(), EcorePackage.eINSTANCE.getEBoolean(), "orReplace", null, 0, 1, CreateView.class, false, false, true, false, false, false, true, false);
        initEReference(getCreateView_Query(), this.getSelect(), null, "query", null, 0, 1, CreateView.class, false, false, true, false, false, true, true, false);

        initEClass(dropViewEClass, DropView.class, "DropView", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDropView_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, DropView.class, false, false, true, false, false, false, true, false);
        initEAttribute(getDropView_ViewName(), EcorePackage.eINSTANCE.getEString(), "viewName", null, 0, 1, DropView.class, false, false, true, false, false, false, true, false);
        initEAttribute(getDropView_IfExists(), EcorePackage.eINSTANCE.getEBoolean(), "ifExists", null, 0, 1, DropView.class, false, false, true, false, false, false, true, false);

        initEClass(createIndexEClass, CreateIndex.class, "CreateIndex", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCreateIndex_IndexName(), EcorePackage.eINSTANCE.getEString(), "indexName", null, 0, 1, CreateIndex.class, false, false, true, false, false, false, true, false);
        initEAttribute(getCreateIndex_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, CreateIndex.class, false, false, true, false, false, false, true, false);
        initEAttribute(getCreateIndex_TableName(), EcorePackage.eINSTANCE.getEString(), "tableName", null, 0, 1, CreateIndex.class, false, false, true, false, false, false, true, false);
        initEAttribute(getCreateIndex_Unique(), EcorePackage.eINSTANCE.getEBoolean(), "unique", null, 0, 1, CreateIndex.class, false, false, true, false, false, false, true, false);
        initEAttribute(getCreateIndex_ColumnNames(), EcorePackage.eINSTANCE.getEString(), "columnNames", null, 0, -1, CreateIndex.class, false, false, true, false, false, false, true, false);

        initEClass(dropIndexEClass, DropIndex.class, "DropIndex", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDropIndex_IndexName(), EcorePackage.eINSTANCE.getEString(), "indexName", null, 0, 1, DropIndex.class, false, false, true, false, false, false, true, false);
        initEAttribute(getDropIndex_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, DropIndex.class, false, false, true, false, false, false, true, false);
        initEAttribute(getDropIndex_TableName(), EcorePackage.eINSTANCE.getEString(), "tableName", null, 0, 1, DropIndex.class, false, false, true, false, false, false, true, false);

        initEClass(selectEClass, Select.class, "Select", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSelect_Distinct(), EcorePackage.eINSTANCE.getEBoolean(), "distinct", null, 0, 1, Select.class, false, false, true, false, false, false, true, false);
        initEReference(getSelect_SelectItems(), this.getSelectItem(), null, "selectItems", null, 0, -1, Select.class, false, false, true, false, false, true, true, false);
        initEReference(getSelect_FromItems(), this.getFromItem(), null, "fromItems", null, 0, -1, Select.class, false, false, true, false, false, true, true, false);
        initEReference(getSelect_Joins(), this.getJoin(), null, "joins", null, 0, -1, Select.class, false, false, true, false, false, true, true, false);
        initEReference(getSelect_Where(), this.getExpression(), null, "where", null, 0, 1, Select.class, false, false, true, false, false, true, true, false);
        initEReference(getSelect_GroupBy(), this.getExpression(), null, "groupBy", null, 0, -1, Select.class, false, false, true, false, false, true, true, false);
        initEReference(getSelect_Having(), this.getExpression(), null, "having", null, 0, 1, Select.class, false, false, true, false, false, true, true, false);
        initEReference(getSelect_OrderBy(), this.getOrderByItem(), null, "orderBy", null, 0, -1, Select.class, false, false, true, false, false, true, true, false);

        initEClass(insertEClass, Insert.class, "Insert", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInsert_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, Insert.class, false, false, true, false, false, false, true, false);
        initEAttribute(getInsert_TableName(), EcorePackage.eINSTANCE.getEString(), "tableName", null, 0, 1, Insert.class, false, false, true, false, false, false, true, false);
        initEAttribute(getInsert_ColumnNames(), EcorePackage.eINSTANCE.getEString(), "columnNames", null, 0, -1, Insert.class, false, false, true, false, false, false, true, false);
        initEReference(getInsert_Values(), this.getExpression(), null, "values", null, 0, -1, Insert.class, false, false, true, false, false, true, true, false);
        initEReference(getInsert_Select(), this.getSelect(), null, "select", null, 0, 1, Insert.class, false, false, true, false, false, true, true, false);

        initEClass(updateEClass, Update.class, "Update", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getUpdate_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, Update.class, false, false, true, false, false, false, true, false);
        initEAttribute(getUpdate_TableName(), EcorePackage.eINSTANCE.getEString(), "tableName", null, 0, 1, Update.class, false, false, true, false, false, false, true, false);
        initEReference(getUpdate_Sets(), this.getSetClause(), null, "sets", null, 0, -1, Update.class, false, false, true, false, false, true, true, false);
        initEReference(getUpdate_Where(), this.getExpression(), null, "where", null, 0, 1, Update.class, false, false, true, false, false, true, true, false);

        initEClass(setClauseEClass, SetClause.class, "SetClause", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSetClause_ColumnName(), EcorePackage.eINSTANCE.getEString(), "columnName", null, 0, 1, SetClause.class, false, false, true, false, false, false, true, false);
        initEReference(getSetClause_Value(), this.getExpression(), null, "value", null, 0, 1, SetClause.class, false, false, true, false, false, true, true, false);

        initEClass(deleteEClass, Delete.class, "Delete", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDelete_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, Delete.class, false, false, true, false, false, false, true, false);
        initEAttribute(getDelete_TableName(), EcorePackage.eINSTANCE.getEString(), "tableName", null, 0, 1, Delete.class, false, false, true, false, false, false, true, false);
        initEReference(getDelete_Where(), this.getExpression(), null, "where", null, 0, 1, Delete.class, false, false, true, false, false, true, true, false);

        initEClass(columnDefinitionEClass, ColumnDefinition.class, "ColumnDefinition", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getColumnDefinition_Name(), EcorePackage.eINSTANCE.getEString(), "name", null, 0, 1, ColumnDefinition.class, false, false, true, false, false, false, true, false);
        initEAttribute(getColumnDefinition_DataType(), EcorePackage.eINSTANCE.getEString(), "dataType", null, 0, 1, ColumnDefinition.class, false, false, true, false, false, false, true, false);
        initEAttribute(getColumnDefinition_Nullable(), EcorePackage.eINSTANCE.getEBooleanObject(), "nullable", null, 0, 1, ColumnDefinition.class, false, false, true, false, false, false, true, false);
        initEAttribute(getColumnDefinition_DefaultValue(), EcorePackage.eINSTANCE.getEString(), "defaultValue", null, 0, 1, ColumnDefinition.class, false, false, true, false, false, false, true, false);
        initEAttribute(getColumnDefinition_Identity(), EcorePackage.eINSTANCE.getEBoolean(), "identity", null, 0, 1, ColumnDefinition.class, false, false, true, false, false, false, true, false);
        initEAttribute(getColumnDefinition_Computed(), EcorePackage.eINSTANCE.getEBoolean(), "computed", null, 0, 1, ColumnDefinition.class, false, false, true, false, false, false, true, false);
        initEAttribute(getColumnDefinition_ComputedExpression(), EcorePackage.eINSTANCE.getEString(), "computedExpression", null, 0, 1, ColumnDefinition.class, false, false, true, false, false, false, true, false);
        initEReference(getColumnDefinition_InlineConstraints(), this.getTableConstraint(), null, "inlineConstraints", null, 0, -1, ColumnDefinition.class, false, false, true, false, false, true, true, false);

        initEClass(tableConstraintEClass, TableConstraint.class, "TableConstraint", true, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTableConstraint_Name(), EcorePackage.eINSTANCE.getEString(), "name", null, 0, 1, TableConstraint.class, false, false, true, false, false, false, true, false);

        initEClass(primaryKeyConstraintEClass, PrimaryKeyConstraint.class, "PrimaryKeyConstraint", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPrimaryKeyConstraint_ColumnNames(), EcorePackage.eINSTANCE.getEString(), "columnNames", null, 0, -1, PrimaryKeyConstraint.class, false, false, true, false, false, false, true, false);

        initEClass(foreignKeyConstraintEClass, ForeignKeyConstraint.class, "ForeignKeyConstraint", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getForeignKeyConstraint_ColumnNames(), EcorePackage.eINSTANCE.getEString(), "columnNames", null, 0, -1, ForeignKeyConstraint.class, false, false, true, false, false, false, true, false);
        initEAttribute(getForeignKeyConstraint_ReferencedTable(), EcorePackage.eINSTANCE.getEString(), "referencedTable", null, 0, 1, ForeignKeyConstraint.class, false, false, true, false, false, false, true, false);
        initEAttribute(getForeignKeyConstraint_ReferencedSchema(), EcorePackage.eINSTANCE.getEString(), "referencedSchema", null, 0, 1, ForeignKeyConstraint.class, false, false, true, false, false, false, true, false);
        initEAttribute(getForeignKeyConstraint_ReferencedColumns(), EcorePackage.eINSTANCE.getEString(), "referencedColumns", null, 0, -1, ForeignKeyConstraint.class, false, false, true, false, false, false, true, false);
        initEAttribute(getForeignKeyConstraint_OnDelete(), EcorePackage.eINSTANCE.getEString(), "onDelete", null, 0, 1, ForeignKeyConstraint.class, false, false, true, false, false, false, true, false);
        initEAttribute(getForeignKeyConstraint_OnUpdate(), EcorePackage.eINSTANCE.getEString(), "onUpdate", null, 0, 1, ForeignKeyConstraint.class, false, false, true, false, false, false, true, false);

        initEClass(uniqueConstraintEClass, UniqueConstraint.class, "UniqueConstraint", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getUniqueConstraint_ColumnNames(), EcorePackage.eINSTANCE.getEString(), "columnNames", null, 0, -1, UniqueConstraint.class, false, false, true, false, false, false, true, false);

        initEClass(checkConstraintEClass, CheckConstraint.class, "CheckConstraint", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCheckConstraint_Expression(), this.getExpression(), null, "expression", null, 0, 1, CheckConstraint.class, false, false, true, false, false, true, true, false);
        initEAttribute(getCheckConstraint_ExpressionText(), EcorePackage.eINSTANCE.getEString(), "expressionText", null, 0, 1, CheckConstraint.class, false, false, true, false, false, false, true, false);

        initEClass(selectItemEClass, SelectItem.class, "SelectItem", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSelectItem_Expression(), this.getExpression(), null, "expression", null, 0, 1, SelectItem.class, false, false, true, false, false, true, true, false);
        initEAttribute(getSelectItem_Alias(), EcorePackage.eINSTANCE.getEString(), "alias", null, 0, 1, SelectItem.class, false, false, true, false, false, false, true, false);
        initEAttribute(getSelectItem_AllColumns(), EcorePackage.eINSTANCE.getEBoolean(), "allColumns", null, 0, 1, SelectItem.class, false, false, true, false, false, false, true, false);
        initEAttribute(getSelectItem_TableAlias(), EcorePackage.eINSTANCE.getEString(), "tableAlias", null, 0, 1, SelectItem.class, false, false, true, false, false, false, true, false);

        initEClass(fromItemEClass, FromItem.class, "FromItem", true, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFromItem_Alias(), EcorePackage.eINSTANCE.getEString(), "alias", null, 0, 1, FromItem.class, false, false, true, false, false, false, true, false);

        initEClass(tableReferenceEClass, TableReference.class, "TableReference", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTableReference_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, TableReference.class, false, false, true, false, false, false, true, false);
        initEAttribute(getTableReference_TableName(), EcorePackage.eINSTANCE.getEString(), "tableName", null, 0, 1, TableReference.class, false, false, true, false, false, false, true, false);

        initEClass(subSelectEClass, SubSelect.class, "SubSelect", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSubSelect_Select(), this.getSelect(), null, "select", null, 0, 1, SubSelect.class, false, false, true, false, false, true, true, false);

        initEClass(joinEClass, Join.class, "Join", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getJoin_Type(), this.getJoinType(), "type", null, 0, 1, Join.class, false, false, true, false, false, false, true, false);
        initEReference(getJoin_RightItem(), this.getFromItem(), null, "rightItem", null, 0, 1, Join.class, false, false, true, false, false, true, true, false);
        initEReference(getJoin_OnCondition(), this.getExpression(), null, "onCondition", null, 0, 1, Join.class, false, false, true, false, false, true, true, false);

        initEClass(orderByItemEClass, OrderByItem.class, "OrderByItem", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOrderByItem_Expression(), this.getExpression(), null, "expression", null, 0, 1, OrderByItem.class, false, false, true, false, false, true, true, false);
        initEAttribute(getOrderByItem_Direction(), this.getSortDirection(), "direction", null, 0, 1, OrderByItem.class, false, false, true, false, false, false, true, false);

        initEClass(expressionEClass, Expression.class, "Expression", true, false, IS_GENERATED_INSTANCE_CLASS);

        initEClass(columnReferenceEClass, ColumnReference.class, "ColumnReference", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getColumnReference_TableName(), EcorePackage.eINSTANCE.getEString(), "tableName", null, 0, 1, ColumnReference.class, false, false, true, false, false, false, true, false);
        initEAttribute(getColumnReference_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, ColumnReference.class, false, false, true, false, false, false, true, false);
        initEAttribute(getColumnReference_ColumnName(), EcorePackage.eINSTANCE.getEString(), "columnName", null, 0, 1, ColumnReference.class, false, false, true, false, false, false, true, false);

        initEClass(literalEClass, Literal.class, "Literal", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLiteral_Value(), EcorePackage.eINSTANCE.getEString(), "value", null, 0, 1, Literal.class, false, false, true, false, false, false, true, false);
        initEAttribute(getLiteral_Type(), EcorePackage.eINSTANCE.getEString(), "type", null, 0, 1, Literal.class, false, false, true, false, false, false, true, false);

        initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFunctionCall_Name(), EcorePackage.eINSTANCE.getEString(), "name", null, 0, 1, FunctionCall.class, false, false, true, false, false, false, true, false);
        initEAttribute(getFunctionCall_SchemaName(), EcorePackage.eINSTANCE.getEString(), "schemaName", null, 0, 1, FunctionCall.class, false, false, true, false, false, false, true, false);
        initEReference(getFunctionCall_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, FunctionCall.class, false, false, true, false, false, true, true, false);
        initEAttribute(getFunctionCall_Distinct(), EcorePackage.eINSTANCE.getEBoolean(), "distinct", null, 0, 1, FunctionCall.class, false, false, true, false, false, false, true, false);
        initEAttribute(getFunctionCall_AllColumns(), EcorePackage.eINSTANCE.getEBoolean(), "allColumns", null, 0, 1, FunctionCall.class, false, false, true, false, false, false, true, false);

        initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBinaryExpression_Left(), this.getExpression(), null, "left", null, 0, 1, BinaryExpression.class, false, false, true, false, false, true, true, false);
        initEReference(getBinaryExpression_Right(), this.getExpression(), null, "right", null, 0, 1, BinaryExpression.class, false, false, true, false, false, true, true, false);
        initEAttribute(getBinaryExpression_Operator(), EcorePackage.eINSTANCE.getEString(), "operator", null, 0, 1, BinaryExpression.class, false, false, true, false, false, false, true, false);

        initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUnaryExpression_Operand(), this.getExpression(), null, "operand", null, 0, 1, UnaryExpression.class, false, false, true, false, false, true, true, false);
        initEAttribute(getUnaryExpression_Operator(), EcorePackage.eINSTANCE.getEString(), "operator", null, 0, 1, UnaryExpression.class, false, false, true, false, false, false, true, false);
        initEAttribute(getUnaryExpression_Prefix(), EcorePackage.eINSTANCE.getEBoolean(), "prefix", null, 0, 1, UnaryExpression.class, false, false, true, false, false, false, true, false);

        initEClass(parenthesisEClass, Parenthesis.class, "Parenthesis", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getParenthesis_Expression(), this.getExpression(), null, "expression", null, 0, 1, Parenthesis.class, false, false, true, false, false, true, true, false);

        initEClass(caseExpressionEClass, CaseExpression.class, "CaseExpression", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCaseExpression_SwitchExpression(), this.getExpression(), null, "switchExpression", null, 0, 1, CaseExpression.class, false, false, true, false, false, true, true, false);
        initEReference(getCaseExpression_WhenClauses(), this.getWhenClause(), null, "whenClauses", null, 0, -1, CaseExpression.class, false, false, true, false, false, true, true, false);
        initEReference(getCaseExpression_ElseExpression(), this.getExpression(), null, "elseExpression", null, 0, 1, CaseExpression.class, false, false, true, false, false, true, true, false);

        initEClass(whenClauseEClass, WhenClause.class, "WhenClause", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getWhenClause_Condition(), this.getExpression(), null, "condition", null, 0, 1, WhenClause.class, false, false, true, false, false, true, true, false);
        initEReference(getWhenClause_Result(), this.getExpression(), null, "result", null, 0, 1, WhenClause.class, false, false, true, false, false, true, true, false);

        initEClass(allColumnsEClass, AllColumns.class, "AllColumns", false, false, IS_GENERATED_INSTANCE_CLASS);

        initEClass(expressionListEClass, ExpressionList.class, "ExpressionList", false, false, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExpressionList_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, ExpressionList.class, false, false, true, false, false, true, true, false);

        initEEnum(joinTypeEEnum, JoinType.class, "JoinType");
        addEEnumLiteral(joinTypeEEnum, JoinType.INNER);
        addEEnumLiteral(joinTypeEEnum, JoinType.LEFT);
        addEEnumLiteral(joinTypeEEnum, JoinType.RIGHT);
        addEEnumLiteral(joinTypeEEnum, JoinType.FULL);
        addEEnumLiteral(joinTypeEEnum, JoinType.CROSS);
        addEEnumLiteral(joinTypeEEnum, JoinType.NATURAL);

        initEEnum(sortDirectionEEnum, SortDirection.class, "SortDirection");
        addEEnumLiteral(sortDirectionEEnum, SortDirection.ASC);
        addEEnumLiteral(sortDirectionEEnum, SortDirection.DESC);

        createResource(eNS_URI);
    }
}
