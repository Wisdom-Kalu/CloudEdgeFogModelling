/**
 */
package saproject.one.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import saproject.one.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see saproject.one.OnePackage
 * @generated
 */
public class OneAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OnePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OnePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneSwitch<Adapter> modelSwitch = new OneSwitch<Adapter>() {
		@Override
		public Adapter caseLocalStorage(LocalStorage object) {
			return createLocalStorageAdapter();
		}

		@Override
		public Adapter caseEmbeddedFlashMemory(EmbeddedFlashMemory object) {
			return createEmbeddedFlashMemoryAdapter();
		}

		@Override
		public Adapter caseSSDs(SSDs object) {
			return createSSDsAdapter();
		}

		@Override
		public Adapter caseNVMe(NVMe object) {
			return createNVMeAdapter();
		}

		@Override
		public Adapter caseFileSystems(FileSystems object) {
			return createFileSystemsAdapter();
		}

		@Override
		public Adapter caseIPFS(IPFS object) {
			return createIPFSAdapter();
		}

		@Override
		public Adapter caseNoSQL(NoSQL object) {
			return createNoSQLAdapter();
		}

		@Override
		public Adapter caseNewSQL(NewSQL object) {
			return createNewSQLAdapter();
		}

		@Override
		public Adapter caseDocument(Document object) {
			return createDocumentAdapter();
		}

		@Override
		public Adapter caseColumn(Column object) {
			return createColumnAdapter();
		}

		@Override
		public Adapter caseKeyValue(KeyValue object) {
			return createKeyValueAdapter();
		}

		@Override
		public Adapter caseGraph(Graph object) {
			return createGraphAdapter();
		}

		@Override
		public Adapter caseHistorical(Historical object) {
			return createHistoricalAdapter();
		}

		@Override
		public Adapter caseRealTime(RealTime object) {
			return createRealTimeAdapter();
		}

		@Override
		public Adapter caseStream(Stream object) {
			return createStreamAdapter();
		}

		@Override
		public Adapter caseTimeStamp(TimeStamp object) {
			return createTimeStampAdapter();
		}

		@Override
		public Adapter caseDataLocation(DataLocation object) {
			return createDataLocationAdapter();
		}

		@Override
		public Adapter caseProcessingType(ProcessingType object) {
			return createProcessingTypeAdapter();
		}

		@Override
		public Adapter caseBatch(Batch object) {
			return createBatchAdapter();
		}

		@Override
		public Adapter caseRealTimeProcessing(RealTimeProcessing object) {
			return createRealTimeProcessingAdapter();
		}

		@Override
		public Adapter caseStorageType(StorageType object) {
			return createStorageTypeAdapter();
		}

