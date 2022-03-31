package com.tem.oop.abstraction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "")
	private WebElement signIn;
	
	public WebElement getSignIn() {
		return signIn;
	}
	
	public void SignIn() {
		click(driver, getSignIn());
	}

	public boolean getSignInStatus() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
