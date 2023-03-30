package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class No18_Notification extends Baseclass{
    @Test
    public void note() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.xpath("//a[text()='Click here']")).click();
        driver.findElement(By.xpath("//a[text()='Click here']")).click();
        driver.findElement(By.xpath("//a[text()='Click here']")).click();

        Thread.sleep(4000);
    }
}
