package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class makemytrip extends path{
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Bangalore");
        List<WebElement> list= driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
        System.out.println(list.size());
        for(WebElement src:list)
        {
            System.out.println(src.getText());
            if(src.getText().contains("Mumbai"))
            {
                src.click();
                break;
            }
        }
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Jaipur");
        List<WebElement> list2= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        System.out.println(list2.size());
        for (WebElement src:list2)
        {
            System.out.println(src.getText());
            if (src.getText().contains("New Delhi"))
            {
                src.click();
                break;
            }
        }
        driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
        driver.findElement(By.id("departure"));
        driver.findElement(By.xpath("(//p[text()='20'])[2]")).click();
        driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[2]")).click();
        String month= driver.findElement(By.xpath("//div[text()='October']")).getText();
        while (!month.equals("October 2023"))
        {
            driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
            month =driver.findElement(By.xpath("//div[text()='October']")).getText();

        }
        Thread.sleep(5000);
    }
}
//span[@class='DayPicker-NavButton DayPicker-NavButton--next']