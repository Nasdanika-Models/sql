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
import org.nasdanika.models.sql.ast.ColumnDefinition;
import org.nasdanika.models.sql.ast.CreateTable;
import org.nasdanika.models.sql.ast.TableConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateTableImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateTableImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateTableImpl#isIfNotExists <em>If Not Exists</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateTableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateTableImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateTableImpl extends StatementImpl implements CreateTable {
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
	 * The default value of the '{@link #isIfNotExists() <em>If Not Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfNotExists()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IF_NOT_EXISTS_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.CREATE_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaName() {
		return (String)eDynamicGet(AstPackage.CREATE_TABLE__SCHEMA_NAME, AstPackage.Literals.CREATE_TABLE__SCHEMA_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaName(String newSchemaName) {
		eDynamicSet(AstPackage.CREATE_TABLE__SCHEMA_NAME, AstPackage.Literals.CREATE_TABLE__SCHEMA_NAME, newSchemaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableName() {
		return (String)eDynamicGet(AstPackage.CREATE_TABLE__TABLE_NAME, AstPackage.Literals.CREATE_TABLE__TABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableName(String newTableName) {
		eDynamicSet(AstPackage.CREATE_TABLE__TABLE_NAME, AstPackage.Literals.CREATE_TABLE__TABLE_NAME, newTableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIfNotExists() {
		return (Boolean)eDynamicGet(AstPackage.CREATE_TABLE__IF_NOT_EXISTS, AstPackage.Literals.CREATE_TABLE__IF_NOT_EXISTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfNotExists(boolean newIfNotExists) {
		eDynamicSet(AstPackage.CREATE_TABLE__IF_NOT_EXISTS, AstPackage.Literals.CREATE_TABLE__IF_NOT_EXISTS, newIfNotExists);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ColumnDefinition> getColumns() {
		return (EList<ColumnDefinition>)eDynamicGet(AstPackage.CREATE_TABLE__COLUMNS, AstPackage.Literals.CREATE_TABLE__COLUMNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TableConstraint> getConstraints() {
		return (EList<TableConstraint>)eDynamicGet(AstPackage.CREATE_TABLE__CONSTRAINTS, AstPackage.Literals.CREATE_TABLE__CONSTRAINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.CREATE_TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case AstPackage.CREATE_TABLE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case AstPackage.CREATE_TABLE__SCHEMA_NAME:
				return getSchemaName();
			case AstPackage.CREATE_TABLE__TABLE_NAME:
				return getTableName();
			case AstPackage.CREATE_TABLE__IF_NOT_EXISTS:
				return isIfNotExists();
			case AstPackage.CREATE_TABLE__COLUMNS:
				return getColumns();
			case AstPackage.CREATE_TABLE__CONSTRAINTS:
				return getConstraints();
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
			case AstPackage.CREATE_TABLE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case AstPackage.CREATE_TABLE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case AstPackage.CREATE_TABLE__IF_NOT_EXISTS:
				setIfNotExists((Boolean)newValue);
				return;
			case AstPackage.CREATE_TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends ColumnDefinition>)newValue);
				return;
			case AstPackage.CREATE_TABLE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends TableConstraint>)newValue);
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
			case AstPackage.CREATE_TABLE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case AstPackage.CREATE_TABLE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case AstPackage.CREATE_TABLE__IF_NOT_EXISTS:
				setIfNotExists(IF_NOT_EXISTS_EDEFAULT);
				return;
			case AstPackage.CREATE_TABLE__COLUMNS:
				getColumns().clear();
				return;
			case AstPackage.CREATE_TABLE__CONSTRAINTS:
				getConstraints().clear();
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
			case AstPackage.CREATE_TABLE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? getSchemaName() != null : !SCHEMA_NAME_EDEFAULT.equals(getSchemaName());
			case AstPackage.CREATE_TABLE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? getTableName() != null : !TABLE_NAME_EDEFAULT.equals(getTableName());
			case AstPackage.CREATE_TABLE__IF_NOT_EXISTS:
				return isIfNotExists() != IF_NOT_EXISTS_EDEFAULT;
			case AstPackage.CREATE_TABLE__COLUMNS:
				return !getColumns().isEmpty();
			case AstPackage.CREATE_TABLE__CONSTRAINTS:
				return !getConstraints().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CreateTableImpl
