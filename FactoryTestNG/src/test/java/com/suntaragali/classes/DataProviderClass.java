package com.suntaragali.classes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class executed");
	}
	
	@Test(dataProvider = "dataMethod")
	public void testMethod(String param) {
		System.out.println("Hello! " + param);
	}
	
	@DataProvider
	public Object[]	[] dataMethod(){
		return new Object[][] {
			{"Sai Kumar"},
			{"Suntaragali"}
		};
	}
	
}
