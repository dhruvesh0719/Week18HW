package org.example;

import org.openqa.selenium.By;

public class ConfirmationOrderPage extends Utils
{
    //All necessary web elements of the Page
    private String _continueButton = "//button[@class='button-1 confirm-order-next-step-button']";


    public void ClickOnContinuePage()
    {
        //Click on Continue button
        clickOnElement(By.xpath(_continueButton));
    }


}
