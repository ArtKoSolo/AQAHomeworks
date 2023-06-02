package Homework13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver = ConfigurationWebDriver.createDriver (Browsers.CHROME_INCOGNITO);
}