package net.mehdi.activemqjms.consumers;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import lombok.AllArgsConstructor;
import net.mehdi.activemqjms.dtos.req_dtos.StrategyOneRequestDTO;
import net.mehdi.activemqjms.entities.req_entities.RecordRR;
import net.mehdi.activemqjms.entities.req_entities.StrategyOneRequest;
import net.mehdi.activemqjms.mappers.req_mappers.RecordRRMapper;
import net.mehdi.activemqjms.mappers.req_mappers.StrategyOneRequestMapper;
import net.mehdi.activemqjms.services.StrategyOneRequestService;
import net.mehdi.activemqjms.wsdlReq.Persist;
import net.mehdi.activemqjms.wsdlReq.PersistResponse;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.xml.sax.InputSource;

import java.io.StringReader;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class MessageConsumer {

    private StrategyOneRequestService strategyOneRequestService;
    //private StrategyOneRequestRepository strategyOneRequestRepository;
    @JmsListener(destination = "dataQueue")
    public PersistResponse.OutputData receiveMessage(Persist.Request request) {
        PersistResponse.OutputData outputData = new PersistResponse.OutputData();
        try {
           // System.out.println("***************************//////////////////////////////////////////////********************************************");

           // System.out.println("PresCore: " + request.getPresCore());
            String xmlContent = request.getScorInteg();
            System.out.println("ScorInteg: " + xmlContent);
            xmlContent = xmlContent.trim();


            // Decode the escaped XML content
            //String decodedXmlContent = unescapeXml(xmlContent);

            // Validate XML content before unmarshalling
            if (!isValidXML(xmlContent)) {
               throw new Exception("Invalid XML content");
            }
            JAXBContext context = JAXBContext.newInstance(StrategyOneRequestDTO.class);

            // Désérialiser le XML directement en BodyType
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StrategyOneRequestDTO strategyOneRequest = (StrategyOneRequestDTO) unmarshaller.unmarshal(new StringReader(xmlContent));

            displayXmlData(strategyOneRequest , xmlContent);
            System.out.println("**************************************************");
            System.out.println(strategyOneRequest);
            outputData.setCodeRetour("200");
            outputData.setMessageRetour("Success : Les données de la requête sont bien stockées");
        } catch (Exception e) {
            outputData.setCodeRetour("500");
            outputData.setMessageRetour("Error: " + e.getMessage());
            e.printStackTrace();
        }
        return outputData;
    }

    private void displayXmlData(StrategyOneRequestDTO strategyOneRequestDto , String xmlContent ) {
        //Save RecordNR
      //  RecordNR recordNR = RecordNRMapper.toEntity(strategyOneRequestDto.getBody().getRecordNR());
      //RecordNR recordNR1 = strategyOneRequestService.saveRecordNR(recordNR);
        //SaveRecordRR
//       List<RecordDTO> records = strategyOneRequestDto.getBody().getRecordRR().getRecord();
//       for (RecordDTO recordDTO : records) {
//            RecordRR recordRR=RecordRRMapper.toEntity(recordDTO);
//            strategyOneRequestService.saveRecordRR(recordRR);
//             }
        //Save StarategyOneRequest
       List<RecordRR> recordRRList= strategyOneRequestDto.getBody().getRecordRR().getRecord().stream()
               .map(RecordRRMapper::toEntity)
                .collect(Collectors.toList());
         StrategyOneRequest strategyOneRequest=StrategyOneRequestMapper.toEntity(strategyOneRequestDto,recordRRList);
         strategyOneRequest.setRequestXml(xmlContent);
       strategyOneRequestService.saveStrategyOneRequestService(strategyOneRequest);
            //StrategyOneRequest strategyOneRequest=strategyOneRequestRepository.findById(18L).orElseThrow(() -> new EntityNotFoundException("Request not found"));
        System.out.println("***************************************//////////////////////////////////////////////********************************************");

            System.out.println(strategyOneRequest);


        // StrategyOneRequest strategyOneRequest1= StrategyOneRequestMapper.toEntity(strategyOneRequestDto);
        //System.out.println("***************************//////////////////////////////////////////////********************************************");
        //System.out.println(strategyOneRequest1);

//        RecordNR entity = RecordNRMapper.toEntity(strategyOneRequest.getBody().getRecordNR());
//        System.out.println(entity.toString());
//        List<RecordDTO> records = strategyOneRequest.getBody().getRecordRR().getRecord();
//        System.out.println("***************************//////////////////////////////////////////////********************************************");
//
//        for (RecordDTO recordDTO : records) {
//            RecordRR recordRR=RecordRRMapper.toEntity(recordDTO);
//            System.out.println("***************************//////////////////////////////////////////////********************************************");
//
//            System.out.println(recordRR.toString());
//            System.out.println("***************************//////////////////////////////////////////////********************************************");

      //  }
        }

    private boolean isValidXML(String xmlContent) {
        try {
            // Try parsing the XML content
            javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new InputSource(new StringReader(xmlContent)));
            return true;
        } catch (Exception e) {
            // Invalid XML content
            return false;
        }
    }
    /* <![CDATA[ */
    /* ]]> */
    private String unescapeXml(String escapedXml) {
        return escapedXml.replace("&lt;", "<")
                .replace("&gt;", ">")
                .replace("&amp;", "&")
                .replace("&quot;", "\"")
                .replace("&apos;", "'");
    }
}

