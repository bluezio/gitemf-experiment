/**
 */
package jdtast.gitemf.dom.DOM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.dom.DOM.ArrayAccess#getArray <em>Array</em>}</li>
 *   <li>{@link jdtast.gitemf.dom.DOM.ArrayAccess#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.dom.DOM.DOMPackage#getArrayAccess()
 * @model
 * @generated
 */
public interface ArrayAccess extends Expression {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference.
	 * @see #setArray(Expression)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getArrayAccess_Array()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getArray();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.ArrayAccess#getArray <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' containment reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(Expression value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(Expression)
	 * @see jdtast.gitemf.dom.DOM.DOMPackage#getArrayAccess_Index()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Expression getIndex();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.dom.DOM.ArrayAccess#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Expression value);

} // ArrayAccess
