package com.citibank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAllCreditCardPage {

    @FindBy(xpath="//h1[normalize-space()='View and Compare All Credit Cards']")
    private WebElement titleOfViewAllCreditCards;

    public String validateThatUserIsOnViewALlCreditCardsPage(){
        return titleOfViewAllCreditCards.getText();
    }


}
