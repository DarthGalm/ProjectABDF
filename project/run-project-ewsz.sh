#!/bin/bash

# Script per avviare l'applicazione Sentence 

echo Running Project

echo Starting Eureka Server  
java -Xms64m -Xmx128m -jar eureka-server/build/libs/eureka.jar &

echo Starting A Services
java -Xms64m -Xmx128m -jar a-service/build/libs/a.jar &

echo Starting Zuul Gateway

java -Xms64m -Xmx128m -jar zuul-gateway/build/libs/zuul.jar &
