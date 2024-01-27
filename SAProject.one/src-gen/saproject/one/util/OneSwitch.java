/**
 */
package saproject.one.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import saproject.one.*;

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
 * @see saproject.one.OnePackage
 * @generated
 */
public class OneSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OnePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneSwitch() {
		if (modelPackage == null) {
			modelPackage = OnePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case OnePackage.LOCAL_STORAGE: {
			LocalStorage localStorage = (LocalStorage) theEObject;
			T result = caseLocalStorage(localStorage);
			if (result == null)
				result = caseStorageType(localStorage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.EMBEDDED_FLASH_MEMORY: {
			EmbeddedFlashMemory embeddedFlashMemory = (EmbeddedFlashMemory) theEObject;
			T result = caseEmbeddedFlashMemory(embeddedFlashMemory);
			if (result == null)
				result = caseLocalStorage(embeddedFlashMemory);
			if (result == null)
				result = caseStorageType(embeddedFlashMemory);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.SS_DS: {
			SSDs ssDs = (SSDs) theEObject;
			T result = caseSSDs(ssDs);
			if (result == null)
				result = caseLocalStorage(ssDs);
			if (result == null)
				result = caseStorageType(ssDs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.NV_ME: {
			NVMe nvMe = (NVMe) theEObject;
			T result = caseNVMe(nvMe);
			if (result == null)
				result = caseLocalStorage(nvMe);
			if (result == null)
				result = caseStorageType(nvMe);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.FILE_SYSTEMS: {
			FileSystems fileSystems = (FileSystems) theEObject;
			T result = caseFileSystems(fileSystems);
			if (result == null)
				result = caseStorageType(fileSystems);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.IPFS: {
			IPFS ipfs = (IPFS) theEObject;
			T result = caseIPFS(ipfs);
			if (result == null)
				result = caseFileSystems(ipfs);
			if (result == null)
				result = caseStorageType(ipfs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.NO_SQL: {
			NoSQL noSQL = (NoSQL) theEObject;
			T result = caseNoSQL(noSQL);
			if (result == null)
				result = caseStorageType(noSQL);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.NEW_SQL: {
			NewSQL newSQL = (NewSQL) theEObject;
			T result = caseNewSQL(newSQL);
			if (result == null)
				result = caseStorageType(newSQL);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.DOCUMENT: {
			Document document = (Document) theEObject;
			T result = caseDocument(document);
			if (result == null)
				result = caseNoSQL(document);
			if (result == null)
				result = caseStorageType(document);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.COLUMN: {
			Column column = (Column) theEObject;
			T result = caseColumn(column);
			if (result == null)
				result = caseNoSQL(column);
			if (result == null)
				result = caseStorageType(column);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.KEY_VALUE: {
			KeyValue keyValue = (KeyValue) theEObject;
			T result = caseKeyValue(keyValue);
			if (result == null)
				result = caseNoSQL(keyValue);
			if (result == null)
				result = caseStorageType(keyValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.GRAPH: {
			Graph graph = (Graph) theEObject;
			T result = caseGraph(graph);
			if (result == null)
				result = caseNoSQL(graph);
			if (result == null)
				result = caseStorageType(graph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.HISTORICAL: {
			Historical historical = (Historical) theEObject;
			T result = caseHistorical(historical);
			if (result == null)
				result = caseNewSQL(historical);
			if (result == null)
				result = caseStorageType(historical);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.REAL_TIME: {
			RealTime realTime = (RealTime) theEObject;
			T result = caseRealTime(realTime);
			if (result == null)
				result = caseNewSQL(realTime);
			if (result == null)
				result = caseStorageType(realTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.STREAM: {
			Stream stream = (Stream) theEObject;
			T result = caseStream(stream);
			if (result == null)
				result = caseNewSQL(stream);
			if (result == null)
				result = caseStorageType(stream);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.TIME_STAMP: {
			TimeStamp timeStamp = (TimeStamp) theEObject;
			T result = caseTimeStamp(timeStamp);
			if (result == null)
				result = caseNewSQL(timeStamp);
			if (result == null)
				result = caseStorageType(timeStamp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.DATA_LOCATION: {
			DataLocation dataLocation = (DataLocation) theEObject;
			T result = caseDataLocation(dataLocation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.PROCESSING_TYPE: {
			ProcessingType processingType = (ProcessingType) theEObject;
			T result = caseProcessingType(processingType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.BATCH: {
			Batch batch = (Batch) theEObject;
			T result = caseBatch(batch);
			if (result == null)
				result = caseProcessingType(batch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.REAL_TIME_PROCESSING: {
			RealTimeProcessing realTimeProcessing = (RealTimeProcessing) theEObject;
			T result = caseRealTimeProcessing(realTimeProcessing);
			if (result == null)
				result = caseProcessingType(realTimeProcessing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.STORAGE_TYPE: {
			StorageType storageType = (StorageType) theEObject;
			T result = caseStorageType(storageType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.DATA_ARCHITECTURE: {
			DataArchitecture dataArchitecture = (DataArchitecture) theEObject;
			T result = caseDataArchitecture(dataArchitecture);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.COMPUTING_UNIT: {
			ComputingUnit computingUnit = (ComputingUnit) theEObject;
			T result = caseComputingUnit(computingUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.CLOUD: {
			Cloud cloud = (Cloud) theEObject;
			T result = caseCloud(cloud);
			if (result == null)
				result = caseDataLocation(cloud);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.FOG: {
			Fog fog = (Fog) theEObject;
			T result = caseFog(fog);
			if (result == null)
				result = caseDataLocation(fog);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.EDGE: {
			Edge edge = (Edge) theEObject;
			T result = caseEdge(edge);
			if (result == null)
				result = caseDataLocation(edge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.LOAD_BALANCER: {
			LoadBalancer loadBalancer = (LoadBalancer) theEObject;
			T result = caseLoadBalancer(loadBalancer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.CONNECTION: {
			Connection connection = (Connection) theEObject;
			T result = caseConnection(connection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.NETWORK_PROTOCOLS: {
			NetworkProtocols networkProtocols = (NetworkProtocols) theEObject;
			T result = caseNetworkProtocols(networkProtocols);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.MQTT: {
			MQTT mqtt = (MQTT) theEObject;
			T result = caseMQTT(mqtt);
			if (result == null)
				result = caseNetworkProtocols(mqtt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.TCP_IP: {
			TCP_IP tcP_IP = (TCP_IP) theEObject;
			T result = caseTCP_IP(tcP_IP);
			if (result == null)
				result = caseNetworkProtocols(tcP_IP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.CONNECTION_TYPE: {
			ConnectionType connectionType = (ConnectionType) theEObject;
			T result = caseConnectionType(connectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.PUBLISHER_SUBSCRIBER_CONNECTION: {
			PublisherSubscriberConnection publisherSubscriberConnection = (PublisherSubscriberConnection) theEObject;
			T result = casePublisherSubscriberConnection(publisherSubscriberConnection);
			if (result == null)
				result = caseConnectionType(publisherSubscriberConnection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.CLIENT_SERVER_CONNECTION: {
			ClientServerConnection clientServerConnection = (ClientServerConnection) theEObject;
			T result = caseClientServerConnection(clientServerConnection);
			if (result == null)
				result = caseConnectionType(clientServerConnection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.PUSH_PULL: {
			PushPull pushPull = (PushPull) theEObject;
			T result = casePushPull(pushPull);
			if (result == null)
				result = caseConnectionType(pushPull);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.NODE_BEHAVIOR: {
			NodeBehavior nodeBehavior = (NodeBehavior) theEObject;
			T result = caseNodeBehavior(nodeBehavior);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.IN_DATA_PORT: {
			InDataPort inDataPort = (InDataPort) theEObject;
			T result = caseInDataPort(inDataPort);
			if (result == null)
				result = caseDataPort(inDataPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.OUT_DATA_PORT: {
			OutDataPort outDataPort = (OutDataPort) theEObject;
			T result = caseOutDataPort(outDataPort);
			if (result == null)
				result = caseDataPort(outDataPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.DATA_PORT: {
			DataPort dataPort = (DataPort) theEObject;
			T result = caseDataPort(dataPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.REQUEST_RESPONSE: {
			RequestResponse requestResponse = (RequestResponse) theEObject;
			T result = caseRequestResponse(requestResponse);
			if (result == null)
				result = caseConnectionType(requestResponse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.HTTP_HTTPS: {
			HTTP_HTTPS httP_HTTPS = (HTTP_HTTPS) theEObject;
			T result = caseHTTP_HTTPS(httP_HTTPS);
			if (result == null)
				result = caseNetworkProtocols(httP_HTTPS);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.FTP: {
			FTP ftp = (FTP) theEObject;
			T result = caseFTP(ftp);
			if (result == null)
				result = caseNetworkProtocols(ftp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.POINT_TO_POINT: {
			PointToPoint pointToPoint = (PointToPoint) theEObject;
			T result = casePointToPoint(pointToPoint);
			if (result == null)
				result = caseConnectionType(pointToPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.STREAM_PROCESSING: {
			StreamProcessing streamProcessing = (StreamProcessing) theEObject;
			T result = caseStreamProcessing(streamProcessing);
			if (result == null)
				result = caseConnectionType(streamProcessing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.ASYNCHRONOUS_REQUEST_REPLY: {
			AsynchronousRequestReply asynchronousRequestReply = (AsynchronousRequestReply) theEObject;
			T result = caseAsynchronousRequestReply(asynchronousRequestReply);
			if (result == null)
				result = caseConnectionType(asynchronousRequestReply);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.WEB_SOCKET: {
			WebSocket webSocket = (WebSocket) theEObject;
			T result = caseWebSocket(webSocket);
			if (result == null)
				result = caseConnectionType(webSocket);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case OnePackage.MESSAGE_QUEUEING: {
			MessageQueueing messageQueueing = (MessageQueueing) theEObject;
			T result = caseMessageQueueing(messageQueueing);
			if (result == null)
				result = caseConnectionType(messageQueueing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalStorage(LocalStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedded Flash Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedded Flash Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbeddedFlashMemory(EmbeddedFlashMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SS Ds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SS Ds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSDs(SSDs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NV Me</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NV Me</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNVMe(NVMe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Systems</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Systems</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSystems(FileSystems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPFS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPFS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPFS(IPFS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoSQL(NoSQL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewSQL(NewSQL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValue(KeyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraph(Graph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistorical(Historical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealTime(RealTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStream(Stream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStamp(TimeStamp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataLocation(DataLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingType(ProcessingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Batch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Batch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatch(Batch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Time Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Time Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealTimeProcessing(RealTimeProcessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageType(StorageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataArchitecture(DataArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingUnit(ComputingUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloud(Cloud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFog(Fog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Balancer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Balancer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBalancer(LoadBalancer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Protocols</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Protocols</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkProtocols(NetworkProtocols object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MQTT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MQTT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMQTT(MQTT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCP IP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCP IP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCP_IP(TCP_IP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionType(ConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher Subscriber Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher Subscriber Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisherSubscriberConnection(PublisherSubscriberConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Server Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Server Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientServerConnection(ClientServerConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Pull</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Pull</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushPull(PushPull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeBehavior(NodeBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInDataPort(InDataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutDataPort(OutDataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPort(DataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestResponse(RequestResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP HTTPS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP HTTPS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTP_HTTPS(HTTP_HTTPS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FTP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FTP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFTP(FTP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point To Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point To Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointToPoint(PointToPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamProcessing(StreamProcessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asynchronous Request Reply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asynchronous Request Reply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsynchronousRequestReply(AsynchronousRequestReply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Socket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Socket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebSocket(WebSocket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Queueing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Queueing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageQueueing(MessageQueueing object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //OneSwitch
