package com.tem.foundations;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * *********************************
 * 
 * @author ash
 * @date 7 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
public class Java04TypeCasting {

	/**
	 * Widening casting - smaller type to a larger type int -> Double
	 * (automatically)
	 */

	@Test
	public void testTypeCastingWide() {

		int intOne = 11;
		double doubleOne = intOne;

		System.out.println(intOne);
		System.out.println(doubleOne);
	}

	/**
	 * Narrow casting - larger type to smaller type Double -> int (manually)
	 */

	@Test
	public void testTypeCastingNarrow() {
		double doubletwo = 11.343;
		int inttwo = (int) doubletwo;

		System.out.println(doubletwo);
		System.out.println(inttwo);
	}

	@Test
	public void testTypeCastingJavascriptexecutor() {

		/**
		 * Selenium webdriver - JavascriptExecutor
		 */

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.barclays.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("", "");
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
