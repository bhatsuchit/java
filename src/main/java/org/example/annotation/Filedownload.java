package org.example.annotation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Filedownload extends base{
    @Test
    public void pin() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/generate-file-to-download-demo.html");
        //Alert&Modals-->File download
        driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("Selenium-Java");
        driver.findElement(By.xpath("//button[@id='create']")).click();
        driver.findElement(By.xpath("//a[@id='link-to-download']")).click();

        Thread.sleep(5000);
    }
}
