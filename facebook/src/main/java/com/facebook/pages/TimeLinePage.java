package com.facebook.pages;

import base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TimeLinePage extends TestBase {

    @FindBy(className= "p361ku9c")
    private WebElement faceBookLogoFromLoginPage;

    public void validateUserCanSeeLogoFromLoginPage(){
        boolean actual = faceBookLogoFromLoginPage.isDisplayed();
        Assert.assertTrue(actual, "Facebook logo is not displayed");
    }

    @FindBy(name="global_typeahead")
    private WebElement searchBox;

    public void typeOnSearchBoxAndPressEnter(String data){

        searchBox.sendKeys(data);
        searchBox.sendKeys(Keys.ENTER);

    }

    @FindBy(xpath="(//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 g5gj957u rj1gh0hx buofh1pr hpfvmrgz taijpn5t bp9cbjyn owycx6da btwxx1t3 d1544ag0 tw6a2znq jb3vyjys dlv3wnog rl04r1d5 mysgfdmx hddg9phg qu8okrzs g0qnabr5'])[1]")
    private WebElement commentButton;

    public void clickOnCommentButton(){
        commentButton.click();
    }

    @FindBy(className="hcukyx3x oygrvhab cxmmr5t8 kvgmc6g5")
    private WebElement commentField;

    public void typeAndEnterOnCommentField(String data){
        commentField.sendKeys(data);
        commentField.sendKeys(Keys.ENTER);

    }
    @FindBy(xpath="(//div[@class='tw6a2znq sj5x9vvc d1544ag0 cxgpxx05'])[1]")
    private WebElement comment;
    public void validateUserTypedComment(String commentTyped){
        String actual = comment.getText();
        String expected = commentTyped;
        Assert.assertEquals(actual, expected, "Text did not match");
    }

    @FindBy(xpath="(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'])[1]")
    private WebElement findFriendsButton;

    public void clickOnFindFriendsButton(){
        findFriendsButton.click();
    }

    @FindBy(xpath="(//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 g5gj957u rj1gh0hx buofh1pr hpfvmrgz taijpn5t bp9cbjyn owycx6da btwxx1t3 d1544ag0 tw6a2znq jb3vyjys dlv3wnog rl04r1d5 mysgfdmx hddg9phg qu8okrzs g0qnabr5'])[1]")
    private WebElement likeButton;

    public void clickOnLikeButton(){
        likeButton.click();
    }

    @FindBy(xpath="(//span[@class='pcp91wgn'])[1]")
    private WebElement likedPost;

    public void validateThatPostIsLiked(){
        String actual= likedPost.getText();
        String expected ="You ";
        Assert.assertEquals(actual, expected,"Text did not match");
    }

//    @FindBy(xpath="(//div[@class='bp9cbjyn j83agx80 taijpn5t dfwzkoeu ni8dbmo4 stjgntxs'])[2]")
//    private WebElement





}
