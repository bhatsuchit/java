package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tabledatadownload extends Baseclass{
    @Test
    public void data() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
        //Table-->Table data downlaod
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Ashton Cox");
        driver.findElement(By.xpath("//a[@class='dt-button buttons-pdf buttons-html5']")).click();

        Thread.sleep(5000);
    }
}
