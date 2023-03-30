package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class draganddropdemo extends Baseclass{
    @Test
    public void drag() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/drag-and-drop-demo.html");
        WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable 1']"));
        WebElement drop= driver.findElement(By.id("mydropzone"));
        Actions act=new Actions(driver);
        act.dragAndDrop(drag,drop).build().perform();

        Thread.sleep(3000);
    }
}
