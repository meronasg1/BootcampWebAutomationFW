package com.cnn.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePage {

    private static final Logger LOGGER = Logger.getLogger(ArticlePage.class);

    @FindBy(tagName = "body")
    private WebElement body;

    public void getTextOfAnArticle(){
        System.out.println(body.getText());
    }


}
