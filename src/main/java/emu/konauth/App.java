package emu.konauth;

import emu.konauth.authsignatureservice.AuthSignatureService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.xml.ws.Endpoint;

/**
 *
 */
@SpringBootApplication
public class App {


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public ServletRegistrationBean soapServlet() {
        return new ServletRegistrationBean<CXFServlet>(new CXFServlet(), "/soap-api/*");
    }

    @Bean
    public LoggingFeature loggingFeature() {
        LoggingFeature logFeature = new LoggingFeature();
        logFeature.setPrettyLogging(true);
        logFeature.initialize(springBus());
        return logFeature;
    }

    @Bean(name= Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public AuthSignatureService authSignatureService() {
        return new AuthSignatureService();
    }

    @Bean
    public Endpoint authSignatureServiceEndpoint() {
        return publishService(authSignatureService());
    }

    private Endpoint publishService(Object service) {
        ConnectorServiceHelper.ServiceInfo serviceInfo = ConnectorServiceHelper.info(service);
        EndpointImpl endpoint = new EndpointImpl(springBus(), authSignatureService());
        endpoint.publish(serviceInfo.path());

        return endpoint;

    }
}
