package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Bootstraplist extends Baseclass{
    @Test
    public void list() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/bootstrap-dual-list-box-demo.html");
       //Listbox-->Bootstrap list box
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[text()='bootstrap-duallist ']")).click();
        driver.findElement((By.xpath("(//li[text()='Vestibulum at eros'])[1]"))).click();
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']")).click();
        driver.findElement(By.xpath("(//a[@class='btn btn-default selector'])[2]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm move-left']")).click();
        driver.findElement(By.xpath("(//a[@title='select all'])[1]")).click();
        driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']")).click();

        Thread.sleep(3000);
    }
}
