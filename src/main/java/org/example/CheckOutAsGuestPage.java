package org.example;

import org.openqa.selenium.By;

public class CheckOutAsGuestPage extends Utils
{

    //All necessary web elements of the Page
    private String _selectCheckOutAsGuest = "//button[@class='button-1 checkout-as-guest-button']";


    //Click on check out as guest button
    public void CheckOutAsGuest()
    {
    clickOnElement(By.xpath(_selectCheckOutAsGuest));
    }
}
