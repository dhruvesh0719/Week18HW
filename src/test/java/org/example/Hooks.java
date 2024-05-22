package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Utils
{
    //Object of Browser manager
    BrowserManager browserManager = new BrowserManager();

    //Open browser
    @Before
    public void setup()
    {
        browserManager.openTheBrowser();
    }

    //Close browser
    @After
    public void tearDown(Scenario scenario)
    {
        if (scenario.isFailed())
        {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","Scenario failed");
        }
        browserManager.closeTheBrowser();
    }
}
