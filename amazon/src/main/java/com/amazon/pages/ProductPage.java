package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductPage {

    @FindBy(id="add-to-cart-button")
    private WebElement addToCartButton;

    public void clickOnAddToCartButton(){
        addToCartButton.click();
    }

    public void validateUserIsOnProductPage(){
        String actual = addToCartButton.getText();
        String expected = "Add to Cart";

        Assert.assertEquals(expected, actual, "Title did not match");

    }

}
