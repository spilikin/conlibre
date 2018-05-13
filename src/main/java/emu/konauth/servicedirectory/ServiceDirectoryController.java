package emu.konauth.servicedirectory;

import emu.konauth.ServiceHelper;
import emu.konauth.Version;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import telematik.ws.conn.servicedirectory.v3_1.ConnectorServices;
import telematik.ws.conn.serviceinformation.v2_0.*;

import javax.jws.WebService;
import java.net.*;
import java.util.Map;

@RestController
public class ServiceDirectoryController {
    private ConnectorServices connectorServices;

    @Value("${server.port}")
    private int serverPort;


    public ServiceDirectoryController() {
        connectorServices = new ConnectorServices();
        connectorServices.setServiceInformation(new ServicesType());
    }

    @RequestMapping(value="/connector.sds", produces= MediaType.APPLICATION_XML_VALUE)
    public ConnectorServices serviceDirectory() {
        return connectorServices;
    }

    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent contextRefreshedEvent) throws UnknownHostException, URISyntaxException, MalformedURLException {

        String serverHost = InetAddress.getLocalHost().getHostAddress();
        URI baseURI = new URI("http", null, serverHost, serverPort, "/soap-api/", null, null);

        ApplicationContext applicationContext = (ApplicationContext)contextRefreshedEvent.getSource();
        Map<String, Object> webServices = applicationContext.getBeansWithAnnotation(WebService.class);
        for (Object webservice:webServices.values()) {
            ServiceHelper.ServiceInfo serviceInfo = ServiceHelper.info(webservice);
            ServiceType service = new ServiceType();
            service.setName(serviceInfo.name());
            VersionType version = new VersionType();
            version.setTargetNamespace(serviceInfo.targetNamespace());
            version.setVersion(webservice.getClass().getAnnotation(Version.class).value());
            version.setEndpoint(new EndpointType());
            URI uri = baseURI.resolve(serviceInfo.path());
            version.getEndpoint().setLocation(uri.toURL().toExternalForm());
            service.setVersions(new VersionsType());
            service.getVersions().getVersion().add(version);
            connectorServices.getServiceInformation().getService().add(service);
        }

        return;
    }


}