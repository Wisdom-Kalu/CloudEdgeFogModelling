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
        <child id="9082791036955477542" name="dataport" index="KQsxP" />
        <child id="1039313755865558955" name="behavior" index="2MTORL" />
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
      <concept id="1039313755865558906" name="NewLanguage.structure.DataLinkableElement" flags="ng" index="2MTOOw">
        <reference id="1039313755865558971" name="sourceLink" index="2MTORx" />
      </concept>
      <concept id="1039313755865558911" name="NewLanguage.structure.ReceiveData" flags="ng" index="2MTOO_">
        <reference id="1039313755865558973" name="dataRecipient" index="2MTORB" />
      </concept>
      <concept id="1039313755865558985" name="NewLanguage.structure.Transforme" flags="ng" index="2MTOQj" />
      <concept id="1039313755865558926" name="NewLanguage.structure.AnalysingData" flags="ng" index="2MTORk" />
      <concept id="1039313755865558914" name="NewLanguage.structure.Link" flags="ng" index="2MTORo">
        <reference id="1039313755865558978" name="target" index="2MTOQo" />
        <reference id="1039313755865558968" name="outgoingLink" index="2MTORy" />
      </concept>
      <concept id="1039313755865558915" name="NewLanguage.structure.DataGeneration" flags="ng" index="2MTORp" />
      <concept id="1039313755865558912" name="NewLanguage.structure.ComponentBehavior" flags="ng" index="2MTORq">
        <child id="1039313755865636313" name="datalinkable_element" index="2MS3Y3" />
        <child id="1039313755865607463" name="link" index="2MTSXX" />
      </concept>
      <concept id="1039313755865558916" name="NewLanguage.structure.Action" flags="ng" index="2MTORu">
        <reference id="1039313755865558981" name="incomingAction" index="2MTOQv" />
      </concept>
      <concept id="1039313755865558917" name="NewLanguage.structure.SendData" flags="ng" index="2MTORv">
        <reference id="1039313755865558976" name="dataRecipient" index="2MTOQq" />
      </concept>
      <concept id="1039313755865558945" name="NewLanguage.structure.StoringData" flags="ng" index="2MTORV" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="KQsxi" id="3sSkxcUM4Mi">
    <property role="TrG5h" value="SoilMostureIoTDataArchitecture" />
    <node concept="KQsxo" id="3sSkxcUM4ND" role="KXddR">
      <property role="TrG5h" value="Soil_Mosture_Sensor" />
      <ref role="KYIEg" node="3sSkxcUM4MJ" resolve="DeviceToEdge" />
      <node concept="KQsI9" id="3sSkxcUM4NE" role="KQsx4">
        <property role="TrG5h" value="SoilMostureSensor" />
        <node concept="KQsH_" id="3sSkxcUMaeL" role="dZGnz" />
        <node concept="KQsIz" id="3sSkxcUMaeN" role="KYMJe">
          <property role="TrG5h" value="RealTimeProcessing" />
        </node>
        <node concept="KQswp" id="3sSkxcUMaiv" role="KYMJ6">
          <property role="TrG5h" value="LocalWeatherStation_EdgeLocation" />
        </node>
      </node>
      <node concept="KQswD" id="3sSkxcUM4Oz" role="KQsxP">
        <property role="TrG5h" value="SensorOutPort" />
      </node>
      <node concept="2MTORq" id="TGo_EWzTu5" role="2MTORL">
        <property role="TrG5h" value="SensorBehavior" />
        <node concept="2MTORo" id="TGo_EWzTu6" role="2MTSXX">
          <property role="TrG5h" value="SensorGenerationLink" />
          <ref role="2MTOQo" node="TGo_EWzTub" resolve="CollectSoilData" />
          <ref role="2MTORy" node="TGo_EWzTuh" resolve="SendToEdge" />
        </node>
        <node concept="2MTORp" id="TGo_EWzTub" role="2MS3Y3">
          <property role="TrG5h" value="CollectSoilData" />
          <ref role="2MTORx" node="TGo_EWzTu6" resolve="SensorGenerationLink" />
          <ref role="2MTOQv" node="TGo_EWzTu6" resolve="SensorGenerationLink" />
        </node>
        <node concept="2MTORv" id="TGo_EWzTuh" role="2MS3Y3">
          <property role="TrG5h" value="SendToEdge" />
          <ref role="2MTORx" node="TGo_EWzTu6" resolve="SensorGenerationLink" />
          <ref role="2MTOQq" node="3sSkxcUM4NE" resolve="SoilMostureSensor" />
          <ref role="2MTOQv" node="TGo_EWzVOA" resolve="EdgeSendingLink" />
        </node>
      </node>
    </node>
    <node concept="KQsxo" id="3sSkxcUMahZ" role="KXddR">
      <property role="TrG5h" value="local_Weather_Station" />
      <ref role="KYIF$" node="3sSkxcUM4MJ" resolve="SoilMostureSensor_To_LocalWeatherStation" />
      <ref role="KYIEg" node="3sSkxcUM4MC" resolve="EdgeToFog" />
      <node concept="KQsI9" id="3sSkxcUMai0" role="KQsx4">
        <property role="TrG5h" value="LocalWeatherEdgeComputingUnit" />
        <node concept="KQswp" id="3sSkxcUMaix" role="KYMJ6">
          <property role="TrG5h" value="LocalWeatherStationEdgeLocation" />
        </node>
        <node concept="KQsGS" id="3sSkxcUMaiz" role="dZGnz" />
        <node concept="KQsIX" id="3sSkxcUMai_" role="KYMJe">
          <property role="TrG5h" value="BatchProcessing" />
        </node>
        <node concept="KQswX" id="TGo_EWyLBS" role="dZuwF">
          <property role="TrG5h" value="LocalWeatherLoadBalancer" />
        </node>
      </node>
      <node concept="KQswF" id="3sSkxcUMaiD" role="KQsxP">
        <property role="TrG5h" value="LocalWeatherStationInPort" />
      </node>
      <node concept="KQswD" id="3sSkxcUMaiI" role="KQsxP">
        <property role="TrG5h" value="LocalWeatherStationOutPort" />
      </node>
      <node concept="2MTORq" id="TGo_EWzTul" role="2MTORL">
        <property role="TrG5h" value="EdgeBehavior" />
        <node concept="2MTOO_" id="TGo_EWzTuO" role="2MS3Y3">
          <property role="TrG5h" value="RecieveFromSensor" />
          <ref role="2MTORB" node="3sSkxcUMai0" resolve="LocalWeatherEdgeComputingUnit" />
          <ref role="2MTORx" node="TGo_EWzTum" resolve="EdgeProcessingLink" />
        </node>
        <node concept="2MTORo" id="TGo_EWzTum" role="2MTSXX">
          <property role="TrG5h" value="EdgeProcessingLink" />
          <ref role="2MTORy" node="TGo_EWzTuO" resolve="RecieveFromSensor" />
          <ref role="2MTOQo" node="TGo_EWzTux" resolve="EdgeDataProcessing" />
        </node>
        <node concept="2MTORo" id="TGo_EWzVOA" role="2MTSXX">
          <property role="TrG5h" value="EdgeSendingLink" />
          <ref role="2MTOQo" node="TGo_EWzTuD" resolve="SendToFog" />
          <ref role="2MTORy" node="TGo_EWzTux" resolve="EdgeDataProcessing" />
        </node>
        <node concept="2MTOQj" id="TGo_EWzTux" role="2MS3Y3">
          <property role="TrG5h" value="EdgeDataProcessing" />
          <ref role="2MTORx" node="TGo_EWzTum" resolve="EdgeProcessingLink" />
          <ref role="2MTOQv" node="TGo_EWzVOA" resolve="EdgeSendingLink" />
        </node>
        <node concept="2MTORv" id="TGo_EWzTuD" role="2MS3Y3">
          <property role="TrG5h" value="SendToFog" />
          <ref role="2MTORx" node="TGo_EWzTum" resolve="EdgeProcessingLink" />
          <ref role="2MTOQq" node="3sSkxcUMai0" resolve="LocalWeatherEdgeComputingUnit" />
          <ref role="2MTOQv" node="TGo_EWzVOA" resolve="EdgeSendingLink" />
        </node>
      </node>
    </node>
    <node concept="KQsxo" id="3sSkxcUM4Nl" role="KXddR">
      <property role="TrG5h" value="Agricultural_Management_Processing_Unit" />
      <ref role="KYIF$" node="3sSkxcUM4MC" resolve="LocalWeatherStation_To_AgricMgtProcessingunit" />
      <ref role="KYIEg" node="3sSkxcUMaj8" resolve="AgricMgtProcessingUnit_To_AWSCloud" />
      <node concept="KQsI9" id="3sSkxcUM4Nm" role="KQsx4">
        <property role="TrG5h" value="Agricultural_Mgt_Fog_Unit" />
        <node concept="KQswm" id="3sSkxcUMafr" role="KYMJ6">
          <property role="TrG5h" value="AgricMgtProcessingUnit_FogLocation" />
        </node>
        <node concept="KQsIu" id="3sSkxcUMaiM" role="dZGnz" />
        <node concept="KQsIz" id="3sSkxcUMaiO" role="KYMJe">
          <property role="TrG5h" value="RealTimeProcessing" />
        </node>
      </node>
      <node concept="KQswF" id="3sSkxcUMaeU" role="KQsxP">
        <property role="TrG5h" value="Agric_Mgt_Processing_Unit_InPot" />
      </node>
      <node concept="KQswD" id="3sSkxcUMaeZ" role="KQsxP">
        <property role="TrG5h" value="Agric_Mgt_Processing_OutPot" />
      </node>
      <node concept="2MTORq" id="TGo_EWzVOU" role="2MTORL">
        <property role="TrG5h" value="FogBehavior" />
        <node concept="2MTORo" id="TGo_EWzVOV" role="2MTSXX">
          <property role="TrG5h" value="FogProcessingLink" />
          <ref role="2MTOQo" node="TGo_EWzVP6" resolve="AnalyseSoilData" />
          <ref role="2MTORy" node="TGo_EWzVP0" resolve="RecieveFromEdge" />
        </node>
        <node concept="2MTORo" id="TGo_EWzVPj" role="2MTSXX">
          <property role="TrG5h" value="FogSendingLink" />
          <ref role="2MTORy" node="TGo_EWzVPe" resolve="SendToCloud" />
          <ref role="2MTOQo" node="TGo_EWzVP6" resolve="AnalyseSoilData" />
        </node>
        <node concept="2MTOO_" id="TGo_EWzVP0" role="2MS3Y3">
          <property role="TrG5h" value="RecieveFromEdge" />
          <ref role="2MTORx" node="TGo_EWzTum" resolve="EdgeProcessingLink" />
          <ref role="2MTORB" node="3sSkxcUM4Nm" resolve="Agricultural_Mgt_Fog_Unit" />
        </node>
        <node concept="2MTORk" id="TGo_EWzVP6" role="2MS3Y3">
          <property role="TrG5h" value="AnalyseSoilData" />
          <ref role="2MTORx" node="TGo_EWzVOV" resolve="FogProcessingLink" />
        </node>
        <node concept="2MTORv" id="TGo_EWzVPe" role="2MS3Y3">
          <property role="TrG5h" value="SendToCloud" />
          <ref role="2MTOQq" node="3sSkxcUM4Nm" resolve="Agricultural_Mgt_Fog_Unit" />
          <ref role="2MTORx" node="TGo_EWzVPj" resolve="FogSendingLink" />
        </node>
      </node>
    </node>
    <node concept="KQsxo" id="3sSkxcUM4N5" role="KXddR">
      <property role="TrG5h" value="AWS_Central_Agricultural_Processing_Unit" />
      <ref role="KYIF$" node="3sSkxcUMaj8" resolve="AgricMgtProcessingUnit_To_AWSCloud" />
      <node concept="KQsI9" id="3sSkxcUM4N6" role="KQsx4">
        <property role="TrG5h" value="AWSCloudUnit" />
        <node concept="KQsxC" id="3sSkxcUMaeB" role="KYMJ6">
          <property role="TrG5h" value="AWSCloudLocation" />
        </node>
        <node concept="KQsJf" id="3sSkxcUMafV" role="dZGnz" />
        <node concept="KQsIX" id="3sSkxcUMaiS" role="KYMJe">
          <property role="TrG5h" value="Batch" />
        </node>
      </node>
      <node concept="KQswF" id="3sSkxcUMafF" role="KQsxP">
        <property role="TrG5h" value="AWSCloudInPort" />
      </node>
      <node concept="2MTORq" id="TGo_EWzVPm" role="2MTORL">
        <property role="TrG5h" value="CloudBehavior" />
        <node concept="2MTORo" id="TGo_EWzVPn" role="2MTSXX">
          <property role="TrG5h" value="CloudDataAnalysisLink" />
          <ref role="2MTOQo" node="TGo_EWzVPy" resolve="AnalyzeReceivedData" />
          <ref role="2MTORy" node="TGo_EWzVPe" resolve="SendToCloud" />
        </node>
        <node concept="2MTORo" id="TGo_EWzVPJ" role="2MTSXX">
          <property role="TrG5h" value="CloudDataStorageLink" />
          <ref role="2MTOQo" node="TGo_EWzVPE" resolve="StoreProcessedData" />
          <ref role="2MTORy" node="TGo_EWzVPy" resolve="AnalyzeReceivedData" />
        </node>
        <node concept="2MTOO_" id="TGo_EWzVPs" role="2MS3Y3">
          <property role="TrG5h" value="CloudDataReceiveLink" />
          <ref role="2MTORx" node="TGo_EWzVPn" resolve="CloudDataAnalysisLink" />
        </node>
        <node concept="2MTORk" id="TGo_EWzVPy" role="2MS3Y3">
          <property role="TrG5h" value="AnalyzeReceivedData" />
          <ref role="2MTORx" node="TGo_EWzVPn" resolve="CloudDataAnalysisLink" />
        </node>
        <node concept="2MTORV" id="TGo_EWzVPE" role="2MS3Y3">
          <property role="TrG5h" value="StoreProcessedData" />
          <ref role="2MTORx" node="TGo_EWzVPJ" resolve="c" />
        </node>
      </node>
    </node>
    <node concept="KQsxc" id="3sSkxcUM4MJ" role="KXfD1">
      <property role="TrG5h" value="SoilMostureSensor_To_LocalWeatherStation" />
      <ref role="KYJ9k" node="3sSkxcUMaiD" />
      <ref role="KYxO0" node="3sSkxcUM4Oz" resolve="DeviceOutPort" />
      <ref role="KYJ9b" node="3sSkxcUM4ND" resolve="Soil_Mosture_Sensor" />
      <ref role="KYJ9L" node="3sSkxcUMahZ" resolve="EdgeProcessingUnit" />
      <node concept="KQs_8" id="3sSkxcUMaiU" role="KYYWU">
        <property role="TrG5h" value="MQTT" />
      </node>
      <node concept="KQs_U" id="3sSkxcUMaiW" role="KYYWz">
        <property role="TrG5h" value="Push-pull" />
      </node>
    </node>
    <node concept="KQsxc" id="3sSkxcUM4MC" role="KXfD1">
      <property role="TrG5h" value="LocalWeatherStation_To_AgricMgtProcessingunit" />
      <ref role="KYJ9k" node="3sSkxcUMaeU" />
      <ref role="KYxO0" node="3sSkxcUMaiI" resolve="LocalWeatherStationOutPort" />
      <ref role="KYJ9b" node="3sSkxcUMahZ" resolve="local_Weather_Station" />
      <ref role="KYJ9L" node="3sSkxcUM4Nl" resolve="FogProcessingUnit" />
      <node concept="KQs_b" id="3sSkxcUMaiY" role="KYYWU">
        <property role="TrG5h" value="tcp/ip" />
      </node>
      <node concept="KQs_P" id="3sSkxcUMaj0" role="KYYWz">
        <property role="TrG5h" value="client-server" />
      </node>
    </node>
    <node concept="KQsxc" id="3sSkxcUMaj8" role="KXfD1">
      <property role="TrG5h" value="AgricMgtProcessingUnit_To_AWSCloud" />
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

