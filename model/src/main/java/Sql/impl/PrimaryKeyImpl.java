/**
 */
package Sql.impl;

import Sql.PrimaryKey;
import Sql.SqlPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Sql.impl.PrimaryKeyImpl#getTableCat <em>Table Cat</em>}</li>
 *   <li>{@link Sql.impl.PrimaryKeyImpl#getTableSchem <em>Table Schem</em>}</li>
 *   <li>{@link Sql.impl.PrimaryKeyImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link Sql.impl.PrimaryKeyImpl#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link Sql.impl.PrimaryKeyImpl#getKeySeq <em>Key Seq</em>}</li>
 *   <li>{@link Sql.impl.PrimaryKeyImpl#getPkName <em>Pk Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryKeyImpl extends MinimalEObjectImpl.Container implements PrimaryKey {
	/**
	 * The default value of the '{@link #getTableCat() <em>Table Cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableCat()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_CAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTableSchem() <em>Table Schem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableSchem()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_SCHEM_EDEFAULT = null;

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
	 * The default value of the '{@link #getColumnName() <em>Column Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKeySeq() <em>Key Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySeq()
	 * @generated
	 * @ordered
	 */
	protected static final Short KEY_SEQ_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPkName() <em>Pk Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkName()
	 * @generated
	 * @ordered
	 */
	protected static final String PK_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.PRIMARY_KEY;
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
	public String getTableCat() {
		return (String)eDynamicGet(SqlPackage.PRIMARY_KEY__TABLE_CAT, SqlPackage.Literals.PRIMARY_KEY__TABLE_CAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableCat(String newTableCat) {
		eDynamicSet(SqlPackage.PRIMARY_KEY__TABLE_CAT, SqlPackage.Literals.PRIMARY_KEY__TABLE_CAT, newTableCat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableSchem() {
		return (String)eDynamicGet(SqlPackage.PRIMARY_KEY__TABLE_SCHEM, SqlPackage.Literals.PRIMARY_KEY__TABLE_SCHEM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableSchem(String newTableSchem) {
		eDynamicSet(SqlPackage.PRIMARY_KEY__TABLE_SCHEM, SqlPackage.Literals.PRIMARY_KEY__TABLE_SCHEM, newTableSchem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableName() {
		return (String)eDynamicGet(SqlPackage.PRIMARY_KEY__TABLE_NAME, SqlPackage.Literals.PRIMARY_KEY__TABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableName(String newTableName) {
		eDynamicSet(SqlPackage.PRIMARY_KEY__TABLE_NAME, SqlPackage.Literals.PRIMARY_KEY__TABLE_NAME, newTableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColumnName() {
		return (String)eDynamicGet(SqlPackage.PRIMARY_KEY__COLUMN_NAME, SqlPackage.Literals.PRIMARY_KEY__COLUMN_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnName(String newColumnName) {
		eDynamicSet(SqlPackage.PRIMARY_KEY__COLUMN_NAME, SqlPackage.Literals.PRIMARY_KEY__COLUMN_NAME, newColumnName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Short getKeySeq() {
		return (Short)eDynamicGet(SqlPackage.PRIMARY_KEY__KEY_SEQ, SqlPackage.Literals.PRIMARY_KEY__KEY_SEQ, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeySeq(Short newKeySeq) {
		eDynamicSet(SqlPackage.PRIMARY_KEY__KEY_SEQ, SqlPackage.Literals.PRIMARY_KEY__KEY_SEQ, newKeySeq);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPkName() {
		return (String)eDynamicGet(SqlPackage.PRIMARY_KEY__PK_NAME, SqlPackage.Literals.PRIMARY_KEY__PK_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPkName(String newPkName) {
		eDynamicSet(SqlPackage.PRIMARY_KEY__PK_NAME, SqlPackage.Literals.PRIMARY_KEY__PK_NAME, newPkName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlPackage.PRIMARY_KEY__TABLE_CAT:
				return getTableCat();
			case SqlPackage.PRIMARY_KEY__TABLE_SCHEM:
				return getTableSchem();
			case SqlPackage.PRIMARY_KEY__TABLE_NAME:
				return getTableName();
			case SqlPackage.PRIMARY_KEY__COLUMN_NAME:
				return getColumnName();
			case SqlPackage.PRIMARY_KEY__KEY_SEQ:
				return getKeySeq();
			case SqlPackage.PRIMARY_KEY__PK_NAME:
				return getPkName();
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
			case SqlPackage.PRIMARY_KEY__TABLE_CAT:
				setTableCat((String)newValue);
				return;
			case SqlPackage.PRIMARY_KEY__TABLE_SCHEM:
				setTableSchem((String)newValue);
				return;
			case SqlPackage.PRIMARY_KEY__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case SqlPackage.PRIMARY_KEY__COLUMN_NAME:
				setColumnName((String)newValue);
				return;
			case SqlPackage.PRIMARY_KEY__KEY_SEQ:
				setKeySeq((Short)newValue);
				return;
			case SqlPackage.PRIMARY_KEY__PK_NAME:
				setPkName((String)newValue);
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
			case SqlPackage.PRIMARY_KEY__TABLE_CAT:
				setTableCat(TABLE_CAT_EDEFAULT);
				return;
			case SqlPackage.PRIMARY_KEY__TABLE_SCHEM:
				setTableSchem(TABLE_SCHEM_EDEFAULT);
				return;
			case SqlPackage.PRIMARY_KEY__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case SqlPackage.PRIMARY_KEY__COLUMN_NAME:
				setColumnName(COLUMN_NAME_EDEFAULT);
				return;
			case SqlPackage.PRIMARY_KEY__KEY_SEQ:
				setKeySeq(KEY_SEQ_EDEFAULT);
				return;
			case SqlPackage.PRIMARY_KEY__PK_NAME:
				setPkName(PK_NAME_EDEFAULT);
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
			case SqlPackage.PRIMARY_KEY__TABLE_CAT:
				return TABLE_CAT_EDEFAULT == null ? getTableCat() != null : !TABLE_CAT_EDEFAULT.equals(getTableCat());
			case SqlPackage.PRIMARY_KEY__TABLE_SCHEM:
				return TABLE_SCHEM_EDEFAULT == null ? getTableSchem() != null : !TABLE_SCHEM_EDEFAULT.equals(getTableSchem());
			case SqlPackage.PRIMARY_KEY__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? getTableName() != null : !TABLE_NAME_EDEFAULT.equals(getTableName());
			case SqlPackage.PRIMARY_KEY__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? getColumnName() != null : !COLUMN_NAME_EDEFAULT.equals(getColumnName());
			case SqlPackage.PRIMARY_KEY__KEY_SEQ:
				return KEY_SEQ_EDEFAULT == null ? getKeySeq() != null : !KEY_SEQ_EDEFAULT.equals(getKeySeq());
			case SqlPackage.PRIMARY_KEY__PK_NAME:
				return PK_NAME_EDEFAULT == null ? getPkName() != null : !PK_NAME_EDEFAULT.equals(getPkName());
		}
		return super.eIsSet(featureID);
	}

} //PrimaryKeyImpl
