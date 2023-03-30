package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Dynamicdataloading extends Baseclass{
    @Test
    public void run() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/dynamic-data-loading-demo.html");
        //others-->Dynamic data loading
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();

        Thread.sleep(3000);
    }
}
