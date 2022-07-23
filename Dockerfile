FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 9092
ARG JAR_FILE=target/coin-exchange-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} coin-exchange-app.jar
ENTRYPOINT ["java","-jar","/coin-exchange-app.jar"]
