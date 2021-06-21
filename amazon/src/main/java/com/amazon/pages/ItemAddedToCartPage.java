package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemAddedToCartPage {

    @FindBy(id="hlb-view-cart-announce")
    private WebElement cartButton;

    public void clickOnCartButton(){
        cartButton.click();
    }

}
