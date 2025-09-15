package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class LoginPage extends BrowserUtility{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private static final By EMAIL_TEXT_BOX_LOCATOR=By.id("email");
	private static final By PASSWORD_TEXT_BOX_LOCATOR=By.id("passwd");
	private static final By SIGNIN_LOGIN_BUTTON_LOCATOR=By.id("SubmitLogin");
	private static final By ERROR_MESSAGE_LOCATOR=By.xpath("//*[contains(@class,\"alert-danger\")]/ol/li");
	
	
	public MyAccountPage doLoginWith(String emailAddress, String password) {
		enterText(EMAIL_TEXT_BOX_LOCATOR, emailAddress);
		enterText(PASSWORD_TEXT_BOX_LOCATOR, password);
		clickOn(SIGNIN_LOGIN_BUTTON_LOCATOR);
		MyAccountPage myAccountPage= new MyAccountPage(getDriver());
		return myAccountPage;
	}
	
	public LoginPage doLoginWithInvalidCredentails(String emailAddress, String password) {
		enterText(EMAIL_TEXT_BOX_LOCATOR, emailAddress);
		enterText(PASSWORD_TEXT_BOX_LOCATOR, password);
		clickOn(SIGNIN_LOGIN_BUTTON_LOCATOR);
		LoginPage loginPage= new LoginPage(getDriver());
		return loginPage;
	}
	
	public String getErrorMessage() {
		return getVisibleText(EMAIL_TEXT_BOX_LOCATOR);
	}
	

}
