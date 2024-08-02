package net.mehdi.activemqjms.services;

import net.mehdi.activemqjms.producer.MessagePublisher;
import net.mehdi.activemqjms.wsdlReq.Persist;
import net.mehdi.activemqjms.wsdlReq.PersistResponse;
import net.mehdi.activemqjms.wsdlReq.SOnePersistRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.jws.WebService;

@Service
@WebService(endpointInterface = "net.mehdi.activemqjms.wsdlReq.SOnePersistRequest")
public class SOnePersistRequestImpl implements SOnePersistRequest {

    @Autowired
    private MessagePublisher messagePublisher;

    @Override
    public PersistResponse.OutputData persist(Persist.Request request) {
        messagePublisher.sendMessage(request);
        PersistResponse.OutputData response = new PersistResponse.OutputData();
        response.setCodeRetour("200");
        response.setMessageRetour("Message send to consumer");
        return response;
    }
}
