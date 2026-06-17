package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.nasdanika.models.sql.ast.*;

public class SqlAstFactoryImpl extends EFactoryImpl implements SqlAstFactory {
    public static SqlAstFactory init() {
        try {
            SqlAstFactory theSqlAstFactory = (SqlAstFactory) EPackage.Registry.INSTANCE.getEFactory(SqlAstPackage.eNS_URI);
            if (theSqlAstFactory != null) {
                return theSqlAstFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SqlAstFactoryImpl();
    }

    public SqlAstFactoryImpl() {
        super();
    }

    @Override
    public EObject create(EClass eClass) {
        return switch (eClass.getClassifierID()) {
            case SqlAstPackage.SOURCE_SPAN -> createSourceSpan();
            case SqlAstPackage.SQL_SCRIPT -> createSqlScript();
            case SqlAstPackage.UNPARSED_STATEMENT -> createUnparsedStatement();
            case SqlAstPackage.CREATE_TABLE -> createCreateTable();
            case SqlAstPackage.ALTER_TABLE -> createAlterTable();
            case SqlAstPackage.ADD_COLUMN -> createAddColumn();
            case SqlAstPackage.DROP_COLUMN -> createDropColumn();
            case SqlAstPackage.ADD_CONSTRAINT -> createAddConstraint();
            case SqlAstPackage.DROP_TABLE -> createDropTable();
            case SqlAstPackage.CREATE_VIEW -> createCreateView();
            case SqlAstPackage.DROP_VIEW -> createDropView();
            case SqlAstPackage.CREATE_INDEX -> createCreateIndex();
            case SqlAstPackage.DROP_INDEX -> createDropIndex();
            case SqlAstPackage.SELECT -> createSelect();
            case SqlAstPackage.INSERT -> createInsert();
            case SqlAstPackage.UPDATE -> createUpdate();
            case SqlAstPackage.SET_CLAUSE -> createSetClause();
            case SqlAstPackage.DELETE -> createDelete();
            case SqlAstPackage.COLUMN_DEFINITION -> createColumnDefinition();
            case SqlAstPackage.PRIMARY_KEY_CONSTRAINT -> createPrimaryKeyConstraint();
            case SqlAstPackage.FOREIGN_KEY_CONSTRAINT -> createForeignKeyConstraint();
            case SqlAstPackage.UNIQUE_CONSTRAINT -> createUniqueConstraint();
            case SqlAstPackage.CHECK_CONSTRAINT -> createCheckConstraint();
            case SqlAstPackage.SELECT_ITEM -> createSelectItem();
            case SqlAstPackage.TABLE_REFERENCE -> createTableReference();
            case SqlAstPackage.SUB_SELECT -> createSubSelect();
            case SqlAstPackage.JOIN -> createJoin();
            case SqlAstPackage.ORDER_BY_ITEM -> createOrderByItem();
            case SqlAstPackage.COLUMN_REFERENCE -> createColumnReference();
            case SqlAstPackage.LITERAL -> createLiteral();
            case SqlAstPackage.FUNCTION_CALL -> createFunctionCall();
            case SqlAstPackage.BINARY_EXPRESSION -> createBinaryExpression();
            case SqlAstPackage.UNARY_EXPRESSION -> createUnaryExpression();
            case SqlAstPackage.PARENTHESIS -> createParenthesis();
            case SqlAstPackage.CASE_EXPRESSION -> createCaseExpression();
            case SqlAstPackage.WHEN_CLAUSE -> createWhenClause();
            case SqlAstPackage.ALL_COLUMNS -> createAllColumns();
            case SqlAstPackage.EXPRESSION_LIST -> createExpressionList();
            default -> throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        };
    }

    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        return switch (eDataType.getClassifierID()) {
            case SqlAstPackage.JOIN_TYPE -> createJoinTypeFromString(eDataType, initialValue);
            case SqlAstPackage.SORT_DIRECTION -> createSortDirectionFromString(eDataType, initialValue);
            default -> throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        };
    }

    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        return switch (eDataType.getClassifierID()) {
            case SqlAstPackage.JOIN_TYPE -> convertJoinTypeToString(eDataType, instanceValue);
            case SqlAstPackage.SORT_DIRECTION -> convertSortDirectionToString(eDataType, instanceValue);
            default -> throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        };
    }

