package org.example.annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Test04 extends base {
    @Test
    public void test()
    {
        driver.get("https://www.redbus.in/");
        List<WebElement> div= driver.findElements(By.tagName("div"));
        System.out.println(div.size());

        for(int i=0;i<=div.size();i++)
        {
            System.out.println(div.get(i).getText());
        }
    }
}
