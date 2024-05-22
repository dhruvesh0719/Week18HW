package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils
{
    LoadProp loadProp = new LoadProp();
    private String _login = "//a[contains(@class,\"ico-login\")]";
    private String _email = "Email";
    private String _password = "Password";
    private String _loginButton = "//button[contains(@class,\"button-1 login-button\")]";

    public void entreLoginDetails()
    {
        //Click on login
        clickOnElement(By.xpath(_login));

        //Enter the email address
        typeText(By.id(_email), loadProp.getProperty("firstEmail")+random()+loadProp.getProperty("@gmail.com"));

        //Entre the Password
        typeText(By.id(_password), loadProp.getProperty("password"));

        //Click on Log In button
        clickOnElement(By.xpath(_loginButton));
    }
}
