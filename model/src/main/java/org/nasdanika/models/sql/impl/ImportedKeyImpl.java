/**
 */
package org.nasdanika.models.sql.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.sql.Deferrability;
import org.nasdanika.models.sql.ImportedKey;
import org.nasdanika.models.sql.ImportedKeyColumn;
import org.nasdanika.models.sql.ImportedKeyRule;
import org.nasdanika.models.sql.PrimaryKey;
import org.nasdanika.models.sql.SqlPackage;
import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imported Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.impl.ImportedKeyImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ImportedKeyImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ImportedKeyImpl#getUpdateRule <em>Update Rule</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ImportedKeyImpl#getDeleteRule <em>Delete Rule</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.ImportedKeyImpl#getDeferrability <em>Deferrability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportedKeyImpl extends DocumentedNamedElementImpl implements ImportedKey {
	/**
	 * The default value of the '{@link #getUpdateRule() <em>Update Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateRule()
	 * @generated
	 * @ordered
	 */
	protected static final ImportedKeyRule UPDATE_RULE_EDEFAULT = ImportedKeyRule.KEY_CASCADE;
	/**
	 * The default value of the '{@link #getDeleteRule() <em>Delete Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteRule()
	 * @generated
	 * @ordered
	 */
	protected static final ImportedKeyRule DELETE_RULE_EDEFAULT = ImportedKeyRule.KEY_CASCADE;
	/**
	 * The default value of the '{@link #getDeferrability() <em>Deferrability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrability()
	 * @generated
	 * @ordered
	 */
	protected static final Deferrability DEFERRABILITY_EDEFAULT = Deferrability.INITIALLY_DEFERRED;

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
	@SuppressWarnings("unchecked")
	@Override
	public EList<ImportedKeyColumn> getColumns() {
		return (EList<ImportedKeyColumn>)eDynamicGet(SqlPackage.IMPORTED_KEY__COLUMNS, SqlPackage.Literals.IMPORTED_KEY__COLUMNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryKey getPrimaryKey() {
		return (PrimaryKey)eDynamicGet(SqlPackage.IMPORTED_KEY__PRIMARY_KEY, SqlPackage.Literals.IMPORTED_KEY__PRIMARY_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetPrimaryKey() {
		return (PrimaryKey)eDynamicGet(SqlPackage.IMPORTED_KEY__PRIMARY_KEY, SqlPackage.Literals.IMPORTED_KEY__PRIMARY_KEY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__PRIMARY_KEY, SqlPackage.Literals.IMPORTED_KEY__PRIMARY_KEY, newPrimaryKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportedKeyRule getUpdateRule() {
		return (ImportedKeyRule)eDynamicGet(SqlPackage.IMPORTED_KEY__UPDATE_RULE, SqlPackage.Literals.IMPORTED_KEY__UPDATE_RULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdateRule(ImportedKeyRule newUpdateRule) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__UPDATE_RULE, SqlPackage.Literals.IMPORTED_KEY__UPDATE_RULE, newUpdateRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportedKeyRule getDeleteRule() {
		return (ImportedKeyRule)eDynamicGet(SqlPackage.IMPORTED_KEY__DELETE_RULE, SqlPackage.Literals.IMPORTED_KEY__DELETE_RULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteRule(ImportedKeyRule newDeleteRule) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__DELETE_RULE, SqlPackage.Literals.IMPORTED_KEY__DELETE_RULE, newDeleteRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deferrability getDeferrability() {
		return (Deferrability)eDynamicGet(SqlPackage.IMPORTED_KEY__DEFERRABILITY, SqlPackage.Literals.IMPORTED_KEY__DEFERRABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeferrability(Deferrability newDeferrability) {
		eDynamicSet(SqlPackage.IMPORTED_KEY__DEFERRABILITY, SqlPackage.Literals.IMPORTED_KEY__DEFERRABILITY, newDeferrability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SqlPackage.IMPORTED_KEY__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
			case SqlPackage.IMPORTED_KEY__COLUMNS:
				return getColumns();
			case SqlPackage.IMPORTED_KEY__PRIMARY_KEY:
				if (resolve) return getPrimaryKey();
				return basicGetPrimaryKey();
			case SqlPackage.IMPORTED_KEY__UPDATE_RULE:
				return getUpdateRule();
			case SqlPackage.IMPORTED_KEY__DELETE_RULE:
				return getDeleteRule();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SqlPackage.IMPORTED_KEY__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends ImportedKeyColumn>)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__UPDATE_RULE:
				setUpdateRule((ImportedKeyRule)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__DELETE_RULE:
				setDeleteRule((ImportedKeyRule)newValue);
				return;
			case SqlPackage.IMPORTED_KEY__DEFERRABILITY:
				setDeferrability((Deferrability)newValue);
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
			case SqlPackage.IMPORTED_KEY__COLUMNS:
				getColumns().clear();
				return;
			case SqlPackage.IMPORTED_KEY__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)null);
				return;
			case SqlPackage.IMPORTED_KEY__UPDATE_RULE:
				setUpdateRule(UPDATE_RULE_EDEFAULT);
				return;
			case SqlPackage.IMPORTED_KEY__DELETE_RULE:
				setDeleteRule(DELETE_RULE_EDEFAULT);
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
			case SqlPackage.IMPORTED_KEY__COLUMNS:
				return !getColumns().isEmpty();
			case SqlPackage.IMPORTED_KEY__PRIMARY_KEY:
				return basicGetPrimaryKey() != null;
			case SqlPackage.IMPORTED_KEY__UPDATE_RULE:
				return getUpdateRule() != UPDATE_RULE_EDEFAULT;
			case SqlPackage.IMPORTED_KEY__DELETE_RULE:
				return getDeleteRule() != DELETE_RULE_EDEFAULT;
			case SqlPackage.IMPORTED_KEY__DEFERRABILITY:
				return getDeferrability() != DEFERRABILITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ImportedKeyImpl
