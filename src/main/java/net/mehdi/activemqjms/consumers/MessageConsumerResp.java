package net.mehdi.activemqjms.consumers;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import lombok.AllArgsConstructor;

import net.mehdi.activemqjms.dtos.res_dtos.StrategyOneResponseDTO;
import net.mehdi.activemqjms.entities.res_entities.RecordRRRes;
import net.mehdi.activemqjms.entities.res_entities.StrategyOneResponse;
import net.mehdi.activemqjms.mappers.res_mappers.RecordRRRespMapper;
import net.mehdi.activemqjms.mappers.res_mappers.StrategyOneResponseMapper;
import net.mehdi.activemqjms.services.StrategyOneResponseService;
import net.mehdi.activemqjms.wsdlResp.Persist;
import net.mehdi.activemqjms.wsdlResp.PersistResponse;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.xml.sax.InputSource;

import java.io.StringReader;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class MessageConsumerResp {

    private StrategyOneResponseService strategyOneResponseService;
    @JmsListener(destination = "dataQueue2")
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
            JAXBContext context = JAXBContext.newInstance(StrategyOneResponseDTO.class);

            // Désérialiser le XML directement en BodyType
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StrategyOneResponseDTO strategyOneResponseDTO = (StrategyOneResponseDTO) unmarshaller.unmarshal(new StringReader(xmlContent));

            displayXmlData(strategyOneResponseDTO , xmlContent);
            System.out.println("**************************************************");

            outputData.setCodeRetour("200");
            outputData.setMessageRetour("Success : Les données de la requête sont bien stockées");
        } catch (Exception e) {
            outputData.setCodeRetour("500");
            outputData.setMessageRetour("Error: " + e.getMessage());
            e.printStackTrace();
        }
        return outputData;
    }

    private void displayXmlData(StrategyOneResponseDTO strategyOneResponseDto , String xmlContent ) {
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

        List<RecordRRRes> recordRRResList= strategyOneResponseDto.getBody().getRecordRR().getRecord().stream()
                .map(RecordRRRespMapper::toEntity)
                .collect(Collectors.toList());
        StrategyOneResponse strategyOneResponse= StrategyOneResponseMapper.toEntity(strategyOneResponseDto,recordRRResList);
        strategyOneResponse.setResponseXml(xmlContent);
        strategyOneResponseService.saveStrategyOneResponseService(strategyOneResponse);

        System.out.println("***************************//////////////////////////////////////////////********************************************");
        //System.out.println(strategyOneResponse);



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

    private String unescapeXml(String escapedXml) {
        return escapedXml.replace("&lt;", "<")
                .replace("&gt;", ">")
                .replace("&amp;", "&")
                .replace("&quot;", "\"")
                .replace("&apos;", "'");
    }
}
