/**
 */
package Sql.impl;

import Sql.SqlPackage;
import Sql.Table;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Sql.impl.TableImpl#getTableCat <em>Table Cat</em>}</li>
 *   <li>{@link Sql.impl.TableImpl#getTableSchem <em>Table Schem</em>}</li>
 *   <li>{@link Sql.impl.TableImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link Sql.impl.TableImpl#getTableType <em>Table Type</em>}</li>
 *   <li>{@link Sql.impl.TableImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link Sql.impl.TableImpl#getTypeCat <em>Type Cat</em>}</li>
 *   <li>{@link Sql.impl.TableImpl#getTypeSchem <em>Type Schem</em>}</li>
 *   <li>{@link Sql.impl.TableImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link Sql.impl.TableImpl#getSelfReferencingColName <em>Self Referencing Col Name</em>}</li>
 *   <li>{@link Sql.impl.TableImpl#getRefGeneration <em>Ref Generation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
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
	 * The default value of the '{@link #getTableType() <em>Table Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableType()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTypeCat() <em>Type Cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCat()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_CAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTypeSchem() <em>Type Schem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSchem()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_SCHEM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSelfReferencingColName() <em>Self Referencing Col Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfReferencingColName()
	 * @generated
	 * @ordered
	 */
	protected static final String SELF_REFERENCING_COL_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRefGeneration() <em>Ref Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefGeneration()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_GENERATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.TABLE;
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
		return (String)eDynamicGet(SqlPackage.TABLE__TABLE_CAT, SqlPackage.Literals.TABLE__TABLE_CAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableCat(String newTableCat) {
		eDynamicSet(SqlPackage.TABLE__TABLE_CAT, SqlPackage.Literals.TABLE__TABLE_CAT, newTableCat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableSchem() {
		return (String)eDynamicGet(SqlPackage.TABLE__TABLE_SCHEM, SqlPackage.Literals.TABLE__TABLE_SCHEM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableSchem(String newTableSchem) {
		eDynamicSet(SqlPackage.TABLE__TABLE_SCHEM, SqlPackage.Literals.TABLE__TABLE_SCHEM, newTableSchem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableName() {
		return (String)eDynamicGet(SqlPackage.TABLE__TABLE_NAME, SqlPackage.Literals.TABLE__TABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableName(String newTableName) {
		eDynamicSet(SqlPackage.TABLE__TABLE_NAME, SqlPackage.Literals.TABLE__TABLE_NAME, newTableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableType() {
		return (String)eDynamicGet(SqlPackage.TABLE__TABLE_TYPE, SqlPackage.Literals.TABLE__TABLE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableType(String newTableType) {
		eDynamicSet(SqlPackage.TABLE__TABLE_TYPE, SqlPackage.Literals.TABLE__TABLE_TYPE, newTableType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return (String)eDynamicGet(SqlPackage.TABLE__REMARKS, SqlPackage.Literals.TABLE__REMARKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		eDynamicSet(SqlPackage.TABLE__REMARKS, SqlPackage.Literals.TABLE__REMARKS, newRemarks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeCat() {
		return (String)eDynamicGet(SqlPackage.TABLE__TYPE_CAT, SqlPackage.Literals.TABLE__TYPE_CAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeCat(String newTypeCat) {
		eDynamicSet(SqlPackage.TABLE__TYPE_CAT, SqlPackage.Literals.TABLE__TYPE_CAT, newTypeCat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeSchem() {
		return (String)eDynamicGet(SqlPackage.TABLE__TYPE_SCHEM, SqlPackage.Literals.TABLE__TYPE_SCHEM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeSchem(String newTypeSchem) {
		eDynamicSet(SqlPackage.TABLE__TYPE_SCHEM, SqlPackage.Literals.TABLE__TYPE_SCHEM, newTypeSchem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeName() {
		return (String)eDynamicGet(SqlPackage.TABLE__TYPE_NAME, SqlPackage.Literals.TABLE__TYPE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeName(String newTypeName) {
		eDynamicSet(SqlPackage.TABLE__TYPE_NAME, SqlPackage.Literals.TABLE__TYPE_NAME, newTypeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSelfReferencingColName() {
		return (String)eDynamicGet(SqlPackage.TABLE__SELF_REFERENCING_COL_NAME, SqlPackage.Literals.TABLE__SELF_REFERENCING_COL_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelfReferencingColName(String newSelfReferencingColName) {
		eDynamicSet(SqlPackage.TABLE__SELF_REFERENCING_COL_NAME, SqlPackage.Literals.TABLE__SELF_REFERENCING_COL_NAME, newSelfReferencingColName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRefGeneration() {
		return (String)eDynamicGet(SqlPackage.TABLE__REF_GENERATION, SqlPackage.Literals.TABLE__REF_GENERATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefGeneration(String newRefGeneration) {
		eDynamicSet(SqlPackage.TABLE__REF_GENERATION, SqlPackage.Literals.TABLE__REF_GENERATION, newRefGeneration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlPackage.TABLE__TABLE_CAT:
				return getTableCat();
			case SqlPackage.TABLE__TABLE_SCHEM:
				return getTableSchem();
			case SqlPackage.TABLE__TABLE_NAME:
				return getTableName();
			case SqlPackage.TABLE__TABLE_TYPE:
				return getTableType();
			case SqlPackage.TABLE__REMARKS:
				return getRemarks();
			case SqlPackage.TABLE__TYPE_CAT:
				return getTypeCat();
			case SqlPackage.TABLE__TYPE_SCHEM:
				return getTypeSchem();
			case SqlPackage.TABLE__TYPE_NAME:
				return getTypeName();
			case SqlPackage.TABLE__SELF_REFERENCING_COL_NAME:
				return getSelfReferencingColName();
			case SqlPackage.TABLE__REF_GENERATION:
				return getRefGeneration();
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
			case SqlPackage.TABLE__TABLE_CAT:
				setTableCat((String)newValue);
				return;
			case SqlPackage.TABLE__TABLE_SCHEM:
				setTableSchem((String)newValue);
				return;
			case SqlPackage.TABLE__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case SqlPackage.TABLE__TABLE_TYPE:
				setTableType((String)newValue);
				return;
			case SqlPackage.TABLE__REMARKS:
				setRemarks((String)newValue);
				return;
			case SqlPackage.TABLE__TYPE_CAT:
				setTypeCat((String)newValue);
				return;
			case SqlPackage.TABLE__TYPE_SCHEM:
				setTypeSchem((String)newValue);
				return;
			case SqlPackage.TABLE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case SqlPackage.TABLE__SELF_REFERENCING_COL_NAME:
				setSelfReferencingColName((String)newValue);
				return;
			case SqlPackage.TABLE__REF_GENERATION:
				setRefGeneration((String)newValue);
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
			case SqlPackage.TABLE__TABLE_CAT:
				setTableCat(TABLE_CAT_EDEFAULT);
				return;
			case SqlPackage.TABLE__TABLE_SCHEM:
				setTableSchem(TABLE_SCHEM_EDEFAULT);
				return;
			case SqlPackage.TABLE__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case SqlPackage.TABLE__TABLE_TYPE:
				setTableType(TABLE_TYPE_EDEFAULT);
				return;
			case SqlPackage.TABLE__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case SqlPackage.TABLE__TYPE_CAT:
				setTypeCat(TYPE_CAT_EDEFAULT);
				return;
			case SqlPackage.TABLE__TYPE_SCHEM:
				setTypeSchem(TYPE_SCHEM_EDEFAULT);
				return;
			case SqlPackage.TABLE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case SqlPackage.TABLE__SELF_REFERENCING_COL_NAME:
				setSelfReferencingColName(SELF_REFERENCING_COL_NAME_EDEFAULT);
				return;
			case SqlPackage.TABLE__REF_GENERATION:
				setRefGeneration(REF_GENERATION_EDEFAULT);
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
			case SqlPackage.TABLE__TABLE_CAT:
				return TABLE_CAT_EDEFAULT == null ? getTableCat() != null : !TABLE_CAT_EDEFAULT.equals(getTableCat());
			case SqlPackage.TABLE__TABLE_SCHEM:
				return TABLE_SCHEM_EDEFAULT == null ? getTableSchem() != null : !TABLE_SCHEM_EDEFAULT.equals(getTableSchem());
			case SqlPackage.TABLE__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? getTableName() != null : !TABLE_NAME_EDEFAULT.equals(getTableName());
			case SqlPackage.TABLE__TABLE_TYPE:
				return TABLE_TYPE_EDEFAULT == null ? getTableType() != null : !TABLE_TYPE_EDEFAULT.equals(getTableType());
			case SqlPackage.TABLE__REMARKS:
				return REMARKS_EDEFAULT == null ? getRemarks() != null : !REMARKS_EDEFAULT.equals(getRemarks());
			case SqlPackage.TABLE__TYPE_CAT:
				return TYPE_CAT_EDEFAULT == null ? getTypeCat() != null : !TYPE_CAT_EDEFAULT.equals(getTypeCat());
			case SqlPackage.TABLE__TYPE_SCHEM:
				return TYPE_SCHEM_EDEFAULT == null ? getTypeSchem() != null : !TYPE_SCHEM_EDEFAULT.equals(getTypeSchem());
			case SqlPackage.TABLE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? getTypeName() != null : !TYPE_NAME_EDEFAULT.equals(getTypeName());
			case SqlPackage.TABLE__SELF_REFERENCING_COL_NAME:
				return SELF_REFERENCING_COL_NAME_EDEFAULT == null ? getSelfReferencingColName() != null : !SELF_REFERENCING_COL_NAME_EDEFAULT.equals(getSelfReferencingColName());
			case SqlPackage.TABLE__REF_GENERATION:
				return REF_GENERATION_EDEFAULT == null ? getRefGeneration() != null : !REF_GENERATION_EDEFAULT.equals(getRefGeneration());
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
