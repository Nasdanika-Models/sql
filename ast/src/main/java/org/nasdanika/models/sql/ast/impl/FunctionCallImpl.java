/**
 */
package org.nasdanika.models.sql.ast.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.Expression;
import org.nasdanika.models.sql.ast.FunctionCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.FunctionCallImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.FunctionCallImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.FunctionCallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.FunctionCallImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.FunctionCallImpl#isAllColumns <em>All Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallImpl extends ExpressionImpl implements FunctionCall {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSchemaName() <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISTINCT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAllColumns() <em>All Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllColumns()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_COLUMNS_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.FUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(AstPackage.FUNCTION_CALL__NAME, AstPackage.Literals.FUNCTION_CALL__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(AstPackage.FUNCTION_CALL__NAME, AstPackage.Literals.FUNCTION_CALL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaName() {
		return (String)eDynamicGet(AstPackage.FUNCTION_CALL__SCHEMA_NAME, AstPackage.Literals.FUNCTION_CALL__SCHEMA_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaName(String newSchemaName) {
		eDynamicSet(AstPackage.FUNCTION_CALL__SCHEMA_NAME, AstPackage.Literals.FUNCTION_CALL__SCHEMA_NAME, newSchemaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Expression> getArguments() {
		return (EList<Expression>)eDynamicGet(AstPackage.FUNCTION_CALL__ARGUMENTS, AstPackage.Literals.FUNCTION_CALL__ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDistinct() {
		return (Boolean)eDynamicGet(AstPackage.FUNCTION_CALL__DISTINCT, AstPackage.Literals.FUNCTION_CALL__DISTINCT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistinct(boolean newDistinct) {
		eDynamicSet(AstPackage.FUNCTION_CALL__DISTINCT, AstPackage.Literals.FUNCTION_CALL__DISTINCT, newDistinct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllColumns() {
		return (Boolean)eDynamicGet(AstPackage.FUNCTION_CALL__ALL_COLUMNS, AstPackage.Literals.FUNCTION_CALL__ALL_COLUMNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllColumns(boolean newAllColumns) {
		eDynamicSet(AstPackage.FUNCTION_CALL__ALL_COLUMNS, AstPackage.Literals.FUNCTION_CALL__ALL_COLUMNS, newAllColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.FUNCTION_CALL__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.FUNCTION_CALL__NAME:
				return getName();
			case AstPackage.FUNCTION_CALL__SCHEMA_NAME:
				return getSchemaName();
			case AstPackage.FUNCTION_CALL__ARGUMENTS:
				return getArguments();
			case AstPackage.FUNCTION_CALL__DISTINCT:
				return isDistinct();
			case AstPackage.FUNCTION_CALL__ALL_COLUMNS:
				return isAllColumns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AstPackage.FUNCTION_CALL__NAME:
				setName((String)newValue);
				return;
			case AstPackage.FUNCTION_CALL__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case AstPackage.FUNCTION_CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case AstPackage.FUNCTION_CALL__DISTINCT:
				setDistinct((Boolean)newValue);
				return;
			case AstPackage.FUNCTION_CALL__ALL_COLUMNS:
				setAllColumns((Boolean)newValue);
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
			case AstPackage.FUNCTION_CALL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AstPackage.FUNCTION_CALL__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case AstPackage.FUNCTION_CALL__ARGUMENTS:
				getArguments().clear();
				return;
			case AstPackage.FUNCTION_CALL__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case AstPackage.FUNCTION_CALL__ALL_COLUMNS:
				setAllColumns(ALL_COLUMNS_EDEFAULT);
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
			case AstPackage.FUNCTION_CALL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case AstPackage.FUNCTION_CALL__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? getSchemaName() != null : !SCHEMA_NAME_EDEFAULT.equals(getSchemaName());
			case AstPackage.FUNCTION_CALL__ARGUMENTS:
				return !getArguments().isEmpty();
			case AstPackage.FUNCTION_CALL__DISTINCT:
				return isDistinct() != DISTINCT_EDEFAULT;
			case AstPackage.FUNCTION_CALL__ALL_COLUMNS:
				return isAllColumns() != ALL_COLUMNS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //FunctionCallImpl
