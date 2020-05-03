package emu.konauth;

import javax.jws.WebService;

public class ServiceHelper {
    public static class ServiceInfo {
        private String version;
        private String name;
        private String targetNamespace;

        public String version() {
            return this.version;
        }

        public String targetNamespace() {
            return targetNamespace;
        }

        public String name() {
            return name;
        }

        public String path() {
            return String.format("%s/%s", name, version);
        }
    }

    public static ServiceInfo info(Object service) {
        ServiceInfo result = new ServiceInfo();
        result.name = service.getClass().getAnnotation(WebService.class).name();
        result.version = service.getClass().getAnnotation(Version.class).value();
        result.targetNamespace = service.getClass().getAnnotation(WebService.class).targetNamespace();

        return result;
    }
}
