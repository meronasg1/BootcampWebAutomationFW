package com.citibank.tests;

import base.TestBase;
import base.report.ExtentTestManager;
import com.citibank.pages.MainPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);
    MainPage mainPage;

    @BeforeMethod
    public void setUpPOM(){
        mainPage= PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void validateThatUserCanLoginWithValidCredentials(){
        mainPage.typeOnUserNameField("user01");
        ExtentTestManager.log("typed on username field", LOGGER);
        mainPage.typeOnPasswordField("abcd1234");
        ExtentTestManager.log("typed on password field", LOGGER);
        mainPage.selectCheckBox();
        ExtentTestManager.log("selected checkbox", LOGGER);
        Assert.assertTrue(mainPage.validateThatCheckBoxIsSelected(), "checkbox is not selected");
        ExtentTestManager.log("validated that checkbox is selected", LOGGER);
    }

    @Test
    public void validateThatUserCanClickOnTheLinksUnderCreditCardTab(){
        mainPage.clickOnViewAllCreditCards();
    }

}
