# Projeto

Estudo de caso para micro serviço em java

# Objetivos

- A aplicação é auto contida. (Embedded Jetty)
- Não utilizar frame works (Spring, Quarkus)
- Não usar CDI
- JAX-RS 2.0 **(Jakarta namespace)**
- JWT para autenticação
- Rodar em containers (Docker)
- Usar QueryDSL

#  Como rodar
```docker run --name postgres -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres```
```mvn package -DskipTests```
```java -jar target/webapp-uber.jar```
