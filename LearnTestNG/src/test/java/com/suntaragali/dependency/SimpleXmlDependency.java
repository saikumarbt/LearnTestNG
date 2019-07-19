package com.suntaragali.dependency;

import org.testng.annotations.Test;

public class SimpleXmlDependency {

	@Test (groups= {"dependent-group"})
	public void groupTestOne() {
		System.out.println("Group Test Method One");
	}
	
	@Test (groups= {"test-me"})
	public void groupTestTwo() {
		System.out.println("Group Test Method Two");
	}
	
	@Test (groups = {"test-me"})
	public void groupTestThree() {
		System.out.println("Group Test Method Three");
	}
}
