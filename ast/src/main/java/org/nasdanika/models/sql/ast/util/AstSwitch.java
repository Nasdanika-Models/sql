/**
 */
package org.nasdanika.models.sql.ast.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.sql.ast.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.sql.ast.AstPackage
 * @generated
 */
public class AstSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AstPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstSwitch() {
		if (modelPackage == null) {
			modelPackage = AstPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AstPackage.SOURCE_SPAN: {
				SourceSpan sourceSpan = (SourceSpan)theEObject;
				T result = caseSourceSpan(sourceSpan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.AST_NODE: {
				AstNode astNode = (AstNode)theEObject;
				T result = caseAstNode(astNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.SQL_SCRIPT: {
				SqlScript sqlScript = (SqlScript)theEObject;
				T result = caseSqlScript(sqlScript);
				if (result == null) result = caseAstNode(sqlScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseAstNode(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.UNPARSED_STATEMENT: {
				UnparsedStatement unparsedStatement = (UnparsedStatement)theEObject;
				T result = caseUnparsedStatement(unparsedStatement);
				if (result == null) result = caseStatement(unparsedStatement);
				if (result == null) result = caseAstNode(unparsedStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.CREATE_TABLE: {
				CreateTable createTable = (CreateTable)theEObject;
				T result = caseCreateTable(createTable);
				if (result == null) result = caseStatement(createTable);
				if (result == null) result = caseAstNode(createTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.ALTER_TABLE: {
				AlterTable alterTable = (AlterTable)theEObject;
				T result = caseAlterTable(alterTable);
				if (result == null) result = caseStatement(alterTable);
				if (result == null) result = caseAstNode(alterTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.ALTER_OPERATION: {
				AlterOperation alterOperation = (AlterOperation)theEObject;
				T result = caseAlterOperation(alterOperation);
				if (result == null) result = caseAstNode(alterOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.ADD_COLUMN: {
				AddColumn addColumn = (AddColumn)theEObject;
				T result = caseAddColumn(addColumn);
				if (result == null) result = caseAlterOperation(addColumn);
				if (result == null) result = caseAstNode(addColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.DROP_COLUMN: {
				DropColumn dropColumn = (DropColumn)theEObject;
				T result = caseDropColumn(dropColumn);
				if (result == null) result = caseAlterOperation(dropColumn);
				if (result == null) result = caseAstNode(dropColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.ADD_CONSTRAINT: {
				AddConstraint addConstraint = (AddConstraint)theEObject;
				T result = caseAddConstraint(addConstraint);
				if (result == null) result = caseAlterOperation(addConstraint);
				if (result == null) result = caseAstNode(addConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.DROP_TABLE: {
				DropTable dropTable = (DropTable)theEObject;
				T result = caseDropTable(dropTable);
				if (result == null) result = caseStatement(dropTable);
				if (result == null) result = caseAstNode(dropTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.CREATE_VIEW: {
				CreateView createView = (CreateView)theEObject;
				T result = caseCreateView(createView);
				if (result == null) result = caseStatement(createView);
				if (result == null) result = caseAstNode(createView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.DROP_VIEW: {
				DropView dropView = (DropView)theEObject;
				T result = caseDropView(dropView);
				if (result == null) result = caseStatement(dropView);
				if (result == null) result = caseAstNode(dropView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.CREATE_INDEX: {
				CreateIndex createIndex = (CreateIndex)theEObject;
				T result = caseCreateIndex(createIndex);
				if (result == null) result = caseStatement(createIndex);
				if (result == null) result = caseAstNode(createIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.DROP_INDEX: {
				DropIndex dropIndex = (DropIndex)theEObject;
				T result = caseDropIndex(dropIndex);
				if (result == null) result = caseStatement(dropIndex);
				if (result == null) result = caseAstNode(dropIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.SELECT: {
				Select select = (Select)theEObject;
				T result = caseSelect(select);
				if (result == null) result = caseStatement(select);
				if (result == null) result = caseAstNode(select);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.INSERT: {
				Insert insert = (Insert)theEObject;
				T result = caseInsert(insert);
				if (result == null) result = caseStatement(insert);
				if (result == null) result = caseAstNode(insert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.UPDATE: {
				Update update = (Update)theEObject;
				T result = caseUpdate(update);
				if (result == null) result = caseStatement(update);
				if (result == null) result = caseAstNode(update);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.SET_CLAUSE: {
				SetClause setClause = (SetClause)theEObject;
				T result = caseSetClause(setClause);
				if (result == null) result = caseAstNode(setClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseStatement(delete);
				if (result == null) result = caseAstNode(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.COLUMN_DEFINITION: {
				ColumnDefinition columnDefinition = (ColumnDefinition)theEObject;
				T result = caseColumnDefinition(columnDefinition);
				if (result == null) result = caseAstNode(columnDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.TABLE_CONSTRAINT: {
				TableConstraint tableConstraint = (TableConstraint)theEObject;
				T result = caseTableConstraint(tableConstraint);
				if (result == null) result = caseAstNode(tableConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.PRIMARY_KEY_CONSTRAINT: {
				PrimaryKeyConstraint primaryKeyConstraint = (PrimaryKeyConstraint)theEObject;
				T result = casePrimaryKeyConstraint(primaryKeyConstraint);
				if (result == null) result = caseTableConstraint(primaryKeyConstraint);
				if (result == null) result = caseAstNode(primaryKeyConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.FOREIGN_KEY_CONSTRAINT: {
				ForeignKeyConstraint foreignKeyConstraint = (ForeignKeyConstraint)theEObject;
				T result = caseForeignKeyConstraint(foreignKeyConstraint);
				if (result == null) result = caseTableConstraint(foreignKeyConstraint);
				if (result == null) result = caseAstNode(foreignKeyConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.UNIQUE_CONSTRAINT: {
				UniqueConstraint uniqueConstraint = (UniqueConstraint)theEObject;
				T result = caseUniqueConstraint(uniqueConstraint);
				if (result == null) result = caseTableConstraint(uniqueConstraint);
				if (result == null) result = caseAstNode(uniqueConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.CHECK_CONSTRAINT: {
				CheckConstraint checkConstraint = (CheckConstraint)theEObject;
				T result = caseCheckConstraint(checkConstraint);
				if (result == null) result = caseTableConstraint(checkConstraint);
				if (result == null) result = caseAstNode(checkConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.SELECT_ITEM: {
				SelectItem selectItem = (SelectItem)theEObject;
				T result = caseSelectItem(selectItem);
				if (result == null) result = caseAstNode(selectItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.FROM_ITEM: {
				FromItem fromItem = (FromItem)theEObject;
				T result = caseFromItem(fromItem);
				if (result == null) result = caseAstNode(fromItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.TABLE_REFERENCE: {
				TableReference tableReference = (TableReference)theEObject;
				T result = caseTableReference(tableReference);
				if (result == null) result = caseFromItem(tableReference);
				if (result == null) result = caseAstNode(tableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.SUB_SELECT: {
				SubSelect subSelect = (SubSelect)theEObject;
				T result = caseSubSelect(subSelect);
				if (result == null) result = caseFromItem(subSelect);
				if (result == null) result = caseAstNode(subSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseAstNode(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.ORDER_BY_ITEM: {
				OrderByItem orderByItem = (OrderByItem)theEObject;
				T result = caseOrderByItem(orderByItem);
				if (result == null) result = caseAstNode(orderByItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseAstNode(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.COLUMN_REFERENCE: {
				ColumnReference columnReference = (ColumnReference)theEObject;
				T result = caseColumnReference(columnReference);
				if (result == null) result = caseExpression(columnReference);
				if (result == null) result = caseAstNode(columnReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseExpression(literal);
				if (result == null) result = caseAstNode(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.FUNCTION_CALL: {
				FunctionCall functionCall = (FunctionCall)theEObject;
				T result = caseFunctionCall(functionCall);
				if (result == null) result = caseExpression(functionCall);
				if (result == null) result = caseAstNode(functionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = caseAstNode(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseAstNode(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.PARENTHESIS: {
				Parenthesis parenthesis = (Parenthesis)theEObject;
				T result = caseParenthesis(parenthesis);
				if (result == null) result = caseExpression(parenthesis);
				if (result == null) result = caseAstNode(parenthesis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.CASE_EXPRESSION: {
				CaseExpression caseExpression = (CaseExpression)theEObject;
				T result = caseCaseExpression(caseExpression);
				if (result == null) result = caseExpression(caseExpression);
				if (result == null) result = caseAstNode(caseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.WHEN_CLAUSE: {
				WhenClause whenClause = (WhenClause)theEObject;
				T result = caseWhenClause(whenClause);
				if (result == null) result = caseAstNode(whenClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.ALL_COLUMNS: {
				AllColumns allColumns = (AllColumns)theEObject;
				T result = caseAllColumns(allColumns);
				if (result == null) result = caseExpression(allColumns);
				if (result == null) result = caseAstNode(allColumns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.EXPRESSION_LIST: {
				ExpressionList expressionList = (ExpressionList)theEObject;
				T result = caseExpressionList(expressionList);
				if (result == null) result = caseExpression(expressionList);
				if (result == null) result = caseAstNode(expressionList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Span</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Span</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceSpan(SourceSpan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAstNode(AstNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sql Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sql Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSqlScript(SqlScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unparsed Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unparsed Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnparsedStatement(UnparsedStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTable(CreateTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alter Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alter Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlterTable(AlterTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alter Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alter Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlterOperation(AlterOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddColumn(AddColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropColumn(DropColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddConstraint(AddConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropTable(DropTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateView(CreateView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropView(DropView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateIndex(CreateIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropIndex(DropIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelect(Select object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsert(Insert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdate(Update object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetClause(SetClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnDefinition(ColumnDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableConstraint(TableConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Key Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Key Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryKeyConstraint(PrimaryKeyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Key Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Key Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeignKeyConstraint(ForeignKeyConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueConstraint(UniqueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckConstraint(CheckConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectItem(SelectItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromItem(FromItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableReference(TableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSelect(SubSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order By Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order By Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderByItem(OrderByItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnReference(ColumnReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCall(FunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parenthesis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parenthesis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParenthesis(Parenthesis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseExpression(CaseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenClause(WhenClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Columns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Columns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllColumns(AllColumns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionList(ExpressionList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AstSwitch
