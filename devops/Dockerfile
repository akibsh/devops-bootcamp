FROM tomcat:8.0.51-jre8-alpine

RUN rm -rf /usr/local/tomcat/webapps/*

COPY ./target/devops.war /usr/local/tomcat/webapps/devops.war

CMD ["catalina.sh","run"]
