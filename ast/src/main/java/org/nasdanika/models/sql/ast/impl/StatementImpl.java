package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.sql.ast.*;

public abstract class StatementImpl extends AstNodeImpl implements Statement {
    protected String leadingComment;

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getStatement();
    }

    @Override
    public String getLeadingComment() {
        return leadingComment;
    }

    @Override
    public void setLeadingComment(String value) {
        this.leadingComment = value;
    }
}
