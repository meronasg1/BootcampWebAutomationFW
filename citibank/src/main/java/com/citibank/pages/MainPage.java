package com.citibank.pages;

import base.TestBase;
import base.report.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage extends TestBase {

    @FindBy(id="username")
    private WebElement usernameField;

    public void typeOnUserNameField(String data){
        usernameField.sendKeys(data);
    }

    @FindBy(id="password")
    private WebElement passwordField;

    public void typeOnPasswordField(String data){
        passwordField.sendKeys(data);
    }

    @FindBy(id="rememberUidLabel")
    private WebElement checkBox;

    public void selectCheckBox(){
        checkBox.click();
    }

    public boolean validateThatCheckBoxIsSelected(){
        if (!checkBox.isSelected()){
            return false;
        }
        return true;
    }

    @FindBy(id="navcreditCardmainAnchor0")
    private WebElement creditCardMouseHover;

    private void mouseHoverOverCreditCard (){
        Actions actions = new Actions(driver);
        actions.moveToElement(creditCardMouseHover).build().perform();
    }

    @FindBy(linkText="View All Credit Cards")
    private WebElement viewAllCreditCards;

    public void clickOnViewAllCreditCards(){
        mouseHoverOverCreditCard();
        viewAllCreditCards.click();
    }

    @FindBy(tagName = "body")
    private WebElement body;

    public void getTextOfMainPage(){
        System.out.println(body.getText());
    }





}
