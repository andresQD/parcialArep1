[![CircleCI](https://circleci.com/gh/andresQD/Taller_Heroku.svg?style=svg)](https://circleci.com/gh/andresQD/parcialArep1)

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://arepparc1.herokuapp.com/)

## Requisitos
* Git
* Java 8
* Maven

## Instalación
1. Abrimos una terminal
2. Clonamos el repositorio
```
https://github.com/andresQD/parcialArep1
```
3. Entramos al directorio
```
cd ParcialArep
```
4. Empaquetamos
```
mvn package
```
## Probando cliente
Para probar el cliente de java use:
```
java -cp target/ParcialArep-1.0-SNAPSHOT.jar edu.eci.arep.parcialarep.client.Jclient
```
