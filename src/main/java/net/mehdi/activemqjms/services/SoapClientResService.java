package net.mehdi.activemqjms.services;

import jakarta.xml.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
public class SoapClientResService {

    @Autowired
    private XmlFileReaderService xmlFileReaderService;

    public String sendSoapRequest(String xmlFilePath, String url) throws Exception {
        String xmlContent = xmlFileReaderService.readFileAsString(xmlFilePath);
        String xmlContentWithCDATA = wrapWithCDATA(xmlContent);

        SOAPMessage soapMessage = createSOAPRequest(xmlContentWithCDATA);
        SOAPMessage response = sendSOAPRequest(soapMessage, url);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        response.writeTo(out);
        return new String(out.toByteArray());
    }

    private SOAPMessage createSOAPRequest(String xmlContent) throws SOAPException, IOException {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        SOAPPart soapPart = soapMessage.getSOAPPart();
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("son", "http://sonePersistResponse.ws.sofac.ma");

        SOAPBody soapBody = envelope.getBody();
        SOAPElement persistElement = soapBody.addChildElement("persist", "son");
        SOAPElement requestElement = persistElement.addChildElement("Request");
        SOAPElement presCoreElement = requestElement.addChildElement("presCore");
        presCoreElement.addTextNode("PresCoreData");
        SOAPElement scorIntegElement = requestElement.addChildElement("scorInteg");

        // Utiliser CDATA section pour le contenu XML
        scorIntegElement.appendChild(scorIntegElement.getOwnerDocument().createCDATASection(xmlContent));

        soapMessage.saveChanges();

        return soapMessage;
    }

    private SOAPMessage sendSOAPRequest(SOAPMessage request, String url) throws SOAPException {
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();
        return soapConnection.call(request, url);
    }

    private String wrapWithCDATA(String xml) {
        return "<![CDATA[" + xml + "]]>";
    }
}
