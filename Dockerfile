FROM 77tv/openjdk-21-jre

WORKDIR /app

COPY target/DeviceService_-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "DeviceService_-0.0.1-SNAPSHOT.jar"]