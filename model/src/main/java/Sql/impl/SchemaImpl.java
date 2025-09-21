/**
 */
package Sql.impl;

import Sql.Schema;
import Sql.SqlPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Sql.impl.SchemaImpl#getTableSchem <em>Table Schem</em>}</li>
 *   <li>{@link Sql.impl.SchemaImpl#getTableCatalog <em>Table Catalog</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements Schema {
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
	 * The default value of the '{@link #getTableCatalog() <em>Table Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_CATALOG_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.SCHEMA;
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
	public String getTableSchem() {
		return (String)eDynamicGet(SqlPackage.SCHEMA__TABLE_SCHEM, SqlPackage.Literals.SCHEMA__TABLE_SCHEM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableSchem(String newTableSchem) {
		eDynamicSet(SqlPackage.SCHEMA__TABLE_SCHEM, SqlPackage.Literals.SCHEMA__TABLE_SCHEM, newTableSchem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableCatalog() {
		return (String)eDynamicGet(SqlPackage.SCHEMA__TABLE_CATALOG, SqlPackage.Literals.SCHEMA__TABLE_CATALOG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableCatalog(String newTableCatalog) {
		eDynamicSet(SqlPackage.SCHEMA__TABLE_CATALOG, SqlPackage.Literals.SCHEMA__TABLE_CATALOG, newTableCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SqlPackage.SCHEMA__TABLE_SCHEM:
				return getTableSchem();
			case SqlPackage.SCHEMA__TABLE_CATALOG:
				return getTableCatalog();
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
			case SqlPackage.SCHEMA__TABLE_SCHEM:
				setTableSchem((String)newValue);
				return;
			case SqlPackage.SCHEMA__TABLE_CATALOG:
				setTableCatalog((String)newValue);
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
			case SqlPackage.SCHEMA__TABLE_SCHEM:
				setTableSchem(TABLE_SCHEM_EDEFAULT);
				return;
			case SqlPackage.SCHEMA__TABLE_CATALOG:
				setTableCatalog(TABLE_CATALOG_EDEFAULT);
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
			case SqlPackage.SCHEMA__TABLE_SCHEM:
				return TABLE_SCHEM_EDEFAULT == null ? getTableSchem() != null : !TABLE_SCHEM_EDEFAULT.equals(getTableSchem());
			case SqlPackage.SCHEMA__TABLE_CATALOG:
				return TABLE_CATALOG_EDEFAULT == null ? getTableCatalog() != null : !TABLE_CATALOG_EDEFAULT.equals(getTableCatalog());
		}
		return super.eIsSet(featureID);
	}

} //SchemaImpl
