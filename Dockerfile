FROM eclipse-temurin:17
COPY target/mydevapps.jar mydevapps.jar
CMD ["java","-jar","mydevapps.jar"]