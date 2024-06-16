package crudOperation;

import java.io.FileInputStream;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Swagger_PetStore
{
  @Test
  public void store() throws Throwable
  {
	  RestAssured.baseURI="https://petstore.swagger.io/v2";
		//Step 1-create data
	  FileInputStream fis=new FileInputStream("D:\\epavilion\\RestAssured\\src\\test\\resources\\data2.json");
	 
	   //Step2-Send the request and validate
	     given().body(fis)
		.contentType(ContentType.JSON)
		.when()
		.post("/store/order")
		.then().log().all();
  }
  @Test
  public void  get()
  {
   Response res=RestAssured.get("https://petstore.swagger.io/v2/store/order/{orderId}");
   System.out.println(res.asPrettyString());
   
    String z=res.getBody().asString();
	System.out.println(z);  
  }
  @Test
  public void delete()
  {
	  RestAssured.delete("https://petstore.swagger.io/v2/store/order/{orderId}");
      
  }

}
