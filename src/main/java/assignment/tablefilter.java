package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tablefilter extends Baseclass {
    @Test
    public void filt() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/table-records-filter-demo.html");
        //Table-->Table Filter
        driver.findElement(By.xpath("//button[text()='Orange']")).click();
        driver.findElement(By.xpath("//tr[@class='selected']"));

        Thread.sleep(3000);
    }
}
