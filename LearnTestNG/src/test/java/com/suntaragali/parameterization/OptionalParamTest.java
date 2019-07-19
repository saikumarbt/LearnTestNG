package com.suntaragali.parameterization;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParamTest {
	
	@Parameters ({"optional-value"})
	@Test
	public void optionTest(@Optional("optional value") String value) {
		System.out.println("This is:" + value);
	}

}
