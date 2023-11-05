/**
 */
package homework.metamodel.homework;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homework.metamodel.homework.Person#getName <em>Name</em>}</li>
 *   <li>{@link homework.metamodel.homework.Person#getStudent <em>Student</em>}</li>
 *   <li>{@link homework.metamodel.homework.Person#getTeacher <em>Teacher</em>}</li>
 * </ul>
 *
 * @see homework.metamodel.homework.HomeworkPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see homework.metamodel.homework.HomeworkPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link homework.metamodel.homework.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference list.
	 * The list contents are of type {@link homework.metamodel.homework.Person}.
	 * It is bidirectional and its opposite is '{@link homework.metamodel.homework.Person#getTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference list.
	 * @see homework.metamodel.homework.HomeworkPackage#getPerson_Student()
	 * @see homework.metamodel.homework.Person#getTeacher
	 * @model opposite="teacher" upper="2"
	 * @generated
	 */
	EList<Person> getStudent();

	/**
	 * Returns the value of the '<em><b>Teacher</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link homework.metamodel.homework.Person#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teacher</em>' reference.
	 * @see #setTeacher(Person)
	 * @see homework.metamodel.homework.HomeworkPackage#getPerson_Teacher()
	 * @see homework.metamodel.homework.Person#getStudent
	 * @model opposite="student"
	 * @generated
	 */
	Person getTeacher();

	/**
	 * Sets the value of the '{@link homework.metamodel.homework.Person#getTeacher <em>Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teacher</em>' reference.
	 * @see #getTeacher()
	 * @generated
	 */
	void setTeacher(Person value);

} // Person
