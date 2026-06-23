/**
 */
package org.nasdanika.models.sql.ast.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.sql.ast.AlterOperation;
import org.nasdanika.models.sql.ast.AlterTable;
import org.nasdanika.models.sql.ast.AstPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alter Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.AlterTableImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.AlterTableImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.AlterTableImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlterTableImpl extends StatementImpl implements AlterTable {
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
	protected AlterTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.ALTER_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaName() {
		return (String)eDynamicGet(AstPackage.ALTER_TABLE__SCHEMA_NAME, AstPackage.Literals.ALTER_TABLE__SCHEMA_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaName(String newSchemaName) {
		eDynamicSet(AstPackage.ALTER_TABLE__SCHEMA_NAME, AstPackage.Literals.ALTER_TABLE__SCHEMA_NAME, newSchemaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableName() {
		return (String)eDynamicGet(AstPackage.ALTER_TABLE__TABLE_NAME, AstPackage.Literals.ALTER_TABLE__TABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableName(String newTableName) {
		eDynamicSet(AstPackage.ALTER_TABLE__TABLE_NAME, AstPackage.Literals.ALTER_TABLE__TABLE_NAME, newTableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AlterOperation> getOperations() {
		return (EList<AlterOperation>)eDynamicGet(AstPackage.ALTER_TABLE__OPERATIONS, AstPackage.Literals.ALTER_TABLE__OPERATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.ALTER_TABLE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case AstPackage.ALTER_TABLE__SCHEMA_NAME:
				return getSchemaName();
			case AstPackage.ALTER_TABLE__TABLE_NAME:
				return getTableName();
			case AstPackage.ALTER_TABLE__OPERATIONS:
				return getOperations();
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
			case AstPackage.ALTER_TABLE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case AstPackage.ALTER_TABLE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case AstPackage.ALTER_TABLE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends AlterOperation>)newValue);
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
			case AstPackage.ALTER_TABLE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case AstPackage.ALTER_TABLE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case AstPackage.ALTER_TABLE__OPERATIONS:
				getOperations().clear();
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
			case AstPackage.ALTER_TABLE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? getSchemaName() != null : !SCHEMA_NAME_EDEFAULT.equals(getSchemaName());
			case AstPackage.ALTER_TABLE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? getTableName() != null : !TABLE_NAME_EDEFAULT.equals(getTableName());
			case AstPackage.ALTER_TABLE__OPERATIONS:
				return !getOperations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlterTableImpl
