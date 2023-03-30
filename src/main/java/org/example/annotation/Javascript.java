package org.example.annotation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Javascript extends base{
    @Test
    public void run() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        //Alert&Modals-->Javascript alerts
        driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
        Alert alt=driver.switchTo().alert();
        alt.sendKeys("Selenium-Java");
        alt.accept();
        driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
        alt.accept();

        Thread.sleep(10000);
    }
}
