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
import org.nasdanika.models.sql.ast.FromItem;
import org.nasdanika.models.sql.ast.Join;
import org.nasdanika.models.sql.ast.OrderByItem;
import org.nasdanika.models.sql.ast.Select;
import org.nasdanika.models.sql.ast.SelectItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SelectImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SelectImpl#getSelectItems <em>Select Items</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SelectImpl#getFromItems <em>From Items</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SelectImpl#getJoins <em>Joins</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SelectImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SelectImpl#getGroupBy <em>Group By</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SelectImpl#getHaving <em>Having</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SelectImpl#getOrderBy <em>Order By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectImpl extends StatementImpl implements Select {
	/**
	 * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISTINCT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDistinct() {
		return (Boolean)eDynamicGet(AstPackage.SELECT__DISTINCT, AstPackage.Literals.SELECT__DISTINCT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistinct(boolean newDistinct) {
		eDynamicSet(AstPackage.SELECT__DISTINCT, AstPackage.Literals.SELECT__DISTINCT, newDistinct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SelectItem> getSelectItems() {
		return (EList<SelectItem>)eDynamicGet(AstPackage.SELECT__SELECT_ITEMS, AstPackage.Literals.SELECT__SELECT_ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FromItem> getFromItems() {
		return (EList<FromItem>)eDynamicGet(AstPackage.SELECT__FROM_ITEMS, AstPackage.Literals.SELECT__FROM_ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Join> getJoins() {
		return (EList<Join>)eDynamicGet(AstPackage.SELECT__JOINS, AstPackage.Literals.SELECT__JOINS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getWhere() {
		return (Expression)eDynamicGet(AstPackage.SELECT__WHERE, AstPackage.Literals.SELECT__WHERE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Expression newWhere, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newWhere, AstPackage.SELECT__WHERE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhere(Expression newWhere) {
		eDynamicSet(AstPackage.SELECT__WHERE, AstPackage.Literals.SELECT__WHERE, newWhere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Expression> getGroupBy() {
		return (EList<Expression>)eDynamicGet(AstPackage.SELECT__GROUP_BY, AstPackage.Literals.SELECT__GROUP_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getHaving() {
		return (Expression)eDynamicGet(AstPackage.SELECT__HAVING, AstPackage.Literals.SELECT__HAVING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHaving(Expression newHaving, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newHaving, AstPackage.SELECT__HAVING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHaving(Expression newHaving) {
		eDynamicSet(AstPackage.SELECT__HAVING, AstPackage.Literals.SELECT__HAVING, newHaving);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OrderByItem> getOrderBy() {
		return (EList<OrderByItem>)eDynamicGet(AstPackage.SELECT__ORDER_BY, AstPackage.Literals.SELECT__ORDER_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.SELECT__SELECT_ITEMS:
				return ((InternalEList<?>)getSelectItems()).basicRemove(otherEnd, msgs);
			case AstPackage.SELECT__FROM_ITEMS:
				return ((InternalEList<?>)getFromItems()).basicRemove(otherEnd, msgs);
			case AstPackage.SELECT__JOINS:
				return ((InternalEList<?>)getJoins()).basicRemove(otherEnd, msgs);
			case AstPackage.SELECT__WHERE:
				return basicSetWhere(null, msgs);
			case AstPackage.SELECT__GROUP_BY:
				return ((InternalEList<?>)getGroupBy()).basicRemove(otherEnd, msgs);
			case AstPackage.SELECT__HAVING:
				return basicSetHaving(null, msgs);
			case AstPackage.SELECT__ORDER_BY:
				return ((InternalEList<?>)getOrderBy()).basicRemove(otherEnd, msgs);
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
			case AstPackage.SELECT__DISTINCT:
				return isDistinct();
			case AstPackage.SELECT__SELECT_ITEMS:
				return getSelectItems();
			case AstPackage.SELECT__FROM_ITEMS:
				return getFromItems();
			case AstPackage.SELECT__JOINS:
				return getJoins();
			case AstPackage.SELECT__WHERE:
				return getWhere();
			case AstPackage.SELECT__GROUP_BY:
				return getGroupBy();
			case AstPackage.SELECT__HAVING:
				return getHaving();
			case AstPackage.SELECT__ORDER_BY:
				return getOrderBy();
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
			case AstPackage.SELECT__DISTINCT:
				setDistinct((Boolean)newValue);
				return;
			case AstPackage.SELECT__SELECT_ITEMS:
				getSelectItems().clear();
				getSelectItems().addAll((Collection<? extends SelectItem>)newValue);
				return;
			case AstPackage.SELECT__FROM_ITEMS:
				getFromItems().clear();
				getFromItems().addAll((Collection<? extends FromItem>)newValue);
				return;
			case AstPackage.SELECT__JOINS:
				getJoins().clear();
				getJoins().addAll((Collection<? extends Join>)newValue);
				return;
			case AstPackage.SELECT__WHERE:
				setWhere((Expression)newValue);
				return;
			case AstPackage.SELECT__GROUP_BY:
				getGroupBy().clear();
				getGroupBy().addAll((Collection<? extends Expression>)newValue);
				return;
			case AstPackage.SELECT__HAVING:
				setHaving((Expression)newValue);
				return;
			case AstPackage.SELECT__ORDER_BY:
				getOrderBy().clear();
				getOrderBy().addAll((Collection<? extends OrderByItem>)newValue);
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
			case AstPackage.SELECT__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case AstPackage.SELECT__SELECT_ITEMS:
				getSelectItems().clear();
				return;
			case AstPackage.SELECT__FROM_ITEMS:
				getFromItems().clear();
				return;
			case AstPackage.SELECT__JOINS:
				getJoins().clear();
				return;
			case AstPackage.SELECT__WHERE:
				setWhere((Expression)null);
				return;
			case AstPackage.SELECT__GROUP_BY:
				getGroupBy().clear();
				return;
			case AstPackage.SELECT__HAVING:
				setHaving((Expression)null);
				return;
			case AstPackage.SELECT__ORDER_BY:
				getOrderBy().clear();
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
			case AstPackage.SELECT__DISTINCT:
				return isDistinct() != DISTINCT_EDEFAULT;
			case AstPackage.SELECT__SELECT_ITEMS:
				return !getSelectItems().isEmpty();
			case AstPackage.SELECT__FROM_ITEMS:
				return !getFromItems().isEmpty();
			case AstPackage.SELECT__JOINS:
				return !getJoins().isEmpty();
			case AstPackage.SELECT__WHERE:
				return getWhere() != null;
			case AstPackage.SELECT__GROUP_BY:
				return !getGroupBy().isEmpty();
			case AstPackage.SELECT__HAVING:
				return getHaving() != null;
			case AstPackage.SELECT__ORDER_BY:
				return !getOrderBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SelectImpl
