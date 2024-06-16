package POJoRunning;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
//import pojo.UserLibrary;

import static io.restassured.RestAssured.*;
public class PoJoClass
{
  @Test
  public void test()
  {
	  baseURI="https://Reqres.in";
	  //Call pojo class
	 // UserLibrary lu=new UserLibrary("vaibhav","SoftwareTester");
	  //given().body(lu).
	 // contentType(ContentType.JSON).when().post("/api/users").then().log().all();
  }
}
