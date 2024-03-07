FROM openjdk:17-alpine

COPY . /app
WORKDIR /app

RUN ./gradlew publishToMavenLocal

EXPOSE 8085
WORKDIR /app

CMD java -jar ./build/libs/exception-spring-boot-starter-0.0.1-SNAPSHOT.jar