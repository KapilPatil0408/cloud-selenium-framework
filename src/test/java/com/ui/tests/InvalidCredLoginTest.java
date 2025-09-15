package com.ui.tests;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.utility.LoggerUtility;

@Listeners({com.ui.listeners.TestListener.class})
public class InvalidCredLoginTest extends TestBase{
	
	Logger logger = LoggerUtility.getLogger(this.getClass());
	private static final String INVALID_EMAIL_ADDRESS="kapil9660@gmail.com";
	private static final String INVALID_PASSWORD="123445";
	

	@Test(description="Verifies the error message shown for the user with invalid credentials", groups= {"e2e","sanity"})
	public void loginTest() {
		assertEquals(homePage.goToLoginPage().doLoginWithInvalidCredentails(INVALID_EMAIL_ADDRESS, INVALID_PASSWORD)
				      .getErrorMessage(),"Authentication failed.");	
	}
	

}
