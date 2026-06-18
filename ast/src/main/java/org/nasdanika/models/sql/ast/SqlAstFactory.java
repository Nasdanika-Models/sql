package org.nasdanika.models.sql.ast;

import org.eclipse.emf.ecore.EFactory;

public interface SqlAstFactory extends EFactory {
    SqlAstFactory eINSTANCE = org.nasdanika.models.sql.ast.impl.SqlAstFactoryImpl.init();

    SourceSpan createSourceSpan();
    SqlScript createSqlScript();
    UnparsedStatement createUnparsedStatement();
    CreateTable createCreateTable();
    AlterTable createAlterTable();
    AddColumn createAddColumn();
    DropColumn createDropColumn();
    AddConstraint createAddConstraint();
    DropTable createDropTable();
    CreateView createCreateView();
    DropView createDropView();
    CreateIndex createCreateIndex();
    DropIndex createDropIndex();
    Select createSelect();
    Insert createInsert();
    Update createUpdate();
    SetClause createSetClause();
    Delete createDelete();
    ColumnDefinition createColumnDefinition();
    PrimaryKeyConstraint createPrimaryKeyConstraint();
    ForeignKeyConstraint createForeignKeyConstraint();
    UniqueConstraint createUniqueConstraint();
    CheckConstraint createCheckConstraint();
    SelectItem createSelectItem();
    TableReference createTableReference();
    SubSelect createSubSelect();
    Join createJoin();
    OrderByItem createOrderByItem();
    ColumnReference createColumnReference();
    Literal createLiteral();
    FunctionCall createFunctionCall();
    BinaryExpression createBinaryExpression();
    UnaryExpression createUnaryExpression();
    Parenthesis createParenthesis();
    CaseExpression createCaseExpression();
    WhenClause createWhenClause();
    AllColumns createAllColumns();
    ExpressionList createExpressionList();

    SqlAstPackage getSqlAstPackage();
}
