package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginPage {

    @FindBy(id="ap_email")
    private WebElement emailOrMobilePhoneNumberField;

    public void typeOnEmailOrMobilePhoneNumberField(String data){
        emailOrMobilePhoneNumberField.sendKeys(data);
    }

    @FindBy(xpath="//span[@id='continue']")
    private WebElement continueButton;

    public void clickOnContinueButton(){
        continueButton.click();
    }

    @FindBy(id ="ap_password")
    private WebElement passwordField;

    public void typeOnPasswordField(String data){
        passwordField.sendKeys(data);
    }

    @FindBy(id ="signInSubmit")
    private WebElement signInButton;

    public void clickOnSignInButton(){
        signInButton.click();
    }

    @FindBy(xpath="//i[@class='a-icon a-icon-logo']")
    private WebElement amazonLogoFromLoginPage;

    public void validateAmazonLogoFromLoginPage(){
        boolean actual = amazonLogoFromLoginPage.isDisplayed();
        Assert.assertTrue(actual,"Amazon logo is not displayed from login page");
    }





}
