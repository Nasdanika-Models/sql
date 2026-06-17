package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public class SqlScriptImpl extends MinimalEObjectImpl.Container implements SqlScript {
    protected String sourceUri;
    protected String dialect;
    protected EList<Statement> statements;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getSqlScript();
    }

    @Override
    public String getSourceUri() {
        return sourceUri;
    }

    @Override
    public void setSourceUri(String value) {
        this.sourceUri = value;
    }

    @Override
    public String getDialect() {
        return dialect;
    }

    @Override
    public void setDialect(String value) {
        this.dialect = value;
    }

    @Override
    public EList<Statement> getStatements() {
        if (statements == null) {
            statements = new BasicEList<>();
        }
        return statements;
    }
}
