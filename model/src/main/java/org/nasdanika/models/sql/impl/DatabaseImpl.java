/**
 */
package org.nasdanika.models.sql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.sql.Catalog;
import org.nasdanika.models.sql.DataType;
import org.nasdanika.models.sql.Database;
import org.nasdanika.models.sql.SqlPackage;

import org.nasdanika.models.sql.TableType;
import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.impl.DatabaseImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.DatabaseImpl#getDriverClass <em>Driver Class</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.DatabaseImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.DatabaseImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.DatabaseImpl#getTableTypes <em>Table Types</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.impl.DatabaseImpl#getCatalogs <em>Catalogs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseImpl extends DocumentedNamedElementImpl implements Database {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDriverClass() <em>Driver Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_CLASS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(SqlPackage.DATABASE__URL, SqlPackage.Literals.DATABASE__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(SqlPackage.DATABASE__URL, SqlPackage.Literals.DATABASE__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriverClass() {
		return (String)eDynamicGet(SqlPackage.DATABASE__DRIVER_CLASS, SqlPackage.Literals.DATABASE__DRIVER_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriverClass(String newDriverClass) {
		eDynamicSet(SqlPackage.DATABASE__DRIVER_CLASS, SqlPackage.Literals.DATABASE__DRIVER_CLASS, newDriverClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getDependencies() {
		return (EList<String>)eDynamicGet(SqlPackage.DATABASE__DEPENDENCIES, SqlPackage.Literals.DATABASE__DEPENDENCIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DataType> getDataTypes() {
		return (EList<DataType>)eDynamicGet(SqlPackage.DATABASE__DATA_TYPES, SqlPackage.Literals.DATABASE__DATA_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TableType> getTableTypes() {
		return (EList<TableType>)eDynamicGet(SqlPackage.DATABASE__TABLE_TYPES, SqlPackage.Literals.DATABASE__TABLE_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Catalog> getCatalogs() {
		return (EList<Catalog>)eDynamicGet(SqlPackage.DATABASE__CATALOGS, SqlPackage.Literals.DATABASE__CATALOGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SqlPackage.DATABASE__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
			case SqlPackage.DATABASE__TABLE_TYPES:
				return ((InternalEList<?>)getTableTypes()).basicRemove(otherEnd, msgs);
			case SqlPackage.DATABASE__CATALOGS:
				return ((InternalEList<?>)getCatalogs()).basicRemove(otherEnd, msgs);
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
			case SqlPackage.DATABASE__URL:
				return getUrl();
			case SqlPackage.DATABASE__DRIVER_CLASS:
				return getDriverClass();
			case SqlPackage.DATABASE__DEPENDENCIES:
				return getDependencies();
			case SqlPackage.DATABASE__DATA_TYPES:
				return getDataTypes();
			case SqlPackage.DATABASE__TABLE_TYPES:
				return getTableTypes();
			case SqlPackage.DATABASE__CATALOGS:
				return getCatalogs();
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
			case SqlPackage.DATABASE__URL:
				setUrl((String)newValue);
				return;
			case SqlPackage.DATABASE__DRIVER_CLASS:
				setDriverClass((String)newValue);
				return;
			case SqlPackage.DATABASE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends String>)newValue);
				return;
			case SqlPackage.DATABASE__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
				return;
			case SqlPackage.DATABASE__TABLE_TYPES:
				getTableTypes().clear();
				getTableTypes().addAll((Collection<? extends TableType>)newValue);
				return;
			case SqlPackage.DATABASE__CATALOGS:
				getCatalogs().clear();
				getCatalogs().addAll((Collection<? extends Catalog>)newValue);
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
			case SqlPackage.DATABASE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case SqlPackage.DATABASE__DRIVER_CLASS:
				setDriverClass(DRIVER_CLASS_EDEFAULT);
				return;
			case SqlPackage.DATABASE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case SqlPackage.DATABASE__DATA_TYPES:
				getDataTypes().clear();
				return;
			case SqlPackage.DATABASE__TABLE_TYPES:
				getTableTypes().clear();
				return;
			case SqlPackage.DATABASE__CATALOGS:
				getCatalogs().clear();
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
			case SqlPackage.DATABASE__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case SqlPackage.DATABASE__DRIVER_CLASS:
				return DRIVER_CLASS_EDEFAULT == null ? getDriverClass() != null : !DRIVER_CLASS_EDEFAULT.equals(getDriverClass());
			case SqlPackage.DATABASE__DEPENDENCIES:
				return !getDependencies().isEmpty();
			case SqlPackage.DATABASE__DATA_TYPES:
				return !getDataTypes().isEmpty();
			case SqlPackage.DATABASE__TABLE_TYPES:
				return !getTableTypes().isEmpty();
			case SqlPackage.DATABASE__CATALOGS:
				return !getCatalogs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DatabaseImpl
