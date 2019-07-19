package com.suntaragali.dataprovider;

import org.testng.annotations.Test;

public class DataProviderClassTest {
	
	@Test (dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
	public void testMethod(String data) {
		System.out.println("Data is : " + data);
	}

}
