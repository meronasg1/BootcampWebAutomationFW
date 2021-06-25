package com.cnn.pages;

import base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class HomePage {

    private static final Logger LOGGER = Logger.getLogger(HomePage.class);
    @FindBy(xpath="//svg[@class='user-icon']")
    private WebElement loginBtn;

    public void validateLoginBtn(){
        Assert.assertTrue(loginBtn.isDisplayed(), "login button is not displayed");
        ExtentTestManager.log("Validated the login button", LOGGER);
    }
    public void clickOnLoginBtn(){
        loginBtn.click();
        ExtentTestManager.log("Clicked on login button", LOGGER);
    }

    @FindBy(id="login-title")
    private WebElement loginLogoFromPopUp;
    public void validateUserClickedOnLoginBtn(){
        Assert.assertEquals(loginLogoFromPopUp.getText(),"Log In", "Title did not match");
        ExtentTestManager.log("Validated that user has clicked on Login button", LOGGER);
    }

    @FindBy(id="loginEmail")
    private WebElement emailAddressField;

    public void typeOnEmailAddressField(String data){
        emailAddressField.sendKeys(data);
        ExtentTestManager.log("Typed on email address field", LOGGER);
    }

    @FindBy(id="loginPassword")
    private WebElement passwordField;

    public void typeOnPasswordField(String data){
        passwordField.sendKeys(data);
        ExtentTestManager.log("Typed on password field", LOGGER);
    }

    @FindBy(id="login-form-button")
    private WebElement loginSubmitBtn;

    public void clickOnLoginSubmitBtn(){
        loginSubmitBtn.click();
        ExtentTestManager.log("Clicked on login submit button", LOGGER);
    }

    public void validateUserLoggedInSuccessfully(){
        Assert.assertTrue(loginBtn.isDisplayed(), "login button is not dispayed");
        ExtentTestManager.log("Validated that user has logged in sucessfully", LOGGER);
    }

    @FindBy(xpath="(//a[@title='visit the US section'])[1]")
    private WebElement usTab;

    public void clickOnUsTab(){
        usTab.click();
        ExtentTestManager.log("Clicked on US tab", LOGGER);
    }

    @FindBy(xpath="(//a[@title='visit the World section'])[1]")
    private WebElement worldTab;

    public void clickOnWorldTab(){
        worldTab.click();
        ExtentTestManager.log("Clicked on world tab", LOGGER);
    }

    @FindBy(linkText="Politics")
    private WebElement politicsTab;

    public void clickOnPoliticsTab(){
        politicsTab.click();
        ExtentTestManager.log("Clicked on politics tab", LOGGER);
    }

    @FindBy(className="link-banner")
    private WebElement article;

    public void clickOnArticle(){
        article.click();
        ExtentTestManager.log("Clicked on an Article", LOGGER);
    }

    @FindBy(id="searchIconTitle")
    private WebElement searchIcon;

    public void clickOnSearchIcon(){
        searchIcon.click();
        ExtentTestManager.log("Clicked on search icon", LOGGER);
    }

    @FindBy(id="header-search-bar")
    private WebElement searchBar;

    public void typeOnSearchBar(String data){
        searchBar.sendKeys(data);
        ExtentTestManager.log("Typed on search bar", LOGGER);
    }

    @FindBy(id="userLogout")
    private WebElement logoutBtn;

    public void clickOnLogoutBtn(){
        logoutBtn.click();
        ExtentTestManager.log("Clicked on logout button", LOGGER);
    }







}
