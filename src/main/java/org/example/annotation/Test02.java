package org.example.annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test02 extends base{
    @Test
    public void test()
    {
        driver.get("https://www.cricbuzz.com/");
        driver.findElement(By.id("cricbuzz-plus-main-menu")).sendKeys( Keys.ENTER);
    }
}
