#!/bin/bash

# itera la richiesta 10 volte 

for i in {1..10}; do 
    echo "Invio richiesta POST ad A"
    curl -X POST localhost:8080/a
    echo ""


    echo "Invio richiesta GET ad A"
    curl localhost:8080/a
    echo ""
done

