package com.suntaragali.classes;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SimpleTest {
	
	@Test
	public void simpleTest() {
		System.out.println("Simple Test Method");
	}
	
/*	public class SimpleTestFactory
	{
	    @Factory
	    public Object[] factoryMethod() {
	        return new Object[] { new SimpleTest(), new SimpleTest() };
	    }
	}
*/}
