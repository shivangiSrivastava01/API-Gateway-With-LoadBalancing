# API-Gateway-With-LoadBalancing
Demo Project for API Gateway with Load Balancing

## Add dependency in pom.xml file

## Spring Cloud Gateway and Load Balancer
```
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-gateway</artifactId>
</dependency>
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-starter-loadbalancer</artifactId>
</dependency>

```
## application.yml file
```
spring:
  cloud:
    gateway:
        routes:
        - id: serviceA
          uri: lb://v1/callServiceA
          predicates:
            - Path=/v1/**
          filters:
            - AddResponseHeader=X-Powered-By, API Gateway ServiceA
        - id: serviceB
          uri: lb://v1/callServiceB
          predicates:
            - Path=/v1/**
          filters:
            - AddResponseHeader=X-Powered-By, API Gateway ServiceB
  main:
    web-application-type: reactive
  loadbalancer:
    retry:
      enabled: true

```

