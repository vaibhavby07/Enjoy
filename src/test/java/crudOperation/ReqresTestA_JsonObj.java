package crudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReqresTestA_JsonObj
{
	@Test
	public void createUser()
	{
		//Step1-create necessary data step1
		
		JSONObject jo=new JSONObject();
		jo.put("name","Vaibhav");
		jo.put("job","SoftwareTesting");
		//Send Request and validate the data
		RequestSpecification req=RestAssured.given(); //request specification ---interface
		
		req.body(jo);
		req.contentType(ContentType.JSON); //contentType--multipurpose internet mail extension 
		//used to hit the code post/put
		
		//It support xml,Api,JSON
		Response res=req.post("http://Reqres.in/api/users"); //Response interface
		System.out.println(res.prettyPrint());
	}
	@Test
	public void listUsers_Get()
	{
		Response res=RestAssured.get("https://Reqres.in/api/users?=2");
		System.out.println(res.prettyPrint());
		
	//	res.then().log().all();
		             //or
		String g=res.getBody().asString();
		System.out.println(g);
	}
	@Test
	public void singleUser_get()
	{
		Response res=RestAssured.get("https://Reqres.in/api/users");
		System.out.println(res.prettyPrint());
		
		String ge=res.getBody().asString();
		System.out.println(ge);
	}
	@Test
	public void create()
	{
	//create json body
	JSONObject j=new JSONObject();
	j.put("name","morpheus");
	j.put("job", "leader");
	
	//Send The request
	RequestSpecification request=RestAssured.given();
	request.body(j);
	request.contentType(ContentType.JSON);
	
	//Get the response
	//hit the url
	Response res=request.post("https://Reqres.in/api/users");
	System.out.println(res.prettyPrint());
	res.then().log().all();
	}
	@Test
	public void update()
	{
		//Create json body
		JSONObject j=new JSONObject();
		j.put("name", "morpheus");
		j.put("job","zion resident");
		
		//Send the request and validate the data
		RequestSpecification req=RestAssured.given();  //RequestSpecificatiion 
		req.body(j);
		req.contentType(ContentType.JSON);
		
		//used to hit the code 
		
	}
}
