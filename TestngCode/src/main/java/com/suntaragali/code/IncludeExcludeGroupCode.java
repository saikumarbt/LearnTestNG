package com.suntaragali.code;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class IncludeExcludeGroupCode {

	public void inlcudeExcludeTest() {
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		List<XmlClass> classes = new ArrayList<XmlClass>();
		
		XmlSuite suite = new XmlSuite();
		suite.setName("Include Exclude Group Test Suite");
		
		XmlTest test = new XmlTest(suite);
		test.setName("Include Exclude Group Test");
		XmlClass clz = new XmlClass("com.suntaragali.test.IncludeExcludeGroupTest");
		classes.add(clz);
		test.setXmlClasses(classes);
		
		//Inlcuding & Excluding groups
		test.addIncludedGroup("group-one");
		test.addExcludedGroup("group-two");
		
		suites.add(suite);
		
		TestNG testng = new TestNG();
		testng.setXmlSuites(suites);
		testng.run();
	}
	public static void main(String[] args) {
		IncludeExcludeGroupCode testConfig = new IncludeExcludeGroupCode();
		testConfig.inlcudeExcludeTest();
	}
}
