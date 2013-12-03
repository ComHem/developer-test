developer-test
==============
<br>
The test requires you to have Java 7, Maven and an Internet connection. 
<br><br>
How to verify that the webapp is working:<br>
1. Goto project root<br>
2. Type mvn test<br>
3. Type mvn jetty:run<br> 
4. Browse to http://localhost:8080/developer-test/ping, the response should be Pong<br>
( You can also type: curl -i -H "Accept: application/json" -X GET http://localhost:8080/developer-test/ping )

