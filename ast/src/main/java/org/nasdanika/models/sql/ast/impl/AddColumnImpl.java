/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.sql.ast.AddColumn;
import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.ColumnDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.AddColumnImpl#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddColumnImpl extends AlterOperationImpl implements AddColumn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.ADD_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnDefinition getColumn() {
		return (ColumnDefinition)eDynamicGet(AstPackage.ADD_COLUMN__COLUMN, AstPackage.Literals.ADD_COLUMN__COLUMN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(ColumnDefinition newColumn, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newColumn, AstPackage.ADD_COLUMN__COLUMN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumn(ColumnDefinition newColumn) {
		eDynamicSet(AstPackage.ADD_COLUMN__COLUMN, AstPackage.Literals.ADD_COLUMN__COLUMN, newColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.ADD_COLUMN__COLUMN:
				return basicSetColumn(null, msgs);
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
			case AstPackage.ADD_COLUMN__COLUMN:
				return getColumn();
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
			case AstPackage.ADD_COLUMN__COLUMN:
				setColumn((ColumnDefinition)newValue);
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
			case AstPackage.ADD_COLUMN__COLUMN:
				setColumn((ColumnDefinition)null);
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
			case AstPackage.ADD_COLUMN__COLUMN:
				return getColumn() != null;
		}
		return super.eIsSet(featureID);
	}

} //AddColumnImpl
