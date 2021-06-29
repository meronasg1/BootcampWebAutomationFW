package com.citibank.tests;

import base.TestBase;
import base.report.ExtentTestManager;
import com.citibank.pages.MainPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadAvailableFeaturesTest extends TestBase {

    private static final Logger LOGGER=Logger.getLogger(NavigationTest.class );
    MainPage mainPage;
    @BeforeMethod
    public void setUpPOM(){
        mainPage= PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void validateThatUserCanReadTextOnMainPage(){
        mainPage.getTextOfMainPage();
        ExtentTestManager.log("User read features promoted on main page", LOGGER);
    }

}
