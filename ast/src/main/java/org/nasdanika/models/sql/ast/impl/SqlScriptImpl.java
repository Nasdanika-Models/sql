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
import org.nasdanika.models.sql.ast.SqlScript;
import org.nasdanika.models.sql.ast.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sql Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SqlScriptImpl#getSourceUri <em>Source Uri</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SqlScriptImpl#getDialect <em>Dialect</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SqlScriptImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.impl.SqlScriptImpl#getLeadingComments <em>Leading Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqlScriptImpl extends AstNodeImpl implements SqlScript {
	/**
	 * The default value of the '{@link #getSourceUri() <em>Source Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUri()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDialect() <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialect()
	 * @generated
	 * @ordered
	 */
	protected static final String DIALECT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqlScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.SQL_SCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceUri() {
		return (String)eDynamicGet(AstPackage.SQL_SCRIPT__SOURCE_URI, AstPackage.Literals.SQL_SCRIPT__SOURCE_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceUri(String newSourceUri) {
		eDynamicSet(AstPackage.SQL_SCRIPT__SOURCE_URI, AstPackage.Literals.SQL_SCRIPT__SOURCE_URI, newSourceUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDialect() {
		return (String)eDynamicGet(AstPackage.SQL_SCRIPT__DIALECT, AstPackage.Literals.SQL_SCRIPT__DIALECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDialect(String newDialect) {
		eDynamicSet(AstPackage.SQL_SCRIPT__DIALECT, AstPackage.Literals.SQL_SCRIPT__DIALECT, newDialect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Statement> getStatements() {
		return (EList<Statement>)eDynamicGet(AstPackage.SQL_SCRIPT__STATEMENTS, AstPackage.Literals.SQL_SCRIPT__STATEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getLeadingComments() {
		return (EList<String>)eDynamicGet(AstPackage.SQL_SCRIPT__LEADING_COMMENTS, AstPackage.Literals.SQL_SCRIPT__LEADING_COMMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.SQL_SCRIPT__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
			case AstPackage.SQL_SCRIPT__SOURCE_URI:
				return getSourceUri();
			case AstPackage.SQL_SCRIPT__DIALECT:
				return getDialect();
			case AstPackage.SQL_SCRIPT__STATEMENTS:
				return getStatements();
			case AstPackage.SQL_SCRIPT__LEADING_COMMENTS:
				return getLeadingComments();
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
			case AstPackage.SQL_SCRIPT__SOURCE_URI:
				setSourceUri((String)newValue);
				return;
			case AstPackage.SQL_SCRIPT__DIALECT:
				setDialect((String)newValue);
				return;
			case AstPackage.SQL_SCRIPT__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case AstPackage.SQL_SCRIPT__LEADING_COMMENTS:
				getLeadingComments().clear();
				getLeadingComments().addAll((Collection<? extends String>)newValue);
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
			case AstPackage.SQL_SCRIPT__SOURCE_URI:
				setSourceUri(SOURCE_URI_EDEFAULT);
				return;
			case AstPackage.SQL_SCRIPT__DIALECT:
				setDialect(DIALECT_EDEFAULT);
				return;
			case AstPackage.SQL_SCRIPT__STATEMENTS:
				getStatements().clear();
				return;
			case AstPackage.SQL_SCRIPT__LEADING_COMMENTS:
				getLeadingComments().clear();
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
			case AstPackage.SQL_SCRIPT__SOURCE_URI:
				return SOURCE_URI_EDEFAULT == null ? getSourceUri() != null : !SOURCE_URI_EDEFAULT.equals(getSourceUri());
			case AstPackage.SQL_SCRIPT__DIALECT:
				return DIALECT_EDEFAULT == null ? getDialect() != null : !DIALECT_EDEFAULT.equals(getDialect());
			case AstPackage.SQL_SCRIPT__STATEMENTS:
				return !getStatements().isEmpty();
			case AstPackage.SQL_SCRIPT__LEADING_COMMENTS:
				return !getLeadingComments().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SqlScriptImpl
