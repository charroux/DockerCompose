FROM java:8
VOLUME /tmp
ADD build/libs/correction-spring-redis-docker.jar correction-spring-redis-docker.jar
RUN bash -c 'touch /correction-spring-redis-docker.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/correction-spring-redis-docker.jar"]
