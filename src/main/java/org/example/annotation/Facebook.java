package org.example.annotation;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook extends base{
    @Test
    public void fb() throws InterruptedException {
        driver.get("https://www.facebook.com/r.php");
        Faker fake = new Faker();
        String first = fake.name().firstName();
        String sur = fake.name().lastName();
        String phone= fake.number().digits(10);

        driver.findElement(By.name("firstname")).sendKeys(first);
        driver.findElement(By.name("lastname")).sendKeys(sur);
        driver.findElement(By.name("reg_email__")).sendKeys(phone);
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");
        WebElement day = driver.findElement(By.name("birthday_day"));
        WebElement month = driver.findElement(By.name("birthday_month"));
        WebElement year = driver.findElement(By.name("birthday_year"));
        Select sel = new Select(day);
        sel.selectByVisibleText("7");
        Select sel2 = new Select(month);
        sel2.selectByVisibleText("Nov");
        Select sel3 = new Select(year);
        sel3.selectByVisibleText("1917");
        driver.findElement(By.xpath("//input[@value='2']")).click();

        Thread.sleep(5000);
    }
}
