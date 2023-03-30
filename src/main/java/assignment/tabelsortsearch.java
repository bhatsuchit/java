package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class tabelsortsearch extends Baseclass{
    @Test
    public void sort() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/table-sort-search-demo.html");
        //Table-->Table sort&search
        WebElement show= driver.findElement(By.name("example_length"));
        Select sel=new Select(show);
        sel.selectByValue("50");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Byrd");

        Thread.sleep(3000);
    }
}
