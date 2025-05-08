FROM openjdk:17

COPY target/example-app.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 9091

ENTRYPOINT ["java", "-jar", "demo-app.jar"]