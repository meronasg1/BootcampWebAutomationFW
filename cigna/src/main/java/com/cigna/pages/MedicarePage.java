package com.cigna.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MedicarePage {

    @FindBy(className="display")
    private WebElement medicareTab;

    public String validateThatUserIsOnMedicareTab(){
        return medicareTab.getText();
    }
}
