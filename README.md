# ProjectABF
<br />
Repository del progetto per il corso di Architetture dei Sistemi Software <br />
Progetto scelto: 2D

Apicella Andrea 
Bersani Davide
D' Angelo Gabriele
Frillici Filippo

# Utilizzo
Attenzione: le applicazioni sono pensate per essere eseguite nell'ambiente "workstation". 
Attenzione: in alcuni casi la macchina virtuale potrebbe non crearsi correttamente. In particolare potrebbere interrompere la configurazione per via di un pacchetto "ifupdown" mancante. In tal caso, una volta avviata la macchina virtuale, entrare in ssh tramite il comando `vagrant ssh workstation` e successivamente eseguire il seguente comando

`sudo apt update && sudo apt install ifupdown`

Uscire dalla macchina virtuale, stopparla tramite `vagrant halt` e poi riavviarla di nuovo con `vagrant up`.

## Come avviare il progetto

1) Build
`./build-project.sh`

2) Avviare l'applicazione
`./start-containers.sh`
Oppure per avviare instanze replicate:
`./start-containers-replciated.sh`

## Utilizzo 
Per utilizzare i servizi si puo eseguire lo script 
`./run-curl-client.sh`

## Terminazione
Per terminare i servizi eseguire lo script 
`stop-containers.sh`
