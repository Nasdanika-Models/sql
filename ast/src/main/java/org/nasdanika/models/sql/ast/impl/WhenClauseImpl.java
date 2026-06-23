/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.Expression;
import org.nasdanika.models.sql.ast.WhenClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.WhenClauseImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.WhenClauseImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhenClauseImpl extends AstNodeImpl implements WhenClause {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhenClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.WHEN_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCondition() {
		return (Expression)eDynamicGet(AstPackage.WHEN_CLAUSE__CONDITION, AstPackage.Literals.WHEN_CLAUSE__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCondition, AstPackage.WHEN_CLAUSE__CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Expression newCondition) {
		eDynamicSet(AstPackage.WHEN_CLAUSE__CONDITION, AstPackage.Literals.WHEN_CLAUSE__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getResult() {
		return (Expression)eDynamicGet(AstPackage.WHEN_CLAUSE__RESULT, AstPackage.Literals.WHEN_CLAUSE__RESULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(Expression newResult, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResult, AstPackage.WHEN_CLAUSE__RESULT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResult(Expression newResult) {
		eDynamicSet(AstPackage.WHEN_CLAUSE__RESULT, AstPackage.Literals.WHEN_CLAUSE__RESULT, newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.WHEN_CLAUSE__CONDITION:
				return basicSetCondition(null, msgs);
			case AstPackage.WHEN_CLAUSE__RESULT:
				return basicSetResult(null, msgs);
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
			case AstPackage.WHEN_CLAUSE__CONDITION:
				return getCondition();
			case AstPackage.WHEN_CLAUSE__RESULT:
				return getResult();
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
			case AstPackage.WHEN_CLAUSE__CONDITION:
				setCondition((Expression)newValue);
				return;
			case AstPackage.WHEN_CLAUSE__RESULT:
				setResult((Expression)newValue);
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
			case AstPackage.WHEN_CLAUSE__CONDITION:
				setCondition((Expression)null);
				return;
			case AstPackage.WHEN_CLAUSE__RESULT:
				setResult((Expression)null);
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
			case AstPackage.WHEN_CLAUSE__CONDITION:
				return getCondition() != null;
			case AstPackage.WHEN_CLAUSE__RESULT:
				return getResult() != null;
		}
		return super.eIsSet(featureID);
	}

} //WhenClauseImpl
