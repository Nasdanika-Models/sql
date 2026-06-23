/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.CreateView;
import org.nasdanika.models.sql.ast.Select;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateViewImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateViewImpl#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateViewImpl#isOrReplace <em>Or Replace</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CreateViewImpl#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateViewImpl extends StatementImpl implements CreateView {
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
	 * The default value of the '{@link #getViewName() <em>View Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewName()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isOrReplace() <em>Or Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrReplace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OR_REPLACE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.CREATE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaName() {
		return (String)eDynamicGet(AstPackage.CREATE_VIEW__SCHEMA_NAME, AstPackage.Literals.CREATE_VIEW__SCHEMA_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaName(String newSchemaName) {
		eDynamicSet(AstPackage.CREATE_VIEW__SCHEMA_NAME, AstPackage.Literals.CREATE_VIEW__SCHEMA_NAME, newSchemaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewName() {
		return (String)eDynamicGet(AstPackage.CREATE_VIEW__VIEW_NAME, AstPackage.Literals.CREATE_VIEW__VIEW_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewName(String newViewName) {
		eDynamicSet(AstPackage.CREATE_VIEW__VIEW_NAME, AstPackage.Literals.CREATE_VIEW__VIEW_NAME, newViewName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrReplace() {
		return (Boolean)eDynamicGet(AstPackage.CREATE_VIEW__OR_REPLACE, AstPackage.Literals.CREATE_VIEW__OR_REPLACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrReplace(boolean newOrReplace) {
		eDynamicSet(AstPackage.CREATE_VIEW__OR_REPLACE, AstPackage.Literals.CREATE_VIEW__OR_REPLACE, newOrReplace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Select getQuery() {
		return (Select)eDynamicGet(AstPackage.CREATE_VIEW__QUERY, AstPackage.Literals.CREATE_VIEW__QUERY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(Select newQuery, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newQuery, AstPackage.CREATE_VIEW__QUERY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuery(Select newQuery) {
		eDynamicSet(AstPackage.CREATE_VIEW__QUERY, AstPackage.Literals.CREATE_VIEW__QUERY, newQuery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.CREATE_VIEW__QUERY:
				return basicSetQuery(null, msgs);
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
			case AstPackage.CREATE_VIEW__SCHEMA_NAME:
				return getSchemaName();
			case AstPackage.CREATE_VIEW__VIEW_NAME:
				return getViewName();
			case AstPackage.CREATE_VIEW__OR_REPLACE:
				return isOrReplace();
			case AstPackage.CREATE_VIEW__QUERY:
				return getQuery();
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
			case AstPackage.CREATE_VIEW__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case AstPackage.CREATE_VIEW__VIEW_NAME:
				setViewName((String)newValue);
				return;
			case AstPackage.CREATE_VIEW__OR_REPLACE:
				setOrReplace((Boolean)newValue);
				return;
			case AstPackage.CREATE_VIEW__QUERY:
				setQuery((Select)newValue);
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
			case AstPackage.CREATE_VIEW__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case AstPackage.CREATE_VIEW__VIEW_NAME:
				setViewName(VIEW_NAME_EDEFAULT);
				return;
			case AstPackage.CREATE_VIEW__OR_REPLACE:
				setOrReplace(OR_REPLACE_EDEFAULT);
				return;
			case AstPackage.CREATE_VIEW__QUERY:
				setQuery((Select)null);
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
			case AstPackage.CREATE_VIEW__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? getSchemaName() != null : !SCHEMA_NAME_EDEFAULT.equals(getSchemaName());
			case AstPackage.CREATE_VIEW__VIEW_NAME:
				return VIEW_NAME_EDEFAULT == null ? getViewName() != null : !VIEW_NAME_EDEFAULT.equals(getViewName());
			case AstPackage.CREATE_VIEW__OR_REPLACE:
				return isOrReplace() != OR_REPLACE_EDEFAULT;
			case AstPackage.CREATE_VIEW__QUERY:
				return getQuery() != null;
		}
		return super.eIsSet(featureID);
	}

} //CreateViewImpl
