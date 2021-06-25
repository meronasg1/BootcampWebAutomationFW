package com.cnn.tests;

import base.TestBase;
import com.cnn.pages.HomePage;
import com.cnn.pages.PoliticsPage;
import com.cnn.pages.UsPage;
import com.cnn.pages.WorldPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigationTest extends TestBase {

    HomePage homePage;
    UsPage usPage;
    WorldPage worldPage;
    PoliticsPage politicsPage;

    @BeforeMethod
    public void setUpPOM(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        usPage=PageFactory.initElements(driver, UsPage.class);
        worldPage=PageFactory.initElements(driver, WorldPage.class);
        politicsPage=PageFactory.initElements(driver, PoliticsPage.class);
    }

    @Test
    public void validateThatUserCanNavigateToDifferentTabs(){
        homePage.clickOnUsTab();
        usPage.validateUserNavigatedToTheUsPage();
        navigateBack();

        homePage.clickOnWorldTab();
        worldPage.validateUserNavigatedToTheWorldPage();
        navigateBack();

        homePage.clickOnPoliticsTab();
        politicsPage.validateUserNavigatedToThePoliticsPage();
        navigateBack();



    }


}
