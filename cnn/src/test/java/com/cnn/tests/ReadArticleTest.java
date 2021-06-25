package com.cnn.tests;

import base.TestBase;
import com.cnn.pages.ArticlePage;
import com.cnn.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadArticleTest extends TestBase {

    HomePage homePage;
    ArticlePage articlePage;

    @BeforeMethod
    public void setUpPOM(){
        homePage= PageFactory.initElements(driver, HomePage.class);
        articlePage= PageFactory.initElements(driver, ArticlePage.class);
    }

    @Test
    public void ValidateThatUserCanReadArticle(){
        homePage.clickOnArticle();
        articlePage.getTextOfAnArticle();
    }


}