    @Override
    public SourceSpan createSourceSpan() {
        return new SourceSpanImpl();
    }

    @Override
    public SqlScript createSqlScript() {
        return new SqlScriptImpl();
    }

    @Override
    public UnparsedStatement createUnparsedStatement() {
        return new UnparsedStatementImpl();
    }

    @Override
    public CreateTable createCreateTable() {
        return new CreateTableImpl();
    }

    @Override
    public AlterTable createAlterTable() {
        return new AlterTableImpl();
    }

    @Override
    public AddColumn createAddColumn() {
        return new AddColumnImpl();
    }

    @Override
    public DropColumn createDropColumn() {
        return new DropColumnImpl();
    }

    @Override
    public AddConstraint createAddConstraint() {
        return new AddConstraintImpl();
    }

    @Override
    public DropTable createDropTable() {
        return new DropTableImpl();
    }

    @Override
    public CreateView createCreateView() {
        return new CreateViewImpl();
    }

    @Override
    public DropView createDropView() {
        return new DropViewImpl();
    }

    @Override
    public CreateIndex createCreateIndex() {
        return new CreateIndexImpl();
    }

    @Override
    public DropIndex createDropIndex() {
        return new DropIndexImpl();
    }

    @Override
    public Select createSelect() {
        return new SelectImpl();
    }

    @Override
    public Insert createInsert() {
        return new InsertImpl();
    }

    @Override
    public Update createUpdate() {
        return new UpdateImpl();
    }

    @Override
    public SetClause createSetClause() {
        return new SetClauseImpl();
    }

    @Override
    public Delete createDelete() {
        return new DeleteImpl();
    }

    @Override
    public ColumnDefinition createColumnDefinition() {
        return new ColumnDefinitionImpl();
    }

    @Override
    public PrimaryKeyConstraint createPrimaryKeyConstraint() {
        return new PrimaryKeyConstraintImpl();
    }

    @Override
    public ForeignKeyConstraint createForeignKeyConstraint() {
        return new ForeignKeyConstraintImpl();
    }

    @Override
    public UniqueConstraint createUniqueConstraint() {
        return new UniqueConstraintImpl();
    }

    @Override
    public CheckConstraint createCheckConstraint() {
        return new CheckConstraintImpl();
    }

    @Override
    public SelectItem createSelectItem() {
        return new SelectItemImpl();
    }

    @Override
    public TableReference createTableReference() {
        return new TableReferenceImpl();
    }

    @Override
    public SubSelect createSubSelect() {
        return new SubSelectImpl();
    }

    @Override
    public Join createJoin() {
        return new JoinImpl();
    }

    @Override
    public OrderByItem createOrderByItem() {
        return new OrderByItemImpl();
    }

    @Override
    public ColumnReference createColumnReference() {
        return new ColumnReferenceImpl();
    }

    @Override
    public Literal createLiteral() {
        return new LiteralImpl();
    }

    @Override
    public FunctionCall createFunctionCall() {
        return new FunctionCallImpl();
    }

    @Override
    public BinaryExpression createBinaryExpression() {
        return new BinaryExpressionImpl();
    }

    @Override
    public UnaryExpression createUnaryExpression() {
        return new UnaryExpressionImpl();
    }

    @Override
    public Parenthesis createParenthesis() {
        return new ParenthesisImpl();
    }

    @Override
    public CaseExpression createCaseExpression() {
        return new CaseExpressionImpl();
    }

    @Override
    public WhenClause createWhenClause() {
        return new WhenClauseImpl();
    }

    @Override
    public AllColumns createAllColumns() {
        return new AllColumnsImpl();
    }

    @Override
    public ExpressionList createExpressionList() {
        return new ExpressionListImpl();
    }

    public JoinType createJoinTypeFromString(EDataType eDataType, String initialValue) {
        JoinType result = JoinType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    public String convertJoinTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    public SortDirection createSortDirectionFromString(EDataType eDataType, String initialValue) {
        SortDirection result = SortDirection.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        }
        return result;
    }

    public String convertSortDirectionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    @Override
    public SqlAstPackage getSqlAstPackage() {
        return (SqlAstPackage) getEPackage();
    }

    @Deprecated
    public static SqlAstPackage getPackage() {
        return SqlAstPackage.eINSTANCE;
    }
}
