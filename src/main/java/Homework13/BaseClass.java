package Homework13;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;

    @BeforeClass
    public static void parentBeforeClass(){
        driver = ConfigurationWebDriver.createDriver (Browsers.CHROME_INCOGNITO);
    }


    @AfterClass
    public static void parentAfterClass() throws InterruptedException {
        Thread.sleep (3000);
        driver.quit ();
    }
}