FROM gradle:jdk15-hotspot AS builder
WORKDIR /app
COPY . .
RUN gradle --no-daemon build shadowJar

FROM openjdk:latest
WORKDIR /app
COPY --from=builder /app/build/libs/Base64HttpService-0.1-all.jar Base64HttpService-0.1-all.jar
COPY --from=builder /app/build/resources/main/ src/main/resources/

EXPOSE 8080
CMD ["java", "-jar", "./Base64HttpService-0.1-all.jar"]