import Homework13.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstTest extends BaseClass {
    static String url = "https://dnipro.ithillel.ua/";

    public static void main(String[] args) throws InterruptedException {
        driver.get (url);
        driver.findElement (By.id ("btn-consultation-hero")).click ();
        driver.findElement (By.id ("input-name-consultation")).sendKeys ("Artem");
        driver.findElement (By.id ("input-email-consultation")).sendKeys ("kondratovqa@gmail.com");
        driver.findElement (By.id ("input-tel-consultation")).sendKeys ("502252952");
        driver.findElement (By.xpath ("//button[@data-name='tg']")).click ();
        driver.findElement (By.xpath ("//input[@name='tg']")).sendKeys ("https://t.me/kondratovartem");
        driver.findElement (By.xpath ("//span[@class='listbox-btn_content']")).click ();
        driver.findElement (By.xpath ("//li[@data-entry-id='200390']")).click ();

        Thread.sleep (3000);
        driver.quit ();
    }
}
