package requestBody_Payload;
import org.testng.annotations.Test;
//import static io.restassured.RestAssured.*; //way-1 To given(),Add static & .* //way-2 add RestAssured Class
import io.restassured.RestAssured;            //To RestAssured Class for getting baseURI
import io.restassured.http.ContentType;

public class PoJoClass3_Sub
{
//	String name;            //declaration is not necessary in pojo in subClass
//	String job;
//  String id;
  @Test
  public void test()
  {
	  RestAssured.baseURI="https://Reqres.in";
	  //baseUri="https://Reqres.in";
	  
	  //Call pojo class
	   PojoClass3_Super lu=new PojoClass3_Super("vaibhav","SoftwareTester","07");
	  RestAssured.given().body(lu).contentType(ContentType.JSON)                 //given()
	  .when().post("/api/users").then().log().all();
  }
}
