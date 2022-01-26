package com.osm.APITestingFramework.Testcases;

import java.util.Hashtable;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.osm.APITestingFramework.APIs.DeleteCustomerAPI;
import com.osm.APITestingFramework.listeners.ExtentListeners;
import com.osm.APITestingFramework.setUp.BaseTest;
import com.osm.APITestingFramework.utilities.DataUtil;
import com.osm.APITestingFramework.utilities.TestUtils;

import io.restassured.response.Response;

public class DeleteCustomerTest extends BaseTest{
	
	@Test(dataProviderClass =DataUtil.class, dataProvider= "data")
	public void deleteCustomer(Hashtable<String, String> data) {
		
		 
		
		Response response = DeleteCustomerAPI.sendDeleteRequestToDeleteCustomerAPIWithValidID(data);
		ExtentListeners.testReport.get().info(data.toString());

		response.prettyPrint();
		
		System.out.println(response.statusCode());
		
		/*String actual_id=response.jsonPath().get("id").toString();
		
		System.out.println("Gettng id from json path:"+actual_id);
		 	
		Assert.assertEquals(actual_id, data.get("id"),"ID not matched");
		*/
		
		
		/*
		JSONObject jsonObject=new JSONObject(response.asString());
		System.out.println(jsonObject.has("id"));
		Assert.assertTrue(jsonObject.has("id"), "Id key is not present in the Json response");
		
			*/
		
		System.out.println("Presence check for Object key:"+TestUtils.jsonHaskey(response.asString(),"object"));
		System.out.println("Presence check for Deleted key:"+TestUtils.jsonHaskey(response.asString(),"deleted"));
		
		Assert.assertTrue(TestUtils.jsonHaskey(response.asString(),"id"));
		
		
		String actual_id=TestUtils.getJsonKeyValue(response.asString(), "id");
		System.out.println(actual_id);
		Assert.assertEquals(actual_id, data.get("id"),"Id key is not present in the Json response");
		
		System.out.println("Object key value is :"+TestUtils.getJsonKeyValue(response.asString(), "object"));
		System.out.println("Deleted key value is :"+TestUtils.getJsonKeyValue(response.asString(), "deleted"));
		
		//Assert.assertEquals(response.statusCode(), 200);
	}
	
	
	
	
	

}
