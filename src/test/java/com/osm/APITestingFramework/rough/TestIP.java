package com.osm.APITestingFramework.rough;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIP {

	public static void main(String[] args) throws UnknownHostException{
		 
		
		System.out.println(InetAddress.getLocalHost().getHostAddress());
		
		try {
			System.out.println(InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			 
			e.printStackTrace();
		}
		

	}

}
