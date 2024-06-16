package crudOperation;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser_Post
{
	public static void main(String[] args)          
	{
		//json object(Request body)
		
		JSONObject jo=new JSONObject();
		jo.put("name","Vaibhav");
		jo.put("job","SoftwareTesting");
		
		//Send The request
		RequestSpecification request=RestAssured.given();
		request.body(jo);
		request.contentType(ContentType.JSON);
		
		Response res=request.post("https://reqres.in/api/users");    //Post() Base url and endPoints-/api/users
		System.out.println(res.prettyPrint());  //or asPrettyString()
		
		res.then().log().all();
	}
}
