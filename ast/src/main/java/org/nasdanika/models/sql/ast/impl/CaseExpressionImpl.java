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
import org.nasdanika.models.sql.ast.CaseExpression;
import org.nasdanika.models.sql.ast.Expression;
import org.nasdanika.models.sql.ast.WhenClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CaseExpressionImpl#getSwitchExpression <em>Switch Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CaseExpressionImpl#getWhenClauses <em>When Clauses</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.CaseExpressionImpl#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseExpressionImpl extends ExpressionImpl implements CaseExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.CASE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getSwitchExpression() {
		return (Expression)eDynamicGet(AstPackage.CASE_EXPRESSION__SWITCH_EXPRESSION, AstPackage.Literals.CASE_EXPRESSION__SWITCH_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitchExpression(Expression newSwitchExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSwitchExpression, AstPackage.CASE_EXPRESSION__SWITCH_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwitchExpression(Expression newSwitchExpression) {
		eDynamicSet(AstPackage.CASE_EXPRESSION__SWITCH_EXPRESSION, AstPackage.Literals.CASE_EXPRESSION__SWITCH_EXPRESSION, newSwitchExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<WhenClause> getWhenClauses() {
		return (EList<WhenClause>)eDynamicGet(AstPackage.CASE_EXPRESSION__WHEN_CLAUSES, AstPackage.Literals.CASE_EXPRESSION__WHEN_CLAUSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getElseExpression() {
		return (Expression)eDynamicGet(AstPackage.CASE_EXPRESSION__ELSE_EXPRESSION, AstPackage.Literals.CASE_EXPRESSION__ELSE_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseExpression(Expression newElseExpression, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newElseExpression, AstPackage.CASE_EXPRESSION__ELSE_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElseExpression(Expression newElseExpression) {
		eDynamicSet(AstPackage.CASE_EXPRESSION__ELSE_EXPRESSION, AstPackage.Literals.CASE_EXPRESSION__ELSE_EXPRESSION, newElseExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.CASE_EXPRESSION__SWITCH_EXPRESSION:
				return basicSetSwitchExpression(null, msgs);
			case AstPackage.CASE_EXPRESSION__WHEN_CLAUSES:
				return ((InternalEList<?>)getWhenClauses()).basicRemove(otherEnd, msgs);
			case AstPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				return basicSetElseExpression(null, msgs);
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
			case AstPackage.CASE_EXPRESSION__SWITCH_EXPRESSION:
				return getSwitchExpression();
			case AstPackage.CASE_EXPRESSION__WHEN_CLAUSES:
				return getWhenClauses();
			case AstPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				return getElseExpression();
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
			case AstPackage.CASE_EXPRESSION__SWITCH_EXPRESSION:
				setSwitchExpression((Expression)newValue);
				return;
			case AstPackage.CASE_EXPRESSION__WHEN_CLAUSES:
				getWhenClauses().clear();
				getWhenClauses().addAll((Collection<? extends WhenClause>)newValue);
				return;
			case AstPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				setElseExpression((Expression)newValue);
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
			case AstPackage.CASE_EXPRESSION__SWITCH_EXPRESSION:
				setSwitchExpression((Expression)null);
				return;
			case AstPackage.CASE_EXPRESSION__WHEN_CLAUSES:
				getWhenClauses().clear();
				return;
			case AstPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				setElseExpression((Expression)null);
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
			case AstPackage.CASE_EXPRESSION__SWITCH_EXPRESSION:
				return getSwitchExpression() != null;
			case AstPackage.CASE_EXPRESSION__WHEN_CLAUSES:
				return !getWhenClauses().isEmpty();
			case AstPackage.CASE_EXPRESSION__ELSE_EXPRESSION:
				return getElseExpression() != null;
		}
		return super.eIsSet(featureID);
	}

} //CaseExpressionImpl
