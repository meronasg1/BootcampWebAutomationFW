package com.citibank.tests;

import base.TestBase;
import base.report.ExtentTestManager;
import com.citibank.pages.MainPage;
import com.citibank.pages.ViewAllCreditCardPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigationTest extends TestBase {

    private static final Logger LOGGER=Logger.getLogger(NavigationTest.class );
    MainPage mainPage;
    ViewAllCreditCardPage viewAllCreditCardPage;
    @BeforeMethod
    public void setUpPOM(){
        mainPage= PageFactory.initElements(driver, MainPage.class);
        viewAllCreditCardPage= PageFactory.initElements(driver, ViewAllCreditCardPage.class);
    }

    @Test
    public void validateThatUserCanClickOnTheLinksUnderCreditCardTab(){
        mainPage.clickOnViewAllCreditCards();
        ExtentTestManager.log("User clicked on view all credit cards", LOGGER);
        Assert.assertEquals(viewAllCreditCardPage.validateThatUserIsOnViewALlCreditCardsPage(), "View and Compare All Credit Cards", "Page title does not match");
        ExtentTestManager.log("Validated that user is on view all credit cards page", LOGGER);
    }

}
