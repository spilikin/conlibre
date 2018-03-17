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
