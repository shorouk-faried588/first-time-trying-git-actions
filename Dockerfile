FROM openjdk

WORKDIR /application

COPY Programin3_Project.java .

RUN javac Programin3_Project.java 

CMD java Programin3_Project
