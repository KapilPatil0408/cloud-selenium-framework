package com.ui.pages;

import static com.constants.Env.QA;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;
import com.utility.LoggerUtility;

public class HomePage extends BrowserUtility{

	Logger logger=LoggerUtility.getLogger(this.getClass());
	
	private static final By SIGN_IN_LINK_LOCATOR=By.xpath("//a[contains(text(),'Sign in')]");
	
	public HomePage(Browser browserName, boolean isHeadless) {
		super(browserName, isHeadless); // To Call the parent class constructor form child constructor
	//	goToWebsite(readProperties(QA, "URL"));
		goToWebsite(JSONUtility.readJson(QA).getUrl());
	}
	
	public HomePage(WebDriver driver) {
		super(driver); // To Call the parent class constructor form child constructor
		goToWebsite(JSONUtility.readJson(QA).getUrl());
	}
	
	public LoginPage goToLoginPage() { // Page Functions ----> Page Object design pattern we don't use void return type
		logger.info("Perform click on sigin in to go to sign in page");
		clickOn(SIGN_IN_LINK_LOCATOR);
		LoginPage loginPage= new LoginPage(getDriver());
		return loginPage;
	}

	public void quit() {
		
	}
}
