package com.cnn.tests;

import base.TestBase;
import com.cnn.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignOutTest extends TestBase {
    HomePage homePage;

    @BeforeMethod
    public void setUpPOM(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void validateThatUserCanLogOut(){
        homePage.clickOnLoginBtn();
        homePage.clickOnLogoutBtn();
        homePage.validateThatUserLoggedOutSuccessfully();
    }




}
