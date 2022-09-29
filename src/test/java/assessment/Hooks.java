package assessment;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @BeforeMethod
    public void setup() {
        System.out.println("---> coming before each scenario <-> from Hooks <---");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
    }

    @AfterMethod
    public void teardown() {
        System.out.println("---> coming after each scenario <-> from Hooks <---");
        Driver.getDriver().quit();
    }
}
