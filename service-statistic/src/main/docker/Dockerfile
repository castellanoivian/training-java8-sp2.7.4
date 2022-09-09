FROM openjdk:8u342-jre-slim-buster
MAINTAINER Maidelis <maide8901@gmail.com>

ARG artifactname

VOLUME /tmp
ADD ${artifactname}.jar app.jar

RUN sh -c 'touch /app.jar'
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]