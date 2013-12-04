developer-test
==============
<br/>
The test requires you to have Java 7, Maven and an Internet connection. 
<br/><br/>
<b>Verify your environment</b><br>
1. Goto project root<br/>
2. Type mvn test<br/>
3. Type mvn jetty:run<br/> 
4. Browse to http://localhost:8080/developer-test/ping using Firefox, the response should be Pong<br/>
( You can also type: curl -i -H "Accept: application/json" -X GET http://localhost:8080/developer-test/ping )<br/><br/>
<b>Assignment</b><br/>
1. Make the code more robust with more error handling, logging, tests etc...<br/>
2. Add a method to the REST api that enables the client to save Heroes.<br/>
3. Replace the in-memory based repository with a file based repository.<br/>
4. Feel free to refactor the code as you see fit as long as you make use of Spring framework and maven.<br/>



