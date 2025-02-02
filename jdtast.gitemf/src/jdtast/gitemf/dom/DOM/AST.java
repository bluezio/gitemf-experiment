/**
 */
package jdtast.gitemf.dom.DOM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.AST#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.dom.DOM.DOMPackage#getAST()
 * @model
 * @generated
 */
public interface AST extends EObject {
	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compilation Units</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' containment reference.
	 * @see #setCompilationUnits(ASTNode)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getAST_CompilationUnits()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ASTNode getCompilationUnits();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.AST#getCompilationUnits <em>Compilation Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compilation Units</em>' containment reference.
	 * @see #getCompilationUnits()
	 * @generated
	 */
	void setCompilationUnits(ASTNode value);

} // AST
