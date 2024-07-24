FROM eclipse-temurin:17
COPY target/mydevapps.jar devapps.jar
CMD ["java","-jar","devapps.jar"]