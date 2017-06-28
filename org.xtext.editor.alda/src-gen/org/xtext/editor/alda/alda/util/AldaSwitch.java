/**
 * generated by Xtext 2.12.0
 */
package org.xtext.editor.alda.alda.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.editor.alda.alda.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.editor.alda.alda.AldaPackage
 * @generated
 */
public class AldaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AldaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AldaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AldaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AldaPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AldaPackage.DECLRATIONS:
      {
        DECLRATIONS declrations = (DECLRATIONS)theEObject;
        T result = caseDECLRATIONS(declrations);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AldaPackage.COMMENT:
      {
        COMMENT comment = (COMMENT)theEObject;
        T result = caseCOMMENT(comment);
        if (result == null) result = caseDECLRATIONS(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AldaPackage.INSTRUMENTS:
      {
        INSTRUMENTS instruments = (INSTRUMENTS)theEObject;
        T result = caseINSTRUMENTS(instruments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AldaPackage.TEMPO:
      {
        Tempo tempo = (Tempo)theEObject;
        T result = caseTempo(tempo);
        if (result == null) result = caseDECLRATIONS(tempo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AldaPackage.QUANT:
      {
        Quant quant = (Quant)theEObject;
        T result = caseQuant(quant);
        if (result == null) result = caseDECLRATIONS(quant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AldaPackage.VOLUME:
      {
        Volume volume = (Volume)theEObject;
        T result = caseVolume(volume);
        if (result == null) result = caseDECLRATIONS(volume);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AldaPackage.KEY_SIGNATURE:
      {
        KeySignature keySignature = (KeySignature)theEObject;
        T result = caseKeySignature(keySignature);
        if (result == null) result = caseDECLRATIONS(keySignature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DECLRATIONS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DECLRATIONS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDECLRATIONS(DECLRATIONS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>COMMENT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>COMMENT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCOMMENT(COMMENT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>INSTRUMENTS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>INSTRUMENTS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseINSTRUMENTS(INSTRUMENTS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tempo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tempo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTempo(Tempo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuant(Quant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVolume(Volume object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Signature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Signature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeySignature(KeySignature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AldaSwitch
