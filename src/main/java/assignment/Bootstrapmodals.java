package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Bootstrapmodals extends Baseclass{
    @Test
    public void boot() throws InterruptedException {
         driver.get("http://demo.seleniumeasy.com/bootstrap-modal-demo.html");
         //Alert&modals-->Boot strap modals
         driver.manage().window().maximize();
         driver.findElement(By.xpath("(//a[@data-toggle='modal'])[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[2]")).click();

        driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='btn btn-primary'])[6]")).click();
    }
}