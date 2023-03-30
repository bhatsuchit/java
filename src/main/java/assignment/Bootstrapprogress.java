package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Bootstrapprogress extends Baseclass{
    @Test
    public void run() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/bootstrap-download-progress-demo.html");
        //Progress bar-->Bootstrap progress bar
        driver.findElement(By.id("cricle-btn")).click();

        Thread.sleep(5000);
    }
}
