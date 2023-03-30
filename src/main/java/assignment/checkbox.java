package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class checkbox extends Baseclass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        driver.close();

        Thread.sleep(5000);
    }
}
