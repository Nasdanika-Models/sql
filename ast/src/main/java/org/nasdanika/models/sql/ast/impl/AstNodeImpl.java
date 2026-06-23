/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.sql.ast.AstNode;
import org.nasdanika.models.sql.ast.AstPackage;
import org.nasdanika.models.sql.ast.SourceSpan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.AstNodeImpl#getSourceSpan <em>Source Span</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.AstNodeImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AstNodeImpl extends MinimalEObjectImpl.Container implements AstNode {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AstNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.AST_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceSpan getSourceSpan() {
		return (SourceSpan)eDynamicGet(AstPackage.AST_NODE__SOURCE_SPAN, AstPackage.Literals.AST_NODE__SOURCE_SPAN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceSpan(SourceSpan newSourceSpan, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSourceSpan, AstPackage.AST_NODE__SOURCE_SPAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceSpan(SourceSpan newSourceSpan) {
		eDynamicSet(AstPackage.AST_NODE__SOURCE_SPAN, AstPackage.Literals.AST_NODE__SOURCE_SPAN, newSourceSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eDynamicGet(AstPackage.AST_NODE__COMMENT, AstPackage.Literals.AST_NODE__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(AstPackage.AST_NODE__COMMENT, AstPackage.Literals.AST_NODE__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.AST_NODE__SOURCE_SPAN:
				return basicSetSourceSpan(null, msgs);
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
			case AstPackage.AST_NODE__SOURCE_SPAN:
				return getSourceSpan();
			case AstPackage.AST_NODE__COMMENT:
				return getComment();
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
			case AstPackage.AST_NODE__SOURCE_SPAN:
				setSourceSpan((SourceSpan)newValue);
				return;
			case AstPackage.AST_NODE__COMMENT:
				setComment((String)newValue);
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
			case AstPackage.AST_NODE__SOURCE_SPAN:
				setSourceSpan((SourceSpan)null);
				return;
			case AstPackage.AST_NODE__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case AstPackage.AST_NODE__SOURCE_SPAN:
				return getSourceSpan() != null;
			case AstPackage.AST_NODE__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
		}
		return super.eIsSet(featureID);
	}

} //AstNodeImpl
