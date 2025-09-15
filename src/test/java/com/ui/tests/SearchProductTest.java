package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pages.MyAccountPage;

@Listeners({ com.ui.listeners.TestListener.class })
public class SearchProductTest extends TestBase {

	private MyAccountPage myAccountPage;
	private static String SEARCH_TERM = "Printed Summer Dress";

	@BeforeMethod(description = "Valid userlogs into application")
	public void setup() {
		myAccountPage = homePage.goToLoginPage().doLoginWith("hixekej273@mardiek.com", "password");
	}

	@Test(description = "Verfiy if logged in user is able to search product and correct products search result displayed", groups = {
			"e2e", "smoke", "sanity" })
	public void verifyProductSearchTest() {
		boolean actualResult = myAccountPage.searchForAProduct(SEARCH_TERM)
				.isSearchTermPresentInProductList(SEARCH_TERM);
		Assert.assertEquals(actualResult, true);

	}
}
