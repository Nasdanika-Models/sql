/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.Expression;
import org.nasdanika.models.sql.ast.UnaryExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.UnaryExpressionImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.UnaryExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.UnaryExpressionImpl#isPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryExpressionImpl extends ExpressionImpl implements UnaryExpression {
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
	 * The default value of the '{@link #isPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREFIX_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.UNARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getOperand() {
		return (Expression)eDynamicGet(AstPackage.UNARY_EXPRESSION__OPERAND, AstPackage.Literals.UNARY_EXPRESSION__OPERAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand(Expression newOperand, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOperand, AstPackage.UNARY_EXPRESSION__OPERAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperand(Expression newOperand) {
		eDynamicSet(AstPackage.UNARY_EXPRESSION__OPERAND, AstPackage.Literals.UNARY_EXPRESSION__OPERAND, newOperand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperator() {
		return (String)eDynamicGet(AstPackage.UNARY_EXPRESSION__OPERATOR, AstPackage.Literals.UNARY_EXPRESSION__OPERATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(String newOperator) {
		eDynamicSet(AstPackage.UNARY_EXPRESSION__OPERATOR, AstPackage.Literals.UNARY_EXPRESSION__OPERATOR, newOperator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrefix() {
		return (Boolean)eDynamicGet(AstPackage.UNARY_EXPRESSION__PREFIX, AstPackage.Literals.UNARY_EXPRESSION__PREFIX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(boolean newPrefix) {
		eDynamicSet(AstPackage.UNARY_EXPRESSION__PREFIX, AstPackage.Literals.UNARY_EXPRESSION__PREFIX, newPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.UNARY_EXPRESSION__OPERAND:
				return basicSetOperand(null, msgs);
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
			case AstPackage.UNARY_EXPRESSION__OPERAND:
				return getOperand();
			case AstPackage.UNARY_EXPRESSION__OPERATOR:
				return getOperator();
			case AstPackage.UNARY_EXPRESSION__PREFIX:
				return isPrefix();
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
			case AstPackage.UNARY_EXPRESSION__OPERAND:
				setOperand((Expression)newValue);
				return;
			case AstPackage.UNARY_EXPRESSION__OPERATOR:
				setOperator((String)newValue);
				return;
			case AstPackage.UNARY_EXPRESSION__PREFIX:
				setPrefix((Boolean)newValue);
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
			case AstPackage.UNARY_EXPRESSION__OPERAND:
				setOperand((Expression)null);
				return;
			case AstPackage.UNARY_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case AstPackage.UNARY_EXPRESSION__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
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
			case AstPackage.UNARY_EXPRESSION__OPERAND:
				return getOperand() != null;
			case AstPackage.UNARY_EXPRESSION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? getOperator() != null : !OPERATOR_EDEFAULT.equals(getOperator());
			case AstPackage.UNARY_EXPRESSION__PREFIX:
				return isPrefix() != PREFIX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //UnaryExpressionImpl
