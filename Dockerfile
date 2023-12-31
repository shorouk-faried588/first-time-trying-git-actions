FROM openjdk

WORKDIR /application

COPY NewJFrame.java .

RUN javac NewJFrame.java

CMD java NewJFrame.java
