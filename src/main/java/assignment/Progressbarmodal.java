package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Progressbarmodal extends Baseclass{
    @Test
    public void modal() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/bootstrap-progress-bar-dialog-demo.html");
        //Alert&Modals-->Progress bar modal
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
        Thread.sleep(3000);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
        Thread.sleep(3000);
    }
}
