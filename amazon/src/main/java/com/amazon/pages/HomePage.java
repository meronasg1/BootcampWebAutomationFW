package com.amazon.pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage extends TestBase {
    @FindBy(id="nav-link-accountList-nav-line-1")
    private WebElement signInButton;

    public void clickOnSignInButton(){
        signInButton.click();
    }

    @FindBy(id="nav-logo-sprites")
    private WebElement amazonLogoFromHomePage;

    public void validateAmazonLogoFromHomepage(){
        boolean actual = amazonLogoFromHomePage.isDisplayed();
        Assert.assertTrue(actual, "amazon logo from homepage is not displayed");
    }

    @FindBy(id="twotabsearchtextbox")
    private WebElement searchBox;

    public void typeOnSearchBox(String data){
        searchBox.sendKeys(data);
    }

    @FindBy(id="nav-search-submit-button")
    private WebElement clickOnSearchButton;

    public void clickOnSearchButton(){
        clickOnSearchButton.click();
    }

    public void clickOnSearchBox(){
        searchBox.click();
    }


    public static List <WebElement> autoSuggestList = driver.findElements(By.id("twotabsearchtextbox"));


    public static void main(String[] args) {
        System.out.println(autoSuggestList.size());
    }

    WebElement greetings = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

    public void clickOnSignOut(){
        Actions actions = new Actions(driver);
        actions.moveToElement(greetings).build().perform();
        driver.findElement(By.linkText("Sign Out")).click();
    }


}
