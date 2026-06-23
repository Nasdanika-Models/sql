/**
 */
package org.nasdanika.models.sql.ast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.AstNode#getSourceSpan <em>Source Span</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.AstNode#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getAstNode()
 * @model abstract="true"
 * @generated
 */
public interface AstNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Span</em>' containment reference.
	 * @see #setSourceSpan(SourceSpan)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getAstNode_SourceSpan()
	 * @model containment="true"
	 * @generated
	 */
	SourceSpan getSourceSpan();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.AstNode#getSourceSpan <em>Source Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Span</em>' containment reference.
	 * @see #getSourceSpan()
	 * @generated
	 */
	void setSourceSpan(SourceSpan value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trailing or inline comment associated with this node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getAstNode_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.AstNode#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // AstNode
