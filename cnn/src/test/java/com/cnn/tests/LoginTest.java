package com.cnn.tests;

import base.TestBase;
import com.cnn.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage;

    @BeforeMethod
    public void setUpPOM(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void validateUserCanLoginWithValidCredentials(){
        homePage.validateLoginBtn();
        homePage.clickOnLoginBtn();
        homePage.validateUserClickedOnLoginBtn();
        homePage.typeOnEmailAddressField("meronasg1@gmail.com");
        homePage.typeOnPasswordField("#Abcd1234");
        homePage.clickOnLoginSubmitBtn();
        homePage.validateUserLoggedInSuccessfully();
    }


}
