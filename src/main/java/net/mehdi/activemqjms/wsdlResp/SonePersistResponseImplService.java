
package net.mehdi.activemqjms.wsdlResp;

import jakarta.xml.ws.*;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "SonePersistResponseImplService", targetNamespace = "http://sonePersistResponse.ws.sofac.ma", wsdlLocation = "file:/C:/Users/Dell/OneDrive/Bureau/internship/active-mq-jms/src/main/java/net/mehdi/activemqjms/wsdl/SonePersistResponse.wsdl")
public class SonePersistResponseImplService
    extends Service
{

    private static final URL SONEPERSISTRESPONSEIMPLSERVICE_WSDL_LOCATION;
    private static final WebServiceException SONEPERSISTRESPONSEIMPLSERVICE_EXCEPTION;
    private static final QName SONEPERSISTRESPONSEIMPLSERVICE_QNAME = new QName("http://sonePersistResponse.ws.sofac.ma", "SonePersistResponseImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Dell/OneDrive/Bureau/internship/active-mq-jms/src/main/java/net/mehdi/activemqjms/wsdl/SonePersistResponse.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SONEPERSISTRESPONSEIMPLSERVICE_WSDL_LOCATION = url;
        SONEPERSISTRESPONSEIMPLSERVICE_EXCEPTION = e;
    }

    public SonePersistResponseImplService() {
        super(__getWsdlLocation(), SONEPERSISTRESPONSEIMPLSERVICE_QNAME);
    }

    public SonePersistResponseImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SONEPERSISTRESPONSEIMPLSERVICE_QNAME, features);
    }

    public SonePersistResponseImplService(URL wsdlLocation) {
        super(wsdlLocation, SONEPERSISTRESPONSEIMPLSERVICE_QNAME);
    }

    public SonePersistResponseImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SONEPERSISTRESPONSEIMPLSERVICE_QNAME, features);
    }

    public SonePersistResponseImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SonePersistResponseImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SOnePersistResponse
     */
    @WebEndpoint(name = "SOnePersistResponsePort")
    public SOnePersistResponse getSOnePersistResponsePort() {
        return super.getPort(new QName("http://sonePersistResponse.ws.sofac.ma", "SOnePersistResponsePort"), SOnePersistResponse.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SOnePersistResponse
     */
    @WebEndpoint(name = "SOnePersistResponsePort")
    public SOnePersistResponse getSOnePersistResponsePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sonePersistResponse.ws.sofac.ma", "SOnePersistResponsePort"), SOnePersistResponse.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SONEPERSISTRESPONSEIMPLSERVICE_EXCEPTION!= null) {
            throw SONEPERSISTRESPONSEIMPLSERVICE_EXCEPTION;
        }
        return SONEPERSISTRESPONSEIMPLSERVICE_WSDL_LOCATION;
    }

}
