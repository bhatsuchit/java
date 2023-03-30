package org.example.annotation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Xpath03 extends base{
    @Test
    public void run() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alt=driver.switchTo().alert();
        alt.getText();


        Thread.sleep(5000);
    }
}

