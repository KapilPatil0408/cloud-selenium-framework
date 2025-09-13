package com.ui.tests;

import static com.constants.Browser.CHROME;
import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;
import com.ui.pojo.User;
import com.utility.LoggerUtility;



@Listeners({com.ui.listeners.TestListener.class})
public class LoginTest extends TestBase{
	Logger logger = LoggerUtility.getLogger(this.getClass());

	@Test(description="Verifies with valid user is able to login into application", groups= {"e2e","sanity"},
			dataProviderClass=com.ui.dataproviders.LoginDataProvider.class, dataProvider="loginTestDataProvider")
	public void loginTest(User user) {
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Kapil Vilas");	
	}
	
//	@Test(description="Verifies with valid user is able to login into application", groups= {"e2e","sanity"},
//			dataProviderClass=com.ui.dataproviders.LoginDataProvider.class, dataProvider="loginTestCSVDataProvider")
//	public void loginCSVTest(User user) {
//		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Kapil Vilas");	
//	}
//
//	@Test(description="Verifies with valid user is able to login into application", groups= {"e2e","sanity"},
//			dataProviderClass=com.ui.dataproviders.LoginDataProvider.class, dataProvider="loginTestExcelDataProvider",
//			retryAnalyzer=com.ui.listeners.RetryAnalyzer.class)
//	public void loginExcelTest(User user) {
//		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(), "Kapil Vilas");	
//	}
}
