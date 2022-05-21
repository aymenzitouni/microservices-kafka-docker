FROM openjdk:11

COPY target/producer*.jar producer.jar

ENTRYPOINT [ "java","-jar","/producer.jar" ]

EXPOSE 8080