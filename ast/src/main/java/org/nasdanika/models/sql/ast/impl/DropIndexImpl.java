/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.DropIndex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.DropIndexImpl#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.DropIndexImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.DropIndexImpl#getTableName <em>Table Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropIndexImpl extends StatementImpl implements DropIndex {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropIndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.DROP_INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndexName() {
		return (String)eDynamicGet(AstPackage.DROP_INDEX__INDEX_NAME, AstPackage.Literals.DROP_INDEX__INDEX_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndexName(String newIndexName) {
		eDynamicSet(AstPackage.DROP_INDEX__INDEX_NAME, AstPackage.Literals.DROP_INDEX__INDEX_NAME, newIndexName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaName() {
		return (String)eDynamicGet(AstPackage.DROP_INDEX__SCHEMA_NAME, AstPackage.Literals.DROP_INDEX__SCHEMA_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaName(String newSchemaName) {
		eDynamicSet(AstPackage.DROP_INDEX__SCHEMA_NAME, AstPackage.Literals.DROP_INDEX__SCHEMA_NAME, newSchemaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableName() {
		return (String)eDynamicGet(AstPackage.DROP_INDEX__TABLE_NAME, AstPackage.Literals.DROP_INDEX__TABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableName(String newTableName) {
		eDynamicSet(AstPackage.DROP_INDEX__TABLE_NAME, AstPackage.Literals.DROP_INDEX__TABLE_NAME, newTableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.DROP_INDEX__INDEX_NAME:
				return getIndexName();
			case AstPackage.DROP_INDEX__SCHEMA_NAME:
				return getSchemaName();
			case AstPackage.DROP_INDEX__TABLE_NAME:
				return getTableName();
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
			case AstPackage.DROP_INDEX__INDEX_NAME:
				setIndexName((String)newValue);
				return;
			case AstPackage.DROP_INDEX__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case AstPackage.DROP_INDEX__TABLE_NAME:
				setTableName((String)newValue);
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
			case AstPackage.DROP_INDEX__INDEX_NAME:
				setIndexName(INDEX_NAME_EDEFAULT);
				return;
			case AstPackage.DROP_INDEX__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case AstPackage.DROP_INDEX__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
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
			case AstPackage.DROP_INDEX__INDEX_NAME:
				return INDEX_NAME_EDEFAULT == null ? getIndexName() != null : !INDEX_NAME_EDEFAULT.equals(getIndexName());
			case AstPackage.DROP_INDEX__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? getSchemaName() != null : !SCHEMA_NAME_EDEFAULT.equals(getSchemaName());
			case AstPackage.DROP_INDEX__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? getTableName() != null : !TABLE_NAME_EDEFAULT.equals(getTableName());
		}
		return super.eIsSet(featureID);
	}

} //DropIndexImpl
