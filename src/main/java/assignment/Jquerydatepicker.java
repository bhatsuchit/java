package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Jquerydatepicker extends Baseclass{
    @Test
    public void date() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/jquery-date-picker-demo.html");
        //Date pickers-->JQuery Datepickers
        driver.manage().window().maximize();
        driver.findElement(By.id("from")).click();
        String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        while (!year.equals("2022"))
        {
            driver.findElement(By.xpath("//a[@title='Prev']")).click();
            year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        }
        WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel=new Select(month);
        sel.selectByVisibleText("Aug");
        driver.findElement(By.xpath("//a[text()='10']")).click();

        driver.findElement(By.id("to")).click();
        String year1=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        while (!year1.equals("2022"))
        {
            driver.findElement(By.xpath("//a[@title='Prev']")).click();
            year1=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        }
        WebElement month1= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel2 =new Select(month1);
        sel2.selectByVisibleText("Nov");
        driver.findElement(By.xpath("//a[text()='25']")).click();

        Thread.sleep(5000);
    }
}
