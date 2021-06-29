package com.cigna.tests;

import base.TestBase;
import base.report.ExtentTestManager;
import com.cigna.pages.HomePage;
import com.cigna.pages.MedicarePage;
import com.cigna.pages.MentalHealthPage;
import org.apache.log4j.Logger;
import org.apache.poi.ss.formula.functions.Na;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class NavigationTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(NavigationTest.class);
    HomePage homePage;
    MentalHealthPage mentalHealthPage;
    MedicarePage medicarePage;
    @BeforeMethod
    public void setUpPOM(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        mentalHealthPage=PageFactory.initElements(driver, MentalHealthPage.class);
        medicarePage=PageFactory.initElements(driver, MedicarePage.class);
    }

    @Test
    public void validateThatUserCanNavigateToMentalHealthPage(){
        homePage.navigateToMentalHealthPage();
        ExtentTestManager.log("Navigated to Mental health page", LOGGER);
        Assert.assertEquals(mentalHealthPage.validateUserIsOnMentalHealthPage(), "Mental Health", "Page title did not match expected");
        ExtentTestManager.log("Validated that user navigated to mental health page", LOGGER);
    }

    @Test
    public void validateThatUserCanNavigateToMedicareTab(){
        homePage.navigateToMedicareTab();
        ExtentTestManager.log("User navigated to Medicare Tab", LOGGER);
        Assert.assertEquals(medicarePage.validateThatUserIsOnMedicareTab(), "Cigna Medicare Plans", "Page title did not match");
        ExtentTestManager.log("Validated that user navigated to medicare tab", LOGGER);
    }
}
