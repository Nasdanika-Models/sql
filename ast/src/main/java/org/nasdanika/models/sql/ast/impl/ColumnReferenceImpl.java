/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.ColumnReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ColumnReferenceImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ColumnReferenceImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ColumnReferenceImpl#getColumnName <em>Column Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnReferenceImpl extends ExpressionImpl implements ColumnReference {
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
	 * The default value of the '{@link #getSchemaName() <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_NAME_EDEFAULT = null;

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
	protected ColumnReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.COLUMN_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableName() {
		return (String)eDynamicGet(AstPackage.COLUMN_REFERENCE__TABLE_NAME, AstPackage.Literals.COLUMN_REFERENCE__TABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableName(String newTableName) {
		eDynamicSet(AstPackage.COLUMN_REFERENCE__TABLE_NAME, AstPackage.Literals.COLUMN_REFERENCE__TABLE_NAME, newTableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaName() {
		return (String)eDynamicGet(AstPackage.COLUMN_REFERENCE__SCHEMA_NAME, AstPackage.Literals.COLUMN_REFERENCE__SCHEMA_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaName(String newSchemaName) {
		eDynamicSet(AstPackage.COLUMN_REFERENCE__SCHEMA_NAME, AstPackage.Literals.COLUMN_REFERENCE__SCHEMA_NAME, newSchemaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColumnName() {
		return (String)eDynamicGet(AstPackage.COLUMN_REFERENCE__COLUMN_NAME, AstPackage.Literals.COLUMN_REFERENCE__COLUMN_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnName(String newColumnName) {
		eDynamicSet(AstPackage.COLUMN_REFERENCE__COLUMN_NAME, AstPackage.Literals.COLUMN_REFERENCE__COLUMN_NAME, newColumnName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.COLUMN_REFERENCE__TABLE_NAME:
				return getTableName();
			case AstPackage.COLUMN_REFERENCE__SCHEMA_NAME:
				return getSchemaName();
			case AstPackage.COLUMN_REFERENCE__COLUMN_NAME:
				return getColumnName();
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
			case AstPackage.COLUMN_REFERENCE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case AstPackage.COLUMN_REFERENCE__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case AstPackage.COLUMN_REFERENCE__COLUMN_NAME:
				setColumnName((String)newValue);
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
			case AstPackage.COLUMN_REFERENCE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case AstPackage.COLUMN_REFERENCE__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case AstPackage.COLUMN_REFERENCE__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
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
			case AstPackage.COLUMN_REFERENCE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? getTableName() != null : !TABLE_NAME_EDEFAULT.equals(getTableName());
			case AstPackage.COLUMN_REFERENCE__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? getSchemaName() != null : !SCHEMA_NAME_EDEFAULT.equals(getSchemaName());
			case AstPackage.COLUMN_REFERENCE__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? getColumnName() != null : !COLUMN_NAME_EDEFAULT.equals(getColumnName());
		}
		return super.eIsSet(featureID);
	}

} //ColumnReferenceImpl
