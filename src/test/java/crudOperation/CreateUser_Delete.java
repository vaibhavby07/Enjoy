package crudOperation;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser_Delete
{
	public static void main(String[] args)
	{
	//our intensity test case is delete
/*		
	//Step1- create json body
	JSONObject j=new JSONObject();
	
	//Hit the url
	RequestSpecification req=RestAssured.given(); //requestSpecification interface
	//now use url
	req.body(j);
	req.contentType(ContentType.JSON);
	*/
	Response res=RestAssured.delete("https://Reqres.in/api/users/2");
	System.out.println(res.prettyPeek());	
	
	
	// Step2-Send the request and validate
		 given()
		.delete("/api/users/2")
		.then().log().all();
	
	}
}
