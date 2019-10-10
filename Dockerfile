FROM openjdk:8-jre-slim

RUN apt-get update \
  && apt-get -y install gettext-base \
  && apt-get clean \
  && rm -rf /var/lib/apt/lists/*


ADD target/slotex-nlp-web-*.jar /opt/app.jar

COPY docker/docker-application.properties.tmpl /conf/
ADD docker/docker-entrypoint.sh /usr/local/bin

VOLUME /tmp

# http
EXPOSE 8080

ENTRYPOINT ["docker-entrypoint.sh"]
#CMD ["java","-Djava.security.egd=file:/dev/./urandom", "-Djava.net.preferIPv4Stack=true", "-Djboss.server.config.dir=/conf", "-XX:+UnlockExperimentalVMOptions","-XX:+UseCGroupMemoryLimitForHeap","-XX:+ExitOnOutOfMemoryError",i "-XX:+CrashOnOutOfMemoryError", "-XX:MinHeapFreeRatio=20", "-XX:MaxHeapFreeRatio=40", "-XX:GCTimeRatio=4", "-XX:AdaptiveSizePolicyWeight=90", "-jar", "/opt/app.jar", "--spring.config.location=file:/conf/application.properties"]

