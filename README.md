# product-service
Product Service Microservice With Spring Boot

# Run Spring Boot Microservice
prafulla.pol@ppol-2214 MINGW64 /c/learn/Microservices/product-service (master)
$ ./mvnw spring-boot:run

#Mongo DB
prafulla.pol@ppol-2214 MINGW64 /c/learn/Microservices/product-service
$ docker-compose up
Creating network "product-service_default" with the default driver
Creating volume "product-service_mongodb_data_container" with default driver
Pulling mongodb_container (mongo:latest)...
latest: Pulling from library/mongo
Digest: sha256:aea63042abdf9a81319d6e9ffc6a381a6af53ae81a849c59d6269c3f233028a3
Status: Downloaded newer image for mongo:latest
Creating product-service_mongodb_container_1 ... done
Attaching to product-service_mongodb_container_1
mongodb_container_1  | about to fork child process, waiting until server is ready for connections.

prafulla.pol@ppol-2214 MINGW64 /c/learn/Microservices/product-service
$ docker ps
CONTAINER ID        IMAGE               COMMAND                  CREATED             STATUS              PORTS                      NAMES
7ae4bcff3209        mongo:latest        "docker-entrypoint.s…"   51 seconds ago      Up 49 seconds       0.0.0.0:27017->27017/tcp   product-service_mongodb_container_1


