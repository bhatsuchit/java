package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Contextmenu extends Baseclass{
    @Test
    public void run() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions act = new Actions(driver);
        WebElement loc= driver.findElement(By.id("hot-spot"));
        act.contextClick(loc).build().perform();
        Alert alt=driver.switchTo().alert();
        alt.accept();

        Thread.sleep(5000);

    }
}
