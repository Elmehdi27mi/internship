package net.mehdi.activemqjms.consumers;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import lombok.AllArgsConstructor;
import net.mehdi.activemqjms.dtos.presCoreDTO.res_dtos.StrategyOneResponsePresResDTO;
import net.mehdi.activemqjms.dtos.scorIntegDTO.res_dtos.StrategyOneResponseDTO;
import net.mehdi.activemqjms.entities.presCore.res_entities.StrategyOneResponsePres;
import net.mehdi.activemqjms.entities.scorInteg.res_entities.RecordRRRes;
import net.mehdi.activemqjms.entities.scorInteg.res_entities.StrategyOneResponse;
import net.mehdi.activemqjms.mappers.presCore.res_mappers.StrategyOneResponsePresMapper;
import net.mehdi.activemqjms.mappers.scorInteg.res_mappers.RecordRRRespMapper;
import net.mehdi.activemqjms.mappers.scorInteg.res_mappers.StrategyOneResponseMapper;
import net.mehdi.activemqjms.services.presCore.res_service.StrategyOneResponsePresService;
import net.mehdi.activemqjms.services.scorInteg.res_service.StrategyOneResponseService;
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
    private StrategyOneResponsePresService strategyOneResponsePresService;
    @JmsListener(destination = "dataQueue2")
    public PersistResponse.OutputData receiveMessage(Persist.Request request) {
        PersistResponse.OutputData outputData = new PersistResponse.OutputData();
        try {
            if(!request.getScorInteg().equals("") && request.getPresCore().equals("")){
                String xmlContent = request.getScorInteg();
                xmlContent = xmlContent.trim();

                if (!isValidXML(xmlContent)) {
                    throw new Exception("Invalid XML content");
                }
                JAXBContext context = JAXBContext.newInstance(StrategyOneResponseDTO.class);

                Unmarshaller unmarshaller = context.createUnmarshaller();
                StrategyOneResponseDTO strategyOneResponseDTO = (StrategyOneResponseDTO) unmarshaller.unmarshal(new StringReader(xmlContent));
                persistXmlDataScorIneg(strategyOneResponseDTO , xmlContent);

                outputData.setCodeRetour("200");
                outputData.setMessageRetour("Success : Les données de la requête sont bien stockées");
            }else if (!request.getPresCore().equals("") && request.getScorInteg().equals("")) {
                String xmlContent = request.getPresCore();
                xmlContent = xmlContent.trim();

                if (!isValidXML(xmlContent)) {
                    throw new Exception("Invalid XML content");
                }
                JAXBContext context = JAXBContext.newInstance(StrategyOneResponsePresResDTO.class);

                Unmarshaller unmarshaller = context.createUnmarshaller();
                StrategyOneResponsePresResDTO strategyOneResponsePresResDTO = (StrategyOneResponsePresResDTO) unmarshaller.unmarshal(new StringReader(xmlContent));
                persistXmlDataPresCore(strategyOneResponsePresResDTO , xmlContent);

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

    private void persistXmlDataScorIneg(StrategyOneResponseDTO strategyOneResponseDto , String xmlContent ) {

        List<RecordRRRes> recordRRResList= strategyOneResponseDto
                .getBody()
                .getRecordRR()
                .getRecord()
                .stream()
                .map(RecordRRRespMapper::toEntity)
                .collect(Collectors.toList());
        StrategyOneResponse strategyOneResponse= StrategyOneResponseMapper.toEntity(strategyOneResponseDto,recordRRResList);
        strategyOneResponse.setResponseXml(xmlContent);
        strategyOneResponseService.saveStrategyOneResponseService(strategyOneResponse);

    }
    private void persistXmlDataPresCore(StrategyOneResponsePresResDTO strategyOneResponsePresResDTO,String xmlContent){
        System.out.println("**************************************");
        System.out.println(strategyOneResponsePresResDTO);
        StrategyOneResponsePres strategyOneResponsePres= StrategyOneResponsePresMapper.toEntity(strategyOneResponsePresResDTO,xmlContent);
        strategyOneResponsePresService.saveStartegyOneResponseService(strategyOneResponsePres);
        System.out.println(strategyOneResponsePres);
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
}
