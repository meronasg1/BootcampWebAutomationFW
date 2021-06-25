package com.cnn.pages;

import base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WorldPage {

    private static final Logger LOGGER = Logger.getLogger(WorldPage.class);

    @FindBy(xpath="//h1[@class='metadata-header__title']")
    private WebElement worldPageTitle;

    public void validateUserNavigatedToTheWorldPage(){
        Assert.assertEquals(worldPageTitle.getText(), "World", "Title does not match");
        ExtentTestManager.log("validated that user navigated to the World tab", LOGGER);
    }
}
