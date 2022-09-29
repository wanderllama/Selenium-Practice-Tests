package assessment;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.login_page;
import util.Driver;

public class LoginValidation extends Hooks{

    login_page page = new login_page(Driver.getDriver());

    @Test
    public void login_success() {
        String username = "tomsmith";
        String password = "SuperSecretPassword!";

        Driver.getDriver().get("http://localhost:7080/login");
        page.login(username , password);

        String expectedHeader = "Welcome to the Secure Area. When you are done click logout below.";
        Assert.assertEquals(page.headerFour.getText() , expectedHeader , "login failed");
    }

    @Test
    public void login_failure() {
        String invalid= "invalid";

        Driver.getDriver().get("http://localhost:7080/login");
        page.login(invalid , invalid);

        Assert.assertTrue(page.failedLoginMsg.isDisplayed() , "test failed -> login successfully");
    }


}
