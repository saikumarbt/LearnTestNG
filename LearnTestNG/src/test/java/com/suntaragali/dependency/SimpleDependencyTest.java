package com.suntaragali.dependency;

import org.testng.annotations.Test;

public class SimpleDependencyTest {
	
	@Test (dependsOnMethods = {"testTwo"})
	public void testOne() {
		System.out.println("Test Method One");
	}
	
	@Test 
	public void testTwo() {
		System.out.println("Test Method Two");
	}
}
