package org.example;

import org.openqa.selenium.By;

public class ReferToFriendPage extends Utils
{
    private String _friendEmail = "friend-email";
    private String _emailButton = "send-email";
    //Method to refer a product to friend
    public void referToFriend()
    {
        //Type Friend's email
        typeText(By.className(_friendEmail), "friendEmail");

        //Click on Send Email Button
        clickOnElement(By.name(_emailButton));
    }
}
