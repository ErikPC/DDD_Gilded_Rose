## BUILD
FROM maven:3.8.4-openjdk-11-slim AS build
#determinamos el directorio de trabajo donde se van a copiar los directorios
WORKDIR /home/app
# copiamos la aplicacion y el pom.xml que contiene la configuracion
COPY src src
COPY pom.xml pom.xml
# aqui determinamos el comando que tiene que realizar
RUN mvn -f /home/app/pom.xml clean package -q

## PACKAGE
FROM openjdk:11.0-jre-slim-buster
# 
LABEL "edu.poniperro.gildedrose"="gildedrose"
LABEL version=0.0.1-SNAPSHOT
LABEL mantainer="https://github.com/ErikPC , https://github.com/stonarini"

COPY --from=build /home/app/target/gildedRose-0.0.1-SNAPSHOT.jar /usr/local/lib/gildedrose.jar
CMD ["java","-jar","/usr/local/lib/gildedrose.jar"]