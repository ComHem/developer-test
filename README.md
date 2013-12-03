developer-test
==============

The test requires you to have Java 7, Maven and an Internet connection. 

How to verify that the webapp is working:
1. Goto project root
2. Type mvn test
3. Type mvn jetty:run 
4. Browse to http://localhost:8080/developer-test/ping, the response should be Pong
