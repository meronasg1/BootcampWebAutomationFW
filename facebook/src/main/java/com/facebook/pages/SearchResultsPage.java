package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchResultsPage {
    @FindBy(xpath="//h1[@class='gmql0nx0 l94mrbxd p1ri9a11 lzcic4wl']")
    private WebElement searchResultsPageTitle;

    public void validateUserIsOnSearchResultsPage(){
        String actual = searchResultsPageTitle.getText();
        String expected = "Search Results";
        Assert.assertEquals(actual, expected, "Title did not match");
    }
}
