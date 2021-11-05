FROM openjdk:8

RUN apt-get update && apt-get install -y maven
COPY ./curexrate-exchangerate-host /curexrate-exchangerate-host
RUN  cd /curexrate-exchangerate-host && mvn package

#run the spring boot application
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-Dblabla", "-jar","/curexrate-exchangerate-host/target/curexrate-exchangerate-host-0.0.1-SNAPSHOT.jar"]


