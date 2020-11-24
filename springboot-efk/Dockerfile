FROM openjdk:8

WORKDIR /usr/app

ADD ./target/springboot-efk-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8888

ENTRYPOINT java -jar app.jar