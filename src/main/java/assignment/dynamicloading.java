package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dynamicloading extends Baseclass{
    @Test
    public void load() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.id("start")).click();

        Thread.sleep(10000);
    }
}
