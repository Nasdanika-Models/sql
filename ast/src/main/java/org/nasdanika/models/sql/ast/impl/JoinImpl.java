/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.Expression;
import org.nasdanika.models.sql.ast.FromItem;
import org.nasdanika.models.sql.ast.Join;
import org.nasdanika.models.sql.ast.JoinType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.JoinImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.JoinImpl#getRightItem <em>Right Item</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.JoinImpl#getOnCondition <em>On Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinImpl extends AstNodeImpl implements Join {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final JoinType TYPE_EDEFAULT = JoinType.INNER;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.JOIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JoinType getType() {
		return (JoinType)eDynamicGet(AstPackage.JOIN__TYPE, AstPackage.Literals.JOIN__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(JoinType newType) {
		eDynamicSet(AstPackage.JOIN__TYPE, AstPackage.Literals.JOIN__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromItem getRightItem() {
		return (FromItem)eDynamicGet(AstPackage.JOIN__RIGHT_ITEM, AstPackage.Literals.JOIN__RIGHT_ITEM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightItem(FromItem newRightItem, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRightItem, AstPackage.JOIN__RIGHT_ITEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightItem(FromItem newRightItem) {
		eDynamicSet(AstPackage.JOIN__RIGHT_ITEM, AstPackage.Literals.JOIN__RIGHT_ITEM, newRightItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getOnCondition() {
		return (Expression)eDynamicGet(AstPackage.JOIN__ON_CONDITION, AstPackage.Literals.JOIN__ON_CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnCondition(Expression newOnCondition, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOnCondition, AstPackage.JOIN__ON_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnCondition(Expression newOnCondition) {
		eDynamicSet(AstPackage.JOIN__ON_CONDITION, AstPackage.Literals.JOIN__ON_CONDITION, newOnCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.JOIN__RIGHT_ITEM:
				return basicSetRightItem(null, msgs);
			case AstPackage.JOIN__ON_CONDITION:
				return basicSetOnCondition(null, msgs);
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
			case AstPackage.JOIN__TYPE:
				return getType();
			case AstPackage.JOIN__RIGHT_ITEM:
				return getRightItem();
			case AstPackage.JOIN__ON_CONDITION:
				return getOnCondition();
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
			case AstPackage.JOIN__TYPE:
				setType((JoinType)newValue);
				return;
			case AstPackage.JOIN__RIGHT_ITEM:
				setRightItem((FromItem)newValue);
				return;
			case AstPackage.JOIN__ON_CONDITION:
				setOnCondition((Expression)newValue);
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
			case AstPackage.JOIN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AstPackage.JOIN__RIGHT_ITEM:
				setRightItem((FromItem)null);
				return;
			case AstPackage.JOIN__ON_CONDITION:
				setOnCondition((Expression)null);
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
			case AstPackage.JOIN__TYPE:
				return getType() != TYPE_EDEFAULT;
			case AstPackage.JOIN__RIGHT_ITEM:
				return getRightItem() != null;
			case AstPackage.JOIN__ON_CONDITION:
				return getOnCondition() != null;
		}
		return super.eIsSet(featureID);
	}

} //JoinImpl
