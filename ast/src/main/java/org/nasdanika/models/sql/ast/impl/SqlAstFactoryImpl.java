package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.nasdanika.models.sql.ast.*;

public class SqlAstFactoryImpl extends EFactoryImpl implements SqlAstFactory {

    public static SqlAstFactory init() {
        try {
            SqlAstFactory theFactory = (SqlAstFactory) EPackage.Registry.INSTANCE.getEFactory(SqlAstPackage.eNS_URI);
            if (theFactory != null) {
                return theFactory;
            }
        } catch (Exception e) {
            EcorePlugin.INSTANCE.log(e);
        }
        return new SqlAstFactoryImpl();
    }

    public SqlAstFactoryImpl() {
        super();
    }

    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case SqlAstPackage.SQL_SCRIPT: return createSqlScript();
            case SqlAstPackage.CREATE_TABLE: return createCreateTable();
            case SqlAstPackage.ALTER_TABLE: return createAlterTable();
            case SqlAstPackage.DROP_TABLE: return createDropTable();
            case SqlAstPackage.CREATE_VIEW: return createCreateView();
            case SqlAstPackage.DROP_VIEW: return createDropView();
            case SqlAstPackage.CREATE_INDEX: return createCreateIndex();
            case SqlAstPackage.DROP_INDEX: return createDropIndex();
            case SqlAstPackage.SELECT: return createSelect();
            case SqlAstPackage.INSERT: return createInsert();
            case SqlAstPackage.UPDATE: return createUpdate();
            case SqlAstPackage.DELETE: return createDelete();
            case SqlAstPackage.UNPARSED_STATEMENT: return createUnparsedStatement();
            case SqlAstPackage.COLUMN_DEFINITION: return createColumnDefinition();
            case SqlAstPackage.PRIMARY_KEY_CONSTRAINT: return createPrimaryKeyConstraint();
            case SqlAstPackage.FOREIGN_KEY_CONSTRAINT: return createForeignKeyConstraint();
            case SqlAstPackage.UNIQUE_CONSTRAINT: return createUniqueConstraint();
            case SqlAstPackage.CHECK_CONSTRAINT: return createCheckConstraint();
            case SqlAstPackage.ADD_COLUMN: return createAddColumn();
            case SqlAstPackage.DROP_COLUMN: return createDropColumn();
            case SqlAstPackage.ALTER_COLUMN: return createAlterColumn();
            case SqlAstPackage.ADD_CONSTRAINT: return createAddConstraint();
            case SqlAstPackage.DROP_CONSTRAINT: return createDropConstraint();
            case SqlAstPackage.SELECT_ITEM: return createSelectItem();
            case SqlAstPackage.TABLE_REFERENCE: return createTableReference();
            case SqlAstPackage.SUB_SELECT: return createSubSelect();
            case SqlAstPackage.JOIN: return createJoin();
            case SqlAstPackage.GROUP_BY_ELEMENT: return createGroupByElement();
            case SqlAstPackage.ORDER_BY_ELEMENT: return createOrderByElement();
            case SqlAstPackage.SET_CLAUSE: return createSetClause();
            case SqlAstPackage.INDEX_COLUMN: return createIndexColumn();
            case SqlAstPackage.COLUMN_REFERENCE: return createColumnReference();
            case SqlAstPackage.LITERAL: return createLiteral();
            case SqlAstPackage.FUNCTION_CALL: return createFunctionCall();
            case SqlAstPackage.BINARY_EXPRESSION: return createBinaryExpression();
            case SqlAstPackage.UNARY_EXPRESSION: return createUnaryExpression();
            case SqlAstPackage.PARENTHESIS: return createParenthesis();
            case SqlAstPackage.CASE_EXPRESSION: return createCaseExpression();
            case SqlAstPackage.WHEN_CLAUSE: return createWhenClause();
            case SqlAstPackage.ALL_COLUMNS: return createAllColumns();
            case SqlAstPackage.SUB_SELECT_EXPRESSION: return createSubSelectExpression();
            case SqlAstPackage.IN_EXPRESSION: return createInExpression();
            case SqlAstPackage.BETWEEN_EXPRESSION: return createBetweenExpression();
            case SqlAstPackage.IS_NULL_EXPRESSION: return createIsNullExpression();
            case SqlAstPackage.EXISTS_EXPRESSION: return createExistsExpression();
            case SqlAstPackage.CAST_EXPRESSION: return createCastExpression();
            case SqlAstPackage.EXPRESSION_LIST: return createExpressionList();
            default: throw new IllegalArgumentException("Unknown classifier ID: " + eClass.getClassifierID());
        }
    }

    @Override public SqlScript createSqlScript() { return new SqlScriptImpl(); }
    @Override public CreateTable createCreateTable() { return new CreateTableImpl(); }
    @Override public AlterTable createAlterTable() { return new AlterTableImpl(); }
    @Override public DropTable createDropTable() { return new DropTableImpl(); }
    @Override public CreateView createCreateView() { return new CreateViewImpl(); }
    @Override public DropView createDropView() { return new DropViewImpl(); }
    @Override public CreateIndex createCreateIndex() { return new CreateIndexImpl(); }
    @Override public DropIndex createDropIndex() { return new DropIndexImpl(); }
    @Override public Select createSelect() { return new SelectImpl(); }
    @Override public Insert createInsert() { return new InsertImpl(); }
    @Override public Update createUpdate() { return new UpdateImpl(); }
    @Override public Delete createDelete() { return new DeleteImpl(); }
    @Override public UnparsedStatement createUnparsedStatement() { return new UnparsedStatementImpl(); }
    @Override public ColumnDefinition createColumnDefinition() { return new ColumnDefinitionImpl(); }
    @Override public PrimaryKeyConstraint createPrimaryKeyConstraint() { return new PrimaryKeyConstraintImpl(); }
    @Override public ForeignKeyConstraint createForeignKeyConstraint() { return new ForeignKeyConstraintImpl(); }
    @Override public UniqueConstraint createUniqueConstraint() { return new UniqueConstraintImpl(); }
    @Override public CheckConstraint createCheckConstraint() { return new CheckConstraintImpl(); }
    @Override public AddColumn createAddColumn() { return new AddColumnImpl(); }
    @Override public DropColumn createDropColumn() { return new DropColumnImpl(); }
    @Override public AlterColumn createAlterColumn() { return new AlterColumnImpl(); }
    @Override public AddConstraint createAddConstraint() { return new AddConstraintImpl(); }
    @Override public DropConstraint createDropConstraint() { return new DropConstraintImpl(); }
    @Override public SelectItem createSelectItem() { return new SelectItemImpl(); }
    @Override public TableReference createTableReference() { return new TableReferenceImpl(); }
    @Override public SubSelect createSubSelect() { return new SubSelectImpl(); }
    @Override public Join createJoin() { return new JoinImpl(); }
    @Override public GroupByElement createGroupByElement() { return new GroupByElementImpl(); }
    @Override public OrderByElement createOrderByElement() { return new OrderByElementImpl(); }
    @Override public SetClause createSetClause() { return new SetClauseImpl(); }
    @Override public IndexColumn createIndexColumn() { return new IndexColumnImpl(); }
    @Override public ColumnReference createColumnReference() { return new ColumnReferenceImpl(); }
    @Override public Literal createLiteral() { return new LiteralImpl(); }
    @Override public FunctionCall createFunctionCall() { return new FunctionCallImpl(); }
    @Override public BinaryExpression createBinaryExpression() { return new BinaryExpressionImpl(); }
    @Override public UnaryExpression createUnaryExpression() { return new UnaryExpressionImpl(); }
    @Override public Parenthesis createParenthesis() { return new ParenthesisImpl(); }
    @Override public CaseExpression createCaseExpression() { return new CaseExpressionImpl(); }
    @Override public WhenClause createWhenClause() { return new WhenClauseImpl(); }
    @Override public AllColumns createAllColumns() { return new AllColumnsImpl(); }
    @Override public SubSelectExpression createSubSelectExpression() { return new SubSelectExpressionImpl(); }
    @Override public InExpression createInExpression() { return new InExpressionImpl(); }
    @Override public BetweenExpression createBetweenExpression() { return new BetweenExpressionImpl(); }
    @Override public IsNullExpression createIsNullExpression() { return new IsNullExpressionImpl(); }
    @Override public ExistsExpression createExistsExpression() { return new ExistsExpressionImpl(); }
    @Override public CastExpression createCastExpression() { return new CastExpressionImpl(); }
    @Override public ExpressionList createExpressionList() { return new ExpressionListImpl(); }

    @Override
    public SqlAstPackage getSqlAstPackage() {
        return getEPackage() instanceof SqlAstPackage ? (SqlAstPackage) getEPackage() : SqlAstPackage.eINSTANCE;
    }
}
