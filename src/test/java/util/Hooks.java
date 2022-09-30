package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks {

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
    }

    @AfterMethod
    public void teardown() {
        Driver.getDriver().quit();
    }
}
