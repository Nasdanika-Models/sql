/**
 */
package org.nasdanika.models.sql.ast.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.Expression;
import org.nasdanika.models.sql.ast.Insert;
import org.nasdanika.models.sql.ast.Select;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.InsertImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.InsertImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.InsertImpl#getColumnNames <em>Column Names</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.InsertImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.InsertImpl#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertImpl extends StatementImpl implements Insert {
	/**
	 * The default value of the '{@link #getSchemaName() <em>Schema Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_NAME_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.INSERT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaName() {
		return (String)eDynamicGet(AstPackage.INSERT__SCHEMA_NAME, AstPackage.Literals.INSERT__SCHEMA_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaName(String newSchemaName) {
		eDynamicSet(AstPackage.INSERT__SCHEMA_NAME, AstPackage.Literals.INSERT__SCHEMA_NAME, newSchemaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTableName() {
		return (String)eDynamicGet(AstPackage.INSERT__TABLE_NAME, AstPackage.Literals.INSERT__TABLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableName(String newTableName) {
		eDynamicSet(AstPackage.INSERT__TABLE_NAME, AstPackage.Literals.INSERT__TABLE_NAME, newTableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getColumnNames() {
		return (EList<String>)eDynamicGet(AstPackage.INSERT__COLUMN_NAMES, AstPackage.Literals.INSERT__COLUMN_NAMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Expression> getValues() {
		return (EList<Expression>)eDynamicGet(AstPackage.INSERT__VALUES, AstPackage.Literals.INSERT__VALUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Select getSelect() {
		return (Select)eDynamicGet(AstPackage.INSERT__SELECT, AstPackage.Literals.INSERT__SELECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelect(Select newSelect, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSelect, AstPackage.INSERT__SELECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelect(Select newSelect) {
		eDynamicSet(AstPackage.INSERT__SELECT, AstPackage.Literals.INSERT__SELECT, newSelect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.INSERT__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case AstPackage.INSERT__SELECT:
				return basicSetSelect(null, msgs);
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
			case AstPackage.INSERT__SCHEMA_NAME:
				return getSchemaName();
			case AstPackage.INSERT__TABLE_NAME:
				return getTableName();
			case AstPackage.INSERT__COLUMN_NAMES:
				return getColumnNames();
			case AstPackage.INSERT__VALUES:
				return getValues();
			case AstPackage.INSERT__SELECT:
				return getSelect();
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
			case AstPackage.INSERT__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case AstPackage.INSERT__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case AstPackage.INSERT__COLUMN_NAMES:
				getColumnNames().clear();
				getColumnNames().addAll((Collection<? extends String>)newValue);
				return;
			case AstPackage.INSERT__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Expression>)newValue);
				return;
			case AstPackage.INSERT__SELECT:
				setSelect((Select)newValue);
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
			case AstPackage.INSERT__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case AstPackage.INSERT__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case AstPackage.INSERT__COLUMN_NAMES:
				getColumnNames().clear();
				return;
			case AstPackage.INSERT__VALUES:
				getValues().clear();
				return;
			case AstPackage.INSERT__SELECT:
				setSelect((Select)null);
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
			case AstPackage.INSERT__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? getSchemaName() != null : !SCHEMA_NAME_EDEFAULT.equals(getSchemaName());
			case AstPackage.INSERT__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? getTableName() != null : !TABLE_NAME_EDEFAULT.equals(getTableName());
			case AstPackage.INSERT__COLUMN_NAMES:
				return !getColumnNames().isEmpty();
			case AstPackage.INSERT__VALUES:
				return !getValues().isEmpty();
			case AstPackage.INSERT__SELECT:
				return getSelect() != null;
		}
		return super.eIsSet(featureID);
	}

} //InsertImpl
