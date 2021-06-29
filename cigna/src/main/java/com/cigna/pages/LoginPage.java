package com.cigna.pages;

import base.TestBase;
import base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class LoginPage extends TestBase {

    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    public void switchToLoginWindow(){
        Set<String> windowsAfterOpeningNewTab = driver.getWindowHandles();
        String currentWindowsHash = driver.getWindowHandle();
        for (String window : windowsAfterOpeningNewTab) {
            if (!window.equalsIgnoreCase(currentWindowsHash)) {
                driver.switchTo().window(window);
            }
        }
    }


    @FindBy(xpath="//input[@id='username']")
    private WebElement userNameField;

    public void typeOnUsernameField(String data){
        userNameField.sendKeys(data);
        ExtentTestManager.log("Typed on username field", LOGGER);
    }

    @FindBy(xpath="//input[@id='password']")
    private WebElement passwordField;

    public void typeOnPasswordField(String data){
        passwordField.sendKeys(data);
        ExtentTestManager.log("Typed on password field", LOGGER);
    }
}
