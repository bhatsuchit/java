package org.example.annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Xpath  extends base{
    @Test
    public void test()
    {
         driver.get("https://www.codecademy.com/");
         driver.findElement(By.xpath("//div[@id='page-skip-to-content-target']"));
    }
}
