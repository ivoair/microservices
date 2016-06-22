# MicroServices
Pequeña PoC en la que integrar las diferentes herramientas que conforman una arquitectura de MicroServicios
- Zuul proxy: 6001
- Servidor Eureka: 6100
- Spring Cloud Config: 6200
- Spring Boot Admin: 6300
- Servidor Tubine: 6400
- Servidor Zipkin: 6500

Además se han creado dos microservicios simples que realizan una llamada entre ellos para validar el comportamiento de Feign.
- Microservice1: 6601
- Microservice2: 6602
