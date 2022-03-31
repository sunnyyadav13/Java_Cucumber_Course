package com.tem.foundations;

import org.junit.Assert;
import org.junit.Test;

/**
 * *********************************
 * @author ash
 * @date 7 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
public class Java03Variables {
	
	/*
	 * Variables
	 * 
	 * 3 types: instance, local, static
	 */
	
	/*
	 * instance - field
	 */
	
	final String testURL = "teststaging.barclays.com";
	long membershipNumber = 12345678;
	int passcode = 4567;
	
	/*
	 * static - 
	 */
	
	static int numberOfLoginAttempts = 0;

	/**
	 * 
	 */
	public void loginAttempts() {
		System.out.println("user log in attempt: " + (numberOfLoginAttempts+1));
		/*
		 * Local
		 */
		
		String expectedAccountLockedMessage = "Account Locked. Contact bank";
		String actualAccountLockedMessage = "Account Locked. Contact us";
		
		numberOfLoginAttempts++;
		
		try {
			if(numberOfLoginAttempts == 3) {
				System.out.println(expectedAccountLockedMessage);
				Assert.assertEquals(expectedAccountLockedMessage, actualAccountLockedMessage);
				System.out.println("Test passed..");
			}
		} catch (AssertionError e) {
			System.out.println("Test failed..");
			Assert.fail("Message does not match");
		}
	}
	
	
	@Test
	public void testVariables() {
		System.out.println("Test URL: " + testURL);
		// testURL = "hsbc.com";
		System.out.println("membership Number: " + membershipNumber);
		
		membershipNumber = 33243354; // re-assign a new value
		System.out.println("membership Number: " + membershipNumber);			
				
		loginAttempts();		
		loginAttempts();
		loginAttempts();
	}
}
