FROM openjdk:11

COPY target/consumer*.jar consumer.jar

ENTRYPOINT [ "java","-jar","/consumer.jar" ]

EXPOSE 8081