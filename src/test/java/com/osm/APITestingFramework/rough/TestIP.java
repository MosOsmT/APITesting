package com.osm.APITestingFramework.rough;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIP {

	public static void main(String[] args){
		 
		
		 
		
		try {
			System.out.println(InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			 
			e.printStackTrace();
		}
		

	}

}
