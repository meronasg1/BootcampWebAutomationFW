package com.amazon.test;

import base.TestBase;
import com.amazon.pages.HomePage;
import com.amazon.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setUpPOM(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test
    public void validateUserCanLogin(String userName, String password){
        homePage.clickOnSignInButton();
        loginPage.typeOnEmailOrMobilePhoneNumberField(userName);
        loginPage.clickOnContinueButton();
        loginPage.typeOnPasswordField(password);
        loginPage.clickOnSignInButton();
    }





}
