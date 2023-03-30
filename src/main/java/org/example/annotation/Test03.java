package org.example.annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Test03 extends base{
    @Test
    public void test()
    {
        driver.get("https://www.makemytrip.com/");
        List<WebElement>aTags=driver.findElements(By.tagName("a"));
        System.out.println(aTags.size());
    }
}
