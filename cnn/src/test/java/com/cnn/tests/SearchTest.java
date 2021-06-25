package com.cnn.tests;

import base.TestBase;
import com.cnn.pages.HomePage;
import com.cnn.pages.SearchResultsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    HomePage homePage;
    SearchResultsPage searchResultsPage;

    @BeforeMethod
    public void setUpPOM(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        searchResultsPage=PageFactory.initElements(driver,SearchResultsPage.class);
    }

    @Test
    public void validateThatUserCanSearchNewsSite(String data){
        homePage.clickOnSearchIcon();
        homePage.typeOnSearchBar(data);
        searchResultsPage.validateSearchResults(data);
    }




}
