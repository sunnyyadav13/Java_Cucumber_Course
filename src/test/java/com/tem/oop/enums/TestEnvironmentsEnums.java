package com.tem.oop.enums;

/**
 * *********************************
 * Enums - special class - group of constants
 * 
 * @author ash
 * @date 15 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
public enum TestEnvironmentsEnums {
	// Constants
	TEST_URL("https://www.test.barclays.com"),
	UAT_URL("https://www.test.barclays.com");
	
	private String URL;
	
	private TestEnvironmentsEnums(String URL) {
		this.URL = URL;
	}
	
	public String getURL() {
		return URL;
	}
}
