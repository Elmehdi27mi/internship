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

    private final StrategyOneRequestService strategyOneRequestService;
    private final StrategyOneRequestPresService strategyOneRequestPresService;

    @JmsListener(destination = "dataQueue")
    public PersistResponse.OutputData receiveMessage(Persist.Request request) {
        PersistResponse.OutputData outputData = new PersistResponse.OutputData();

        try {
            if (request.getScorInteg() != null && !request.getScorInteg().isEmpty() &&
                    (request.getPresCore() == null || request.getPresCore().isEmpty())) {
                processScorIntegRequest(request.getScorInteg(), outputData);
            } else if (request.getPresCore() != null && !request.getPresCore().isEmpty() &&
                    (request.getScorInteg() == null || request.getScorInteg().isEmpty())) {
                processPresCoreRequest(request.getPresCore(), outputData);
            } else {
                throw new IllegalArgumentException("Invalid request: both ScorInteg and PresCore are provided or missing.");
            }

        } catch (Exception e) {
            outputData.setCodeRetour("500");
            outputData.setMessageRetour("Error: " + e.getMessage());
            e.printStackTrace();
        }

        return outputData;
    }

    private void processScorIntegRequest(String xmlContent, PersistResponse.OutputData outputData) throws Exception {
        xmlContent = xmlContent.trim();
        if (!isValidXML(xmlContent)) {
            throw new Exception("Invalid XML content for ScorInteg");
        }

        JAXBContext context = JAXBContext.newInstance(StrategyOneRequestDTO.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        StrategyOneRequestDTO strategyOneRequestDto = (StrategyOneRequestDTO) unmarshaller.unmarshal(new StringReader(xmlContent));
        persistXmlDataScorInteg(strategyOneRequestDto, xmlContent);

        outputData.setCodeRetour("200");
        outputData.setMessageRetour("Success: Les données de la requête ScorInteg sont bien stockées");
    }

    private void processPresCoreRequest(String xmlContent, PersistResponse.OutputData outputData) throws Exception {
        xmlContent = xmlContent.trim();
        if (!isValidXML(xmlContent)) {
            throw new Exception("Invalid XML content for PresCore");
        }

        JAXBContext context = JAXBContext.newInstance(StrategyOneRequestPresDTO.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        StrategyOneRequestPresDTO strategyOneRequestDto = (StrategyOneRequestPresDTO) unmarshaller.unmarshal(new StringReader(xmlContent));
        persistXmlDataPresCore(strategyOneRequestDto, xmlContent);

        outputData.setCodeRetour("200");
        outputData.setMessageRetour("Success: Les données de la requête PresCore sont bien stockées");
    }

    private void persistXmlDataScorInteg(StrategyOneRequestDTO strategyOneRequestDto, String xmlContent) {
        List<RecordRR> recordRRList = strategyOneRequestDto.getBody()
                .getRecordRR()
                .getRecord()
                .stream()
                .map(RecordRRMapper::toEntity)
                .collect(Collectors.toList());
        StrategyOneRequest strategyOneRequest = StrategyOneRequestMapper.toEntity(strategyOneRequestDto, recordRRList);
        strategyOneRequest.setRequestXml(xmlContent);
        strategyOneRequestService.saveStrategyOneRequestService(strategyOneRequest);

        System.out.println("Les données de la requête ScorInteg sont bien stockées ." );
    }

    private void persistXmlDataPresCore(StrategyOneRequestPresDTO strategyOneRequestDto, String xmlContent) {
        StrategyOneRequestPres strategyOneRequestPres = StrategyOneRequestPresMapper.toEntity(strategyOneRequestDto, xmlContent);
        strategyOneRequestPresService.saveStrategyOneRequestService(strategyOneRequestPres);
        System.out.println("Les données de la requête PresCore sont bien stockées ." );
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
