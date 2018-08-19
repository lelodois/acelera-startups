From centos

Run yum install -y java

VOLUME /tmp
ADD /target/acelera-startups-1.0.0.jar acelera-startups.jar
RUN sh -c 'touch /acelera-startups.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/;/urandom","-jar","/acelera-startups.jar"]
