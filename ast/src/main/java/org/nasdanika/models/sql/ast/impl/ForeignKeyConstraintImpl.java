/**
 */
package org.nasdanika.models.sql.ast.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.ForeignKeyConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ForeignKeyConstraintImpl#getColumnNames <em>Column Names</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ForeignKeyConstraintImpl#getReferencedTable <em>Referenced Table</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ForeignKeyConstraintImpl#getReferencedSchema <em>Referenced Schema</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ForeignKeyConstraintImpl#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ForeignKeyConstraintImpl#getOnDelete <em>On Delete</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ForeignKeyConstraintImpl#getOnUpdate <em>On Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyConstraintImpl extends TableConstraintImpl implements ForeignKeyConstraint {
	/**
	 * The default value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_TABLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReferencedSchema() <em>Referenced Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_SCHEMA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnDelete() <em>On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDelete()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_DELETE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOnUpdate() <em>On Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final String ON_UPDATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.FOREIGN_KEY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getColumnNames() {
		return (EList<String>)eDynamicGet(AstPackage.FOREIGN_KEY_CONSTRAINT__COLUMN_NAMES, AstPackage.Literals.FOREIGN_KEY_CONSTRAINT__COLUMN_NAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferencedTable() {
		return (String)eDynamicGet(AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_TABLE, AstPackage.Literals.FOREIGN_KEY_CONSTRAINT__REFERENCED_TABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedTable(String newReferencedTable) {
		eDynamicSet(AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_TABLE, AstPackage.Literals.FOREIGN_KEY_CONSTRAINT__REFERENCED_TABLE, newReferencedTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferencedSchema() {
		return (String)eDynamicGet(AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_SCHEMA, AstPackage.Literals.FOREIGN_KEY_CONSTRAINT__REFERENCED_SCHEMA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedSchema(String newReferencedSchema) {
		eDynamicSet(AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_SCHEMA, AstPackage.Literals.FOREIGN_KEY_CONSTRAINT__REFERENCED_SCHEMA, newReferencedSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getReferencedColumns() {
		return (EList<String>)eDynamicGet(AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_COLUMNS, AstPackage.Literals.FOREIGN_KEY_CONSTRAINT__REFERENCED_COLUMNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnDelete() {
		return (String)eDynamicGet(AstPackage.FOREIGN_KEY_CONSTRAINT__ON_DELETE, AstPackage.Literals.FOREIGN_KEY_CONSTRAINT__ON_DELETE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnDelete(String newOnDelete) {
		eDynamicSet(AstPackage.FOREIGN_KEY_CONSTRAINT__ON_DELETE, AstPackage.Literals.FOREIGN_KEY_CONSTRAINT__ON_DELETE, newOnDelete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnUpdate() {
		return (String)eDynamicGet(AstPackage.FOREIGN_KEY_CONSTRAINT__ON_UPDATE, AstPackage.Literals.FOREIGN_KEY_CONSTRAINT__ON_UPDATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnUpdate(String newOnUpdate) {
		eDynamicSet(AstPackage.FOREIGN_KEY_CONSTRAINT__ON_UPDATE, AstPackage.Literals.FOREIGN_KEY_CONSTRAINT__ON_UPDATE, newOnUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.FOREIGN_KEY_CONSTRAINT__COLUMN_NAMES:
				return getColumnNames();
			case AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_TABLE:
				return getReferencedTable();
			case AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_SCHEMA:
				return getReferencedSchema();
			case AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_COLUMNS:
				return getReferencedColumns();
			case AstPackage.FOREIGN_KEY_CONSTRAINT__ON_DELETE:
				return getOnDelete();
			case AstPackage.FOREIGN_KEY_CONSTRAINT__ON_UPDATE:
				return getOnUpdate();
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
			case AstPackage.FOREIGN_KEY_CONSTRAINT__COLUMN_NAMES:
				getColumnNames().clear();
				getColumnNames().addAll((Collection<? extends String>)newValue);
				return;
			case AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_TABLE:
				setReferencedTable((String)newValue);
				return;
			case AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_SCHEMA:
				setReferencedSchema((String)newValue);
				return;
			case AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_COLUMNS:
				getReferencedColumns().clear();
				getReferencedColumns().addAll((Collection<? extends String>)newValue);
				return;
			case AstPackage.FOREIGN_KEY_CONSTRAINT__ON_DELETE:
				setOnDelete((String)newValue);
				return;
			case AstPackage.FOREIGN_KEY_CONSTRAINT__ON_UPDATE:
				setOnUpdate((String)newValue);
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
			case AstPackage.FOREIGN_KEY_CONSTRAINT__COLUMN_NAMES:
				getColumnNames().clear();
				return;
			case AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_TABLE:
				setReferencedTable(REFERENCED_TABLE_EDEFAULT);
				return;
			case AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_SCHEMA:
				setReferencedSchema(REFERENCED_SCHEMA_EDEFAULT);
				return;
			case AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_COLUMNS:
				getReferencedColumns().clear();
				return;
			case AstPackage.FOREIGN_KEY_CONSTRAINT__ON_DELETE:
				setOnDelete(ON_DELETE_EDEFAULT);
				return;
			case AstPackage.FOREIGN_KEY_CONSTRAINT__ON_UPDATE:
				setOnUpdate(ON_UPDATE_EDEFAULT);
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
			case AstPackage.FOREIGN_KEY_CONSTRAINT__COLUMN_NAMES:
				return !getColumnNames().isEmpty();
			case AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_TABLE:
				return REFERENCED_TABLE_EDEFAULT == null ? getReferencedTable() != null : !REFERENCED_TABLE_EDEFAULT.equals(getReferencedTable());
			case AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_SCHEMA:
				return REFERENCED_SCHEMA_EDEFAULT == null ? getReferencedSchema() != null : !REFERENCED_SCHEMA_EDEFAULT.equals(getReferencedSchema());
			case AstPackage.FOREIGN_KEY_CONSTRAINT__REFERENCED_COLUMNS:
				return !getReferencedColumns().isEmpty();
			case AstPackage.FOREIGN_KEY_CONSTRAINT__ON_DELETE:
				return ON_DELETE_EDEFAULT == null ? getOnDelete() != null : !ON_DELETE_EDEFAULT.equals(getOnDelete());
			case AstPackage.FOREIGN_KEY_CONSTRAINT__ON_UPDATE:
				return ON_UPDATE_EDEFAULT == null ? getOnUpdate() != null : !ON_UPDATE_EDEFAULT.equals(getOnUpdate());
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyConstraintImpl
