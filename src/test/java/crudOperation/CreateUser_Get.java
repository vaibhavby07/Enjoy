package crudOperation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateUser_Get     //Get()- Sending request without body
{
	public static void main(String[] args)
	{	
		Response res=RestAssured.get("https://Reqres.in/api/users/2");  
	    System.out.println(res.prettyPeek());	//way-1 Getting response body 
		
//	    res.then().log().all();                 //way-2 To display whole response
		
//		String z=res.getBody().asString();      //way-3 To get response in string format
//		System.out.println(z);
	}
}
