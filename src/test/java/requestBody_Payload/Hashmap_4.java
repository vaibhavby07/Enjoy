package requestBody_Payload;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_4
{
@Test
public void createUser()
{
   // baseURI="https://Reqres.in";    //import -RestAssured.baseUri or import declare globaly by using "static" and ".* "
	RestAssured.baseURI="https://Reqres.in";
	//create data
	Map<String,Object> map=new HashMap();
    
	map.put("name","vaibhav");
	map.put("job","tester");
	
	//send the request and validate the data
	given().body(map).contentType(ContentType.JSON)
	.when().post("/api/users").then().assertThat().statusCode(201)
	.log().all();
  }
}
