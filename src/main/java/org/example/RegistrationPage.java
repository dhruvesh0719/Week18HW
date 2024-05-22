package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils
{
    LoadProp loadProp = new LoadProp();
    private String _fistName = "FirstName";
    private String _lastName = "LastName";
    private String _day = "DateOfBirthDay";
    private String _month = "DateOfBirthMonth";
    private String _year = "DateOfBirthYear";
    private String _email = "Email";
    private String _password = "Password";
    private String _confirmPassword = "ConfirmPassword";
    private String _registrationButton = "register-button";

    //Registration detail to entre
    public void entreTheRegistrationDetails()
    {
        //Entre The First name
        typeText(By.id(_fistName),loadProp.getProperty("Firstname"));

        //Entre The Last name
        typeText(By.name(_lastName),loadProp.getProperty("Lastname"));

        //Choose day from date of birth drop box
        selectByVisibleText(By.name(_day), "5");

        //Choose month from date of birth drop box
        selectByValue(By.name(_month), "3");

        //Choose Year from date of birth drop box
        selectByValue(By.name(_year), "1980");

        //Entre the email address
        typeText(By.name(_email), loadProp.getProperty("firstEmail")+random()+loadProp.getProperty("secondEmail"));

        //Entre the Password
        typeText(By.id(_password), loadProp.getProperty("password"));

        //Entre the Confirm Password
        typeText(By.id(_confirmPassword),loadProp.getProperty("password"));

        //Click on Register button
        clickOnElement(By.name(_registrationButton));
    }
}
