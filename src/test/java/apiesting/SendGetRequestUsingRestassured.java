package apiesting;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
/*import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;*/

public class SendGetRequestUsingRestassured {
	
	
	public static void main(String[] args) {
			
			
	  /* Response response= given().auth().basic("sk_test_51KEz4hSEAZltzIg0Bl6Gp7hQJmUl5k58VbGMlwn38NFtDtTrQ0v17P9CRrXet2b1CdQbOE3KqG3dav46q3Mr9d7z00BfEIlzuc","").formParams("limit",6).formParams("email","mar@email.com")
			   .get("https://api.stripe.com/v1/customers");*/
	   
		Response response= given().auth().basic("sk_test_51KEz4hSEAZltzIg0Bl6Gp7hQJmUl5k58VbGMlwn38NFtDtTrQ0v17P9CRrXet2b1CdQbOE3KqG3dav46q3Mr9d7z00BfEIlzuc","").formParams("limit",6)
				   .get("https://api.stripe.com/v1/customers");
	 
		
	   //response.prettyPrint();
	   
	  String jsonResponse =response.asString();
	  
	  System.out.println(jsonResponse);
	  System.out.println("Response code -->"+response.statusCode());
	   
 
		}
	
	/*public static void main(String[] args) {
		
		Response response = given().header("Authorization", "Bearer sk_test_51KEz4hSEAZltzIg0Bl6Gp7hQJmUl5k58VbGMlwn38NFtDtTrQ0v17P9CRrXet2b1CdQbOE3KqG3dav46q3Mr9d7z00BfEIlzuc")
				.get("https://api.stripe.com/v1/customers/cus_KvWo8OvdPIb7R0");
	
		response.prettyPrint();
	
	}*/

}
