package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.constants.Size.*;
import com.ui.pages.SearchResultPage;

public class ProductCheckoutTest extends TestBase {

	private static final String SEARCH_TERM = "Printed Summer dress";
	private SearchResultPage searchResultPage;

	@BeforeMethod(description = "User logs into the application and searches for a product")
	public void setUp() {
		searchResultPage = homePage.goToLoginPage().doLoginWith("hixekej273@mardiek.com", "password")
				.searchForAProduct(SEARCH_TERM);

	}

	@Test(description = "Verify if the logged in user is able to buy a dress", groups = { "e2e", "smoke",
			"regression" })
	public void checkOutTest() {
		String result=searchResultPage.clickOnProductAtIndex(1).changeSize(L).addProductToCart().proceedToCheckout()
					.goToConfirmAddressPage().goToShippmentPage().goToPaymentPage().makePaymentByWire();
		Assert.assertTrue(result.contains("complete"));
	}

}
