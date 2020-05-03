package dev.spilikin.conlibre;

import dev.spilikin.conlibre.authsignatureservice.AuthSignatureService;
import dev.spilikin.conlibre.cardservice.CardService_v8_1_1;
import dev.spilikin.conlibre.cardservice.CardService_v8_1_2;
import dev.spilikin.conlibre.eventservice.EventService;
import dev.spilikin.conlibre.softcard.FileSoftcardBuilder;
import dev.spilikin.conlibre.softcard.Softcard;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.xml.ws.Endpoint;
import java.io.IOException;
import java.security.Security;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class App {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public ServletRegistrationBean soapServlet() {
		return new ServletRegistrationBean<>(new CXFServlet(), "/soap-api/*");
	}

	/*
	@Bean
	public LoggingFeature loggingFeature() {
		LoggingFeature logFeature = new LoggingFeature();
		logFeature.setPrettyLogging(true);
		logFeature.initialize(springBus());
		return logFeature;
	}
	 */

	@Bean(name= Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}

	@Bean
	public Map<String, Softcard> cards() throws IOException {

		ClassLoader cl = this.getClass().getClassLoader();
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(cl);
		Resource[] resources = resolver.getResources("file:./config/cards/*");


		if (resources.length == 0) {
			throw new IOException("No softcards found");
		}

		Map<String, Softcard> result = new HashMap<>();
		FileSoftcardBuilder builder = new FileSoftcardBuilder();
		for (Resource resource : resources) {
			log.info(resource.toString());

			Softcard softcard = builder.build(resource.getFile());
			result.put(softcard.getName(), softcard);
		}

		return result;
	}

	@Bean
	public AuthSignatureService authSignatureService() {
		return new AuthSignatureService();
	}

	@Bean
	public Endpoint authSignatureServiceEndpoint() {
		return publishService(authSignatureService());
	}

	@Bean
	public EventService eventService() {
		return new EventService();
	}

	@Bean
	public Endpoint eventServiceEndpoint() {
		return publishService(eventService());
	}


	@Bean
	public CardService_v8_1_1 cardService_v8_1_1() {
		return new CardService_v8_1_1();
	}

	@Bean
	public Endpoint cardService_v8_1_1_Endpoint() {
		return publishService(cardService_v8_1_1());
	}

	@Bean
	public CardService_v8_1_2 cardService_v8_1_2() {
		return new CardService_v8_1_2();
	}

	@Bean
	public Endpoint cardService_v8_1_2_Endpoint() {
		return publishService(cardService_v8_1_2());
	}


	private Endpoint publishService(Object service) {
		ServiceHelper.ServiceInfo serviceInfo = ServiceHelper.info(service);
		EndpointImpl endpoint = new EndpointImpl(springBus(), service);
		endpoint.publish(serviceInfo.path());

		return endpoint;

	}

	@Bean
	public BouncyCastleProvider bouncyCastleProvider() {
		BouncyCastleProvider provider = new BouncyCastleProvider();
		Security.addProvider(provider);
		return provider;
	}

}
