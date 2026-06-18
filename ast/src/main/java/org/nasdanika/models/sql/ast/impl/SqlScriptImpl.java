package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.nasdanika.models.sql.ast.*;

public class SqlScriptImpl extends AstNodeImpl implements SqlScript {
    protected String sourceUri;
    protected String dialect;
    protected EList<Statement> statements;
    protected EList<String> leadingComments;

    protected SqlScriptImpl() {
        super();
    }

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
    public org.eclipse.emf.common.util.EList<Statement> getStatements() {
        if (statements == null) {
            statements = new EObjectContainmentEList<>(Statement.class, this, SqlAstPackage.SQL_SCRIPT__STATEMENTS);
        }
        return statements;
    }

    @Override
    public org.eclipse.emf.common.util.EList<String> getLeadingComments() {
        if (leadingComments == null) {
            leadingComments = new EDataTypeUniqueEList<>(String.class, this, SqlAstPackage.SQL_SCRIPT__LEADING_COMMENTS);
        }
        return leadingComments;
    }
}
