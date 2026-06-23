/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.Delete;
import org.nasdanika.models.sql.ast.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.DeleteImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.DeleteImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.DeleteImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteImpl extends StatementImpl implements Delete {
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
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.DELETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaName() {
		return (String)eDynamicGet(AstPackage.DELETE__SCHEMA_NAME, AstPackage.Literals.DELETE__SCHEMA_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaName(String newSchemaName) {
		eDynamicSet(AstPackage.DELETE__SCHEMA_NAME, AstPackage.Literals.DELETE__SCHEMA_NAME, newSchemaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableName() {
		return (String)eDynamicGet(AstPackage.DELETE__TABLE_NAME, AstPackage.Literals.DELETE__TABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableName(String newTableName) {
		eDynamicSet(AstPackage.DELETE__TABLE_NAME, AstPackage.Literals.DELETE__TABLE_NAME, newTableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getWhere() {
		return (Expression)eDynamicGet(AstPackage.DELETE__WHERE, AstPackage.Literals.DELETE__WHERE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Expression newWhere, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newWhere, AstPackage.DELETE__WHERE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhere(Expression newWhere) {
		eDynamicSet(AstPackage.DELETE__WHERE, AstPackage.Literals.DELETE__WHERE, newWhere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.DELETE__WHERE:
				return basicSetWhere(null, msgs);
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
			case AstPackage.DELETE__SCHEMA_NAME:
				return getSchemaName();
			case AstPackage.DELETE__TABLE_NAME:
				return getTableName();
			case AstPackage.DELETE__WHERE:
				return getWhere();
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
			case AstPackage.DELETE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case AstPackage.DELETE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case AstPackage.DELETE__WHERE:
				setWhere((Expression)newValue);
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
			case AstPackage.DELETE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case AstPackage.DELETE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case AstPackage.DELETE__WHERE:
				setWhere((Expression)null);
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
			case AstPackage.DELETE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? getSchemaName() != null : !SCHEMA_NAME_EDEFAULT.equals(getSchemaName());
			case AstPackage.DELETE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? getTableName() != null : !TABLE_NAME_EDEFAULT.equals(getTableName());
			case AstPackage.DELETE__WHERE:
				return getWhere() != null;
		}
		return super.eIsSet(featureID);
	}

} //DeleteImpl
