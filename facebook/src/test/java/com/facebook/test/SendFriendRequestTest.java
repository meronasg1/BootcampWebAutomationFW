package com.facebook.test;

import base.TestBase;
import base.report.ExtentTestManager;
import com.facebook.pages.FriendsPage;
import com.facebook.pages.LoginPage;
import com.facebook.pages.SearchResultsPage;
import com.facebook.pages.TimeLinePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SendFriendRequestTest extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);

    LoginPage loginPage;
    TimeLinePage timeLinePage;
    SearchResultsPage searchResultsPage;
    FriendsPage friendsPage;

    @BeforeMethod
    public void setUpPOM(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        timeLinePage = PageFactory.initElements(driver, TimeLinePage.class);
        searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
        friendsPage = PageFactory.initElements(driver, FriendsPage.class);
    }

    @Test
    public void validateUserCanSendFriendRequest(){
        timeLinePage.clickOnFindFriendsButton();
        ExtentTestManager.log("Clicked on find friends button", LOGGER);
        friendsPage.clickOnSuggestionsButton();
        ExtentTestManager.log("Clicked on suggestions button", LOGGER);
        friendsPage.clickOnAddFriendButton();
        ExtentTestManager.log("Clicked on add friend button", LOGGER);
        friendsPage.validateUserSentFriendRequest();
        ExtentTestManager.log("Validated that user can send friend request", LOGGER);
    }


}
