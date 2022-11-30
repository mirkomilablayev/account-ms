#this is get from docker hub if it is not exsists local
FROM openjdk:17 as build
# mention who maintains this image
MAINTAINER mirkomil.com
#add app's jar to the container
COPY target/*.jar /opt/app.jar
#execute the application
ENTRYPOINT ["java", "-jar", "/opt/app.jar"]
