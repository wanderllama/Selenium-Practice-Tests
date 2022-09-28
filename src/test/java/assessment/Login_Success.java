package assessment;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.login_page;
import util.Driver;

public class Login_Success extends Hooks{

    login_page page = new login_page(Driver.getDriver());

    @Test
    public void login_success() {
        String username = "tomsmith";
        String password = "SuperSecretPassword!";

        Driver.getDriver().get("http://localhost:7080/login");
        page.login(username , password);

//        WebDriverWait wait = new WebDriverWait(Driver.getDriver() , 15);
//
//        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(page.headerTwo, "Login Page")));

        String expectedHeader = "Welcome to the Secure Area. When you are done click logout below.";
        Assert.assertEquals(page.headerFour.getText() , expectedHeader);
    }
}
