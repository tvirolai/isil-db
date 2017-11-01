FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/isil-db.jar /isil-db/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/isil-db/app.jar"]
