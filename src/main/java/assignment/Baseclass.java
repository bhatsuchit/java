package assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Baseclass {
    WebDriver driver;
    @BeforeClass
    public void open()
    {
        System.out.println("Open the browser");
        WebDriverManager.edgedriver().setup();
        driver= new EdgeDriver();
    }
    @AfterClass
    public void close()
    {
        System.out.println("Close the browser");
        driver.quit();
    }
}
