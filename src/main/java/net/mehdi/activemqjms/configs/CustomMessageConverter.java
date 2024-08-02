package net.mehdi.activemqjms.configs;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.ObjectMessage;
import jakarta.jms.Session;
import net.mehdi.activemqjms.wsdlResp.Persist;
import net.mehdi.activemqjms.wsdlResp.PersistResponse;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

import java.io.Serializable;

public class CustomMessageConverter implements MessageConverter {

    @Override
    public Message toMessage(Object object, Session session) throws JMSException, MessageConversionException {
        if (object instanceof net.mehdi.activemqjms.wsdlReq.Persist.Request || object instanceof net.mehdi.activemqjms.wsdlReq.PersistResponse.OutputData || object instanceof Persist.Request || object instanceof PersistResponse.OutputData) {
            return session.createObjectMessage((Serializable) object);
        }
        throw new MessageConversionException("Object is not defined ");
    }

    @Override
    public Object fromMessage(Message message) throws JMSException, MessageConversionException {
        if (message instanceof ObjectMessage) {
            return ((ObjectMessage) message).getObject();
        }
        throw new MessageConversionException("Message is not an instance of ObjectMessage");
    }
}
