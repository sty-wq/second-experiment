/**
 */
package homework.metamodel.homework;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Homework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homework.metamodel.homework.Homework#getDescribe <em>Describe</em>}</li>
 * </ul>
 *
 * @see homework.metamodel.homework.HomeworkPackage#getHomework()
 * @model
 * @generated
 */
public interface Homework extends EObject {

	/**
	 * Returns the value of the '<em><b>Describe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describe</em>' attribute.
	 * @see #setDescribe(String)
	 * @see homework.metamodel.homework.HomeworkPackage#getHomework_Describe()
	 * @model
	 * @generated
	 */
	String getDescribe();

	/**
	 * Sets the value of the '{@link homework.metamodel.homework.Homework#getDescribe <em>Describe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Describe</em>' attribute.
	 * @see #getDescribe()
	 * @generated
	 */
	void setDescribe(String value);
} // Homework
