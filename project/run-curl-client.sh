#!/bin/bash

# itera la richiesta 10 volte 

for i in {1..10}; do 
	curl localhost:8080/a
	echo "" ; 
done 
