package crudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser_Post1
{
	@Test
	public void store()
	{
		JSONObject j=new JSONObject();
		j.put("id", 0);
		j.put("petId", 0);
		j.put("quantity", 0);
		j.put("shipDate", "2024-01-17T11:17:17.969Z");
		j.put("status", "placed");
		j.put("complete", true);
		
		//Send The Request
		  RequestSpecification request=RestAssured.given();
		  request.body(j);
		  request.contentType(ContentType.JSON);
		  Response res=request.post("https://petstore.swagger.io/v2/store/order");
		  
	      System.out.println(res.asPrettyString()); //Way1  -prettyString and PrettyPrint both are same
	       //OR
	      System.out.println(res.prettyPrint());    //way2
	      
	 /*   String z=res.getBody().asString();        //Way1-To display Particular selective response 
		  System.out.println(z);
		  	
		  int ref=res.getStatusCode();
		  System.out.println("StatusCode"+ref);
		   
		  long ref1=res.getTime();
		  System.out.println("ResponseTime"+ref1);
      */   //OR
		  res.then().log().all();                    //Way2- To display whole response  
	
	}
}
