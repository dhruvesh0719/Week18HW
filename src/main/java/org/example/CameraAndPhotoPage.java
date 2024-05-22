package org.example;

import org.openqa.selenium.By;

public class CameraAndPhotoPage extends Utils
{
    private  String _leicaDigitalCamera = "//h2[@class='product-title']//a[normalize-space()='Leica T Mirrorless Digital Camera']";
    public void ClickOnLeicaTMirrorlessDigitalCamera()
    {
        //Click on Leica T Mirrorless Digital Camera
        clickOnElement(By.xpath(_leicaDigitalCamera));
    }
}
