package pages;

import Homework13.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Util;

import java.util.List;

public class PageObject extends BaseClass {
    private WebDriver driver;

    private By courseTitle = By.xpath ("//div[@class =\"course-descriptor_heading\"]");
    private By courseRate = By.xpath ("//div[@class =\"course-rating\"]");
    private By courseDescription = By.xpath ("//div[@class =\"introduction_main\"]");
    private By coachesButton = By.id ("coachesShowAllButton");
    private By coachList = By.className ("coach-list_item");
    private By names = By.className ("coach-card_name");
    public PageObject(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getCourseDescription() {
        return driver.findElement (courseDescription);
    }

    public WebElement getCourseRate() {
        return driver.findElement (courseRate);
    }

    public WebElement getCourseTitle() {
        return driver.findElement (courseTitle);
    }
    public void getListCoachesNames() throws InterruptedException {
        Thread.sleep (2000);
        Util.scrollToElementVisibilityOf (driver, coachesButton);
        driver.findElement (coachesButton).click ();
        List <WebElement> namesList = driver.findElements (coachList);
        for (WebElement element : namesList) {
            System.out.println(element.findElement (names).getText ());
        }
    }
}
