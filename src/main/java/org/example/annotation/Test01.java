package org.example.annotation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test01 extends base{
    @Test
    public void test()
    {
        driver.get("https://www.google.co.in/");
        driver.findElement(By.name("btnK"));
    }
}
