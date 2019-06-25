#!/bin/bash

# docker-compose up -d zookeeper kafka
# docker-compose build ridondante 
docker-compose up --scale aservice=2 --scale bservice=2 --scale cservice=2
