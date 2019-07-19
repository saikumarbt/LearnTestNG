package com.suntaragali.groups;

import org.testng.annotations.Test;

@Test(groups={"default-group"})
public class DefaultGroup {

	public void testMethodOne() {
		System.out.println("Test method one");
	}
	
	public void testMethodTwo() {
		System.out.println("Test Method two");
	}
	
	@Test(groups= {"test-group"})
	public void testMethodThree() {
		System.out.println("Test Method three");
	}
}
