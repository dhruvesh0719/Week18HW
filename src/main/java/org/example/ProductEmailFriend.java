package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ProductEmailFriend extends Utils{
    LoadProp loadProp = new LoadProp();

    private String _productName = "//a[@class=\"product\"]";
    public String _title = "//div[@class=\"page-title\"]";

    public void emailFriend()
    {
        String actual = captureTextOfTheElement(By.xpath(_title));
        Assert.assertEquals(actual,loadProp.getProperty("titleOfReferFriend"),"Email to your friend is failed");

        String actaulProcutName = captureTextOfTheElement(By.xpath(_productName));
        Assert.assertEquals(actaulProcutName ,loadProp.getProperty("productName1"), "Product name is wrong");
    }
}
