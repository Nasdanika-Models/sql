package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class UnparsedStatementImpl extends StatementImpl implements UnparsedStatement {
    protected String rawSql;
    protected String errorMessage;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getUnparsedStatement();
    }

    @Override
    public String getRawSql() {
        return rawSql;
    }

    @Override
    public void setRawSql(String value) {
        this.rawSql = value;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }
}
