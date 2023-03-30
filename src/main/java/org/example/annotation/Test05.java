package org.example.annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test05 extends base {
    @Test
    public void test()
    {
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//img[@alt='Cleanign supplies']")).click();
    }
}