//package net.mehdi.activemqjms.consumers;
//
//import jakarta.xml.bind.JAXBContext;
//import jakarta.xml.bind.Unmarshaller;
//import lombok.AllArgsConstructor;
//import net.mehdi.activemqjms.dtos.req_dtos.StrategyOneRequestDTO;
//import net.mehdi.activemqjms.entities.req_entities.RecordRR;
//import net.mehdi.activemqjms.entities.req_entities.StrategyOneRequest;
//import net.mehdi.activemqjms.mappers.req_mappers.RecordRRMapper;
//import net.mehdi.activemqjms.mappers.req_mappers.StrategyOneRequestMapper;
//import net.mehdi.activemqjms.services.StrategyOneRequestService;
//import net.mehdi.activemqjms.wsdlReq.Persist;
//import net.mehdi.activemqjms.wsdlReq.PersistResponse;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.stereotype.Component;
//import org.xml.sax.InputSource;
//
//import java.io.StringReader;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@AllArgsConstructor
//@Component
//public class MessageConsumer {
//
//    private StrategyOneRequestService strategyOneRequestService;
//    //private StrategyOneRequestRepository strategyOneRequestRepository;
//    @JmsListener(destination = "dataQueue")
//    public PersistResponse.OutputData receiveMessage(Persist.Request request) {
//        PersistResponse.OutputData outputData = new PersistResponse.OutputData();
//        try {
//           // System.out.println("***************************//////////////////////////////////////////////********************************************");
//
//// System.out.println("PresCore: " + request.getPresCore());
//String xmlContent = request.getScorInteg();
////System.out.println("ScorInteg: " + xmlContent);
//xmlContent = xmlContent.trim();
//
//// Decode the escaped XML content
//String decodedXmlContent = unescapeXml(xmlContent);
//
//// Validate XML content before unmarshalling
//            if (!isValidXML(decodedXmlContent)) {
//        throw new Exception("Invalid XML content");
//            }
//JAXBContext context = JAXBContext.newInstance(StrategyOneRequestDTO.class);
//
//// Désérialiser le XML directement en BodyType
//Unmarshaller unmarshaller = context.createUnmarshaller();
//StrategyOneRequestDTO strategyOneRequest = (StrategyOneRequestDTO) unmarshaller.unmarshal(new StringReader(decodedXmlContent));
//
//displayXmlData(strategyOneRequest , xmlContent);
//            System.out.println("**************************************************");
//
//            outputData.setCodeRetour("200");
//            outputData.setMessageRetour("Success : Les données de la requête sont bien stockées");
//        } catch (Exception e) {
//        outputData.setCodeRetour("500");
//            outputData.setMessageRetour("Error: " + e.getMessage());
//        e.printStackTrace();
//        }
//                return outputData;
//    }
//
//private void displayXmlData(StrategyOneRequestDTO strategyOneRequestDto , String xmlContent ) {
//    //Save RecordNR
//    //  RecordNR recordNR = RecordNRMapper.toEntity(strategyOneRequestDto.getBody().getRecordNR());
//    //RecordNR recordNR1 = strategyOneRequestService.saveRecordNR(recordNR);
//    //SaveRecordRR
////       List<RecordDTO> records = strategyOneRequestDto.getBody().getRecordRR().getRecord();
////       for (RecordDTO recordDTO : records) {
////            RecordRR recordRR=RecordRRMapper.toEntity(recordDTO);
////            strategyOneRequestService.saveRecordRR(recordRR);
////             }
//    //Save StarategyOneRequest
//    List<RecordRR> recordRRList= strategyOneRequestDto.getBody().getRecordRR().getRecord().stream()
//            .map(RecordRRMapper::toEntity)
//            .collect(Collectors.toList());
//    StrategyOneRequest strategyOneRequest=StrategyOneRequestMapper.toEntity(strategyOneRequestDto,recordRRList);
//    strategyOneRequest.setRequestXml(xmlContent);
//    strategyOneRequestService.saveStrategyOneRequestService(strategyOneRequest);
//    //StrategyOneRequest strategyOneRequest=strategyOneRequestRepository.findById(18L).orElseThrow(() -> new EntityNotFoundException("Request not found"));
//
//    // System.out.println(strategyOneRequest);
//
//
//    // StrategyOneRequest strategyOneRequest1= StrategyOneRequestMapper.toEntity(strategyOneRequestDto);
//    //System.out.println("***************************//////////////////////////////////////////////********************************************");
//    //System.out.println(strategyOneRequest1);
//
////        RecordNR entity = RecordNRMapper.toEntity(strategyOneRequest.getBody().getRecordNR());
////        System.out.println(entity.toString());
////        List<RecordDTO> records = strategyOneRequest.getBody().getRecordRR().getRecord();
////        System.out.println("***************************//////////////////////////////////////////////********************************************");
////
////        for (RecordDTO recordDTO : records) {
////            RecordRR recordRR=RecordRRMapper.toEntity(recordDTO);
////            System.out.println("***************************//////////////////////////////////////////////********************************************");
////
////            System.out.println(recordRR.toString());
////            System.out.println("***************************//////////////////////////////////////////////********************************************");
//
//    //  }
//}
//
//private boolean isValidXML(String xmlContent) {
//    try {
//        // Try parsing the XML content
//        javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder()
//                .parse(new InputSource(new StringReader(xmlContent)));
//        return true;
//    } catch (Exception e) {
//        // Invalid XML content
//        return false;
//    }
//}
//
//private String unescapeXml(String escapedXml) {
//    return escapedXml.replace("&lt;", "<")
//            .replace("&gt;", ">")
//            .replace("&amp;", "&")
//            .replace("&quot;", "\"")
//            .replace("&apos;", "'");
//}
//}
//
//