		@Override
		public Adapter caseDataArchitecture(DataArchitecture object) {
			return createDataArchitectureAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseComputingUnit(ComputingUnit object) {
			return createComputingUnitAdapter();
		}

		@Override
		public Adapter caseCloud(Cloud object) {
			return createCloudAdapter();
		}

		@Override
		public Adapter caseFog(Fog object) {
			return createFogAdapter();
		}

		@Override
		public Adapter caseEdge(Edge object) {
			return createEdgeAdapter();
		}

		@Override
		public Adapter caseLoadBalancer(LoadBalancer object) {
			return createLoadBalancerAdapter();
		}

		@Override
		public Adapter caseConnection(Connection object) {
			return createConnectionAdapter();
		}

		@Override
		public Adapter caseNetworkProtocols(NetworkProtocols object) {
			return createNetworkProtocolsAdapter();
		}

		@Override
		public Adapter caseMQTT(MQTT object) {
			return createMQTTAdapter();
		}

		@Override
		public Adapter caseTCP_IP(TCP_IP object) {
			return createTCP_IPAdapter();
		}

		@Override
		public Adapter caseConnectionType(ConnectionType object) {
			return createConnectionTypeAdapter();
		}

		@Override
		public Adapter casePublisherSubscriberConnection(PublisherSubscriberConnection object) {
			return createPublisherSubscriberConnectionAdapter();
		}

		@Override
		public Adapter caseClientServerConnection(ClientServerConnection object) {
			return createClientServerConnectionAdapter();
		}

		@Override
		public Adapter casePushPull(PushPull object) {
			return createPushPullAdapter();
		}

		@Override
		public Adapter caseNodeBehavior(NodeBehavior object) {
			return createNodeBehaviorAdapter();
		}

		@Override
		public Adapter caseInDataPort(InDataPort object) {
			return createInDataPortAdapter();
		}

		@Override
		public Adapter caseOutDataPort(OutDataPort object) {
			return createOutDataPortAdapter();
		}

		@Override
		public Adapter caseDataPort(DataPort object) {
			return createDataPortAdapter();
		}

		@Override
		public Adapter caseRequestResponse(RequestResponse object) {
			return createRequestResponseAdapter();
		}

		@Override
		public Adapter caseHTTP_HTTPS(HTTP_HTTPS object) {
			return createHTTP_HTTPSAdapter();
		}

		@Override
		public Adapter caseFTP(FTP object) {
			return createFTPAdapter();
		}

		@Override
		public Adapter casePointToPoint(PointToPoint object) {
			return createPointToPointAdapter();
		}

		@Override
		public Adapter caseStreamProcessing(StreamProcessing object) {
			return createStreamProcessingAdapter();
		}

		@Override
		public Adapter caseAsynchronousRequestReply(AsynchronousRequestReply object) {
			return createAsynchronousRequestReplyAdapter();
		}

		@Override
		public Adapter caseWebSocket(WebSocket object) {
			return createWebSocketAdapter();
		}

		@Override
		public Adapter caseMessageQueueing(MessageQueueing object) {
			return createMessageQueueingAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.LocalStorage <em>Local Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.LocalStorage
	 * @generated
	 */
	public Adapter createLocalStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.EmbeddedFlashMemory <em>Embedded Flash Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.EmbeddedFlashMemory
	 * @generated
	 */
	public Adapter createEmbeddedFlashMemoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.SSDs <em>SS Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.SSDs
	 * @generated
	 */
	public Adapter createSSDsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.NVMe <em>NV Me</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.NVMe
	 * @generated
	 */
	public Adapter createNVMeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.FileSystems <em>File Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.FileSystems
	 * @generated
	 */
	public Adapter createFileSystemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.IPFS <em>IPFS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.IPFS
	 * @generated
	 */
	public Adapter createIPFSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.NoSQL <em>No SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.NoSQL
	 * @generated
	 */
	public Adapter createNoSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.NewSQL <em>New SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.NewSQL
	 * @generated
	 */
	public Adapter createNewSQLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.KeyValue
	 * @generated
	 */
	public Adapter createKeyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.Graph
	 * @generated
	 */
	public Adapter createGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.Historical <em>Historical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.Historical
	 * @generated
	 */
	public Adapter createHistoricalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.RealTime <em>Real Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.RealTime
	 * @generated
	 */
	public Adapter createRealTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.Stream
	 * @generated
	 */
	public Adapter createStreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.TimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.TimeStamp
	 * @generated
	 */
	public Adapter createTimeStampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.DataLocation <em>Data Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.DataLocation
	 * @generated
	 */
	public Adapter createDataLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.ProcessingType <em>Processing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.ProcessingType
	 * @generated
	 */
	public Adapter createProcessingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.Batch <em>Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.Batch
	 * @generated
	 */
	public Adapter createBatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.RealTimeProcessing <em>Real Time Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.RealTimeProcessing
	 * @generated
	 */
	public Adapter createRealTimeProcessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.StorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.StorageType
	 * @generated
	 */
	public Adapter createStorageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.DataArchitecture <em>Data Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.DataArchitecture
	 * @generated
	 */
	public Adapter createDataArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.ComputingUnit <em>Computing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.ComputingUnit
	 * @generated
	 */
	public Adapter createComputingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.Cloud
	 * @generated
	 */
	public Adapter createCloudAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.Fog <em>Fog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.Fog
	 * @generated
	 */
	public Adapter createFogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.LoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.LoadBalancer
	 * @generated
	 */
	public Adapter createLoadBalancerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.NetworkProtocols <em>Network Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.NetworkProtocols
	 * @generated
	 */
	public Adapter createNetworkProtocolsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.MQTT <em>MQTT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.MQTT
	 * @generated
	 */
	public Adapter createMQTTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.TCP_IP <em>TCP IP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.TCP_IP
	 * @generated
	 */
	public Adapter createTCP_IPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.ConnectionType
	 * @generated
	 */
	public Adapter createConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.PublisherSubscriberConnection <em>Publisher Subscriber Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.PublisherSubscriberConnection
	 * @generated
	 */
	public Adapter createPublisherSubscriberConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.ClientServerConnection <em>Client Server Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.ClientServerConnection
	 * @generated
	 */
	public Adapter createClientServerConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.PushPull <em>Push Pull</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.PushPull
	 * @generated
	 */
	public Adapter createPushPullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.NodeBehavior <em>Node Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.NodeBehavior
	 * @generated
	 */
	public Adapter createNodeBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.InDataPort <em>In Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.InDataPort
	 * @generated
	 */
	public Adapter createInDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.OutDataPort <em>Out Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.OutDataPort
	 * @generated
	 */
	public Adapter createOutDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.DataPort
	 * @generated
	 */
	public Adapter createDataPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.RequestResponse <em>Request Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.RequestResponse
	 * @generated
	 */
	public Adapter createRequestResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.HTTP_HTTPS <em>HTTP HTTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.HTTP_HTTPS
	 * @generated
	 */
	public Adapter createHTTP_HTTPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.FTP <em>FTP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.FTP
	 * @generated
	 */
	public Adapter createFTPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.PointToPoint <em>Point To Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.PointToPoint
	 * @generated
	 */
	public Adapter createPointToPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.StreamProcessing <em>Stream Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.StreamProcessing
	 * @generated
	 */
	public Adapter createStreamProcessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.AsynchronousRequestReply <em>Asynchronous Request Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.AsynchronousRequestReply
	 * @generated
	 */
	public Adapter createAsynchronousRequestReplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.WebSocket <em>Web Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.WebSocket
	 * @generated
	 */
	public Adapter createWebSocketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link saproject.one.MessageQueueing <em>Message Queueing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see saproject.one.MessageQueueing
	 * @generated
	 */
	public Adapter createMessageQueueingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OneAdapterFactory
