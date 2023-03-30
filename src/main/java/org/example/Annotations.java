package org.example;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.testng.annotations.*;

public class Annotations {
    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("BEFORE SUITE");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("AFTER SUITE");
    }
    @Test
    public void test()
    {
        System.out.println("TEST");
    }
    @BeforeClass
    public void beforeclass()
    {
        System.out.println("BEFORE CLASS");
    }
    @AfterClass
    public void afterclass()
    {
        System.out.println("AFTER CLASS");
    }
    @BeforeMethod
    public void beformethod()
    {
        System.out.println("BEFORE METHOD");
    }
    @AfterMethod
    public void aftermethod()
    {
        System.out.println("AFTER METHOD");
    }


}
