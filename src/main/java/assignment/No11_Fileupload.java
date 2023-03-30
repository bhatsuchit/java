package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class No11_Fileupload extends Baseclass{
    @Test
    public void upload() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Dell\\IdeaProjects\\java\\data\\d415adc2fe0d03bbe5b0ca13f5defdde.jpg");
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(5000);
    }
}
