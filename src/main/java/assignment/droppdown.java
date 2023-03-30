package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class droppdown extends Baseclass {
    @Test
    public void run() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.findElement(By.id("dropdown")).sendKeys("option 2");

        Thread.sleep(5000);
    }
}
