package net.mehdi.activemqjms;

import jakarta.xml.ws.Endpoint;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ActiveMqJmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActiveMqJmsApplication.class, args);
    }

}
