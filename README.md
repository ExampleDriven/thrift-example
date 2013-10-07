thrift-example
==============

This is the source code of the blog post

http://exampledriven.wordpress.com/2013/09/26/apache-thrift-java-example/


This is an example project that demonstrates how to build a Thrift server and client in Java.

The project can be build in the following ways :

+ In the root directory

```
mvn install
```

will build all modules, and run all integration and unit tests

+ In the web-server directory

```
mvn install
```
will start up a jetty server, run the integration tests then shut down the server
```
mvn jetty:run
```
will start up the web server at http://localhost:8080/


+ In the java-se-server directory

```
mvn install exec:java
```
will start up the server at port 9090

+ In the client/src/main/resources/ directory 

```
./generate.sh
```
will generate the java classes from the user_v2.thrift file

+ In the client directory

```
mvn install
```
will build the java client and package as a jar file
