/**
 * generated by Xtext 2.17.0
 */
package org.xtext.guicemodules.guiceModules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modules AST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.guicemodules.guiceModules.ModulesAST#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.xtext.guicemodules.guiceModules.ModulesAST#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getModulesAST()
 * @model
 * @generated
 */
public interface ModulesAST extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(XImportSection)
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getModulesAST_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();

  /**
   * Sets the value of the '{@link org.xtext.guicemodules.guiceModules.ModulesAST#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(XImportSection value);

  /**
   * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.guicemodules.guiceModules.ModuleAST}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modules</em>' containment reference list.
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getModulesAST_Modules()
   * @model containment="true"
   * @generated
   */
  EList<ModuleAST> getModules();

} // ModulesAST
