package com.tem.oop.abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage implements WebConnector {

	@Override
	public void getToURL(WebDriver driver, String URL) {
		driver.get(URL);
		
	}

	@Override
	public void waitUntilPageIsCompletelyLoaded(WebDriver driver) {
		
		
	}

	@Override
	public void click(WebDriver driver, WebElement element) {
		element.click();		
	}
	
}
