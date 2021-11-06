FROM openjdk

WORKDIR /app

COPY target/triplice.teste.destack.v1-0.0.1-SNAPSHOT.jar /app/triplice.jar

ENTRYPOINT ["java", "-jar", "triplice.jar"]