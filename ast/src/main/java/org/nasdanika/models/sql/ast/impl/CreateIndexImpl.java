/**
 */
package org.nasdanika.models.sql.ast.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.CreateIndex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateIndexImpl#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateIndexImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateIndexImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateIndexImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateIndexImpl#getColumnNames <em>Column Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateIndexImpl extends StatementImpl implements CreateIndex {
	/**
	 * The default value of the '{@link #getIndexName() <em>Index Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexName()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.CREATE_INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndexName() {
		return (String)eDynamicGet(AstPackage.CREATE_INDEX__INDEX_NAME, AstPackage.Literals.CREATE_INDEX__INDEX_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndexName(String newIndexName) {
		eDynamicSet(AstPackage.CREATE_INDEX__INDEX_NAME, AstPackage.Literals.CREATE_INDEX__INDEX_NAME, newIndexName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaName() {
		return (String)eDynamicGet(AstPackage.CREATE_INDEX__SCHEMA_NAME, AstPackage.Literals.CREATE_INDEX__SCHEMA_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaName(String newSchemaName) {
		eDynamicSet(AstPackage.CREATE_INDEX__SCHEMA_NAME, AstPackage.Literals.CREATE_INDEX__SCHEMA_NAME, newSchemaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableName() {
		return (String)eDynamicGet(AstPackage.CREATE_INDEX__TABLE_NAME, AstPackage.Literals.CREATE_INDEX__TABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableName(String newTableName) {
		eDynamicSet(AstPackage.CREATE_INDEX__TABLE_NAME, AstPackage.Literals.CREATE_INDEX__TABLE_NAME, newTableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnique() {
		return (Boolean)eDynamicGet(AstPackage.CREATE_INDEX__UNIQUE, AstPackage.Literals.CREATE_INDEX__UNIQUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnique(boolean newUnique) {
		eDynamicSet(AstPackage.CREATE_INDEX__UNIQUE, AstPackage.Literals.CREATE_INDEX__UNIQUE, newUnique);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getColumnNames() {
		return (EList<String>)eDynamicGet(AstPackage.CREATE_INDEX__COLUMN_NAMES, AstPackage.Literals.CREATE_INDEX__COLUMN_NAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.CREATE_INDEX__INDEX_NAME:
				return getIndexName();
			case AstPackage.CREATE_INDEX__SCHEMA_NAME:
				return getSchemaName();
			case AstPackage.CREATE_INDEX__TABLE_NAME:
				return getTableName();
			case AstPackage.CREATE_INDEX__UNIQUE:
				return isUnique();
			case AstPackage.CREATE_INDEX__COLUMN_NAMES:
				return getColumnNames();
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
			case AstPackage.CREATE_INDEX__INDEX_NAME:
				setIndexName((String)newValue);
				return;
			case AstPackage.CREATE_INDEX__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case AstPackage.CREATE_INDEX__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case AstPackage.CREATE_INDEX__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case AstPackage.CREATE_INDEX__COLUMN_NAMES:
				getColumnNames().clear();
				getColumnNames().addAll((Collection<? extends String>)newValue);
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
			case AstPackage.CREATE_INDEX__INDEX_NAME:
				setIndexName(INDEX_NAME_EDEFAULT);
				return;
			case AstPackage.CREATE_INDEX__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case AstPackage.CREATE_INDEX__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case AstPackage.CREATE_INDEX__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case AstPackage.CREATE_INDEX__COLUMN_NAMES:
				getColumnNames().clear();
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
			case AstPackage.CREATE_INDEX__INDEX_NAME:
				return INDEX_NAME_EDEFAULT == null ? getIndexName() != null : !INDEX_NAME_EDEFAULT.equals(getIndexName());
			case AstPackage.CREATE_INDEX__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? getSchemaName() != null : !SCHEMA_NAME_EDEFAULT.equals(getSchemaName());
			case AstPackage.CREATE_INDEX__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? getTableName() != null : !TABLE_NAME_EDEFAULT.equals(getTableName());
			case AstPackage.CREATE_INDEX__UNIQUE:
				return isUnique() != UNIQUE_EDEFAULT;
			case AstPackage.CREATE_INDEX__COLUMN_NAMES:
				return !getColumnNames().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CreateIndexImpl
