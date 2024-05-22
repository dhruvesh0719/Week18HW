package org.example;

import org.openqa.selenium.By;

public class ShippingMethodPage extends Utils
{
    //All necessary web elements of the Page
    private String _nextDayAir = "//input[@id=\"shippingoption_1\"]";
    private String _continueButton = "//button[@class=\"button-1 shipping-method-next-step-button\"]";

    //Select Shipping Method
    public void selectShippingOption()
    {
        //Select Next day Air option
        clickOnElement(By.xpath(_nextDayAir));

        //Select Continue button
        clickOnElement(By.xpath(_continueButton));
    }
}
