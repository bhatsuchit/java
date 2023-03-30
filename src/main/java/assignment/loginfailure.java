package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginfailure extends Baseclass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.xpath("//button[@class='radius']")).click();
        Thread.sleep(4000);
    }
}
