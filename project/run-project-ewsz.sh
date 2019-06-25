#!/bin/bash

# Script per avviare l'applicazione 
echo Avviare prima dello script start-containers.sh

echo Building Java projects  
gradle build

echo Building docker images
docker-compose build

echo Launching containers
docker-compose up
