/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.Expression;
import org.nasdanika.models.sql.ast.SelectItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SelectItemImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SelectItemImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SelectItemImpl#isAllColumns <em>All Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SelectItemImpl#getTableAlias <em>Table Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectItemImpl extends AstNodeImpl implements SelectItem {
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

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
	 * The default value of the '{@link #getTableAlias() <em>Table Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_ALIAS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.SELECT_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpression() {
		return (Expression)eDynamicGet(AstPackage.SELECT_ITEM__EXPRESSION, AstPackage.Literals.SELECT_ITEM__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, AstPackage.SELECT_ITEM__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(Expression newExpression) {
		eDynamicSet(AstPackage.SELECT_ITEM__EXPRESSION, AstPackage.Literals.SELECT_ITEM__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlias() {
		return (String)eDynamicGet(AstPackage.SELECT_ITEM__ALIAS, AstPackage.Literals.SELECT_ITEM__ALIAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlias(String newAlias) {
		eDynamicSet(AstPackage.SELECT_ITEM__ALIAS, AstPackage.Literals.SELECT_ITEM__ALIAS, newAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllColumns() {
		return (Boolean)eDynamicGet(AstPackage.SELECT_ITEM__ALL_COLUMNS, AstPackage.Literals.SELECT_ITEM__ALL_COLUMNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllColumns(boolean newAllColumns) {
		eDynamicSet(AstPackage.SELECT_ITEM__ALL_COLUMNS, AstPackage.Literals.SELECT_ITEM__ALL_COLUMNS, newAllColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableAlias() {
		return (String)eDynamicGet(AstPackage.SELECT_ITEM__TABLE_ALIAS, AstPackage.Literals.SELECT_ITEM__TABLE_ALIAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableAlias(String newTableAlias) {
		eDynamicSet(AstPackage.SELECT_ITEM__TABLE_ALIAS, AstPackage.Literals.SELECT_ITEM__TABLE_ALIAS, newTableAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.SELECT_ITEM__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case AstPackage.SELECT_ITEM__EXPRESSION:
				return getExpression();
			case AstPackage.SELECT_ITEM__ALIAS:
				return getAlias();
			case AstPackage.SELECT_ITEM__ALL_COLUMNS:
				return isAllColumns();
			case AstPackage.SELECT_ITEM__TABLE_ALIAS:
				return getTableAlias();
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
			case AstPackage.SELECT_ITEM__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case AstPackage.SELECT_ITEM__ALIAS:
				setAlias((String)newValue);
				return;
			case AstPackage.SELECT_ITEM__ALL_COLUMNS:
				setAllColumns((Boolean)newValue);
				return;
			case AstPackage.SELECT_ITEM__TABLE_ALIAS:
				setTableAlias((String)newValue);
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
			case AstPackage.SELECT_ITEM__EXPRESSION:
				setExpression((Expression)null);
				return;
			case AstPackage.SELECT_ITEM__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case AstPackage.SELECT_ITEM__ALL_COLUMNS:
				setAllColumns(ALL_COLUMNS_EDEFAULT);
				return;
			case AstPackage.SELECT_ITEM__TABLE_ALIAS:
				setTableAlias(TABLE_ALIAS_EDEFAULT);
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
			case AstPackage.SELECT_ITEM__EXPRESSION:
				return getExpression() != null;
			case AstPackage.SELECT_ITEM__ALIAS:
				return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
			case AstPackage.SELECT_ITEM__ALL_COLUMNS:
				return isAllColumns() != ALL_COLUMNS_EDEFAULT;
			case AstPackage.SELECT_ITEM__TABLE_ALIAS:
				return TABLE_ALIAS_EDEFAULT == null ? getTableAlias() != null : !TABLE_ALIAS_EDEFAULT.equals(getTableAlias());
		}
		return super.eIsSet(featureID);
	}

} //SelectItemImpl
