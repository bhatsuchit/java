package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Javascriptalerts extends Baseclass{
    @Test
    public void alert() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        //Alert&Modals-->Javascript Alerts
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
        Alert alt=driver.switchTo().alert();
        alt.accept();
        driver.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
        Alert alt2=driver.switchTo().alert();
        alt2.dismiss();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scroll.Height)");
        driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
        Alert alt3=driver.switchTo().alert();
        alt3.sendKeys("Selenium-Java");
        alt3.accept();
        Thread.sleep(3000);
    }
}
