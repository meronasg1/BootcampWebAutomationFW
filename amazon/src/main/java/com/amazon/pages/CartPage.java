package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

    @FindBy(name="proceedToRetailCheckout")
    private WebElement proceedToCheckOutBtn;

    public void clickOnProceedToCheckOutBtn(){
        proceedToCheckOutBtn.click();
    }



}
