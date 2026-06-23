/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.sql.ast.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AstFactoryImpl extends EFactoryImpl implements AstFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AstFactory init() {
		try {
			AstFactory theAstFactory = (AstFactory)EPackage.Registry.INSTANCE.getEFactory(AstPackage.eNS_URI);
			if (theAstFactory != null) {
				return theAstFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AstFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AstPackage.SOURCE_SPAN: return createSourceSpan();
			case AstPackage.SQL_SCRIPT: return createSqlScript();
			case AstPackage.UNPARSED_STATEMENT: return createUnparsedStatement();
			case AstPackage.CREATE_TABLE: return createCreateTable();
			case AstPackage.ALTER_TABLE: return createAlterTable();
			case AstPackage.ADD_COLUMN: return createAddColumn();
			case AstPackage.DROP_COLUMN: return createDropColumn();
			case AstPackage.ADD_CONSTRAINT: return createAddConstraint();
			case AstPackage.DROP_TABLE: return createDropTable();
			case AstPackage.CREATE_VIEW: return createCreateView();
			case AstPackage.DROP_VIEW: return createDropView();
			case AstPackage.CREATE_INDEX: return createCreateIndex();
			case AstPackage.DROP_INDEX: return createDropIndex();
			case AstPackage.SELECT: return createSelect();
			case AstPackage.INSERT: return createInsert();
			case AstPackage.UPDATE: return createUpdate();
			case AstPackage.SET_CLAUSE: return createSetClause();
			case AstPackage.DELETE: return createDelete();
			case AstPackage.COLUMN_DEFINITION: return createColumnDefinition();
			case AstPackage.PRIMARY_KEY_CONSTRAINT: return createPrimaryKeyConstraint();
			case AstPackage.FOREIGN_KEY_CONSTRAINT: return createForeignKeyConstraint();
			case AstPackage.UNIQUE_CONSTRAINT: return createUniqueConstraint();
			case AstPackage.CHECK_CONSTRAINT: return createCheckConstraint();
			case AstPackage.SELECT_ITEM: return createSelectItem();
			case AstPackage.TABLE_REFERENCE: return createTableReference();
			case AstPackage.SUB_SELECT: return createSubSelect();
			case AstPackage.JOIN: return createJoin();
			case AstPackage.ORDER_BY_ITEM: return createOrderByItem();
			case AstPackage.COLUMN_REFERENCE: return createColumnReference();
			case AstPackage.LITERAL: return createLiteral();
			case AstPackage.FUNCTION_CALL: return createFunctionCall();
			case AstPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case AstPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case AstPackage.PARENTHESIS: return createParenthesis();
			case AstPackage.CASE_EXPRESSION: return createCaseExpression();
			case AstPackage.WHEN_CLAUSE: return createWhenClause();
			case AstPackage.ALL_COLUMNS: return createAllColumns();
			case AstPackage.EXPRESSION_LIST: return createExpressionList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AstPackage.JOIN_TYPE:
				return createJoinTypeFromString(eDataType, initialValue);
			case AstPackage.SORT_DIRECTION:
				return createSortDirectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AstPackage.JOIN_TYPE:
				return convertJoinTypeToString(eDataType, instanceValue);
			case AstPackage.SORT_DIRECTION:
				return convertSortDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceSpan createSourceSpan() {
		SourceSpanImpl sourceSpan = new SourceSpanImpl();
		return sourceSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqlScript createSqlScript() {
		SqlScriptImpl sqlScript = new SqlScriptImpl();
		return sqlScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnparsedStatement createUnparsedStatement() {
		UnparsedStatementImpl unparsedStatement = new UnparsedStatementImpl();
		return unparsedStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateTable createCreateTable() {
		CreateTableImpl createTable = new CreateTableImpl();
		return createTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlterTable createAlterTable() {
		AlterTableImpl alterTable = new AlterTableImpl();
		return alterTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddColumn createAddColumn() {
		AddColumnImpl addColumn = new AddColumnImpl();
		return addColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DropColumn createDropColumn() {
		DropColumnImpl dropColumn = new DropColumnImpl();
		return dropColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddConstraint createAddConstraint() {
		AddConstraintImpl addConstraint = new AddConstraintImpl();
		return addConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DropTable createDropTable() {
		DropTableImpl dropTable = new DropTableImpl();
		return dropTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateView createCreateView() {
		CreateViewImpl createView = new CreateViewImpl();
		return createView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DropView createDropView() {
		DropViewImpl dropView = new DropViewImpl();
		return dropView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateIndex createCreateIndex() {
		CreateIndexImpl createIndex = new CreateIndexImpl();
		return createIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DropIndex createDropIndex() {
		DropIndexImpl dropIndex = new DropIndexImpl();
		return dropIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Insert createInsert() {
		InsertImpl insert = new InsertImpl();
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Update createUpdate() {
		UpdateImpl update = new UpdateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetClause createSetClause() {
		SetClauseImpl setClause = new SetClauseImpl();
		return setClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnDefinition createColumnDefinition() {
		ColumnDefinitionImpl columnDefinition = new ColumnDefinitionImpl();
		return columnDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryKeyConstraint createPrimaryKeyConstraint() {
		PrimaryKeyConstraintImpl primaryKeyConstraint = new PrimaryKeyConstraintImpl();
		return primaryKeyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForeignKeyConstraint createForeignKeyConstraint() {
		ForeignKeyConstraintImpl foreignKeyConstraint = new ForeignKeyConstraintImpl();
		return foreignKeyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniqueConstraint createUniqueConstraint() {
		UniqueConstraintImpl uniqueConstraint = new UniqueConstraintImpl();
		return uniqueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckConstraint createCheckConstraint() {
		CheckConstraintImpl checkConstraint = new CheckConstraintImpl();
		return checkConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectItem createSelectItem() {
		SelectItemImpl selectItem = new SelectItemImpl();
		return selectItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableReference createTableReference() {
		TableReferenceImpl tableReference = new TableReferenceImpl();
		return tableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSelect createSubSelect() {
		SubSelectImpl subSelect = new SubSelectImpl();
		return subSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderByItem createOrderByItem() {
		OrderByItemImpl orderByItem = new OrderByItemImpl();
		return orderByItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnReference createColumnReference() {
		ColumnReferenceImpl columnReference = new ColumnReferenceImpl();
		return columnReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parenthesis createParenthesis() {
		ParenthesisImpl parenthesis = new ParenthesisImpl();
		return parenthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseExpression createCaseExpression() {
		CaseExpressionImpl caseExpression = new CaseExpressionImpl();
		return caseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenClause createWhenClause() {
		WhenClauseImpl whenClause = new WhenClauseImpl();
		return whenClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllColumns createAllColumns() {
		AllColumnsImpl allColumns = new AllColumnsImpl();
		return allColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionList createExpressionList() {
		ExpressionListImpl expressionList = new ExpressionListImpl();
		return expressionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinType createJoinTypeFromString(EDataType eDataType, String initialValue) {
		JoinType result = JoinType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJoinTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirection createSortDirectionFromString(EDataType eDataType, String initialValue) {
		SortDirection result = SortDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSortDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AstPackage getAstPackage() {
		return (AstPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AstPackage getPackage() {
		return AstPackage.eINSTANCE;
	}

} //AstFactoryImpl
