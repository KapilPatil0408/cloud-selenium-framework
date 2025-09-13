package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class LoginPage extends BrowserUtility{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	static final By EMAIL_TEXT_BOX_LOCATOR=By.id("email");
	static final By PASSWORD_TEXT_BOX_LOCATOR=By.id("passwd");
	static final By SIGNIN_LOGIN_BUTTON_LOCATOR=By.id("SubmitLogin");
	
	public MyAccountPage doLoginWith(String emailAddress, String password) {
		enterText(EMAIL_TEXT_BOX_LOCATOR, emailAddress);
		enterText(PASSWORD_TEXT_BOX_LOCATOR, password);
		clickOn(SIGNIN_LOGIN_BUTTON_LOCATOR);
		MyAccountPage myAccountPage= new MyAccountPage(getDriver());
		return myAccountPage;
	}
	
	

}
