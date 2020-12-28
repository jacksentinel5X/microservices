FROM java:8

EXPOSE 9091

ADD target/partidaasociado-servicio-0.0.1-SNAPSHOT.jar reglas-servicio.jar

ENTRYPOINT ["java","-jar","reglas-servicio.jar"]