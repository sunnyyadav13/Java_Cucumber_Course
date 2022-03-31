package com.tem.oop;

import org.junit.Assert;
import org.junit.Test;

public class Java01CovidRecoveredCasesObject {
	
	// Object - instance of a class
	// stored in memory
	
	// Instantiating a Class
	Java01CovidRecoveredCasesClass covid = new Java01CovidRecoveredCasesClass();
	
	// new = invokes constructor
	
	@Test
	public void testCovidObject() {
		covid.setCountry("UK");
		Java01CovidRecoveredCasesClass.setRecovered(1);
		
		covid.printCountry();
		covid.printRecovered();
		covid.printRecovered();
		covid.printRecovered();
		covid.printRecovered();
	}
	
	@Test
	public void testCovidRecoveredCases() {		
		Java01CovidRecoveredCasesClass covid = new Java01CovidRecoveredCasesClass("UK");
		covid.printCountry();
		
		//Java01CovidRecoveredCasesClass.setRecovered(1);
		
		try {
			int expected = 5;
			int actual = Java01CovidRecoveredCasesClass.getRecovered();
			
			System.out.println("expected: " + expected);
			System.out.println("actual: " + actual);
			
			Assert.assertEquals(expected, actual);
			System.out.println("Test passed");
		} catch (AssertionError e) {
			System.out.println("Test failed");
			Assert.fail();
		}
	}
	
}
