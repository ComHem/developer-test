developer-test
==============
## Assignment

1. Make it possible to add new Heroes through a RESTful API.
2. Replace the In-memory-based repository with a file-based repository(in textual data format like Json or XML, not a SQL database).
3. Make the code thread-safe and robust. For example with error handling etc.
4. Write tests that proves that your code works as expected.

### Other
- Your are free to refactor the code as much as you like, as long as you use Spring Framework and Maven.
- Please comment solutions that you feel needs to be more explained. For example; why you solved it in this way, or how it could be solved in a better way.

### ... and finally 
Create a zip file of your project and send it to us. 

## Setup
**Prerequisites**: Java 7+, Maven and an Internet connection.

#### Run and verify
1. Go to the project root
2. Type `mvn install`
3. Type `mvn jetty:run`
4. Browse to http://localhost:8080/developer-test/ping using a browser. The response text should be 'Pong'
(You can also type: `curl -i -H "Accept: application/json" -X GET http://localhost:8080/developer-test/ping`)





