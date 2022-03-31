package com.tem.foundations;

/**
 * 
 * @author:Sunny Yadav
 * @ Date: 30-Mar-2022::11:20:56 am
 * @Project: JavaForTestAutomation
 */
public class Java01Syntax {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * Logic 
		 */
		
		
		// CTRL + SPACE
		System.out.println("test execution starts here.."); // Logs
		
		String testURL = "teststaging.barclays.com";
		System.out.println("Test URL: " + testURL);
		
		/*
		 * Logic
		 */
		if(testURL.startsWith("www")) {
			System.out.println("test passed");
		}else {
			System.out.println("test failed");
		}
	}

}
