package Annotations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class path {
    WebDriver driver;
    @BeforeSuite
    public void open()
    {
        System.out.println("Open the browser");
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
    }
    @AfterSuite
    public void close()
    {
        System.out.println("Close the browser");
        driver.quit();
    }
}
