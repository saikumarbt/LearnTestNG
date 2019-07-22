package com.suntaragali.factory;

import org.testng.annotations.Factory;

import com.suntaragali.classes.DependencyTest;

public class DependencyFactory {
	
	@Factory
	public Object[] factoryMethod() {
		return new Object[] {
				new DependencyTest(1),
				new DependencyTest(2)
		};
	}
}
