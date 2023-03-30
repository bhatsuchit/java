package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class assignment2tripadvisor extends Baseclass{
    @Test
    public void trip() throws InterruptedException {
        driver.get("https://www.tripadvisor.in/");
        driver.manage().window().maximize();
        String parent= driver.getWindowHandle();
        driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Club Mahindra");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Club Mahindra Madikeri, Coorg']")).click();
        Thread.sleep(2000);

        Set<String>windowid=driver.getWindowHandles();
        for (String id: windowid) {
            if (parent.equals(id)) {

            }
            else
            {
                driver.switchTo().window(id);
                driver.findElement(By.xpath("//div[@class='XZzcc Vb PP']")).click();
                Thread.sleep(3000);
            }
        }
        Set<String>window2= driver.getWindowHandles();
        for (String id1 :window2)
        {
            if(parent.equals(windowid))
            {

            }
            else
            {
                driver.switchTo().window(id1);
            }
        }
        Thread.sleep(3000);

        WebElement star1=driver.findElement(By.xpath("(//label[@aria-invalid='false'])[1]"));
        Actions act= new Actions(driver);
        act.moveToElement(star1).build().perform();
        driver.findElement(By.xpath("(//label[@aria-invalid='false'])[5]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='biGQs _P vvmrG'])[1]")).click();
        driver.findElement(By.id("menu-item-2023-01-31")).click();
        driver.findElement(By.xpath("(//span[@class='OKHdJ z Pc PQ Pp PD W _S Gn Z B2 BF _M ncFvv hzzSG wSSLS'])[3]")).click();
        driver.findElement(By.id("review-text")).sendKeys("something Write your reviewwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
        Thread.sleep(2000);
        driver.findElement(By.id("review-title")).sendKeys("Title your review");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        Thread.sleep(5000);
    }
}
