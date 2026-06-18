package org.nasdanika.models.sql.ast.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.sql.ast.*;

public class SourceSpanImpl extends MinimalEObjectImpl.Container implements SourceSpan {
    protected int startLine;
    protected int startColumn;
    protected int endLine;
    protected int endColumn;
    protected int startOffset;
    protected int endOffset;

    protected SourceSpanImpl() {
        super();
    }

    @Override
    protected EClass eStaticClass() {
        return SqlAstPackage.eINSTANCE.getSourceSpan();
    }

    @Override
    public int getStartLine() {
        return startLine;
    }

    @Override
    public void setStartLine(int value) {
        this.startLine = value;
    }

    @Override
    public int getStartColumn() {
        return startColumn;
    }

    @Override
    public void setStartColumn(int value) {
        this.startColumn = value;
    }

    @Override
    public int getEndLine() {
        return endLine;
    }

    @Override
    public void setEndLine(int value) {
        this.endLine = value;
    }

    @Override
    public int getEndColumn() {
        return endColumn;
    }

    @Override
    public void setEndColumn(int value) {
        this.endColumn = value;
    }

    @Override
    public int getStartOffset() {
        return startOffset;
    }

    @Override
    public void setStartOffset(int value) {
        this.startOffset = value;
    }

    @Override
    public int getEndOffset() {
        return endOffset;
    }

    @Override
    public void setEndOffset(int value) {
        this.endOffset = value;
    }
}
