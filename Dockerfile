# Build stage
FROM gradle:jdk14 as builder

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle bootJar
RUN mv /home/gradle/src/./build/libs/conlibre-*.jar /home/gradle/src/./build/libs/conlibre.jar 

FROM adoptopenjdk/openjdk14:alpine-slim
EXPOSE 8080

COPY --from=builder /home/gradle/src/./build/libs/conlibre.jar /conlibre/lib/
WORKDIR /conlibre/
VOLUME ["/conlibre/config"]
ENTRYPOINT java -jar lib/conlibre.jar
