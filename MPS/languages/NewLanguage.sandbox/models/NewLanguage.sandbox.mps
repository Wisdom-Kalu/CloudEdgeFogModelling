<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:f69e9a9c-4684-4258-bda8-039603b7b47d(NewLanguage.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="acb8b23f-2e49-4a72-8177-8145a5dc30fc" name="NewLanguage" version="0" />
  </languages>
  <imports />
  <registry>
    <language id="acb8b23f-2e49-4a72-8177-8145a5dc30fc" name="NewLanguage">
      <concept id="9082791036955477573" name="NewLanguage.structure.Fog" flags="ng" index="KQswm" />
      <concept id="9082791036955477578" name="NewLanguage.structure.Edge" flags="ng" index="KQswp" />
      <concept id="9082791036955477626" name="NewLanguage.structure.OutDataPort" flags="ng" index="KQswD" />
      <concept id="9082791036955477624" name="NewLanguage.structure.InDataPort" flags="ng" index="KQswF" />
      <concept id="9082791036955477614" name="NewLanguage.structure.LoadBalancer" flags="ng" index="KQswX" />
      <concept id="9082791036955477531" name="NewLanguage.structure.NodeBehavior" flags="ng" index="KQsx8" />
      <concept id="9082791036955477535" name="NewLanguage.structure.Connection" flags="ng" index="KQsxc">
        <reference id="9082791036957659987" name="source" index="KYxO0" />
        <reference id="9082791036957654040" name="from" index="KYJ9b" />
        <reference id="9082791036957654023" name="destination" index="KYJ9k" />
        <reference id="9082791036957654050" name="to" index="KYJ9L" />
        <child id="9082791036957712752" name="connectionType" index="KYYWz" />
        <child id="9082791036957712745" name="networkprotocols" index="KYYWU" />
      </concept>
      <concept id="9082791036955477505" name="NewLanguage.structure.DataArchitecture" flags="ng" index="KQsxi">
        <child id="9082791036957777188" name="component" index="KXddR" />
        <child id="9082791036957783058" name="links" index="KXfD1" />
      </concept>
      <concept id="9082791036955477515" name="NewLanguage.structure.Component" flags="ng" index="KQsxo">
        <reference id="9082791036957648067" name="outgoing" index="KYIEg" />
        <reference id="9082791036957648055" name="incoming" index="KYIF$" />
        <child id="9082791036955477527" name="computingunit" index="KQsx4" />
        <child id="9082791036955477538" name="behavior" index="KQsxL" />
        <child id="9082791036955477542" name="dataport" index="KQsxP" />
      </concept>
      <concept id="9082791036955477563" name="NewLanguage.structure.Cloud" flags="ng" index="KQsxC" />
      <concept id="9082791036955477787" name="NewLanguage.structure.MQTT" flags="ng" index="KQs_8" />
      <concept id="9082791036955477784" name="NewLanguage.structure.TCP_IP" flags="ng" index="KQs_b" />
      <concept id="9082791036955477808" name="NewLanguage.structure.HTTP_HTTPS" flags="ng" index="KQs_z" />
      <concept id="9082791036955477819" name="NewLanguage.structure.AsynchronousRequestReply" flags="ng" index="KQs_C" />
      <concept id="9082791036955477798" name="NewLanguage.structure.ClientServerConnection" flags="ng" index="KQs_P" />
      <concept id="9082791036955477801" name="NewLanguage.structure.PushPull" flags="ng" index="KQs_U" />
      <concept id="9082791036955477355" name="NewLanguage.structure.NVMe" flags="ng" index="KQsGS" />
      <concept id="9082791036955477302" name="NewLanguage.structure.EmbeddedFlashMemory" flags="ng" index="KQsH_" />
      <concept id="9082791036955477466" name="NewLanguage.structure.ComputingUnit" flags="ng" index="KQsI9">
        <child id="3979020513325726264" name="loadBalancer" index="dZuwF" />
        <child id="3979020513325783024" name="storagetype" index="dZGnz" />
        <child id="9082791036957730197" name="locationtype" index="KYMJ6" />
        <child id="9082791036957730205" name="processingType" index="KYMJe" />
      </concept>
      <concept id="9082791036955477453" name="NewLanguage.structure.KeyValue" flags="ng" index="KQsIu" />
      <concept id="9082791036955477488" name="NewLanguage.structure.RealTime" flags="ng" index="KQsIz" />
      <concept id="9082791036955477486" name="NewLanguage.structure.Batch" flags="ng" index="KQsIX" />
      <concept id="9082791036955477404" name="NewLanguage.structure.IPFS" flags="ng" index="KQsJf" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="KQsxi" id="3sSkxcUM4Mi">
    <property role="TrG5h" value="IoTDataArchitecture" />
    <node concept="KQsxo" id="3sSkxcUM4ND" role="KXddR">
      <property role="TrG5h" value="IoTDevice" />
      <ref role="KYIEg" node="3sSkxcUM4MJ" resolve="DeviceToEdge" />
      <node concept="KQsI9" id="3sSkxcUM4NE" role="KQsx4">
        <property role="TrG5h" value="IoTDeviceUnit" />
        <node concept="KQsH_" id="3sSkxcUMaeL" role="dZGnz" />
        <node concept="KQsIz" id="3sSkxcUMaeN" role="KYMJe">
          <property role="TrG5h" value="RealTimeProcessing" />
        </node>
        <node concept="KQswX" id="3sSkxcUMait" role="dZuwF">
          <property role="TrG5h" value="EdgeLoadBalancer" />
        </node>
        <node concept="KQswp" id="3sSkxcUMaiv" role="KYMJ6">
          <property role="TrG5h" value="EdgeLocation" />
        </node>
      </node>
      <node concept="KQswD" id="3sSkxcUM4Oz" role="KQsxP">
        <property role="TrG5h" value="DeviceOutPort" />
      </node>
      <node concept="KQsx8" id="3sSkxcUMaeP" role="KQsxL">
        <property role="TrG5h" value="ComputingUnitBehaviour" />
      </node>
    </node>
    <node concept="KQsxo" id="3sSkxcUMahZ" role="KXddR">
      <property role="TrG5h" value="EdgeProcessingUnit" />
      <ref role="KYIF$" node="3sSkxcUM4MJ" resolve="DeviceToEdge" />
      <ref role="KYIEg" node="3sSkxcUM4MC" resolve="EdgeToFog" />
      <node concept="KQsI9" id="3sSkxcUMai0" role="KQsx4">
        <property role="TrG5h" value="EdgeUnit" />
        <node concept="KQswp" id="3sSkxcUMaix" role="KYMJ6">
          <property role="TrG5h" value="EdgeLocation" />
        </node>
        <node concept="KQsGS" id="3sSkxcUMaiz" role="dZGnz" />
        <node concept="KQsIX" id="3sSkxcUMai_" role="KYMJe">
          <property role="TrG5h" value="BatchProcessing" />
        </node>
      </node>
      <node concept="KQsx8" id="3sSkxcUMaiB" role="KQsxL">
        <property role="TrG5h" value="behaviour" />
      </node>
      <node concept="KQswF" id="3sSkxcUMaiD" role="KQsxP">
        <property role="TrG5h" value="EdgeInPort" />
      </node>
      <node concept="KQswD" id="3sSkxcUMaiI" role="KQsxP">
        <property role="TrG5h" value="EdgeOutPort" />
      </node>
    </node>
    <node concept="KQsxo" id="3sSkxcUM4Nl" role="KXddR">
      <property role="TrG5h" value="FogProcessingUnit" />
      <ref role="KYIF$" node="3sSkxcUM4MC" resolve="EdgeToFog" />
      <ref role="KYIEg" node="3sSkxcUMaj8" resolve="FogToCloud" />
      <node concept="KQsI9" id="3sSkxcUM4Nm" role="KQsx4">
        <property role="TrG5h" value="FogUnit" />
        <node concept="KQswm" id="3sSkxcUMafr" role="KYMJ6">
          <property role="TrG5h" value="FogLocation" />
        </node>
        <node concept="KQsIu" id="3sSkxcUMaiM" role="dZGnz" />
        <node concept="KQsIz" id="3sSkxcUMaiO" role="KYMJe">
          <property role="TrG5h" value="RealTimeProcessing" />
        </node>
      </node>
      <node concept="KQswF" id="3sSkxcUMaeU" role="KQsxP">
        <property role="TrG5h" value="FogInPot" />
      </node>
      <node concept="KQswD" id="3sSkxcUMaeZ" role="KQsxP">
        <property role="TrG5h" value="FogOutPot" />
      </node>
      <node concept="KQsx8" id="3sSkxcUMafD" role="KQsxL">
        <property role="TrG5h" value="NodeBehaviout" />
      </node>
    </node>
    <node concept="KQsxo" id="3sSkxcUM4N5" role="KXddR">
      <property role="TrG5h" value="CloudProcessingUnit" />
      <ref role="KYIF$" node="3sSkxcUMaj8" resolve="FogToCloud" />
      <node concept="KQsI9" id="3sSkxcUM4N6" role="KQsx4">
        <property role="TrG5h" value="CloudUnit" />
        <node concept="KQsxC" id="3sSkxcUMaeB" role="KYMJ6">
          <property role="TrG5h" value="CloudLocation" />
        </node>
        <node concept="KQsJf" id="3sSkxcUMafV" role="dZGnz" />
        <node concept="KQsIX" id="3sSkxcUMaiS" role="KYMJe">
          <property role="TrG5h" value="Batch" />
        </node>
      </node>
      <node concept="KQswF" id="3sSkxcUMafF" role="KQsxP">
        <property role="TrG5h" value="CloudInPort" />
      </node>
      <node concept="KQsx8" id="3sSkxcUMagE" role="KQsxL">
        <property role="TrG5h" value="behavior" />
      </node>
    </node>
    <node concept="KQsxc" id="3sSkxcUM4MJ" role="KXfD1">
      <property role="TrG5h" value="DeviceToEdge" />
      <ref role="KYJ9k" node="3sSkxcUMaiD" />
      <ref role="KYxO0" node="3sSkxcUM4Oz" />
      <ref role="KYJ9b" node="3sSkxcUM4ND" resolve="IoTDevice" />
      <ref role="KYJ9L" node="3sSkxcUM4Nl" resolve="FogProcessingUnit" />
      <node concept="KQs_8" id="3sSkxcUMaiU" role="KYYWU">
        <property role="TrG5h" value="MQTT" />
      </node>
      <node concept="KQs_U" id="3sSkxcUMaiW" role="KYYWz">
        <property role="TrG5h" value="Push-pull" />
      </node>
    </node>
    <node concept="KQsxc" id="3sSkxcUM4MC" role="KXfD1">
      <property role="TrG5h" value="EdgeToFog" />
      <ref role="KYJ9k" node="3sSkxcUMaeU" />
      <ref role="KYxO0" node="3sSkxcUMaiI" />
      <ref role="KYJ9b" node="3sSkxcUMahZ" resolve="EdgeProcessingUnit" />
      <ref role="KYJ9L" node="3sSkxcUM4Nl" resolve="FogProcessingUnit" />
      <node concept="KQs_b" id="3sSkxcUMaiY" role="KYYWU">
        <property role="TrG5h" value="tcp/ip" />
      </node>
      <node concept="KQs_P" id="3sSkxcUMaj0" role="KYYWz">
        <property role="TrG5h" value="client-server" />
      </node>
    </node>
    <node concept="KQsxc" id="3sSkxcUMaj8" role="KXfD1">
      <property role="TrG5h" value="FogToCloud" />
      <ref role="KYJ9k" node="3sSkxcUMafF" resolve="CloudInPort" />
      <ref role="KYxO0" node="3sSkxcUMaeZ" />
      <ref role="KYJ9b" node="3sSkxcUM4Nl" resolve="FogProcessingUnit" />
      <ref role="KYJ9L" node="3sSkxcUM4N5" resolve="CloudProcessingUnit" />
      <node concept="KQs_z" id="3sSkxcUMbDh" role="KYYWU">
        <property role="TrG5h" value="https" />
      </node>
      <node concept="KQs_C" id="3sSkxcUMbDj" role="KYYWz">
        <property role="TrG5h" value="ascy" />
      </node>
    </node>
  </node>
</model>

