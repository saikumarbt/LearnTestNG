package com.suntaragali.parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	/** 
	 * Following method takes one parameter as input. Value of the
	 * said parameter is defined at suite level.
	 */
	@Parameters({"suite-param"})
	@Test
	public void parameterTestOne(String param) {
		System.out.println("Test one suit param is: " + param);
	}
	
	/**
	 * Following method takes one parameter as input. Values of the 
	 * said parameter is defined at test level.
	 */
	@Parameters({"test-two-param"})
	@Test
	public void parameterTestTwo(String param) {
		System.out.println("Test Two Param is :" + param);
	}

	/**
	 * Following method takes two parameters as input. Value of the
	 * test parameter is defined at test level. The suite level
	 * parameter is overridden at the test level.
	 */
	@Parameters ({"suite-param", "test-three-param"})
	@Test
	public void parameterTestThree(String param, String paramTwo) {
		System.out.println("Test Three suite param is :" +param);
		System.out.println("Test three param is : " + paramTwo);
	}
}
