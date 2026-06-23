/**
 */
package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.sql.ast.AlterOperation;
import org.nasdanika.models.sql.ast.AstPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alter Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AlterOperationImpl extends AstNodeImpl implements AlterOperation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlterOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.ALTER_OPERATION;
	}

} //AlterOperationImpl
