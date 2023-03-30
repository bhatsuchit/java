package org.example.annotation;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class forming extends base{
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
        //input form submit
        Faker fake = new Faker();
        String name=fake.name().firstName();
        String last=fake.name().lastName();
        String email = name+"@gmail.com";
        String phone= fake.number().digits(10);
        String address = fake.address().fullAddress();
        String city = fake.address().city();
        String code= fake.address().zipCode();

        driver.findElement(By.name("first_name")).sendKeys(name);
        driver.findElement(By.name("last_name")).sendKeys(last);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("phone")).sendKeys(phone);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("city")).sendKeys(city);
        driver.findElement(By.name("zip")).sendKeys(code);
        driver.findElement(By.name("website")).sendKeys("VTU");
        driver.findElement(By.xpath("//input[@value='yes']")).click();
        driver.findElement(By.name("comment")).sendKeys("C:\\Users\\Dell\\IdeaProjects\\java\\data\\d415adc2fe0d03bbe5b0ca13f5defdde.jpg");
        driver.findElement(By.name("state")).sendKeys("Arizona");
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();

        Thread.sleep(5000);
    }
}
