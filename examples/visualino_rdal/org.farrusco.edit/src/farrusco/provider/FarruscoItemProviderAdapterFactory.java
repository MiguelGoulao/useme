/**
 */
package farrusco.provider;

import farrusco.util.FarruscoAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FarruscoItemProviderAdapterFactory extends FarruscoAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FarruscoItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Robot} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RobotItemProvider robotItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Robot}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createRobotAdapter()
  {
    if (robotItemProvider == null)
    {
      robotItemProvider = new RobotItemProvider(this);
    }

    return robotItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Node} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeItemProvider nodeItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Node}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createNodeAdapter()
  {
    if (nodeItemProvider == null)
    {
      nodeItemProvider = new NodeItemProvider(this);
    }

    return nodeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Filho} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilhoItemProvider filhoItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Filho}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createFilhoAdapter()
  {
    if (filhoItemProvider == null)
    {
      filhoItemProvider = new FilhoItemProvider(this);
    }

    return filhoItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Irmao} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IrmaoItemProvider irmaoItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Irmao}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createIrmaoAdapter()
  {
    if (irmaoItemProvider == null)
    {
      irmaoItemProvider = new IrmaoItemProvider(this);
    }

    return irmaoItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Behavior} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BehaviorItemProvider behaviorItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Behavior}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createBehaviorAdapter()
  {
    if (behaviorItemProvider == null)
    {
      behaviorItemProvider = new BehaviorItemProvider(this);
    }

    return behaviorItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Prioridade} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrioridadeItemProvider prioridadeItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Prioridade}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createPrioridadeAdapter()
  {
    if (prioridadeItemProvider == null)
    {
      prioridadeItemProvider = new PrioridadeItemProvider(this);
    }

    return prioridadeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Paralelo} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParaleloItemProvider paraleloItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Paralelo}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createParaleloAdapter()
  {
    if (paraleloItemProvider == null)
    {
      paraleloItemProvider = new ParaleloItemProvider(this);
    }

    return paraleloItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Sequencial} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequencialItemProvider sequencialItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Sequencial}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createSequencialAdapter()
  {
    if (sequencialItemProvider == null)
    {
      sequencialItemProvider = new SequencialItemProvider(this);
    }

    return sequencialItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.AlterarEstado} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlterarEstadoItemProvider alterarEstadoItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.AlterarEstado}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAlterarEstadoAdapter()
  {
    if (alterarEstadoItemProvider == null)
    {
      alterarEstadoItemProvider = new AlterarEstadoItemProvider(this);
    }

    return alterarEstadoItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Distancia} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DistanciaItemProvider distanciaItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Distancia}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDistanciaAdapter()
  {
    if (distanciaItemProvider == null)
    {
      distanciaItemProvider = new DistanciaItemProvider(this);
    }

    return distanciaItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Bumpers} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BumpersItemProvider bumpersItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Bumpers}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createBumpersAdapter()
  {
    if (bumpersItemProvider == null)
    {
      bumpersItemProvider = new BumpersItemProvider(this);
    }

    return bumpersItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Espera} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EsperaItemProvider esperaItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Espera}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEsperaAdapter()
  {
    if (esperaItemProvider == null)
    {
      esperaItemProvider = new EsperaItemProvider(this);
    }

    return esperaItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Motor} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MotorItemProvider motorItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Motor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createMotorAdapter()
  {
    if (motorItemProvider == null)
    {
      motorItemProvider = new MotorItemProvider(this);
    }

    return motorItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.Servo} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServoItemProvider servoItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.Servo}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createServoAdapter()
  {
    if (servoItemProvider == null)
    {
      servoItemProvider = new ServoItemProvider(this);
    }

    return servoItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link farrusco.LED} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LEDItemProvider ledItemProvider;

  /**
   * This creates an adapter for a {@link farrusco.LED}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createLEDAdapter()
  {
    if (ledItemProvider == null)
    {
      ledItemProvider = new LEDItemProvider(this);
    }

    return ledItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type)
  {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type)
  {
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
      {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification)
  {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null)
    {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose()
  {
    if (robotItemProvider != null) robotItemProvider.dispose();
    if (nodeItemProvider != null) nodeItemProvider.dispose();
    if (filhoItemProvider != null) filhoItemProvider.dispose();
    if (irmaoItemProvider != null) irmaoItemProvider.dispose();
    if (behaviorItemProvider != null) behaviorItemProvider.dispose();
    if (prioridadeItemProvider != null) prioridadeItemProvider.dispose();
    if (paraleloItemProvider != null) paraleloItemProvider.dispose();
    if (sequencialItemProvider != null) sequencialItemProvider.dispose();
    if (alterarEstadoItemProvider != null) alterarEstadoItemProvider.dispose();
    if (distanciaItemProvider != null) distanciaItemProvider.dispose();
    if (bumpersItemProvider != null) bumpersItemProvider.dispose();
    if (esperaItemProvider != null) esperaItemProvider.dispose();
    if (motorItemProvider != null) motorItemProvider.dispose();
    if (servoItemProvider != null) servoItemProvider.dispose();
    if (ledItemProvider != null) ledItemProvider.dispose();
  }

}