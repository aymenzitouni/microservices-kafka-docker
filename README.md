# microservices-kafka-docker
an example of two simple microservices built with springboot to demonstrate asynchronous communication 
between microservices with kafka, finally containerizing all the tools ( microservices , kafka broker ... ) and running it 
using docker compose.

### Prerequisites :
In order to launch this project you should be having the following software, tool & packages installed in  your machine :
* docker
* docker-compose
* spring-boot ( optional ).

### Steps :
In order to launch this project , follow with me the next steps :

#### 1 -- Clone the main repo :
```sh
  git clone https://github.com/aymenzitouni/microservices-kafka-docker
  ```
  
#### 2 -- Navigate to the repo directory :
```sh
  cd microservices-kafka-docker
  ```
  
#### 3 -- Built the ms-producer image :
```sh
  docker build -t kafka-ms-producer ./producer
  ```
#### 4 -- Built the ms-consumer image :
```sh
  docker build -t kafka-ms-consumer ./consumer
  ```
  
#### 5 -- Run the project :
```sh
  docker-compose up
  ```
