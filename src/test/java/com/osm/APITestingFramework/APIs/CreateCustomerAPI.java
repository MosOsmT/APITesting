package com.osm.APITestingFramework.APIs;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import com.osm.APITestingFramework.setUp.BaseTest;

import io.restassured.response.Response;

public class CreateCustomerAPI extends BaseTest {
	
	
	//Create customer API
	
	public static Response sendPostRequestToCreateCustomerAPIWithValidAuthKey(Hashtable<String, String> data) {
		Response response = given().auth().basic(config.getProperty("validSecretKey"), "")
				.formParam("name", data.get("name")).formParam("email", data.get("email"))
				.formParam("description",data.get("description")).post(config.getProperty("customerAPIEndPoint"));
		
		return response;
	}
	public static Response sendPostRequestToCreateCustomerAPIWithInValidAuthKey(Hashtable<String, String> data) {
		
		Response response = given().auth().basic(config.getProperty("inValidSecretKey"), "")
				.formParam("name", data.get("name")).formParam("email", data.get("email"))
				.formParam("description",data.get("description")).post(config.getProperty("customerAPIEndPoint"));
		return response;
	}

}
