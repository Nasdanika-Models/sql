/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.DropTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.DropTableImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.DropTableImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.DropTableImpl#isIfExists <em>If Exists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropTableImpl extends StatementImpl implements DropTable {
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
	 * The default value of the '{@link #isIfExists() <em>If Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfExists()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IF_EXISTS_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.DROP_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaName() {
		return (String)eDynamicGet(AstPackage.DROP_TABLE__SCHEMA_NAME, AstPackage.Literals.DROP_TABLE__SCHEMA_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaName(String newSchemaName) {
		eDynamicSet(AstPackage.DROP_TABLE__SCHEMA_NAME, AstPackage.Literals.DROP_TABLE__SCHEMA_NAME, newSchemaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableName() {
		return (String)eDynamicGet(AstPackage.DROP_TABLE__TABLE_NAME, AstPackage.Literals.DROP_TABLE__TABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableName(String newTableName) {
		eDynamicSet(AstPackage.DROP_TABLE__TABLE_NAME, AstPackage.Literals.DROP_TABLE__TABLE_NAME, newTableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIfExists() {
		return (Boolean)eDynamicGet(AstPackage.DROP_TABLE__IF_EXISTS, AstPackage.Literals.DROP_TABLE__IF_EXISTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfExists(boolean newIfExists) {
		eDynamicSet(AstPackage.DROP_TABLE__IF_EXISTS, AstPackage.Literals.DROP_TABLE__IF_EXISTS, newIfExists);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.DROP_TABLE__SCHEMA_NAME:
				return getSchemaName();
			case AstPackage.DROP_TABLE__TABLE_NAME:
				return getTableName();
			case AstPackage.DROP_TABLE__IF_EXISTS:
				return isIfExists();
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
			case AstPackage.DROP_TABLE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case AstPackage.DROP_TABLE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case AstPackage.DROP_TABLE__IF_EXISTS:
				setIfExists((Boolean)newValue);
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
			case AstPackage.DROP_TABLE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case AstPackage.DROP_TABLE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case AstPackage.DROP_TABLE__IF_EXISTS:
				setIfExists(IF_EXISTS_EDEFAULT);
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
			case AstPackage.DROP_TABLE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? getSchemaName() != null : !SCHEMA_NAME_EDEFAULT.equals(getSchemaName());
			case AstPackage.DROP_TABLE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? getTableName() != null : !TABLE_NAME_EDEFAULT.equals(getTableName());
			case AstPackage.DROP_TABLE__IF_EXISTS:
				return isIfExists() != IF_EXISTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DropTableImpl
