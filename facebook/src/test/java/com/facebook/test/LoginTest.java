package com.facebook.test;

import base.TestBase;
import base.report.ExtentTestManager;
import com.facebook.pages.LoginPage;
import com.facebook.pages.TimeLinePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);
    LoginPage loginPage;
    TimeLinePage timeLinePage;

    @BeforeMethod
    public void setUpPOM(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        timeLinePage = PageFactory.initElements(driver, TimeLinePage.class);
    }

    @Test
    public void validateUserCanLogin(){
        loginPage.typeOnEmailField("pnttestu@gmail.com");
        ExtentTestManager.log("User typed on email field", LOGGER);
        loginPage.typeOnPasswordField("#root1234");
        ExtentTestManager.log("User typed on password field", LOGGER);
        loginPage.clickOnLoginButton();
        ExtentTestManager.log("User clicked on login button", LOGGER);
        timeLinePage.validateUserCanSeeLogoFromLoginPage();
        ExtentTestManager.log("validated that user can login into facebook.com using valid credentials", LOGGER);
    }



}
