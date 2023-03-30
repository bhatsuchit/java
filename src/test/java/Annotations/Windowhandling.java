package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class Windowhandling extends path{
    @Test
    public void path() throws InterruptedException {
        driver.get("https://canarabank.com/");
        String parentwindow= driver.getWindowHandle();
        String parenttitle=driver.getTitle();
        System.out.println("ParentId :" +parentwindow);
        System.out.println("Parent title :" +parenttitle);

        WebElement log=driver.findElement(By.xpath("//p[text()='LOGIN']"));
        Actions act= new Actions(driver);
        act.moveToElement(log).build().perform();
        driver.findElement(By.xpath("//a[text()='Net Banking - Canara']")).click();

        Set<String>windoID= driver.getWindowHandles();
        for (String id: windoID)
        {
            System.out.println(id);
            if (parentwindow.equals(id))
            {

            }
            else {
                driver.switchTo().window(id);
            }
            System.out.println("Current window" +driver.getWindowHandle());
            driver.findElement(By.xpath("(//a[text()='About Us'])[1]")).click();
            driver.close();
        }

        Thread.sleep(3000);
    }
}
