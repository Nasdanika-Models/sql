package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.sql.ast.*;

public abstract class AstNodeImpl extends MinimalEObjectImpl.Container implements AstNode {
    protected SourceSpan sourceSpan;
    protected String comment;

    protected AstNodeImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getAstNode();
    }

    @Override
    public SourceSpan getSourceSpan() {
        return sourceSpan;
    }

    @Override
    public void setSourceSpan(SourceSpan value) {
        this.sourceSpan = value;
    }

    @Override
    public String getComment() {
        return comment;
    }

    @Override
    public void setComment(String value) {
        this.comment = value;
    }
}
