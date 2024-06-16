package requestBody_Payload;

import java.io.FileInputStream;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class JsonFile_2
{
  @Test
  public void createUser(Object contentType) throws Throwable
  {
	//1. Make a Request
	baseURI="https://Reqres.in";                //way1
//	RestAssured.baseURI="https://Reqres.in";    //way2 -baseURI is refer to RestAssured class
	
	//Step 1-create data by using FileInputStream
	FileInputStream fis=new FileInputStream("D:\\epavilion\\ZIS_RestAssured.Api\\src\\test\\resources\\data.json");
    
	// Step2-Send the request and validate
	 given().body(fis)                       //way1
//	 RestAssured.given().body(fis)           //way2   - given() is upon the RestAssured class, so import RestAssured
	.contentType(ContentType.JSON)
	.when()
	.post("/api/users")
	.then().log().all();
  }
}
