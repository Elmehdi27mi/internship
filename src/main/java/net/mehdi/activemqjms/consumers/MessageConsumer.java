package net.mehdi.activemqjms.consumers;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import lombok.AllArgsConstructor;
import net.mehdi.activemqjms.dtos.presCoreDTO.req_dtos.StrategyOneRequestPresDTO;
import net.mehdi.activemqjms.dtos.scorIntegDTO.req_dtos.StrategyOneRequestDTO;
import net.mehdi.activemqjms.entities.presCore.req_entities.StrategyOneRequestPres;
import net.mehdi.activemqjms.entities.scorInteg.req_entities.RecordRR;
import net.mehdi.activemqjms.entities.scorInteg.req_entities.StrategyOneRequest;
import net.mehdi.activemqjms.mappers.presCore.req_mappers.StrategyOneRequestPresMapper;
import net.mehdi.activemqjms.mappers.scorInteg.req_mappers.RecordRRMapper;
import net.mehdi.activemqjms.mappers.scorInteg.req_mappers.StrategyOneRequestMapper;
import net.mehdi.activemqjms.services.presCore.req_service.StrategyOneRequestPresService;
import net.mehdi.activemqjms.services.scorInteg.req_service.StrategyOneRequestService;
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
    private StrategyOneRequestPresService strategyOneRequestServiceScorInteg;

    @JmsListener(destination = "dataQueue")
    public PersistResponse.OutputData receiveMessage(Persist.Request request) {
        PersistResponse.OutputData outputData = new PersistResponse.OutputData();
        try {

            if(!request.getScorInteg().equals("") && request.getPresCore().equals("")){
                String xmlContentScorInteg = request.getScorInteg();
                xmlContentScorInteg = xmlContentScorInteg.trim();

                if (!isValidXML(xmlContentScorInteg)) {
                    throw new Exception("Invalid XML content");
                }
                JAXBContext context = JAXBContext.newInstance(StrategyOneRequestDTO.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                StrategyOneRequestDTO strategyOneRequest = (StrategyOneRequestDTO) unmarshaller.unmarshal(new StringReader(xmlContentScorInteg));
                persistXmlDataScorIneg(strategyOneRequest , xmlContentScorInteg);
                outputData.setCodeRetour("200");
                outputData.setMessageRetour("Success : Les données de la requête sont bien stockées");
            } else if (!request.getPresCore().equals("") && request.getScorInteg().equals("")) {
                String xmlContentScorInteg = request.getPresCore();
                xmlContentScorInteg = xmlContentScorInteg.trim();

                if (!isValidXML(xmlContentScorInteg)) {
                    throw new Exception("Invalid XML content");
                }
                JAXBContext context = JAXBContext.newInstance(StrategyOneRequestPresDTO.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                StrategyOneRequestPresDTO strategyOneRequest = (StrategyOneRequestPresDTO) unmarshaller.unmarshal(new StringReader(xmlContentScorInteg));
                persistXmlDataPresCore(strategyOneRequest , xmlContentScorInteg);
                outputData.setCodeRetour("200");
                outputData.setMessageRetour("Success : Les données de la requête sont bien stockées");

            }else{
                throw  new RuntimeException("Error in requete");
            }


        } catch (Exception e) {

            outputData.setCodeRetour("500");
            outputData.setMessageRetour("Error: " + e.getMessage());
            e.printStackTrace();

        }
        return outputData;
    }

    private void persistXmlDataScorIneg(StrategyOneRequestDTO strategyOneRequestDto , String xmlContent ) {
        System.out.println("**************************************");

        System.out.println(strategyOneRequestDto);
       List<RecordRR> recordRRList= strategyOneRequestDto
               .getBody()
               .getRecordRR()
               .getRecord()
               .stream()
               .map(RecordRRMapper::toEntity)
               .collect(Collectors.toList());
         StrategyOneRequest strategyOneRequest=StrategyOneRequestMapper.toEntity(strategyOneRequestDto,recordRRList);
         strategyOneRequest.setRequestXml(xmlContent);
         strategyOneRequestService.saveStrategyOneRequestService(strategyOneRequest);
            System.out.println(strategyOneRequest);
        }


    private void persistXmlDataPresCore(StrategyOneRequestPresDTO strategyOneRequestDto , String xmlContent ) {
        System.out.println("**************************************");
        System.out.println(strategyOneRequestDto);
        StrategyOneRequestPres strategyOneRequestPres = StrategyOneRequestPresMapper.toEntity(strategyOneRequestDto,xmlContent);
        strategyOneRequestServiceScorInteg.saveStrategyOneRequestService(strategyOneRequestPres);
        System.out.println(strategyOneRequestPres);
        System.out.println("//////////////////////////////////////////////////////////////////////////");
    }




    private boolean isValidXML(String xmlContent) {
        try {
            javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new InputSource(new StringReader(xmlContent)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    /* <![CDATA[ */
    /* ]]> */
}
