package Annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class demoform extends path{
    @Test
    public void run() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        //Input Forms--> Simple form demo
        driver.findElement(By.id("user-message")).sendKeys("show the below sum");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        driver.findElement(By.id("sum1")).sendKeys("10");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("50");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();

        Thread.sleep(5000);
    }
}
