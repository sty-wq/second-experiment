/**
 */
package homework.metamodel.homework;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homework.metamodel.homework.Course#getHomework <em>Homework</em>}</li>
 *   <li>{@link homework.metamodel.homework.Course#getPerson <em>Person</em>}</li>
 *   <li>{@link homework.metamodel.homework.Course#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see homework.metamodel.homework.HomeworkPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Homework</b></em>' containment reference list.
	 * The list contents are of type {@link homework.metamodel.homework.Homework}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homework</em>' containment reference list.
	 * @see homework.metamodel.homework.HomeworkPackage#getCourse_Homework()
	 * @model containment="true"
	 * @generated
	 */
	EList<Homework> getHomework();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link homework.metamodel.homework.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see homework.metamodel.homework.HomeworkPackage#getCourse_Person()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see homework.metamodel.homework.HomeworkPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link homework.metamodel.homework.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Course
