import Homework13.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.PageObject;

public class TestPageObject extends BaseClass {
    public static PageObject pageObject;

    @BeforeClass
    public static void beforeTest(){
        driver.get ("https://dnipro.ithillel.ua/courses/front-end-basic");
        pageObject = new PageObject (driver);
    }
    @Test
    public void test1() throws InterruptedException {
        System.out.println (pageObject.getCourseTitle().getText());
        System.out.println (pageObject.getCourseRate ().getText () + " stars");
        System.out.println (pageObject.getCourseDescription ().getText ());
        pageObject.getListCoachesNames ();
    }

}
