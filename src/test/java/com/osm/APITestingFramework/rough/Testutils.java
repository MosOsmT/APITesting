package com.osm.APITestingFramework.rough;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.osm.APITestingFramework.setUp.BaseTest;

public class Testutils extends BaseTest{
		
		
		@DataProvider(name="data")
	    public Object[][] getData(Method m){
			
			
			
			String SheetName=m.getName();
			
			System.out.println("SheetName="+m.getName());
			
			int rows =excel.getRowCount(SheetName);
			int cols =excel.getColumnCount(SheetName);
			
			System.out.println("Row count"+rows +"Column count"+cols);
			
			Object[][] data = new Object[rows-1][cols];
			
			data[0][0]="Master champ";
			data[0][1]="master@email.com";
			data[0][2]="Added first test data";
			
			for(int rowNum=2;rowNum<=rows;rowNum++) {
				
				for(int colNum=0;colNum<cols;colNum++) {
					
					data[rowNum-2][colNum] = excel.getCellData(SheetName, colNum, rowNum);
				}
				
			}
			
			
			return data;
		}

	}


