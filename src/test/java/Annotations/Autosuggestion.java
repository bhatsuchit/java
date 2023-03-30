package Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Autosuggestion extends path {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//span[@class='lbl_input latoBold  appendBottom5'])[1]")).click();
        driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
        System.out.println(list.size());
        for(WebElement src: list)
        {
            System.out.println(src.getText());
            if(src.getText().contains("Delhi"))
            {
                src.click();
                break;
            }
        }

        Thread.sleep(5000);
    }
}
//input[@class='react-autosuggest__input react-autosuggest__input--open']