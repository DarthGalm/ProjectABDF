########################################################
# Dockerfile per B
########################################################

FROM openjdk:8-jdk 

RUN apt-get update && apt-get install -y curl

ADD build/libs/bservice.jar bservice.jar

#check this port 8080
EXPOSE 8761

ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "b.jar"]

#check if needed
#HEALTHCHECK --start-period=30s --interval=10s CMD curl -f http://localhost:8080/actuator/health || exit 1