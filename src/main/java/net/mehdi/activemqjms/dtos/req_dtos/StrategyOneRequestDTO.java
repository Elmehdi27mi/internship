package net.mehdi.activemqjms.dtos.req_dtos;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "StrategyOneRequest", namespace = "http://strategyone.ws.sofac.ma")
public class StrategyOneRequestDTO {

    private Header header;
    private Body body;

    @XmlElement(name = "Header")
    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    @XmlElement(name = "Body")
    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
