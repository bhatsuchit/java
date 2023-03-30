package Annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class inputform extends path{
    @Test
    public void run() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        //Input forms-->Select dropdown list
        driver.findElement(By.id("select-demo")).sendKeys("Sunday");
        driver.findElement(By.xpath("//option[@value='California']")).click();
        driver.findElement(By.id("printMe")).click();

        Thread.sleep(5000);
    }
}
