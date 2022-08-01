# Build stage
FROM gradle:7.5.0-jdk18 as builder

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle bootJar
RUN mv /home/gradle/src/./build/libs/conlibre-*.jar /home/gradle/src/./build/libs/conlibre.jar 

FROM eclipse-temurin:18
EXPOSE 8080

COPY --from=builder /home/gradle/src/./build/libs/conlibre.jar /conlibre/lib/
COPY --from=builder /home/gradle/src/config /conlibre/config
WORKDIR /conlibre/
#VOLUME ["/conlibre/config"]
ENTRYPOINT java -jar lib/conlibre.jar
