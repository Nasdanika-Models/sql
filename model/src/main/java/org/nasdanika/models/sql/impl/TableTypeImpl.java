/**
 */
package org.nasdanika.models.sql.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.sql.SqlPackage;
import org.nasdanika.models.sql.TableType;

import org.nasdanika.ncore.impl.DocumentedNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TableTypeImpl extends DocumentedNamedElementImpl implements TableType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SqlPackage.Literals.TABLE_TYPE;
	}

} //TableTypeImpl
