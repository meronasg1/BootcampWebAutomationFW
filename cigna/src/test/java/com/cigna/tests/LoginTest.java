package com.cigna.tests;

import base.TestBase;
import com.cigna.pages.HomePage;
import com.cigna.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUpPOM(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        loginPage=PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void validateThatUserCanLoginWithValidCredentials(){
        homePage.clickOnLoginBtn();
        loginPage.switchToLoginWindow();
        loginPage.typeOnUsernameField("meronasg1@gmail.com");
        loginPage.typeOnPasswordField("#abcd1234");
    }

}
