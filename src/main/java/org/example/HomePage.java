package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils
{
    //Object of LoadProp class
    LoadProp loadProp = new LoadProp();

    //All necessary web elements of the Page
    private String _selectHTC = "//div[@class='item-grid']/div[3]/div/div[2]/div[3]/div[2]";
    private String _selectShoppingCart = "//div[@class='header-links']/ul/li[4]";
    private String _euroCurrency = "customerCurrency";
    private String _productList = "//div/div[2][@class='item-grid']//div[2]/div[3]/div[1]";
    private String _newsButton = "//div[@class='news-items']/div[2]/div[3]/a";
    private String _searchButton = "//button[@class='button-1 search-box-button']";
    private String _searchTextBox = "//input[@id='small-searchterms']";
    private String _register = "ico-register";

    //Click on any product
    public void selectProductAndClickOnShoppingCart()
    {
    clickOnElement(By.xpath(_selectHTC));

    clickOnElement(By.xpath(_selectShoppingCart));
    }


    //Select Euro from the currency drop box
    public void selectEuroFromCurrencyDropBox()
    {
        selectByVisibleText(By.name(_euroCurrency),"Euro");
    }


    //Verify all product have euro sign with all product
    public void verifyAllProductHaveEuroSign()
    {
        List<WebElement> productList = driver.findElements(By.xpath(_productList));

        for (WebElement element:productList)
        {
            String actual = element.getText();
            Assert.assertTrue(actual.contains("€"),"Product do not have Euro symbol");
        }
    }


    //Click on Details button of middle news
    public void clcikOnDetailsNewsButton()
    {
        clickOnElement(By.xpath(_newsButton));
    }


    //Click on search button
    public void clickOnSearchButton()
    {
        clickOnElement(By.xpath(_searchButton));
    }


    //Entre product name in search box
    public void entreProductNameInSearchBox(String text)
    {
        typeText(By.xpath(_searchTextBox),text);
    }


    //Click on Register
    public void clickOnRegister()
    {
        clickOnElement(By.className(_register));
    }

}
