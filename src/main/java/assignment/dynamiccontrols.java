package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dynamiccontrols extends Baseclass{
    @Test
    public void run() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        WebDriverWait wait=new WebDriverWait(driver,50);
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[1]")));
        element.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        WebDriverWait wait2=new WebDriverWait(driver,60);
        WebElement element1=wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
        element1.click();

    }
}
