/**
 */
package fr.tpt.useme.architecture.model.usemearch;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getOwnedInstanceElements <em>Owned Instance Elements</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getDevelopedDsl <em>Developed Dsl</em>}</li>
 *   <li>{@link fr.tpt.useme.architecture.model.usemearch.ContextSpecification#getOwnedConnections <em>Owned Connections</em>}</li>
 * </ul>
 *
 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextSpecification()
 * @model
 * @generated
 */
public interface ContextSpecification extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Owned Instance Elements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.ContextElementInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Instance Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Instance Elements</em>' containment reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextSpecification_OwnedInstanceElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ContextElementInstance> getOwnedInstanceElements();

	/**
	 * Returns the value of the '<em><b>Developed Dsl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Developed Dsl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developed Dsl</em>' reference.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextSpecification_DevelopedDsl()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Dsl getDevelopedDsl();

	/**
	 * Returns the value of the '<em><b>Owned Connections</b></em>' containment reference list.
	 * The list contents are of type {@link fr.tpt.useme.architecture.model.usemearch.ElementInstanceConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Connections</em>' containment reference list.
	 * @see fr.tpt.useme.architecture.model.usemearch.UsemearchPackage#getContextSpecification_OwnedConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementInstanceConnection> getOwnedConnections();

} // ContextSpecification
