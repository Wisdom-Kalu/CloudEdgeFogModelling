package NewLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int AsynchronousRequestReply = 0;
  public static final int Batch = 1;
  public static final int ClientServerConnection = 2;
  public static final int Cloud = 3;
  public static final int Column = 4;
  public static final int Component = 5;
  public static final int ComputingUnit = 6;
  public static final int Connection = 7;
  public static final int ConnectionType = 8;
  public static final int DataArchitecture = 9;
  public static final int DataLocation = 10;
  public static final int DataPort = 11;
  public static final int Document = 12;
  public static final int Edge = 13;
  public static final int EmbeddedFlashMemory = 14;
  public static final int FTP = 15;
  public static final int FileSystems = 16;
  public static final int Fog = 17;
  public static final int Graph = 18;
  public static final int HTTP_HTTPS = 19;
  public static final int Historical = 20;
  public static final int IPFS = 21;
  public static final int InDataPort = 22;
  public static final int KeyValue = 23;
  public static final int LoadBalancer = 24;
  public static final int LocalStorage = 25;
  public static final int MQTT = 26;
  public static final int MessageQueueing = 27;
  public static final int NVMe = 28;
  public static final int NetworkProtocols = 29;
  public static final int NewSQL = 30;
  public static final int NoSQL = 31;
  public static final int NodeBehavior = 32;
  public static final int OutDataPort = 33;
  public static final int PointToPoint = 34;
  public static final int ProcessingType = 35;
  public static final int PublisherSubscriberConnection = 36;
  public static final int PushPull = 37;
  public static final int RealTime = 38;
  public static final int Real_Time = 39;
  public static final int RequestResponse = 40;
  public static final int SSDs = 41;
  public static final int StorageType = 42;
  public static final int Stream = 43;
  public static final int StreamProcessing = 44;
  public static final int TCP_IP = 45;
  public static final int TimeStamp = 46;
  public static final int WebSocket = 47;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xacb8b23f2e494a72L, 0x81778145a5dc30fcL);
    builder.put(0x7e0c8e534ed5473bL, AsynchronousRequestReply);
    builder.put(0x7e0c8e534ed545eeL, Batch);
    builder.put(0x7e0c8e534ed54726L, ClientServerConnection);
    builder.put(0x7e0c8e534ed5463bL, Cloud);
    builder.put(0x7e0c8e534ed545cbL, Column);
    builder.put(0x7e0c8e534ed5460bL, Component);
    builder.put(0x7e0c8e534ed545daL, ComputingUnit);
    builder.put(0x7e0c8e534ed5461fL, Connection);
    builder.put(0x7e0c8e534ed5471eL, ConnectionType);
    builder.put(0x7e0c8e534ed54601L, DataArchitecture);
    builder.put(0x7e0c8e534ed545e9L, DataLocation);
    builder.put(0x7e0c8e534ed5461dL, DataPort);
    builder.put(0x7e0c8e534ed545b2L, Document);
    builder.put(0x7e0c8e534ed5464aL, Edge);
    builder.put(0x7e0c8e534ed54536L, EmbeddedFlashMemory);
    builder.put(0x7e0c8e534ed54733L, FTP);
    builder.put(0x7e0c8e534ed54572L, FileSystems);
    builder.put(0x7e0c8e534ed54645L, Fog);
    builder.put(0x7e0c8e534ed545cfL, Graph);
    builder.put(0x7e0c8e534ed54730L, HTTP_HTTPS);
    builder.put(0x7e0c8e534ed545d1L, Historical);
    builder.put(0x7e0c8e534ed5459cL, IPFS);
    builder.put(0x7e0c8e534ed54678L, InDataPort);
    builder.put(0x7e0c8e534ed545cdL, KeyValue);
    builder.put(0x7e0c8e534ed5466eL, LoadBalancer);
    builder.put(0x7e0c8e534ed54531L, LocalStorage);
    builder.put(0x7e0c8e534ed5471bL, MQTT);
    builder.put(0x7e0c8e534ed54741L, MessageQueueing);
    builder.put(0x7e0c8e534ed5456bL, NVMe);
    builder.put(0x7e0c8e534ed54713L, NetworkProtocols);
    builder.put(0x7e0c8e534ed54593L, NewSQL);
    builder.put(0x7e0c8e534ed5458bL, NoSQL);
    builder.put(0x7e0c8e534ed5461bL, NodeBehavior);
    builder.put(0x7e0c8e534ed5467aL, OutDataPort);
    builder.put(0x7e0c8e534ed54735L, PointToPoint);
    builder.put(0x7e0c8e534ed545ecL, ProcessingType);
    builder.put(0x7e0c8e534ed54723L, PublisherSubscriberConnection);
    builder.put(0x7e0c8e534ed54729L, PushPull);
    builder.put(0x7e0c8e534ed545f0L, RealTime);
    builder.put(0x7e0c8e534ed54746L, Real_Time);
    builder.put(0x7e0c8e534ed5472dL, RequestResponse);
    builder.put(0x7e0c8e534ed54553L, SSDs);
    builder.put(0x373852133ac681dbL, StorageType);
    builder.put(0x7e0c8e534ed545d6L, Stream);
    builder.put(0x7e0c8e534ed54738L, StreamProcessing);
    builder.put(0x7e0c8e534ed54718L, TCP_IP);
    builder.put(0x7e0c8e534ed545d8L, TimeStamp);
    builder.put(0x7e0c8e534ed5473eL, WebSocket);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
