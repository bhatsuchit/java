package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Filedownload extends Baseclass{
    @Test
    public void down() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/generate-file-to-download-demo.html");
        //Alert&Modals-->File download
        driver.manage().window().maximize();
        driver.findElement(By.id("textbox")).sendKeys("Selenium-Java");
        driver.findElement(By.id("create")).click();
        driver.findElement(By.id("link-to-download")).click();
        Thread.sleep(2000);
    }
}
