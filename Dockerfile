FROM java:8-jdk-alpine
COPY ./classes/artifacts/docker_jar/docker.jar /opt/app/
WORKDIR /opt/app
EXPOSE 8080
CMD ["java", "-jar", "docker.jar"]