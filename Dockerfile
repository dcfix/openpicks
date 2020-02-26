FROM openjdk:8-alpine

COPY target/uberjar/openpicks.jar /openpicks/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/openpicks/app.jar"]
