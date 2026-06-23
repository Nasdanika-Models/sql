/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.BinaryExpression;
import org.nasdanika.models.sql.ast.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.BinaryExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.BinaryExpressionImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.BinaryExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLeft() {
		return (Expression)eDynamicGet(AstPackage.BINARY_EXPRESSION__LEFT, AstPackage.Literals.BINARY_EXPRESSION__LEFT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLeft, AstPackage.BINARY_EXPRESSION__LEFT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeft(Expression newLeft) {
		eDynamicSet(AstPackage.BINARY_EXPRESSION__LEFT, AstPackage.Literals.BINARY_EXPRESSION__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRight() {
		return (Expression)eDynamicGet(AstPackage.BINARY_EXPRESSION__RIGHT, AstPackage.Literals.BINARY_EXPRESSION__RIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRight, AstPackage.BINARY_EXPRESSION__RIGHT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRight(Expression newRight) {
		eDynamicSet(AstPackage.BINARY_EXPRESSION__RIGHT, AstPackage.Literals.BINARY_EXPRESSION__RIGHT, newRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperator() {
		return (String)eDynamicGet(AstPackage.BINARY_EXPRESSION__OPERATOR, AstPackage.Literals.BINARY_EXPRESSION__OPERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(String newOperator) {
		eDynamicSet(AstPackage.BINARY_EXPRESSION__OPERATOR, AstPackage.Literals.BINARY_EXPRESSION__OPERATOR, newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.BINARY_EXPRESSION__LEFT:
				return basicSetLeft(null, msgs);
			case AstPackage.BINARY_EXPRESSION__RIGHT:
				return basicSetRight(null, msgs);
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
			case AstPackage.BINARY_EXPRESSION__LEFT:
				return getLeft();
			case AstPackage.BINARY_EXPRESSION__RIGHT:
				return getRight();
			case AstPackage.BINARY_EXPRESSION__OPERATOR:
				return getOperator();
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
			case AstPackage.BINARY_EXPRESSION__LEFT:
				setLeft((Expression)newValue);
				return;
			case AstPackage.BINARY_EXPRESSION__RIGHT:
				setRight((Expression)newValue);
				return;
			case AstPackage.BINARY_EXPRESSION__OPERATOR:
				setOperator((String)newValue);
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
			case AstPackage.BINARY_EXPRESSION__LEFT:
				setLeft((Expression)null);
				return;
			case AstPackage.BINARY_EXPRESSION__RIGHT:
				setRight((Expression)null);
				return;
			case AstPackage.BINARY_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case AstPackage.BINARY_EXPRESSION__LEFT:
				return getLeft() != null;
			case AstPackage.BINARY_EXPRESSION__RIGHT:
				return getRight() != null;
			case AstPackage.BINARY_EXPRESSION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? getOperator() != null : !OPERATOR_EDEFAULT.equals(getOperator());
		}
		return super.eIsSet(featureID);
	}

} //BinaryExpressionImpl
