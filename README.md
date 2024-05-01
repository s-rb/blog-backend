# Backend application for a blog

## Technologies:
- Java 21,
- Springboot 3 (Web, Data-JPA)
- Postgres 14
- Docker, compose
- Gradle
- Lombok

Variables are set using .env files through docker-compose.
In docker-compose, this is handled by the env_file or environment section.
Docker-compose-test also starts its own database, an external database is provided for production and this container is missing.
To use in testing, you need to:
- set variables in the .env.test file
- start with the command ```docker-compose -f docker-compose-test.yml up -d --force-recreate --build```
- check in the browser by calling the helloController - GET request at the address ```http://localhost:8081/hello or http://localhost:8081/hello?name=myname```
- stop with the command ```docker-compose -f docker-compose-test.yml down```
If you want to use docker-compose-prod without db container - you can execute
```docker-compose -f docker-compose-prod.yml up -d --force-recreate --build```

## .env properties:
- SERVER_HOST=localhost
- SERVER_PORT=8081
- DB_HOST=blog-db
- DB_PORT=5432
- DB_NAME=blog
- DB_USER=postgres
- DB_PASSWORD=postgres
- DB_OPTIONS=