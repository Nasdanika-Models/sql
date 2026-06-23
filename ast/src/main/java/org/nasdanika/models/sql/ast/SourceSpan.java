/**
 */
package org.nasdanika.models.sql.ast;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Span</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.sql.ast.SourceSpan#getStartLine <em>Start Line</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.SourceSpan#getStartColumn <em>Start Column</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.SourceSpan#getEndLine <em>End Line</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.SourceSpan#getEndColumn <em>End Column</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.SourceSpan#getStartOffset <em>Start Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.sql.ast.SourceSpan#getEndOffset <em>End Offset</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.sql.ast.AstPackage#getSourceSpan()
 * @model
 * @generated
 */
public interface SourceSpan extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Line</em>' attribute.
	 * @see #setStartLine(int)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSourceSpan_StartLine()
	 * @model
	 * @generated
	 */
	int getStartLine();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SourceSpan#getStartLine <em>Start Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Line</em>' attribute.
	 * @see #getStartLine()
	 * @generated
	 */
	void setStartLine(int value);

	/**
	 * Returns the value of the '<em><b>Start Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Column</em>' attribute.
	 * @see #setStartColumn(int)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSourceSpan_StartColumn()
	 * @model
	 * @generated
	 */
	int getStartColumn();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SourceSpan#getStartColumn <em>Start Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Column</em>' attribute.
	 * @see #getStartColumn()
	 * @generated
	 */
	void setStartColumn(int value);

	/**
	 * Returns the value of the '<em><b>End Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Line</em>' attribute.
	 * @see #setEndLine(int)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSourceSpan_EndLine()
	 * @model
	 * @generated
	 */
	int getEndLine();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SourceSpan#getEndLine <em>End Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Line</em>' attribute.
	 * @see #getEndLine()
	 * @generated
	 */
	void setEndLine(int value);

	/**
	 * Returns the value of the '<em><b>End Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Column</em>' attribute.
	 * @see #setEndColumn(int)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSourceSpan_EndColumn()
	 * @model
	 * @generated
	 */
	int getEndColumn();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SourceSpan#getEndColumn <em>End Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Column</em>' attribute.
	 * @see #getEndColumn()
	 * @generated
	 */
	void setEndColumn(int value);

	/**
	 * Returns the value of the '<em><b>Start Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Offset</em>' attribute.
	 * @see #setStartOffset(int)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSourceSpan_StartOffset()
	 * @model
	 * @generated
	 */
	int getStartOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SourceSpan#getStartOffset <em>Start Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Offset</em>' attribute.
	 * @see #getStartOffset()
	 * @generated
	 */
	void setStartOffset(int value);

	/**
	 * Returns the value of the '<em><b>End Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Offset</em>' attribute.
	 * @see #setEndOffset(int)
	 * @see org.nasdanika.models.sql.ast.AstPackage#getSourceSpan_EndOffset()
	 * @model
	 * @generated
	 */
	int getEndOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.sql.ast.SourceSpan#getEndOffset <em>End Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Offset</em>' attribute.
	 * @see #getEndOffset()
	 * @generated
	 */
	void setEndOffset(int value);

} // SourceSpan
