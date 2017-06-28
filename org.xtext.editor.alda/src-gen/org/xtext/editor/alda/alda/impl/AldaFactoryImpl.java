/**
 * generated by Xtext 2.12.0
 */
package org.xtext.editor.alda.alda.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.editor.alda.alda.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AldaFactoryImpl extends EFactoryImpl implements AldaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AldaFactory init()
  {
    try
    {
      AldaFactory theAldaFactory = (AldaFactory)EPackage.Registry.INSTANCE.getEFactory(AldaPackage.eNS_URI);
      if (theAldaFactory != null)
      {
        return theAldaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AldaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AldaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AldaPackage.MODEL: return createModel();
      case AldaPackage.DECLRATIONS: return createDECLRATIONS();
      case AldaPackage.COMMENT: return createCOMMENT();
      case AldaPackage.INSTRUMENTS: return createINSTRUMENTS();
      case AldaPackage.TEMPO: return createTempo();
      case AldaPackage.QUANT: return createQuant();
      case AldaPackage.VOLUME: return createVolume();
      case AldaPackage.KEY_SIGNATURE: return createKeySignature();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DECLRATIONS createDECLRATIONS()
  {
    DECLRATIONSImpl declrations = new DECLRATIONSImpl();
    return declrations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COMMENT createCOMMENT()
  {
    COMMENTImpl comment = new COMMENTImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INSTRUMENTS createINSTRUMENTS()
  {
    INSTRUMENTSImpl instruments = new INSTRUMENTSImpl();
    return instruments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tempo createTempo()
  {
    TempoImpl tempo = new TempoImpl();
    return tempo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quant createQuant()
  {
    QuantImpl quant = new QuantImpl();
    return quant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Volume createVolume()
  {
    VolumeImpl volume = new VolumeImpl();
    return volume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeySignature createKeySignature()
  {
    KeySignatureImpl keySignature = new KeySignatureImpl();
    return keySignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AldaPackage getAldaPackage()
  {
    return (AldaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AldaPackage getPackage()
  {
    return AldaPackage.eINSTANCE;
  }

} //AldaFactoryImpl
