package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class No17_opentab extends Baseclass{
    @Test
    public void error() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        Thread.sleep(5000);
    }
}
