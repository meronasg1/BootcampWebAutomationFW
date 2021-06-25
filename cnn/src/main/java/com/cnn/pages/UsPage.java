package com.cnn.pages;

import base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UsPage {
    private static final Logger LOGGER = Logger.getLogger(UsPage.class);

    @FindBy(xpath="//h1[@class='metadata-header__title']")
    private WebElement usPageTitle;

    public void validateUserNavigatedToTheUsPage(){
        Assert.assertEquals(usPageTitle.getText(), "US", "Title does not match");
        ExtentTestManager.log("validated that user navigated to the US tab", LOGGER);
    }

}
