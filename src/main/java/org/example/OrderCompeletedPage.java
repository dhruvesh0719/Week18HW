package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderCompeletedPage extends Utils
{
    //Object of LoadProp class
    LoadProp loadProp = new LoadProp();

    //All necessary web elements of the Page
    private String _OrderConfirmation = "//div[@class='section order-completed']//div[@class='title']";


    public void ConfirmOrder()
    {
        String actual = captureTextOfTheElement(By.xpath(_OrderConfirmation));
        Assert.assertEquals(actual,loadProp.getProperty("expectedText"),"Your order is not successful");
    }

}
