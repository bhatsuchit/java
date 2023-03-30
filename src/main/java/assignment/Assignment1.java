package assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Assignment1 extends Baseclass{
    @Test
    public void price() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 256 gb");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String price=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
        System.out.println("Amazon Price-" +price);

        Thread.sleep(3000);
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.name("q")).sendKeys("iphone 13 256 gb");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        String price2=driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[3]")).getText();
        System.out.println("Flipkart Price-" +price2);

        int amazonprice=70999;
        int Flipkartprice=71999;
                if(amazonprice<Flipkartprice)
                {
                    System.out.println("Good to buy iPhone in amazon");
                }
                else
                {
                    System.out.println("Good to buy iPhone in Flipkart");
                }

                Thread.sleep(1000);
    }
}
