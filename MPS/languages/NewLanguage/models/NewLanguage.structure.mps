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
    <node concept="1TJgyj" id="7Scz_dePkoy" role="1TKVEi">
      <property role="IQ2ns" value="9082791036955477538" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="behavior" />
      <ref role="20lvS9" node="7Scz_dePkor" resolve="NodeBehavior" />
    </node>
    <node concept="1TJgyj" id="7Scz_dePkoA" role="1TKVEi">
      <property role="IQ2ns" value="9082791036955477542" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="dataport" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="7Scz_dePkot" resolve="DataPort" />
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
  <node concept="1TIwiD" id="7Scz_dePkor">
    <property role="EcuMT" value="9082791036955477531" />
    <property role="TrG5h" value="NodeBehavior" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="3sSkxcULESV" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
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
</model>

