
package net.mehdi.activemqjms.wsdlReq;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.mehdi.activemqjms.wsdlReq package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Persist_QNAME = new QName("http://sonePersistRequest.ws.sofac.ma", "persist");
    private static final QName _PersistResponse_QNAME = new QName("http://sonePersistRequest.ws.sofac.ma", "persistResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.mehdi.activemqjms.wsdlReq
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersistResponse }
     * 
     * @return
     *     the new instance of {@link PersistResponse }
     */
    public PersistResponse createPersistResponse() {
        return new PersistResponse();
    }

    /**
     * Create an instance of {@link Persist }
     * 
     * @return
     *     the new instance of {@link Persist }
     */
    public Persist createPersist() {
        return new Persist();
    }

    /**
     * Create an instance of {@link OutputData }
     * 
     * @return
     *     the new instance of {@link OutputData }
     */
    public OutputData createOutputData() {
        return new OutputData();
    }

    /**
     * Create an instance of {@link PersistResponse.OutputData }
     * 
     * @return
     *     the new instance of {@link PersistResponse.OutputData }
     */
    public PersistResponse.OutputData createPersistResponseOutputData() {
        return new PersistResponse.OutputData();
    }

    /**
     * Create an instance of {@link Persist.Request }
     * 
     * @return
     *     the new instance of {@link Persist.Request }
     */
    public Persist.Request createPersistRequest() {
        return new Persist.Request();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Persist }{@code >}
     */
    @XmlElementDecl(namespace = "http://sonePersistRequest.ws.sofac.ma", name = "persist")
    public JAXBElement<Persist> createPersist(Persist value) {
        return new JAXBElement<>(_Persist_QNAME, Persist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersistResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://sonePersistRequest.ws.sofac.ma", name = "persistResponse")
    public JAXBElement<PersistResponse> createPersistResponse(PersistResponse value) {
        return new JAXBElement<>(_PersistResponse_QNAME, PersistResponse.class, null, value);
    }

}
