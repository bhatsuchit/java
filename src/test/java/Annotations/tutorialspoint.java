package Annotations;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tutorialspoint extends path{
    @Test
    public void point() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        driver.manage().window().maximize();
        Faker fake=new Faker();
        String first= fake.name().firstName();
        driver.findElement(By.name("firstname")).sendKeys(first);
        String last=fake.name().lastName();
        driver.findElement(By.name("lastname")).sendKeys(last);
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("exp")).click();
       driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("21/04/2001");
       driver.findElement(By.name("profession")).click();
       driver.findElement(By.name("photo")).sendKeys("C:\\Users\\Dell\\IdeaProjects\\java\\data\\d415adc2fe0d03bbe5b0ca13f5defdde.jpg");
       driver.findElement(By.name("tool")).click();



        Thread.sleep(3000);
    }
}
