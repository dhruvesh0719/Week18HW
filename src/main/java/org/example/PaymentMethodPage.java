package org.example;

import org.openqa.selenium.By;

public class PaymentMethodPage extends Utils
{
    //All necessary web elements of the Page
    private String _creditCard = "//input[@id=\"paymentmethod_1\"]";
    private String _continueButton = "//button[@class=\"button-1 payment-method-next-step-button\"]";


    //Select Payment Method
    public void selectPaymentMethod()
    {
        //Select credit card option
        clickOnElement(By.xpath(_creditCard));

        //Click on continue button
        clickOnElement(By.xpath(_continueButton));
    }
}
