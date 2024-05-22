package org.example;

import org.openqa.selenium.By;

public class BillingPage extends Utils
{
    //Object of LoadProp class
    LoadProp loadProp = new LoadProp();

    //All necessary web elements of the Page
    private String _firstName = "//input[@id='BillingNewAddress_FirstName']";
    private String _lastName = "//input[@id='BillingNewAddress_LastName']";
    private String _email = "//input[@type='email']";
    private String _selectCountry = "//select[@data-trigger='country-select']";
    private String _selectCity = "//input[@id='BillingNewAddress_City']";
    private String _address = "//input[@id='BillingNewAddress_Address1']";
    private String _zipCode = "//input[@id='BillingNewAddress_ZipPostalCode']";
    private String _phoneNumber = "//input[@id=\"BillingNewAddress_PhoneNumber\"]";
    private String _clickOnContinueButton ="//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']";

    //Entre billing details
    public void billingDetails()
    {
        //Type First Name
        typeText(By.xpath(_firstName),loadProp.getProperty("Firstname"));

        //Type Last name
        typeText(By.xpath(_lastName), loadProp.getProperty("Lastname"));

        //Type Email
        typeText(By.xpath(_email),loadProp.getProperty("firstEmail")+random()+loadProp.getProperty("secondEmail"));

        //Select Country
        selectByVisibleText(By.xpath(_selectCountry),"United Kingdom");
        implicitWait(3000);

        //Select City
        typeText(By.xpath(_selectCity),loadProp.getProperty("City"));

        //Type Address
        typeText(By.xpath(_address),loadProp.getProperty("address"));

        //Type Post code
        typeText(By.xpath(_zipCode),loadProp.getProperty("zipcode"));

        //Type Phone number
        typeText(By.xpath(_phoneNumber),loadProp.getProperty("phoneNumber"));

        //Select Continue button
        clickOnElement(By.xpath(_clickOnContinueButton));
    }
}
