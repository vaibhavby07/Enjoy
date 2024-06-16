package crudOperation;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class CreateUser_Patch
{
	public static void main(String[] args)
	{
	  //JSONObject(Request body)
		JSONObject jo=new JSONObject();
		jo.put("name","Jitu");
		jo.put("job","DevopsEngg");
		
		//Send The request
		RequestSpecification request=RestAssured.given();
		request.body(jo);
		request.contentType(ContentType.JSON);
		
		Response res=request.patch("https://reqres.in/api/users/2");      //Patch() & extends Base url-/api/users/2
		System.out.println(res.prettyPrint());	
	}
}
