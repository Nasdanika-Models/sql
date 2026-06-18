package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public abstract class StatementImpl extends AstNodeImpl implements Statement {
    protected String rawSql;

    protected StatementImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getStatement();
    }

    @Override
    public String getRawSql() {
        return rawSql;
    }

    @Override
    public void setRawSql(String value) {
        this.rawSql = value;
    }
}
