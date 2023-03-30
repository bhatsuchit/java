package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JQueryprogress extends Baseclass{
    @Test
    public void run() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html");
        //Progress bar--> JQuery download progress
        driver.findElement(By.id("downloadButton")).click();
       driver.findElement(By.xpath("(//button[@type='button'])[3]"));

        Thread.sleep(5000);
    }
}
