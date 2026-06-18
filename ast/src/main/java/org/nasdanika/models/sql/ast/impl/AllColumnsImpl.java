package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class AllColumnsImpl extends ExpressionImpl implements AllColumns {
    protected AllColumnsImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getAllColumns();
    }
}
