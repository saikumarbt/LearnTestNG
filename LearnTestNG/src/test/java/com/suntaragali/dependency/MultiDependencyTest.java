package com.suntaragali.dependency;

import org.testng.annotations.Test;

public class MultiDependencyTest {

	@Test (dependsOnMethods= {"testTwo", "testThree"})
	public void testOne() {
		System.out.println("Test Method One");
	}
	
	@Test 
	public void testTwo() {
		System.out.println("Test Method Two");
	}
	
	@Test
	public void testThree() {
		System.out.println("Test Method Three");
	}
}
