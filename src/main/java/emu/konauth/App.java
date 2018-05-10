package emu.konauth;

import emu.konauth.authsignatureservice.AuthSignatureService;
import emu.softcard.FileSoftcardBuilder;
import emu.softcard.Softcard;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.security.Security;
import java.util.HashMap;
import java.util.Map;

/**
 * Spring Boot Application for Konnektor SOAP Simulator
 */
@SpringBootApplication
public class App {


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public ServletRegistrationBean soapServlet() {
        return new ServletRegistrationBean<>(new CXFServlet(), "/soap-api/*");
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
    public Map<String, Softcard> cards() throws IOException {

        ClassLoader cl = this.getClass().getClassLoader();
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(cl);
        Resource[] resources = resolver.getResources("classpath*:/softcards/*");

        Map<String, Softcard> result = new HashMap<>();
        FileSoftcardBuilder builder = new FileSoftcardBuilder();
        for (Resource resource : resources) {
            Softcard softcard = builder.build(resource.getFile());
            result.put(softcard.getName(), softcard);
        }

        return result;
    }

    @Bean
    public Endpoint authSignatureServiceEndpoint() {
        return publishService(authSignatureService());
    }

    @Bean
    public DatatypeFactory datatypeFactory() throws DatatypeConfigurationException {
        return DatatypeFactory.newInstance();
    }

    @Bean
    public BouncyCastleProvider bouncyCastleProvider() {
        BouncyCastleProvider provider = new BouncyCastleProvider();
        Security.addProvider(provider);
        return provider;
    }

    private Endpoint publishService(Object service) {
        ConnectorServiceHelper.ServiceInfo serviceInfo = ConnectorServiceHelper.info(service);
        EndpointImpl endpoint = new EndpointImpl(springBus(), authSignatureService());
        endpoint.publish(serviceInfo.path());

        return endpoint;

    }
}
