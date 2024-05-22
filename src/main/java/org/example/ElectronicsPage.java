package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils
{
    private String _electronics = "//body/div/div[2]/ul[1]/li[2]/a";
    private String _cameraAndPhoto = "//a[text()=\" Camera & photo \"]";
    public void clickOnCameraAndPhoto()
    {
        //click on Electronics
        clickOnElement(By.xpath(_electronics));

        //Click on Camera & photo
        clickOnElement(By.xpath(_cameraAndPhoto));

    }
}
