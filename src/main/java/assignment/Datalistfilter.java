package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Datalistfilter extends Baseclass{
    @Test
    public void run() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/data-list-filter-demo.html");
        //Listbox-->Data list filter
        driver.findElement(By.id("input-search")).sendKeys("Brenda");

        Thread.sleep(3000);
    }
}
