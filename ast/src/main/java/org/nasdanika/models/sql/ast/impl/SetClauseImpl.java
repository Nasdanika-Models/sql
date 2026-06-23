/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.Expression;
import org.nasdanika.models.sql.ast.SetClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SetClauseImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SetClauseImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetClauseImpl extends AstNodeImpl implements SetClause {
	/**
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.SET_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColumnName() {
		return (String)eDynamicGet(AstPackage.SET_CLAUSE__COLUMN_NAME, AstPackage.Literals.SET_CLAUSE__COLUMN_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnName(String newColumnName) {
		eDynamicSet(AstPackage.SET_CLAUSE__COLUMN_NAME, AstPackage.Literals.SET_CLAUSE__COLUMN_NAME, newColumnName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValue() {
		return (Expression)eDynamicGet(AstPackage.SET_CLAUSE__VALUE, AstPackage.Literals.SET_CLAUSE__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newValue, AstPackage.SET_CLAUSE__VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Expression newValue) {
		eDynamicSet(AstPackage.SET_CLAUSE__VALUE, AstPackage.Literals.SET_CLAUSE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.SET_CLAUSE__VALUE:
				return basicSetValue(null, msgs);
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
			case AstPackage.SET_CLAUSE__COLUMN_NAME:
				return getColumnName();
			case AstPackage.SET_CLAUSE__VALUE:
				return getValue();
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
			case AstPackage.SET_CLAUSE__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case AstPackage.SET_CLAUSE__VALUE:
				setValue((Expression)newValue);
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
			case AstPackage.SET_CLAUSE__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case AstPackage.SET_CLAUSE__VALUE:
				setValue((Expression)null);
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
			case AstPackage.SET_CLAUSE__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? getColumnName() != null : !COLUMN_NAME_EDEFAULT.equals(getColumnName());
			case AstPackage.SET_CLAUSE__VALUE:
				return getValue() != null;
		}
		return super.eIsSet(featureID);
	}

} //SetClauseImpl
