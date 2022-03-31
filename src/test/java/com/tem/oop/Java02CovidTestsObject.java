package com.tem.oop;

import org.junit.Assert;
import org.junit.Test;

/**
 * *********************************
 * @author ash
 * @date 11 May 2020
 * @project JavaForTestAutomation
 **********************************
 */

public class Java02CovidTestsObject {
	
	//Java02CovidTestsClass covidTests = new Java02CovidTestsClass("UK");
	Java01CovidRecoveredCasesClass covidTests = new Java02CovidTestsClass("UK");
	
	@Test
	public void test01CovidRecovered() {
		
		((Java02CovidTestsClass)covidTests).setIso("GB");
		covidTests.printCountry();
		Java02CovidTestsClass.setRecovered(1);
		
		try {
			int expected = 1;
			int actual = Java02CovidTestsClass.getRecovered();
			
			System.out.println("actual recovered: " + actual);
			
			System.out.println("expected: " + expected);
			System.out.println("actual: " + actual);
			
			Assert.assertEquals(expected, actual);
			System.out.println("Test passed");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}		
	}
	
	@Test
	public void test02CovidTests() {
		
		int actualrecovered = Java02CovidTestsClass.getRecovered();
		System.out.println("actual recovered: " + actualrecovered);
		((Java02CovidTestsClass)covidTests).setIso("GB");
		covidTests.printCountry();
		Java02CovidTestsClass.setTests(5);
		
		int actualtests = Java02CovidTestsClass.getTests();
		System.out.println("actual tests: " + actualtests);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
