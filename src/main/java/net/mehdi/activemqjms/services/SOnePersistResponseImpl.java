package net.mehdi.activemqjms.services;

import jakarta.jws.WebService;
import net.mehdi.activemqjms.producer.MessagePublisherResp;
import net.mehdi.activemqjms.wsdlResp.Persist;
import net.mehdi.activemqjms.wsdlResp.PersistResponse;
import net.mehdi.activemqjms.wsdlResp.SOnePersistResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@WebService(endpointInterface = "net.mehdi.activemqjms.wsdlResp.SOnePersistResponse")
public class SOnePersistResponseImpl implements SOnePersistResponse {

    @Autowired
    private MessagePublisherResp messagePublisherResp;


    @Override
    public PersistResponse.OutputData persist(Persist.Request request) {
        messagePublisherResp.sendMessage(request);
        // On retourne une réponse simulée, la vraie réponse viendrait du consumer
        PersistResponse.OutputData response = new PersistResponse.OutputData();
        response.setCodeRetour("200");
        response.setMessageRetour("Message envoyé au consumer");
        return response;
    }
}
