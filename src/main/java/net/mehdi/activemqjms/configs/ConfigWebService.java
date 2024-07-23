package net.mehdi.activemqjms.configs;
import jakarta.xml.ws.Endpoint;
import net.mehdi.activemqjms.services.SOnePersistRequestImpl;
import net.mehdi.activemqjms.services.SOnePersistResponseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigWebService {

    @Bean
    public Endpoint endpointReq(SOnePersistRequestImpl request) {
        String url = "http://localhost:9999/persistance/services/SonePersistRequest";
        Endpoint endpoint = Endpoint.publish(url, request);
        return endpoint;
    }
    @Bean
    public Endpoint endpointResp(SOnePersistResponseImpl sOnePersistResponse) {
        String url = "http://localhost:9999/persistance/services/SOnePersistResponse";
        Endpoint endpoint = Endpoint.publish(url, sOnePersistResponse);
        return endpoint;
    }

}
