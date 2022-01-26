package com.osm.APITestingFramework.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testproperties {

	public static void main(String[] args) throws IOException {
		//comments by Tester
		Properties config=new Properties();
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
		 
		config.load(fis);
		System.out.println(config.getProperty("baseURI"));
	}

}
