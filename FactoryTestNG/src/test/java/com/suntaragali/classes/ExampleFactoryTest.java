package com.suntaragali.classes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExampleFactoryTest {

	private String param = "";
	
	public ExampleFactoryTest (String param) {
		this.param = param;
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Executed");
	}
	
	@Test
	public void testMethod() {
		System.out.println("The parameter value is :"+param);
	}
}
