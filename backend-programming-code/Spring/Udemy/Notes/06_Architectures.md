# ARQUITECTURA DE MICROSERVICIOS

01. Instalar IntelliJ IDEA Community Edition
02. Crear un proyecto Maven
03. Añadir <packaging>pom</packaging> al pom.xml
04. Crear el microservicio con Spring Boot en https://start.spring.io/
05. Añadir spring.application.name=nombre-del-microservicio al application.properties
06. Añadir al pom.xml del proyecto Maven <modules><module>nombre-del-microservicio</module></modules>
07. Intercambiar las dependencias <parent></parent> de los microservicios con el proyecto Maven

# ARQUITECTURA HEXAGONAL
08. Crear el domain/modelo/clase
09. Crear los ports/in/interfaces
10. Crear los ports/out/interfaces
11. Crear la application/service
