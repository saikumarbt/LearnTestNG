package com.suntaragali.groups;

import org.testng.annotations.Test;

public class RegularExpressionGroup {
	
	@Test(groups= {"include-test-one"})
	public void testMethodOne() {
		System.out.println("Test Method One");
	}
	
	@Test(groups= {"include-test-two"})
	public void testMethodTwo() {
		System.out.println("Test Method Two");
	}
	
	@Test(groups= {"test-one-exclude"})
	public void testMethodThree() {
		System.out.println("Test Method Three");
	}
	
	@Test(groups= {"test-two-exclude"})
		public void testMethodFour() {
			System.out.println("Test Method Four");
	}
	
}
