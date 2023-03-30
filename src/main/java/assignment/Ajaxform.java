package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Ajaxform extends Baseclass{
    @Test
    public void run() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");
        driver.findElement(By.id("title")).sendKeys("JAVA");
        driver.findElement(By.id("description")).sendKeys("Selenium");
        driver.findElement(By.name("btn-submit")).click();

        Thread.sleep(4000);
    }
}
