package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id="email")
    private WebElement emailField;

    public void typeOnEmailField(String data){
        emailField.sendKeys(data);
    }

    @FindBy(id="pass")
    private WebElement passwordField;

    public void typeOnPasswordField(String data){
        passwordField.sendKeys(data);
    }

    @FindBy(className="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")
    private WebElement loginButton;

    public void clickOnLoginButton(){
        loginButton.click();
    }
}
