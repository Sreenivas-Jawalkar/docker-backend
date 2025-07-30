FROM maven:3.9-eclipse-temurin-21
WORKDIR /app
COPY . .
CMD ["mvn", "spring-boot:run"]


# FROM maven:3.9.6-eclipse-temurin-21 AS build
# WORKDIR /home/app
# COPY . /home/app
# RUN mvn -f /home/app/pom.xml clean package
# FROM openjdk:21-jdk-slim
# EXPOSE 5000
# COPY --from=build /home/app/target/*.jar /app.jar
# ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]

#FROM maven:3.9.6-eclipse-temurin-21 AS build
#WORKDIR /home/app
#COPY . /home/app
#RUN mvn -f /home/app/pom.xml clean package
#
#FROM eclipse-temurin:21-jdk-alpine
#COPY --from=build /home/app/target/*.jar /app.jar
#ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]

