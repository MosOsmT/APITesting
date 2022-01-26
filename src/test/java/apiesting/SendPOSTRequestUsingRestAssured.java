package apiesting;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
 

public class SendPOSTRequestUsingRestAssured {
	
	/*
	public static void main(String[] args) {


		Response response = given().auth().basic("sk_test_51KEz4hSEAZltzIg0Bl6Gp7hQJmUl5k58VbGMlwn38NFtDtTrQ0v17P9CRrXet2b1CdQbOE3KqG3dav46q3Mr9d7z00BfEIlzuc", "")
		.formParam("name", "TesP Sam").formParam("email", "testosam@email.com")
		.formParam("description", "This is new POST request from Rest Assured API").post("https://api.stripe.com/v1/customers");

		response.prettyPrint();
		
	}*/
	
	

	public static void main(String[] args) {
		
		//String bodyString = "{\"email\":\"eve.holt@reqres.in\",\"password\":\"pistol\"}";
		
		HashMap<String, String> map= new HashMap<String, String>();
		
		map.put("email", "eve.holt@reqres.in");
		map.put("password", "pistol");
		
		Response response =given().contentType(ContentType.JSON).body(map).post("https://reqres.in/api/register");
		
		response.prettyPrint();
	}

}
