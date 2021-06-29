package com.cigna.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MentalHealthPage {

    @FindBy(className = "display")
    private WebElement mentalHealthPageTitle;

    public String validateUserIsOnMentalHealthPage(){
        return mentalHealthPageTitle.getText();
    }
}
