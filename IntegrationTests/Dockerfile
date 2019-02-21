FROM maven:latest as maven-build
WORKDIR /build
COPY . .
RUN mvn clean package
FROM java:8
WORKDIR /opt/website
COPY --from=maven-build /bild/target/IntergrationTests-0.0.1-SNAPSHOT.jar autotest.jar
ENTRYPOINT ["java", "-jar", "autotest.jar"]
