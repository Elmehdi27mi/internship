package net.mehdi.activemqjms.producer;

import jakarta.jms.JMSException;
import net.mehdi.activemqjms.wsdlReq.Persist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessagePublisher {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(Persist.Request request) {
            jmsTemplate.convertAndSend("dataQueue", request, message -> {
                message.setJMSReplyTo(new jakarta.jms.Queue() {
                    @Override
                    public String getQueueName() throws JMSException {
                        return "defaultReplyQueue";
                    }
                });
                return message;
            });
        }
}

