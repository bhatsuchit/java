package org.example.annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Xpath05 extends base{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.meesho.com/");
      WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
      WebElement jeans = driver.findElement(By.xpath("(//p[text()='Jeans'])[2]"));

        Actions act = new Actions(driver);
        act.moveToElement(men).build().perform();
        jeans.click();

        Thread.sleep(5000);
    }
}
