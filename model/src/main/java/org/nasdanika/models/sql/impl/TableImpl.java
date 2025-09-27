/**
 */
package org.nasdanika.models.sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.sql.Column;
import org.nasdanika.models.sql.ForeignKey;
import org.nasdanika.models.sql.PrimaryKey;
import org.nasdanika.models.sql.SqlPackage;
import org.nasdanika.models.sql.Table;
import org.nasdanika.models.sql.TableType;

import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.impl.TableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.TableImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.TableImpl#getImportedKeys <em>Imported Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends DocumentedNamedElementImpl implements Table {
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
	public TableType getType() {
		return (TableType)eDynamicGet(SqlPackage.TABLE__TYPE, SqlPackage.Literals.TABLE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType basicGetType() {
		return (TableType)eDynamicGet(SqlPackage.TABLE__TYPE, SqlPackage.Literals.TABLE__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TableType newType) {
		eDynamicSet(SqlPackage.TABLE__TYPE, SqlPackage.Literals.TABLE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Column> getColumns() {
		return (EList<Column>)eDynamicGet(SqlPackage.TABLE__COLUMNS, SqlPackage.Literals.TABLE__COLUMNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryKey getPrimaryKey() {
		return (PrimaryKey)eDynamicGet(SqlPackage.TABLE__PRIMARY_KEY, SqlPackage.Literals.TABLE__PRIMARY_KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPrimaryKey, SqlPackage.TABLE__PRIMARY_KEY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		eDynamicSet(SqlPackage.TABLE__PRIMARY_KEY, SqlPackage.Literals.TABLE__PRIMARY_KEY, newPrimaryKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ForeignKey> getImportedKeys() {
		return (EList<ForeignKey>)eDynamicGet(SqlPackage.TABLE__IMPORTED_KEYS, SqlPackage.Literals.TABLE__IMPORTED_KEYS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SqlPackage.TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case SqlPackage.TABLE__PRIMARY_KEY:
				return basicSetPrimaryKey(null, msgs);
			case SqlPackage.TABLE__IMPORTED_KEYS:
				return ((InternalEList<?>)getImportedKeys()).basicRemove(otherEnd, msgs);
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
			case SqlPackage.TABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case SqlPackage.TABLE__COLUMNS:
				return getColumns();
			case SqlPackage.TABLE__PRIMARY_KEY:
				return getPrimaryKey();
			case SqlPackage.TABLE__IMPORTED_KEYS:
				return getImportedKeys();
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
			case SqlPackage.TABLE__TYPE:
				setType((TableType)newValue);
				return;
			case SqlPackage.TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case SqlPackage.TABLE__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)newValue);
				return;
			case SqlPackage.TABLE__IMPORTED_KEYS:
				getImportedKeys().clear();
				getImportedKeys().addAll((Collection<? extends ForeignKey>)newValue);
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
			case SqlPackage.TABLE__TYPE:
				setType((TableType)null);
				return;
			case SqlPackage.TABLE__COLUMNS:
				getColumns().clear();
				return;
			case SqlPackage.TABLE__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)null);
				return;
			case SqlPackage.TABLE__IMPORTED_KEYS:
				getImportedKeys().clear();
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
			case SqlPackage.TABLE__TYPE:
				return basicGetType() != null;
			case SqlPackage.TABLE__COLUMNS:
				return !getColumns().isEmpty();
			case SqlPackage.TABLE__PRIMARY_KEY:
				return getPrimaryKey() != null;
			case SqlPackage.TABLE__IMPORTED_KEYS:
				return !getImportedKeys().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
