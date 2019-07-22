package com.suntaragali.factory;
import org.testng.annotations.Factory;

import com.suntaragali.classes.ParameterTest;

public class ParameterFactory {

	@Factory
	public Object [] paramFactory() {
		return new Object[] {
			new ParameterTest(0),
			new ParameterTest(1)
		};
	}
}
