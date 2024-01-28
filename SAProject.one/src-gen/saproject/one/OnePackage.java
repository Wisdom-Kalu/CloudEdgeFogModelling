/**
 */
package saproject.one;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see saproject.one.OneFactory
 * @model kind="package"
 * @generated
 */
public interface OnePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "one";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/one";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "one";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OnePackage eINSTANCE = saproject.one.impl.OnePackageImpl.init();

	/**
	 * The meta object id for the '{@link saproject.one.impl.StorageTypeImpl <em>Storage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.StorageTypeImpl
	 * @see saproject.one.impl.OnePackageImpl#getStorageType()
	 * @generated
	 */
	int STORAGE_TYPE = 20;

	/**
	 * The number of structural features of the '<em>Storage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Storage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.LocalStorageImpl <em>Local Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.LocalStorageImpl
	 * @see saproject.one.impl.OnePackageImpl#getLocalStorage()
	 * @generated
	 */
	int LOCAL_STORAGE = 0;

	/**
	 * The number of structural features of the '<em>Local Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORAGE_FEATURE_COUNT = STORAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_STORAGE_OPERATION_COUNT = STORAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.EmbeddedFlashMemoryImpl <em>Embedded Flash Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.EmbeddedFlashMemoryImpl
	 * @see saproject.one.impl.OnePackageImpl#getEmbeddedFlashMemory()
	 * @generated
	 */
	int EMBEDDED_FLASH_MEMORY = 1;

	/**
	 * The number of structural features of the '<em>Embedded Flash Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FLASH_MEMORY_FEATURE_COUNT = LOCAL_STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Embedded Flash Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_FLASH_MEMORY_OPERATION_COUNT = LOCAL_STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.SSDsImpl <em>SS Ds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.SSDsImpl
	 * @see saproject.one.impl.OnePackageImpl#getSSDs()
	 * @generated
	 */
	int SS_DS = 2;

	/**
	 * The number of structural features of the '<em>SS Ds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SS_DS_FEATURE_COUNT = LOCAL_STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SS Ds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SS_DS_OPERATION_COUNT = LOCAL_STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.NVMeImpl <em>NV Me</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.NVMeImpl
	 * @see saproject.one.impl.OnePackageImpl#getNVMe()
	 * @generated
	 */
	int NV_ME = 3;

	/**
	 * The number of structural features of the '<em>NV Me</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_ME_FEATURE_COUNT = LOCAL_STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NV Me</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NV_ME_OPERATION_COUNT = LOCAL_STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.FileSystemsImpl <em>File Systems</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.FileSystemsImpl
	 * @see saproject.one.impl.OnePackageImpl#getFileSystems()
	 * @generated
	 */
	int FILE_SYSTEMS = 4;

	/**
	 * The number of structural features of the '<em>File Systems</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEMS_FEATURE_COUNT = STORAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Systems</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEMS_OPERATION_COUNT = STORAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.IPFSImpl <em>IPFS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.IPFSImpl
	 * @see saproject.one.impl.OnePackageImpl#getIPFS()
	 * @generated
	 */
	int IPFS = 5;

	/**
	 * The number of structural features of the '<em>IPFS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPFS_FEATURE_COUNT = FILE_SYSTEMS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IPFS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPFS_OPERATION_COUNT = FILE_SYSTEMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.NoSQLImpl <em>No SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.NoSQLImpl
	 * @see saproject.one.impl.OnePackageImpl#getNoSQL()
	 * @generated
	 */
	int NO_SQL = 6;

	/**
	 * The number of structural features of the '<em>No SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_FEATURE_COUNT = STORAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SQL_OPERATION_COUNT = STORAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.NewSQLImpl <em>New SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.NewSQLImpl
	 * @see saproject.one.impl.OnePackageImpl#getNewSQL()
	 * @generated
	 */
	int NEW_SQL = 7;

	/**
	 * The number of structural features of the '<em>New SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SQL_FEATURE_COUNT = STORAGE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>New SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_SQL_OPERATION_COUNT = STORAGE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.DocumentImpl
	 * @see saproject.one.impl.OnePackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 8;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = NO_SQL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = NO_SQL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.ColumnImpl
	 * @see saproject.one.impl.OnePackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 9;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = NO_SQL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = NO_SQL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.KeyValueImpl <em>Key Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.KeyValueImpl
	 * @see saproject.one.impl.OnePackageImpl#getKeyValue()
	 * @generated
	 */
	int KEY_VALUE = 10;

	/**
	 * The number of structural features of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_FEATURE_COUNT = NO_SQL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Key Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_OPERATION_COUNT = NO_SQL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.GraphImpl
	 * @see saproject.one.impl.OnePackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 11;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = NO_SQL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = NO_SQL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.HistoricalImpl <em>Historical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.HistoricalImpl
	 * @see saproject.one.impl.OnePackageImpl#getHistorical()
	 * @generated
	 */
	int HISTORICAL = 12;

	/**
	 * The number of structural features of the '<em>Historical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_FEATURE_COUNT = NEW_SQL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Historical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORICAL_OPERATION_COUNT = NEW_SQL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.RealTimeImpl <em>Real Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.RealTimeImpl
	 * @see saproject.one.impl.OnePackageImpl#getRealTime()
	 * @generated
	 */
	int REAL_TIME = 13;

	/**
	 * The number of structural features of the '<em>Real Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_FEATURE_COUNT = NEW_SQL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_OPERATION_COUNT = NEW_SQL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.StreamImpl <em>Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.StreamImpl
	 * @see saproject.one.impl.OnePackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 14;

	/**
	 * The number of structural features of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_FEATURE_COUNT = NEW_SQL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_OPERATION_COUNT = NEW_SQL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.TimeStampImpl <em>Time Stamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.TimeStampImpl
	 * @see saproject.one.impl.OnePackageImpl#getTimeStamp()
	 * @generated
	 */
	int TIME_STAMP = 15;

	/**
	 * The number of structural features of the '<em>Time Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_FEATURE_COUNT = NEW_SQL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Stamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_OPERATION_COUNT = NEW_SQL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.DataLocationImpl <em>Data Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.DataLocationImpl
	 * @see saproject.one.impl.OnePackageImpl#getDataLocation()
	 * @generated
	 */
	int DATA_LOCATION = 16;

	/**
	 * The number of structural features of the '<em>Data Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LOCATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.ProcessingTypeImpl <em>Processing Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.ProcessingTypeImpl
	 * @see saproject.one.impl.OnePackageImpl#getProcessingType()
	 * @generated
	 */
	int PROCESSING_TYPE = 17;

	/**
	 * The number of structural features of the '<em>Processing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Processing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.BatchImpl <em>Batch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.BatchImpl
	 * @see saproject.one.impl.OnePackageImpl#getBatch()
	 * @generated
	 */
	int BATCH = 18;

	/**
	 * The number of structural features of the '<em>Batch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_FEATURE_COUNT = PROCESSING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Batch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_OPERATION_COUNT = PROCESSING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.RealTimeProcessingImpl <em>Real Time Processing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.RealTimeProcessingImpl
	 * @see saproject.one.impl.OnePackageImpl#getRealTimeProcessing()
	 * @generated
	 */
	int REAL_TIME_PROCESSING = 19;

	/**
	 * The number of structural features of the '<em>Real Time Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_PROCESSING_FEATURE_COUNT = PROCESSING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Time Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TIME_PROCESSING_OPERATION_COUNT = PROCESSING_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.DataArchitectureImpl <em>Data Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.DataArchitectureImpl
	 * @see saproject.one.impl.OnePackageImpl#getDataArchitecture()
	 * @generated
	 */
	int DATA_ARCHITECTURE = 21;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHITECTURE__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHITECTURE__LINKS = 1;

	/**
	 * The number of structural features of the '<em>Data Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHITECTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.ComponentImpl
	 * @see saproject.one.impl.OnePackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 22;

	/**
	 * The feature id for the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Computing Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPUTING_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Dataport</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DATAPORT = 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INCOMING = 4;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OUTGOING = 5;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.ComputingUnitImpl <em>Computing Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.ComputingUnitImpl
	 * @see saproject.one.impl.OnePackageImpl#getComputingUnit()
	 * @generated
	 */
	int COMPUTING_UNIT = 23;

	/**
	 * The feature id for the '<em><b>Balancer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_UNIT__BALANCER = 0;

	/**
	 * The feature id for the '<em><b>Locationtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_UNIT__LOCATIONTYPE = 1;

	/**
	 * The feature id for the '<em><b>Storagetype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_UNIT__STORAGETYPE = 2;

	/**
	 * The feature id for the '<em><b>Processingtype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_UNIT__PROCESSINGTYPE = 3;

	/**
	 * The number of structural features of the '<em>Computing Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_UNIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Computing Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.CloudImpl <em>Cloud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.CloudImpl
	 * @see saproject.one.impl.OnePackageImpl#getCloud()
	 * @generated
	 */
	int CLOUD = 24;

	/**
	 * The number of structural features of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_FEATURE_COUNT = DATA_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cloud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_OPERATION_COUNT = DATA_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.FogImpl <em>Fog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.FogImpl
	 * @see saproject.one.impl.OnePackageImpl#getFog()
	 * @generated
	 */
	int FOG = 25;

	/**
	 * The number of structural features of the '<em>Fog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_FEATURE_COUNT = DATA_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_OPERATION_COUNT = DATA_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.EdgeImpl
	 * @see saproject.one.impl.OnePackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 26;

	/**
	 * The feature id for the '<em><b>Balancer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__BALANCER = DATA_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = DATA_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = DATA_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.LoadBalancerImpl <em>Load Balancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.LoadBalancerImpl
	 * @see saproject.one.impl.OnePackageImpl#getLoadBalancer()
	 * @generated
	 */
	int LOAD_BALANCER = 27;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__EDGE = 0;

	/**
	 * The number of structural features of the '<em>Load Balancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Load Balancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.ConnectionImpl
	 * @see saproject.one.impl.OnePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DESTINATION = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FROM = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TO = 4;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Network Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NETWORK_PROTOCOL = 6;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.NetworkProtocolsImpl <em>Network Protocols</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.NetworkProtocolsImpl
	 * @see saproject.one.impl.OnePackageImpl#getNetworkProtocols()
	 * @generated
	 */
	int NETWORK_PROTOCOLS = 29;

	/**
	 * The number of structural features of the '<em>Network Protocols</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_PROTOCOLS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Network Protocols</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_PROTOCOLS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.MQTTImpl <em>MQTT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.MQTTImpl
	 * @see saproject.one.impl.OnePackageImpl#getMQTT()
	 * @generated
	 */
	int MQTT = 30;

	/**
	 * The number of structural features of the '<em>MQTT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_FEATURE_COUNT = NETWORK_PROTOCOLS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MQTT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_OPERATION_COUNT = NETWORK_PROTOCOLS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.TCP_IPImpl <em>TCP IP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.TCP_IPImpl
	 * @see saproject.one.impl.OnePackageImpl#getTCP_IP()
	 * @generated
	 */
	int TCP_IP = 31;

	/**
	 * The number of structural features of the '<em>TCP IP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_IP_FEATURE_COUNT = NETWORK_PROTOCOLS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TCP IP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_IP_OPERATION_COUNT = NETWORK_PROTOCOLS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.ConnectionTypeImpl
	 * @see saproject.one.impl.OnePackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 32;

	/**
	 * The number of structural features of the '<em>Connection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Connection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.PublisherSubscriberConnectionImpl <em>Publisher Subscriber Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.PublisherSubscriberConnectionImpl
	 * @see saproject.one.impl.OnePackageImpl#getPublisherSubscriberConnection()
	 * @generated
	 */
	int PUBLISHER_SUBSCRIBER_CONNECTION = 33;

	/**
	 * The number of structural features of the '<em>Publisher Subscriber Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_SUBSCRIBER_CONNECTION_FEATURE_COUNT = CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Publisher Subscriber Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_SUBSCRIBER_CONNECTION_OPERATION_COUNT = CONNECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.ClientServerConnectionImpl <em>Client Server Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.ClientServerConnectionImpl
	 * @see saproject.one.impl.OnePackageImpl#getClientServerConnection()
	 * @generated
	 */
	int CLIENT_SERVER_CONNECTION = 34;

	/**
	 * The number of structural features of the '<em>Client Server Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION_FEATURE_COUNT = CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client Server Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_CONNECTION_OPERATION_COUNT = CONNECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.PushPullImpl <em>Push Pull</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.PushPullImpl
	 * @see saproject.one.impl.OnePackageImpl#getPushPull()
	 * @generated
	 */
	int PUSH_PULL = 35;

	/**
	 * The number of structural features of the '<em>Push Pull</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_PULL_FEATURE_COUNT = CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Push Pull</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_PULL_OPERATION_COUNT = CONNECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.NodeBehaviorImpl <em>Node Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.NodeBehaviorImpl
	 * @see saproject.one.impl.OnePackageImpl#getNodeBehavior()
	 * @generated
	 */
	int NODE_BEHAVIOR = 36;

	/**
	 * The number of structural features of the '<em>Node Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_BEHAVIOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Node Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.DataPortImpl <em>Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.DataPortImpl
	 * @see saproject.one.impl.OnePackageImpl#getDataPort()
	 * @generated
	 */
	int DATA_PORT = 39;

	/**
	 * The number of structural features of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.InDataPortImpl <em>In Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.InDataPortImpl
	 * @see saproject.one.impl.OnePackageImpl#getInDataPort()
	 * @generated
	 */
	int IN_DATA_PORT = 37;

	/**
	 * The number of structural features of the '<em>In Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_DATA_PORT_FEATURE_COUNT = DATA_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_DATA_PORT_OPERATION_COUNT = DATA_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.OutDataPortImpl <em>Out Data Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.OutDataPortImpl
	 * @see saproject.one.impl.OnePackageImpl#getOutDataPort()
	 * @generated
	 */
	int OUT_DATA_PORT = 38;

	/**
	 * The number of structural features of the '<em>Out Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_DATA_PORT_FEATURE_COUNT = DATA_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Out Data Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_DATA_PORT_OPERATION_COUNT = DATA_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.RequestResponseImpl <em>Request Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.RequestResponseImpl
	 * @see saproject.one.impl.OnePackageImpl#getRequestResponse()
	 * @generated
	 */
	int REQUEST_RESPONSE = 40;

	/**
	 * The number of structural features of the '<em>Request Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_FEATURE_COUNT = CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Request Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_RESPONSE_OPERATION_COUNT = CONNECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.HTTP_HTTPSImpl <em>HTTP HTTPS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.HTTP_HTTPSImpl
	 * @see saproject.one.impl.OnePackageImpl#getHTTP_HTTPS()
	 * @generated
	 */
	int HTTP_HTTPS = 41;

	/**
	 * The number of structural features of the '<em>HTTP HTTPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HTTPS_FEATURE_COUNT = NETWORK_PROTOCOLS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HTTP HTTPS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HTTPS_OPERATION_COUNT = NETWORK_PROTOCOLS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.FTPImpl <em>FTP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.FTPImpl
	 * @see saproject.one.impl.OnePackageImpl#getFTP()
	 * @generated
	 */
	int FTP = 42;

	/**
	 * The number of structural features of the '<em>FTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_FEATURE_COUNT = NETWORK_PROTOCOLS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FTP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_OPERATION_COUNT = NETWORK_PROTOCOLS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.PointToPointImpl <em>Point To Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.PointToPointImpl
	 * @see saproject.one.impl.OnePackageImpl#getPointToPoint()
	 * @generated
	 */
	int POINT_TO_POINT = 43;

	/**
	 * The number of structural features of the '<em>Point To Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_FEATURE_COUNT = CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Point To Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TO_POINT_OPERATION_COUNT = CONNECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.StreamProcessingImpl <em>Stream Processing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.StreamProcessingImpl
	 * @see saproject.one.impl.OnePackageImpl#getStreamProcessing()
	 * @generated
	 */
	int STREAM_PROCESSING = 44;

	/**
	 * The number of structural features of the '<em>Stream Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_PROCESSING_FEATURE_COUNT = CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stream Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_PROCESSING_OPERATION_COUNT = CONNECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.AsynchronousRequestReplyImpl <em>Asynchronous Request Reply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.AsynchronousRequestReplyImpl
	 * @see saproject.one.impl.OnePackageImpl#getAsynchronousRequestReply()
	 * @generated
	 */
	int ASYNCHRONOUS_REQUEST_REPLY = 45;

	/**
	 * The number of structural features of the '<em>Asynchronous Request Reply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_REQUEST_REPLY_FEATURE_COUNT = CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Asynchronous Request Reply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNCHRONOUS_REQUEST_REPLY_OPERATION_COUNT = CONNECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.WebSocketImpl <em>Web Socket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.WebSocketImpl
	 * @see saproject.one.impl.OnePackageImpl#getWebSocket()
	 * @generated
	 */
	int WEB_SOCKET = 46;

	/**
	 * The number of structural features of the '<em>Web Socket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SOCKET_FEATURE_COUNT = CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Web Socket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SOCKET_OPERATION_COUNT = CONNECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link saproject.one.impl.MessageQueueingImpl <em>Message Queueing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see saproject.one.impl.MessageQueueingImpl
	 * @see saproject.one.impl.OnePackageImpl#getMessageQueueing()
	 * @generated
	 */
	int MESSAGE_QUEUEING = 47;

	/**
	 * The number of structural features of the '<em>Message Queueing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUEUEING_FEATURE_COUNT = CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Queueing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_QUEUEING_OPERATION_COUNT = CONNECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link saproject.one.LocalStorage <em>Local Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Storage</em>'.
	 * @see saproject.one.LocalStorage
	 * @generated
	 */
	EClass getLocalStorage();

	/**
	 * Returns the meta object for class '{@link saproject.one.EmbeddedFlashMemory <em>Embedded Flash Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Flash Memory</em>'.
	 * @see saproject.one.EmbeddedFlashMemory
	 * @generated
	 */
	EClass getEmbeddedFlashMemory();

	/**
	 * Returns the meta object for class '{@link saproject.one.SSDs <em>SS Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SS Ds</em>'.
	 * @see saproject.one.SSDs
	 * @generated
	 */
	EClass getSSDs();

	/**
	 * Returns the meta object for class '{@link saproject.one.NVMe <em>NV Me</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NV Me</em>'.
	 * @see saproject.one.NVMe
	 * @generated
	 */
	EClass getNVMe();

	/**
	 * Returns the meta object for class '{@link saproject.one.FileSystems <em>File Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Systems</em>'.
	 * @see saproject.one.FileSystems
	 * @generated
	 */
	EClass getFileSystems();

	/**
	 * Returns the meta object for class '{@link saproject.one.IPFS <em>IPFS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPFS</em>'.
	 * @see saproject.one.IPFS
	 * @generated
	 */
	EClass getIPFS();

	/**
	 * Returns the meta object for class '{@link saproject.one.NoSQL <em>No SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No SQL</em>'.
	 * @see saproject.one.NoSQL
	 * @generated
	 */
	EClass getNoSQL();

	/**
	 * Returns the meta object for class '{@link saproject.one.NewSQL <em>New SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New SQL</em>'.
	 * @see saproject.one.NewSQL
	 * @generated
	 */
	EClass getNewSQL();

	/**
	 * Returns the meta object for class '{@link saproject.one.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see saproject.one.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for class '{@link saproject.one.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see saproject.one.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for class '{@link saproject.one.KeyValue <em>Key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value</em>'.
	 * @see saproject.one.KeyValue
	 * @generated
	 */
	EClass getKeyValue();

	/**
	 * Returns the meta object for class '{@link saproject.one.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see saproject.one.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for class '{@link saproject.one.Historical <em>Historical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historical</em>'.
	 * @see saproject.one.Historical
	 * @generated
	 */
	EClass getHistorical();

	/**
	 * Returns the meta object for class '{@link saproject.one.RealTime <em>Real Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Time</em>'.
	 * @see saproject.one.RealTime
	 * @generated
	 */
	EClass getRealTime();

	/**
	 * Returns the meta object for class '{@link saproject.one.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream</em>'.
	 * @see saproject.one.Stream
	 * @generated
	 */
	EClass getStream();

	/**
	 * Returns the meta object for class '{@link saproject.one.TimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Stamp</em>'.
	 * @see saproject.one.TimeStamp
	 * @generated
	 */
	EClass getTimeStamp();

	/**
	 * Returns the meta object for class '{@link saproject.one.DataLocation <em>Data Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Location</em>'.
	 * @see saproject.one.DataLocation
	 * @generated
	 */
	EClass getDataLocation();

	/**
	 * Returns the meta object for class '{@link saproject.one.ProcessingType <em>Processing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Type</em>'.
	 * @see saproject.one.ProcessingType
	 * @generated
	 */
	EClass getProcessingType();

	/**
	 * Returns the meta object for class '{@link saproject.one.Batch <em>Batch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Batch</em>'.
	 * @see saproject.one.Batch
	 * @generated
	 */
	EClass getBatch();

	/**
	 * Returns the meta object for class '{@link saproject.one.RealTimeProcessing <em>Real Time Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Time Processing</em>'.
	 * @see saproject.one.RealTimeProcessing
	 * @generated
	 */
	EClass getRealTimeProcessing();

	/**
	 * Returns the meta object for class '{@link saproject.one.StorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Type</em>'.
	 * @see saproject.one.StorageType
	 * @generated
	 */
	EClass getStorageType();

	/**
	 * Returns the meta object for class '{@link saproject.one.DataArchitecture <em>Data Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Architecture</em>'.
	 * @see saproject.one.DataArchitecture
	 * @generated
	 */
	EClass getDataArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link saproject.one.DataArchitecture#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see saproject.one.DataArchitecture#getComponent()
	 * @see #getDataArchitecture()
	 * @generated
	 */
	EReference getDataArchitecture_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link saproject.one.DataArchitecture#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see saproject.one.DataArchitecture#getLinks()
	 * @see #getDataArchitecture()
	 * @generated
	 */
	EReference getDataArchitecture_Links();

	/**
	 * Returns the meta object for class '{@link saproject.one.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see saproject.one.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link saproject.one.Component#getComponentName <em>Component Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name</em>'.
	 * @see saproject.one.Component#getComponentName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentName();

	/**
	 * Returns the meta object for the containment reference list '{@link saproject.one.Component#getComputingUnit <em>Computing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computing Unit</em>'.
	 * @see saproject.one.Component#getComputingUnit()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ComputingUnit();

	/**
	 * Returns the meta object for the containment reference '{@link saproject.one.Component#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behavior</em>'.
	 * @see saproject.one.Component#getBehavior()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Behavior();

	/**
	 * Returns the meta object for the containment reference list '{@link saproject.one.Component#getDataport <em>Dataport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dataport</em>'.
	 * @see saproject.one.Component#getDataport()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Dataport();

	/**
	 * Returns the meta object for the reference list '{@link saproject.one.Component#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see saproject.one.Component#getIncoming()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link saproject.one.Component#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see saproject.one.Component#getOutgoing()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Outgoing();

	/**
	 * Returns the meta object for class '{@link saproject.one.ComputingUnit <em>Computing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Unit</em>'.
	 * @see saproject.one.ComputingUnit
	 * @generated
	 */
	EClass getComputingUnit();

	/**
	 * Returns the meta object for the reference '{@link saproject.one.ComputingUnit#getBalancer <em>Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Balancer</em>'.
	 * @see saproject.one.ComputingUnit#getBalancer()
	 * @see #getComputingUnit()
	 * @generated
	 */
	EReference getComputingUnit_Balancer();

	/**
	 * Returns the meta object for the containment reference '{@link saproject.one.ComputingUnit#getLocationtype <em>Locationtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locationtype</em>'.
	 * @see saproject.one.ComputingUnit#getLocationtype()
	 * @see #getComputingUnit()
	 * @generated
	 */
	EReference getComputingUnit_Locationtype();

	/**
	 * Returns the meta object for the containment reference list '{@link saproject.one.ComputingUnit#getStoragetype <em>Storagetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storagetype</em>'.
	 * @see saproject.one.ComputingUnit#getStoragetype()
	 * @see #getComputingUnit()
	 * @generated
	 */
	EReference getComputingUnit_Storagetype();

	/**
	 * Returns the meta object for the containment reference list '{@link saproject.one.ComputingUnit#getProcessingtype <em>Processingtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processingtype</em>'.
	 * @see saproject.one.ComputingUnit#getProcessingtype()
	 * @see #getComputingUnit()
	 * @generated
	 */
	EReference getComputingUnit_Processingtype();

	/**
	 * Returns the meta object for class '{@link saproject.one.Cloud <em>Cloud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud</em>'.
	 * @see saproject.one.Cloud
	 * @generated
	 */
	EClass getCloud();

	/**
	 * Returns the meta object for class '{@link saproject.one.Fog <em>Fog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog</em>'.
	 * @see saproject.one.Fog
	 * @generated
	 */
	EClass getFog();

	/**
	 * Returns the meta object for class '{@link saproject.one.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see saproject.one.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link saproject.one.Edge#getBalancer <em>Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Balancer</em>'.
	 * @see saproject.one.Edge#getBalancer()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Balancer();

	/**
	 * Returns the meta object for class '{@link saproject.one.LoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balancer</em>'.
	 * @see saproject.one.LoadBalancer
	 * @generated
	 */
	EClass getLoadBalancer();

	/**
	 * Returns the meta object for the reference '{@link saproject.one.LoadBalancer#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edge</em>'.
	 * @see saproject.one.LoadBalancer#getEdge()
	 * @see #getLoadBalancer()
	 * @generated
	 */
	EReference getLoadBalancer_Edge();

	/**
	 * Returns the meta object for class '{@link saproject.one.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see saproject.one.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link saproject.one.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see saproject.one.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the reference '{@link saproject.one.Connection#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see saproject.one.Connection#getDestination()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Destination();

	/**
	 * Returns the meta object for the reference '{@link saproject.one.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see saproject.one.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link saproject.one.Connection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see saproject.one.Connection#getFrom()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_From();

	/**
	 * Returns the meta object for the reference '{@link saproject.one.Connection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see saproject.one.Connection#getTo()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_To();

	/**
	 * Returns the meta object for the reference '{@link saproject.one.Connection#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection Type</em>'.
	 * @see saproject.one.Connection#getConnectionType()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_ConnectionType();

	/**
	 * Returns the meta object for the reference '{@link saproject.one.Connection#getNetworkProtocol <em>Network Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network Protocol</em>'.
	 * @see saproject.one.Connection#getNetworkProtocol()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_NetworkProtocol();

	/**
	 * Returns the meta object for class '{@link saproject.one.NetworkProtocols <em>Network Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Protocols</em>'.
	 * @see saproject.one.NetworkProtocols
	 * @generated
	 */
	EClass getNetworkProtocols();

	/**
	 * Returns the meta object for class '{@link saproject.one.MQTT <em>MQTT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MQTT</em>'.
	 * @see saproject.one.MQTT
	 * @generated
	 */
	EClass getMQTT();

	/**
	 * Returns the meta object for class '{@link saproject.one.TCP_IP <em>TCP IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCP IP</em>'.
	 * @see saproject.one.TCP_IP
	 * @generated
	 */
	EClass getTCP_IP();

	/**
	 * Returns the meta object for class '{@link saproject.one.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Type</em>'.
	 * @see saproject.one.ConnectionType
	 * @generated
	 */
	EClass getConnectionType();

	/**
	 * Returns the meta object for class '{@link saproject.one.PublisherSubscriberConnection <em>Publisher Subscriber Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher Subscriber Connection</em>'.
	 * @see saproject.one.PublisherSubscriberConnection
	 * @generated
	 */
	EClass getPublisherSubscriberConnection();

	/**
	 * Returns the meta object for class '{@link saproject.one.ClientServerConnection <em>Client Server Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Server Connection</em>'.
	 * @see saproject.one.ClientServerConnection
	 * @generated
	 */
	EClass getClientServerConnection();

	/**
	 * Returns the meta object for class '{@link saproject.one.PushPull <em>Push Pull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Pull</em>'.
	 * @see saproject.one.PushPull
	 * @generated
	 */
	EClass getPushPull();

	/**
	 * Returns the meta object for class '{@link saproject.one.NodeBehavior <em>Node Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Behavior</em>'.
	 * @see saproject.one.NodeBehavior
	 * @generated
	 */
	EClass getNodeBehavior();

	/**
	 * Returns the meta object for class '{@link saproject.one.InDataPort <em>In Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Data Port</em>'.
	 * @see saproject.one.InDataPort
	 * @generated
	 */
	EClass getInDataPort();

	/**
	 * Returns the meta object for class '{@link saproject.one.OutDataPort <em>Out Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Data Port</em>'.
	 * @see saproject.one.OutDataPort
	 * @generated
	 */
	EClass getOutDataPort();

	/**
	 * Returns the meta object for class '{@link saproject.one.DataPort <em>Data Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Port</em>'.
	 * @see saproject.one.DataPort
	 * @generated
	 */
	EClass getDataPort();

	/**
	 * Returns the meta object for class '{@link saproject.one.RequestResponse <em>Request Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Response</em>'.
	 * @see saproject.one.RequestResponse
	 * @generated
	 */
	EClass getRequestResponse();

	/**
	 * Returns the meta object for class '{@link saproject.one.HTTP_HTTPS <em>HTTP HTTPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP HTTPS</em>'.
	 * @see saproject.one.HTTP_HTTPS
	 * @generated
	 */
	EClass getHTTP_HTTPS();

	/**
	 * Returns the meta object for class '{@link saproject.one.FTP <em>FTP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FTP</em>'.
	 * @see saproject.one.FTP
	 * @generated
	 */
	EClass getFTP();

	/**
	 * Returns the meta object for class '{@link saproject.one.PointToPoint <em>Point To Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point To Point</em>'.
	 * @see saproject.one.PointToPoint
	 * @generated
	 */
	EClass getPointToPoint();

	/**
	 * Returns the meta object for class '{@link saproject.one.StreamProcessing <em>Stream Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Processing</em>'.
	 * @see saproject.one.StreamProcessing
	 * @generated
	 */
	EClass getStreamProcessing();

	/**
	 * Returns the meta object for class '{@link saproject.one.AsynchronousRequestReply <em>Asynchronous Request Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asynchronous Request Reply</em>'.
	 * @see saproject.one.AsynchronousRequestReply
	 * @generated
	 */
	EClass getAsynchronousRequestReply();

	/**
	 * Returns the meta object for class '{@link saproject.one.WebSocket <em>Web Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Socket</em>'.
	 * @see saproject.one.WebSocket
	 * @generated
	 */
	EClass getWebSocket();

	/**
	 * Returns the meta object for class '{@link saproject.one.MessageQueueing <em>Message Queueing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Queueing</em>'.
	 * @see saproject.one.MessageQueueing
	 * @generated
	 */
	EClass getMessageQueueing();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OneFactory getOneFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link saproject.one.impl.LocalStorageImpl <em>Local Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.LocalStorageImpl
		 * @see saproject.one.impl.OnePackageImpl#getLocalStorage()
		 * @generated
		 */
		EClass LOCAL_STORAGE = eINSTANCE.getLocalStorage();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.EmbeddedFlashMemoryImpl <em>Embedded Flash Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.EmbeddedFlashMemoryImpl
		 * @see saproject.one.impl.OnePackageImpl#getEmbeddedFlashMemory()
		 * @generated
		 */
		EClass EMBEDDED_FLASH_MEMORY = eINSTANCE.getEmbeddedFlashMemory();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.SSDsImpl <em>SS Ds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.SSDsImpl
		 * @see saproject.one.impl.OnePackageImpl#getSSDs()
		 * @generated
		 */
		EClass SS_DS = eINSTANCE.getSSDs();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.NVMeImpl <em>NV Me</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.NVMeImpl
		 * @see saproject.one.impl.OnePackageImpl#getNVMe()
		 * @generated
		 */
		EClass NV_ME = eINSTANCE.getNVMe();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.FileSystemsImpl <em>File Systems</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.FileSystemsImpl
		 * @see saproject.one.impl.OnePackageImpl#getFileSystems()
		 * @generated
		 */
		EClass FILE_SYSTEMS = eINSTANCE.getFileSystems();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.IPFSImpl <em>IPFS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.IPFSImpl
		 * @see saproject.one.impl.OnePackageImpl#getIPFS()
		 * @generated
		 */
		EClass IPFS = eINSTANCE.getIPFS();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.NoSQLImpl <em>No SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.NoSQLImpl
		 * @see saproject.one.impl.OnePackageImpl#getNoSQL()
		 * @generated
		 */
		EClass NO_SQL = eINSTANCE.getNoSQL();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.NewSQLImpl <em>New SQL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.NewSQLImpl
		 * @see saproject.one.impl.OnePackageImpl#getNewSQL()
		 * @generated
		 */
		EClass NEW_SQL = eINSTANCE.getNewSQL();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.DocumentImpl
		 * @see saproject.one.impl.OnePackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.ColumnImpl
		 * @see saproject.one.impl.OnePackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.KeyValueImpl <em>Key Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.KeyValueImpl
		 * @see saproject.one.impl.OnePackageImpl#getKeyValue()
		 * @generated
		 */
		EClass KEY_VALUE = eINSTANCE.getKeyValue();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.GraphImpl
		 * @see saproject.one.impl.OnePackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.HistoricalImpl <em>Historical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.HistoricalImpl
		 * @see saproject.one.impl.OnePackageImpl#getHistorical()
		 * @generated
		 */
		EClass HISTORICAL = eINSTANCE.getHistorical();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.RealTimeImpl <em>Real Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.RealTimeImpl
		 * @see saproject.one.impl.OnePackageImpl#getRealTime()
		 * @generated
		 */
		EClass REAL_TIME = eINSTANCE.getRealTime();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.StreamImpl <em>Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.StreamImpl
		 * @see saproject.one.impl.OnePackageImpl#getStream()
		 * @generated
		 */
		EClass STREAM = eINSTANCE.getStream();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.TimeStampImpl <em>Time Stamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.TimeStampImpl
		 * @see saproject.one.impl.OnePackageImpl#getTimeStamp()
		 * @generated
		 */
		EClass TIME_STAMP = eINSTANCE.getTimeStamp();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.DataLocationImpl <em>Data Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.DataLocationImpl
		 * @see saproject.one.impl.OnePackageImpl#getDataLocation()
		 * @generated
		 */
		EClass DATA_LOCATION = eINSTANCE.getDataLocation();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.ProcessingTypeImpl <em>Processing Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.ProcessingTypeImpl
		 * @see saproject.one.impl.OnePackageImpl#getProcessingType()
		 * @generated
		 */
		EClass PROCESSING_TYPE = eINSTANCE.getProcessingType();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.BatchImpl <em>Batch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.BatchImpl
		 * @see saproject.one.impl.OnePackageImpl#getBatch()
		 * @generated
		 */
		EClass BATCH = eINSTANCE.getBatch();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.RealTimeProcessingImpl <em>Real Time Processing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.RealTimeProcessingImpl
		 * @see saproject.one.impl.OnePackageImpl#getRealTimeProcessing()
		 * @generated
		 */
		EClass REAL_TIME_PROCESSING = eINSTANCE.getRealTimeProcessing();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.StorageTypeImpl <em>Storage Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.StorageTypeImpl
		 * @see saproject.one.impl.OnePackageImpl#getStorageType()
		 * @generated
		 */
		EClass STORAGE_TYPE = eINSTANCE.getStorageType();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.DataArchitectureImpl <em>Data Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.DataArchitectureImpl
		 * @see saproject.one.impl.OnePackageImpl#getDataArchitecture()
		 * @generated
		 */
		EClass DATA_ARCHITECTURE = eINSTANCE.getDataArchitecture();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ARCHITECTURE__COMPONENT = eINSTANCE.getDataArchitecture_Component();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ARCHITECTURE__LINKS = eINSTANCE.getDataArchitecture_Links();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.ComponentImpl
		 * @see saproject.one.impl.OnePackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Component Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_NAME = eINSTANCE.getComponent_ComponentName();

		/**
		 * The meta object literal for the '<em><b>Computing Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPUTING_UNIT = eINSTANCE.getComponent_ComputingUnit();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BEHAVIOR = eINSTANCE.getComponent_Behavior();

		/**
		 * The meta object literal for the '<em><b>Dataport</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__DATAPORT = eINSTANCE.getComponent_Dataport();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INCOMING = eINSTANCE.getComponent_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OUTGOING = eINSTANCE.getComponent_Outgoing();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.ComputingUnitImpl <em>Computing Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.ComputingUnitImpl
		 * @see saproject.one.impl.OnePackageImpl#getComputingUnit()
		 * @generated
		 */
		EClass COMPUTING_UNIT = eINSTANCE.getComputingUnit();

		/**
		 * The meta object literal for the '<em><b>Balancer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_UNIT__BALANCER = eINSTANCE.getComputingUnit_Balancer();

		/**
		 * The meta object literal for the '<em><b>Locationtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_UNIT__LOCATIONTYPE = eINSTANCE.getComputingUnit_Locationtype();

		/**
		 * The meta object literal for the '<em><b>Storagetype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_UNIT__STORAGETYPE = eINSTANCE.getComputingUnit_Storagetype();

		/**
		 * The meta object literal for the '<em><b>Processingtype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTING_UNIT__PROCESSINGTYPE = eINSTANCE.getComputingUnit_Processingtype();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.CloudImpl <em>Cloud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.CloudImpl
		 * @see saproject.one.impl.OnePackageImpl#getCloud()
		 * @generated
		 */
		EClass CLOUD = eINSTANCE.getCloud();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.FogImpl <em>Fog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.FogImpl
		 * @see saproject.one.impl.OnePackageImpl#getFog()
		 * @generated
		 */
		EClass FOG = eINSTANCE.getFog();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.EdgeImpl
		 * @see saproject.one.impl.OnePackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Balancer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__BALANCER = eINSTANCE.getEdge_Balancer();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.LoadBalancerImpl <em>Load Balancer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.LoadBalancerImpl
		 * @see saproject.one.impl.OnePackageImpl#getLoadBalancer()
		 * @generated
		 */
		EClass LOAD_BALANCER = eINSTANCE.getLoadBalancer();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCER__EDGE = eINSTANCE.getLoadBalancer_Edge();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.ConnectionImpl
		 * @see saproject.one.impl.OnePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__DESTINATION = eINSTANCE.getConnection_Destination();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FROM = eINSTANCE.getConnection_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TO = eINSTANCE.getConnection_To();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__CONNECTION_TYPE = eINSTANCE.getConnection_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Network Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__NETWORK_PROTOCOL = eINSTANCE.getConnection_NetworkProtocol();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.NetworkProtocolsImpl <em>Network Protocols</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.NetworkProtocolsImpl
		 * @see saproject.one.impl.OnePackageImpl#getNetworkProtocols()
		 * @generated
		 */
		EClass NETWORK_PROTOCOLS = eINSTANCE.getNetworkProtocols();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.MQTTImpl <em>MQTT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.MQTTImpl
		 * @see saproject.one.impl.OnePackageImpl#getMQTT()
		 * @generated
		 */
		EClass MQTT = eINSTANCE.getMQTT();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.TCP_IPImpl <em>TCP IP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.TCP_IPImpl
		 * @see saproject.one.impl.OnePackageImpl#getTCP_IP()
		 * @generated
		 */
		EClass TCP_IP = eINSTANCE.getTCP_IP();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.ConnectionTypeImpl <em>Connection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.ConnectionTypeImpl
		 * @see saproject.one.impl.OnePackageImpl#getConnectionType()
		 * @generated
		 */
		EClass CONNECTION_TYPE = eINSTANCE.getConnectionType();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.PublisherSubscriberConnectionImpl <em>Publisher Subscriber Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.PublisherSubscriberConnectionImpl
		 * @see saproject.one.impl.OnePackageImpl#getPublisherSubscriberConnection()
		 * @generated
		 */
		EClass PUBLISHER_SUBSCRIBER_CONNECTION = eINSTANCE.getPublisherSubscriberConnection();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.ClientServerConnectionImpl <em>Client Server Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.ClientServerConnectionImpl
		 * @see saproject.one.impl.OnePackageImpl#getClientServerConnection()
		 * @generated
		 */
		EClass CLIENT_SERVER_CONNECTION = eINSTANCE.getClientServerConnection();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.PushPullImpl <em>Push Pull</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.PushPullImpl
		 * @see saproject.one.impl.OnePackageImpl#getPushPull()
		 * @generated
		 */
		EClass PUSH_PULL = eINSTANCE.getPushPull();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.NodeBehaviorImpl <em>Node Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.NodeBehaviorImpl
		 * @see saproject.one.impl.OnePackageImpl#getNodeBehavior()
		 * @generated
		 */
		EClass NODE_BEHAVIOR = eINSTANCE.getNodeBehavior();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.InDataPortImpl <em>In Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.InDataPortImpl
		 * @see saproject.one.impl.OnePackageImpl#getInDataPort()
		 * @generated
		 */
		EClass IN_DATA_PORT = eINSTANCE.getInDataPort();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.OutDataPortImpl <em>Out Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.OutDataPortImpl
		 * @see saproject.one.impl.OnePackageImpl#getOutDataPort()
		 * @generated
		 */
		EClass OUT_DATA_PORT = eINSTANCE.getOutDataPort();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.DataPortImpl <em>Data Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.DataPortImpl
		 * @see saproject.one.impl.OnePackageImpl#getDataPort()
		 * @generated
		 */
		EClass DATA_PORT = eINSTANCE.getDataPort();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.RequestResponseImpl <em>Request Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.RequestResponseImpl
		 * @see saproject.one.impl.OnePackageImpl#getRequestResponse()
		 * @generated
		 */
		EClass REQUEST_RESPONSE = eINSTANCE.getRequestResponse();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.HTTP_HTTPSImpl <em>HTTP HTTPS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.HTTP_HTTPSImpl
		 * @see saproject.one.impl.OnePackageImpl#getHTTP_HTTPS()
		 * @generated
		 */
		EClass HTTP_HTTPS = eINSTANCE.getHTTP_HTTPS();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.FTPImpl <em>FTP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.FTPImpl
		 * @see saproject.one.impl.OnePackageImpl#getFTP()
		 * @generated
		 */
		EClass FTP = eINSTANCE.getFTP();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.PointToPointImpl <em>Point To Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.PointToPointImpl
		 * @see saproject.one.impl.OnePackageImpl#getPointToPoint()
		 * @generated
		 */
		EClass POINT_TO_POINT = eINSTANCE.getPointToPoint();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.StreamProcessingImpl <em>Stream Processing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.StreamProcessingImpl
		 * @see saproject.one.impl.OnePackageImpl#getStreamProcessing()
		 * @generated
		 */
		EClass STREAM_PROCESSING = eINSTANCE.getStreamProcessing();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.AsynchronousRequestReplyImpl <em>Asynchronous Request Reply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.AsynchronousRequestReplyImpl
		 * @see saproject.one.impl.OnePackageImpl#getAsynchronousRequestReply()
		 * @generated
		 */
		EClass ASYNCHRONOUS_REQUEST_REPLY = eINSTANCE.getAsynchronousRequestReply();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.WebSocketImpl <em>Web Socket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.WebSocketImpl
		 * @see saproject.one.impl.OnePackageImpl#getWebSocket()
		 * @generated
		 */
		EClass WEB_SOCKET = eINSTANCE.getWebSocket();

		/**
		 * The meta object literal for the '{@link saproject.one.impl.MessageQueueingImpl <em>Message Queueing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see saproject.one.impl.MessageQueueingImpl
		 * @see saproject.one.impl.OnePackageImpl#getMessageQueueing()
		 * @generated
		 */
		EClass MESSAGE_QUEUEING = eINSTANCE.getMessageQueueing();

	}

} //OnePackage
