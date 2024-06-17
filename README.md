
Here's a very simple project that demonstrates how to load application properties stored in Hashicorp Vault to a SpringBoot application on boottime. The application also works on it's own, without having to connect to Vault.

Requirements:
- Java (at minimum, Version 17)
- Docker Desktop


To see the application working without Hashicorp Vault, just run this command in the project directory.
```
# By default, this will be available on localhost:8080
./mvnw spring-boot:run
```
Naviagte to localhost:8080 and you'll see this in the browser: 

#
### Hello World from SpringBoot and Vault!
#### Message from application.yml
#### Default secret message from application.yml
#

Now, to leverage Vault to override the default secret message, open up a new tab in the project directory and run: 

```
docker compose up
```
Switch back to the first tab and restart the SpringBoot application: 
```
# (ctrl+c first)
./mvnw spring-boot:run
```
Refresh localhost:8080 and you'll see this in the browser: 

#
### Hello World from SpringBoot and Vault!
#### Message from application.yml
#### This is a secret message stored in Vault!
#

