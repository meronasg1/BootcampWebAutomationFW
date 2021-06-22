package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FriendsPage {

    @FindBy(xpath="(//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a5q79mjw g1cxx5fr ekzkrbhg oo9gr5id'])[3]")
    private WebElement suggestionsButton;
    public void clickOnSuggestionsButton(){
        suggestionsButton.click();
    }

    @FindBy(xpath="(//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 pfnyh3mw taijpn5t bp9cbjyn owycx6da btwxx1t3 kt9q3ron ak7q8e6j isp2s0ed ri5dt5u2 rt8b4zig n8ej3o3l agehan2d sk4xxmp2 d1544ag0 tw6a2znq s1i5eluu tv7at329'])[1]")
    private WebElement addFriendButton;

    public void clickOnAddFriendButton(){
        addFriendButton.click();
    }

    @FindBy(xpath="(//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh e9vueds3 j5wam9gi knj5qynh m9osqain'])[2]")
    private WebElement requestSentMessage;

    public void validateUserSentFriendRequest(){
        String actual = requestSentMessage.getText();
        String expected = "Request sent";
        Assert.assertEquals(actual, expected,"Text does not match");
    }

}
