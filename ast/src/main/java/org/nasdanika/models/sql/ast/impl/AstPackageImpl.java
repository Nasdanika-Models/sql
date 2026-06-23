/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.sql.ast.AddColumn;
import org.nasdanika.models.sql.ast.AddConstraint;
import org.nasdanika.models.sql.ast.AllColumns;
import org.nasdanika.models.sql.ast.AlterOperation;
import org.nasdanika.models.sql.ast.AlterTable;
import org.nasdanika.models.sql.ast.AstFactory;
import org.nasdanika.models.sql.ast.AstNode;
import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.BinaryExpression;
import org.nasdanika.models.sql.ast.CaseExpression;
import org.nasdanika.models.sql.ast.CheckConstraint;
import org.nasdanika.models.sql.ast.ColumnDefinition;
import org.nasdanika.models.sql.ast.ColumnReference;
import org.nasdanika.models.sql.ast.CreateIndex;
import org.nasdanika.models.sql.ast.CreateTable;
import org.nasdanika.models.sql.ast.CreateView;
import org.nasdanika.models.sql.ast.Delete;
import org.nasdanika.models.sql.ast.DropColumn;
import org.nasdanika.models.sql.ast.DropIndex;
import org.nasdanika.models.sql.ast.DropTable;
import org.nasdanika.models.sql.ast.DropView;
import org.nasdanika.models.sql.ast.Expression;
import org.nasdanika.models.sql.ast.ExpressionList;
import org.nasdanika.models.sql.ast.ForeignKeyConstraint;
import org.nasdanika.models.sql.ast.FromItem;
import org.nasdanika.models.sql.ast.FunctionCall;
import org.nasdanika.models.sql.ast.Insert;
import org.nasdanika.models.sql.ast.Join;
import org.nasdanika.models.sql.ast.JoinType;
import org.nasdanika.models.sql.ast.Literal;
import org.nasdanika.models.sql.ast.OrderByItem;
import org.nasdanika.models.sql.ast.Parenthesis;
import org.nasdanika.models.sql.ast.PrimaryKeyConstraint;
import org.nasdanika.models.sql.ast.Select;
import org.nasdanika.models.sql.ast.SelectItem;
import org.nasdanika.models.sql.ast.SetClause;
import org.nasdanika.models.sql.ast.SortDirection;
import org.nasdanika.models.sql.ast.SourceSpan;
import org.nasdanika.models.sql.ast.SqlScript;
import org.nasdanika.models.sql.ast.Statement;
import org.nasdanika.models.sql.ast.SubSelect;
import org.nasdanika.models.sql.ast.TableConstraint;
import org.nasdanika.models.sql.ast.TableReference;
import org.nasdanika.models.sql.ast.UnaryExpression;
import org.nasdanika.models.sql.ast.UniqueConstraint;
import org.nasdanika.models.sql.ast.UnparsedStatement;
import org.nasdanika.models.sql.ast.Update;
import org.nasdanika.models.sql.ast.WhenClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AstPackageImpl extends EPackageImpl implements AstPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceSpanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unparsedStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alterTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alterOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderByItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parenthesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whenClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allColumnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum joinTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sortDirectionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.sql.ast.AstPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AstPackageImpl() {
		super(eNS_URI, AstFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AstPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AstPackage init() {
		if (isInited) return (AstPackage)EPackage.Registry.INSTANCE.getEPackage(AstPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAstPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AstPackageImpl theAstPackage = registeredAstPackage instanceof AstPackageImpl ? (AstPackageImpl)registeredAstPackage : new AstPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAstPackage.createPackageContents();

		// Initialize created meta-data
		theAstPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAstPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AstPackage.eNS_URI, theAstPackage);
		return theAstPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceSpan() {
		return sourceSpanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceSpan_StartLine() {
		return (EAttribute)sourceSpanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceSpan_StartColumn() {
		return (EAttribute)sourceSpanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceSpan_EndLine() {
		return (EAttribute)sourceSpanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceSpan_EndColumn() {
		return (EAttribute)sourceSpanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceSpan_StartOffset() {
		return (EAttribute)sourceSpanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceSpan_EndOffset() {
		return (EAttribute)sourceSpanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAstNode() {
		return astNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAstNode_SourceSpan() {
		return (EReference)astNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAstNode_Comment() {
		return (EAttribute)astNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqlScript() {
		return sqlScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqlScript_SourceUri() {
		return (EAttribute)sqlScriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqlScript_Dialect() {
		return (EAttribute)sqlScriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqlScript_Statements() {
		return (EReference)sqlScriptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqlScript_LeadingComments() {
		return (EAttribute)sqlScriptEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatement_RawSql() {
		return (EAttribute)statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnparsedStatement() {
		return unparsedStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnparsedStatement_ErrorMessage() {
		return (EAttribute)unparsedStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateTable() {
		return createTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateTable_SchemaName() {
		return (EAttribute)createTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateTable_TableName() {
		return (EAttribute)createTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateTable_IfNotExists() {
		return (EAttribute)createTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreateTable_Columns() {
		return (EReference)createTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreateTable_Constraints() {
		return (EReference)createTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlterTable() {
		return alterTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlterTable_SchemaName() {
		return (EAttribute)alterTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlterTable_TableName() {
		return (EAttribute)alterTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlterTable_Operations() {
		return (EReference)alterTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlterOperation() {
		return alterOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddColumn() {
		return addColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddColumn_Column() {
		return (EReference)addColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDropColumn() {
		return dropColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropColumn_ColumnName() {
		return (EAttribute)dropColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddConstraint() {
		return addConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddConstraint_Constraint() {
		return (EReference)addConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDropTable() {
		return dropTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropTable_SchemaName() {
		return (EAttribute)dropTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropTable_TableName() {
		return (EAttribute)dropTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropTable_IfExists() {
		return (EAttribute)dropTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateView() {
		return createViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateView_SchemaName() {
		return (EAttribute)createViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateView_ViewName() {
		return (EAttribute)createViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateView_OrReplace() {
		return (EAttribute)createViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreateView_Query() {
		return (EReference)createViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDropView() {
		return dropViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropView_SchemaName() {
		return (EAttribute)dropViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropView_ViewName() {
		return (EAttribute)dropViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropView_IfExists() {
		return (EAttribute)dropViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateIndex() {
		return createIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateIndex_IndexName() {
		return (EAttribute)createIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateIndex_SchemaName() {
		return (EAttribute)createIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateIndex_TableName() {
		return (EAttribute)createIndexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateIndex_Unique() {
		return (EAttribute)createIndexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCreateIndex_ColumnNames() {
		return (EAttribute)createIndexEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDropIndex() {
		return dropIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropIndex_IndexName() {
		return (EAttribute)dropIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropIndex_SchemaName() {
		return (EAttribute)dropIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropIndex_TableName() {
		return (EAttribute)dropIndexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelect() {
		return selectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelect_Distinct() {
		return (EAttribute)selectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelect_SelectItems() {
		return (EReference)selectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelect_FromItems() {
		return (EReference)selectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelect_Joins() {
		return (EReference)selectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelect_Where() {
		return (EReference)selectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelect_GroupBy() {
		return (EReference)selectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelect_Having() {
		return (EReference)selectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelect_OrderBy() {
		return (EReference)selectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInsert() {
		return insertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsert_SchemaName() {
		return (EAttribute)insertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsert_TableName() {
		return (EAttribute)insertEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInsert_ColumnNames() {
		return (EAttribute)insertEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsert_Values() {
		return (EReference)insertEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInsert_Select() {
		return (EReference)insertEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpdate() {
		return updateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdate_SchemaName() {
		return (EAttribute)updateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpdate_TableName() {
		return (EAttribute)updateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdate_Sets() {
		return (EReference)updateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUpdate_Where() {
		return (EReference)updateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSetClause() {
		return setClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSetClause_ColumnName() {
		return (EAttribute)setClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSetClause_Value() {
		return (EReference)setClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelete_SchemaName() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelete_TableName() {
		return (EAttribute)deleteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelete_Where() {
		return (EReference)deleteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumnDefinition() {
		return columnDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnDefinition_Name() {
		return (EAttribute)columnDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnDefinition_DataType() {
		return (EAttribute)columnDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnDefinition_Nullable() {
		return (EAttribute)columnDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnDefinition_DefaultValue() {
		return (EAttribute)columnDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnDefinition_Identity() {
		return (EAttribute)columnDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnDefinition_Computed() {
		return (EAttribute)columnDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnDefinition_ComputedExpression() {
		return (EAttribute)columnDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColumnDefinition_InlineConstraints() {
		return (EReference)columnDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableConstraint() {
		return tableConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableConstraint_Name() {
		return (EAttribute)tableConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimaryKeyConstraint() {
		return primaryKeyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimaryKeyConstraint_ColumnNames() {
		return (EAttribute)primaryKeyConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForeignKeyConstraint() {
		return foreignKeyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForeignKeyConstraint_ColumnNames() {
		return (EAttribute)foreignKeyConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForeignKeyConstraint_ReferencedTable() {
		return (EAttribute)foreignKeyConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForeignKeyConstraint_ReferencedSchema() {
		return (EAttribute)foreignKeyConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForeignKeyConstraint_ReferencedColumns() {
		return (EAttribute)foreignKeyConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForeignKeyConstraint_OnDelete() {
		return (EAttribute)foreignKeyConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForeignKeyConstraint_OnUpdate() {
		return (EAttribute)foreignKeyConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniqueConstraint() {
		return uniqueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUniqueConstraint_ColumnNames() {
		return (EAttribute)uniqueConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckConstraint() {
		return checkConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckConstraint_Expression() {
		return (EReference)checkConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckConstraint_ExpressionText() {
		return (EAttribute)checkConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelectItem() {
		return selectItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelectItem_Expression() {
		return (EReference)selectItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectItem_Alias() {
		return (EAttribute)selectItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectItem_AllColumns() {
		return (EAttribute)selectItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelectItem_TableAlias() {
		return (EAttribute)selectItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFromItem() {
		return fromItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromItem_Alias() {
		return (EAttribute)fromItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableReference() {
		return tableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableReference_SchemaName() {
		return (EAttribute)tableReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableReference_TableName() {
		return (EAttribute)tableReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubSelect() {
		return subSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubSelect_Select() {
		return (EReference)subSelectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJoin_Type() {
		return (EAttribute)joinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJoin_RightItem() {
		return (EReference)joinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJoin_OnCondition() {
		return (EReference)joinEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderByItem() {
		return orderByItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderByItem_Expression() {
		return (EReference)orderByItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderByItem_Direction() {
		return (EAttribute)orderByItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumnReference() {
		return columnReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnReference_TableName() {
		return (EAttribute)columnReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnReference_SchemaName() {
		return (EAttribute)columnReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnReference_ColumnName() {
		return (EAttribute)columnReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteral_Value() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteral_Type() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionCall() {
		return functionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionCall_Name() {
		return (EAttribute)functionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionCall_SchemaName() {
		return (EAttribute)functionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionCall_Arguments() {
		return (EReference)functionCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionCall_Distinct() {
		return (EAttribute)functionCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionCall_AllColumns() {
		return (EAttribute)functionCallEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryExpression_Left() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryExpression_Right() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryExpression_Operator() {
		return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryExpression_Operand() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnaryExpression_Operator() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnaryExpression_Prefix() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParenthesis() {
		return parenthesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParenthesis_Expression() {
		return (EReference)parenthesisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCaseExpression() {
		return caseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseExpression_SwitchExpression() {
		return (EReference)caseExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseExpression_WhenClauses() {
		return (EReference)caseExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseExpression_ElseExpression() {
		return (EReference)caseExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhenClause() {
		return whenClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhenClause_Condition() {
		return (EReference)whenClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhenClause_Result() {
		return (EReference)whenClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllColumns() {
		return allColumnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionList() {
		return expressionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressionList_Expressions() {
		return (EReference)expressionListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJoinType() {
		return joinTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSortDirection() {
		return sortDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AstFactory getAstFactory() {
		return (AstFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
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

		// Create enums
		joinTypeEEnum = createEEnum(JOIN_TYPE);
		sortDirectionEEnum = createEEnum(SORT_DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sqlScriptEClass.getESuperTypes().add(this.getAstNode());
		statementEClass.getESuperTypes().add(this.getAstNode());
		unparsedStatementEClass.getESuperTypes().add(this.getStatement());
		createTableEClass.getESuperTypes().add(this.getStatement());
		alterTableEClass.getESuperTypes().add(this.getStatement());
		alterOperationEClass.getESuperTypes().add(this.getAstNode());
		addColumnEClass.getESuperTypes().add(this.getAlterOperation());
		dropColumnEClass.getESuperTypes().add(this.getAlterOperation());
		addConstraintEClass.getESuperTypes().add(this.getAlterOperation());
		dropTableEClass.getESuperTypes().add(this.getStatement());
		createViewEClass.getESuperTypes().add(this.getStatement());
		dropViewEClass.getESuperTypes().add(this.getStatement());
		createIndexEClass.getESuperTypes().add(this.getStatement());
		dropIndexEClass.getESuperTypes().add(this.getStatement());
		selectEClass.getESuperTypes().add(this.getStatement());
		insertEClass.getESuperTypes().add(this.getStatement());
		updateEClass.getESuperTypes().add(this.getStatement());
		setClauseEClass.getESuperTypes().add(this.getAstNode());
		deleteEClass.getESuperTypes().add(this.getStatement());
		columnDefinitionEClass.getESuperTypes().add(this.getAstNode());
		tableConstraintEClass.getESuperTypes().add(this.getAstNode());
		primaryKeyConstraintEClass.getESuperTypes().add(this.getTableConstraint());
		foreignKeyConstraintEClass.getESuperTypes().add(this.getTableConstraint());
		uniqueConstraintEClass.getESuperTypes().add(this.getTableConstraint());
		checkConstraintEClass.getESuperTypes().add(this.getTableConstraint());
		selectItemEClass.getESuperTypes().add(this.getAstNode());
		fromItemEClass.getESuperTypes().add(this.getAstNode());
		tableReferenceEClass.getESuperTypes().add(this.getFromItem());
		subSelectEClass.getESuperTypes().add(this.getFromItem());
		joinEClass.getESuperTypes().add(this.getAstNode());
		orderByItemEClass.getESuperTypes().add(this.getAstNode());
		expressionEClass.getESuperTypes().add(this.getAstNode());
		columnReferenceEClass.getESuperTypes().add(this.getExpression());
		literalEClass.getESuperTypes().add(this.getExpression());
		functionCallEClass.getESuperTypes().add(this.getExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		parenthesisEClass.getESuperTypes().add(this.getExpression());
		caseExpressionEClass.getESuperTypes().add(this.getExpression());
		whenClauseEClass.getESuperTypes().add(this.getAstNode());
		allColumnsEClass.getESuperTypes().add(this.getExpression());
		expressionListEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(sourceSpanEClass, SourceSpan.class, "SourceSpan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceSpan_StartLine(), ecorePackage.getEInt(), "startLine", null, 0, 1, SourceSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceSpan_StartColumn(), ecorePackage.getEInt(), "startColumn", null, 0, 1, SourceSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceSpan_EndLine(), ecorePackage.getEInt(), "endLine", null, 0, 1, SourceSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceSpan_EndColumn(), ecorePackage.getEInt(), "endColumn", null, 0, 1, SourceSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceSpan_StartOffset(), ecorePackage.getEInt(), "startOffset", null, 0, 1, SourceSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceSpan_EndOffset(), ecorePackage.getEInt(), "endOffset", null, 0, 1, SourceSpan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(astNodeEClass, AstNode.class, "AstNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAstNode_SourceSpan(), this.getSourceSpan(), null, "sourceSpan", null, 0, 1, AstNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAstNode_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, AstNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqlScriptEClass, SqlScript.class, "SqlScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqlScript_SourceUri(), ecorePackage.getEString(), "sourceUri", null, 0, 1, SqlScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqlScript_Dialect(), ecorePackage.getEString(), "dialect", null, 0, 1, SqlScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqlScript_Statements(), this.getStatement(), null, "statements", null, 0, -1, SqlScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqlScript_LeadingComments(), ecorePackage.getEString(), "leadingComments", null, 0, -1, SqlScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_RawSql(), ecorePackage.getEString(), "rawSql", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unparsedStatementEClass, UnparsedStatement.class, "UnparsedStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnparsedStatement_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 0, 1, UnparsedStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createTableEClass, CreateTable.class, "CreateTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateTable_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, CreateTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateTable_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, CreateTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateTable_IfNotExists(), ecorePackage.getEBoolean(), "ifNotExists", null, 0, 1, CreateTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateTable_Columns(), this.getColumnDefinition(), null, "columns", null, 0, -1, CreateTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateTable_Constraints(), this.getTableConstraint(), null, "constraints", null, 0, -1, CreateTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alterTableEClass, AlterTable.class, "AlterTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlterTable_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, AlterTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlterTable_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, AlterTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlterTable_Operations(), this.getAlterOperation(), null, "operations", null, 0, -1, AlterTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alterOperationEClass, AlterOperation.class, "AlterOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addColumnEClass, AddColumn.class, "AddColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddColumn_Column(), this.getColumnDefinition(), null, "column", null, 1, 1, AddColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropColumnEClass, DropColumn.class, "DropColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropColumn_ColumnName(), ecorePackage.getEString(), "columnName", null, 1, 1, DropColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addConstraintEClass, AddConstraint.class, "AddConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddConstraint_Constraint(), this.getTableConstraint(), null, "constraint", null, 1, 1, AddConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropTableEClass, DropTable.class, "DropTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropTable_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, DropTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropTable_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, DropTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropTable_IfExists(), ecorePackage.getEBoolean(), "ifExists", null, 0, 1, DropTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createViewEClass, CreateView.class, "CreateView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateView_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, CreateView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateView_ViewName(), ecorePackage.getEString(), "viewName", null, 1, 1, CreateView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateView_OrReplace(), ecorePackage.getEBoolean(), "orReplace", null, 0, 1, CreateView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateView_Query(), this.getSelect(), null, "query", null, 1, 1, CreateView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropViewEClass, DropView.class, "DropView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropView_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, DropView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropView_ViewName(), ecorePackage.getEString(), "viewName", null, 1, 1, DropView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropView_IfExists(), ecorePackage.getEBoolean(), "ifExists", null, 0, 1, DropView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createIndexEClass, CreateIndex.class, "CreateIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateIndex_IndexName(), ecorePackage.getEString(), "indexName", null, 1, 1, CreateIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateIndex_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, CreateIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateIndex_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, CreateIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateIndex_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, CreateIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateIndex_ColumnNames(), ecorePackage.getEString(), "columnNames", null, 0, -1, CreateIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropIndexEClass, DropIndex.class, "DropIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropIndex_IndexName(), ecorePackage.getEString(), "indexName", null, 1, 1, DropIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropIndex_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, DropIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropIndex_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, DropIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelect_Distinct(), ecorePackage.getEBoolean(), "distinct", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_SelectItems(), this.getSelectItem(), null, "selectItems", null, 0, -1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_FromItems(), this.getFromItem(), null, "fromItems", null, 0, -1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Joins(), this.getJoin(), null, "joins", null, 0, -1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Where(), this.getExpression(), null, "where", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_GroupBy(), this.getExpression(), null, "groupBy", null, 0, -1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Having(), this.getExpression(), null, "having", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_OrderBy(), this.getOrderByItem(), null, "orderBy", null, 0, -1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertEClass, Insert.class, "Insert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsert_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsert_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsert_ColumnNames(), ecorePackage.getEString(), "columnNames", null, 0, -1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsert_Values(), this.getExpression(), null, "values", null, 0, -1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsert_Select(), this.getSelect(), null, "select", null, 0, 1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateEClass, Update.class, "Update", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdate_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, Update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdate_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, Update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdate_Sets(), this.getSetClause(), null, "sets", null, 0, -1, Update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdate_Where(), this.getExpression(), null, "where", null, 0, 1, Update.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setClauseEClass, SetClause.class, "SetClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetClause_ColumnName(), ecorePackage.getEString(), "columnName", null, 1, 1, SetClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetClause_Value(), this.getExpression(), null, "value", null, 1, 1, SetClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelete_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelete_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelete_Where(), this.getExpression(), null, "where", null, 0, 1, Delete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnDefinitionEClass, ColumnDefinition.class, "ColumnDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, ColumnDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnDefinition_DataType(), ecorePackage.getEString(), "dataType", null, 1, 1, ColumnDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnDefinition_Nullable(), ecorePackage.getEBooleanObject(), "nullable", null, 0, 1, ColumnDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnDefinition_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, ColumnDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnDefinition_Identity(), ecorePackage.getEBoolean(), "identity", null, 0, 1, ColumnDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnDefinition_Computed(), ecorePackage.getEBoolean(), "computed", null, 0, 1, ColumnDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnDefinition_ComputedExpression(), ecorePackage.getEString(), "computedExpression", null, 0, 1, ColumnDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumnDefinition_InlineConstraints(), this.getTableConstraint(), null, "inlineConstraints", null, 0, -1, ColumnDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableConstraintEClass, TableConstraint.class, "TableConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, TableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyConstraintEClass, PrimaryKeyConstraint.class, "PrimaryKeyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimaryKeyConstraint_ColumnNames(), ecorePackage.getEString(), "columnNames", null, 0, -1, PrimaryKeyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreignKeyConstraintEClass, ForeignKeyConstraint.class, "ForeignKeyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForeignKeyConstraint_ColumnNames(), ecorePackage.getEString(), "columnNames", null, 0, -1, ForeignKeyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForeignKeyConstraint_ReferencedTable(), ecorePackage.getEString(), "referencedTable", null, 1, 1, ForeignKeyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForeignKeyConstraint_ReferencedSchema(), ecorePackage.getEString(), "referencedSchema", null, 0, 1, ForeignKeyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForeignKeyConstraint_ReferencedColumns(), ecorePackage.getEString(), "referencedColumns", null, 0, -1, ForeignKeyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForeignKeyConstraint_OnDelete(), ecorePackage.getEString(), "onDelete", null, 0, 1, ForeignKeyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForeignKeyConstraint_OnUpdate(), ecorePackage.getEString(), "onUpdate", null, 0, 1, ForeignKeyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniqueConstraintEClass, UniqueConstraint.class, "UniqueConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUniqueConstraint_ColumnNames(), ecorePackage.getEString(), "columnNames", null, 0, -1, UniqueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkConstraintEClass, CheckConstraint.class, "CheckConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckConstraint_Expression(), this.getExpression(), null, "expression", null, 1, 1, CheckConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckConstraint_ExpressionText(), ecorePackage.getEString(), "expressionText", null, 0, 1, CheckConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectItemEClass, SelectItem.class, "SelectItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectItem_Expression(), this.getExpression(), null, "expression", null, 0, 1, SelectItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectItem_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, SelectItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectItem_AllColumns(), ecorePackage.getEBoolean(), "allColumns", null, 0, 1, SelectItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectItem_TableAlias(), ecorePackage.getEString(), "tableAlias", null, 0, 1, SelectItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromItemEClass, FromItem.class, "FromItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFromItem_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, FromItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableReferenceEClass, TableReference.class, "TableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableReference_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, TableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableReference_TableName(), ecorePackage.getEString(), "tableName", null, 1, 1, TableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subSelectEClass, SubSelect.class, "SubSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubSelect_Select(), this.getSelect(), null, "select", null, 1, 1, SubSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoin_Type(), this.getJoinType(), "type", null, 0, 1, Join.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoin_RightItem(), this.getFromItem(), null, "rightItem", null, 1, 1, Join.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoin_OnCondition(), this.getExpression(), null, "onCondition", null, 0, 1, Join.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderByItemEClass, OrderByItem.class, "OrderByItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderByItem_Expression(), this.getExpression(), null, "expression", null, 1, 1, OrderByItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderByItem_Direction(), this.getSortDirection(), "direction", null, 0, 1, OrderByItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(columnReferenceEClass, ColumnReference.class, "ColumnReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnReference_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, ColumnReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnReference_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, ColumnReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumnReference_ColumnName(), ecorePackage.getEString(), "columnName", null, 1, 1, ColumnReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Type(), ecorePackage.getEString(), "type", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionCallEClass, FunctionCall.class, "FunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionCall_Name(), ecorePackage.getEString(), "name", null, 1, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionCall_SchemaName(), ecorePackage.getEString(), "schemaName", null, 0, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionCall_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionCall_Distinct(), ecorePackage.getEBoolean(), "distinct", null, 0, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionCall_AllColumns(), ecorePackage.getEBoolean(), "allColumns", null, 0, 1, FunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Left(), this.getExpression(), null, "left", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Right(), this.getExpression(), null, "right", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryExpression_Operator(), ecorePackage.getEString(), "operator", null, 1, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Operand(), this.getExpression(), null, "operand", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryExpression_Operator(), ecorePackage.getEString(), "operator", null, 1, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryExpression_Prefix(), ecorePackage.getEBoolean(), "prefix", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parenthesisEClass, Parenthesis.class, "Parenthesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParenthesis_Expression(), this.getExpression(), null, "expression", null, 1, 1, Parenthesis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseExpressionEClass, CaseExpression.class, "CaseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaseExpression_SwitchExpression(), this.getExpression(), null, "switchExpression", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseExpression_WhenClauses(), this.getWhenClause(), null, "whenClauses", null, 0, -1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseExpression_ElseExpression(), this.getExpression(), null, "elseExpression", null, 0, 1, CaseExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whenClauseEClass, WhenClause.class, "WhenClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhenClause_Condition(), this.getExpression(), null, "condition", null, 1, 1, WhenClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhenClause_Result(), this.getExpression(), null, "result", null, 1, 1, WhenClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allColumnsEClass, AllColumns.class, "AllColumns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionListEClass, ExpressionList.class, "ExpressionList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionList_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, ExpressionList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
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

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (getAstNode_Comment(),
		   source,
		   new String[] {
			   "documentation", "Trailing or inline comment associated with this node"
		   });
	}

} //AstPackageImpl
