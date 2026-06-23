/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.DropView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.DropViewImpl#getSchemaName <em>Schema Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.DropViewImpl#getViewName <em>View Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.DropViewImpl#isIfExists <em>If Exists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropViewImpl extends StatementImpl implements DropView {
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
	 * The default value of the '{@link #isIfExists() <em>If Exists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIfExists()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IF_EXISTS_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.DROP_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchemaName() {
		return (String)eDynamicGet(AstPackage.DROP_VIEW__SCHEMA_NAME, AstPackage.Literals.DROP_VIEW__SCHEMA_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchemaName(String newSchemaName) {
		eDynamicSet(AstPackage.DROP_VIEW__SCHEMA_NAME, AstPackage.Literals.DROP_VIEW__SCHEMA_NAME, newSchemaName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViewName() {
		return (String)eDynamicGet(AstPackage.DROP_VIEW__VIEW_NAME, AstPackage.Literals.DROP_VIEW__VIEW_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewName(String newViewName) {
		eDynamicSet(AstPackage.DROP_VIEW__VIEW_NAME, AstPackage.Literals.DROP_VIEW__VIEW_NAME, newViewName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIfExists() {
		return (Boolean)eDynamicGet(AstPackage.DROP_VIEW__IF_EXISTS, AstPackage.Literals.DROP_VIEW__IF_EXISTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfExists(boolean newIfExists) {
		eDynamicSet(AstPackage.DROP_VIEW__IF_EXISTS, AstPackage.Literals.DROP_VIEW__IF_EXISTS, newIfExists);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.DROP_VIEW__SCHEMA_NAME:
				return getSchemaName();
			case AstPackage.DROP_VIEW__VIEW_NAME:
				return getViewName();
			case AstPackage.DROP_VIEW__IF_EXISTS:
				return isIfExists();
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
			case AstPackage.DROP_VIEW__SCHEMA_NAME:
				setSchemaName((String)newValue);
				return;
			case AstPackage.DROP_VIEW__VIEW_NAME:
				setViewName((String)newValue);
				return;
			case AstPackage.DROP_VIEW__IF_EXISTS:
				setIfExists((Boolean)newValue);
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
			case AstPackage.DROP_VIEW__SCHEMA_NAME:
				setSchemaName(SCHEMA_NAME_EDEFAULT);
				return;
			case AstPackage.DROP_VIEW__VIEW_NAME:
				setViewName(VIEW_NAME_EDEFAULT);
				return;
			case AstPackage.DROP_VIEW__IF_EXISTS:
				setIfExists(IF_EXISTS_EDEFAULT);
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
			case AstPackage.DROP_VIEW__SCHEMA_NAME:
				return SCHEMA_NAME_EDEFAULT == null ? getSchemaName() != null : !SCHEMA_NAME_EDEFAULT.equals(getSchemaName());
			case AstPackage.DROP_VIEW__VIEW_NAME:
				return VIEW_NAME_EDEFAULT == null ? getViewName() != null : !VIEW_NAME_EDEFAULT.equals(getViewName());
			case AstPackage.DROP_VIEW__IF_EXISTS:
				return isIfExists() != IF_EXISTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DropViewImpl
