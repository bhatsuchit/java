package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class No12_Floatingmenu extends Baseclass{
    @Test
    public void menu() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/floating_menu");
        driver.findElement(By.xpath("//a[text()='Contact']")).click();

        Thread.sleep(5000);
    }
}
