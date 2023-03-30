package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class No9_Dynamicload extends Baseclass{
    @Test
    public void load() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.xpath("//button[text()='Start']")).click();

        Thread.sleep(5000);
    }
}
