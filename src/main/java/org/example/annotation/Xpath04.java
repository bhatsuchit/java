package org.example.annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Xpath04 extends base{
    @Test
    public void run() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement desti = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        Actions act= new Actions(driver);
        act.dragAndDrop(source,desti).build().perform();

        Thread.sleep(5000);
    }
}
