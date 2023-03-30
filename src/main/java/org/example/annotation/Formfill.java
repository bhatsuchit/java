package org.example.annotation;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Formfill extends base{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        Faker fake= new Faker();
        String name=fake.name().firstName();
        driver.findElement(By.id("firstName")).sendKeys(name);
        String last=fake.name().lastName();
        driver.findElement(By.id("lastName")).sendKeys(last);
        String emai= name+"@gmail.com";
        driver.findElement(By.id("userEmail")).sendKeys(emai);
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
        String phone=fake.number().digits(10);
        driver.findElement(By.id("userNumber")).sendKeys(phone);
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).getText();
        driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Dell\\IdeaProjects\\java\\data\\d415adc2fe0d03bbe5b0ca13f5defdde.jpg");
        String address = fake.address().fullAddress();
        driver.findElement(By.id("currentAddress")).sendKeys(address);

        Thread.sleep(5000);
    }
}
