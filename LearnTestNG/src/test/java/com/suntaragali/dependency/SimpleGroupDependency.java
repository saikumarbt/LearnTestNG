package com.suntaragali.dependency;

import org.testng.annotations.Test;

public class SimpleGroupDependency {
	
	@Test(dependsOnGroups = {"test-group"})
	public void groupTestOne() {
		System.out.println("Group Test Method One");
	}
	
	@Test(groups= {"test-group"})
	public void groupTestTwo() {
		System.out.println("Group Test Method Two");
	}
	
	@Test(groups= {"test-group"})
	public void groupTestThree() {
		System.out.println("Group Test Method Three");
	}
}
