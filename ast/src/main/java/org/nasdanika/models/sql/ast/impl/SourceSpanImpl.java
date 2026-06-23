/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.SourceSpan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Span</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SourceSpanImpl#getStartLine <em>Start Line</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SourceSpanImpl#getStartColumn <em>Start Column</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SourceSpanImpl#getEndLine <em>End Line</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SourceSpanImpl#getEndColumn <em>End Column</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SourceSpanImpl#getStartOffset <em>Start Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SourceSpanImpl#getEndOffset <em>End Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceSpanImpl extends MinimalEObjectImpl.Container implements SourceSpan {
	/**
	 * The default value of the '{@link #getStartLine() <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLine()
	 * @generated
	 * @ordered
	 */
	protected static final int START_LINE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getStartColumn() <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int START_COLUMN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getEndLine() <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLine()
	 * @generated
	 * @ordered
	 */
	protected static final int END_LINE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getEndColumn() <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int END_COLUMN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getStartOffset() <em>Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int START_OFFSET_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getEndOffset() <em>End Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int END_OFFSET_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceSpanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.SOURCE_SPAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartLine() {
		return (Integer)eDynamicGet(AstPackage.SOURCE_SPAN__START_LINE, AstPackage.Literals.SOURCE_SPAN__START_LINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartLine(int newStartLine) {
		eDynamicSet(AstPackage.SOURCE_SPAN__START_LINE, AstPackage.Literals.SOURCE_SPAN__START_LINE, newStartLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartColumn() {
		return (Integer)eDynamicGet(AstPackage.SOURCE_SPAN__START_COLUMN, AstPackage.Literals.SOURCE_SPAN__START_COLUMN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartColumn(int newStartColumn) {
		eDynamicSet(AstPackage.SOURCE_SPAN__START_COLUMN, AstPackage.Literals.SOURCE_SPAN__START_COLUMN, newStartColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEndLine() {
		return (Integer)eDynamicGet(AstPackage.SOURCE_SPAN__END_LINE, AstPackage.Literals.SOURCE_SPAN__END_LINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndLine(int newEndLine) {
		eDynamicSet(AstPackage.SOURCE_SPAN__END_LINE, AstPackage.Literals.SOURCE_SPAN__END_LINE, newEndLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEndColumn() {
		return (Integer)eDynamicGet(AstPackage.SOURCE_SPAN__END_COLUMN, AstPackage.Literals.SOURCE_SPAN__END_COLUMN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndColumn(int newEndColumn) {
		eDynamicSet(AstPackage.SOURCE_SPAN__END_COLUMN, AstPackage.Literals.SOURCE_SPAN__END_COLUMN, newEndColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartOffset() {
		return (Integer)eDynamicGet(AstPackage.SOURCE_SPAN__START_OFFSET, AstPackage.Literals.SOURCE_SPAN__START_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartOffset(int newStartOffset) {
		eDynamicSet(AstPackage.SOURCE_SPAN__START_OFFSET, AstPackage.Literals.SOURCE_SPAN__START_OFFSET, newStartOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEndOffset() {
		return (Integer)eDynamicGet(AstPackage.SOURCE_SPAN__END_OFFSET, AstPackage.Literals.SOURCE_SPAN__END_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndOffset(int newEndOffset) {
		eDynamicSet(AstPackage.SOURCE_SPAN__END_OFFSET, AstPackage.Literals.SOURCE_SPAN__END_OFFSET, newEndOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.SOURCE_SPAN__START_LINE:
				return getStartLine();
			case AstPackage.SOURCE_SPAN__START_COLUMN:
				return getStartColumn();
			case AstPackage.SOURCE_SPAN__END_LINE:
				return getEndLine();
			case AstPackage.SOURCE_SPAN__END_COLUMN:
				return getEndColumn();
			case AstPackage.SOURCE_SPAN__START_OFFSET:
				return getStartOffset();
			case AstPackage.SOURCE_SPAN__END_OFFSET:
				return getEndOffset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AstPackage.SOURCE_SPAN__START_LINE:
				setStartLine((Integer)newValue);
				return;
			case AstPackage.SOURCE_SPAN__START_COLUMN:
				setStartColumn((Integer)newValue);
				return;
			case AstPackage.SOURCE_SPAN__END_LINE:
				setEndLine((Integer)newValue);
				return;
			case AstPackage.SOURCE_SPAN__END_COLUMN:
				setEndColumn((Integer)newValue);
				return;
			case AstPackage.SOURCE_SPAN__START_OFFSET:
				setStartOffset((Integer)newValue);
				return;
			case AstPackage.SOURCE_SPAN__END_OFFSET:
				setEndOffset((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AstPackage.SOURCE_SPAN__START_LINE:
				setStartLine(START_LINE_EDEFAULT);
				return;
			case AstPackage.SOURCE_SPAN__START_COLUMN:
				setStartColumn(START_COLUMN_EDEFAULT);
				return;
			case AstPackage.SOURCE_SPAN__END_LINE:
				setEndLine(END_LINE_EDEFAULT);
				return;
			case AstPackage.SOURCE_SPAN__END_COLUMN:
				setEndColumn(END_COLUMN_EDEFAULT);
				return;
			case AstPackage.SOURCE_SPAN__START_OFFSET:
				setStartOffset(START_OFFSET_EDEFAULT);
				return;
			case AstPackage.SOURCE_SPAN__END_OFFSET:
				setEndOffset(END_OFFSET_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AstPackage.SOURCE_SPAN__START_LINE:
				return getStartLine() != START_LINE_EDEFAULT;
			case AstPackage.SOURCE_SPAN__START_COLUMN:
				return getStartColumn() != START_COLUMN_EDEFAULT;
			case AstPackage.SOURCE_SPAN__END_LINE:
				return getEndLine() != END_LINE_EDEFAULT;
			case AstPackage.SOURCE_SPAN__END_COLUMN:
				return getEndColumn() != END_COLUMN_EDEFAULT;
			case AstPackage.SOURCE_SPAN__START_OFFSET:
				return getStartOffset() != START_OFFSET_EDEFAULT;
			case AstPackage.SOURCE_SPAN__END_OFFSET:
				return getEndOffset() != END_OFFSET_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SourceSpanImpl
