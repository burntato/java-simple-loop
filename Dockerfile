FROM openjdk:8-jdk-alpine
# since MAINTAINER is deprecated, use LABEL instead
LABEL maintainer="fputra77 <fiandra18@gmail.com>"

RUN mkdir -p /app
WORKDIR /app

COPY loop.java /app

RUN javac loop.java

CMD ["java", "loop"]