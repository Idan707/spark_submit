FROM ubuntu

LABEL maintainer="idanb@iguazio.com"
LABEL org="iguazio.com"

RUN apt update -qqq \
    && apt -y upgrade \
    && apt install -y \
    wget \
    dpkg

RUN wget https://archive.apache.org/dist/spark/spark-2.4.4/spark-2.4.4-bin-hadoop2.7.tgz \
&& tar zxvf spark-2.4.4-bin-hadoop2.7.tgz \
&& apt update -qqq \
&& apt -y upgrade \
&& apt install -y \
openjdk-8-jre-headless

RUN wget https://downloads.lightbend.com/scala/2.11.12/scala-2.11.12.deb \
&& dpkg -i scala-2.11.12.deb
