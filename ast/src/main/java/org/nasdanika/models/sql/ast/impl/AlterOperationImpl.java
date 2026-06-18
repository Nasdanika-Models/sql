package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public abstract class AlterOperationImpl extends AstNodeImpl implements AlterOperation {
    protected AlterOperationImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getAlterOperation();
    }
}
