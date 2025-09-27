/**
 */
package org.nasdanika.models.sql.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.models.sql.Column;
import org.nasdanika.models.sql.ForeignKey;
import org.nasdanika.models.sql.PrimaryKey;
import org.nasdanika.models.sql.SqlPackage;

import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.impl.PrimaryKeyImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.PrimaryKeyImpl#getExportedKeys <em>Exported Keys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryKeyImpl extends DocumentedNamedElementImpl implements PrimaryKey {
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Column> getColumns() {
		return (EList<Column>)eDynamicGet(SqlPackage.PRIMARY_KEY__COLUMNS, SqlPackage.Literals.PRIMARY_KEY__COLUMNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForeignKey getExportedKeys() {
		return (ForeignKey)eDynamicGet(SqlPackage.PRIMARY_KEY__EXPORTED_KEYS, SqlPackage.Literals.PRIMARY_KEY__EXPORTED_KEYS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKey basicGetExportedKeys() {
		return (ForeignKey)eDynamicGet(SqlPackage.PRIMARY_KEY__EXPORTED_KEYS, SqlPackage.Literals.PRIMARY_KEY__EXPORTED_KEYS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExportedKeys(ForeignKey newExportedKeys, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExportedKeys, SqlPackage.PRIMARY_KEY__EXPORTED_KEYS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExportedKeys(ForeignKey newExportedKeys) {
		eDynamicSet(SqlPackage.PRIMARY_KEY__EXPORTED_KEYS, SqlPackage.Literals.PRIMARY_KEY__EXPORTED_KEYS, newExportedKeys);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SqlPackage.PRIMARY_KEY__EXPORTED_KEYS:
				ForeignKey exportedKeys = basicGetExportedKeys();
				if (exportedKeys != null)
					msgs = ((InternalEObject)exportedKeys).eInverseRemove(this, SqlPackage.FOREIGN_KEY__PRIMARY_KEY, ForeignKey.class, msgs);
				return basicSetExportedKeys((ForeignKey)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SqlPackage.PRIMARY_KEY__EXPORTED_KEYS:
				return basicSetExportedKeys(null, msgs);
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
			case SqlPackage.PRIMARY_KEY__COLUMNS:
				return getColumns();
			case SqlPackage.PRIMARY_KEY__EXPORTED_KEYS:
				if (resolve) return getExportedKeys();
				return basicGetExportedKeys();
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
			case SqlPackage.PRIMARY_KEY__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case SqlPackage.PRIMARY_KEY__EXPORTED_KEYS:
				setExportedKeys((ForeignKey)newValue);
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
			case SqlPackage.PRIMARY_KEY__COLUMNS:
				getColumns().clear();
				return;
			case SqlPackage.PRIMARY_KEY__EXPORTED_KEYS:
				setExportedKeys((ForeignKey)null);
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
			case SqlPackage.PRIMARY_KEY__COLUMNS:
				return !getColumns().isEmpty();
			case SqlPackage.PRIMARY_KEY__EXPORTED_KEYS:
				return basicGetExportedKeys() != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimaryKeyImpl
