FROM openjdk:8-jdk-alpine

RUN apk --no-cache add msttcorefonts-installer fontconfig && \
    update-ms-fonts && \
    fc-cache -f

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/report.api-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} report.api.jar

ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/ ./uradom", "-jar", "/report.api.jar" ]