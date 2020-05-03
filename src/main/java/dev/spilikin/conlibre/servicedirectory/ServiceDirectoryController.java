package dev.spilikin.conlibre.servicedirectory;

import de.gematik.ws.conn.servicedirectory.v3.ConnectorServices;
import de.gematik.ws.conn.serviceinformation.v2.*;
import dev.spilikin.conlibre.ServiceHelper;
import dev.spilikin.conlibre.Version;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.*;
import java.util.Map;

@RestController
public class ServiceDirectoryController {
    @Resource
    private ApplicationContext applicationContext;

    @RequestMapping(value="/connector.sds", produces= MediaType.APPLICATION_XML_VALUE)
    public ConnectorServices serviceDirectory(HttpServletRequest request) throws MalformedURLException, URISyntaxException {
        ConnectorServices connectorServices = new ConnectorServices();
        connectorServices.setServiceInformation(new ServicesType());
        URI requestURL = new URI(request.getRequestURL().toString());
        URI baseURI = new URI(requestURL.getScheme(), null, requestURL.getHost(), requestURL.getPort(), "/soap-api/", null, null);

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

        return connectorServices;
    }

}