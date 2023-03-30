package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JQuerylistbox extends Baseclass{
    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/jquery-dual-list-box-demo.html");
        //List box-->JQuery list box
        driver.manage().window().maximize();
        WebElement search=driver.findElement(By.xpath("//select[@class='form-control pickListSelect pickData']"));
        Select sel=new Select(search);
        sel.selectByIndex(1);
        sel.selectByIndex(3);
        sel.selectByIndex(5);
        sel.selectByIndex(6);
        driver.findElement(By.xpath("//button[@class='pAdd btn btn-primary btn-sm']")).click();
        driver.findElement(By.xpath("//button[@class='pAddAll btn btn-primary btn-sm']")).click();

        Thread.sleep(3000);
    }
}
