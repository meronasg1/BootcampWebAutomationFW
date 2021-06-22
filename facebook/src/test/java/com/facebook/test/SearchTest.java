package com.facebook.test;

import base.TestBase;
import base.report.ExtentTestManager;
import com.facebook.pages.LoginPage;
import com.facebook.pages.SearchResultsPage;
import com.facebook.pages.TimeLinePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Time;

public class SearchTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);
    LoginPage loginPage;
    TimeLinePage timeLinePage;
    SearchResultsPage searchResultsPage;

    @BeforeMethod
    public void setUpPOM(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        timeLinePage = PageFactory.initElements(driver, TimeLinePage.class);
        searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
    }

    @Test
    public void validateThatUserCanSearchName(){
        timeLinePage.typeOnSearchBoxAndPressEnter("Jennifer");
        ExtentTestManager.log("User typed and searched for a name", LOGGER);
        searchResultsPage.validateUserIsOnSearchResultsPage();
        ExtentTestManager.log("validated user can successfully search for name", LOGGER);
    }


}
