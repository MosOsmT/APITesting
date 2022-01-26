package com.osm.APITestingFramework.utilities;

import org.json.JSONObject;

import com.osm.APITestingFramework.listeners.ExtentListeners;

public class TestUtils {
	
	
	public static boolean jsonHaskey(String json, String key) {
		
		JSONObject jsonObject=new JSONObject(json);
		ExtentListeners.testReport.get().info("Validating the prresence of key:"+key);
		
		return jsonObject.has(key);	
		
		
	}
	
	public static String getJsonKeyValue(String json, String key) {
		
		JSONObject jsonObject=new JSONObject(json);
		ExtentListeners.testReport.get().info("Validating the value of key:"+key);
		
		return jsonObject.get(key).toString();
		
		
		
	}

}
