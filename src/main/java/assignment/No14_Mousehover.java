package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class No14_Mousehover extends Baseclass{
    @Test
    public void mouse() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement web= driver.findElement(By.xpath("(//div[@class='figure'])[2]"));
        Actions act=new Actions(driver);
        act.moveToElement(web).build().perform();
        driver.findElement(By.xpath("(//a[text()='View profile'])[2]")).click();

        Thread.sleep(5000);
    }
}
