package org.example.annotation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Xpath02 extends base{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alt= driver.switchTo().alert();
        alt.accept();
        Thread.sleep(5000);
    }
}
