/**
 */
package homework.metamodel.homework.impl;

import homework.metamodel.homework.Homework;
import homework.metamodel.homework.HomeworkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Homework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link homework.metamodel.homework.impl.HomeworkImpl#getDescribe <em>Describe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HomeworkImpl extends MinimalEObjectImpl.Container implements Homework {
	/**
	 * The default value of the '{@link #getDescribe() <em>Describe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribe()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIBE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescribe() <em>Describe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribe()
	 * @generated
	 * @ordered
	 */
	protected String describe = DESCRIBE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HomeworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HomeworkPackage.Literals.HOMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescribe() {
		return describe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescribe(String newDescribe) {
		String oldDescribe = describe;
		describe = newDescribe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HomeworkPackage.HOMEWORK__DESCRIBE, oldDescribe,
					describe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HomeworkPackage.HOMEWORK__DESCRIBE:
			return getDescribe();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HomeworkPackage.HOMEWORK__DESCRIBE:
			setDescribe((String) newValue);
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
		case HomeworkPackage.HOMEWORK__DESCRIBE:
			setDescribe(DESCRIBE_EDEFAULT);
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
		case HomeworkPackage.HOMEWORK__DESCRIBE:
			return DESCRIBE_EDEFAULT == null ? describe != null : !DESCRIBE_EDEFAULT.equals(describe);
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
		result.append(" (Describe: ");
		result.append(describe);
		result.append(')');
		return result.toString();
	}

} //HomeworkImpl
