package com.suntaragali.factory;

import org.testng.annotations.Factory;

import com.suntaragali.classes.ExampleFactoryTest;

public class ExampleFactory {

	@Factory
	public Object[] factoryMethod() {
		return new Object[] {
				new ExampleFactoryTest("One"),
				new ExampleFactoryTest("Two")
		};
	}
}
