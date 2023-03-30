package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Draganddrop extends Baseclass{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement source= driver.findElement(By.id("column-a"));
        WebElement desti = driver.findElement(By.id("column-b"));
        Actions act= new Actions(driver);
        act.dragAndDrop(source,desti).build().perform();

        Thread.sleep(1000);
    }
}
