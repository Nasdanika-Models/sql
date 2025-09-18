/**
 */
package org.nasdanika.models.sql.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.sql.PrimaryKey;
import org.nasdanika.models.sql.SqlPackage;

import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrimaryKeyImpl extends DocumentedNamedElementImpl implements PrimaryKey {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.PRIMARY_KEY;
	}

} //PrimaryKeyImpl
