#FROM adoptopenjdk/openjdk:17-alpine
FROM bellsoft/liberica-openjdk-alpine:latest
RUN apk add -U tzdata
ENV TZ America/Lima
RUN ln -snf /usr/share/zoneinfo/${TZ} /etc/localtime
RUN echo "${TZ}" > /etc/timezone
VOLUME /tmp
EXPOSE 8003
ADD ./target/helena-servicio-sede-0.0.1-SNAPSHOT.jar helena-servicio-sede-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/helena-servicio-sede-0.0.1-SNAPSHOT.jar"]
