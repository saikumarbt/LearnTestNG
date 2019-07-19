package com.suntaragali.testngpractice;

import org.testng.annotations.Test;

public class TimeSuite {
	@Test (timeOut=500)
	public void timeTestOne() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("Time Test Method One");
	}
	@Test
	public void timeTestTwo() throws InterruptedException{
		Thread.sleep(400);
		System.out.println("Time Test Method Two");
	}
}
