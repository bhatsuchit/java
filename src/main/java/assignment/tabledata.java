package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tabledata extends Baseclass{
    @Test
    public void data() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");
        //Table-->Table data search
        driver.findElement(By.id("task-table-filter")).sendKeys("Landing Page");
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-xs btn-filter']")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("1");

        Thread.sleep(5000);
    }
}