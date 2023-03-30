package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Bootstrapdate extends Baseclass{
    @Test
    public void date() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
        //Date pickes-->Bootstrap Datepicker
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']")).click();
        String month=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
        while (!month.equals("June 2021"))
        {
            driver.findElement(By.xpath("(//th[@class='prev'])[1]")).click();
            month=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
        }
        driver.findElement(By.xpath("(//td[text()='9'])[1]")).click();

        driver.findElement(By.xpath("//input[@placeholder='Start date']")).click();
        driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[4]"));
        driver.findElement(By.xpath("//td[text()=15]")).click();

        driver.findElement(By.xpath("//input[@placeholder='End date']")).click();
        String month1=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
        while (!month1.equals("November 2023"))
        {
            driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
            month1=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
        }
        driver.findElement(By.xpath("(//td[text()='7'])[1]")).click();

        Thread.sleep(5000);
    }
}
