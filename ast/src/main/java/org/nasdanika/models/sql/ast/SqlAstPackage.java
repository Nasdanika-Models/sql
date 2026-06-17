package org.nasdanika.models.sql.ast;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * The Package for the SQL AST model.
 */
public interface SqlAstPackage extends EPackage {

    String eNS_URI = "ecore://nasdanika.org/models/sql/ast";
    String eNS_PREFIX = "org.nasdanika.models.sql.ast";
    String eNAME = "ast";

    SqlAstPackage eINSTANCE = org.nasdanika.models.sql.ast.impl.SqlAstPackageImpl.init();

    // Class IDs
    int AST_NODE = 0;
    int SQL_SCRIPT = 1;
    int STATEMENT = 2;
    int CREATE_TABLE = 3;
    int ALTER_TABLE = 4;
    int DROP_TABLE = 5;
    int CREATE_VIEW = 6;
    int DROP_VIEW = 7;
    int CREATE_INDEX = 8;
    int DROP_INDEX = 9;
    int SELECT = 10;
    int INSERT = 11;
    int UPDATE = 12;
    int DELETE = 13;
    int UNPARSED_STATEMENT = 14;
    int COLUMN_DEFINITION = 15;
    int TABLE_CONSTRAINT = 16;
    int PRIMARY_KEY_CONSTRAINT = 17;
    int FOREIGN_KEY_CONSTRAINT = 18;
    int UNIQUE_CONSTRAINT = 19;
    int CHECK_CONSTRAINT = 20;
    int ALTER_OPERATION = 21;
    int ADD_COLUMN = 22;
    int DROP_COLUMN = 23;
    int ALTER_COLUMN = 24;
    int ADD_CONSTRAINT = 25;
    int DROP_CONSTRAINT = 26;
    int SELECT_ITEM = 27;
    int FROM_ITEM = 28;
    int TABLE_REFERENCE = 29;
    int SUB_SELECT = 30;
    int JOIN = 31;
    int GROUP_BY_ELEMENT = 32;
    int ORDER_BY_ELEMENT = 33;
    int SET_CLAUSE = 34;
    int INDEX_COLUMN = 35;
    int EXPRESSION = 36;
    int COLUMN_REFERENCE = 37;
    int LITERAL = 38;
    int FUNCTION_CALL = 39;
    int BINARY_EXPRESSION = 40;
    int UNARY_EXPRESSION = 41;
    int PARENTHESIS = 42;
    int CASE_EXPRESSION = 43;
    int WHEN_CLAUSE = 44;
    int ALL_COLUMNS = 45;
    int SUB_SELECT_EXPRESSION = 46;
    int IN_EXPRESSION = 47;
    int BETWEEN_EXPRESSION = 48;
    int IS_NULL_EXPRESSION = 49;
    int EXISTS_EXPRESSION = 50;
    int CAST_EXPRESSION = 51;
    int EXPRESSION_LIST = 52;

    // Accessors
    EClass getAstNode();
    EClass getSqlScript();
    EClass getStatement();
    EClass getCreateTable();
    EClass getAlterTable();
    EClass getDropTable();
    EClass getCreateView();
    EClass getDropView();
    EClass getCreateIndex();
    EClass getDropIndex();
    EClass getSelect();
    EClass getInsert();
    EClass getUpdate();
    EClass getDelete();
    EClass getUnparsedStatement();
    EClass getColumnDefinition();
    EClass getTableConstraint();
    EClass getPrimaryKeyConstraint();
    EClass getForeignKeyConstraint();
    EClass getUniqueConstraint();
    EClass getCheckConstraint();
    EClass getAlterOperation();
    EClass getAddColumn();
    EClass getDropColumn();
    EClass getAlterColumn();
    EClass getAddConstraint();
    EClass getDropConstraint();
    EClass getSelectItem();
    EClass getFromItem();
    EClass getTableReference();
    EClass getSubSelect();
    EClass getJoin();
    EClass getGroupByElement();
    EClass getOrderByElement();
    EClass getSetClause();
    EClass getIndexColumn();
    EClass getExpression();
    EClass getColumnReference();
    EClass getLiteral();
    EClass getFunctionCall();
    EClass getBinaryExpression();
    EClass getUnaryExpression();
    EClass getParenthesis();
    EClass getCaseExpression();
    EClass getWhenClause();
    EClass getAllColumns();
    EClass getSubSelectExpression();
    EClass getInExpression();
    EClass getBetweenExpression();
    EClass getIsNullExpression();
    EClass getExistsExpression();
    EClass getCastExpression();
    EClass getExpressionList();
    EEnum getJoinTypeEnum();
    EEnum getLiteralTypeEnum();
}
