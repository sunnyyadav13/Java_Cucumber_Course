package com.tem.foundations;

import org.junit.Test;

/**
 * *********************************
 * @author ash
 * @date 7 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
public class Java02DataTypes {

	/**
	 * 2 types - primitive and non-primitive
	 */
	
	@Test
	public void testDataTypeprimitive() {
		/*
		 * primitive - int, float, long, double, boolean
		 */
		
		int usersCount = 10000;
		System.out.println("usersCount: " + usersCount);
		
		float interestRate = 2.2f;
		System.out.println("interestRate: " + interestRate);
		
		boolean userLoggedin = false;
		System.out.println("userLoggedin: " + userLoggedin);

		if(usersCount >= 10000) {
			System.out.println("High volume of users signed in today..");
		}
		
	}
	
	@Test
	public void testDataTypeNonprimitive() {
		/*
		 * Non primitive - String, Integer
		 */
		
		String testURL = "teststaging.barclays.com";
		System.out.println("testURL: " + testURL);
		
		Integer supportCallCount = 100;
		System.out.println("supportCallCount: " + supportCallCount);

		if(supportCallCount.equals(100)) {
			System.out.println("It's time to go home!!!");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
