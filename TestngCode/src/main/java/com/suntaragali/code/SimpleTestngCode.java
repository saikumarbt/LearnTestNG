package com.suntaragali.code;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class SimpleTestngCode {

	public void simpleTestNGTest() {
		//List of xml suites to be considered for test execution
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		//List of classes to be considered for test execution
		List<XmlClass> classes = new ArrayList<XmlClass>();
		
		//Defines a simple Xml suite with a name
		XmlSuite suite = new XmlSuite();
		suite.setName("Simple Config Suite");
		
		//Defines a xml test for a suite and with a said name
		XmlTest test = new XmlTest(suite);
		test.setName("Simple Config Test");
		
		//A single xml class to be considered for execution
		XmlClass clz = new XmlClass("com.suntaragali.test.SampleTest");
		classes.add(clz);
		//Sets the list of classes to be considered for execution for a test
		test.setXmlClasses(classes);
		
		// Adds a single suite to the list suites
		suites.add(suite);
		
		//Defining a testng instance
		TestNG testng = new TestNG();
		//Sets the List of Xml suites to be considered for execution
		testng.setXmlSuites(suites);
		//Runs the configured Testng tests
		testng.run();
	}
	
	public static void main(String[] args) {
		SimpleTestngCode smCode = new SimpleTestngCode();
		smCode.simpleTestNGTest();
	}
}
