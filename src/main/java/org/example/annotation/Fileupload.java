package org.example.annotation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Fileupload extends base{
    @Test
    public void upload() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Dell\\IdeaProjects\\java\\data\\Book1.xlsx");
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(5000);
    }
}
