#!/bin/bash

# Script per avviare l'applicazione Sentence 
echo Avviare prima lo script start-kafka.sh

echo Running Project

echo Starting Eureka Server  
java -Xms64m -Xmx128m -jar eureka-server/build/libs/eureka.jar &

echo Starting A Services
java -Xms64m -Xmx128m -jar -DinstanceName=Alberto a-service/build/libs/a.jar &

echo Starting B Services
java -Xms64m -Xmx128m -jar -DinstanceName=Barbara b-service/build/libs/b.jar &

echo Starting C Services
java -Xms64m -Xmx128m -jar -Dname=Carla c-service/build/libs/c.jar &

echo Starting Zuul Gateway

java -Xms64m -Xmx128m -jar zuul-gateway/build/libs/zuul.jar &
