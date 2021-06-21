package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchPage {


    @FindBy(xpath="//span[@class='a-color-state a-text-bold']")
    private WebElement searchResult;

    public void validateSearchResult(String data){

        String actual = searchResult.getText();
        String expected = data;
        Assert.assertEquals(actual, expected,"Search result does not match");

    }

    @FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
    private WebElement searchItem;

    public void clickOnSearchItem(){
        searchItem.click();
    }

}
