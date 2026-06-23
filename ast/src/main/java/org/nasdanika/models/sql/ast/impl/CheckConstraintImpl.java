/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.CheckConstraint;
import org.nasdanika.models.sql.ast.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CheckConstraintImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CheckConstraintImpl#getExpressionText <em>Expression Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckConstraintImpl extends TableConstraintImpl implements CheckConstraint {
	/**
	 * The default value of the '{@link #getExpressionText() <em>Expression Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionText()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_TEXT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.CHECK_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpression() {
		return (Expression)eDynamicGet(AstPackage.CHECK_CONSTRAINT__EXPRESSION, AstPackage.Literals.CHECK_CONSTRAINT__EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newExpression, AstPackage.CHECK_CONSTRAINT__EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(Expression newExpression) {
		eDynamicSet(AstPackage.CHECK_CONSTRAINT__EXPRESSION, AstPackage.Literals.CHECK_CONSTRAINT__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpressionText() {
		return (String)eDynamicGet(AstPackage.CHECK_CONSTRAINT__EXPRESSION_TEXT, AstPackage.Literals.CHECK_CONSTRAINT__EXPRESSION_TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressionText(String newExpressionText) {
		eDynamicSet(AstPackage.CHECK_CONSTRAINT__EXPRESSION_TEXT, AstPackage.Literals.CHECK_CONSTRAINT__EXPRESSION_TEXT, newExpressionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.CHECK_CONSTRAINT__EXPRESSION:
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
			case AstPackage.CHECK_CONSTRAINT__EXPRESSION:
				return getExpression();
			case AstPackage.CHECK_CONSTRAINT__EXPRESSION_TEXT:
				return getExpressionText();
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
			case AstPackage.CHECK_CONSTRAINT__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case AstPackage.CHECK_CONSTRAINT__EXPRESSION_TEXT:
				setExpressionText((String)newValue);
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
			case AstPackage.CHECK_CONSTRAINT__EXPRESSION:
				setExpression((Expression)null);
				return;
			case AstPackage.CHECK_CONSTRAINT__EXPRESSION_TEXT:
				setExpressionText(EXPRESSION_TEXT_EDEFAULT);
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
			case AstPackage.CHECK_CONSTRAINT__EXPRESSION:
				return getExpression() != null;
			case AstPackage.CHECK_CONSTRAINT__EXPRESSION_TEXT:
				return EXPRESSION_TEXT_EDEFAULT == null ? getExpressionText() != null : !EXPRESSION_TEXT_EDEFAULT.equals(getExpressionText());
		}
		return super.eIsSet(featureID);
	}

} //CheckConstraintImpl
