package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class No15_Alerts extends Baseclass{
    @Test
    public void alert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alt= driver.switchTo().alert();
        alt.accept();
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        alt.dismiss();
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        alt.sendKeys("Java");
        alt.accept();

        Thread.sleep(10000);
    }
}
