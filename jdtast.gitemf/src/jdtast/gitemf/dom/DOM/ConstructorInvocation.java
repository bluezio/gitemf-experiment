/**
 */
package jdtast.gitemf.dom.DOM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.ConstructorInvocation#getArguments <em>Arguments</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.ConstructorInvocation#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.dom.DOM.DOMPackage#getConstructorInvocation()
 * @model
 * @generated
 */
public interface ConstructorInvocation extends Statement {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link jdtast.gitemf.dom.DOM.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getConstructorInvocation_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link jdtast.gitemf.dom.DOM.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' containment reference list.
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getConstructorInvocation_TypeArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getTypeArguments();

} // ConstructorInvocation
