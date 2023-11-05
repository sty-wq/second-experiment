/**
 */
package homework.metamodel.homework.impl;

import homework.metamodel.homework.HomeworkPackage;
import homework.metamodel.homework.Person;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link homework.metamodel.homework.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link homework.metamodel.homework.impl.PersonImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link homework.metamodel.homework.impl.PersonImpl#getTeacher <em>Teacher</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> student;
	/**
	 * The cached value of the '{@link #getTeacher() <em>Teacher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeacher()
	 * @generated
	 * @ordered
	 */
	protected Person teacher;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HomeworkPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getStudent() {
		if (student == null) {
			student = new EObjectWithInverseResolvingEList<Person>(Person.class, this, HomeworkPackage.PERSON__STUDENT,
					HomeworkPackage.PERSON__TEACHER);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getTeacher() {
		if (teacher != null && teacher.eIsProxy()) {
			InternalEObject oldTeacher = (InternalEObject) teacher;
			teacher = (Person) eResolveProxy(oldTeacher);
			if (teacher != oldTeacher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HomeworkPackage.PERSON__TEACHER,
							oldTeacher, teacher));
			}
		}
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetTeacher() {
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeacher(Person newTeacher, NotificationChain msgs) {
		Person oldTeacher = teacher;
		teacher = newTeacher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					HomeworkPackage.PERSON__TEACHER, oldTeacher, newTeacher);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeacher(Person newTeacher) {
		if (newTeacher != teacher) {
			NotificationChain msgs = null;
			if (teacher != null)
				msgs = ((InternalEObject) teacher).eInverseRemove(this, HomeworkPackage.PERSON__STUDENT, Person.class,
						msgs);
			if (newTeacher != null)
				msgs = ((InternalEObject) newTeacher).eInverseAdd(this, HomeworkPackage.PERSON__STUDENT, Person.class,
						msgs);
			msgs = basicSetTeacher(newTeacher, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPackage.PERSON__TEACHER, newTeacher,
					newTeacher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HomeworkPackage.PERSON__STUDENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getStudent()).basicAdd(otherEnd, msgs);
		case HomeworkPackage.PERSON__TEACHER:
			if (teacher != null)
				msgs = ((InternalEObject) teacher).eInverseRemove(this, HomeworkPackage.PERSON__STUDENT, Person.class,
						msgs);
			return basicSetTeacher((Person) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case HomeworkPackage.PERSON__STUDENT:
			return ((InternalEList<?>) getStudent()).basicRemove(otherEnd, msgs);
		case HomeworkPackage.PERSON__TEACHER:
			return basicSetTeacher(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HomeworkPackage.PERSON__NAME:
			return getName();
		case HomeworkPackage.PERSON__STUDENT:
			return getStudent();
		case HomeworkPackage.PERSON__TEACHER:
			if (resolve)
				return getTeacher();
			return basicGetTeacher();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HomeworkPackage.PERSON__NAME:
			setName((String) newValue);
			return;
		case HomeworkPackage.PERSON__STUDENT:
			getStudent().clear();
			getStudent().addAll((Collection<? extends Person>) newValue);
			return;
		case HomeworkPackage.PERSON__TEACHER:
			setTeacher((Person) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HomeworkPackage.PERSON__NAME:
			setName(NAME_EDEFAULT);
			return;
		case HomeworkPackage.PERSON__STUDENT:
			getStudent().clear();
			return;
		case HomeworkPackage.PERSON__TEACHER:
			setTeacher((Person) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HomeworkPackage.PERSON__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case HomeworkPackage.PERSON__STUDENT:
			return student != null && !student.isEmpty();
		case HomeworkPackage.PERSON__TEACHER:
			return teacher != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
