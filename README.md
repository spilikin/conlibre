Toolchain installation
======================

1. (optional) Install SDKMAN from http://sdkman.io
2. Install Java and Maven
```
    sdk install java
    sdk install maven
```


Using the Emulator
==================================

Quickstart
----------

```
    cd /tmp
    git clone git@bitbucket.org:spilikin/telematik-jaxws.git
    (cd telematik-jaxws;mvn clean install)
    git clone git@bitbucket.org:spilikin/emu-konauth.git
    cd emu-konauth
    mvn clean test
    mvn spring-boot:run
```

Start the Emulator from command line
------------------------------------
```
    mvn spring-boot:run
```

Get Service Directory
---------------------
```
    curl -i http://fraqir:9095/connector.sds
```
