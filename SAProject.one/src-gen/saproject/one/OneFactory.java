/**
 */
package saproject.one;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see saproject.one.OnePackage
 * @generated
 */
public interface OneFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OneFactory eINSTANCE = saproject.one.impl.OneFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Embedded Flash Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedded Flash Memory</em>'.
	 * @generated
	 */
	EmbeddedFlashMemory createEmbeddedFlashMemory();

	/**
	 * Returns a new object of class '<em>SS Ds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SS Ds</em>'.
	 * @generated
	 */
	SSDs createSSDs();

	/**
	 * Returns a new object of class '<em>NV Me</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NV Me</em>'.
	 * @generated
	 */
	NVMe createNVMe();

	/**
	 * Returns a new object of class '<em>IPFS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IPFS</em>'.
	 * @generated
	 */
	IPFS createIPFS();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Key Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value</em>'.
	 * @generated
	 */
	KeyValue createKeyValue();

	/**
	 * Returns a new object of class '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph</em>'.
	 * @generated
	 */
	Graph createGraph();

	/**
	 * Returns a new object of class '<em>Historical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historical</em>'.
	 * @generated
	 */
	Historical createHistorical();

	/**
	 * Returns a new object of class '<em>Real Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Time</em>'.
	 * @generated
	 */
	RealTime createRealTime();

	/**
	 * Returns a new object of class '<em>Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream</em>'.
	 * @generated
	 */
	Stream createStream();

	/**
	 * Returns a new object of class '<em>Time Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Stamp</em>'.
	 * @generated
	 */
	TimeStamp createTimeStamp();

	/**
	 * Returns a new object of class '<em>Data Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Location</em>'.
	 * @generated
	 */
	DataLocation createDataLocation();

	/**
	 * Returns a new object of class '<em>Processing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Type</em>'.
	 * @generated
	 */
	ProcessingType createProcessingType();

	/**
	 * Returns a new object of class '<em>Batch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Batch</em>'.
	 * @generated
	 */
	Batch createBatch();

	/**
	 * Returns a new object of class '<em>Real Time Processing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Time Processing</em>'.
	 * @generated
	 */
	RealTimeProcessing createRealTimeProcessing();

	/**
	 * Returns a new object of class '<em>Storage Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Type</em>'.
	 * @generated
	 */
	StorageType createStorageType();

	/**
	 * Returns a new object of class '<em>Data Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Architecture</em>'.
	 * @generated
	 */
	DataArchitecture createDataArchitecture();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Computing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Unit</em>'.
	 * @generated
	 */
	ComputingUnit createComputingUnit();

	/**
	 * Returns a new object of class '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud</em>'.
	 * @generated
	 */
	Cloud createCloud();

	/**
	 * Returns a new object of class '<em>Fog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fog</em>'.
	 * @generated
	 */
	Fog createFog();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Load Balancer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Balancer</em>'.
	 * @generated
	 */
	LoadBalancer createLoadBalancer();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Network Protocols</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Protocols</em>'.
	 * @generated
	 */
	NetworkProtocols createNetworkProtocols();

	/**
	 * Returns a new object of class '<em>MQTT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MQTT</em>'.
	 * @generated
	 */
	MQTT createMQTT();

	/**
	 * Returns a new object of class '<em>TCP IP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCP IP</em>'.
	 * @generated
	 */
	TCP_IP createTCP_IP();

	/**
	 * Returns a new object of class '<em>Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection Type</em>'.
	 * @generated
	 */
	ConnectionType createConnectionType();

	/**
	 * Returns a new object of class '<em>Publisher Subscriber Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publisher Subscriber Connection</em>'.
	 * @generated
	 */
	PublisherSubscriberConnection createPublisherSubscriberConnection();

	/**
	 * Returns a new object of class '<em>Client Server Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Server Connection</em>'.
	 * @generated
	 */
	ClientServerConnection createClientServerConnection();

	/**
	 * Returns a new object of class '<em>Push Pull</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Pull</em>'.
	 * @generated
	 */
	PushPull createPushPull();

	/**
	 * Returns a new object of class '<em>Node Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Behavior</em>'.
	 * @generated
	 */
	NodeBehavior createNodeBehavior();

	/**
	 * Returns a new object of class '<em>In Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Data Port</em>'.
	 * @generated
	 */
	InDataPort createInDataPort();

	/**
	 * Returns a new object of class '<em>Out Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Data Port</em>'.
	 * @generated
	 */
	OutDataPort createOutDataPort();

	/**
	 * Returns a new object of class '<em>Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Port</em>'.
	 * @generated
	 */
	DataPort createDataPort();

	/**
	 * Returns a new object of class '<em>Request Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request Response</em>'.
	 * @generated
	 */
	RequestResponse createRequestResponse();

	/**
	 * Returns a new object of class '<em>HTTP HTTPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP HTTPS</em>'.
	 * @generated
	 */
	HTTP_HTTPS createHTTP_HTTPS();

	/**
	 * Returns a new object of class '<em>FTP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FTP</em>'.
	 * @generated
	 */
	FTP createFTP();

	/**
	 * Returns a new object of class '<em>Point To Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point To Point</em>'.
	 * @generated
	 */
	PointToPoint createPointToPoint();

	/**
	 * Returns a new object of class '<em>Stream Processing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Processing</em>'.
	 * @generated
	 */
	StreamProcessing createStreamProcessing();

	/**
	 * Returns a new object of class '<em>Asynchronous Request Reply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asynchronous Request Reply</em>'.
	 * @generated
	 */
	AsynchronousRequestReply createAsynchronousRequestReply();

	/**
	 * Returns a new object of class '<em>Web Socket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Socket</em>'.
	 * @generated
	 */
	WebSocket createWebSocket();

	/**
	 * Returns a new object of class '<em>Message Queueing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Queueing</em>'.
	 * @generated
	 */
	MessageQueueing createMessageQueueing();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OnePackage getOnePackage();

} //OneFactory
