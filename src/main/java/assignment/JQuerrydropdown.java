package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JQuerrydropdown extends Baseclass{
    @Test
    public void drop() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
        //Input forms--> JQuerry Select dropdown
        driver.manage().window().maximize();
        WebElement country=driver.findElement(By.id("country"));
        Select sel=new Select(country);
        sel.selectByVisibleText("India");
        JavascriptExecutor Js=(JavascriptExecutor) driver;
        Js.executeScript("window.scrollBy(0,500)");
        WebElement State=driver.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']"));
        Select sel1= new Select(State);
        sel1.selectByVisibleText("Alaska");
        sel1.selectByVisibleText("Hawaii");
        WebElement territories=driver.findElement(By.xpath("//select[@class='js-example-disabled-results select2-hidden-accessible']"));
        Select sel2=new Select(territories);
        sel2.selectByVisibleText("Virgin Islands");
        WebElement file=driver.findElement(By.name("files"));
        Select sel3=  new Select(file);
        sel3.selectByVisibleText("Java");

        Thread.sleep(3000);
    }
}
