package com.amazon.test;
import base.report.ExtentManager;
import base.report.ExtentTestManager;
import base.TestBase;
import com.amazon.pages.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;


public class LoginTest extends TestBase {

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
    public void validateUserCanLogin(){
        homePage.clickOnSignInButton();
        loginPage.validateAmazonLogoFromLoginPage();
        ExtentTestManager.log("clicked on sign in button", LOGGER);

        loginPage.typeOnEmailOrMobilePhoneNumberField("pnttestu@gmail.com");
        ExtentTestManager.log( "pnttestu@gmail.com entered in user name field", LOGGER);
        loginPage.clickOnContinueButton();
        ExtentTestManager.log("clicked on continue button", LOGGER);
        loginPage.typeOnPasswordField("#root1234");
        ExtentTestManager.log("#root1234 entered in password field ", LOGGER);

        loginPage.clickOnSignInButton();
        homePage.validateAmazonLogoFromHomepage();
        ExtentTestManager.log("clicked on sign in button",LOGGER);
    }





}
