package org.example;

import org.openqa.selenium.By;

public class CartPage extends Utils
{
    //Object of LoadProp class
    LoadProp loadProp = new LoadProp();

    //All necessary web elements of the Page
    private String _selectGiftWrapping = "//select[@name=\"checkout_attribute_1\"]";
    private String _clickOnCheckOut = "//button[@id=\"checkout\"]";
    private String _termsAndCondition = "//input[@id=\"termsofservice\"]";

    //check all checkout details
    public void CheckOut()
    {
        //Select Gift Wrapping
        selectByVisibleText(By.xpath(_selectGiftWrapping), "No");
        implicitWait(300);

        //Click on Term And Condition check box
        clickOnElement(By.xpath(_termsAndCondition));

        //Select Checkout
        clickOnElement(By.xpath(_clickOnCheckOut));
    }

}
