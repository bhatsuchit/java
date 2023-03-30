package org.example.annotation;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class base {
    WebDriver driver;
    @BeforeSuite
    public void open()
    {
        System.out.println("Open browser");
        WebDriverManager.edgedriver().setup();
        driver= new EdgeDriver();
    }
    @AfterSuite
    public void close()
    {
        System.out.println("Close the browser");
        driver.quit();
    }
}


