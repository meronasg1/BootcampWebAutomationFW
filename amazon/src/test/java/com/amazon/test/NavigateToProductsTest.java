package com.amazon.test;

import base.TestBase;
import base.report.ExtentTestManager;
import com.amazon.pages.*;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateToProductsTest extends TestBase {


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
    public void validateUsercanNavigateToproducts(){
        homePage.typeOnSearchBox("selenium books");
        ExtentTestManager.log("Typed on search box", LOGGER);
        homePage.clickOnSearchButton();
        ExtentTestManager.log("Clicked on search button", LOGGER);
        searchPage.clickOnSearchItem();
        ExtentTestManager.log("Clicked on search item", LOGGER);
        productPage.validateUserIsOnProductPage();
        ExtentTestManager.log("Validated user is on product page", LOGGER);

    }



}
