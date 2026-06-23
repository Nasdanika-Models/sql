/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.Expression;
import org.nasdanika.models.sql.ast.OrderByItem;
import org.nasdanika.models.sql.ast.SortDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order By Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.OrderByItemImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.OrderByItemImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderByItemImpl extends AstNodeImpl implements OrderByItem {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final SortDirection DIRECTION_EDEFAULT = SortDirection.ASC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderByItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.ORDER_BY_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpression() {
		return (Expression)eDynamicGet(AstPackage.ORDER_BY_ITEM__EXPRESSION, AstPackage.Literals.ORDER_BY_ITEM__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, AstPackage.ORDER_BY_ITEM__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(Expression newExpression) {
		eDynamicSet(AstPackage.ORDER_BY_ITEM__EXPRESSION, AstPackage.Literals.ORDER_BY_ITEM__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SortDirection getDirection() {
		return (SortDirection)eDynamicGet(AstPackage.ORDER_BY_ITEM__DIRECTION, AstPackage.Literals.ORDER_BY_ITEM__DIRECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(SortDirection newDirection) {
		eDynamicSet(AstPackage.ORDER_BY_ITEM__DIRECTION, AstPackage.Literals.ORDER_BY_ITEM__DIRECTION, newDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.ORDER_BY_ITEM__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case AstPackage.ORDER_BY_ITEM__EXPRESSION:
				return getExpression();
			case AstPackage.ORDER_BY_ITEM__DIRECTION:
				return getDirection();
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
			case AstPackage.ORDER_BY_ITEM__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case AstPackage.ORDER_BY_ITEM__DIRECTION:
				setDirection((SortDirection)newValue);
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
			case AstPackage.ORDER_BY_ITEM__EXPRESSION:
				setExpression((Expression)null);
				return;
			case AstPackage.ORDER_BY_ITEM__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case AstPackage.ORDER_BY_ITEM__EXPRESSION:
				return getExpression() != null;
			case AstPackage.ORDER_BY_ITEM__DIRECTION:
				return getDirection() != DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //OrderByItemImpl
