/**
 */
package org.nasdanika.models.sql.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.sql.Column;
import org.nasdanika.models.sql.ForeignKeyColumn;
import org.nasdanika.models.sql.SqlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.impl.ForeignKeyColumnImpl#getFkColumn <em>Fk Column</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ForeignKeyColumnImpl#getPkColumn <em>Pk Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyColumnImpl extends MinimalEObjectImpl.Container implements ForeignKeyColumn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.FOREIGN_KEY_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column getFkColumn() {
		return (Column)eDynamicGet(SqlPackage.FOREIGN_KEY_COLUMN__FK_COLUMN, SqlPackage.Literals.FOREIGN_KEY_COLUMN__FK_COLUMN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetFkColumn() {
		return (Column)eDynamicGet(SqlPackage.FOREIGN_KEY_COLUMN__FK_COLUMN, SqlPackage.Literals.FOREIGN_KEY_COLUMN__FK_COLUMN, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFkColumn(Column newFkColumn) {
		eDynamicSet(SqlPackage.FOREIGN_KEY_COLUMN__FK_COLUMN, SqlPackage.Literals.FOREIGN_KEY_COLUMN__FK_COLUMN, newFkColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column getPkColumn() {
		return (Column)eDynamicGet(SqlPackage.FOREIGN_KEY_COLUMN__PK_COLUMN, SqlPackage.Literals.FOREIGN_KEY_COLUMN__PK_COLUMN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetPkColumn() {
		return (Column)eDynamicGet(SqlPackage.FOREIGN_KEY_COLUMN__PK_COLUMN, SqlPackage.Literals.FOREIGN_KEY_COLUMN__PK_COLUMN, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPkColumn(Column newPkColumn) {
		eDynamicSet(SqlPackage.FOREIGN_KEY_COLUMN__PK_COLUMN, SqlPackage.Literals.FOREIGN_KEY_COLUMN__PK_COLUMN, newPkColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlPackage.FOREIGN_KEY_COLUMN__FK_COLUMN:
				if (resolve) return getFkColumn();
				return basicGetFkColumn();
			case SqlPackage.FOREIGN_KEY_COLUMN__PK_COLUMN:
				if (resolve) return getPkColumn();
				return basicGetPkColumn();
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
			case SqlPackage.FOREIGN_KEY_COLUMN__FK_COLUMN:
				setFkColumn((Column)newValue);
				return;
			case SqlPackage.FOREIGN_KEY_COLUMN__PK_COLUMN:
				setPkColumn((Column)newValue);
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
			case SqlPackage.FOREIGN_KEY_COLUMN__FK_COLUMN:
				setFkColumn((Column)null);
				return;
			case SqlPackage.FOREIGN_KEY_COLUMN__PK_COLUMN:
				setPkColumn((Column)null);
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
			case SqlPackage.FOREIGN_KEY_COLUMN__FK_COLUMN:
				return basicGetFkColumn() != null;
			case SqlPackage.FOREIGN_KEY_COLUMN__PK_COLUMN:
				return basicGetPkColumn() != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyColumnImpl
