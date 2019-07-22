package com.suntaragali.factory;

import org.testng.annotations.Factory;

import com.suntaragali.classes.SimpleTest;

public class SimpleTestFactory {
	
	@Factory
	public Object[] factoryMethod() {
		return new Object[] {
				new SimpleTest(),
				new SimpleTest()
		};
	}
	
}
