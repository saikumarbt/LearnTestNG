package com.suntaragali.groups;

import org.testng.annotations.Test;

public class ExcludeGroup {
	
	@Test (groups= {"include-group"})
	public void testMethodOne() {
		System.out.println("Test method one belonging to group");
	}
	
	@Test (groups= {"include-group"})
	public void testMethodTwo() {
		System.out.println("Test method two belonging to group");
	}
	
	@Test (groups= {"include-group", "exclude-group"})
	public void testMethodThree() {
		System.out.println("Test Method three belonging to two groups");
	}
}
