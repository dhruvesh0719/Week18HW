package org.example;

import org.openqa.selenium.By;

public class PaymentInfoPage extends Utils
{
    //Object of LoadProp class
    LoadProp loadProp = new LoadProp();

    //All necessary web elements of the Page
    private String _selectCreditCard = "//select[@class=\"dropdownlists\"]";
    private String _cardHolderName = "//input[@id=\"CardholderName\"]";
    private String _cardNumber = "//input[@id=\"CardNumber\"]";
    private String _expireMonth = "//select[@id=\"ExpireMonth\"]";
    private String _expireYear = "//select[@id=\"ExpireYear\"]";
    private String _cardCode = "//input[@id=\"CardCode\"]";
    private String _continue = "//button[@class='button-1 payment-info-next-step-button']";


    //Select Payment Method
    public void selectPaymentMethod()
    {
        //Select credit card
        selectByVisibleText(By.xpath(_selectCreditCard),"Visa");

        //Type cardholder name
        typeText(By.xpath(_cardHolderName),loadProp.getProperty("cardHolderName"));

        //Type card number
        typeText(By.xpath(_cardNumber),loadProp.getProperty("cardNumber"));

        //Select Expire month
        selectByVisibleText(By.xpath(_expireMonth), "09");

        //Select Expire year
        selectByVisibleText(By.xpath(_expireYear), "2024");

        //Entre card code
        typeText(By.xpath(_cardCode),loadProp.getProperty("cardCode"));

        //Click on continue
        clickOnElement(By.xpath(_continue));

    }

}
