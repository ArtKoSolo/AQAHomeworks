import Homework13.BaseClass;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.Util;

import java.util.ArrayList;
import java.util.List;


public class SecondTest extends BaseClass {
    static String MainUrl = "https://dnipro.ithillel.ua";
    private By FrontEndBasicBasic = By.xpath ("(//a[@href='https://dnipro.ithillel.ua/courses/front-end-basic'])[1]");
    By coachesButton = By.id ("coachesShowAllButton");
    By coachList = By.className ("coach-list_item");
    By names = By.className ("coach-card_name");

    @BeforeClass
    public static void openMainPage() {
        driver.get (MainUrl);
    }

    @Test
    public void openingProgrammingCoursesList() {
        driver.findElement (By.xpath ("//button[@data-dropdown-trigger=\"coursesMenu\"]")).click ();
    }

    @Test
    public void openingProgrammingVariants() throws InterruptedException {
        driver.findElement (By.xpath ("//button[contains(text(),'Програмування')]")).click ();
        Thread.sleep (3000);
        driver.findElement (FrontEndBasicBasic).click ();
    }


    @Test
    public void scrollingDownToTheElement() throws InterruptedException {
        Thread.sleep (2000);
        Util.scrollToElementVisibilityOf (driver, coachesButton);
        driver.findElement (coachesButton).click ();
        List<WebElement> namesList = driver.findElements (coachList);
        for (WebElement element : driver.findElements (coachList)) {
            System.out.println(element.findElement (names).getText ());
        }
    }

    @AfterClass

    public static void quitMainPage() throws InterruptedException {
        Thread.sleep (3000);
        driver.quit ();
    }

}