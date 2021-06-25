package com.cnn.pages;

import base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PoliticsPage {

    private static final Logger LOGGER = Logger.getLogger(PoliticsPage.class);

    //not sure about this xpath
    @FindBy(xpath="//svg[@class='politics-logo-icon']")
    private WebElement politicsPageLogo;

    public void validateUserNavigatedToThePoliticsPage(){
        Assert.assertEquals(politicsPageLogo.isDisplayed(), "Logo is not displayed");
        ExtentTestManager.log("Validated that user navigated to the politics tab", LOGGER);
    }

}
