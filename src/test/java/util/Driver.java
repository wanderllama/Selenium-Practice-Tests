package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    private static WebDriver driver;

    // change test cases to use hooks instead of this Driver class to complete the assignment for recruiter
    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriverWait getWait() {
        return new WebDriverWait(getDriver() , 15);
    }

    public static Actions getActions() { return new Actions(driver); }
}