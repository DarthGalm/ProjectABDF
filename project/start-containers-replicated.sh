#!/bin/bash

docker-compose up --scale aservice=2 --scale bservice=2 --scale cservice=2 &
