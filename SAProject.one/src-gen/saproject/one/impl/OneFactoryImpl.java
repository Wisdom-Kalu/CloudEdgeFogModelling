/**
 */
package saproject.one.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import saproject.one.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OneFactoryImpl extends EFactoryImpl implements OneFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OneFactory init() {
		try {
			OneFactory theOneFactory = (OneFactory) EPackage.Registry.INSTANCE.getEFactory(OnePackage.eNS_URI);
			if (theOneFactory != null) {
				return theOneFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OneFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case OnePackage.EMBEDDED_FLASH_MEMORY:
			return createEmbeddedFlashMemory();
		case OnePackage.SS_DS:
			return createSSDs();
		case OnePackage.NV_ME:
			return createNVMe();
		case OnePackage.IPFS:
			return createIPFS();
		case OnePackage.DOCUMENT:
			return createDocument();
		case OnePackage.COLUMN:
			return createColumn();
		case OnePackage.KEY_VALUE:
			return createKeyValue();
		case OnePackage.GRAPH:
			return createGraph();
		case OnePackage.HISTORICAL:
			return createHistorical();
		case OnePackage.REAL_TIME:
			return createRealTime();
		case OnePackage.STREAM:
			return createStream();
		case OnePackage.TIME_STAMP:
			return createTimeStamp();
		case OnePackage.DATA_LOCATION:
			return createDataLocation();
		case OnePackage.PROCESSING_TYPE:
			return createProcessingType();
		case OnePackage.BATCH:
			return createBatch();
		case OnePackage.REAL_TIME_PROCESSING:
			return createRealTimeProcessing();
		case OnePackage.STORAGE_TYPE:
			return createStorageType();
		case OnePackage.DATA_ARCHITECTURE:
			return createDataArchitecture();
		case OnePackage.COMPONENT:
			return createComponent();
		case OnePackage.COMPUTING_UNIT:
			return createComputingUnit();
		case OnePackage.CLOUD:
			return createCloud();
		case OnePackage.FOG:
			return createFog();
		case OnePackage.EDGE:
			return createEdge();
		case OnePackage.LOAD_BALANCER:
			return createLoadBalancer();
		case OnePackage.CONNECTION:
			return createConnection();
		case OnePackage.NETWORK_PROTOCOLS:
			return createNetworkProtocols();
		case OnePackage.MQTT:
			return createMQTT();
		case OnePackage.TCP_IP:
			return createTCP_IP();
		case OnePackage.CONNECTION_TYPE:
			return createConnectionType();
		case OnePackage.PUBLISHER_SUBSCRIBER_CONNECTION:
			return createPublisherSubscriberConnection();
		case OnePackage.CLIENT_SERVER_CONNECTION:
			return createClientServerConnection();
		case OnePackage.PUSH_PULL:
			return createPushPull();
		case OnePackage.NODE_BEHAVIOR:
			return createNodeBehavior();
		case OnePackage.IN_DATA_PORT:
			return createInDataPort();
		case OnePackage.OUT_DATA_PORT:
			return createOutDataPort();
		case OnePackage.DATA_PORT:
			return createDataPort();
		case OnePackage.REQUEST_RESPONSE:
			return createRequestResponse();
		case OnePackage.HTTP_HTTPS:
			return createHTTP_HTTPS();
		case OnePackage.FTP:
			return createFTP();
		case OnePackage.POINT_TO_POINT:
			return createPointToPoint();
		case OnePackage.STREAM_PROCESSING:
			return createStreamProcessing();
		case OnePackage.ASYNCHRONOUS_REQUEST_REPLY:
			return createAsynchronousRequestReply();
		case OnePackage.WEB_SOCKET:
			return createWebSocket();
		case OnePackage.MESSAGE_QUEUEING:
			return createMessageQueueing();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmbeddedFlashMemory createEmbeddedFlashMemory() {
		EmbeddedFlashMemoryImpl embeddedFlashMemory = new EmbeddedFlashMemoryImpl();
		return embeddedFlashMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SSDs createSSDs() {
		SSDsImpl ssDs = new SSDsImpl();
		return ssDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NVMe createNVMe() {
		NVMeImpl nvMe = new NVMeImpl();
		return nvMe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IPFS createIPFS() {
		IPFSImpl ipfs = new IPFSImpl();
		return ipfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValue createKeyValue() {
		KeyValueImpl keyValue = new KeyValueImpl();
		return keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Historical createHistorical() {
		HistoricalImpl historical = new HistoricalImpl();
		return historical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealTime createRealTime() {
		RealTimeImpl realTime = new RealTimeImpl();
		return realTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stream createStream() {
		StreamImpl stream = new StreamImpl();
		return stream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeStamp createTimeStamp() {
		TimeStampImpl timeStamp = new TimeStampImpl();
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataLocation createDataLocation() {
		DataLocationImpl dataLocation = new DataLocationImpl();
		return dataLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingType createProcessingType() {
		ProcessingTypeImpl processingType = new ProcessingTypeImpl();
		return processingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Batch createBatch() {
		BatchImpl batch = new BatchImpl();
		return batch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealTimeProcessing createRealTimeProcessing() {
		RealTimeProcessingImpl realTimeProcessing = new RealTimeProcessingImpl();
		return realTimeProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageType createStorageType() {
		StorageTypeImpl storageType = new StorageTypeImpl();
		return storageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataArchitecture createDataArchitecture() {
		DataArchitectureImpl dataArchitecture = new DataArchitectureImpl();
		return dataArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputingUnit createComputingUnit() {
		ComputingUnitImpl computingUnit = new ComputingUnitImpl();
		return computingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cloud createCloud() {
		CloudImpl cloud = new CloudImpl();
		return cloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fog createFog() {
		FogImpl fog = new FogImpl();
		return fog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBalancer createLoadBalancer() {
		LoadBalancerImpl loadBalancer = new LoadBalancerImpl();
		return loadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkProtocols createNetworkProtocols() {
		NetworkProtocolsImpl networkProtocols = new NetworkProtocolsImpl();
		return networkProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MQTT createMQTT() {
		MQTTImpl mqtt = new MQTTImpl();
		return mqtt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCP_IP createTCP_IP() {
		TCP_IPImpl tcP_IP = new TCP_IPImpl();
		return tcP_IP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionType createConnectionType() {
		ConnectionTypeImpl connectionType = new ConnectionTypeImpl();
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PublisherSubscriberConnection createPublisherSubscriberConnection() {
		PublisherSubscriberConnectionImpl publisherSubscriberConnection = new PublisherSubscriberConnectionImpl();
		return publisherSubscriberConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClientServerConnection createClientServerConnection() {
		ClientServerConnectionImpl clientServerConnection = new ClientServerConnectionImpl();
		return clientServerConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PushPull createPushPull() {
		PushPullImpl pushPull = new PushPullImpl();
		return pushPull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeBehavior createNodeBehavior() {
		NodeBehaviorImpl nodeBehavior = new NodeBehaviorImpl();
		return nodeBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InDataPort createInDataPort() {
		InDataPortImpl inDataPort = new InDataPortImpl();
		return inDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutDataPort createOutDataPort() {
		OutDataPortImpl outDataPort = new OutDataPortImpl();
		return outDataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataPort createDataPort() {
		DataPortImpl dataPort = new DataPortImpl();
		return dataPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestResponse createRequestResponse() {
		RequestResponseImpl requestResponse = new RequestResponseImpl();
		return requestResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTTP_HTTPS createHTTP_HTTPS() {
		HTTP_HTTPSImpl httP_HTTPS = new HTTP_HTTPSImpl();
		return httP_HTTPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FTP createFTP() {
		FTPImpl ftp = new FTPImpl();
		return ftp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointToPoint createPointToPoint() {
		PointToPointImpl pointToPoint = new PointToPointImpl();
		return pointToPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StreamProcessing createStreamProcessing() {
		StreamProcessingImpl streamProcessing = new StreamProcessingImpl();
		return streamProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AsynchronousRequestReply createAsynchronousRequestReply() {
		AsynchronousRequestReplyImpl asynchronousRequestReply = new AsynchronousRequestReplyImpl();
		return asynchronousRequestReply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSocket createWebSocket() {
		WebSocketImpl webSocket = new WebSocketImpl();
		return webSocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageQueueing createMessageQueueing() {
		MessageQueueingImpl messageQueueing = new MessageQueueingImpl();
		return messageQueueing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnePackage getOnePackage() {
		return (OnePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OnePackage getPackage() {
		return OnePackage.eINSTANCE;
	}

} //OneFactoryImpl
