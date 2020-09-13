FROM openjdk:14-alpine
COPY build/libs/mn-intellij-inheritance-annotations-*-all.jar mn-intellij-inheritance-annotations.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "mn-intellij-inheritance-annotations.jar"]
