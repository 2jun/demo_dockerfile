FROM io/adoptopenjdk/openjdk8:latest
RUN mkdir /opt/apps
COPY ./target/*.jar /opt/apps/app.jar
EXPOSE 8080
CMD ["java", "-jar", "/opt/apps/app.jar"]