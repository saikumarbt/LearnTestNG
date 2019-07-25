package com.suntaragali.code;

import java.util.ArrayList;
import java.util.List;

import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import org.testng.TestNG;

public class IncludeExcludeMethodCode {
	
	public void includeExcludeTest() {
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		List<XmlClass> classes = new ArrayList<XmlClass>();
		
		XmlSuite suite = new XmlSuite();
		suite.setName("Include Exclude Method Suite");
		
		XmlTest test = new XmlTest(suite);
		test.setName("Include Exclude Test");
		// Test Class to be included for Test Execution
		XmlClass clz = new XmlClass("com.suntaragali.test.IncludeExcludeMethodTest");
		
		//Test Methods to be included
		XmlInclude methodOne = new XmlInclude("testMethodOne");
		XmlInclude methodTwo = new XmlInclude("testMethodTwo");
		
		//Creating a list of included methods and adding the methods instances to it.
		
		List<XmlInclude> includes = new ArrayList<XmlInclude>();
		includes.add(methodOne);
		includes.add(methodTwo);
		
		//Setting the included methods for the class
		clz.setIncludedMethods(includes);
		
		classes.add(clz);
		test.setXmlClasses(classes);
		suites.add(suite);
		
		TestNG ng = new TestNG();
		ng.setXmlSuites(suites);
		ng.run();
		
	}
	
	public static void main(String[] args) {
		IncludeExcludeMethodCode testConfig = new IncludeExcludeMethodCode();
		testConfig.includeExcludeTest();
	}
}
