/**
 */
package jdtast.gitemf.core.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jdtast.gitemf.core.Core.IMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.IMethod#getIsConstructor <em>Is Constructor</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.IMethod#getIsMainMethod <em>Is Main Method</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.IMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link jdtast.gitemf.core.Core.IMethod#getExceptionTypes <em>Exception Types</em>}</li>
 * </ul>
 *
 * @see jdtast.gitemf.core.Core.CorePackage#getIMethod()
 * @model
 * @generated
 */
public interface IMethod extends IMember {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see jdtast.gitemf.core.Core.CorePackage#getIMethod_ReturnType()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.core.Core.IMethod#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Is Constructor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Constructor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Constructor</em>' attribute.
	 * @see #setIsConstructor(Boolean)
	 * @see jdtast.gitemf.core.Core.CorePackage#getIMethod_IsConstructor()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsConstructor();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.core.Core.IMethod#getIsConstructor <em>Is Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Constructor</em>' attribute.
	 * @see #getIsConstructor()
	 * @generated
	 */
	void setIsConstructor(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Main Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Main Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Main Method</em>' attribute.
	 * @see #setIsMainMethod(Boolean)
	 * @see jdtast.gitemf.core.Core.CorePackage#getIMethod_IsMainMethod()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsMainMethod();

	/**
	 * Sets the value of the '{@link jdtast.gitemf.core.Core.IMethod#getIsMainMethod <em>Is Main Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Main Method</em>' attribute.
	 * @see #getIsMainMethod()
	 * @generated
	 */
	void setIsMainMethod(Boolean value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link jdtast.gitemf.core.Core.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see jdtast.gitemf.core.Core.CorePackage#getIMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Exception Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Types</em>' attribute list.
	 * @see jdtast.gitemf.core.Core.CorePackage#getIMethod_ExceptionTypes()
	 * @model unique="false" dataType="jdtast.gitemf.ptypes.PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	EList<String> getExceptionTypes();

} // IMethod
