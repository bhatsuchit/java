package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Bootstrapalerts extends Baseclass{
    @Test
    public void alert() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");
        //Alert&Modals-->Bootstrap Alerts
        driver.findElement(By.id("normal-btn-success")).click();
        driver.findElement(By.id("autoclosable-btn-info")).click();
        driver.findElement(By.id("autoclosable-btn-info")).click();

        Thread.sleep(3000);
    }
}
