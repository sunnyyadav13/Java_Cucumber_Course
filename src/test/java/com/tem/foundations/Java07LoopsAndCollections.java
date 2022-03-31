package com.tem.foundations;

import org.junit.Test;

import org.junit.Assert;

/**
 * *********************************
 * @author ash
 * @date 10 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
public class Java07LoopsAndCollections {
	/**
	 * 
	 */
	@Test
	public void testArraysLoops() {
		String[] str = {"tester1", "tester2", "tester3"};
		System.out.println(str.length);
		System.out.println(str[0]);
		System.out.println();
		
		Object[] obj = {"tester1", "tester2", "tester3"};
		System.out.println(obj.length);
		System.out.println(obj[0]);
		System.out.println();
		
		Object[][] objMulti = {
				{">A", "2.0", "Successful"},
				{">A", "0.10", "Not Successful"},
				{">A", "0.10", "Not Successful"},
		};
		
		System.out.println(objMulti[0][0]);
		System.out.println(objMulti[0][1]);
		System.out.println(objMulti[0][2]);
		
		for(int i=0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		int i=0;
		while(i < str.length) {
			System.out.println(str[i]);
			i++;
		}
		
		String[] roles = {"automation tester", "senior tester", "test manager"};
		// For-each loop
		// Syntax: Data-type item:array
		for(String role:roles) {
			System.out.println("role: " + role);
		}
	}
	
	@Test
	public void testLookUpEmailAvailability() {
		try {
			String[] emailIdNotAvailable = {"automation.tester", "senior.tester", "test.manager"};
			
			//String searchEmailId = "automation.tester";
			String searchEmailId = "SDET";
			boolean emailIdExists = false;
			
			// 
			for(String emailId : emailIdNotAvailable) {
				if(emailId.equalsIgnoreCase(searchEmailId)) {
					emailIdExists = true;
					break;					
				}else {
					emailIdExists = false;
					continue;
				}			
			}
			
			Assert.assertFalse("Email Id exists - ", emailIdExists);
			System.out.println("Test passed - " + emailIdExists);
		} catch (AssertionError e) {
			System.out.println("Test failed ");
			Assert.fail();
		}		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
