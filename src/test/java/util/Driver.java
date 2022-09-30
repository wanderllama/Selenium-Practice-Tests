package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    private static WebDriver driver;

    private static Actions actions;

    private static WebDriverWait wait;

    // change test cases to use hooks instead of this Driver class to complete the assignment for recruiter
    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriverWait getWait() {
        if (wait == null)
            wait = new WebDriverWait(getDriver() , 15);
        return wait;
    }

    public static Actions getActions() {
        if (actions == null)
            actions = new Actions(driver);
        return actions;
    }
}