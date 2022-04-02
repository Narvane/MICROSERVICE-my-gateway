FROM openjdk:17

WORKDIR /app

COPY target/my-gateway*.jar /app/my-gateway.jar

ENTRYPOINT ["java", "-jar", "my-gateway.jar"]
