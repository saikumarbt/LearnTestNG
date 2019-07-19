package com.suntaragali.dependency;

import org.testng.annotations.Test;

public class InheritedDependencyTest extends SimpleDependencyTest {

	@Test (dependsOnMethods= {"testOne"})
	public void testThree() {
		System.out.println("Test Three Method in Inherited Test");
	}
	
	@Test
	public void testFour() {
		System.out.println("Test Four Method in Inherited Test");
	}
}
