package com.suntaragali.dependency;

import org.testng.annotations.Test;

public class MultiGrpXmlDependency {

	@Test(groups= {"dependent-group"})
	public void groupTestOne() {
		System.out.println("Group Test Method One");
	}
	
	@Test(groups= {"test-group-one"})
	public void groupOneTestTwo() {
		System.out.println("Group Test method Two");
	}
	
	@Test(groups= {"test-group-two"})
	public void groupTestThree() {
		System.out.println("Group Test Method Three");
	}
	
}
