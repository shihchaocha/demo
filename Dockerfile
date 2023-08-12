FROM eclipse-temurin:17
WORKDIR workspace
ARG JAR_FILE=target/*.jar
COPY --from=build ${JAR_FILE} demo.jar
ENTRYPOINT ["java", "-jar", "demo.jar"]
