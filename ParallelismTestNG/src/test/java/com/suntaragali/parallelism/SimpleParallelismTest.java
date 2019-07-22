package com.suntaragali.parallelism;

import org.testng.annotations.Test;

public class SimpleParallelismTest {
	
	@Test
	public void testMethodsOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method One. Thread is : "+id);
	}
	
	@Test
	public void testMethodsTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Simple test-method Two. Thread is :"+id);
	}
}
