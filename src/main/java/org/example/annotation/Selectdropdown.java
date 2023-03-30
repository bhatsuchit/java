package org.example.annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Selectdropdown extends base{
          @Test
          public void test() throws InterruptedException
          {
              driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
              //Input forms-->Radio buttons demo
              driver.findElement(By.xpath("(//input[@value='Male'])[1]")).click();
              driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
              driver.findElement(By.name("gender")).click();
              driver.findElement(By.name("ageGroup")).click();
              driver.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();

            Thread.sleep(5000);



        }
}
