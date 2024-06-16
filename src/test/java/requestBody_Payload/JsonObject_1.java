package requestBody_Payload;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
//import static io.restassured.RestAssured.*;

public class JsonObject_1
{
  @Test
  public void object()
  {
	  //request the uri
//    baseURI="https://reqres.in";                //way-1
      RestAssured.baseURI="https://reqres.in";    //way-2
	  
//	  Response res=RestAssured.get("https://reqres.in");  //Get()- Sending request without body
//	  System.out.println(res.prettyPeek());	
	  
	  //create json body to object creation
	  JSONObject jo=new JSONObject();
	  jo.put("name","vaibhav");
	  jo.put("job","testing");
	  
	  //send the request and validate the response
	  RestAssured.given().body(jo)                           //way1- given().body(jo)-->import static io.restassured.RestAssured.*;
	  .contentType(ContentType.JSON)                         //way2- RestAssured.given().body(jo)
	  .when().post("/api/users")
	  .then().log().all();
  }
}
