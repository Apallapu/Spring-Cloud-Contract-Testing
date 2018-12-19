FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./target/common-registry-service-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/common-registry-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 8761