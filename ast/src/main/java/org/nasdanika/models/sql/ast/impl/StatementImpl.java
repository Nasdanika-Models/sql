/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.StatementImpl#getRawSql <em>Raw Sql</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StatementImpl extends AstNodeImpl implements Statement {
	/**
	 * The default value of the '{@link #getRawSql() <em>Raw Sql</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawSql()
	 * @generated
	 * @ordered
	 */
	protected static final String RAW_SQL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRawSql() {
		return (String)eDynamicGet(AstPackage.STATEMENT__RAW_SQL, AstPackage.Literals.STATEMENT__RAW_SQL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRawSql(String newRawSql) {
		eDynamicSet(AstPackage.STATEMENT__RAW_SQL, AstPackage.Literals.STATEMENT__RAW_SQL, newRawSql);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.STATEMENT__RAW_SQL:
				return getRawSql();
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
			case AstPackage.STATEMENT__RAW_SQL:
				setRawSql((String)newValue);
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
			case AstPackage.STATEMENT__RAW_SQL:
				setRawSql(RAW_SQL_EDEFAULT);
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
			case AstPackage.STATEMENT__RAW_SQL:
				return RAW_SQL_EDEFAULT == null ? getRawSql() != null : !RAW_SQL_EDEFAULT.equals(getRawSql());
		}
		return super.eIsSet(featureID);
	}

} //StatementImpl
