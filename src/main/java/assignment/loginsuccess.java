package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginsuccess extends Baseclass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[@class='button secondary radius']")).click();

        Thread.sleep(5000);
    }
}
