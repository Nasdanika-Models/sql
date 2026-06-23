/**
 */
package org.nasdanika.models.sql.ast;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.sql.ast.AstPackage
 * @generated
 */
public interface AstFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AstFactory eINSTANCE = org.nasdanika.models.sql.ast.impl.AstFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Source Span</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Span</em>'.
	 * @generated
	 */
	SourceSpan createSourceSpan();

	/**
	 * Returns a new object of class '<em>Sql Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sql Script</em>'.
	 * @generated
	 */
	SqlScript createSqlScript();

	/**
	 * Returns a new object of class '<em>Unparsed Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unparsed Statement</em>'.
	 * @generated
	 */
	UnparsedStatement createUnparsedStatement();

	/**
	 * Returns a new object of class '<em>Create Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Table</em>'.
	 * @generated
	 */
	CreateTable createCreateTable();

	/**
	 * Returns a new object of class '<em>Alter Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alter Table</em>'.
	 * @generated
	 */
	AlterTable createAlterTable();

	/**
	 * Returns a new object of class '<em>Add Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Column</em>'.
	 * @generated
	 */
	AddColumn createAddColumn();

	/**
	 * Returns a new object of class '<em>Drop Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Column</em>'.
	 * @generated
	 */
	DropColumn createDropColumn();

	/**
	 * Returns a new object of class '<em>Add Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Constraint</em>'.
	 * @generated
	 */
	AddConstraint createAddConstraint();

	/**
	 * Returns a new object of class '<em>Drop Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Table</em>'.
	 * @generated
	 */
	DropTable createDropTable();

	/**
	 * Returns a new object of class '<em>Create View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create View</em>'.
	 * @generated
	 */
	CreateView createCreateView();

	/**
	 * Returns a new object of class '<em>Drop View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop View</em>'.
	 * @generated
	 */
	DropView createDropView();

	/**
	 * Returns a new object of class '<em>Create Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Index</em>'.
	 * @generated
	 */
	CreateIndex createCreateIndex();

	/**
	 * Returns a new object of class '<em>Drop Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop Index</em>'.
	 * @generated
	 */
	DropIndex createDropIndex();

	/**
	 * Returns a new object of class '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select</em>'.
	 * @generated
	 */
	Select createSelect();

	/**
	 * Returns a new object of class '<em>Insert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert</em>'.
	 * @generated
	 */
	Insert createInsert();

	/**
	 * Returns a new object of class '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update</em>'.
	 * @generated
	 */
	Update createUpdate();

	/**
	 * Returns a new object of class '<em>Set Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Clause</em>'.
	 * @generated
	 */
	SetClause createSetClause();

	/**
	 * Returns a new object of class '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete</em>'.
	 * @generated
	 */
	Delete createDelete();

	/**
	 * Returns a new object of class '<em>Column Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Definition</em>'.
	 * @generated
	 */
	ColumnDefinition createColumnDefinition();

	/**
	 * Returns a new object of class '<em>Primary Key Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Key Constraint</em>'.
	 * @generated
	 */
	PrimaryKeyConstraint createPrimaryKeyConstraint();

	/**
	 * Returns a new object of class '<em>Foreign Key Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreign Key Constraint</em>'.
	 * @generated
	 */
	ForeignKeyConstraint createForeignKeyConstraint();

	/**
	 * Returns a new object of class '<em>Unique Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Constraint</em>'.
	 * @generated
	 */
	UniqueConstraint createUniqueConstraint();

	/**
	 * Returns a new object of class '<em>Check Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Constraint</em>'.
	 * @generated
	 */
	CheckConstraint createCheckConstraint();

	/**
	 * Returns a new object of class '<em>Select Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Item</em>'.
	 * @generated
	 */
	SelectItem createSelectItem();

	/**
	 * Returns a new object of class '<em>Table Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Reference</em>'.
	 * @generated
	 */
	TableReference createTableReference();

	/**
	 * Returns a new object of class '<em>Sub Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Select</em>'.
	 * @generated
	 */
	SubSelect createSubSelect();

	/**
	 * Returns a new object of class '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join</em>'.
	 * @generated
	 */
	Join createJoin();

	/**
	 * Returns a new object of class '<em>Order By Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order By Item</em>'.
	 * @generated
	 */
	OrderByItem createOrderByItem();

	/**
	 * Returns a new object of class '<em>Column Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Reference</em>'.
	 * @generated
	 */
	ColumnReference createColumnReference();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call</em>'.
	 * @generated
	 */
	FunctionCall createFunctionCall();

	/**
	 * Returns a new object of class '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expression</em>'.
	 * @generated
	 */
	BinaryExpression createBinaryExpression();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Parenthesis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parenthesis</em>'.
	 * @generated
	 */
	Parenthesis createParenthesis();

	/**
	 * Returns a new object of class '<em>Case Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Expression</em>'.
	 * @generated
	 */
	CaseExpression createCaseExpression();

	/**
	 * Returns a new object of class '<em>When Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Clause</em>'.
	 * @generated
	 */
	WhenClause createWhenClause();

	/**
	 * Returns a new object of class '<em>All Columns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Columns</em>'.
	 * @generated
	 */
	AllColumns createAllColumns();

	/**
	 * Returns a new object of class '<em>Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression List</em>'.
	 * @generated
	 */
	ExpressionList createExpressionList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AstPackage getAstPackage();

} //AstFactory
