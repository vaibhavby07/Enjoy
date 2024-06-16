package crudOperation;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser_Put
{
	public static void main(String[] args)
	{
	//json object(Request body)
		
		JSONObject jo=new JSONObject();
		jo.put("name","Jitu");
		jo.put("job","SAP Consulatant");
		
		//Send The request
		RequestSpecification request=RestAssured.given();
		request.body(jo);
		request.contentType(ContentType.JSON);
		
		Response res=request.put("https://reqres.in/api/users/2");      //Put() & extends Base url-/api/users/2
		System.out.println(res.prettyPrint());
	}
}
