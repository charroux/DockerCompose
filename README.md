# PHP presentation => Spring boot Rest Wes Service => Redis database

Build the Rest Web Service and generate an executable jar file:

```
cd RestWebService

gradlew build       (or ./gradlew build on Linux)

cd ..

docker-compose up --build

--build is used to upadate Docker images each time docker-compose is used.
```

The PHP presentation layer: https://github.com/charroux/DockerCompose/blob/master/presentation/index.php

Hostname rest-web-service and port 8080 are defined into the docker compose file: https://github.com/charroux/DockerCompose/blob/master/docker-compose.yml

The Spring Rest Web Service: https://github.com/charroux/DockerCompose/blob/master/RestWebService/src/main/java/com/example/RestWebService/RestWebService.java

It uses Spring Data Redis: https://spring.io/projects/spring-data-redis

The connection to Redis (https://github.com/charroux/DockerCompose/blob/master/RestWebService/src/main/java/com/example/RestWebService/RestWebServiceApplication.java) 
used a property file: https://github.com/charroux/DockerCompose/blob/master/RestWebService/src/main/resources/application.properties

The hostname redis and port 6379 are defined into the docker compose file: https://github.com/charroux/DockerCompose/blob/master/docker-compose.yml


