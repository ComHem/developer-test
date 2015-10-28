developer-test
==============
<p>
The test requires you to have Java 7, Maven and an Internet connection.
<p>
<br/>
<b>Verify </b><br/>

1. Goto project root<br/>
2. Type mvn install<br/>
3. Type mvn jetty:run<br/> 
4. Browse to http://localhost:8080/developer-test/ping using Firefox, the response should be Pong<br/>
( You can also type: curl -i -H "Accept: application/json" -X GET http://localhost:8080/developer-test/ping )<br/><br/>

<b>Assignment</b><br/>

1. Make it possible for clients to save Heroes through the REST API.<br/>
2. Replace the in-memory based repository with a file based repository.<br/>
3. Make the code more robust with error handling, tests etc...<br/>
4. Feel free to refactor the code as you like to have it, as long as you still uses Spring framework and maven.<br/>
5. Create a zip file of your project and send it to your contact person.



