/**
 */
package jdtast.gitemf.dom.DOM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.CompilationUnit#getComments <em>Comments</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.CompilationUnit#getPackage <em>Package</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.CompilationUnit#getImports <em>Imports</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.CompilationUnit#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.dom.DOM.DOMPackage#getCompilationUnit()
 * @model
 * @generated
 */
public interface CompilationUnit extends ASTNode {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link jdtast.gitemf.dom.DOM.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getCompilationUnit_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(PackageDeclaration)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getCompilationUnit_Package()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PackageDeclaration getPackage();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.CompilationUnit#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(PackageDeclaration value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link jdtast.gitemf.dom.DOM.ImportDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getCompilationUnit_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImportDeclaration> getImports();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link jdtast.gitemf.dom.DOM.AbstractTypeDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getCompilationUnit_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTypeDeclaration> getTypes();

} // CompilationUnit
