#!/bin/bash

# Script per avviare l'applicazione Sentence
echo  Avviare prima lo script start-kafka.sh 

echo Running Project

echo Starting Eureka Server  
java -Xms64m -Xmx128m -jar eureka-server/build/libs/eureka.jar &

echo Starting A Services [2]
java -Xms64m -Xmx128m -jar -DinstanceName=Alberto a-service/build/libs/a.jar &
java -Xms64m -Xmx128m -jar -DinstanceName=Anna a-service/build/libs/a.jar &

echo Starting B Services [2]
java -Xms64m -Xmx128m -jar -DinstanceName=Barbara b-service/build/libs/b.jar &
java -Xms64m -Xmx128m -jar -DinstanceName=Bianca b-service/build/libs/b.jar &

echo Starting C Services [2]
java -Xms64m -Xmx128m -jar -Dname=Carla c-service/build/libs/c.jar &
java -Xms64m -Xmx128m -jar -Dname=Celeste c-service/build/libs/c.jar &

echo Starting Zuul Gateway

java -Xms64m -Xmx128m -jar zuul-gateway/build/libs/zuul.jar &
