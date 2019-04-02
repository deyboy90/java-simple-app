FROM java:8
WORKDIR	/
ADD target/simple-app-0.0.1-SNAPSHOT-spring-boot.jar simple-app.jar
