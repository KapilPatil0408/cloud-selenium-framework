package com.ui.tests;

import com.constants.Browser;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.ui.pages.HomePage;
import com.utility.BrowserUtility;
import com.utility.LambdaTestUtility;
import com.utility.LoggerUtility;

public class TestBase {

	protected HomePage homePage;
	Logger logger = LoggerUtility.getLogger(this.getClass());
	private boolean isLambdaTest;

	@Parameters({ "browser", "isLambdaTest", "isHeadLess" })
	@BeforeMethod(description = "Load home page of website")
	public void setUp(
			@Optional("chrome") String browser, 
			@Optional("false") boolean isLambdaTest, 
			@Optional("false") boolean isHeadless, ITestResult result) {

		this.isLambdaTest = isLambdaTest;
		WebDriver lambdaDriver;
		if (isLambdaTest) {
			lambdaDriver = LambdaTestUtility.initailzeLambaTestSession(browser, result.getMethod().getMethodName());
			homePage = new HomePage(lambdaDriver);
		} else {
			// Running test on local machine!!!
			logger.info("Load Homepage of website");
			homePage = new HomePage(Browser.valueOf(browser.toUpperCase()), isHeadless);
		}
	}

	public BrowserUtility getInstance() {
		return homePage;
	}

	@AfterMethod(description = "Tear down browser")
	public void tearDown() {
		if (isLambdaTest) {
			LambdaTestUtility.quitSession(); // quit or close the browserSession on lambda Test
		} else {
			homePage.quit(); // local
		}
	}
}
