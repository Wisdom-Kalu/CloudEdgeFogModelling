<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:2c8fbfd9-9601-4f4f-be90-35da5783e4b6(NewLanguage.structure)">
  <persistence version="9" />
  <languages>
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="4628067390765956802" name="abstract" index="R5$K7" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="7Scz_dePksV">
    <property role="EcuMT" value="9082791036955477819" />
    <property role="TrG5h" value="AsynchronousRequestReply" />
    <ref role="1TJDcQ" node="7Scz_dePksu" resolve="ConnectionType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePknI">
    <property role="EcuMT" value="9082791036955477486" />
    <property role="TrG5h" value="Batch" />
    <ref role="1TJDcQ" node="7Scz_dePknG" resolve="ProcessingType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePksA">
    <property role="EcuMT" value="9082791036955477798" />
    <property role="TrG5h" value="ClientServerConnection" />
    <ref role="1TJDcQ" node="7Scz_dePksu" resolve="ConnectionType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkoV">
    <property role="EcuMT" value="9082791036955477563" />
    <property role="TrG5h" value="Cloud" />
    <ref role="1TJDcQ" node="7Scz_dePknD" resolve="DataLocation" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePknb">
    <property role="EcuMT" value="9082791036955477451" />
    <property role="TrG5h" value="Column" />
    <ref role="1TJDcQ" node="7Scz_dePkmb" resolve="NoSQL" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkob">
    <property role="EcuMT" value="9082791036955477515" />
    <property role="TrG5h" value="Component" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="7Scz_dePkon" role="1TKVEi">
      <property role="IQ2ns" value="9082791036955477527" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="computingunit" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="7Scz_dePknq" resolve="ComputingUnit" />
    </node>
    <node concept="1TJgyj" id="7Scz_dePkoA" role="1TKVEi">
      <property role="IQ2ns" value="9082791036955477542" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="dataport" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="7Scz_dePkot" resolve="DataPort" />
    </node>
    <node concept="1TJgyj" id="TGo_EWyMYF" role="1TKVEi">
      <property role="IQ2ns" value="1039313755865558955" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="behavior" />
      <ref role="20lvS9" node="TGo_EWyMY0" resolve="ComponentBehavior" />
    </node>
    <node concept="1TJgyj" id="7Scz_deXAiR" role="1TKVEi">
      <property role="IQ2ns" value="9082791036957648055" />
      <property role="20kJfa" value="incoming" />
      <ref role="20lvS9" node="7Scz_dePkov" resolve="Connection" />
    </node>
    <node concept="1TJgyj" id="7Scz_deXAj3" role="1TKVEi">
      <property role="IQ2ns" value="9082791036957648067" />
      <property role="20kJfa" value="outgoing" />
      <ref role="20lvS9" node="7Scz_dePkov" resolve="Connection" />
    </node>
    <node concept="PrWs8" id="3sSkxcULVlG" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="7Scz_dePknq">
    <property role="EcuMT" value="9082791036955477466" />
    <property role="TrG5h" value="ComputingUnit" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="3sSkxcULrCS" role="1TKVEi">
      <property role="IQ2ns" value="3979020513325726264" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="loadBalancer" />
      <ref role="20lvS9" node="7Scz_dePkpI" resolve="LoadBalancer" />
    </node>
    <node concept="1TJgyj" id="7Scz_deXUml" role="1TKVEi">
      <property role="IQ2ns" value="9082791036957730197" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="locationtype" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7Scz_dePknD" resolve="DataLocation" />
    </node>
    <node concept="1TJgyj" id="3sSkxcULDvK" role="1TKVEi">
      <property role="IQ2ns" value="3979020513325783024" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="storagetype" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="3sSkxcULC7r" resolve="StorageType" />
    </node>
    <node concept="1TJgyj" id="7Scz_deXUmt" role="1TKVEi">
      <property role="IQ2ns" value="9082791036957730205" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="processingType" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="7Scz_dePknG" resolve="ProcessingType" />
    </node>
    <node concept="PrWs8" id="3sSkxcULES5" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="7Scz_dePkov">
    <property role="EcuMT" value="9082791036955477535" />
    <property role="TrG5h" value="Connection" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="7Scz_deXBK7" role="1TKVEi">
      <property role="IQ2ns" value="9082791036957654023" />
      <property role="20kJfa" value="destination" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7Scz_dePkpS" resolve="InDataPort" />
    </node>
    <node concept="1TJgyj" id="7Scz_deXDdj" role="1TKVEi">
      <property role="IQ2ns" value="9082791036957659987" />
      <property role="20kJfa" value="source" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7Scz_dePkpU" resolve="OutDataPort" />
    </node>
    <node concept="1TJgyj" id="7Scz_deXBKo" role="1TKVEi">
      <property role="IQ2ns" value="9082791036957654040" />
      <property role="20kJfa" value="from" />
      <ref role="20lvS9" node="7Scz_dePkob" resolve="Component" />
    </node>
    <node concept="1TJgyj" id="7Scz_deXBKy" role="1TKVEi">
      <property role="IQ2ns" value="9082791036957654050" />
      <property role="20kJfa" value="to" />
      <ref role="20lvS9" node="7Scz_dePkob" resolve="Component" />
    </node>
    <node concept="1TJgyj" id="7Scz_deXQ5D" role="1TKVEi">
      <property role="IQ2ns" value="9082791036957712745" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="networkprotocols" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7Scz_dePksj" resolve="NetworkProtocols" />
    </node>
    <node concept="1TJgyj" id="7Scz_deXQ5K" role="1TKVEi">
      <property role="IQ2ns" value="9082791036957712752" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="connectionType" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="7Scz_dePksu" resolve="ConnectionType" />
    </node>
    <node concept="PrWs8" id="3sSkxcULES8" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="7Scz_dePksu">
    <property role="EcuMT" value="9082791036955477790" />
    <property role="TrG5h" value="ConnectionType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3sSkxcUM26n" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="7Scz_dePko1">
    <property role="EcuMT" value="9082791036955477505" />
    <property role="TrG5h" value="DataArchitecture" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="7Scz_deY5O$" role="1TKVEi">
      <property role="IQ2ns" value="9082791036957777188" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="component" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="7Scz_dePkob" resolve="Component" />
    </node>
    <node concept="1TJgyj" id="7Scz_deY7gi" role="1TKVEi">
      <property role="IQ2ns" value="9082791036957783058" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="links" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="7Scz_dePkov" resolve="Connection" />
    </node>
    <node concept="PrWs8" id="3sSkxcULESc" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="7Scz_dePknD">
    <property role="EcuMT" value="9082791036955477481" />
    <property role="TrG5h" value="DataLocation" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3sSkxcULESe" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="7Scz_dePkot">
    <property role="EcuMT" value="9082791036955477533" />
    <property role="TrG5h" value="DataPort" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkmM">
    <property role="EcuMT" value="9082791036955477426" />
    <property role="TrG5h" value="Document" />
    <ref role="1TJDcQ" node="7Scz_dePkmb" resolve="NoSQL" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkpa">
    <property role="EcuMT" value="9082791036955477578" />
    <property role="TrG5h" value="Edge" />
    <ref role="1TJDcQ" node="7Scz_dePknD" resolve="DataLocation" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkkQ">
    <property role="EcuMT" value="9082791036955477302" />
    <property role="TrG5h" value="EmbeddedFlashMemory" />
    <ref role="1TJDcQ" node="7Scz_dePkkL" resolve="LocalStorage" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePklM">
    <property role="EcuMT" value="9082791036955477362" />
    <property role="TrG5h" value="FileSystems" />
    <property role="R5$K7" value="true" />
    <ref role="1TJDcQ" node="3sSkxcULC7r" resolve="StorageType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkp5">
    <property role="EcuMT" value="9082791036955477573" />
    <property role="TrG5h" value="Fog" />
    <ref role="1TJDcQ" node="7Scz_dePknD" resolve="DataLocation" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePksN">
    <property role="EcuMT" value="9082791036955477811" />
    <property role="TrG5h" value="FTP" />
    <ref role="1TJDcQ" node="7Scz_dePksj" resolve="NetworkProtocols" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePknf">
    <property role="EcuMT" value="9082791036955477455" />
    <property role="TrG5h" value="Graph" />
    <ref role="1TJDcQ" node="7Scz_dePkmb" resolve="NoSQL" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePknh">
    <property role="EcuMT" value="9082791036955477457" />
    <property role="TrG5h" value="Historical" />
    <ref role="1TJDcQ" node="7Scz_dePkmj" resolve="NewSQL" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePksK">
    <property role="EcuMT" value="9082791036955477808" />
    <property role="TrG5h" value="HTTP_HTTPS" />
    <ref role="1TJDcQ" node="7Scz_dePksj" resolve="NetworkProtocols" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkpS">
    <property role="EcuMT" value="9082791036955477624" />
    <property role="TrG5h" value="InDataPort" />
    <ref role="1TJDcQ" node="7Scz_dePkot" resolve="DataPort" />
    <node concept="PrWs8" id="3sSkxcUMajk" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="7Scz_dePknd">
    <property role="EcuMT" value="9082791036955477453" />
    <property role="TrG5h" value="KeyValue" />
    <ref role="1TJDcQ" node="7Scz_dePkmb" resolve="NoSQL" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkpI">
    <property role="EcuMT" value="9082791036955477614" />
    <property role="TrG5h" value="LoadBalancer" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3sSkxcULESB" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="7Scz_dePkkL">
    <property role="EcuMT" value="9082791036955477297" />
    <property role="TrG5h" value="LocalStorage" />
    <property role="R5$K7" value="true" />
    <ref role="1TJDcQ" node="3sSkxcULC7r" resolve="StorageType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkt1">
    <property role="EcuMT" value="9082791036955477825" />
    <property role="TrG5h" value="MessageQueueing" />
    <ref role="1TJDcQ" node="7Scz_dePksu" resolve="ConnectionType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePksr">
    <property role="EcuMT" value="9082791036955477787" />
    <property role="TrG5h" value="MQTT" />
    <ref role="1TJDcQ" node="7Scz_dePksj" resolve="NetworkProtocols" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePksj">
    <property role="EcuMT" value="9082791036955477779" />
    <property role="TrG5h" value="NetworkProtocols" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3sSkxcULESQ" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="7Scz_dePkmj">
    <property role="EcuMT" value="9082791036955477395" />
    <property role="TrG5h" value="NewSQL" />
    <property role="R5$K7" value="true" />
    <ref role="1TJDcQ" node="3sSkxcULC7r" resolve="StorageType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkmb">
    <property role="EcuMT" value="9082791036955477387" />
    <property role="TrG5h" value="NoSQL" />
    <property role="R5$K7" value="true" />
    <ref role="1TJDcQ" node="3sSkxcULC7r" resolve="StorageType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePklF">
    <property role="EcuMT" value="9082791036955477355" />
    <property role="TrG5h" value="NVMe" />
    <ref role="1TJDcQ" node="7Scz_dePkkL" resolve="LocalStorage" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkpU">
    <property role="EcuMT" value="9082791036955477626" />
    <property role="TrG5h" value="OutDataPort" />
    <ref role="1TJDcQ" node="7Scz_dePkot" resolve="DataPort" />
    <node concept="PrWs8" id="3sSkxcUMajm" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="7Scz_dePksP">
    <property role="EcuMT" value="9082791036955477813" />
    <property role="TrG5h" value="PointToPoint" />
    <ref role="1TJDcQ" node="7Scz_dePksu" resolve="ConnectionType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePknG">
    <property role="EcuMT" value="9082791036955477484" />
    <property role="TrG5h" value="ProcessingType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3sSkxcULESJ" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="7Scz_dePksz">
    <property role="EcuMT" value="9082791036955477795" />
    <property role="TrG5h" value="PublisherSubscriberConnection" />
    <ref role="1TJDcQ" node="7Scz_dePksu" resolve="ConnectionType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePksD">
    <property role="EcuMT" value="9082791036955477801" />
    <property role="TrG5h" value="PushPull" />
    <ref role="1TJDcQ" node="7Scz_dePksu" resolve="ConnectionType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkt6">
    <property role="EcuMT" value="9082791036955477830" />
    <property role="TrG5h" value="Real_Time" />
    <ref role="1TJDcQ" node="7Scz_dePkmj" resolve="NewSQL" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePknK">
    <property role="EcuMT" value="9082791036955477488" />
    <property role="TrG5h" value="RealTime" />
    <ref role="1TJDcQ" node="7Scz_dePknG" resolve="ProcessingType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePksH">
    <property role="EcuMT" value="9082791036955477805" />
    <property role="TrG5h" value="RequestResponse" />
    <ref role="1TJDcQ" node="7Scz_dePksu" resolve="ConnectionType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePklj">
    <property role="EcuMT" value="9082791036955477331" />
    <property role="TrG5h" value="SSDs" />
    <ref role="1TJDcQ" node="7Scz_dePkkL" resolve="LocalStorage" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePknm">
    <property role="EcuMT" value="9082791036955477462" />
    <property role="TrG5h" value="Stream" />
    <ref role="1TJDcQ" node="7Scz_dePkmj" resolve="NewSQL" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePksS">
    <property role="EcuMT" value="9082791036955477816" />
    <property role="TrG5h" value="StreamProcessing" />
    <ref role="1TJDcQ" node="7Scz_dePksu" resolve="ConnectionType" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkso">
    <property role="EcuMT" value="9082791036955477784" />
    <property role="TrG5h" value="TCP_IP" />
    <ref role="1TJDcQ" node="7Scz_dePksj" resolve="NetworkProtocols" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkno">
    <property role="EcuMT" value="9082791036955477464" />
    <property role="TrG5h" value="TimeStamp" />
    <ref role="1TJDcQ" node="7Scz_dePkmj" resolve="NewSQL" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePksY">
    <property role="EcuMT" value="9082791036955477822" />
    <property role="TrG5h" value="WebSocket" />
    <ref role="1TJDcQ" node="7Scz_dePksu" resolve="ConnectionType" />
  </node>
  <node concept="1TIwiD" id="3sSkxcULC7r">
    <property role="EcuMT" value="3979020513325777371" />
    <property role="TrG5h" value="StorageType" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
  </node>
  <node concept="1TIwiD" id="7Scz_dePkms">
    <property role="EcuMT" value="9082791036955477404" />
    <property role="TrG5h" value="IPFS" />
    <ref role="1TJDcQ" node="7Scz_dePklM" resolve="FileSystems" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMXU">
    <property role="EcuMT" value="1039313755865558906" />
    <property role="TrG5h" value="DataLinkableElement" />
    <property role="R5$K7" value="true" />
    <node concept="1TJgyj" id="TGo_EWyMYV" role="1TKVEi">
      <property role="IQ2ns" value="1039313755865558971" />
      <property role="20kJfa" value="sourceLink" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="TGo_EWyMY2" resolve="Link" />
    </node>
  </node>
  <node concept="1TIwiD" id="TGo_EWyMXX">
    <property role="EcuMT" value="1039313755865558909" />
    <property role="TrG5h" value="Event" />
    <property role="R5$K7" value="true" />
    <ref role="1TJDcQ" node="TGo_EWyMXU" resolve="DataLinkableElement" />
    <node concept="PrWs8" id="TGo_EWza_y" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="TGo_EWyMXZ">
    <property role="EcuMT" value="1039313755865558911" />
    <property role="TrG5h" value="ReceiveData" />
    <ref role="1TJDcQ" node="TGo_EWyMXX" resolve="Event" />
    <node concept="1TJgyj" id="TGo_EWyMYX" role="1TKVEi">
      <property role="IQ2ns" value="1039313755865558973" />
      <property role="20kJfa" value="dataRecipient" />
      <ref role="20lvS9" node="7Scz_dePknq" resolve="ComputingUnit" />
    </node>
  </node>
  <node concept="1TIwiD" id="TGo_EWyMY0">
    <property role="EcuMT" value="1039313755865558912" />
    <property role="TrG5h" value="ComponentBehavior" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyj" id="TGo_EWyYOB" role="1TKVEi">
      <property role="IQ2ns" value="1039313755865607463" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="link" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="TGo_EWyMY2" resolve="Link" />
    </node>
    <node concept="1TJgyj" id="TGo_EWz5Rp" role="1TKVEi">
      <property role="IQ2ns" value="1039313755865636313" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="datalinkable_element" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="TGo_EWyMXU" resolve="DataLinkableElement" />
    </node>
    <node concept="PrWs8" id="TGo_EWzAKE" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="TGo_EWyMY2">
    <property role="EcuMT" value="1039313755865558914" />
    <property role="TrG5h" value="Link" />
    <node concept="1TJgyj" id="TGo_EWyMYS" role="1TKVEi">
      <property role="IQ2ns" value="1039313755865558968" />
      <property role="20kJfa" value="outgoingLink" />
      <ref role="20lvS9" node="TGo_EWyMXU" resolve="DataLinkableElement" />
    </node>
    <node concept="1TJgyj" id="TGo_EWyMZ2" role="1TKVEi">
      <property role="IQ2ns" value="1039313755865558978" />
      <property role="20kJfa" value="target" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="TGo_EWyMY4" resolve="Action" />
    </node>
    <node concept="PrWs8" id="TGo_EWzFrZ" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="TGo_EWyMY3">
    <property role="EcuMT" value="1039313755865558915" />
    <property role="TrG5h" value="DataGeneration" />
    <ref role="1TJDcQ" node="TGo_EWyMY4" resolve="Action" />
    <node concept="PrWs8" id="TGo_EWzD6d" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="TGo_EWyMY4">
    <property role="EcuMT" value="1039313755865558916" />
    <property role="TrG5h" value="Action" />
    <property role="R5$K7" value="true" />
    <ref role="1TJDcQ" node="TGo_EWyMXU" resolve="DataLinkableElement" />
    <node concept="1TJgyj" id="TGo_EWyMZ5" role="1TKVEi">
      <property role="IQ2ns" value="1039313755865558981" />
      <property role="20kJfa" value="incomingAction" />
      <ref role="20lvS9" node="TGo_EWyMY2" resolve="Link" />
    </node>
    <node concept="PrWs8" id="TGo_EWza_w" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="TGo_EWyMY5">
    <property role="EcuMT" value="1039313755865558917" />
    <property role="TrG5h" value="SendData" />
    <ref role="1TJDcQ" node="TGo_EWyMY4" resolve="Action" />
    <node concept="1TJgyj" id="TGo_EWyMZ0" role="1TKVEi">
      <property role="IQ2ns" value="1039313755865558976" />
      <property role="20kJfa" value="dataRecipient" />
      <ref role="20lvS9" node="7Scz_dePknq" resolve="ComputingUnit" />
    </node>
  </node>
  <node concept="1TIwiD" id="TGo_EWyMY6">
    <property role="EcuMT" value="1039313755865558918" />
    <property role="TrG5h" value="Technique" />
    <ref role="1TJDcQ" node="TGo_EWyMYe" resolve="AnalysingData" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMY7">
    <property role="EcuMT" value="1039313755865558919" />
    <property role="TrG5h" value="Quantitative" />
    <ref role="1TJDcQ" node="TGo_EWyMY6" resolve="Technique" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMY8">
    <property role="EcuMT" value="1039313755865558920" />
    <property role="TrG5h" value="Qualitative" />
    <ref role="1TJDcQ" node="TGo_EWyMY6" resolve="Technique" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMY9">
    <property role="EcuMT" value="1039313755865558921" />
    <property role="TrG5h" value="Statistical" />
    <ref role="1TJDcQ" node="TGo_EWyMY6" resolve="Technique" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYa">
    <property role="EcuMT" value="1039313755865558922" />
    <property role="TrG5h" value="Describe" />
    <ref role="1TJDcQ" node="TGo_EWyMYf" resolve="Type" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYb">
    <property role="EcuMT" value="1039313755865558923" />
    <property role="TrG5h" value="Diagnoze" />
    <ref role="1TJDcQ" node="TGo_EWyMYf" resolve="Type" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYc">
    <property role="EcuMT" value="1039313755865558924" />
    <property role="TrG5h" value="Predict" />
    <ref role="1TJDcQ" node="TGo_EWyMYf" resolve="Type" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYd">
    <property role="EcuMT" value="1039313755865558925" />
    <property role="TrG5h" value="Prescript" />
    <ref role="1TJDcQ" node="TGo_EWyMYf" resolve="Type" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYe">
    <property role="EcuMT" value="1039313755865558926" />
    <property role="TrG5h" value="AnalysingData" />
    <ref role="1TJDcQ" node="TGo_EWyMY4" resolve="Action" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYf">
    <property role="EcuMT" value="1039313755865558927" />
    <property role="TrG5h" value="Type" />
    <ref role="1TJDcQ" node="TGo_EWyMYe" resolve="AnalysingData" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYh">
    <property role="EcuMT" value="1039313755865558929" />
    <property role="TrG5h" value="DataIngestion" />
    <ref role="1TJDcQ" node="TGo_EWyMY4" resolve="Action" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYi">
    <property role="EcuMT" value="1039313755865558930" />
    <property role="TrG5h" value="Integrate" />
    <ref role="1TJDcQ" node="TGo_EWyMYh" resolve="DataIngestion" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYj">
    <property role="EcuMT" value="1039313755865558931" />
    <property role="TrG5h" value="Compress" />
    <ref role="1TJDcQ" node="TGo_EWyMYh" resolve="DataIngestion" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYk">
    <property role="EcuMT" value="1039313755865558932" />
    <property role="TrG5h" value="ReduceNoise" />
    <ref role="1TJDcQ" node="TGo_EWyMYh" resolve="DataIngestion" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYl">
    <property role="EcuMT" value="1039313755865558933" />
    <property role="TrG5h" value="Transform" />
    <ref role="1TJDcQ" node="TGo_EWyMYh" resolve="DataIngestion" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYm">
    <property role="EcuMT" value="1039313755865558934" />
    <property role="TrG5h" value="Validate" />
    <ref role="1TJDcQ" node="TGo_EWyMYh" resolve="DataIngestion" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYn">
    <property role="EcuMT" value="1039313755865558935" />
    <property role="TrG5h" value="Identify" />
    <ref role="1TJDcQ" node="TGo_EWyMYh" resolve="DataIngestion" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYo">
    <property role="EcuMT" value="1039313755865558936" />
    <property role="TrG5h" value="Merge" />
    <ref role="1TJDcQ" node="TGo_EWyMYs" resolve="DataProcessing" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYp">
    <property role="EcuMT" value="1039313755865558937" />
    <property role="TrG5h" value="Sort" />
    <ref role="1TJDcQ" node="TGo_EWyMYs" resolve="DataProcessing" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYq">
    <property role="EcuMT" value="1039313755865558938" />
    <property role="TrG5h" value="Filter" />
    <ref role="1TJDcQ" node="TGo_EWyMYs" resolve="DataProcessing" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYr">
    <property role="EcuMT" value="1039313755865558939" />
    <property role="TrG5h" value="Classify" />
    <ref role="1TJDcQ" node="TGo_EWyMYs" resolve="DataProcessing" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYs">
    <property role="EcuMT" value="1039313755865558940" />
    <property role="TrG5h" value="DataProcessing" />
    <ref role="1TJDcQ" node="TGo_EWyMY4" resolve="Action" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYt">
    <property role="EcuMT" value="1039313755865558941" />
    <property role="TrG5h" value="Math_Operation" />
    <ref role="1TJDcQ" node="TGo_EWyMYs" resolve="DataProcessing" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYu">
    <property role="EcuMT" value="1039313755865558942" />
    <property role="TrG5h" value="Cleaning" />
    <ref role="1TJDcQ" node="TGo_EWyMYs" resolve="DataProcessing" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYw">
    <property role="EcuMT" value="1039313755865558944" />
    <property role="TrG5h" value="Aggregate" />
    <ref role="1TJDcQ" node="TGo_EWyMYs" resolve="DataProcessing" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYx">
    <property role="EcuMT" value="1039313755865558945" />
    <property role="TrG5h" value="StoringData" />
    <ref role="1TJDcQ" node="TGo_EWyMY4" resolve="Action" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYy">
    <property role="EcuMT" value="1039313755865558946" />
    <property role="TrG5h" value="Govern" />
    <ref role="1TJDcQ" node="TGo_EWyMYx" resolve="StoringData" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYz">
    <property role="EcuMT" value="1039313755865558947" />
    <property role="TrG5h" value="Archive" />
    <ref role="1TJDcQ" node="TGo_EWyMYx" resolve="StoringData" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMY$">
    <property role="EcuMT" value="1039313755865558948" />
    <property role="TrG5h" value="Save" />
    <ref role="1TJDcQ" node="TGo_EWyMYx" resolve="StoringData" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMY_">
    <property role="EcuMT" value="1039313755865558949" />
    <property role="TrG5h" value="Retrieve" />
    <ref role="1TJDcQ" node="TGo_EWyMYx" resolve="StoringData" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYA">
    <property role="EcuMT" value="1039313755865558950" />
    <property role="TrG5h" value="ConsumingData" />
    <ref role="1TJDcQ" node="TGo_EWyMY4" resolve="Action" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYB">
    <property role="EcuMT" value="1039313755865558951" />
    <property role="TrG5h" value="QueryReport" />
    <ref role="1TJDcQ" node="TGo_EWyMYA" resolve="ConsumingData" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYC">
    <property role="EcuMT" value="1039313755865558952" />
    <property role="TrG5h" value="Visualize" />
    <ref role="1TJDcQ" node="TGo_EWyMYA" resolve="ConsumingData" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMYD">
    <property role="EcuMT" value="1039313755865558953" />
    <property role="TrG5h" value="API" />
    <ref role="1TJDcQ" node="TGo_EWyMYA" resolve="ConsumingData" />
  </node>
  <node concept="1TIwiD" id="TGo_EWyMZ9">
    <property role="EcuMT" value="1039313755865558985" />
    <property role="TrG5h" value="Transforme" />
    <ref role="1TJDcQ" node="TGo_EWyMYs" resolve="DataProcessing" />
  </node>
</model>

