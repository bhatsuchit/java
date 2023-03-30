package org.example.annotation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathHW extends base{
    @Test
    public void run()
    {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[text()='img.png']")).click();
    }

}
