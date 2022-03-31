package com.tem.oop.abstraction;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SignInTest {
	WebDriver driver;
	
	@Test
	public void testSign() {
		
		SignInPage sign = new SignInPage(driver);
		
		sign.SignIn();
		
		Assert.assertTrue(sign.getSignInStatus());
	}
}
