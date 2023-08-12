FROM eclipse-temurin:17
WORKDIR workspace
COPY target/demo-0.0.1-SNAPSHOT demo.jar
ENTRYPOINT ["java", "-jar", "demo.jar"]
