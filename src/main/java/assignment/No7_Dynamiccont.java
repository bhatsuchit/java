package assignment;

import org.testng.annotations.Test;

public class No7_Dynamiccont extends Baseclass{
    @Test
    public void run() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_content");
        driver.navigate().refresh();

        Thread.sleep(3000);
    }
}
