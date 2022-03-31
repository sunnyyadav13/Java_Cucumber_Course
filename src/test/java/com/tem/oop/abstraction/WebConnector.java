package com.tem.oop.abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * *********************************
 * INTERFACES
 * 
 * Standard framework
 * 
 * 
 * @author ash
 * @date 15 May 2020
 * @project JavaForTestAutomation
 **********************************
 */
public interface WebConnector {

	public void getToURL(WebDriver driver, String URL);
	public void waitUntilPageIsCompletelyLoaded(WebDriver driver);	
	
	
	
	
	
	
	public void click(WebDriver driver, WebElement element);
}
