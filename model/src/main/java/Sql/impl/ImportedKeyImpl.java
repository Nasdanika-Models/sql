/**
 */
package Sql.impl;

import Sql.ImportedKey;
import Sql.SqlPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imported Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getPktableCat <em>Pktable Cat</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getPktableSchem <em>Pktable Schem</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getPktableName <em>Pktable Name</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getPkcolumnName <em>Pkcolumn Name</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getFktableCat <em>Fktable Cat</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getFktableSchem <em>Fktable Schem</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getFktableName <em>Fktable Name</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getFkcolumnName <em>Fkcolumn Name</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getKeySeq <em>Key Seq</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getUpdateRule <em>Update Rule</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getDeleteRule <em>Delete Rule</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getFkName <em>Fk Name</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getPkName <em>Pk Name</em>}</li>
 *   <li>{@link Sql.impl.ImportedKeyImpl#getDeferrability <em>Deferrability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportedKeyImpl extends MinimalEObjectImpl.Container implements ImportedKey {
	/**
	 * The default value of the '{@link #getPktableCat() <em>Pktable Cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPktableCat()
	 * @generated
	 * @ordered
	 */
	protected static final String PKTABLE_CAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPktableSchem() <em>Pktable Schem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPktableSchem()
	 * @generated
	 * @ordered
	 */
	protected static final String PKTABLE_SCHEM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPktableName() <em>Pktable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPktableName()
	 * @generated
	 * @ordered
	 */
	protected static final String PKTABLE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPkcolumnName() <em>Pkcolumn Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkcolumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String PKCOLUMN_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFktableCat() <em>Fktable Cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFktableCat()
	 * @generated
	 * @ordered
	 */
	protected static final String FKTABLE_CAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFktableSchem() <em>Fktable Schem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFktableSchem()
	 * @generated
	 * @ordered
	 */
	protected static final String FKTABLE_SCHEM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFktableName() <em>Fktable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFktableName()
	 * @generated
	 * @ordered
	 */
	protected static final String FKTABLE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFkcolumnName() <em>Fkcolumn Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFkcolumnName()
	 * @generated
	 * @ordered
	 */
	protected static final String FKCOLUMN_NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getUpdateRule() <em>Update Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateRule()
	 * @generated
	 * @ordered
	 */
	protected static final Short UPDATE_RULE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDeleteRule() <em>Delete Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteRule()
	 * @generated
	 * @ordered
	 */
	protected static final Short DELETE_RULE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFkName() <em>Fk Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFkName()
	 * @generated
	 * @ordered
	 */
	protected static final String FK_NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getDeferrability() <em>Deferrability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrability()
	 * @generated
	 * @ordered
	 */
	protected static final Short DEFERRABILITY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportedKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.IMPORTED_KEY;
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
	public String getPktableCat() {
		return (String)eDynamicGet(SqlPackage.IMPORTED_KEY__PKTABLE_CAT, SqlPackage.Literals.IMPORTED_KEY__PKTABLE_CAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPktableCat(String newPktableCat) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__PKTABLE_CAT, SqlPackage.Literals.IMPORTED_KEY__PKTABLE_CAT, newPktableCat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPktableSchem() {
		return (String)eDynamicGet(SqlPackage.IMPORTED_KEY__PKTABLE_SCHEM, SqlPackage.Literals.IMPORTED_KEY__PKTABLE_SCHEM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPktableSchem(String newPktableSchem) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__PKTABLE_SCHEM, SqlPackage.Literals.IMPORTED_KEY__PKTABLE_SCHEM, newPktableSchem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPktableName() {
		return (String)eDynamicGet(SqlPackage.IMPORTED_KEY__PKTABLE_NAME, SqlPackage.Literals.IMPORTED_KEY__PKTABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPktableName(String newPktableName) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__PKTABLE_NAME, SqlPackage.Literals.IMPORTED_KEY__PKTABLE_NAME, newPktableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPkcolumnName() {
		return (String)eDynamicGet(SqlPackage.IMPORTED_KEY__PKCOLUMN_NAME, SqlPackage.Literals.IMPORTED_KEY__PKCOLUMN_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPkcolumnName(String newPkcolumnName) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__PKCOLUMN_NAME, SqlPackage.Literals.IMPORTED_KEY__PKCOLUMN_NAME, newPkcolumnName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFktableCat() {
		return (String)eDynamicGet(SqlPackage.IMPORTED_KEY__FKTABLE_CAT, SqlPackage.Literals.IMPORTED_KEY__FKTABLE_CAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFktableCat(String newFktableCat) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__FKTABLE_CAT, SqlPackage.Literals.IMPORTED_KEY__FKTABLE_CAT, newFktableCat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFktableSchem() {
		return (String)eDynamicGet(SqlPackage.IMPORTED_KEY__FKTABLE_SCHEM, SqlPackage.Literals.IMPORTED_KEY__FKTABLE_SCHEM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFktableSchem(String newFktableSchem) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__FKTABLE_SCHEM, SqlPackage.Literals.IMPORTED_KEY__FKTABLE_SCHEM, newFktableSchem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFktableName() {
		return (String)eDynamicGet(SqlPackage.IMPORTED_KEY__FKTABLE_NAME, SqlPackage.Literals.IMPORTED_KEY__FKTABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFktableName(String newFktableName) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__FKTABLE_NAME, SqlPackage.Literals.IMPORTED_KEY__FKTABLE_NAME, newFktableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFkcolumnName() {
		return (String)eDynamicGet(SqlPackage.IMPORTED_KEY__FKCOLUMN_NAME, SqlPackage.Literals.IMPORTED_KEY__FKCOLUMN_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFkcolumnName(String newFkcolumnName) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__FKCOLUMN_NAME, SqlPackage.Literals.IMPORTED_KEY__FKCOLUMN_NAME, newFkcolumnName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Short getKeySeq() {
		return (Short)eDynamicGet(SqlPackage.IMPORTED_KEY__KEY_SEQ, SqlPackage.Literals.IMPORTED_KEY__KEY_SEQ, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeySeq(Short newKeySeq) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__KEY_SEQ, SqlPackage.Literals.IMPORTED_KEY__KEY_SEQ, newKeySeq);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Short getUpdateRule() {
		return (Short)eDynamicGet(SqlPackage.IMPORTED_KEY__UPDATE_RULE, SqlPackage.Literals.IMPORTED_KEY__UPDATE_RULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateRule(Short newUpdateRule) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__UPDATE_RULE, SqlPackage.Literals.IMPORTED_KEY__UPDATE_RULE, newUpdateRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Short getDeleteRule() {
		return (Short)eDynamicGet(SqlPackage.IMPORTED_KEY__DELETE_RULE, SqlPackage.Literals.IMPORTED_KEY__DELETE_RULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteRule(Short newDeleteRule) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__DELETE_RULE, SqlPackage.Literals.IMPORTED_KEY__DELETE_RULE, newDeleteRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFkName() {
		return (String)eDynamicGet(SqlPackage.IMPORTED_KEY__FK_NAME, SqlPackage.Literals.IMPORTED_KEY__FK_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFkName(String newFkName) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__FK_NAME, SqlPackage.Literals.IMPORTED_KEY__FK_NAME, newFkName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPkName() {
		return (String)eDynamicGet(SqlPackage.IMPORTED_KEY__PK_NAME, SqlPackage.Literals.IMPORTED_KEY__PK_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPkName(String newPkName) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__PK_NAME, SqlPackage.Literals.IMPORTED_KEY__PK_NAME, newPkName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Short getDeferrability() {
		return (Short)eDynamicGet(SqlPackage.IMPORTED_KEY__DEFERRABILITY, SqlPackage.Literals.IMPORTED_KEY__DEFERRABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeferrability(Short newDeferrability) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__DEFERRABILITY, SqlPackage.Literals.IMPORTED_KEY__DEFERRABILITY, newDeferrability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlPackage.IMPORTED_KEY__PKTABLE_CAT:
				return getPktableCat();
			case SqlPackage.IMPORTED_KEY__PKTABLE_SCHEM:
				return getPktableSchem();
			case SqlPackage.IMPORTED_KEY__PKTABLE_NAME:
				return getPktableName();
			case SqlPackage.IMPORTED_KEY__PKCOLUMN_NAME:
				return getPkcolumnName();
			case SqlPackage.IMPORTED_KEY__FKTABLE_CAT:
				return getFktableCat();
			case SqlPackage.IMPORTED_KEY__FKTABLE_SCHEM:
				return getFktableSchem();
			case SqlPackage.IMPORTED_KEY__FKTABLE_NAME:
				return getFktableName();
			case SqlPackage.IMPORTED_KEY__FKCOLUMN_NAME:
				return getFkcolumnName();
			case SqlPackage.IMPORTED_KEY__KEY_SEQ:
				return getKeySeq();
			case SqlPackage.IMPORTED_KEY__UPDATE_RULE:
				return getUpdateRule();
			case SqlPackage.IMPORTED_KEY__DELETE_RULE:
				return getDeleteRule();
			case SqlPackage.IMPORTED_KEY__FK_NAME:
				return getFkName();
			case SqlPackage.IMPORTED_KEY__PK_NAME:
				return getPkName();
			case SqlPackage.IMPORTED_KEY__DEFERRABILITY:
				return getDeferrability();
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
			case SqlPackage.IMPORTED_KEY__PKTABLE_CAT:
				setPktableCat((String)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__PKTABLE_SCHEM:
				setPktableSchem((String)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__PKTABLE_NAME:
				setPktableName((String)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__PKCOLUMN_NAME:
				setPkcolumnName((String)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__FKTABLE_CAT:
				setFktableCat((String)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__FKTABLE_SCHEM:
				setFktableSchem((String)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__FKTABLE_NAME:
				setFktableName((String)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__FKCOLUMN_NAME:
				setFkcolumnName((String)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__KEY_SEQ:
				setKeySeq((Short)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__UPDATE_RULE:
				setUpdateRule((Short)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__DELETE_RULE:
				setDeleteRule((Short)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__FK_NAME:
				setFkName((String)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__PK_NAME:
				setPkName((String)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__DEFERRABILITY:
				setDeferrability((Short)newValue);
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
			case SqlPackage.IMPORTED_KEY__PKTABLE_CAT:
				setPktableCat(PKTABLE_CAT_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__PKTABLE_SCHEM:
				setPktableSchem(PKTABLE_SCHEM_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__PKTABLE_NAME:
				setPktableName(PKTABLE_NAME_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__PKCOLUMN_NAME:
				setPkcolumnName(PKCOLUMN_NAME_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__FKTABLE_CAT:
				setFktableCat(FKTABLE_CAT_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__FKTABLE_SCHEM:
				setFktableSchem(FKTABLE_SCHEM_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__FKTABLE_NAME:
				setFktableName(FKTABLE_NAME_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__FKCOLUMN_NAME:
				setFkcolumnName(FKCOLUMN_NAME_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__KEY_SEQ:
				setKeySeq(KEY_SEQ_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__UPDATE_RULE:
				setUpdateRule(UPDATE_RULE_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__DELETE_RULE:
				setDeleteRule(DELETE_RULE_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__FK_NAME:
				setFkName(FK_NAME_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__PK_NAME:
				setPkName(PK_NAME_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__DEFERRABILITY:
				setDeferrability(DEFERRABILITY_EDEFAULT);
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
			case SqlPackage.IMPORTED_KEY__PKTABLE_CAT:
				return PKTABLE_CAT_EDEFAULT == null ? getPktableCat() != null : !PKTABLE_CAT_EDEFAULT.equals(getPktableCat());
			case SqlPackage.IMPORTED_KEY__PKTABLE_SCHEM:
				return PKTABLE_SCHEM_EDEFAULT == null ? getPktableSchem() != null : !PKTABLE_SCHEM_EDEFAULT.equals(getPktableSchem());
			case SqlPackage.IMPORTED_KEY__PKTABLE_NAME:
				return PKTABLE_NAME_EDEFAULT == null ? getPktableName() != null : !PKTABLE_NAME_EDEFAULT.equals(getPktableName());
			case SqlPackage.IMPORTED_KEY__PKCOLUMN_NAME:
				return PKCOLUMN_NAME_EDEFAULT == null ? getPkcolumnName() != null : !PKCOLUMN_NAME_EDEFAULT.equals(getPkcolumnName());
			case SqlPackage.IMPORTED_KEY__FKTABLE_CAT:
				return FKTABLE_CAT_EDEFAULT == null ? getFktableCat() != null : !FKTABLE_CAT_EDEFAULT.equals(getFktableCat());
			case SqlPackage.IMPORTED_KEY__FKTABLE_SCHEM:
				return FKTABLE_SCHEM_EDEFAULT == null ? getFktableSchem() != null : !FKTABLE_SCHEM_EDEFAULT.equals(getFktableSchem());
			case SqlPackage.IMPORTED_KEY__FKTABLE_NAME:
				return FKTABLE_NAME_EDEFAULT == null ? getFktableName() != null : !FKTABLE_NAME_EDEFAULT.equals(getFktableName());
			case SqlPackage.IMPORTED_KEY__FKCOLUMN_NAME:
				return FKCOLUMN_NAME_EDEFAULT == null ? getFkcolumnName() != null : !FKCOLUMN_NAME_EDEFAULT.equals(getFkcolumnName());
			case SqlPackage.IMPORTED_KEY__KEY_SEQ:
				return KEY_SEQ_EDEFAULT == null ? getKeySeq() != null : !KEY_SEQ_EDEFAULT.equals(getKeySeq());
			case SqlPackage.IMPORTED_KEY__UPDATE_RULE:
				return UPDATE_RULE_EDEFAULT == null ? getUpdateRule() != null : !UPDATE_RULE_EDEFAULT.equals(getUpdateRule());
			case SqlPackage.IMPORTED_KEY__DELETE_RULE:
				return DELETE_RULE_EDEFAULT == null ? getDeleteRule() != null : !DELETE_RULE_EDEFAULT.equals(getDeleteRule());
			case SqlPackage.IMPORTED_KEY__FK_NAME:
				return FK_NAME_EDEFAULT == null ? getFkName() != null : !FK_NAME_EDEFAULT.equals(getFkName());
			case SqlPackage.IMPORTED_KEY__PK_NAME:
				return PK_NAME_EDEFAULT == null ? getPkName() != null : !PK_NAME_EDEFAULT.equals(getPkName());
			case SqlPackage.IMPORTED_KEY__DEFERRABILITY:
				return DEFERRABILITY_EDEFAULT == null ? getDeferrability() != null : !DEFERRABILITY_EDEFAULT.equals(getDeferrability());
		}
		return super.eIsSet(featureID);
	}

} //ImportedKeyImpl
