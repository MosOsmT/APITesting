package com.osm.APITestingFramework.Testcases;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.osm.APITestingFramework.APIs.CreateCustomerAPI;
import com.osm.APITestingFramework.listeners.ExtentListeners;
import com.osm.APITestingFramework.setUp.BaseTest;
import com.osm.APITestingFramework.utilities.DataUtil;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Hashtable;


public class CreateCustomerTest extends BaseTest{
	
	@Test(dataProviderClass =DataUtil.class, dataProvider= "data")
	public void validateCreateCustomerAPIWithValidSecretKey(Hashtable<String, String> data) {
		
		 
		
		Response response = CreateCustomerAPI.sendPostRequestToCreateCustomerAPIWithValidAuthKey(data);
		ExtentListeners.testReport.get().info(data.toString());

				 response.prettyPrint();
		
		System.out.println(response.statusCode());
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	@Test(dataProviderClass =DataUtil.class, dataProvider= "data")
	public void validateCreateCustomerAPIWithInValidSecretKey(Hashtable<String, String> data) {
		
		Response response = CreateCustomerAPI.sendPostRequestToCreateCustomerAPIWithInValidAuthKey(data);

				response.prettyPrint();
		
		System.out.println(response.statusCode());
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	
	

}
