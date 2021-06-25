package com.cnn.pages;

import base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchResultsPage {

    private static final Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(className ="cnn-search__results-count")
    private WebElement searchResults;

    public void validateSearchResults(String data){
        Assert.assertEquals(searchResults.getText(), data, "Text does not match");
        ExtentTestManager.log("validated that user is on the search results page", LOGGER);
    }

}
