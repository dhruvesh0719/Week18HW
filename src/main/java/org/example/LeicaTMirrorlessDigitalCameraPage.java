package org.example;

import org.openqa.selenium.By;

public class LeicaTMirrorlessDigitalCameraPage extends Utils
{
    private String _email = "//button[@class=\"button-2 email-a-friend-button\"]";
    public void clickOnEmailaFriend()
    {
        //Click on Email a friend
        clickOnElement(By.xpath(_email));
    }
}
