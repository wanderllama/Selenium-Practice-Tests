package assessment;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FloatingMenuPage;
import util.Driver;

public class FloatingMenu extends Hooks {

    FloatingMenuPage page = new FloatingMenuPage(Driver.getDriver());

    @Test
    public void floating_menu_test() {
        Driver.getDriver().get("http://localhost:7080/floating_menu");

        Driver.getActions().moveToElement(page.pageFooter);

        for (WebElement option : page.floatingMenuOptions) {
            Assert.assertTrue(option.isDisplayed() , option.getText() + " menu option is not displayed");
        }
    }
}
