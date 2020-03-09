FROM openjdk:15-slim
COPY Sleep.java /usr/src/sleep/Sleep.java
WORKDIR /usr/src/sleep
RUN javac Sleep.java
ENTRYPOINT ["java"]
CMD ["Sleep", "10000"]
