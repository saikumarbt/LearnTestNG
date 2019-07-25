package com.suntaragali.code;

import java.util.ArrayList;
import java.util.List;

import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import org.testng.TestNG;

public class DependencyCode {

	public void dependencyTest() {
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		List<XmlClass> classes = new ArrayList<XmlClass>();
		
		XmlSuite suite = new XmlSuite();
		suite.setName("Dependency Code Test Suite");
		XmlTest test = new XmlTest(suite);
		test.setName("Dependency Code Test");
		XmlClass clz = new XmlClass("com.suntaragali.test.DependencyTest");
		classes.add(clz);
		test.setXmlClasses(classes);
		//Defining an xml dependency where "group-one"depends on "group-two"
		test.addXmlDependencyGroup("group-one", "group-two");
		suites.add(suite);
		
		TestNG testng = new TestNG();
		testng.setXmlSuites(suites);
		testng.run();
	}
	
	public static void main(String[] args) {
		DependencyCode testConfig = new DependencyCode();
		testConfig.dependencyTest();
	}
}
