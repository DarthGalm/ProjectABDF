#!/bin/bash

docker-compose up --scale aservice=3 --scale bservice=3 --scale cservice=3 &
