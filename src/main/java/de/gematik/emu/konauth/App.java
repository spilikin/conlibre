package de.gematik.emu.konauth;

import de.gematik.emu.konauth.authsignatureservice.AuthSignatureServicePort;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.feature.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import telematik.ws.conn.authsignatureservice.wsdl.v7_4.AuthSignatureService;

import javax.xml.ws.Endpoint;
import java.net.URL;

/**
 *
 */
@SpringBootApplication
public class App {


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean<CXFServlet>(new CXFServlet(), "/soap-api/*");
    }

    @Bean(name= Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public AuthSignatureServicePort authSignatureService() {
        return new AuthSignatureServicePort();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), authSignatureService());
        endpoint.publish("/AuthSignatureService/7.4");

        LoggingFeature logFeature = new LoggingFeature();
        logFeature.setPrettyLogging(true);
        logFeature.initialize(springBus());
        endpoint.getFeatures().add(logFeature);

        return endpoint;
    }

}
