package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class No10_0Filedownload extends Baseclass{
    @Test
    public void upload() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[text()='1.png']")).click();

        Thread.sleep(5000);
    }
}
