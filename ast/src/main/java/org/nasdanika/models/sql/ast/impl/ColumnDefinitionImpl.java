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
import org.nasdanika.models.sql.ast.ColumnDefinition;
import org.nasdanika.models.sql.ast.TableConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ColumnDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ColumnDefinitionImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ColumnDefinitionImpl#getNullable <em>Nullable</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ColumnDefinitionImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ColumnDefinitionImpl#isIdentity <em>Identity</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ColumnDefinitionImpl#isComputed <em>Computed</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ColumnDefinitionImpl#getComputedExpression <em>Computed Expression</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.ColumnDefinitionImpl#getInlineConstraints <em>Inline Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnDefinitionImpl extends AstNodeImpl implements ColumnDefinition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NULLABLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isIdentity() <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IDENTITY_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isComputed() <em>Computed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComputed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPUTED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getComputedExpression() <em>Computed Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTED_EXPRESSION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.COLUMN_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(AstPackage.COLUMN_DEFINITION__NAME, AstPackage.Literals.COLUMN_DEFINITION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(AstPackage.COLUMN_DEFINITION__NAME, AstPackage.Literals.COLUMN_DEFINITION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataType() {
		return (String)eDynamicGet(AstPackage.COLUMN_DEFINITION__DATA_TYPE, AstPackage.Literals.COLUMN_DEFINITION__DATA_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(String newDataType) {
		eDynamicSet(AstPackage.COLUMN_DEFINITION__DATA_TYPE, AstPackage.Literals.COLUMN_DEFINITION__DATA_TYPE, newDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNullable() {
		return (Boolean)eDynamicGet(AstPackage.COLUMN_DEFINITION__NULLABLE, AstPackage.Literals.COLUMN_DEFINITION__NULLABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullable(Boolean newNullable) {
		eDynamicSet(AstPackage.COLUMN_DEFINITION__NULLABLE, AstPackage.Literals.COLUMN_DEFINITION__NULLABLE, newNullable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultValue() {
		return (String)eDynamicGet(AstPackage.COLUMN_DEFINITION__DEFAULT_VALUE, AstPackage.Literals.COLUMN_DEFINITION__DEFAULT_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(String newDefaultValue) {
		eDynamicSet(AstPackage.COLUMN_DEFINITION__DEFAULT_VALUE, AstPackage.Literals.COLUMN_DEFINITION__DEFAULT_VALUE, newDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIdentity() {
		return (Boolean)eDynamicGet(AstPackage.COLUMN_DEFINITION__IDENTITY, AstPackage.Literals.COLUMN_DEFINITION__IDENTITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentity(boolean newIdentity) {
		eDynamicSet(AstPackage.COLUMN_DEFINITION__IDENTITY, AstPackage.Literals.COLUMN_DEFINITION__IDENTITY, newIdentity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isComputed() {
		return (Boolean)eDynamicGet(AstPackage.COLUMN_DEFINITION__COMPUTED, AstPackage.Literals.COLUMN_DEFINITION__COMPUTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComputed(boolean newComputed) {
		eDynamicSet(AstPackage.COLUMN_DEFINITION__COMPUTED, AstPackage.Literals.COLUMN_DEFINITION__COMPUTED, newComputed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComputedExpression() {
		return (String)eDynamicGet(AstPackage.COLUMN_DEFINITION__COMPUTED_EXPRESSION, AstPackage.Literals.COLUMN_DEFINITION__COMPUTED_EXPRESSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComputedExpression(String newComputedExpression) {
		eDynamicSet(AstPackage.COLUMN_DEFINITION__COMPUTED_EXPRESSION, AstPackage.Literals.COLUMN_DEFINITION__COMPUTED_EXPRESSION, newComputedExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TableConstraint> getInlineConstraints() {
		return (EList<TableConstraint>)eDynamicGet(AstPackage.COLUMN_DEFINITION__INLINE_CONSTRAINTS, AstPackage.Literals.COLUMN_DEFINITION__INLINE_CONSTRAINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.COLUMN_DEFINITION__INLINE_CONSTRAINTS:
				return ((InternalEList<?>)getInlineConstraints()).basicRemove(otherEnd, msgs);
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
			case AstPackage.COLUMN_DEFINITION__NAME:
				return getName();
			case AstPackage.COLUMN_DEFINITION__DATA_TYPE:
				return getDataType();
			case AstPackage.COLUMN_DEFINITION__NULLABLE:
				return getNullable();
			case AstPackage.COLUMN_DEFINITION__DEFAULT_VALUE:
				return getDefaultValue();
			case AstPackage.COLUMN_DEFINITION__IDENTITY:
				return isIdentity();
			case AstPackage.COLUMN_DEFINITION__COMPUTED:
				return isComputed();
			case AstPackage.COLUMN_DEFINITION__COMPUTED_EXPRESSION:
				return getComputedExpression();
			case AstPackage.COLUMN_DEFINITION__INLINE_CONSTRAINTS:
				return getInlineConstraints();
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
			case AstPackage.COLUMN_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case AstPackage.COLUMN_DEFINITION__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case AstPackage.COLUMN_DEFINITION__NULLABLE:
				setNullable((Boolean)newValue);
				return;
			case AstPackage.COLUMN_DEFINITION__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case AstPackage.COLUMN_DEFINITION__IDENTITY:
				setIdentity((Boolean)newValue);
				return;
			case AstPackage.COLUMN_DEFINITION__COMPUTED:
				setComputed((Boolean)newValue);
				return;
			case AstPackage.COLUMN_DEFINITION__COMPUTED_EXPRESSION:
				setComputedExpression((String)newValue);
				return;
			case AstPackage.COLUMN_DEFINITION__INLINE_CONSTRAINTS:
				getInlineConstraints().clear();
				getInlineConstraints().addAll((Collection<? extends TableConstraint>)newValue);
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
			case AstPackage.COLUMN_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AstPackage.COLUMN_DEFINITION__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case AstPackage.COLUMN_DEFINITION__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case AstPackage.COLUMN_DEFINITION__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case AstPackage.COLUMN_DEFINITION__IDENTITY:
				setIdentity(IDENTITY_EDEFAULT);
				return;
			case AstPackage.COLUMN_DEFINITION__COMPUTED:
				setComputed(COMPUTED_EDEFAULT);
				return;
			case AstPackage.COLUMN_DEFINITION__COMPUTED_EXPRESSION:
				setComputedExpression(COMPUTED_EXPRESSION_EDEFAULT);
				return;
			case AstPackage.COLUMN_DEFINITION__INLINE_CONSTRAINTS:
				getInlineConstraints().clear();
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
			case AstPackage.COLUMN_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case AstPackage.COLUMN_DEFINITION__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? getDataType() != null : !DATA_TYPE_EDEFAULT.equals(getDataType());
			case AstPackage.COLUMN_DEFINITION__NULLABLE:
				return NULLABLE_EDEFAULT == null ? getNullable() != null : !NULLABLE_EDEFAULT.equals(getNullable());
			case AstPackage.COLUMN_DEFINITION__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? getDefaultValue() != null : !DEFAULT_VALUE_EDEFAULT.equals(getDefaultValue());
			case AstPackage.COLUMN_DEFINITION__IDENTITY:
				return isIdentity() != IDENTITY_EDEFAULT;
			case AstPackage.COLUMN_DEFINITION__COMPUTED:
				return isComputed() != COMPUTED_EDEFAULT;
			case AstPackage.COLUMN_DEFINITION__COMPUTED_EXPRESSION:
				return COMPUTED_EXPRESSION_EDEFAULT == null ? getComputedExpression() != null : !COMPUTED_EXPRESSION_EDEFAULT.equals(getComputedExpression());
			case AstPackage.COLUMN_DEFINITION__INLINE_CONSTRAINTS:
				return !getInlineConstraints().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ColumnDefinitionImpl
