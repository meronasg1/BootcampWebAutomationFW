package com.cigna.pages;

import base.TestBase;
import base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class HomePage extends TestBase{

    private static final Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(xpath="(//a[@href='https://my.cigna.com'])[1]")
    private WebElement loginBtn;

    public void clickOnLoginBtn(){
        loginBtn.click();
        ExtentTestManager.log("User clicked on login button", LOGGER);
    }

    @FindBy(linkText = "Individuals and Families")
    private WebElement individualsAndFamilies;

    @FindBy(id="health-wellness-tab")
    private WebElement healthAndWellnessTab;

    @FindBy(linkText = "Mental Health")
    private WebElement mentalHealthLink;

    public void navigateToMentalHealthPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(individualsAndFamilies).build().perform();
        healthAndWellnessTab.click();
        ExtentTestManager.log("User clicked on health and wellness tab", LOGGER);
        mentalHealthLink.click();
        ExtentTestManager.log("User clicked on mental health link", LOGGER);
    }

    @FindBy(id ="medicare-level-one-link")
    private WebElement medicareTab;

    public void navigateToMedicareTab(){
        medicareTab.click();
    }


}
