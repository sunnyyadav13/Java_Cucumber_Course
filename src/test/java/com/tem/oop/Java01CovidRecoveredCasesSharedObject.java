package com.tem.oop;

import org.junit.Test;

public class Java01CovidRecoveredCasesSharedObject {
	
	@Test
	public void testCovidObject() {
		Java01CovidRecoveredCasesClass covid1 = new Java01CovidRecoveredCasesClass();
		covid1.setCountry("UK");
		Java01CovidRecoveredCasesClass.setRecovered(1);
		
		covid1.printCountry();
		covid1.printRecovered();
		covid1.printRecovered();
		covid1.printRecovered();
		covid1.printRecovered();
	}
	
	@Test
	public void testCovidRecoveredCases() {		
		Java01CovidRecoveredCasesClass covid2 = new Java01CovidRecoveredCasesClass();

		covid2.printCountry();
		covid2.printRecovered();
		covid2.printRecovered();
		covid2.printRecovered();
		covid2.printRecovered();
	}
}
