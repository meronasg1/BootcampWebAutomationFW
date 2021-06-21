package com.amazon.test;

import base.TestBase;
import base.report.ExtentTestManager;
import com.amazon.pages.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutProductTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);
    CartPage cartPage;
    HomePage homePage;
    ItemAddedToCartPage itemAddedToCartPage;
    LoginPage loginPage;
    ProductPage productPage;
    SearchPage searchPage;

    @BeforeMethod
    public void setUpPOM(){
        cartPage= PageFactory.initElements(driver, CartPage.class);
        homePage=PageFactory.initElements(driver, HomePage.class);
        itemAddedToCartPage=PageFactory.initElements(driver, ItemAddedToCartPage.class);
        loginPage=PageFactory.initElements(driver, LoginPage.class);
        productPage=PageFactory.initElements(driver, ProductPage.class);
        searchPage=PageFactory.initElements(driver, SearchPage.class);
    }

    @Test
    public void validateUserCanBrowseProductsAndUseCartToChkOut(){

        homePage.typeOnSearchBox("Java Books");
        ExtentTestManager.log("Typed on search box", LOGGER);

        homePage.clickOnSearchButton();
        ExtentTestManager.log("Clicked on search button", LOGGER);

        searchPage.validateSearchResult("Java Books");
        ExtentTestManager.log("validated the search result", LOGGER);

        searchPage.clickOnSearchItem();
        ExtentTestManager.log("Clicked on a search Item", LOGGER);

        productPage.clickOnAddToCartButton();
        ExtentTestManager.log("clicked on add to cart button", LOGGER);

        itemAddedToCartPage.clickOnCartButton();
        ExtentTestManager.log("clicked on cart button", LOGGER);

        cartPage.clickOnProceedToCheckOutBtn();
        ExtentTestManager.log("clicked on proceed to check out button", LOGGER);

        loginPage.validateAmazonLogoFromLoginPage();
        ExtentTestManager.log("validated amazonLgo", LOGGER);

    }



}
