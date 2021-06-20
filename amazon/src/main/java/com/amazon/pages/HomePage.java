package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id="nav-link-accountList-nav-line-1")
    private WebElement signInButton;

    public void clickOnSignInButton(){
        signInButton.click();
    }

}
