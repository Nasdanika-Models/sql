package org.nasdanika.models.sql.ast;

import org.eclipse.emf.ecore.EFactory;

/**
 * Factory for creating SQL AST model elements.
 */
public interface SqlAstFactory extends EFactory {

    SqlAstFactory eINSTANCE = org.nasdanika.models.sql.ast.impl.SqlAstFactoryImpl.init();

    SqlScript createSqlScript();
    CreateTable createCreateTable();
    AlterTable createAlterTable();
    DropTable createDropTable();
    CreateView createCreateView();
    DropView createDropView();
    CreateIndex createCreateIndex();
    DropIndex createDropIndex();
    Select createSelect();
    Insert createInsert();
    Update createUpdate();
    Delete createDelete();
    UnparsedStatement createUnparsedStatement();
    ColumnDefinition createColumnDefinition();
    PrimaryKeyConstraint createPrimaryKeyConstraint();
    ForeignKeyConstraint createForeignKeyConstraint();
    UniqueConstraint createUniqueConstraint();
    CheckConstraint createCheckConstraint();
    AddColumn createAddColumn();
    DropColumn createDropColumn();
    AlterColumn createAlterColumn();
    AddConstraint createAddConstraint();
    DropConstraint createDropConstraint();
    SelectItem createSelectItem();
    TableReference createTableReference();
    SubSelect createSubSelect();
    Join createJoin();
    GroupByElement createGroupByElement();
    OrderByElement createOrderByElement();
    SetClause createSetClause();
    IndexColumn createIndexColumn();
    ColumnReference createColumnReference();
    Literal createLiteral();
    FunctionCall createFunctionCall();
    BinaryExpression createBinaryExpression();
    UnaryExpression createUnaryExpression();
    Parenthesis createParenthesis();
    CaseExpression createCaseExpression();
    WhenClause createWhenClause();
    AllColumns createAllColumns();
    SubSelectExpression createSubSelectExpression();
    InExpression createInExpression();
    BetweenExpression createBetweenExpression();
    IsNullExpression createIsNullExpression();
    ExistsExpression createExistsExpression();
    CastExpression createCastExpression();
    ExpressionList createExpressionList();

    SqlAstPackage getSqlAstPackage();
}
